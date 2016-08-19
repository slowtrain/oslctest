/**
 * QueryOperatorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class QueryOperatorType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QueryOperatorType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("=");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("!=");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("<");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("<=");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token(">");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token(">=");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("EW");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("SW");
    public static final QueryOperatorType value1 = new QueryOperatorType(_value1);
    public static final QueryOperatorType value2 = new QueryOperatorType(_value2);
    public static final QueryOperatorType value3 = new QueryOperatorType(_value3);
    public static final QueryOperatorType value4 = new QueryOperatorType(_value4);
    public static final QueryOperatorType value5 = new QueryOperatorType(_value5);
    public static final QueryOperatorType value6 = new QueryOperatorType(_value6);
    public static final QueryOperatorType value7 = new QueryOperatorType(_value7);
    public static final QueryOperatorType value8 = new QueryOperatorType(_value8);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static QueryOperatorType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        QueryOperatorType enumeration = (QueryOperatorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QueryOperatorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QueryOperatorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryOperatorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
