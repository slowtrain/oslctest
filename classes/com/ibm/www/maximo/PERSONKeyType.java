/**
 * PERSONKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class PERSONKeyType  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType PERSONID;

    public PERSONKeyType() {
    }

    public PERSONKeyType(
           com.ibm.www.maximo.MXStringType PERSONID) {
           this.PERSONID = PERSONID;
    }


    /**
     * Gets the PERSONID value for this PERSONKeyType.
     * 
     * @return PERSONID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getPERSONID() {
        return PERSONID;
    }


    /**
     * Sets the PERSONID value for this PERSONKeyType.
     * 
     * @param PERSONID   * Unique Key Component
     */
    public void setPERSONID(com.ibm.www.maximo.MXStringType PERSONID) {
        this.PERSONID = PERSONID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PERSONKeyType)) return false;
        PERSONKeyType other = (PERSONKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PERSONID==null && other.getPERSONID()==null) || 
             (this.PERSONID!=null &&
              this.PERSONID.equals(other.getPERSONID())));
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
        if (getPERSONID() != null) {
            _hashCode += getPERSONID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PERSONKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONID"));
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
