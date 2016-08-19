/**
 * MXPERSONQueryTypePERSONSMS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSONQueryTypePERSONSMS  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] ADDRESS;

    private com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY;

    private com.ibm.www.maximo.MXLongQueryType[] SMSID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] SMSTYPE;

    private java.lang.Boolean filter;  // attribute

    public MXPERSONQueryTypePERSONSMS() {
    }

    public MXPERSONQueryTypePERSONSMS(
           com.ibm.www.maximo.MXStringQueryType[] ADDRESS,
           com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY,
           com.ibm.www.maximo.MXLongQueryType[] SMSID,
           com.ibm.www.maximo.MXStringQueryType[] SMSTYPE,
           java.lang.Boolean filter) {
           this.ADDRESS = ADDRESS;
           this.ISPRIMARY = ISPRIMARY;
           this.SMSID = SMSID;
           this.SMSTYPE = SMSTYPE;
           this.filter = filter;
    }


    /**
     * Gets the ADDRESS value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @return ADDRESS   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @param ADDRESS   * Unique Key Component
     */
    public void setADDRESS(com.ibm.www.maximo.MXStringQueryType[] ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public com.ibm.www.maximo.MXStringQueryType getADDRESS(int i) {
        return this.ADDRESS[i];
    }

    public void setADDRESS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ADDRESS[i] = _value;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @param ISPRIMARY
     */
    public void setISPRIMARY(com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY) {
        this.ISPRIMARY = ISPRIMARY;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getISPRIMARY(int i) {
        return this.ISPRIMARY[i];
    }

    public void setISPRIMARY(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.ISPRIMARY[i] = _value;
    }


    /**
     * Gets the SMSID value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @return SMSID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getSMSID() {
        return SMSID;
    }


    /**
     * Sets the SMSID value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @param SMSID
     */
    public void setSMSID(com.ibm.www.maximo.MXLongQueryType[] SMSID) {
        this.SMSID = SMSID;
    }

    public com.ibm.www.maximo.MXLongQueryType getSMSID(int i) {
        return this.SMSID[i];
    }

    public void setSMSID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.SMSID[i] = _value;
    }


    /**
     * Gets the SMSTYPE value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @return SMSTYPE   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSMSTYPE() {
        return SMSTYPE;
    }


    /**
     * Sets the SMSTYPE value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @param SMSTYPE   * Unique Key Component
     */
    public void setSMSTYPE(com.ibm.www.maximo.MXStringQueryType[] SMSTYPE) {
        this.SMSTYPE = SMSTYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getSMSTYPE(int i) {
        return this.SMSTYPE[i];
    }

    public void setSMSTYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SMSTYPE[i] = _value;
    }


    /**
     * Gets the filter value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @return filter
     */
    public java.lang.Boolean getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this MXPERSONQueryTypePERSONSMS.
     * 
     * @param filter
     */
    public void setFilter(java.lang.Boolean filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSONQueryTypePERSONSMS)) return false;
        MXPERSONQueryTypePERSONSMS other = (MXPERSONQueryTypePERSONSMS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ADDRESS==null && other.getADDRESS()==null) || 
             (this.ADDRESS!=null &&
              java.util.Arrays.equals(this.ADDRESS, other.getADDRESS()))) &&
            ((this.ISPRIMARY==null && other.getISPRIMARY()==null) || 
             (this.ISPRIMARY!=null &&
              java.util.Arrays.equals(this.ISPRIMARY, other.getISPRIMARY()))) &&
            ((this.SMSID==null && other.getSMSID()==null) || 
             (this.SMSID!=null &&
              java.util.Arrays.equals(this.SMSID, other.getSMSID()))) &&
            ((this.SMSTYPE==null && other.getSMSTYPE()==null) || 
             (this.SMSTYPE!=null &&
              java.util.Arrays.equals(this.SMSTYPE, other.getSMSTYPE()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter())));
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
        if (getADDRESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDRESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDRESS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getISPRIMARY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISPRIMARY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISPRIMARY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMSID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMSID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMSID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMSTYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMSTYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMSTYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXPERSONQueryTypePERSONSMS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>SMS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISPRIMARY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMSTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
