/**
 * MXWOQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXWOQueryType  implements java.io.Serializable {
    private java.lang.String WHERE;

    private com.ibm.www.maximo.MXWOQueryTypeWORKORDER WORKORDER;

    private java.lang.String orderby;  // attribute

    private com.ibm.www.maximo.OperandModeType operandMode;  // attribute

    public MXWOQueryType() {
    }

    public MXWOQueryType(
           java.lang.String WHERE,
           com.ibm.www.maximo.MXWOQueryTypeWORKORDER WORKORDER,
           java.lang.String orderby,
           com.ibm.www.maximo.OperandModeType operandMode) {
           this.WHERE = WHERE;
           this.WORKORDER = WORKORDER;
           this.orderby = orderby;
           this.operandMode = operandMode;
    }


    /**
     * Gets the WHERE value for this MXWOQueryType.
     * 
     * @return WHERE
     */
    public java.lang.String getWHERE() {
        return WHERE;
    }


    /**
     * Sets the WHERE value for this MXWOQueryType.
     * 
     * @param WHERE
     */
    public void setWHERE(java.lang.String WHERE) {
        this.WHERE = WHERE;
    }


    /**
     * Gets the WORKORDER value for this MXWOQueryType.
     * 
     * @return WORKORDER
     */
    public com.ibm.www.maximo.MXWOQueryTypeWORKORDER getWORKORDER() {
        return WORKORDER;
    }


    /**
     * Sets the WORKORDER value for this MXWOQueryType.
     * 
     * @param WORKORDER
     */
    public void setWORKORDER(com.ibm.www.maximo.MXWOQueryTypeWORKORDER WORKORDER) {
        this.WORKORDER = WORKORDER;
    }


    /**
     * Gets the orderby value for this MXWOQueryType.
     * 
     * @return orderby
     */
    public java.lang.String getOrderby() {
        return orderby;
    }


    /**
     * Sets the orderby value for this MXWOQueryType.
     * 
     * @param orderby
     */
    public void setOrderby(java.lang.String orderby) {
        this.orderby = orderby;
    }


    /**
     * Gets the operandMode value for this MXWOQueryType.
     * 
     * @return operandMode
     */
    public com.ibm.www.maximo.OperandModeType getOperandMode() {
        return operandMode;
    }


    /**
     * Sets the operandMode value for this MXWOQueryType.
     * 
     * @param operandMode
     */
    public void setOperandMode(com.ibm.www.maximo.OperandModeType operandMode) {
        this.operandMode = operandMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXWOQueryType)) return false;
        MXWOQueryType other = (MXWOQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WHERE==null && other.getWHERE()==null) || 
             (this.WHERE!=null &&
              this.WHERE.equals(other.getWHERE()))) &&
            ((this.WORKORDER==null && other.getWORKORDER()==null) || 
             (this.WORKORDER!=null &&
              this.WORKORDER.equals(other.getWORKORDER()))) &&
            ((this.orderby==null && other.getOrderby()==null) || 
             (this.orderby!=null &&
              this.orderby.equals(other.getOrderby()))) &&
            ((this.operandMode==null && other.getOperandMode()==null) || 
             (this.operandMode!=null &&
              this.operandMode.equals(other.getOperandMode())));
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
        if (getWHERE() != null) {
            _hashCode += getWHERE().hashCode();
        }
        if (getWORKORDER() != null) {
            _hashCode += getWORKORDER().hashCode();
        }
        if (getOrderby() != null) {
            _hashCode += getOrderby().hashCode();
        }
        if (getOperandMode() != null) {
            _hashCode += getOperandMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXWOQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWOQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("orderby");
        attrField.setXmlName(new javax.xml.namespace.QName("", "orderby"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operandMode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operandMode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OperandModeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHERE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WHERE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKORDER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXWOQueryType>WORKORDER"));
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
