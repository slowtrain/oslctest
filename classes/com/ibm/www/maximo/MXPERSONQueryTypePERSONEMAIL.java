/**
 * MXPERSONQueryTypePERSONEMAIL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSONQueryTypePERSONEMAIL  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] EMAILADDRESS;

    private com.ibm.www.maximo.MXLongQueryType[] EMAILID;

    private com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY;

    private com.ibm.www.maximo.MXStringQueryType[] TYPE;

    private java.lang.Boolean filter;  // attribute

    public MXPERSONQueryTypePERSONEMAIL() {
    }

    public MXPERSONQueryTypePERSONEMAIL(
           com.ibm.www.maximo.MXStringQueryType[] EMAILADDRESS,
           com.ibm.www.maximo.MXLongQueryType[] EMAILID,
           com.ibm.www.maximo.MXBooleanQueryType[] ISPRIMARY,
           com.ibm.www.maximo.MXStringQueryType[] TYPE,
           java.lang.Boolean filter) {
           this.EMAILADDRESS = EMAILADDRESS;
           this.EMAILID = EMAILID;
           this.ISPRIMARY = ISPRIMARY;
           this.TYPE = TYPE;
           this.filter = filter;
    }


    /**
     * Gets the EMAILADDRESS value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @return EMAILADDRESS   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getEMAILADDRESS() {
        return EMAILADDRESS;
    }


    /**
     * Sets the EMAILADDRESS value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @param EMAILADDRESS   * Unique Key Component
     */
    public void setEMAILADDRESS(com.ibm.www.maximo.MXStringQueryType[] EMAILADDRESS) {
        this.EMAILADDRESS = EMAILADDRESS;
    }

    public com.ibm.www.maximo.MXStringQueryType getEMAILADDRESS(int i) {
        return this.EMAILADDRESS[i];
    }

    public void setEMAILADDRESS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.EMAILADDRESS[i] = _value;
    }


    /**
     * Gets the EMAILID value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @return EMAILID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getEMAILID() {
        return EMAILID;
    }


    /**
     * Sets the EMAILID value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @param EMAILID
     */
    public void setEMAILID(com.ibm.www.maximo.MXLongQueryType[] EMAILID) {
        this.EMAILID = EMAILID;
    }

    public com.ibm.www.maximo.MXLongQueryType getEMAILID(int i) {
        return this.EMAILID[i];
    }

    public void setEMAILID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.EMAILID[i] = _value;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSONQueryTypePERSONEMAIL.
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
     * Gets the TYPE value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @return TYPE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @param TYPE
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
     * Gets the filter value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @return filter
     */
    public java.lang.Boolean getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this MXPERSONQueryTypePERSONEMAIL.
     * 
     * @param filter
     */
    public void setFilter(java.lang.Boolean filter) {
        this.filter = filter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSONQueryTypePERSONEMAIL)) return false;
        MXPERSONQueryTypePERSONEMAIL other = (MXPERSONQueryTypePERSONEMAIL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMAILADDRESS==null && other.getEMAILADDRESS()==null) || 
             (this.EMAILADDRESS!=null &&
              java.util.Arrays.equals(this.EMAILADDRESS, other.getEMAILADDRESS()))) &&
            ((this.EMAILID==null && other.getEMAILID()==null) || 
             (this.EMAILID!=null &&
              java.util.Arrays.equals(this.EMAILID, other.getEMAILID()))) &&
            ((this.ISPRIMARY==null && other.getISPRIMARY()==null) || 
             (this.ISPRIMARY!=null &&
              java.util.Arrays.equals(this.ISPRIMARY, other.getISPRIMARY()))) &&
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
        if (getEMAILADDRESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMAILADDRESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMAILADDRESS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEMAILID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMAILID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMAILID(), i);
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
        new org.apache.axis.description.TypeDesc(MXPERSONQueryTypePERSONEMAIL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>EMAIL"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAILADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAILADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAILID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAILID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
