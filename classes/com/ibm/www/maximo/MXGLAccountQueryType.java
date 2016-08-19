/**
 * MXGLAccountQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXGLAccountQueryType  implements java.io.Serializable {
    private java.lang.String VALUE;

    private com.ibm.www.maximo.QueryOperatorType operator;  // attribute

    private java.lang.Boolean operandModeOR;  // attribute

    public MXGLAccountQueryType() {
    }

    public MXGLAccountQueryType(
           java.lang.String VALUE,
           com.ibm.www.maximo.QueryOperatorType operator,
           java.lang.Boolean operandModeOR) {
           this.VALUE = VALUE;
           this.operator = operator;
           this.operandModeOR = operandModeOR;
    }


    /**
     * Gets the VALUE value for this MXGLAccountQueryType.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this MXGLAccountQueryType.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }


    /**
     * Gets the operator value for this MXGLAccountQueryType.
     * 
     * @return operator
     */
    public com.ibm.www.maximo.QueryOperatorType getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this MXGLAccountQueryType.
     * 
     * @param operator
     */
    public void setOperator(com.ibm.www.maximo.QueryOperatorType operator) {
        this.operator = operator;
    }


    /**
     * Gets the operandModeOR value for this MXGLAccountQueryType.
     * 
     * @return operandModeOR
     */
    public java.lang.Boolean getOperandModeOR() {
        return operandModeOR;
    }


    /**
     * Sets the operandModeOR value for this MXGLAccountQueryType.
     * 
     * @param operandModeOR
     */
    public void setOperandModeOR(java.lang.Boolean operandModeOR) {
        this.operandModeOR = operandModeOR;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXGLAccountQueryType)) return false;
        MXGLAccountQueryType other = (MXGLAccountQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VALUE==null && other.getVALUE()==null) || 
             (this.VALUE!=null &&
              this.VALUE.equals(other.getVALUE()))) &&
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
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
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
        new org.apache.axis.description.TypeDesc(MXGLAccountQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountQueryType"));
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
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
          new  org.apache.axis.encoding.ser.BeanSerializer(
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
