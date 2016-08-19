/**
 * MXPERSONQueryTypePERSONPHONE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSONQueryTypePERSONPHONE  implements java.io.Serializable {
    private com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY;

    private com.ibm.www.maximo.MXLongQueryType[] PHONEID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] PHONENUM;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] TYPE;

    private java.lang.Boolean filter;  // attribute

    public MXPERSONQueryTypePERSONPHONE() {
    }

    public MXPERSONQueryTypePERSONPHONE(
           com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY,
           com.ibm.www.maximo.MXLongQueryType[] PHONEID,
           com.ibm.www.maximo.MXStringQueryType[] PHONENUM,
           com.ibm.www.maximo.MXStringQueryType[] TYPE,
           java.lang.Boolean filter) {
           this.ISPRIMARY = ISPRIMARY;
           this.PHONEID = PHONEID;
           this.PHONENUM = PHONENUM;
           this.TYPE = TYPE;
           this.filter = filter;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSONQueryTypePERSONPHONE.
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
     * Gets the PHONEID value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @return PHONEID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getPHONEID() {
        return PHONEID;
    }


    /**
     * Sets the PHONEID value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @param PHONEID
     */
    public void setPHONEID(com.ibm.www.maximo.MXLongQueryType[] PHONEID) {
        this.PHONEID = PHONEID;
    }

    public com.ibm.www.maximo.MXLongQueryType getPHONEID(int i) {
        return this.PHONEID[i];
    }

    public void setPHONEID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.PHONEID[i] = _value;
    }


    /**
     * Gets the PHONENUM value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @return PHONENUM   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPHONENUM() {
        return PHONENUM;
    }


    /**
     * Sets the PHONENUM value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @param PHONENUM   * Unique Key Component
     */
    public void setPHONENUM(com.ibm.www.maximo.MXStringQueryType[] PHONENUM) {
        this.PHONENUM = PHONENUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getPHONENUM(int i) {
        return this.PHONENUM[i];
    }

    public void setPHONENUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PHONENUM[i] = _value;
    }


    /**
     * Gets the TYPE value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @return TYPE   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @param TYPE   * Unique Key Component
     */
    public void setTYPE(com.ibm.www.maximo.MXStringQueryType[] TYPE) {
        this.TYPE = TYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getTYPE(int i) {
        return this.TYPE[i];
    }

    public void setTYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.TYPE[i] = _value;
    }


    /**
     * Gets the filter value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @return filter
     */
    public java.lang.Boolean getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this MXPERSONQueryTypePERSONPHONE.
     * 
     * @param filter
     */
    public void setFilter(java.lang.Boolean filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSONQueryTypePERSONPHONE)) return false;
        MXPERSONQueryTypePERSONPHONE other = (MXPERSONQueryTypePERSONPHONE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ISPRIMARY==null && other.getISPRIMARY()==null) || 
             (this.ISPRIMARY!=null &&
              java.util.Arrays.equals(this.ISPRIMARY, other.getISPRIMARY()))) &&
            ((this.PHONEID==null && other.getPHONEID()==null) || 
             (this.PHONEID!=null &&
              java.util.Arrays.equals(this.PHONEID, other.getPHONEID()))) &&
            ((this.PHONENUM==null && other.getPHONENUM()==null) || 
             (this.PHONENUM!=null &&
              java.util.Arrays.equals(this.PHONENUM, other.getPHONENUM()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              java.util.Arrays.equals(this.TYPE, other.getTYPE()))) &&
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
        if (getPHONEID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPHONEID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPHONEID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPHONENUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPHONENUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPHONENUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTYPE(), i);
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
        new org.apache.axis.description.TypeDesc(MXPERSONQueryTypePERSONPHONE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>PHONE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISPRIMARY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TYPE"));
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
