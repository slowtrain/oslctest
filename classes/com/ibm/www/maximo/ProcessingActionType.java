/**
 * ProcessingActionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class ProcessingActionType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessingActionType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Add = new org.apache.axis.types.Token("Add");
    public static final org.apache.axis.types.Token _Change = new org.apache.axis.types.Token("Change");
    public static final org.apache.axis.types.Token _Replace = new org.apache.axis.types.Token("Replace");
    public static final org.apache.axis.types.Token _Delete = new org.apache.axis.types.Token("Delete");
    public static final org.apache.axis.types.Token _AddChange = new org.apache.axis.types.Token("AddChange");
    public static final ProcessingActionType Add = new ProcessingActionType(_Add);
    public static final ProcessingActionType Change = new ProcessingActionType(_Change);
    public static final ProcessingActionType Replace = new ProcessingActionType(_Replace);
    public static final ProcessingActionType Delete = new ProcessingActionType(_Delete);
    public static final ProcessingActionType AddChange = new ProcessingActionType(_AddChange);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ProcessingActionType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ProcessingActionType enumeration = (ProcessingActionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessingActionType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessingActionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ProcessingActionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
