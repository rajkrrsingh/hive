/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class Schema implements org.apache.thrift.TBase<Schema, Schema._Fields>, java.io.Serializable, Cloneable, Comparable<Schema> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Schema");

  private static final org.apache.thrift.protocol.TField FIELD_SCHEMAS_FIELD_DESC = new org.apache.thrift.protocol.TField("fieldSchemas", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SchemaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SchemaTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> fieldSchemas; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FIELD_SCHEMAS((short)1, "fieldSchemas"),
    PROPERTIES((short)2, "properties");

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
        case 1: // FIELD_SCHEMAS
          return FIELD_SCHEMAS;
        case 2: // PROPERTIES
          return PROPERTIES;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FIELD_SCHEMAS, new org.apache.thrift.meta_data.FieldMetaData("fieldSchemas", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FieldSchema.class))));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Schema.class, metaDataMap);
  }

  public Schema() {
  }

  public Schema(
    java.util.List<FieldSchema> fieldSchemas,
    java.util.Map<java.lang.String,java.lang.String> properties)
  {
    this();
    this.fieldSchemas = fieldSchemas;
    this.properties = properties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Schema(Schema other) {
    if (other.isSetFieldSchemas()) {
      java.util.List<FieldSchema> __this__fieldSchemas = new java.util.ArrayList<FieldSchema>(other.fieldSchemas.size());
      for (FieldSchema other_element : other.fieldSchemas) {
        __this__fieldSchemas.add(new FieldSchema(other_element));
      }
      this.fieldSchemas = __this__fieldSchemas;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  public Schema deepCopy() {
    return new Schema(this);
  }

  @Override
  public void clear() {
    this.fieldSchemas = null;
    this.properties = null;
  }

  public int getFieldSchemasSize() {
    return (this.fieldSchemas == null) ? 0 : this.fieldSchemas.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<FieldSchema> getFieldSchemasIterator() {
    return (this.fieldSchemas == null) ? null : this.fieldSchemas.iterator();
  }

  public void addToFieldSchemas(FieldSchema elem) {
    if (this.fieldSchemas == null) {
      this.fieldSchemas = new java.util.ArrayList<FieldSchema>();
    }
    this.fieldSchemas.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<FieldSchema> getFieldSchemas() {
    return this.fieldSchemas;
  }

  public void setFieldSchemas(@org.apache.thrift.annotation.Nullable java.util.List<FieldSchema> fieldSchemas) {
    this.fieldSchemas = fieldSchemas;
  }

  public void unsetFieldSchemas() {
    this.fieldSchemas = null;
  }

  /** Returns true if field fieldSchemas is set (has been assigned a value) and false otherwise */
  public boolean isSetFieldSchemas() {
    return this.fieldSchemas != null;
  }

  public void setFieldSchemasIsSet(boolean value) {
    if (!value) {
      this.fieldSchemas = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.properties == null) {
      this.properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.properties;
  }

  public void setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
    this.properties = properties;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FIELD_SCHEMAS:
      if (value == null) {
        unsetFieldSchemas();
      } else {
        setFieldSchemas((java.util.List<FieldSchema>)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FIELD_SCHEMAS:
      return getFieldSchemas();

    case PROPERTIES:
      return getProperties();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case FIELD_SCHEMAS:
      return isSetFieldSchemas();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Schema)
      return this.equals((Schema)that);
    return false;
  }

  public boolean equals(Schema that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fieldSchemas = true && this.isSetFieldSchemas();
    boolean that_present_fieldSchemas = true && that.isSetFieldSchemas();
    if (this_present_fieldSchemas || that_present_fieldSchemas) {
      if (!(this_present_fieldSchemas && that_present_fieldSchemas))
        return false;
      if (!this.fieldSchemas.equals(that.fieldSchemas))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFieldSchemas()) ? 131071 : 524287);
    if (isSetFieldSchemas())
      hashCode = hashCode * 8191 + fieldSchemas.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Schema other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetFieldSchemas()).compareTo(other.isSetFieldSchemas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFieldSchemas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fieldSchemas, other.fieldSchemas);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Schema(");
    boolean first = true;

    sb.append("fieldSchemas:");
    if (this.fieldSchemas == null) {
      sb.append("null");
    } else {
      sb.append(this.fieldSchemas);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("properties:");
    if (this.properties == null) {
      sb.append("null");
    } else {
      sb.append(this.properties);
    }
    first = false;
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SchemaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SchemaStandardScheme getScheme() {
      return new SchemaStandardScheme();
    }
  }

  private static class SchemaStandardScheme extends org.apache.thrift.scheme.StandardScheme<Schema> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Schema struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FIELD_SCHEMAS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list324 = iprot.readListBegin();
                struct.fieldSchemas = new java.util.ArrayList<FieldSchema>(_list324.size);
                @org.apache.thrift.annotation.Nullable FieldSchema _elem325;
                for (int _i326 = 0; _i326 < _list324.size; ++_i326)
                {
                  _elem325 = new FieldSchema();
                  _elem325.read(iprot);
                  struct.fieldSchemas.add(_elem325);
                }
                iprot.readListEnd();
              }
              struct.setFieldSchemasIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map327 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map327.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key328;
                @org.apache.thrift.annotation.Nullable java.lang.String _val329;
                for (int _i330 = 0; _i330 < _map327.size; ++_i330)
                {
                  _key328 = iprot.readString();
                  _val329 = iprot.readString();
                  struct.properties.put(_key328, _val329);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Schema struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fieldSchemas != null) {
        oprot.writeFieldBegin(FIELD_SCHEMAS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.fieldSchemas.size()));
          for (FieldSchema _iter331 : struct.fieldSchemas)
          {
            _iter331.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter332 : struct.properties.entrySet())
          {
            oprot.writeString(_iter332.getKey());
            oprot.writeString(_iter332.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SchemaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SchemaTupleScheme getScheme() {
      return new SchemaTupleScheme();
    }
  }

  private static class SchemaTupleScheme extends org.apache.thrift.scheme.TupleScheme<Schema> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Schema struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetFieldSchemas()) {
        optionals.set(0);
      }
      if (struct.isSetProperties()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFieldSchemas()) {
        {
          oprot.writeI32(struct.fieldSchemas.size());
          for (FieldSchema _iter333 : struct.fieldSchemas)
          {
            _iter333.write(oprot);
          }
        }
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter334 : struct.properties.entrySet())
          {
            oprot.writeString(_iter334.getKey());
            oprot.writeString(_iter334.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Schema struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list335 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.fieldSchemas = new java.util.ArrayList<FieldSchema>(_list335.size);
          @org.apache.thrift.annotation.Nullable FieldSchema _elem336;
          for (int _i337 = 0; _i337 < _list335.size; ++_i337)
          {
            _elem336 = new FieldSchema();
            _elem336.read(iprot);
            struct.fieldSchemas.add(_elem336);
          }
        }
        struct.setFieldSchemasIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map338 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map338.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key339;
          @org.apache.thrift.annotation.Nullable java.lang.String _val340;
          for (int _i341 = 0; _i341 < _map338.size; ++_i341)
          {
            _key339 = iprot.readString();
            _val340 = iprot.readString();
            struct.properties.put(_key339, _val340);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

