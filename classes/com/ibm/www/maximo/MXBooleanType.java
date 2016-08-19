/**
 * MXBooleanType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXBooleanType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private boolean _value;

    private java.lang.Boolean changed;  // attribute

    public MXBooleanType() {
    }

    // Simple Types must have a String constructor
    public MXBooleanType(boolean _value) {
        this._value = _value;
    }
    public MXBooleanType(java.lang.String _value) {
        this._value = new Boolean(_value).booleanValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Boolean(_value).toString();
    }


    /**
     * Gets the _value value for this MXBooleanType.
     * 
     * @return _value
     */
    public boolean is_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MXBooleanType.
     * 
     * @param _value
     */
    public void set_value(boolean _value) {
        this._value = _value;
    }


    /**
     * Gets the changed value for this MXBooleanType.
     * 
     * @return changed
     */
    public java.lang.Boolean getChanged() {
        return changed;
    }


    /**
     * Sets the changed value for this MXBooleanType.
     * 
     * @param changed
     */
    public void setChanged(java.lang.Boolean changed) {
        this.changed = changed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXBooleanType)) return false;
        MXBooleanType other = (MXBooleanType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.is_value() &&
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
        _hashCode += (is_value() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChanged() != null) {
            _hashCode += getChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXBooleanType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "changed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
