/**
 * MXPERSON_PHONEType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSON_PHONEType  implements java.io.Serializable {
    private com.ibm.www.maximo.MXBooleanType ISPRIMARY;

    private com.ibm.www.maximo.MXLongType PHONEID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType PHONENUM;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType TYPE;

    private com.ibm.www.maximo.ProcessingActionType action;  // attribute

    private java.lang.String relationship;  // attribute

    private java.lang.String deleteForInsert;  // attribute

    public MXPERSON_PHONEType() {
    }

    public MXPERSON_PHONEType(
           com.ibm.www.maximo.MXBooleanType ISPRIMARY,
           com.ibm.www.maximo.MXLongType PHONEID,
           com.ibm.www.maximo.MXStringType PHONENUM,
           com.ibm.www.maximo.MXStringType TYPE,
           com.ibm.www.maximo.ProcessingActionType action,
           java.lang.String relationship,
           java.lang.String deleteForInsert) {
           this.ISPRIMARY = ISPRIMARY;
           this.PHONEID = PHONEID;
           this.PHONENUM = PHONENUM;
           this.TYPE = TYPE;
           this.action = action;
           this.relationship = relationship;
           this.deleteForInsert = deleteForInsert;
    }


    /**
     * Gets the ISPRIMARY value for this MXPERSON_PHONEType.
     * 
     * @return ISPRIMARY
     */
    public com.ibm.www.maximo.MXBooleanType getISPRIMARY() {
        return ISPRIMARY;
    }


    /**
     * Sets the ISPRIMARY value for this MXPERSON_PHONEType.
     * 
     * @param ISPRIMARY
     */
    public void setISPRIMARY(com.ibm.www.maximo.MXBooleanType ISPRIMARY) {
        this.ISPRIMARY = ISPRIMARY;
    }


    /**
     * Gets the PHONEID value for this MXPERSON_PHONEType.
     * 
     * @return PHONEID
     */
    public com.ibm.www.maximo.MXLongType getPHONEID() {
        return PHONEID;
    }


    /**
     * Sets the PHONEID value for this MXPERSON_PHONEType.
     * 
     * @param PHONEID
     */
    public void setPHONEID(com.ibm.www.maximo.MXLongType PHONEID) {
        this.PHONEID = PHONEID;
    }


    /**
     * Gets the PHONENUM value for this MXPERSON_PHONEType.
     * 
     * @return PHONENUM   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getPHONENUM() {
        return PHONENUM;
    }


    /**
     * Sets the PHONENUM value for this MXPERSON_PHONEType.
     * 
     * @param PHONENUM   * Unique Key Component
     */
    public void setPHONENUM(com.ibm.www.maximo.MXStringType PHONENUM) {
        this.PHONENUM = PHONENUM;
    }


    /**
     * Gets the TYPE value for this MXPERSON_PHONEType.
     * 
     * @return TYPE   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this MXPERSON_PHONEType.
     * 
     * @param TYPE   * Unique Key Component
     */
    public void setTYPE(com.ibm.www.maximo.MXStringType TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the action value for this MXPERSON_PHONEType.
     * 
     * @return action
     */
    public com.ibm.www.maximo.ProcessingActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this MXPERSON_PHONEType.
     * 
     * @param action
     */
    public void setAction(com.ibm.www.maximo.ProcessingActionType action) {
        this.action = action;
    }


    /**
     * Gets the relationship value for this MXPERSON_PHONEType.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this MXPERSON_PHONEType.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the deleteForInsert value for this MXPERSON_PHONEType.
     * 
     * @return deleteForInsert
     */
    public java.lang.String getDeleteForInsert() {
        return deleteForInsert;
    }


    /**
     * Sets the deleteForInsert value for this MXPERSON_PHONEType.
     * 
     * @param deleteForInsert
     */
    public void setDeleteForInsert(java.lang.String deleteForInsert) {
        this.deleteForInsert = deleteForInsert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSON_PHONEType)) return false;
        MXPERSON_PHONEType other = (MXPERSON_PHONEType) obj;
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
              this.ISPRIMARY.equals(other.getISPRIMARY()))) &&
            ((this.PHONEID==null && other.getPHONEID()==null) || 
             (this.PHONEID!=null &&
              this.PHONEID.equals(other.getPHONEID()))) &&
            ((this.PHONENUM==null && other.getPHONENUM()==null) || 
             (this.PHONENUM!=null &&
              this.PHONENUM.equals(other.getPHONENUM()))) &&
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
        if (getISPRIMARY() != null) {
            _hashCode += getISPRIMARY().hashCode();
        }
        if (getPHONEID() != null) {
            _hashCode += getPHONEID().hashCode();
        }
        if (getPHONENUM() != null) {
            _hashCode += getPHONENUM().hashCode();
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
        new org.apache.axis.description.TypeDesc(MXPERSON_PHONEType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PHONEType"));
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
        elemField.setFieldName("ISPRIMARY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISPRIMARY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONENUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONENUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
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
