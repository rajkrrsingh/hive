/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetValidWriteIdsRequest implements org.apache.thrift.TBase<GetValidWriteIdsRequest, GetValidWriteIdsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetValidWriteIdsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetValidWriteIdsRequest");

  private static final org.apache.thrift.protocol.TField FULL_TABLE_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("fullTableNames", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField VALID_TXN_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validTxnList", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetValidWriteIdsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetValidWriteIdsRequestTupleSchemeFactory());
  }

  private List<String> fullTableNames; // required
  private String validTxnList; // optional
  private long writeId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FULL_TABLE_NAMES((short)1, "fullTableNames"),
    VALID_TXN_LIST((short)2, "validTxnList"),
    WRITE_ID((short)3, "writeId");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FULL_TABLE_NAMES
          return FULL_TABLE_NAMES;
        case 2: // VALID_TXN_LIST
          return VALID_TXN_LIST;
        case 3: // WRITE_ID
          return WRITE_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WRITEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VALID_TXN_LIST,_Fields.WRITE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FULL_TABLE_NAMES, new org.apache.thrift.meta_data.FieldMetaData("fullTableNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.VALID_TXN_LIST, new org.apache.thrift.meta_data.FieldMetaData("validTxnList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetValidWriteIdsRequest.class, metaDataMap);
  }

  public GetValidWriteIdsRequest() {
  }

  public GetValidWriteIdsRequest(
    List<String> fullTableNames)
  {
    this();
    this.fullTableNames = fullTableNames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetValidWriteIdsRequest(GetValidWriteIdsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFullTableNames()) {
      List<String> __this__fullTableNames = new ArrayList<String>(other.fullTableNames);
      this.fullTableNames = __this__fullTableNames;
    }
    if (other.isSetValidTxnList()) {
      this.validTxnList = other.validTxnList;
    }
    this.writeId = other.writeId;
  }

  public GetValidWriteIdsRequest deepCopy() {
    return new GetValidWriteIdsRequest(this);
  }

  @Override
  public void clear() {
    this.fullTableNames = null;
    this.validTxnList = null;
    setWriteIdIsSet(false);
    this.writeId = 0;
  }

  public int getFullTableNamesSize() {
    return (this.fullTableNames == null) ? 0 : this.fullTableNames.size();
  }

  public java.util.Iterator<String> getFullTableNamesIterator() {
    return (this.fullTableNames == null) ? null : this.fullTableNames.iterator();
  }

  public void addToFullTableNames(String elem) {
    if (this.fullTableNames == null) {
      this.fullTableNames = new ArrayList<String>();
    }
    this.fullTableNames.add(elem);
  }

  public List<String> getFullTableNames() {
    return this.fullTableNames;
  }

  public void setFullTableNames(List<String> fullTableNames) {
    this.fullTableNames = fullTableNames;
  }

  public void unsetFullTableNames() {
    this.fullTableNames = null;
  }

  /** Returns true if field fullTableNames is set (has been assigned a value) and false otherwise */
  public boolean isSetFullTableNames() {
    return this.fullTableNames != null;
  }

  public void setFullTableNamesIsSet(boolean value) {
    if (!value) {
      this.fullTableNames = null;
    }
  }

  public String getValidTxnList() {
    return this.validTxnList;
  }

  public void setValidTxnList(String validTxnList) {
    this.validTxnList = validTxnList;
  }

  public void unsetValidTxnList() {
    this.validTxnList = null;
  }

  /** Returns true if field validTxnList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidTxnList() {
    return this.validTxnList != null;
  }

  public void setValidTxnListIsSet(boolean value) {
    if (!value) {
      this.validTxnList = null;
    }
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FULL_TABLE_NAMES:
      if (value == null) {
        unsetFullTableNames();
      } else {
        setFullTableNames((List<String>)value);
      }
      break;

    case VALID_TXN_LIST:
      if (value == null) {
        unsetValidTxnList();
      } else {
        setValidTxnList((String)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FULL_TABLE_NAMES:
      return getFullTableNames();

    case VALID_TXN_LIST:
      return getValidTxnList();

    case WRITE_ID:
      return getWriteId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FULL_TABLE_NAMES:
      return isSetFullTableNames();
    case VALID_TXN_LIST:
      return isSetValidTxnList();
    case WRITE_ID:
      return isSetWriteId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetValidWriteIdsRequest)
      return this.equals((GetValidWriteIdsRequest)that);
    return false;
  }

  public boolean equals(GetValidWriteIdsRequest that) {
    if (that == null)
      return false;

    boolean this_present_fullTableNames = true && this.isSetFullTableNames();
    boolean that_present_fullTableNames = true && that.isSetFullTableNames();
    if (this_present_fullTableNames || that_present_fullTableNames) {
      if (!(this_present_fullTableNames && that_present_fullTableNames))
        return false;
      if (!this.fullTableNames.equals(that.fullTableNames))
        return false;
    }

    boolean this_present_validTxnList = true && this.isSetValidTxnList();
    boolean that_present_validTxnList = true && that.isSetValidTxnList();
    if (this_present_validTxnList || that_present_validTxnList) {
      if (!(this_present_validTxnList && that_present_validTxnList))
        return false;
      if (!this.validTxnList.equals(that.validTxnList))
        return false;
    }

    boolean this_present_writeId = true && this.isSetWriteId();
    boolean that_present_writeId = true && that.isSetWriteId();
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fullTableNames = true && (isSetFullTableNames());
    list.add(present_fullTableNames);
    if (present_fullTableNames)
      list.add(fullTableNames);

    boolean present_validTxnList = true && (isSetValidTxnList());
    list.add(present_validTxnList);
    if (present_validTxnList)
      list.add(validTxnList);

    boolean present_writeId = true && (isSetWriteId());
    list.add(present_writeId);
    if (present_writeId)
      list.add(writeId);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetValidWriteIdsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFullTableNames()).compareTo(other.isSetFullTableNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullTableNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullTableNames, other.fullTableNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValidTxnList()).compareTo(other.isSetValidTxnList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidTxnList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validTxnList, other.validTxnList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWriteId()).compareTo(other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetValidWriteIdsRequest(");
    boolean first = true;

    sb.append("fullTableNames:");
    if (this.fullTableNames == null) {
      sb.append("null");
    } else {
      sb.append(this.fullTableNames);
    }
    first = false;
    if (isSetValidTxnList()) {
      if (!first) sb.append(", ");
      sb.append("validTxnList:");
      if (this.validTxnList == null) {
        sb.append("null");
      } else {
        sb.append(this.validTxnList);
      }
      first = false;
    }
    if (isSetWriteId()) {
      if (!first) sb.append(", ");
      sb.append("writeId:");
      sb.append(this.writeId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetFullTableNames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fullTableNames' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetValidWriteIdsRequestStandardSchemeFactory implements SchemeFactory {
    public GetValidWriteIdsRequestStandardScheme getScheme() {
      return new GetValidWriteIdsRequestStandardScheme();
    }
  }

  private static class GetValidWriteIdsRequestStandardScheme extends StandardScheme<GetValidWriteIdsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetValidWriteIdsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FULL_TABLE_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list658 = iprot.readListBegin();
                struct.fullTableNames = new ArrayList<String>(_list658.size);
                String _elem659;
                for (int _i660 = 0; _i660 < _list658.size; ++_i660)
                {
                  _elem659 = iprot.readString();
                  struct.fullTableNames.add(_elem659);
                }
                iprot.readListEnd();
              }
              struct.setFullTableNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALID_TXN_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validTxnList = iprot.readString();
              struct.setValidTxnListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetValidWriteIdsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fullTableNames != null) {
        oprot.writeFieldBegin(FULL_TABLE_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.fullTableNames.size()));
          for (String _iter661 : struct.fullTableNames)
          {
            oprot.writeString(_iter661);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.validTxnList != null) {
        if (struct.isSetValidTxnList()) {
          oprot.writeFieldBegin(VALID_TXN_LIST_FIELD_DESC);
          oprot.writeString(struct.validTxnList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWriteId()) {
        oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.writeId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetValidWriteIdsRequestTupleSchemeFactory implements SchemeFactory {
    public GetValidWriteIdsRequestTupleScheme getScheme() {
      return new GetValidWriteIdsRequestTupleScheme();
    }
  }

  private static class GetValidWriteIdsRequestTupleScheme extends TupleScheme<GetValidWriteIdsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetValidWriteIdsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.fullTableNames.size());
        for (String _iter662 : struct.fullTableNames)
        {
          oprot.writeString(_iter662);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetValidTxnList()) {
        optionals.set(0);
      }
      if (struct.isSetWriteId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValidTxnList()) {
        oprot.writeString(struct.validTxnList);
      }
      if (struct.isSetWriteId()) {
        oprot.writeI64(struct.writeId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetValidWriteIdsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list663 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.fullTableNames = new ArrayList<String>(_list663.size);
        String _elem664;
        for (int _i665 = 0; _i665 < _list663.size; ++_i665)
        {
          _elem664 = iprot.readString();
          struct.fullTableNames.add(_elem664);
        }
      }
      struct.setFullTableNamesIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.validTxnList = iprot.readString();
        struct.setValidTxnListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeId = iprot.readI64();
        struct.setWriteIdIsSet(true);
      }
    }
  }

}

