/**
 * MXDomainQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXDomainQueryType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String maxvalue;  // attribute

    private com.ibm.www.maximo.QueryOperatorType operator;  // attribute

    private java.lang.Boolean operandModeOR;  // attribute

    public MXDomainQueryType() {
    }

    // Simple Types must have a String constructor
    public MXDomainQueryType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this MXDomainQueryType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MXDomainQueryType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the maxvalue value for this MXDomainQueryType.
     * 
     * @return maxvalue
     */
    public java.lang.String getMaxvalue() {
        return maxvalue;
    }


    /**
     * Sets the maxvalue value for this MXDomainQueryType.
     * 
     * @param maxvalue
     */
    public void setMaxvalue(java.lang.String maxvalue) {
        this.maxvalue = maxvalue;
    }


    /**
     * Gets the operator value for this MXDomainQueryType.
     * 
     * @return operator
     */
    public com.ibm.www.maximo.QueryOperatorType getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this MXDomainQueryType.
     * 
     * @param operator
     */
    public void setOperator(com.ibm.www.maximo.QueryOperatorType operator) {
        this.operator = operator;
    }


    /**
     * Gets the operandModeOR value for this MXDomainQueryType.
     * 
     * @return operandModeOR
     */
    public java.lang.Boolean getOperandModeOR() {
        return operandModeOR;
    }


    /**
     * Sets the operandModeOR value for this MXDomainQueryType.
     * 
     * @param operandModeOR
     */
    public void setOperandModeOR(java.lang.Boolean operandModeOR) {
        this.operandModeOR = operandModeOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXDomainQueryType)) return false;
        MXDomainQueryType other = (MXDomainQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.maxvalue==null && other.getMaxvalue()==null) || 
             (this.maxvalue!=null &&
              this.maxvalue.equals(other.getMaxvalue()))) &&
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getMaxvalue() != null) {
            _hashCode += getMaxvalue().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(MXDomainQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxvalue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maxvalue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
