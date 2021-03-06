/**
 * CreateMXWOResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class CreateMXWOResponseType  implements java.io.Serializable {
    private com.ibm.www.maximo.WORKORDERKeyType[] WORKORDERMboKeySet;

    private java.util.Calendar creationDateTime;  // attribute

    private java.lang.String baseLanguage;  // attribute

    private java.lang.String transLanguage;  // attribute

    private java.lang.String messageID;  // attribute

    private java.lang.String maximoVersion;  // attribute

    public CreateMXWOResponseType() {
    }

    public CreateMXWOResponseType(
           com.ibm.www.maximo.WORKORDERKeyType[] WORKORDERMboKeySet,
           java.util.Calendar creationDateTime,
           java.lang.String baseLanguage,
           java.lang.String transLanguage,
           java.lang.String messageID,
           java.lang.String maximoVersion) {
           this.WORKORDERMboKeySet = WORKORDERMboKeySet;
           this.creationDateTime = creationDateTime;
           this.baseLanguage = baseLanguage;
           this.transLanguage = transLanguage;
           this.messageID = messageID;
           this.maximoVersion = maximoVersion;
    }


    /**
     * Gets the WORKORDERMboKeySet value for this CreateMXWOResponseType.
     * 
     * @return WORKORDERMboKeySet
     */
    public com.ibm.www.maximo.WORKORDERKeyType[] getWORKORDERMboKeySet() {
        return WORKORDERMboKeySet;
    }


    /**
     * Sets the WORKORDERMboKeySet value for this CreateMXWOResponseType.
     * 
     * @param WORKORDERMboKeySet
     */
    public void setWORKORDERMboKeySet(com.ibm.www.maximo.WORKORDERKeyType[] WORKORDERMboKeySet) {
        this.WORKORDERMboKeySet = WORKORDERMboKeySet;
    }


    /**
     * Gets the creationDateTime value for this CreateMXWOResponseType.
     * 
     * @return creationDateTime
     */
    public java.util.Calendar getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this CreateMXWOResponseType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the baseLanguage value for this CreateMXWOResponseType.
     * 
     * @return baseLanguage
     */
    public java.lang.String getBaseLanguage() {
        return baseLanguage;
    }


    /**
     * Sets the baseLanguage value for this CreateMXWOResponseType.
     * 
     * @param baseLanguage
     */
    public void setBaseLanguage(java.lang.String baseLanguage) {
        this.baseLanguage = baseLanguage;
    }


    /**
     * Gets the transLanguage value for this CreateMXWOResponseType.
     * 
     * @return transLanguage
     */
    public java.lang.String getTransLanguage() {
        return transLanguage;
    }


    /**
     * Sets the transLanguage value for this CreateMXWOResponseType.
     * 
     * @param transLanguage
     */
    public void setTransLanguage(java.lang.String transLanguage) {
        this.transLanguage = transLanguage;
    }


    /**
     * Gets the messageID value for this CreateMXWOResponseType.
     * 
     * @return messageID
     */
    public java.lang.String getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this CreateMXWOResponseType.
     * 
     * @param messageID
     */
    public void setMessageID(java.lang.String messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the maximoVersion value for this CreateMXWOResponseType.
     * 
     * @return maximoVersion
     */
    public java.lang.String getMaximoVersion() {
        return maximoVersion;
    }


    /**
     * Sets the maximoVersion value for this CreateMXWOResponseType.
     * 
     * @param maximoVersion
     */
    public void setMaximoVersion(java.lang.String maximoVersion) {
        this.maximoVersion = maximoVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMXWOResponseType)) return false;
        CreateMXWOResponseType other = (CreateMXWOResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WORKORDERMboKeySet==null && other.getWORKORDERMboKeySet()==null) || 
             (this.WORKORDERMboKeySet!=null &&
              java.util.Arrays.equals(this.WORKORDERMboKeySet, other.getWORKORDERMboKeySet()))) &&
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
              this.maximoVersion.equals(other.getMaximoVersion())));
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
        if (getWORKORDERMboKeySet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORKORDERMboKeySet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORKORDERMboKeySet(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMXWOResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOResponseType"));
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
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKORDERMboKeySet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERMboKeySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERMboKeySetType"));
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
