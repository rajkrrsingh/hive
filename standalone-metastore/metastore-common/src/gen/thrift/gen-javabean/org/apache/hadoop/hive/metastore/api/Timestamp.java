/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class Timestamp implements org.apache.thrift.TBase<Timestamp, Timestamp._Fields>, java.io.Serializable, Cloneable, Comparable<Timestamp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Timestamp");

  private static final org.apache.thrift.protocol.TField SECONDS_SINCE_EPOCH_FIELD_DESC = new org.apache.thrift.protocol.TField("secondsSinceEpoch", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TimestampStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TimestampTupleSchemeFactory();

  private long secondsSinceEpoch; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SECONDS_SINCE_EPOCH((short)1, "secondsSinceEpoch");

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
        case 1: // SECONDS_SINCE_EPOCH
          return SECONDS_SINCE_EPOCH;
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
  private static final int __SECONDSSINCEEPOCH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SECONDS_SINCE_EPOCH, new org.apache.thrift.meta_data.FieldMetaData("secondsSinceEpoch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Timestamp.class, metaDataMap);
  }

  public Timestamp() {
  }

  public Timestamp(
    long secondsSinceEpoch)
  {
    this();
    this.secondsSinceEpoch = secondsSinceEpoch;
    setSecondsSinceEpochIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Timestamp(Timestamp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.secondsSinceEpoch = other.secondsSinceEpoch;
  }

  public Timestamp deepCopy() {
    return new Timestamp(this);
  }

  @Override
  public void clear() {
    setSecondsSinceEpochIsSet(false);
    this.secondsSinceEpoch = 0;
  }

  public long getSecondsSinceEpoch() {
    return this.secondsSinceEpoch;
  }

  public void setSecondsSinceEpoch(long secondsSinceEpoch) {
    this.secondsSinceEpoch = secondsSinceEpoch;
    setSecondsSinceEpochIsSet(true);
  }

  public void unsetSecondsSinceEpoch() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SECONDSSINCEEPOCH_ISSET_ID);
  }

  /** Returns true if field secondsSinceEpoch is set (has been assigned a value) and false otherwise */
  public boolean isSetSecondsSinceEpoch() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SECONDSSINCEEPOCH_ISSET_ID);
  }

  public void setSecondsSinceEpochIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SECONDSSINCEEPOCH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SECONDS_SINCE_EPOCH:
      if (value == null) {
        unsetSecondsSinceEpoch();
      } else {
        setSecondsSinceEpoch((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SECONDS_SINCE_EPOCH:
      return getSecondsSinceEpoch();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SECONDS_SINCE_EPOCH:
      return isSetSecondsSinceEpoch();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Timestamp)
      return this.equals((Timestamp)that);
    return false;
  }

  public boolean equals(Timestamp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_secondsSinceEpoch = true;
    boolean that_present_secondsSinceEpoch = true;
    if (this_present_secondsSinceEpoch || that_present_secondsSinceEpoch) {
      if (!(this_present_secondsSinceEpoch && that_present_secondsSinceEpoch))
        return false;
      if (this.secondsSinceEpoch != that.secondsSinceEpoch)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(secondsSinceEpoch);

    return hashCode;
  }

  @Override
  public int compareTo(Timestamp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSecondsSinceEpoch(), other.isSetSecondsSinceEpoch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecondsSinceEpoch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secondsSinceEpoch, other.secondsSinceEpoch);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Timestamp(");
    boolean first = true;

    sb.append("secondsSinceEpoch:");
    sb.append(this.secondsSinceEpoch);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetSecondsSinceEpoch()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'secondsSinceEpoch' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimestampStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TimestampStandardScheme getScheme() {
      return new TimestampStandardScheme();
    }
  }

  private static class TimestampStandardScheme extends org.apache.thrift.scheme.StandardScheme<Timestamp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Timestamp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SECONDS_SINCE_EPOCH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.secondsSinceEpoch = iprot.readI64();
              struct.setSecondsSinceEpochIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Timestamp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SECONDS_SINCE_EPOCH_FIELD_DESC);
      oprot.writeI64(struct.secondsSinceEpoch);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimestampTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TimestampTupleScheme getScheme() {
      return new TimestampTupleScheme();
    }
  }

  private static class TimestampTupleScheme extends org.apache.thrift.scheme.TupleScheme<Timestamp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Timestamp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.secondsSinceEpoch);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Timestamp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.secondsSinceEpoch = iprot.readI64();
      struct.setSecondsSinceEpochIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

