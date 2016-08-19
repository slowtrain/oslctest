/**
 * WORKORDERKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class WORKORDERKeyType  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType SITEID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType WONUM;

    public WORKORDERKeyType() {
    }

    public WORKORDERKeyType(
           com.ibm.www.maximo.MXStringType SITEID,
           com.ibm.www.maximo.MXStringType WONUM) {
           this.SITEID = SITEID;
           this.WONUM = WONUM;
    }


    /**
     * Gets the SITEID value for this WORKORDERKeyType.
     * 
     * @return SITEID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getSITEID() {
        return SITEID;
    }


    /**
     * Sets the SITEID value for this WORKORDERKeyType.
     * 
     * @param SITEID   * Unique Key Component
     */
    public void setSITEID(com.ibm.www.maximo.MXStringType SITEID) {
        this.SITEID = SITEID;
    }


    /**
     * Gets the WONUM value for this WORKORDERKeyType.
     * 
     * @return WONUM   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getWONUM() {
        return WONUM;
    }


    /**
     * Sets the WONUM value for this WORKORDERKeyType.
     * 
     * @param WONUM   * Unique Key Component
     */
    public void setWONUM(com.ibm.www.maximo.MXStringType WONUM) {
        this.WONUM = WONUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WORKORDERKeyType)) return false;
        WORKORDERKeyType other = (WORKORDERKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SITEID==null && other.getSITEID()==null) || 
             (this.SITEID!=null &&
              this.SITEID.equals(other.getSITEID()))) &&
            ((this.WONUM==null && other.getWONUM()==null) || 
             (this.WONUM!=null &&
              this.WONUM.equals(other.getWONUM())));
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
        if (getSITEID() != null) {
            _hashCode += getSITEID().hashCode();
        }
        if (getWONUM() != null) {
            _hashCode += getWONUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WORKORDERKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WONUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WONUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
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
