/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.accumulo.core.data.thrift;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("serial")
public class InitialMultiScan implements TBase<InitialMultiScan,InitialMultiScan._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("InitialMultiScan");
  
  private static final TField SCAN_ID_FIELD_DESC = new TField("scanID", TType.I64, (short) 1);
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short) 2);
  
  public long scanID;
  public MultiScanResult result;
  
  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    SCAN_ID((short) 1, "scanID"), RESULT((short) 2, "result");
    
    private static final java.util.Map<String,_Fields> byName = new java.util.HashMap<String,_Fields>();
    
    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch (fieldId) {
        case 1: // SCAN_ID
          return SCAN_ID;
        case 2: // RESULT
          return RESULT;
        default:
          return null;
      }
    }
    
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null)
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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
  private static final int __SCANID_ISSET_ID = 0;
  private java.util.BitSet __isset_bit_vector = new java.util.BitSet(1);
  
  public static final java.util.Map<_Fields,FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields,FieldMetaData> tmpMap = new java.util.EnumMap<_Fields,FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCAN_ID, new FieldMetaData("scanID", TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I64, "ScanID")));
    tmpMap.put(_Fields.RESULT, new FieldMetaData("result", TFieldRequirementType.DEFAULT, new StructMetaData(TType.STRUCT, MultiScanResult.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(InitialMultiScan.class, metaDataMap);
  }
  
  public InitialMultiScan() {}
  
  public InitialMultiScan(long scanID, MultiScanResult result) {
    this();
    this.scanID = scanID;
    setScanIDIsSet(true);
    this.result = result;
  }
  
  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InitialMultiScan(InitialMultiScan other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.scanID = other.scanID;
    if (other.isSetResult()) {
      this.result = new MultiScanResult(other.result);
    }
  }
  
  public InitialMultiScan deepCopy() {
    return new InitialMultiScan(this);
  }
  
  @Deprecated
  public InitialMultiScan clone() {
    return new InitialMultiScan(this);
  }
  
  public long getScanID() {
    return this.scanID;
  }
  
  public InitialMultiScan setScanID(long scanID) {
    this.scanID = scanID;
    setScanIDIsSet(true);
    return this;
  }
  
  public void unsetScanID() {
    __isset_bit_vector.clear(__SCANID_ISSET_ID);
  }
  
  /** Returns true if field scanID is set (has been asigned a value) and false otherwise */
  public boolean isSetScanID() {
    return __isset_bit_vector.get(__SCANID_ISSET_ID);
  }
  
  public void setScanIDIsSet(boolean value) {
    __isset_bit_vector.set(__SCANID_ISSET_ID, value);
  }
  
  public MultiScanResult getResult() {
    return this.result;
  }
  
  public InitialMultiScan setResult(MultiScanResult result) {
    this.result = result;
    return this;
  }
  
  public void unsetResult() {
    this.result = null;
  }
  
  /** Returns true if field result is set (has been asigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }
  
  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }
  
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
      case SCAN_ID:
        if (value == null) {
          unsetScanID();
        } else {
          setScanID((Long) value);
        }
        break;
      
      case RESULT:
        if (value == null) {
          unsetResult();
        } else {
          setResult((MultiScanResult) value);
        }
        break;
    
    }
  }
  
  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }
  
  public Object getFieldValue(_Fields field) {
    switch (field) {
      case SCAN_ID:
        return new Long(getScanID());
        
      case RESULT:
        return getResult();
        
    }
    throw new IllegalStateException();
  }
  
  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }
  
  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
      case SCAN_ID:
        return isSetScanID();
      case RESULT:
        return isSetResult();
    }
    throw new IllegalStateException();
  }
  
  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }
  
  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InitialMultiScan)
      return this.equals((InitialMultiScan) that);
    return false;
  }
  
  public boolean equals(InitialMultiScan that) {
    if (that == null)
      return false;
    
    boolean this_present_scanID = true;
    boolean that_present_scanID = true;
    if (this_present_scanID || that_present_scanID) {
      if (!(this_present_scanID && that_present_scanID))
        return false;
      if (this.scanID != that.scanID)
        return false;
    }
    
    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }
    
    return true;
  }
  
  @Override
  public int hashCode() {
    return 0;
  }
  
  public int compareTo(InitialMultiScan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }
    
    int lastComparison = 0;
    InitialMultiScan typedOther = (InitialMultiScan) other;
    
    lastComparison = Boolean.valueOf(isSetScanID()).compareTo(typedOther.isSetScanID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScanID()) {
      lastComparison = TBaseHelper.compareTo(this.scanID, typedOther.scanID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(typedOther.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = TBaseHelper.compareTo(this.result, typedOther.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }
  
  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // SCAN_ID
          if (field.type == TType.I64) {
            this.scanID = iprot.readI64();
            setScanIDIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RESULT
          if (field.type == TType.STRUCT) {
            this.result = new MultiScanResult();
            this.result.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    
    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }
  
  public void write(TProtocol oprot) throws TException {
    validate();
    
    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SCAN_ID_FIELD_DESC);
    oprot.writeI64(this.scanID);
    oprot.writeFieldEnd();
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InitialMultiScan(");
    sb.append("scanID:");
    sb.append(this.scanID);
    sb.append(", ");
    sb.append("result:");
    if (this.result == null) {
      sb.append("null");
    } else {
      sb.append(this.result);
    }
    sb.append(")");
    return sb.toString();
  }
  
  public void validate() throws TException {
    // check for required fields
  }
  
}
