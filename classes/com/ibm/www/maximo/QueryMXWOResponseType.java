/**
 * QueryMXWOResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class QueryMXWOResponseType  implements java.io.Serializable {
    private com.ibm.www.maximo.MXWO_WORKORDERType[] MXWOSet;

    private java.util.Calendar creationDateTime;  // attribute

    private java.lang.String baseLanguage;  // attribute

    private java.lang.String transLanguage;  // attribute

    private java.lang.String messageID;  // attribute

    private java.lang.String maximoVersion;  // attribute

    private java.math.BigInteger rsStart;  // attribute

    private java.math.BigInteger rsCount;  // attribute

    private java.math.BigInteger rsTotal;  // attribute

    public QueryMXWOResponseType() {
    }

    public QueryMXWOResponseType(
           com.ibm.www.maximo.MXWO_WORKORDERType[] MXWOSet,
           java.util.Calendar creationDateTime,
           java.lang.String baseLanguage,
           java.lang.String transLanguage,
           java.lang.String messageID,
           java.lang.String maximoVersion,
           java.math.BigInteger rsStart,
           java.math.BigInteger rsCount,
           java.math.BigInteger rsTotal) {
           this.MXWOSet = MXWOSet;
           this.creationDateTime = creationDateTime;
           this.baseLanguage = baseLanguage;
           this.transLanguage = transLanguage;
           this.messageID = messageID;
           this.maximoVersion = maximoVersion;
           this.rsStart = rsStart;
           this.rsCount = rsCount;
           this.rsTotal = rsTotal;
    }


    /**
     * Gets the MXWOSet value for this QueryMXWOResponseType.
     * 
     * @return MXWOSet
     */
    public com.ibm.www.maximo.MXWO_WORKORDERType[] getMXWOSet() {
        return MXWOSet;
    }


    /**
     * Sets the MXWOSet value for this QueryMXWOResponseType.
     * 
     * @param MXWOSet
     */
    public void setMXWOSet(com.ibm.www.maximo.MXWO_WORKORDERType[] MXWOSet) {
        this.MXWOSet = MXWOSet;
    }


    /**
     * Gets the creationDateTime value for this QueryMXWOResponseType.
     * 
     * @return creationDateTime
     */
    public java.util.Calendar getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this QueryMXWOResponseType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the baseLanguage value for this QueryMXWOResponseType.
     * 
     * @return baseLanguage
     */
    public java.lang.String getBaseLanguage() {
        return baseLanguage;
    }


    /**
     * Sets the baseLanguage value for this QueryMXWOResponseType.
     * 
     * @param baseLanguage
     */
    public void setBaseLanguage(java.lang.String baseLanguage) {
        this.baseLanguage = baseLanguage;
    }


    /**
     * Gets the transLanguage value for this QueryMXWOResponseType.
     * 
     * @return transLanguage
     */
    public java.lang.String getTransLanguage() {
        return transLanguage;
    }


    /**
     * Sets the transLanguage value for this QueryMXWOResponseType.
     * 
     * @param transLanguage
     */
    public void setTransLanguage(java.lang.String transLanguage) {
        this.transLanguage = transLanguage;
    }


    /**
     * Gets the messageID value for this QueryMXWOResponseType.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this QueryMXWOResponseType.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the maximoVersion value for this QueryMXWOResponseType.
     * 
     * @return maximoVersion
     */
    public java.lang.String getMaximoVersion() {
        return maximoVersion;
    }


    /**
     * Sets the maximoVersion value for this QueryMXWOResponseType.
     * 
     * @param maximoVersion
     */
    public void setMaximoVersion(java.lang.String maximoVersion) {
        this.maximoVersion = maximoVersion;
    }


    /**
     * Gets the rsStart value for this QueryMXWOResponseType.
     * 
     * @return rsStart
     */
    public java.math.BigInteger getRsStart() {
        return rsStart;
    }


    /**
     * Sets the rsStart value for this QueryMXWOResponseType.
     * 
     * @param rsStart
     */
    public void setRsStart(java.math.BigInteger rsStart) {
        this.rsStart = rsStart;
    }


    /**
     * Gets the rsCount value for this QueryMXWOResponseType.
     * 
     * @return rsCount
     */
    public java.math.BigInteger getRsCount() {
        return rsCount;
    }


    /**
     * Sets the rsCount value for this QueryMXWOResponseType.
     * 
     * @param rsCount
     */
    public void setRsCount(java.math.BigInteger rsCount) {
        this.rsCount = rsCount;
    }


    /**
     * Gets the rsTotal value for this QueryMXWOResponseType.
     * 
     * @return rsTotal
     */
    public java.math.BigInteger getRsTotal() {
        return rsTotal;
    }


    /**
     * Sets the rsTotal value for this QueryMXWOResponseType.
     * 
     * @param rsTotal
     */
    public void setRsTotal(java.math.BigInteger rsTotal) {
        this.rsTotal = rsTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryMXWOResponseType)) return false;
        QueryMXWOResponseType other = (QueryMXWOResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MXWOSet==null && other.getMXWOSet()==null) || 
             (this.MXWOSet!=null &&
              java.util.Arrays.equals(this.MXWOSet, other.getMXWOSet()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.baseLanguage==null && other.getBaseLanguage()==null) || 
             (this.baseLanguage!=null &&
              this.baseLanguage.equals(other.getBaseLanguage()))) &&
            ((this.transLanguage==null && other.getTransLanguage()==null) || 
             (this.transLanguage!=null &&
              this.transLanguage.equals(other.getTransLanguage()))) &&
            ((this.messageID==null && other.getMessageID()==null) || 
             (this.messageID!=null &&
              this.messageID.equals(other.getMessageID()))) &&
            ((this.maximoVersion==null && other.getMaximoVersion()==null) || 
             (this.maximoVersion!=null &&
              this.maximoVersion.equals(other.getMaximoVersion()))) &&
            ((this.rsStart==null && other.getRsStart()==null) || 
             (this.rsStart!=null &&
              this.rsStart.equals(other.getRsStart()))) &&
            ((this.rsCount==null && other.getRsCount()==null) || 
             (this.rsCount!=null &&
              this.rsCount.equals(other.getRsCount()))) &&
            ((this.rsTotal==null && other.getRsTotal()==null) || 
             (this.rsTotal!=null &&
              this.rsTotal.equals(other.getRsTotal())));
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
        if (getMXWOSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMXWOSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMXWOSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getBaseLanguage() != null) {
            _hashCode += getBaseLanguage().hashCode();
        }
        if (getTransLanguage() != null) {
            _hashCode += getTransLanguage().hashCode();
        }
        if (getMessageID() != null) {
            _hashCode += getMessageID().hashCode();
        }
        if (getMaximoVersion() != null) {
            _hashCode += getMaximoVersion().hashCode();
        }
        if (getRsStart() != null) {
            _hashCode += getRsStart().hashCode();
        }
        if (getRsCount() != null) {
            _hashCode += getRsCount().hashCode();
        }
        if (getRsTotal() != null) {
            _hashCode += getRsTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryMXWOResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOResponseType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("creationDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "creationDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("baseLanguage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "baseLanguage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transLanguage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transLanguage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("messageID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "messageID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maximoVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maximoVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MaximoVersionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rsStart");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rsStart"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rsCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rsCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rsTotal");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rsTotal"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MXWOSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWOSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWOSetType"));
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
