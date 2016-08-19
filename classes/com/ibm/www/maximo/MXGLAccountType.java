/**
 * MXGLAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXGLAccountType  implements java.io.Serializable {
    private java.lang.String VALUE;

    private com.ibm.www.maximo.MXGLComponentType[] GLCOMP;

    private java.lang.Boolean changed;  // attribute

    public MXGLAccountType() {
    }

    public MXGLAccountType(
           java.lang.String VALUE,
           com.ibm.www.maximo.MXGLComponentType[] GLCOMP,
           java.lang.Boolean changed) {
           this.VALUE = VALUE;
           this.GLCOMP = GLCOMP;
           this.changed = changed;
    }


    /**
     * Gets the VALUE value for this MXGLAccountType.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this MXGLAccountType.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }


    /**
     * Gets the GLCOMP value for this MXGLAccountType.
     * 
     * @return GLCOMP
     */
    public com.ibm.www.maximo.MXGLComponentType[] getGLCOMP() {
        return GLCOMP;
    }


    /**
     * Sets the GLCOMP value for this MXGLAccountType.
     * 
     * @param GLCOMP
     */
    public void setGLCOMP(com.ibm.www.maximo.MXGLComponentType[] GLCOMP) {
        this.GLCOMP = GLCOMP;
    }

    public com.ibm.www.maximo.MXGLComponentType getGLCOMP(int i) {
        return this.GLCOMP[i];
    }

    public void setGLCOMP(int i, com.ibm.www.maximo.MXGLComponentType _value) {
        this.GLCOMP[i] = _value;
    }


    /**
     * Gets the changed value for this MXGLAccountType.
     * 
     * @return changed
     */
    public java.lang.Boolean getChanged() {
        return changed;
    }


    /**
     * Sets the changed value for this MXGLAccountType.
     * 
     * @param changed
     */
    public void setChanged(java.lang.Boolean changed) {
        this.changed = changed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXGLAccountType)) return false;
        MXGLAccountType other = (MXGLAccountType) obj;
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
            ((this.GLCOMP==null && other.getGLCOMP()==null) || 
             (this.GLCOMP!=null &&
              java.util.Arrays.equals(this.GLCOMP, other.getGLCOMP()))) &&
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
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
        }
        if (getGLCOMP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGLCOMP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGLCOMP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChanged() != null) {
            _hashCode += getChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXGLAccountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "changed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLCOMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GLCOMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLComponentType"));
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
