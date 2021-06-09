/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetReplicationMetricsRequest implements org.apache.thrift.TBase<GetReplicationMetricsRequest, GetReplicationMetricsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetReplicationMetricsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetReplicationMetricsRequest");

  private static final org.apache.thrift.protocol.TField SCHEDULED_EXECUTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduledExecutionId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("policy", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DUMP_EXECUTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dumpExecutionId", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetReplicationMetricsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetReplicationMetricsRequestTupleSchemeFactory();

  private long scheduledExecutionId; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String policy; // optional
  private long dumpExecutionId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEDULED_EXECUTION_ID((short)1, "scheduledExecutionId"),
    POLICY((short)2, "policy"),
    DUMP_EXECUTION_ID((short)3, "dumpExecutionId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SCHEDULED_EXECUTION_ID
          return SCHEDULED_EXECUTION_ID;
        case 2: // POLICY
          return POLICY;
        case 3: // DUMP_EXECUTION_ID
          return DUMP_EXECUTION_ID;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SCHEDULEDEXECUTIONID_ISSET_ID = 0;
  private static final int __DUMPEXECUTIONID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SCHEDULED_EXECUTION_ID,_Fields.POLICY,_Fields.DUMP_EXECUTION_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEDULED_EXECUTION_ID, new org.apache.thrift.meta_data.FieldMetaData("scheduledExecutionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.POLICY, new org.apache.thrift.meta_data.FieldMetaData("policy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DUMP_EXECUTION_ID, new org.apache.thrift.meta_data.FieldMetaData("dumpExecutionId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetReplicationMetricsRequest.class, metaDataMap);
  }

  public GetReplicationMetricsRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetReplicationMetricsRequest(GetReplicationMetricsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.scheduledExecutionId = other.scheduledExecutionId;
    if (other.isSetPolicy()) {
      this.policy = other.policy;
    }
    this.dumpExecutionId = other.dumpExecutionId;
  }

  public GetReplicationMetricsRequest deepCopy() {
    return new GetReplicationMetricsRequest(this);
  }

  @Override
  public void clear() {
    setScheduledExecutionIdIsSet(false);
    this.scheduledExecutionId = 0;
    this.policy = null;
    setDumpExecutionIdIsSet(false);
    this.dumpExecutionId = 0;
  }

  public long getScheduledExecutionId() {
    return this.scheduledExecutionId;
  }

  public void setScheduledExecutionId(long scheduledExecutionId) {
    this.scheduledExecutionId = scheduledExecutionId;
    setScheduledExecutionIdIsSet(true);
  }

  public void unsetScheduledExecutionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID);
  }

  /** Returns true if field scheduledExecutionId is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduledExecutionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID);
  }

  public void setScheduledExecutionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCHEDULEDEXECUTIONID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPolicy() {
    return this.policy;
  }

  public void setPolicy(@org.apache.thrift.annotation.Nullable java.lang.String policy) {
    this.policy = policy;
  }

  public void unsetPolicy() {
    this.policy = null;
  }

  /** Returns true if field policy is set (has been assigned a value) and false otherwise */
  public boolean isSetPolicy() {
    return this.policy != null;
  }

  public void setPolicyIsSet(boolean value) {
    if (!value) {
      this.policy = null;
    }
  }

  public long getDumpExecutionId() {
    return this.dumpExecutionId;
  }

  public void setDumpExecutionId(long dumpExecutionId) {
    this.dumpExecutionId = dumpExecutionId;
    setDumpExecutionIdIsSet(true);
  }

  public void unsetDumpExecutionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DUMPEXECUTIONID_ISSET_ID);
  }

  /** Returns true if field dumpExecutionId is set (has been assigned a value) and false otherwise */
  public boolean isSetDumpExecutionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DUMPEXECUTIONID_ISSET_ID);
  }

  public void setDumpExecutionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DUMPEXECUTIONID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCHEDULED_EXECUTION_ID:
      if (value == null) {
        unsetScheduledExecutionId();
      } else {
        setScheduledExecutionId((java.lang.Long)value);
      }
      break;

    case POLICY:
      if (value == null) {
        unsetPolicy();
      } else {
        setPolicy((java.lang.String)value);
      }
      break;

    case DUMP_EXECUTION_ID:
      if (value == null) {
        unsetDumpExecutionId();
      } else {
        setDumpExecutionId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULED_EXECUTION_ID:
      return getScheduledExecutionId();

    case POLICY:
      return getPolicy();

    case DUMP_EXECUTION_ID:
      return getDumpExecutionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SCHEDULED_EXECUTION_ID:
      return isSetScheduledExecutionId();
    case POLICY:
      return isSetPolicy();
    case DUMP_EXECUTION_ID:
      return isSetDumpExecutionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetReplicationMetricsRequest)
      return this.equals((GetReplicationMetricsRequest)that);
    return false;
  }

  public boolean equals(GetReplicationMetricsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scheduledExecutionId = true && this.isSetScheduledExecutionId();
    boolean that_present_scheduledExecutionId = true && that.isSetScheduledExecutionId();
    if (this_present_scheduledExecutionId || that_present_scheduledExecutionId) {
      if (!(this_present_scheduledExecutionId && that_present_scheduledExecutionId))
        return false;
      if (this.scheduledExecutionId != that.scheduledExecutionId)
        return false;
    }

    boolean this_present_policy = true && this.isSetPolicy();
    boolean that_present_policy = true && that.isSetPolicy();
    if (this_present_policy || that_present_policy) {
      if (!(this_present_policy && that_present_policy))
        return false;
      if (!this.policy.equals(that.policy))
        return false;
    }

    boolean this_present_dumpExecutionId = true && this.isSetDumpExecutionId();
    boolean that_present_dumpExecutionId = true && that.isSetDumpExecutionId();
    if (this_present_dumpExecutionId || that_present_dumpExecutionId) {
      if (!(this_present_dumpExecutionId && that_present_dumpExecutionId))
        return false;
      if (this.dumpExecutionId != that.dumpExecutionId)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetScheduledExecutionId()) ? 131071 : 524287);
    if (isSetScheduledExecutionId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(scheduledExecutionId);

    hashCode = hashCode * 8191 + ((isSetPolicy()) ? 131071 : 524287);
    if (isSetPolicy())
      hashCode = hashCode * 8191 + policy.hashCode();

    hashCode = hashCode * 8191 + ((isSetDumpExecutionId()) ? 131071 : 524287);
    if (isSetDumpExecutionId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(dumpExecutionId);

    return hashCode;
  }

  @Override
  public int compareTo(GetReplicationMetricsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScheduledExecutionId(), other.isSetScheduledExecutionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduledExecutionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduledExecutionId, other.scheduledExecutionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPolicy(), other.isSetPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.policy, other.policy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDumpExecutionId(), other.isSetDumpExecutionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDumpExecutionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dumpExecutionId, other.dumpExecutionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetReplicationMetricsRequest(");
    boolean first = true;

    if (isSetScheduledExecutionId()) {
      sb.append("scheduledExecutionId:");
      sb.append(this.scheduledExecutionId);
      first = false;
    }
    if (isSetPolicy()) {
      if (!first) sb.append(", ");
      sb.append("policy:");
      if (this.policy == null) {
        sb.append("null");
      } else {
        sb.append(this.policy);
      }
      first = false;
    }
    if (isSetDumpExecutionId()) {
      if (!first) sb.append(", ");
      sb.append("dumpExecutionId:");
      sb.append(this.dumpExecutionId);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetReplicationMetricsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetReplicationMetricsRequestStandardScheme getScheme() {
      return new GetReplicationMetricsRequestStandardScheme();
    }
  }

  private static class GetReplicationMetricsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetReplicationMetricsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetReplicationMetricsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEDULED_EXECUTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.scheduledExecutionId = iprot.readI64();
              struct.setScheduledExecutionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.policy = iprot.readString();
              struct.setPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DUMP_EXECUTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.dumpExecutionId = iprot.readI64();
              struct.setDumpExecutionIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetReplicationMetricsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetScheduledExecutionId()) {
        oprot.writeFieldBegin(SCHEDULED_EXECUTION_ID_FIELD_DESC);
        oprot.writeI64(struct.scheduledExecutionId);
        oprot.writeFieldEnd();
      }
      if (struct.policy != null) {
        if (struct.isSetPolicy()) {
          oprot.writeFieldBegin(POLICY_FIELD_DESC);
          oprot.writeString(struct.policy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDumpExecutionId()) {
        oprot.writeFieldBegin(DUMP_EXECUTION_ID_FIELD_DESC);
        oprot.writeI64(struct.dumpExecutionId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetReplicationMetricsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetReplicationMetricsRequestTupleScheme getScheme() {
      return new GetReplicationMetricsRequestTupleScheme();
    }
  }

  private static class GetReplicationMetricsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetReplicationMetricsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetReplicationMetricsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetScheduledExecutionId()) {
        optionals.set(0);
      }
      if (struct.isSetPolicy()) {
        optionals.set(1);
      }
      if (struct.isSetDumpExecutionId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetScheduledExecutionId()) {
        oprot.writeI64(struct.scheduledExecutionId);
      }
      if (struct.isSetPolicy()) {
        oprot.writeString(struct.policy);
      }
      if (struct.isSetDumpExecutionId()) {
        oprot.writeI64(struct.dumpExecutionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetReplicationMetricsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.scheduledExecutionId = iprot.readI64();
        struct.setScheduledExecutionIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.policy = iprot.readString();
        struct.setPolicyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dumpExecutionId = iprot.readI64();
        struct.setDumpExecutionIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

