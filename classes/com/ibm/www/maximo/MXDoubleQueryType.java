/**
 * MXDoubleQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXDoubleQueryType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private com.ibm.www.maximo.QueryOperatorType operator;  // attribute

    private java.lang.Boolean operandModeOR;  // attribute

    public MXDoubleQueryType() {
    }

    // Simple Types must have a String constructor
    public MXDoubleQueryType(double _value) {
        this._value = _value;
    }
    public MXDoubleQueryType(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this MXDoubleQueryType.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MXDoubleQueryType.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the operator value for this MXDoubleQueryType.
     * 
     * @return operator
     */
    public com.ibm.www.maximo.QueryOperatorType getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this MXDoubleQueryType.
     * 
     * @param operator
     */
    public void setOperator(com.ibm.www.maximo.QueryOperatorType operator) {
        this.operator = operator;
    }


    /**
     * Gets the operandModeOR value for this MXDoubleQueryType.
     * 
     * @return operandModeOR
     */
    public java.lang.Boolean getOperandModeOR() {
        return operandModeOR;
    }


    /**
     * Sets the operandModeOR value for this MXDoubleQueryType.
     * 
     * @param operandModeOR
     */
    public void setOperandModeOR(java.lang.Boolean operandModeOR) {
        this.operandModeOR = operandModeOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXDoubleQueryType)) return false;
        MXDoubleQueryType other = (MXDoubleQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.operandModeOR==null && other.getOperandModeOR()==null) || 
             (this.operandModeOR!=null &&
              this.operandModeOR.equals(other.getOperandModeOR())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(get_value()).hashCode();
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getOperandModeOR() != null) {
            _hashCode += getOperandModeOR().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXDoubleQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryOperatorType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operandModeOR");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operandModeOR"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.SimpleSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
