/**
 * MXPERSON_EMAILType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSON_EMAILType  implements java.io.Serializable {
    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType EMAILADDRESS;

    private com.ibm.www.maximo.MXLongType EMAILID;

    private com.ibm.www.maximo.MXBooleanType ISPRIMARY;

    private com.ibm.www.maximo.MXStringType TYPE;

    private com.ibm.www.maximo.ProcessingActionType action;  // attribute

    private java.lang.String relationship;  // attribute

    private java.lang.String deleteForInsert;  // attribute

    public MXPERSON_EMAILType() {
    }

    public MXPERSON_EMAILType(
           com.ibm.www.maximo.MXStringType EMAILADDRESS,
           com.ibm.www.maximo.MXLongType EMAILID,
           com.ibm.www.maximo.MXBooleanType ISPRIMARY,
           com.ibm.www.maximo.MXStringType TYPE,
           com.ibm.www.maximo.ProcessingActionType action,
           java.lang.String relationship,
           java.lang.String deleteForInsert) {
           this.EMAILADDRESS = EMAILADDRESS;
           this.EMAILID = EMAILID;
           this.ISPRIMARY = ISPRIMARY;
           this.TYPE = TYPE;
           this.action = action;
           this.relationship = relationship;
           this.deleteForInsert = deleteForInsert;
    }


    /**
     * Gets the EMAILADDRESS value for this MXPERSON_EMAILType.
     * 
     * @return EMAILADDRESS   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getEMAILADDRESS() {
        return EMAILADDRESS;
    }


    /**
     * Sets the EMAILADDRESS value for this MXPERSON_EMAILType.
     * 
     * @param EMAILADDRESS   * Unique Key Component
     */
    public void setEMAILADDRESS(com.ibm.www.maximo.MXStringType EMAILADDRESS) {
        this.EMAILADDRESS = EMAILADDRESS;
    }


    /**
     * Gets the EMAILID value for this MXPERSON_EMAILType.
     * 
     * @return EMAILID
     */
    public com.ibm.www.maximo.MXLongType getEMAILID() {
        return EMAILID;
    }


    /**
     * Sets the EMAILID value for this MXPERSON_EMAILType.
     * 
     * @param EMAILID
     */
    public void setEMAILID(com.ibm.www.maximo.MXLongType EMAILID) {
        this.EMAILID = EMAILID;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSON_EMAILType.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanType getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSON_EMAILType.
     * 
     * @param ISPRIMARY
     */
    public void setISPRIMARY(com.ibm.www.maximo.MXBooleanType ISPRIMARY) {
        this.ISPRIMARY = ISPRIMARY;
    }


    /**
     * Gets the TYPE value for this MXPERSON_EMAILType.
     * 
     * @return TYPE
     */
    public com.ibm.www.maximo.MXStringType getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this MXPERSON_EMAILType.
     * 
     * @param TYPE
     */
    public void setTYPE(com.ibm.www.maximo.MXStringType TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the action value for this MXPERSON_EMAILType.
     * 
     * @return action
     */
    public com.ibm.www.maximo.ProcessingActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this MXPERSON_EMAILType.
     * 
     * @param action
     */
    public void setAction(com.ibm.www.maximo.ProcessingActionType action) {
        this.action = action;
    }


    /**
     * Gets the relationship value for this MXPERSON_EMAILType.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this MXPERSON_EMAILType.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the deleteForInsert value for this MXPERSON_EMAILType.
     * 
     * @return deleteForInsert
     */
    public java.lang.String getDeleteForInsert() {
        return deleteForInsert;
    }


    /**
     * Sets the deleteForInsert value for this MXPERSON_EMAILType.
     * 
     * @param deleteForInsert
     */
    public void setDeleteForInsert(java.lang.String deleteForInsert) {
        this.deleteForInsert = deleteForInsert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSON_EMAILType)) return false;
        MXPERSON_EMAILType other = (MXPERSON_EMAILType) obj;
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
              this.EMAILADDRESS.equals(other.getEMAILADDRESS()))) &&
            ((this.EMAILID==null && other.getEMAILID()==null) || 
             (this.EMAILID!=null &&
              this.EMAILID.equals(other.getEMAILID()))) &&
            ((this.ISPRIMARY==null && other.getISPRIMARY()==null) || 
             (this.ISPRIMARY!=null &&
              this.ISPRIMARY.equals(other.getISPRIMARY()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
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
        if (getEMAILADDRESS() != null) {
            _hashCode += getEMAILADDRESS().hashCode();
        }
        if (getEMAILID() != null) {
            _hashCode += getEMAILID().hashCode();
        }
        if (getISPRIMARY() != null) {
            _hashCode += getISPRIMARY().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
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
        new org.apache.axis.description.TypeDesc(MXPERSON_EMAILType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_EMAILType"));
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
        elemField.setFieldName("EMAILADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAILADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAILID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAILID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISPRIMARY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TYPE"));
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
