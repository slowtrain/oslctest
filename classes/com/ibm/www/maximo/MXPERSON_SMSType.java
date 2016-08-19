/**
 * MXPERSON_SMSType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSON_SMSType  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType ADDRESS;

    private com.ibm.www.maximo.MXBooleanType ISPRIMARY;

    private com.ibm.www.maximo.MXLongType SMSID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType SMSTYPE;

    private com.ibm.www.maximo.ProcessingActionType action;  // attribute

    private java.lang.String relationship;  // attribute

    private java.lang.String deleteForInsert;  // attribute

    public MXPERSON_SMSType() {
    }

    public MXPERSON_SMSType(
           com.ibm.www.maximo.MXStringType ADDRESS,
           com.ibm.www.maximo.MXBooleanType ISPRIMARY,
           com.ibm.www.maximo.MXLongType SMSID,
           com.ibm.www.maximo.MXStringType SMSTYPE,
           com.ibm.www.maximo.ProcessingActionType action,
           java.lang.String relationship,
           java.lang.String deleteForInsert) {
           this.ADDRESS = ADDRESS;
           this.ISPRIMARY = ISPRIMARY;
           this.SMSID = SMSID;
           this.SMSTYPE = SMSTYPE;
           this.action = action;
           this.relationship = relationship;
           this.deleteForInsert = deleteForInsert;
    }


    /**
     * Gets the ADDRESS value for this MXPERSON_SMSType.
     * 
     * @return ADDRESS   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getADDRESS() {
        return ADDRESS;
    }


    /**
     * Sets the ADDRESS value for this MXPERSON_SMSType.
     * 
     * @param ADDRESS   * Unique Key Component
     */
    public void setADDRESS(com.ibm.www.maximo.MXStringType ADDRESS) {
        this.ADDRESS = ADDRESS;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSON_SMSType.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanType getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSON_SMSType.
     * 
     * @param ISPRIMARY
     */
    public void setISPRIMARY(com.ibm.www.maximo.MXBooleanType ISPRIMARY) {
        this.ISPRIMARY = ISPRIMARY;
    }


    /**
     * Gets the SMSID value for this MXPERSON_SMSType.
     * 
     * @return SMSID
     */
    public com.ibm.www.maximo.MXLongType getSMSID() {
        return SMSID;
    }


    /**
     * Sets the SMSID value for this MXPERSON_SMSType.
     * 
     * @param SMSID
     */
    public void setSMSID(com.ibm.www.maximo.MXLongType SMSID) {
        this.SMSID = SMSID;
    }


    /**
     * Gets the SMSTYPE value for this MXPERSON_SMSType.
     * 
     * @return SMSTYPE   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getSMSTYPE() {
        return SMSTYPE;
    }


    /**
     * Sets the SMSTYPE value for this MXPERSON_SMSType.
     * 
     * @param SMSTYPE   * Unique Key Component
     */
    public void setSMSTYPE(com.ibm.www.maximo.MXStringType SMSTYPE) {
        this.SMSTYPE = SMSTYPE;
    }


    /**
     * Gets the action value for this MXPERSON_SMSType.
     * 
     * @return action
     */
    public com.ibm.www.maximo.ProcessingActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this MXPERSON_SMSType.
     * 
     * @param action
     */
    public void setAction(com.ibm.www.maximo.ProcessingActionType action) {
        this.action = action;
    }


    /**
     * Gets the relationship value for this MXPERSON_SMSType.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this MXPERSON_SMSType.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the deleteForInsert value for this MXPERSON_SMSType.
     * 
     * @return deleteForInsert
     */
    public java.lang.String getDeleteForInsert() {
        return deleteForInsert;
    }


    /**
     * Sets the deleteForInsert value for this MXPERSON_SMSType.
     * 
     * @param deleteForInsert
     */
    public void setDeleteForInsert(java.lang.String deleteForInsert) {
        this.deleteForInsert = deleteForInsert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSON_SMSType)) return false;
        MXPERSON_SMSType other = (MXPERSON_SMSType) obj;
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
              this.ADDRESS.equals(other.getADDRESS()))) &&
            ((this.ISPRIMARY==null && other.getISPRIMARY()==null) || 
             (this.ISPRIMARY!=null &&
              this.ISPRIMARY.equals(other.getISPRIMARY()))) &&
            ((this.SMSID==null && other.getSMSID()==null) || 
             (this.SMSID!=null &&
              this.SMSID.equals(other.getSMSID()))) &&
            ((this.SMSTYPE==null && other.getSMSTYPE()==null) || 
             (this.SMSTYPE!=null &&
              this.SMSTYPE.equals(other.getSMSTYPE()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship()))) &&
            ((this.deleteForInsert==null && other.getDeleteForInsert()==null) || 
             (this.deleteForInsert!=null &&
              this.deleteForInsert.equals(other.getDeleteForInsert())));
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
            _hashCode += getADDRESS().hashCode();
        }
        if (getISPRIMARY() != null) {
            _hashCode += getISPRIMARY().hashCode();
        }
        if (getSMSID() != null) {
            _hashCode += getSMSID().hashCode();
        }
        if (getSMSTYPE() != null) {
            _hashCode += getSMSTYPE().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getRelationship() != null) {
            _hashCode += getRelationship().hashCode();
        }
        if (getDeleteForInsert() != null) {
            _hashCode += getDeleteForInsert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXPERSON_SMSType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_SMSType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("action");
        attrField.setXmlName(new javax.xml.namespace.QName("", "action"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ProcessingActionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("relationship");
        attrField.setXmlName(new javax.xml.namespace.QName("", "relationship"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deleteForInsert");
        attrField.setXmlName(new javax.xml.namespace.QName("", "deleteForInsert"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISPRIMARY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMSTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
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
