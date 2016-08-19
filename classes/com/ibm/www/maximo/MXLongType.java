/**
 * MXLongType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXLongType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private long _value;

    private java.lang.Boolean changed;  // attribute

    public MXLongType() {
    }

    // Simple Types must have a String constructor
    public MXLongType(long _value) {
        this._value = _value;
    }
    public MXLongType(java.lang.String _value) {
        this._value = new Long(_value).longValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Long(_value).toString();
    }


    /**
     * Gets the _value value for this MXLongType.
     * 
     * @return _value
     */
    public long get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MXLongType.
     * 
     * @param _value
     */
    public void set_value(long _value) {
        this._value = _value;
    }


    /**
     * Gets the changed value for this MXLongType.
     * 
     * @return changed
     */
    public java.lang.Boolean getChanged() {
        return changed;
    }


    /**
     * Sets the changed value for this MXLongType.
     * 
     * @param changed
     */
    public void setChanged(java.lang.Boolean changed) {
        this.changed = changed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXLongType)) return false;
        MXLongType other = (MXLongType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.changed==null && other.getChanged()==null) || 
             (this.changed!=null &&
              this.changed.equals(other.getChanged())));
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
        _hashCode += new Long(get_value()).hashCode();
        if (getChanged() != null) {
            _hashCode += getChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXLongType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "changed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
