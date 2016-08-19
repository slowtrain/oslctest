/**
 * QueryMXPERSONType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class QueryMXPERSONType  implements java.io.Serializable {
    private com.ibm.www.maximo.MXPERSONQueryType MXPERSONQuery;

    private java.util.Calendar creationDateTime;  // attribute

    private java.lang.String baseLanguage;  // attribute

    private java.lang.String transLanguage;  // attribute

    private java.lang.String messageID;  // attribute

    private java.lang.String maximoVersion;  // attribute

    private java.lang.Boolean uniqueResult;  // attribute

    private org.apache.axis.types.PositiveInteger maxItems;  // attribute

    private java.math.BigInteger rsStart;  // attribute

    public QueryMXPERSONType() {
    }

    public QueryMXPERSONType(
           com.ibm.www.maximo.MXPERSONQueryType MXPERSONQuery,
           java.util.Calendar creationDateTime,
           java.lang.String baseLanguage,
           java.lang.String transLanguage,
           java.lang.String messageID,
           java.lang.String maximoVersion,
           java.lang.Boolean uniqueResult,
           org.apache.axis.types.PositiveInteger maxItems,
           java.math.BigInteger rsStart) {
           this.MXPERSONQuery = MXPERSONQuery;
           this.creationDateTime = creationDateTime;
           this.baseLanguage = baseLanguage;
           this.transLanguage = transLanguage;
           this.messageID = messageID;
           this.maximoVersion = maximoVersion;
           this.uniqueResult = uniqueResult;
           this.maxItems = maxItems;
           this.rsStart = rsStart;
    }


    /**
     * Gets the MXPERSONQuery value for this QueryMXPERSONType.
     * 
     * @return MXPERSONQuery
     */
    public com.ibm.www.maximo.MXPERSONQueryType getMXPERSONQuery() {
        return MXPERSONQuery;
    }


    /**
     * Sets the MXPERSONQuery value for this QueryMXPERSONType.
     * 
     * @param MXPERSONQuery
     */
    public void setMXPERSONQuery(com.ibm.www.maximo.MXPERSONQueryType MXPERSONQuery) {
        this.MXPERSONQuery = MXPERSONQuery;
    }


    /**
     * Gets the creationDateTime value for this QueryMXPERSONType.
     * 
     * @return creationDateTime
     */
    public java.util.Calendar getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this QueryMXPERSONType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the baseLanguage value for this QueryMXPERSONType.
     * 
     * @return baseLanguage
     */
    public java.lang.String getBaseLanguage() {
        return baseLanguage;
    }


    /**
     * Sets the baseLanguage value for this QueryMXPERSONType.
     * 
     * @param baseLanguage
     */
    public void setBaseLanguage(java.lang.String baseLanguage) {
        this.baseLanguage = baseLanguage;
    }


    /**
     * Gets the transLanguage value for this QueryMXPERSONType.
     * 
     * @return transLanguage
     */
    public java.lang.String getTransLanguage() {
        return transLanguage;
    }


    /**
     * Sets the transLanguage value for this QueryMXPERSONType.
     * 
     * @param transLanguage
     */
    public void setTransLanguage(java.lang.String transLanguage) {
        this.transLanguage = transLanguage;
    }


    /**
     * Gets the messageID value for this QueryMXPERSONType.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this QueryMXPERSONType.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the maximoVersion value for this QueryMXPERSONType.
     * 
     * @return maximoVersion
     */
    public java.lang.String getMaximoVersion() {
        return maximoVersion;
    }


    /**
     * Sets the maximoVersion value for this QueryMXPERSONType.
     * 
     * @param maximoVersion
     */
    public void setMaximoVersion(java.lang.String maximoVersion) {
        this.maximoVersion = maximoVersion;
    }


    /**
     * Gets the uniqueResult value for this QueryMXPERSONType.
     * 
     * @return uniqueResult
     */
    public java.lang.Boolean getUniqueResult() {
        return uniqueResult;
    }


    /**
     * Sets the uniqueResult value for this QueryMXPERSONType.
     * 
     * @param uniqueResult
     */
    public void setUniqueResult(java.lang.Boolean uniqueResult) {
        this.uniqueResult = uniqueResult;
    }


    /**
     * Gets the maxItems value for this QueryMXPERSONType.
     * 
     * @return maxItems
     */
    public org.apache.axis.types.PositiveInteger getMaxItems() {
        return maxItems;
    }


    /**
     * Sets the maxItems value for this QueryMXPERSONType.
     * 
     * @param maxItems
     */
    public void setMaxItems(org.apache.axis.types.PositiveInteger maxItems) {
        this.maxItems = maxItems;
    }


    /**
     * Gets the rsStart value for this QueryMXPERSONType.
     * 
     * @return rsStart
     */
    public java.math.BigInteger getRsStart() {
        return rsStart;
    }


    /**
     * Sets the rsStart value for this QueryMXPERSONType.
     * 
     * @param rsStart
     */
    public void setRsStart(java.math.BigInteger rsStart) {
        this.rsStart = rsStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryMXPERSONType)) return false;
        QueryMXPERSONType other = (QueryMXPERSONType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MXPERSONQuery==null && other.getMXPERSONQuery()==null) || 
             (this.MXPERSONQuery!=null &&
              this.MXPERSONQuery.equals(other.getMXPERSONQuery()))) &&
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
            ((this.uniqueResult==null && other.getUniqueResult()==null) || 
             (this.uniqueResult!=null &&
              this.uniqueResult.equals(other.getUniqueResult()))) &&
            ((this.maxItems==null && other.getMaxItems()==null) || 
             (this.maxItems!=null &&
              this.maxItems.equals(other.getMaxItems()))) &&
            ((this.rsStart==null && other.getRsStart()==null) || 
             (this.rsStart!=null &&
              this.rsStart.equals(other.getRsStart())));
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
        if (getMXPERSONQuery() != null) {
            _hashCode += getMXPERSONQuery().hashCode();
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
        if (getUniqueResult() != null) {
            _hashCode += getUniqueResult().hashCode();
        }
        if (getMaxItems() != null) {
            _hashCode += getMaxItems().hashCode();
        }
        if (getRsStart() != null) {
            _hashCode += getRsStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryMXPERSONType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONType"));
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
        attrField.setFieldName("uniqueResult");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uniqueResult"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxItems");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maxItems"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rsStart");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rsStart"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MXPERSONQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSONQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSONQueryType"));
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
