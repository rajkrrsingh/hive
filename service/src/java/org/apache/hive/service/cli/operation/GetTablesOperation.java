/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hive.service.cli.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.IMetaStoreClient;
import org.apache.hadoop.hive.metastore.api.TableMeta;
import org.apache.hadoop.hive.ql.security.authorization.plugin.HiveOperationType;
import org.apache.hadoop.hive.ql.security.authorization.plugin.HivePrivilegeObject;
import org.apache.hadoop.hive.ql.security.authorization.plugin.HivePrivilegeObjectUtils;
import org.apache.hive.service.cli.FetchOrientation;
import org.apache.hive.service.cli.HiveSQLException;
import org.apache.hive.service.cli.OperationState;
import org.apache.hive.service.cli.OperationType;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.RowSetFactory;
import org.apache.hive.service.cli.TableSchema;
import org.apache.hive.service.cli.session.HiveSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * GetTablesOperation.
 *
 */
public class GetTablesOperation extends MetadataOperation {

  private static final Logger LOG = LoggerFactory.getLogger(GetTablesOperation.class.getName());

  private final String catalogName;
  private final String schemaName;
  private final String tableName;
  private final List<String> tableTypeList;
  private final RowSet rowSet;
  private final TableTypeMapping tableTypeMapping;


  private static final TableSchema RESULT_SET_SCHEMA = new TableSchema()
  .addStringColumn("TABLE_CAT", "Catalog name. NULL if not applicable.")
  .addStringColumn("TABLE_SCHEM", "Schema name.")
  .addStringColumn("TABLE_NAME", "Table name.")
  .addStringColumn("TABLE_TYPE", "The table type, e.g. \"TABLE\", \"VIEW\", etc.")
  .addStringColumn("REMARKS", "Comments about the table.")
  .addStringColumn("TYPE_CAT", "The types catalog.")
  .addStringColumn("TYPE_SCHEM", "The types schema.")
  .addStringColumn("TYPE_NAME", "Type name.")
  .addStringColumn("SELF_REFERENCING_COL_NAME",
      "Name of the designated \"identifier\" column of a typed table.")
  .addStringColumn("REF_GENERATION",
      "Specifies how values in SELF_REFERENCING_COL_NAME are created.");

  protected GetTablesOperation(HiveSession parentSession,
      String catalogName, String schemaName, String tableName,
      List<String> tableTypes) {
    super(parentSession, OperationType.GET_TABLES);
    this.catalogName = catalogName;
    this.schemaName = schemaName;
    this.tableName = tableName;
    String tableMappingStr = getParentSession().getHiveConf().
        getVar(HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING);
    tableTypeMapping =
        TableTypeMappingFactory.getTableTypeMapping(tableMappingStr);
    if (tableTypes != null) {
      tableTypeList = new ArrayList<String>();
      for (String tableType : tableTypes) {
        tableTypeList.addAll(Arrays.asList(tableTypeMapping.mapToHiveType(tableType.trim())));
      }
    } else {
      tableTypeList = null;
    }
    this.rowSet = RowSetFactory.create(RESULT_SET_SCHEMA, getProtocolVersion(), false);
    LOG.info("Starting GetTablesOperation with the following parameters: "
        + "catalogName={}, schemaName={}, tableName={}, tableTypes={}",
        catalogName, schemaName, tableName,
        tableTypeList != null ? tableTypeList.toString() : "null");
  }

  @Override
  public void runInternal() throws HiveSQLException {
    setState(OperationState.RUNNING);
    LOG.info("Fetching table metadata");
    try {
      IMetaStoreClient metastoreClient = getParentSession().getMetaStoreClient();
      String schemaPattern = convertSchemaPattern(schemaName);
      List<String> matchingDbs = metastoreClient.getDatabases(schemaPattern);
      if(isAuthV2Enabled()){
        List<HivePrivilegeObject> privObjs = HivePrivilegeObjectUtils.getHivePrivDbObjects(matchingDbs);
        String cmdStr = "catalog : " + catalogName + ", schemaPattern : " + schemaName;
        authorizeMetaGets(HiveOperationType.GET_TABLES, privObjs, cmdStr);
      }

      String tablePattern = convertIdentifierPattern(tableName, true);
      for (String dbName : metastoreClient.getDatabases(schemaPattern)) {
        for (TableMeta tableMeta :
                metastoreClient.getTableMeta(dbName, tablePattern, tableTypeList)) {
          String tableType = tableTypeMapping.mapToClientType(tableMeta.getTableType());
          rowSet.addRow(new Object[]{
                  DEFAULT_HIVE_CATALOG,
                  tableMeta.getDbName(),
                  tableMeta.getTableName(),
                  tableType,
                  tableMeta.getComments(),
                  null, null, null, null, null
          });

          if (LOG.isDebugEnabled()) {
            String debugMessage = getDebugMessage("table", RESULT_SET_SCHEMA);
            LOG.debug(debugMessage, DEFAULT_HIVE_CATALOG, tableMeta.getDbName(),
                    tableMeta.getTableName(), tableType, tableMeta.getComments());
          }
        }
        if (LOG.isDebugEnabled() && rowSet.numRows() == 0) {
          LOG.debug("No table metadata has been returned.");
        }
      }
      setState(OperationState.FINISHED);
      LOG.info("Fetching table metadata has been successfully finished");
    } catch (Exception e) {
      setState(OperationState.ERROR);
      throw new HiveSQLException(e);
    }
  }

  /* (non-Javadoc)
   * @see org.apache.hive.service.cli.Operation#getResultSetSchema()
   */
  @Override
  public TableSchema getResultSetSchema() throws HiveSQLException {
    assertState(Collections.singleton(OperationState.FINISHED));
    return RESULT_SET_SCHEMA;
  }

  /* (non-Javadoc)
   * @see org.apache.hive.service.cli.Operation#getNextRowSet(org.apache.hive.service.cli.FetchOrientation, long)
   */
  @Override
  public RowSet getNextRowSet(FetchOrientation orientation, long maxRows) throws HiveSQLException {
    assertState(Collections.singleton(OperationState.FINISHED));
    validateDefaultFetchOrientation(orientation);
    if (orientation.equals(FetchOrientation.FETCH_FIRST)) {
      rowSet.setStartOffset(0);
    }
    return rowSet.extractSubset((int)maxRows);
  }
}
