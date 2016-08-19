/**
 * MXPERSON_PERSONType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSON_PERSONType  implements java.io.Serializable {
    private java.lang.String MAXINTERRORMSG;

    private com.ibm.www.maximo.MXBooleanType ACCEPTINGWFMAIL;

    private com.ibm.www.maximo.MXStringType ADDRESSLINE1;

    private com.ibm.www.maximo.MXStringType ADDRESSLINE2;

    private com.ibm.www.maximo.MXStringType ADDRESSLINE3;

    private com.ibm.www.maximo.MXStringType BILLTOADDRESS;

    private com.ibm.www.maximo.MXDateTimeType BIRTHDATE;

    private com.ibm.www.maximo.MXStringType CALTYPE;

    private com.ibm.www.maximo.MXStringType CITY;

    private com.ibm.www.maximo.MXStringType COUNTRY;

    private com.ibm.www.maximo.MXStringType COUNTY;

    private com.ibm.www.maximo.MXStringType DELEGATE;

    private com.ibm.www.maximo.MXDateTimeType DELEGATEFROMDATE;

    private com.ibm.www.maximo.MXDateTimeType DELEGATETODATE;

    private com.ibm.www.maximo.MXStringType DEPARTMENT;

    private com.ibm.www.maximo.MXLongType DEVICECLASS;

    private com.ibm.www.maximo.MXStringType DFLTAPP;

    /* Multiple languages supported */
    private com.ibm.www.maximo.MXStringType DISPLAYNAME;

    private com.ibm.www.maximo.MXStringType DROPPOINT;

    private com.ibm.www.maximo.MXStringType EMPLOYEETYPE;

    private com.ibm.www.maximo.MXStringType EXTERNALREFID;

    private com.ibm.www.maximo.MXStringType FIRSTNAME;

    private com.ibm.www.maximo.MXDateTimeType HIREDATE;

    private com.ibm.www.maximo.MXStringType IM_ID;

    private com.ibm.www.maximo.MXStringType JOBCODE;

    private com.ibm.www.maximo.MXStringType LANGUAGE;

    private com.ibm.www.maximo.MXDateTimeType LASTEVALDATE;

    private com.ibm.www.maximo.MXStringType LASTNAME;

    private com.ibm.www.maximo.MXStringType LOCALE;

    private com.ibm.www.maximo.MXStringType LOCATION;

    private com.ibm.www.maximo.MXStringType LOCATIONORG;

    private com.ibm.www.maximo.MXStringType LOCATIONSITE;

    private com.ibm.www.maximo.MXBooleanType LOCTOSERVREQ;

    private com.ibm.www.maximo.MXDateTimeType NEXTEVALDATE;

    private com.ibm.www.maximo.MXStringType NP_STATUSMEMO;

    private com.ibm.www.maximo.MXStringType OWNERGROUP;

    private com.ibm.www.maximo.MXStringType OWNERSYSID;

    private com.ibm.www.maximo.MXStringType PCARDEXPDATE;

    private com.ibm.www.maximo.MXStringType PCARDNUM;

    private com.ibm.www.maximo.MXStringType PCARDTYPE;

    private com.ibm.www.maximo.MXStringType PCARDVERIFICATION;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType PERSONID;

    private com.ibm.www.maximo.MXLongType PERSONUID;

    private com.ibm.www.maximo.MXStringType POSTALCODE;

    private com.ibm.www.maximo.MXStringType PRIMARYEMAIL;

    private com.ibm.www.maximo.MXStringType PRIMARYPHONE;

    private com.ibm.www.maximo.MXStringType PRIMARYSMS;

    private com.ibm.www.maximo.MXStringType REGIONDISTRICT;

    private com.ibm.www.maximo.MXStringType SENDERSYSID;

    private com.ibm.www.maximo.MXStringType SHIPTOADDRESS;

    private com.ibm.www.maximo.MXStringType SOURCESYSID;

    private com.ibm.www.maximo.MXStringType STATEPROVINCE;

    private com.ibm.www.maximo.MXDomainType STATUS;

    private com.ibm.www.maximo.MXDateTimeType STATUSDATE;

    private com.ibm.www.maximo.MXBooleanType STATUSIFACE;

    private com.ibm.www.maximo.MXStringType SUPERVISOR;

    private com.ibm.www.maximo.MXDateTimeType TERMINATIONDATE;

    private com.ibm.www.maximo.MXDomainType TIMEZONE;

    /* Multiple languages supported */
    private com.ibm.www.maximo.MXStringType TITLE;

    private com.ibm.www.maximo.MXDomainType TRANSEMAILELECTION;

    private com.ibm.www.maximo.MXLongType VIP;

    private com.ibm.www.maximo.MXDomainType WFMAILELECTION;

    private com.ibm.www.maximo.MXLongType WOPRIORITY;

    private com.ibm.www.maximo.MXPERSON_PHONEType[] PHONE;

    private com.ibm.www.maximo.MXPERSON_EMAILType[] EMAIL;

    private com.ibm.www.maximo.MXPERSON_SMSType[] SMS;

    private com.ibm.www.maximo.ProcessingActionType action;  // attribute

    private java.lang.String relationship;  // attribute

    private java.lang.String deleteForInsert;  // attribute

    private java.lang.String transLanguage;  // attribute

    public MXPERSON_PERSONType() {
    }

    public MXPERSON_PERSONType(
           java.lang.String MAXINTERRORMSG,
           com.ibm.www.maximo.MXBooleanType ACCEPTINGWFMAIL,
           com.ibm.www.maximo.MXStringType ADDRESSLINE1,
           com.ibm.www.maximo.MXStringType ADDRESSLINE2,
           com.ibm.www.maximo.MXStringType ADDRESSLINE3,
           com.ibm.www.maximo.MXStringType BILLTOADDRESS,
           com.ibm.www.maximo.MXDateTimeType BIRTHDATE,
           com.ibm.www.maximo.MXStringType CALTYPE,
           com.ibm.www.maximo.MXStringType CITY,
           com.ibm.www.maximo.MXStringType COUNTRY,
           com.ibm.www.maximo.MXStringType COUNTY,
           com.ibm.www.maximo.MXStringType DELEGATE,
           com.ibm.www.maximo.MXDateTimeType DELEGATEFROMDATE,
           com.ibm.www.maximo.MXDateTimeType DELEGATETODATE,
           com.ibm.www.maximo.MXStringType DEPARTMENT,
           com.ibm.www.maximo.MXLongType DEVICECLASS,
           com.ibm.www.maximo.MXStringType DFLTAPP,
           com.ibm.www.maximo.MXStringType DISPLAYNAME,
           com.ibm.www.maximo.MXStringType DROPPOINT,
           com.ibm.www.maximo.MXStringType EMPLOYEETYPE,
           com.ibm.www.maximo.MXStringType EXTERNALREFID,
           com.ibm.www.maximo.MXStringType FIRSTNAME,
           com.ibm.www.maximo.MXDateTimeType HIREDATE,
           com.ibm.www.maximo.MXStringType IM_ID,
           com.ibm.www.maximo.MXStringType JOBCODE,
           com.ibm.www.maximo.MXStringType LANGUAGE,
           com.ibm.www.maximo.MXDateTimeType LASTEVALDATE,
           com.ibm.www.maximo.MXStringType LASTNAME,
           com.ibm.www.maximo.MXStringType LOCALE,
           com.ibm.www.maximo.MXStringType LOCATION,
           com.ibm.www.maximo.MXStringType LOCATIONORG,
           com.ibm.www.maximo.MXStringType LOCATIONSITE,
           com.ibm.www.maximo.MXBooleanType LOCTOSERVREQ,
           com.ibm.www.maximo.MXDateTimeType NEXTEVALDATE,
           com.ibm.www.maximo.MXStringType NP_STATUSMEMO,
           com.ibm.www.maximo.MXStringType OWNERGROUP,
           com.ibm.www.maximo.MXStringType OWNERSYSID,
           com.ibm.www.maximo.MXStringType PCARDEXPDATE,
           com.ibm.www.maximo.MXStringType PCARDNUM,
           com.ibm.www.maximo.MXStringType PCARDTYPE,
           com.ibm.www.maximo.MXStringType PCARDVERIFICATION,
           com.ibm.www.maximo.MXStringType PERSONID,
           com.ibm.www.maximo.MXLongType PERSONUID,
           com.ibm.www.maximo.MXStringType POSTALCODE,
           com.ibm.www.maximo.MXStringType PRIMARYEMAIL,
           com.ibm.www.maximo.MXStringType PRIMARYPHONE,
           com.ibm.www.maximo.MXStringType PRIMARYSMS,
           com.ibm.www.maximo.MXStringType REGIONDISTRICT,
           com.ibm.www.maximo.MXStringType SENDERSYSID,
           com.ibm.www.maximo.MXStringType SHIPTOADDRESS,
           com.ibm.www.maximo.MXStringType SOURCESYSID,
           com.ibm.www.maximo.MXStringType STATEPROVINCE,
           com.ibm.www.maximo.MXDomainType STATUS,
           com.ibm.www.maximo.MXDateTimeType STATUSDATE,
           com.ibm.www.maximo.MXBooleanType STATUSIFACE,
           com.ibm.www.maximo.MXStringType SUPERVISOR,
           com.ibm.www.maximo.MXDateTimeType TERMINATIONDATE,
           com.ibm.www.maximo.MXDomainType TIMEZONE,
           com.ibm.www.maximo.MXStringType TITLE,
           com.ibm.www.maximo.MXDomainType TRANSEMAILELECTION,
           com.ibm.www.maximo.MXLongType VIP,
           com.ibm.www.maximo.MXDomainType WFMAILELECTION,
           com.ibm.www.maximo.MXLongType WOPRIORITY,
           com.ibm.www.maximo.MXPERSON_PHONEType[] PHONE,
           com.ibm.www.maximo.MXPERSON_EMAILType[] EMAIL,
           com.ibm.www.maximo.MXPERSON_SMSType[] SMS,
           com.ibm.www.maximo.ProcessingActionType action,
           java.lang.String relationship,
           java.lang.String deleteForInsert,
           java.lang.String transLanguage) {
           this.MAXINTERRORMSG = MAXINTERRORMSG;
           this.ACCEPTINGWFMAIL = ACCEPTINGWFMAIL;
           this.ADDRESSLINE1 = ADDRESSLINE1;
           this.ADDRESSLINE2 = ADDRESSLINE2;
           this.ADDRESSLINE3 = ADDRESSLINE3;
           this.BILLTOADDRESS = BILLTOADDRESS;
           this.BIRTHDATE = BIRTHDATE;
           this.CALTYPE = CALTYPE;
           this.CITY = CITY;
           this.COUNTRY = COUNTRY;
           this.COUNTY = COUNTY;
           this.DELEGATE = DELEGATE;
           this.DELEGATEFROMDATE = DELEGATEFROMDATE;
           this.DELEGATETODATE = DELEGATETODATE;
           this.DEPARTMENT = DEPARTMENT;
           this.DEVICECLASS = DEVICECLASS;
           this.DFLTAPP = DFLTAPP;
           this.DISPLAYNAME = DISPLAYNAME;
           this.DROPPOINT = DROPPOINT;
           this.EMPLOYEETYPE = EMPLOYEETYPE;
           this.EXTERNALREFID = EXTERNALREFID;
           this.FIRSTNAME = FIRSTNAME;
           this.HIREDATE = HIREDATE;
           this.IM_ID = IM_ID;
           this.JOBCODE = JOBCODE;
           this.LANGUAGE = LANGUAGE;
           this.LASTEVALDATE = LASTEVALDATE;
           this.LASTNAME = LASTNAME;
           this.LOCALE = LOCALE;
           this.LOCATION = LOCATION;
           this.LOCATIONORG = LOCATIONORG;
           this.LOCATIONSITE = LOCATIONSITE;
           this.LOCTOSERVREQ = LOCTOSERVREQ;
           this.NEXTEVALDATE = NEXTEVALDATE;
           this.NP_STATUSMEMO = NP_STATUSMEMO;
           this.OWNERGROUP = OWNERGROUP;
           this.OWNERSYSID = OWNERSYSID;
           this.PCARDEXPDATE = PCARDEXPDATE;
           this.PCARDNUM = PCARDNUM;
           this.PCARDTYPE = PCARDTYPE;
           this.PCARDVERIFICATION = PCARDVERIFICATION;
           this.PERSONID = PERSONID;
           this.PERSONUID = PERSONUID;
           this.POSTALCODE = POSTALCODE;
           this.PRIMARYEMAIL = PRIMARYEMAIL;
           this.PRIMARYPHONE = PRIMARYPHONE;
           this.PRIMARYSMS = PRIMARYSMS;
           this.REGIONDISTRICT = REGIONDISTRICT;
           this.SENDERSYSID = SENDERSYSID;
           this.SHIPTOADDRESS = SHIPTOADDRESS;
           this.SOURCESYSID = SOURCESYSID;
           this.STATEPROVINCE = STATEPROVINCE;
           this.STATUS = STATUS;
           this.STATUSDATE = STATUSDATE;
           this.STATUSIFACE = STATUSIFACE;
           this.SUPERVISOR = SUPERVISOR;
           this.TERMINATIONDATE = TERMINATIONDATE;
           this.TIMEZONE = TIMEZONE;
           this.TITLE = TITLE;
           this.TRANSEMAILELECTION = TRANSEMAILELECTION;
           this.VIP = VIP;
           this.WFMAILELECTION = WFMAILELECTION;
           this.WOPRIORITY = WOPRIORITY;
           this.PHONE = PHONE;
           this.EMAIL = EMAIL;
           this.SMS = SMS;
           this.action = action;
           this.relationship = relationship;
           this.deleteForInsert = deleteForInsert;
           this.transLanguage = transLanguage;
    }


    /**
     * Gets the MAXINTERRORMSG value for this MXPERSON_PERSONType.
     * 
     * @return MAXINTERRORMSG
     */
    public java.lang.String getMAXINTERRORMSG() {
        return MAXINTERRORMSG;
    }


    /**
     * Sets the MAXINTERRORMSG value for this MXPERSON_PERSONType.
     * 
     * @param MAXINTERRORMSG
     */
    public void setMAXINTERRORMSG(java.lang.String MAXINTERRORMSG) {
        this.MAXINTERRORMSG = MAXINTERRORMSG;
    }


    /**
     * Gets the ACCEPTINGWFMAIL value for this MXPERSON_PERSONType.
     * 
     * @return ACCEPTINGWFMAIL
     */
    public com.ibm.www.maximo.MXBooleanType getACCEPTINGWFMAIL() {
        return ACCEPTINGWFMAIL;
    }


    /**
     * Sets the ACCEPTINGWFMAIL value for this MXPERSON_PERSONType.
     * 
     * @param ACCEPTINGWFMAIL
     */
    public void setACCEPTINGWFMAIL(com.ibm.www.maximo.MXBooleanType ACCEPTINGWFMAIL) {
        this.ACCEPTINGWFMAIL = ACCEPTINGWFMAIL;
    }


    /**
     * Gets the ADDRESSLINE1 value for this MXPERSON_PERSONType.
     * 
     * @return ADDRESSLINE1
     */
    public com.ibm.www.maximo.MXStringType getADDRESSLINE1() {
        return ADDRESSLINE1;
    }


    /**
     * Sets the ADDRESSLINE1 value for this MXPERSON_PERSONType.
     * 
     * @param ADDRESSLINE1
     */
    public void setADDRESSLINE1(com.ibm.www.maximo.MXStringType ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }


    /**
     * Gets the ADDRESSLINE2 value for this MXPERSON_PERSONType.
     * 
     * @return ADDRESSLINE2
     */
    public com.ibm.www.maximo.MXStringType getADDRESSLINE2() {
        return ADDRESSLINE2;
    }


    /**
     * Sets the ADDRESSLINE2 value for this MXPERSON_PERSONType.
     * 
     * @param ADDRESSLINE2
     */
    public void setADDRESSLINE2(com.ibm.www.maximo.MXStringType ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }


    /**
     * Gets the ADDRESSLINE3 value for this MXPERSON_PERSONType.
     * 
     * @return ADDRESSLINE3
     */
    public com.ibm.www.maximo.MXStringType getADDRESSLINE3() {
        return ADDRESSLINE3;
    }


    /**
     * Sets the ADDRESSLINE3 value for this MXPERSON_PERSONType.
     * 
     * @param ADDRESSLINE3
     */
    public void setADDRESSLINE3(com.ibm.www.maximo.MXStringType ADDRESSLINE3) {
        this.ADDRESSLINE3 = ADDRESSLINE3;
    }


    /**
     * Gets the BILLTOADDRESS value for this MXPERSON_PERSONType.
     * 
     * @return BILLTOADDRESS
     */
    public com.ibm.www.maximo.MXStringType getBILLTOADDRESS() {
        return BILLTOADDRESS;
    }


    /**
     * Sets the BILLTOADDRESS value for this MXPERSON_PERSONType.
     * 
     * @param BILLTOADDRESS
     */
    public void setBILLTOADDRESS(com.ibm.www.maximo.MXStringType BILLTOADDRESS) {
        this.BILLTOADDRESS = BILLTOADDRESS;
    }


    /**
     * Gets the BIRTHDATE value for this MXPERSON_PERSONType.
     * 
     * @return BIRTHDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getBIRTHDATE() {
        return BIRTHDATE;
    }


    /**
     * Sets the BIRTHDATE value for this MXPERSON_PERSONType.
     * 
     * @param BIRTHDATE
     */
    public void setBIRTHDATE(com.ibm.www.maximo.MXDateTimeType BIRTHDATE) {
        this.BIRTHDATE = BIRTHDATE;
    }


    /**
     * Gets the CALTYPE value for this MXPERSON_PERSONType.
     * 
     * @return CALTYPE
     */
    public com.ibm.www.maximo.MXStringType getCALTYPE() {
        return CALTYPE;
    }


    /**
     * Sets the CALTYPE value for this MXPERSON_PERSONType.
     * 
     * @param CALTYPE
     */
    public void setCALTYPE(com.ibm.www.maximo.MXStringType CALTYPE) {
        this.CALTYPE = CALTYPE;
    }


    /**
     * Gets the CITY value for this MXPERSON_PERSONType.
     * 
     * @return CITY
     */
    public com.ibm.www.maximo.MXStringType getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this MXPERSON_PERSONType.
     * 
     * @param CITY
     */
    public void setCITY(com.ibm.www.maximo.MXStringType CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the COUNTRY value for this MXPERSON_PERSONType.
     * 
     * @return COUNTRY
     */
    public com.ibm.www.maximo.MXStringType getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this MXPERSON_PERSONType.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(com.ibm.www.maximo.MXStringType COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the COUNTY value for this MXPERSON_PERSONType.
     * 
     * @return COUNTY
     */
    public com.ibm.www.maximo.MXStringType getCOUNTY() {
        return COUNTY;
    }


    /**
     * Sets the COUNTY value for this MXPERSON_PERSONType.
     * 
     * @param COUNTY
     */
    public void setCOUNTY(com.ibm.www.maximo.MXStringType COUNTY) {
        this.COUNTY = COUNTY;
    }


    /**
     * Gets the DELEGATE value for this MXPERSON_PERSONType.
     * 
     * @return DELEGATE
     */
    public com.ibm.www.maximo.MXStringType getDELEGATE() {
        return DELEGATE;
    }


    /**
     * Sets the DELEGATE value for this MXPERSON_PERSONType.
     * 
     * @param DELEGATE
     */
    public void setDELEGATE(com.ibm.www.maximo.MXStringType DELEGATE) {
        this.DELEGATE = DELEGATE;
    }


    /**
     * Gets the DELEGATEFROMDATE value for this MXPERSON_PERSONType.
     * 
     * @return DELEGATEFROMDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getDELEGATEFROMDATE() {
        return DELEGATEFROMDATE;
    }


    /**
     * Sets the DELEGATEFROMDATE value for this MXPERSON_PERSONType.
     * 
     * @param DELEGATEFROMDATE
     */
    public void setDELEGATEFROMDATE(com.ibm.www.maximo.MXDateTimeType DELEGATEFROMDATE) {
        this.DELEGATEFROMDATE = DELEGATEFROMDATE;
    }


    /**
     * Gets the DELEGATETODATE value for this MXPERSON_PERSONType.
     * 
     * @return DELEGATETODATE
     */
    public com.ibm.www.maximo.MXDateTimeType getDELEGATETODATE() {
        return DELEGATETODATE;
    }


    /**
     * Sets the DELEGATETODATE value for this MXPERSON_PERSONType.
     * 
     * @param DELEGATETODATE
     */
    public void setDELEGATETODATE(com.ibm.www.maximo.MXDateTimeType DELEGATETODATE) {
        this.DELEGATETODATE = DELEGATETODATE;
    }


    /**
     * Gets the DEPARTMENT value for this MXPERSON_PERSONType.
     * 
     * @return DEPARTMENT
     */
    public com.ibm.www.maximo.MXStringType getDEPARTMENT() {
        return DEPARTMENT;
    }


    /**
     * Sets the DEPARTMENT value for this MXPERSON_PERSONType.
     * 
     * @param DEPARTMENT
     */
    public void setDEPARTMENT(com.ibm.www.maximo.MXStringType DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }


    /**
     * Gets the DEVICECLASS value for this MXPERSON_PERSONType.
     * 
     * @return DEVICECLASS
     */
    public com.ibm.www.maximo.MXLongType getDEVICECLASS() {
        return DEVICECLASS;
    }


    /**
     * Sets the DEVICECLASS value for this MXPERSON_PERSONType.
     * 
     * @param DEVICECLASS
     */
    public void setDEVICECLASS(com.ibm.www.maximo.MXLongType DEVICECLASS) {
        this.DEVICECLASS = DEVICECLASS;
    }


    /**
     * Gets the DFLTAPP value for this MXPERSON_PERSONType.
     * 
     * @return DFLTAPP
     */
    public com.ibm.www.maximo.MXStringType getDFLTAPP() {
        return DFLTAPP;
    }


    /**
     * Sets the DFLTAPP value for this MXPERSON_PERSONType.
     * 
     * @param DFLTAPP
     */
    public void setDFLTAPP(com.ibm.www.maximo.MXStringType DFLTAPP) {
        this.DFLTAPP = DFLTAPP;
    }


    /**
     * Gets the DISPLAYNAME value for this MXPERSON_PERSONType.
     * 
     * @return DISPLAYNAME   * Multiple languages supported
     */
    public com.ibm.www.maximo.MXStringType getDISPLAYNAME() {
        return DISPLAYNAME;
    }


    /**
     * Sets the DISPLAYNAME value for this MXPERSON_PERSONType.
     * 
     * @param DISPLAYNAME   * Multiple languages supported
     */
    public void setDISPLAYNAME(com.ibm.www.maximo.MXStringType DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }


    /**
     * Gets the DROPPOINT value for this MXPERSON_PERSONType.
     * 
     * @return DROPPOINT
     */
    public com.ibm.www.maximo.MXStringType getDROPPOINT() {
        return DROPPOINT;
    }


    /**
     * Sets the DROPPOINT value for this MXPERSON_PERSONType.
     * 
     * @param DROPPOINT
     */
    public void setDROPPOINT(com.ibm.www.maximo.MXStringType DROPPOINT) {
        this.DROPPOINT = DROPPOINT;
    }


    /**
     * Gets the EMPLOYEETYPE value for this MXPERSON_PERSONType.
     * 
     * @return EMPLOYEETYPE
     */
    public com.ibm.www.maximo.MXStringType getEMPLOYEETYPE() {
        return EMPLOYEETYPE;
    }


    /**
     * Sets the EMPLOYEETYPE value for this MXPERSON_PERSONType.
     * 
     * @param EMPLOYEETYPE
     */
    public void setEMPLOYEETYPE(com.ibm.www.maximo.MXStringType EMPLOYEETYPE) {
        this.EMPLOYEETYPE = EMPLOYEETYPE;
    }


    /**
     * Gets the EXTERNALREFID value for this MXPERSON_PERSONType.
     * 
     * @return EXTERNALREFID
     */
    public com.ibm.www.maximo.MXStringType getEXTERNALREFID() {
        return EXTERNALREFID;
    }


    /**
     * Sets the EXTERNALREFID value for this MXPERSON_PERSONType.
     * 
     * @param EXTERNALREFID
     */
    public void setEXTERNALREFID(com.ibm.www.maximo.MXStringType EXTERNALREFID) {
        this.EXTERNALREFID = EXTERNALREFID;
    }


    /**
     * Gets the FIRSTNAME value for this MXPERSON_PERSONType.
     * 
     * @return FIRSTNAME
     */
    public com.ibm.www.maximo.MXStringType getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this MXPERSON_PERSONType.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(com.ibm.www.maximo.MXStringType FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }


    /**
     * Gets the HIREDATE value for this MXPERSON_PERSONType.
     * 
     * @return HIREDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getHIREDATE() {
        return HIREDATE;
    }


    /**
     * Sets the HIREDATE value for this MXPERSON_PERSONType.
     * 
     * @param HIREDATE
     */
    public void setHIREDATE(com.ibm.www.maximo.MXDateTimeType HIREDATE) {
        this.HIREDATE = HIREDATE;
    }


    /**
     * Gets the IM_ID value for this MXPERSON_PERSONType.
     * 
     * @return IM_ID
     */
    public com.ibm.www.maximo.MXStringType getIM_ID() {
        return IM_ID;
    }


    /**
     * Sets the IM_ID value for this MXPERSON_PERSONType.
     * 
     * @param IM_ID
     */
    public void setIM_ID(com.ibm.www.maximo.MXStringType IM_ID) {
        this.IM_ID = IM_ID;
    }


    /**
     * Gets the JOBCODE value for this MXPERSON_PERSONType.
     * 
     * @return JOBCODE
     */
    public com.ibm.www.maximo.MXStringType getJOBCODE() {
        return JOBCODE;
    }


    /**
     * Sets the JOBCODE value for this MXPERSON_PERSONType.
     * 
     * @param JOBCODE
     */
    public void setJOBCODE(com.ibm.www.maximo.MXStringType JOBCODE) {
        this.JOBCODE = JOBCODE;
    }


    /**
     * Gets the LANGUAGE value for this MXPERSON_PERSONType.
     * 
     * @return LANGUAGE
     */
    public com.ibm.www.maximo.MXStringType getLANGUAGE() {
        return LANGUAGE;
    }


    /**
     * Sets the LANGUAGE value for this MXPERSON_PERSONType.
     * 
     * @param LANGUAGE
     */
    public void setLANGUAGE(com.ibm.www.maximo.MXStringType LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }


    /**
     * Gets the LASTEVALDATE value for this MXPERSON_PERSONType.
     * 
     * @return LASTEVALDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getLASTEVALDATE() {
        return LASTEVALDATE;
    }


    /**
     * Sets the LASTEVALDATE value for this MXPERSON_PERSONType.
     * 
     * @param LASTEVALDATE
     */
    public void setLASTEVALDATE(com.ibm.www.maximo.MXDateTimeType LASTEVALDATE) {
        this.LASTEVALDATE = LASTEVALDATE;
    }


    /**
     * Gets the LASTNAME value for this MXPERSON_PERSONType.
     * 
     * @return LASTNAME
     */
    public com.ibm.www.maximo.MXStringType getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this MXPERSON_PERSONType.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(com.ibm.www.maximo.MXStringType LASTNAME) {
        this.LASTNAME = LASTNAME;
    }


    /**
     * Gets the LOCALE value for this MXPERSON_PERSONType.
     * 
     * @return LOCALE
     */
    public com.ibm.www.maximo.MXStringType getLOCALE() {
        return LOCALE;
    }


    /**
     * Sets the LOCALE value for this MXPERSON_PERSONType.
     * 
     * @param LOCALE
     */
    public void setLOCALE(com.ibm.www.maximo.MXStringType LOCALE) {
        this.LOCALE = LOCALE;
    }


    /**
     * Gets the LOCATION value for this MXPERSON_PERSONType.
     * 
     * @return LOCATION
     */
    public com.ibm.www.maximo.MXStringType getLOCATION() {
        return LOCATION;
    }


    /**
     * Sets the LOCATION value for this MXPERSON_PERSONType.
     * 
     * @param LOCATION
     */
    public void setLOCATION(com.ibm.www.maximo.MXStringType LOCATION) {
        this.LOCATION = LOCATION;
    }


    /**
     * Gets the LOCATIONORG value for this MXPERSON_PERSONType.
     * 
     * @return LOCATIONORG
     */
    public com.ibm.www.maximo.MXStringType getLOCATIONORG() {
        return LOCATIONORG;
    }


    /**
     * Sets the LOCATIONORG value for this MXPERSON_PERSONType.
     * 
     * @param LOCATIONORG
     */
    public void setLOCATIONORG(com.ibm.www.maximo.MXStringType LOCATIONORG) {
        this.LOCATIONORG = LOCATIONORG;
    }


    /**
     * Gets the LOCATIONSITE value for this MXPERSON_PERSONType.
     * 
     * @return LOCATIONSITE
     */
    public com.ibm.www.maximo.MXStringType getLOCATIONSITE() {
        return LOCATIONSITE;
    }


    /**
     * Sets the LOCATIONSITE value for this MXPERSON_PERSONType.
     * 
     * @param LOCATIONSITE
     */
    public void setLOCATIONSITE(com.ibm.www.maximo.MXStringType LOCATIONSITE) {
        this.LOCATIONSITE = LOCATIONSITE;
    }


    /**
     * Gets the LOCTOSERVREQ value for this MXPERSON_PERSONType.
     * 
     * @return LOCTOSERVREQ
     */
    public com.ibm.www.maximo.MXBooleanType getLOCTOSERVREQ() {
        return LOCTOSERVREQ;
    }


    /**
     * Sets the LOCTOSERVREQ value for this MXPERSON_PERSONType.
     * 
     * @param LOCTOSERVREQ
     */
    public void setLOCTOSERVREQ(com.ibm.www.maximo.MXBooleanType LOCTOSERVREQ) {
        this.LOCTOSERVREQ = LOCTOSERVREQ;
    }


    /**
     * Gets the NEXTEVALDATE value for this MXPERSON_PERSONType.
     * 
     * @return NEXTEVALDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getNEXTEVALDATE() {
        return NEXTEVALDATE;
    }


    /**
     * Sets the NEXTEVALDATE value for this MXPERSON_PERSONType.
     * 
     * @param NEXTEVALDATE
     */
    public void setNEXTEVALDATE(com.ibm.www.maximo.MXDateTimeType NEXTEVALDATE) {
        this.NEXTEVALDATE = NEXTEVALDATE;
    }


    /**
     * Gets the NP_STATUSMEMO value for this MXPERSON_PERSONType.
     * 
     * @return NP_STATUSMEMO
     */
    public com.ibm.www.maximo.MXStringType getNP_STATUSMEMO() {
        return NP_STATUSMEMO;
    }


    /**
     * Sets the NP_STATUSMEMO value for this MXPERSON_PERSONType.
     * 
     * @param NP_STATUSMEMO
     */
    public void setNP_STATUSMEMO(com.ibm.www.maximo.MXStringType NP_STATUSMEMO) {
        this.NP_STATUSMEMO = NP_STATUSMEMO;
    }


    /**
     * Gets the OWNERGROUP value for this MXPERSON_PERSONType.
     * 
     * @return OWNERGROUP
     */
    public com.ibm.www.maximo.MXStringType getOWNERGROUP() {
        return OWNERGROUP;
    }


    /**
     * Sets the OWNERGROUP value for this MXPERSON_PERSONType.
     * 
     * @param OWNERGROUP
     */
    public void setOWNERGROUP(com.ibm.www.maximo.MXStringType OWNERGROUP) {
        this.OWNERGROUP = OWNERGROUP;
    }


    /**
     * Gets the OWNERSYSID value for this MXPERSON_PERSONType.
     * 
     * @return OWNERSYSID
     */
    public com.ibm.www.maximo.MXStringType getOWNERSYSID() {
        return OWNERSYSID;
    }


    /**
     * Sets the OWNERSYSID value for this MXPERSON_PERSONType.
     * 
     * @param OWNERSYSID
     */
    public void setOWNERSYSID(com.ibm.www.maximo.MXStringType OWNERSYSID) {
        this.OWNERSYSID = OWNERSYSID;
    }


    /**
     * Gets the PCARDEXPDATE value for this MXPERSON_PERSONType.
     * 
     * @return PCARDEXPDATE
     */
    public com.ibm.www.maximo.MXStringType getPCARDEXPDATE() {
        return PCARDEXPDATE;
    }


    /**
     * Sets the PCARDEXPDATE value for this MXPERSON_PERSONType.
     * 
     * @param PCARDEXPDATE
     */
    public void setPCARDEXPDATE(com.ibm.www.maximo.MXStringType PCARDEXPDATE) {
        this.PCARDEXPDATE = PCARDEXPDATE;
    }


    /**
     * Gets the PCARDNUM value for this MXPERSON_PERSONType.
     * 
     * @return PCARDNUM
     */
    public com.ibm.www.maximo.MXStringType getPCARDNUM() {
        return PCARDNUM;
    }


    /**
     * Sets the PCARDNUM value for this MXPERSON_PERSONType.
     * 
     * @param PCARDNUM
     */
    public void setPCARDNUM(com.ibm.www.maximo.MXStringType PCARDNUM) {
        this.PCARDNUM = PCARDNUM;
    }


    /**
     * Gets the PCARDTYPE value for this MXPERSON_PERSONType.
     * 
     * @return PCARDTYPE
     */
    public com.ibm.www.maximo.MXStringType getPCARDTYPE() {
        return PCARDTYPE;
    }


    /**
     * Sets the PCARDTYPE value for this MXPERSON_PERSONType.
     * 
     * @param PCARDTYPE
     */
    public void setPCARDTYPE(com.ibm.www.maximo.MXStringType PCARDTYPE) {
        this.PCARDTYPE = PCARDTYPE;
    }


    /**
     * Gets the PCARDVERIFICATION value for this MXPERSON_PERSONType.
     * 
     * @return PCARDVERIFICATION
     */
    public com.ibm.www.maximo.MXStringType getPCARDVERIFICATION() {
        return PCARDVERIFICATION;
    }


    /**
     * Sets the PCARDVERIFICATION value for this MXPERSON_PERSONType.
     * 
     * @param PCARDVERIFICATION
     */
    public void setPCARDVERIFICATION(com.ibm.www.maximo.MXStringType PCARDVERIFICATION) {
        this.PCARDVERIFICATION = PCARDVERIFICATION;
    }


    /**
     * Gets the PERSONID value for this MXPERSON_PERSONType.
     * 
     * @return PERSONID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getPERSONID() {
        return PERSONID;
    }


    /**
     * Sets the PERSONID value for this MXPERSON_PERSONType.
     * 
     * @param PERSONID   * Unique Key Component
     */
    public void setPERSONID(com.ibm.www.maximo.MXStringType PERSONID) {
        this.PERSONID = PERSONID;
    }


    /**
     * Gets the PERSONUID value for this MXPERSON_PERSONType.
     * 
     * @return PERSONUID
     */
    public com.ibm.www.maximo.MXLongType getPERSONUID() {
        return PERSONUID;
    }


    /**
     * Sets the PERSONUID value for this MXPERSON_PERSONType.
     * 
     * @param PERSONUID
     */
    public void setPERSONUID(com.ibm.www.maximo.MXLongType PERSONUID) {
        this.PERSONUID = PERSONUID;
    }


    /**
     * Gets the POSTALCODE value for this MXPERSON_PERSONType.
     * 
     * @return POSTALCODE
     */
    public com.ibm.www.maximo.MXStringType getPOSTALCODE() {
        return POSTALCODE;
    }


    /**
     * Sets the POSTALCODE value for this MXPERSON_PERSONType.
     * 
     * @param POSTALCODE
     */
    public void setPOSTALCODE(com.ibm.www.maximo.MXStringType POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }


    /**
     * Gets the PRIMARYEMAIL value for this MXPERSON_PERSONType.
     * 
     * @return PRIMARYEMAIL
     */
    public com.ibm.www.maximo.MXStringType getPRIMARYEMAIL() {
        return PRIMARYEMAIL;
    }


    /**
     * Sets the PRIMARYEMAIL value for this MXPERSON_PERSONType.
     * 
     * @param PRIMARYEMAIL
     */
    public void setPRIMARYEMAIL(com.ibm.www.maximo.MXStringType PRIMARYEMAIL) {
        this.PRIMARYEMAIL = PRIMARYEMAIL;
    }


    /**
     * Gets the PRIMARYPHONE value for this MXPERSON_PERSONType.
     * 
     * @return PRIMARYPHONE
     */
    public com.ibm.www.maximo.MXStringType getPRIMARYPHONE() {
        return PRIMARYPHONE;
    }


    /**
     * Sets the PRIMARYPHONE value for this MXPERSON_PERSONType.
     * 
     * @param PRIMARYPHONE
     */
    public void setPRIMARYPHONE(com.ibm.www.maximo.MXStringType PRIMARYPHONE) {
        this.PRIMARYPHONE = PRIMARYPHONE;
    }


    /**
     * Gets the PRIMARYSMS value for this MXPERSON_PERSONType.
     * 
     * @return PRIMARYSMS
     */
    public com.ibm.www.maximo.MXStringType getPRIMARYSMS() {
        return PRIMARYSMS;
    }


    /**
     * Sets the PRIMARYSMS value for this MXPERSON_PERSONType.
     * 
     * @param PRIMARYSMS
     */
    public void setPRIMARYSMS(com.ibm.www.maximo.MXStringType PRIMARYSMS) {
        this.PRIMARYSMS = PRIMARYSMS;
    }


    /**
     * Gets the REGIONDISTRICT value for this MXPERSON_PERSONType.
     * 
     * @return REGIONDISTRICT
     */
    public com.ibm.www.maximo.MXStringType getREGIONDISTRICT() {
        return REGIONDISTRICT;
    }


    /**
     * Sets the REGIONDISTRICT value for this MXPERSON_PERSONType.
     * 
     * @param REGIONDISTRICT
     */
    public void setREGIONDISTRICT(com.ibm.www.maximo.MXStringType REGIONDISTRICT) {
        this.REGIONDISTRICT = REGIONDISTRICT;
    }


    /**
     * Gets the SENDERSYSID value for this MXPERSON_PERSONType.
     * 
     * @return SENDERSYSID
     */
    public com.ibm.www.maximo.MXStringType getSENDERSYSID() {
        return SENDERSYSID;
    }


    /**
     * Sets the SENDERSYSID value for this MXPERSON_PERSONType.
     * 
     * @param SENDERSYSID
     */
    public void setSENDERSYSID(com.ibm.www.maximo.MXStringType SENDERSYSID) {
        this.SENDERSYSID = SENDERSYSID;
    }


    /**
     * Gets the SHIPTOADDRESS value for this MXPERSON_PERSONType.
     * 
     * @return SHIPTOADDRESS
     */
    public com.ibm.www.maximo.MXStringType getSHIPTOADDRESS() {
        return SHIPTOADDRESS;
    }


    /**
     * Sets the SHIPTOADDRESS value for this MXPERSON_PERSONType.
     * 
     * @param SHIPTOADDRESS
     */
    public void setSHIPTOADDRESS(com.ibm.www.maximo.MXStringType SHIPTOADDRESS) {
        this.SHIPTOADDRESS = SHIPTOADDRESS;
    }


    /**
     * Gets the SOURCESYSID value for this MXPERSON_PERSONType.
     * 
     * @return SOURCESYSID
     */
    public com.ibm.www.maximo.MXStringType getSOURCESYSID() {
        return SOURCESYSID;
    }


    /**
     * Sets the SOURCESYSID value for this MXPERSON_PERSONType.
     * 
     * @param SOURCESYSID
     */
    public void setSOURCESYSID(com.ibm.www.maximo.MXStringType SOURCESYSID) {
        this.SOURCESYSID = SOURCESYSID;
    }


    /**
     * Gets the STATEPROVINCE value for this MXPERSON_PERSONType.
     * 
     * @return STATEPROVINCE
     */
    public com.ibm.www.maximo.MXStringType getSTATEPROVINCE() {
        return STATEPROVINCE;
    }


    /**
     * Sets the STATEPROVINCE value for this MXPERSON_PERSONType.
     * 
     * @param STATEPROVINCE
     */
    public void setSTATEPROVINCE(com.ibm.www.maximo.MXStringType STATEPROVINCE) {
        this.STATEPROVINCE = STATEPROVINCE;
    }


    /**
     * Gets the STATUS value for this MXPERSON_PERSONType.
     * 
     * @return STATUS
     */
    public com.ibm.www.maximo.MXDomainType getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this MXPERSON_PERSONType.
     * 
     * @param STATUS
     */
    public void setSTATUS(com.ibm.www.maximo.MXDomainType STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the STATUSDATE value for this MXPERSON_PERSONType.
     * 
     * @return STATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getSTATUSDATE() {
        return STATUSDATE;
    }


    /**
     * Sets the STATUSDATE value for this MXPERSON_PERSONType.
     * 
     * @param STATUSDATE
     */
    public void setSTATUSDATE(com.ibm.www.maximo.MXDateTimeType STATUSDATE) {
        this.STATUSDATE = STATUSDATE;
    }


    /**
     * Gets the STATUSIFACE value for this MXPERSON_PERSONType.
     * 
     * @return STATUSIFACE
     */
    public com.ibm.www.maximo.MXBooleanType getSTATUSIFACE() {
        return STATUSIFACE;
    }


    /**
     * Sets the STATUSIFACE value for this MXPERSON_PERSONType.
     * 
     * @param STATUSIFACE
     */
    public void setSTATUSIFACE(com.ibm.www.maximo.MXBooleanType STATUSIFACE) {
        this.STATUSIFACE = STATUSIFACE;
    }


    /**
     * Gets the SUPERVISOR value for this MXPERSON_PERSONType.
     * 
     * @return SUPERVISOR
     */
    public com.ibm.www.maximo.MXStringType getSUPERVISOR() {
        return SUPERVISOR;
    }


    /**
     * Sets the SUPERVISOR value for this MXPERSON_PERSONType.
     * 
     * @param SUPERVISOR
     */
    public void setSUPERVISOR(com.ibm.www.maximo.MXStringType SUPERVISOR) {
        this.SUPERVISOR = SUPERVISOR;
    }


    /**
     * Gets the TERMINATIONDATE value for this MXPERSON_PERSONType.
     * 
     * @return TERMINATIONDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getTERMINATIONDATE() {
        return TERMINATIONDATE;
    }


    /**
     * Sets the TERMINATIONDATE value for this MXPERSON_PERSONType.
     * 
     * @param TERMINATIONDATE
     */
    public void setTERMINATIONDATE(com.ibm.www.maximo.MXDateTimeType TERMINATIONDATE) {
        this.TERMINATIONDATE = TERMINATIONDATE;
    }


    /**
     * Gets the TIMEZONE value for this MXPERSON_PERSONType.
     * 
     * @return TIMEZONE
     */
    public com.ibm.www.maximo.MXDomainType getTIMEZONE() {
        return TIMEZONE;
    }


    /**
     * Sets the TIMEZONE value for this MXPERSON_PERSONType.
     * 
     * @param TIMEZONE
     */
    public void setTIMEZONE(com.ibm.www.maximo.MXDomainType TIMEZONE) {
        this.TIMEZONE = TIMEZONE;
    }


    /**
     * Gets the TITLE value for this MXPERSON_PERSONType.
     * 
     * @return TITLE   * Multiple languages supported
     */
    public com.ibm.www.maximo.MXStringType getTITLE() {
        return TITLE;
    }


    /**
     * Sets the TITLE value for this MXPERSON_PERSONType.
     * 
     * @param TITLE   * Multiple languages supported
     */
    public void setTITLE(com.ibm.www.maximo.MXStringType TITLE) {
        this.TITLE = TITLE;
    }


    /**
     * Gets the TRANSEMAILELECTION value for this MXPERSON_PERSONType.
     * 
     * @return TRANSEMAILELECTION
     */
    public com.ibm.www.maximo.MXDomainType getTRANSEMAILELECTION() {
        return TRANSEMAILELECTION;
    }


    /**
     * Sets the TRANSEMAILELECTION value for this MXPERSON_PERSONType.
     * 
     * @param TRANSEMAILELECTION
     */
    public void setTRANSEMAILELECTION(com.ibm.www.maximo.MXDomainType TRANSEMAILELECTION) {
        this.TRANSEMAILELECTION = TRANSEMAILELECTION;
    }


    /**
     * Gets the VIP value for this MXPERSON_PERSONType.
     * 
     * @return VIP
     */
    public com.ibm.www.maximo.MXLongType getVIP() {
        return VIP;
    }


    /**
     * Sets the VIP value for this MXPERSON_PERSONType.
     * 
     * @param VIP
     */
    public void setVIP(com.ibm.www.maximo.MXLongType VIP) {
        this.VIP = VIP;
    }


    /**
     * Gets the WFMAILELECTION value for this MXPERSON_PERSONType.
     * 
     * @return WFMAILELECTION
     */
    public com.ibm.www.maximo.MXDomainType getWFMAILELECTION() {
        return WFMAILELECTION;
    }


    /**
     * Sets the WFMAILELECTION value for this MXPERSON_PERSONType.
     * 
     * @param WFMAILELECTION
     */
    public void setWFMAILELECTION(com.ibm.www.maximo.MXDomainType WFMAILELECTION) {
        this.WFMAILELECTION = WFMAILELECTION;
    }


    /**
     * Gets the WOPRIORITY value for this MXPERSON_PERSONType.
     * 
     * @return WOPRIORITY
     */
    public com.ibm.www.maximo.MXLongType getWOPRIORITY() {
        return WOPRIORITY;
    }


    /**
     * Sets the WOPRIORITY value for this MXPERSON_PERSONType.
     * 
     * @param WOPRIORITY
     */
    public void setWOPRIORITY(com.ibm.www.maximo.MXLongType WOPRIORITY) {
        this.WOPRIORITY = WOPRIORITY;
    }


    /**
     * Gets the PHONE value for this MXPERSON_PERSONType.
     * 
     * @return PHONE
     */
    public com.ibm.www.maximo.MXPERSON_PHONEType[] getPHONE() {
        return PHONE;
    }


    /**
     * Sets the PHONE value for this MXPERSON_PERSONType.
     * 
     * @param PHONE
     */
    public void setPHONE(com.ibm.www.maximo.MXPERSON_PHONEType[] PHONE) {
        this.PHONE = PHONE;
    }

    public com.ibm.www.maximo.MXPERSON_PHONEType getPHONE(int i) {
        return this.PHONE[i];
    }

    public void setPHONE(int i, com.ibm.www.maximo.MXPERSON_PHONEType _value) {
        this.PHONE[i] = _value;
    }


    /**
     * Gets the EMAIL value for this MXPERSON_PERSONType.
     * 
     * @return EMAIL
     */
    public com.ibm.www.maximo.MXPERSON_EMAILType[] getEMAIL() {
        return EMAIL;
    }


    /**
     * Sets the EMAIL value for this MXPERSON_PERSONType.
     * 
     * @param EMAIL
     */
    public void setEMAIL(com.ibm.www.maximo.MXPERSON_EMAILType[] EMAIL) {
        this.EMAIL = EMAIL;
    }

    public com.ibm.www.maximo.MXPERSON_EMAILType getEMAIL(int i) {
        return this.EMAIL[i];
    }

    public void setEMAIL(int i, com.ibm.www.maximo.MXPERSON_EMAILType _value) {
        this.EMAIL[i] = _value;
    }


    /**
     * Gets the SMS value for this MXPERSON_PERSONType.
     * 
     * @return SMS
     */
    public com.ibm.www.maximo.MXPERSON_SMSType[] getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this MXPERSON_PERSONType.
     * 
     * @param SMS
     */
    public void setSMS(com.ibm.www.maximo.MXPERSON_SMSType[] SMS) {
        this.SMS = SMS;
    }

    public com.ibm.www.maximo.MXPERSON_SMSType getSMS(int i) {
        return this.SMS[i];
    }

    public void setSMS(int i, com.ibm.www.maximo.MXPERSON_SMSType _value) {
        this.SMS[i] = _value;
    }


    /**
     * Gets the action value for this MXPERSON_PERSONType.
     * 
     * @return action
     */
    public com.ibm.www.maximo.ProcessingActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this MXPERSON_PERSONType.
     * 
     * @param action
     */
    public void setAction(com.ibm.www.maximo.ProcessingActionType action) {
        this.action = action;
    }


    /**
     * Gets the relationship value for this MXPERSON_PERSONType.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this MXPERSON_PERSONType.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the deleteForInsert value for this MXPERSON_PERSONType.
     * 
     * @return deleteForInsert
     */
    public java.lang.String getDeleteForInsert() {
        return deleteForInsert;
    }


    /**
     * Sets the deleteForInsert value for this MXPERSON_PERSONType.
     * 
     * @param deleteForInsert
     */
    public void setDeleteForInsert(java.lang.String deleteForInsert) {
        this.deleteForInsert = deleteForInsert;
    }


    /**
     * Gets the transLanguage value for this MXPERSON_PERSONType.
     * 
     * @return transLanguage
     */
    public java.lang.String getTransLanguage() {
        return transLanguage;
    }


    /**
     * Sets the transLanguage value for this MXPERSON_PERSONType.
     * 
     * @param transLanguage
     */
    public void setTransLanguage(java.lang.String transLanguage) {
        this.transLanguage = transLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSON_PERSONType)) return false;
        MXPERSON_PERSONType other = (MXPERSON_PERSONType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MAXINTERRORMSG==null && other.getMAXINTERRORMSG()==null) || 
             (this.MAXINTERRORMSG!=null &&
              this.MAXINTERRORMSG.equals(other.getMAXINTERRORMSG()))) &&
            ((this.ACCEPTINGWFMAIL==null && other.getACCEPTINGWFMAIL()==null) || 
             (this.ACCEPTINGWFMAIL!=null &&
              this.ACCEPTINGWFMAIL.equals(other.getACCEPTINGWFMAIL()))) &&
            ((this.ADDRESSLINE1==null && other.getADDRESSLINE1()==null) || 
             (this.ADDRESSLINE1!=null &&
              this.ADDRESSLINE1.equals(other.getADDRESSLINE1()))) &&
            ((this.ADDRESSLINE2==null && other.getADDRESSLINE2()==null) || 
             (this.ADDRESSLINE2!=null &&
              this.ADDRESSLINE2.equals(other.getADDRESSLINE2()))) &&
            ((this.ADDRESSLINE3==null && other.getADDRESSLINE3()==null) || 
             (this.ADDRESSLINE3!=null &&
              this.ADDRESSLINE3.equals(other.getADDRESSLINE3()))) &&
            ((this.BILLTOADDRESS==null && other.getBILLTOADDRESS()==null) || 
             (this.BILLTOADDRESS!=null &&
              this.BILLTOADDRESS.equals(other.getBILLTOADDRESS()))) &&
            ((this.BIRTHDATE==null && other.getBIRTHDATE()==null) || 
             (this.BIRTHDATE!=null &&
              this.BIRTHDATE.equals(other.getBIRTHDATE()))) &&
            ((this.CALTYPE==null && other.getCALTYPE()==null) || 
             (this.CALTYPE!=null &&
              this.CALTYPE.equals(other.getCALTYPE()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              this.COUNTRY.equals(other.getCOUNTRY()))) &&
            ((this.COUNTY==null && other.getCOUNTY()==null) || 
             (this.COUNTY!=null &&
              this.COUNTY.equals(other.getCOUNTY()))) &&
            ((this.DELEGATE==null && other.getDELEGATE()==null) || 
             (this.DELEGATE!=null &&
              this.DELEGATE.equals(other.getDELEGATE()))) &&
            ((this.DELEGATEFROMDATE==null && other.getDELEGATEFROMDATE()==null) || 
             (this.DELEGATEFROMDATE!=null &&
              this.DELEGATEFROMDATE.equals(other.getDELEGATEFROMDATE()))) &&
            ((this.DELEGATETODATE==null && other.getDELEGATETODATE()==null) || 
             (this.DELEGATETODATE!=null &&
              this.DELEGATETODATE.equals(other.getDELEGATETODATE()))) &&
            ((this.DEPARTMENT==null && other.getDEPARTMENT()==null) || 
             (this.DEPARTMENT!=null &&
              this.DEPARTMENT.equals(other.getDEPARTMENT()))) &&
            ((this.DEVICECLASS==null && other.getDEVICECLASS()==null) || 
             (this.DEVICECLASS!=null &&
              this.DEVICECLASS.equals(other.getDEVICECLASS()))) &&
            ((this.DFLTAPP==null && other.getDFLTAPP()==null) || 
             (this.DFLTAPP!=null &&
              this.DFLTAPP.equals(other.getDFLTAPP()))) &&
            ((this.DISPLAYNAME==null && other.getDISPLAYNAME()==null) || 
             (this.DISPLAYNAME!=null &&
              this.DISPLAYNAME.equals(other.getDISPLAYNAME()))) &&
            ((this.DROPPOINT==null && other.getDROPPOINT()==null) || 
             (this.DROPPOINT!=null &&
              this.DROPPOINT.equals(other.getDROPPOINT()))) &&
            ((this.EMPLOYEETYPE==null && other.getEMPLOYEETYPE()==null) || 
             (this.EMPLOYEETYPE!=null &&
              this.EMPLOYEETYPE.equals(other.getEMPLOYEETYPE()))) &&
            ((this.EXTERNALREFID==null && other.getEXTERNALREFID()==null) || 
             (this.EXTERNALREFID!=null &&
              this.EXTERNALREFID.equals(other.getEXTERNALREFID()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              this.FIRSTNAME.equals(other.getFIRSTNAME()))) &&
            ((this.HIREDATE==null && other.getHIREDATE()==null) || 
             (this.HIREDATE!=null &&
              this.HIREDATE.equals(other.getHIREDATE()))) &&
            ((this.IM_ID==null && other.getIM_ID()==null) || 
             (this.IM_ID!=null &&
              this.IM_ID.equals(other.getIM_ID()))) &&
            ((this.JOBCODE==null && other.getJOBCODE()==null) || 
             (this.JOBCODE!=null &&
              this.JOBCODE.equals(other.getJOBCODE()))) &&
            ((this.LANGUAGE==null && other.getLANGUAGE()==null) || 
             (this.LANGUAGE!=null &&
              this.LANGUAGE.equals(other.getLANGUAGE()))) &&
            ((this.LASTEVALDATE==null && other.getLASTEVALDATE()==null) || 
             (this.LASTEVALDATE!=null &&
              this.LASTEVALDATE.equals(other.getLASTEVALDATE()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              this.LASTNAME.equals(other.getLASTNAME()))) &&
            ((this.LOCALE==null && other.getLOCALE()==null) || 
             (this.LOCALE!=null &&
              this.LOCALE.equals(other.getLOCALE()))) &&
            ((this.LOCATION==null && other.getLOCATION()==null) || 
             (this.LOCATION!=null &&
              this.LOCATION.equals(other.getLOCATION()))) &&
            ((this.LOCATIONORG==null && other.getLOCATIONORG()==null) || 
             (this.LOCATIONORG!=null &&
              this.LOCATIONORG.equals(other.getLOCATIONORG()))) &&
            ((this.LOCATIONSITE==null && other.getLOCATIONSITE()==null) || 
             (this.LOCATIONSITE!=null &&
              this.LOCATIONSITE.equals(other.getLOCATIONSITE()))) &&
            ((this.LOCTOSERVREQ==null && other.getLOCTOSERVREQ()==null) || 
             (this.LOCTOSERVREQ!=null &&
              this.LOCTOSERVREQ.equals(other.getLOCTOSERVREQ()))) &&
            ((this.NEXTEVALDATE==null && other.getNEXTEVALDATE()==null) || 
             (this.NEXTEVALDATE!=null &&
              this.NEXTEVALDATE.equals(other.getNEXTEVALDATE()))) &&
            ((this.NP_STATUSMEMO==null && other.getNP_STATUSMEMO()==null) || 
             (this.NP_STATUSMEMO!=null &&
              this.NP_STATUSMEMO.equals(other.getNP_STATUSMEMO()))) &&
            ((this.OWNERGROUP==null && other.getOWNERGROUP()==null) || 
             (this.OWNERGROUP!=null &&
              this.OWNERGROUP.equals(other.getOWNERGROUP()))) &&
            ((this.OWNERSYSID==null && other.getOWNERSYSID()==null) || 
             (this.OWNERSYSID!=null &&
              this.OWNERSYSID.equals(other.getOWNERSYSID()))) &&
            ((this.PCARDEXPDATE==null && other.getPCARDEXPDATE()==null) || 
             (this.PCARDEXPDATE!=null &&
              this.PCARDEXPDATE.equals(other.getPCARDEXPDATE()))) &&
            ((this.PCARDNUM==null && other.getPCARDNUM()==null) || 
             (this.PCARDNUM!=null &&
              this.PCARDNUM.equals(other.getPCARDNUM()))) &&
            ((this.PCARDTYPE==null && other.getPCARDTYPE()==null) || 
             (this.PCARDTYPE!=null &&
              this.PCARDTYPE.equals(other.getPCARDTYPE()))) &&
            ((this.PCARDVERIFICATION==null && other.getPCARDVERIFICATION()==null) || 
             (this.PCARDVERIFICATION!=null &&
              this.PCARDVERIFICATION.equals(other.getPCARDVERIFICATION()))) &&
            ((this.PERSONID==null && other.getPERSONID()==null) || 
             (this.PERSONID!=null &&
              this.PERSONID.equals(other.getPERSONID()))) &&
            ((this.PERSONUID==null && other.getPERSONUID()==null) || 
             (this.PERSONUID!=null &&
              this.PERSONUID.equals(other.getPERSONUID()))) &&
            ((this.POSTALCODE==null && other.getPOSTALCODE()==null) || 
             (this.POSTALCODE!=null &&
              this.POSTALCODE.equals(other.getPOSTALCODE()))) &&
            ((this.PRIMARYEMAIL==null && other.getPRIMARYEMAIL()==null) || 
             (this.PRIMARYEMAIL!=null &&
              this.PRIMARYEMAIL.equals(other.getPRIMARYEMAIL()))) &&
            ((this.PRIMARYPHONE==null && other.getPRIMARYPHONE()==null) || 
             (this.PRIMARYPHONE!=null &&
              this.PRIMARYPHONE.equals(other.getPRIMARYPHONE()))) &&
            ((this.PRIMARYSMS==null && other.getPRIMARYSMS()==null) || 
             (this.PRIMARYSMS!=null &&
              this.PRIMARYSMS.equals(other.getPRIMARYSMS()))) &&
            ((this.REGIONDISTRICT==null && other.getREGIONDISTRICT()==null) || 
             (this.REGIONDISTRICT!=null &&
              this.REGIONDISTRICT.equals(other.getREGIONDISTRICT()))) &&
            ((this.SENDERSYSID==null && other.getSENDERSYSID()==null) || 
             (this.SENDERSYSID!=null &&
              this.SENDERSYSID.equals(other.getSENDERSYSID()))) &&
            ((this.SHIPTOADDRESS==null && other.getSHIPTOADDRESS()==null) || 
             (this.SHIPTOADDRESS!=null &&
              this.SHIPTOADDRESS.equals(other.getSHIPTOADDRESS()))) &&
            ((this.SOURCESYSID==null && other.getSOURCESYSID()==null) || 
             (this.SOURCESYSID!=null &&
              this.SOURCESYSID.equals(other.getSOURCESYSID()))) &&
            ((this.STATEPROVINCE==null && other.getSTATEPROVINCE()==null) || 
             (this.STATEPROVINCE!=null &&
              this.STATEPROVINCE.equals(other.getSTATEPROVINCE()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.STATUSDATE==null && other.getSTATUSDATE()==null) || 
             (this.STATUSDATE!=null &&
              this.STATUSDATE.equals(other.getSTATUSDATE()))) &&
            ((this.STATUSIFACE==null && other.getSTATUSIFACE()==null) || 
             (this.STATUSIFACE!=null &&
              this.STATUSIFACE.equals(other.getSTATUSIFACE()))) &&
            ((this.SUPERVISOR==null && other.getSUPERVISOR()==null) || 
             (this.SUPERVISOR!=null &&
              this.SUPERVISOR.equals(other.getSUPERVISOR()))) &&
            ((this.TERMINATIONDATE==null && other.getTERMINATIONDATE()==null) || 
             (this.TERMINATIONDATE!=null &&
              this.TERMINATIONDATE.equals(other.getTERMINATIONDATE()))) &&
            ((this.TIMEZONE==null && other.getTIMEZONE()==null) || 
             (this.TIMEZONE!=null &&
              this.TIMEZONE.equals(other.getTIMEZONE()))) &&
            ((this.TITLE==null && other.getTITLE()==null) || 
             (this.TITLE!=null &&
              this.TITLE.equals(other.getTITLE()))) &&
            ((this.TRANSEMAILELECTION==null && other.getTRANSEMAILELECTION()==null) || 
             (this.TRANSEMAILELECTION!=null &&
              this.TRANSEMAILELECTION.equals(other.getTRANSEMAILELECTION()))) &&
            ((this.VIP==null && other.getVIP()==null) || 
             (this.VIP!=null &&
              this.VIP.equals(other.getVIP()))) &&
            ((this.WFMAILELECTION==null && other.getWFMAILELECTION()==null) || 
             (this.WFMAILELECTION!=null &&
              this.WFMAILELECTION.equals(other.getWFMAILELECTION()))) &&
            ((this.WOPRIORITY==null && other.getWOPRIORITY()==null) || 
             (this.WOPRIORITY!=null &&
              this.WOPRIORITY.equals(other.getWOPRIORITY()))) &&
            ((this.PHONE==null && other.getPHONE()==null) || 
             (this.PHONE!=null &&
              java.util.Arrays.equals(this.PHONE, other.getPHONE()))) &&
            ((this.EMAIL==null && other.getEMAIL()==null) || 
             (this.EMAIL!=null &&
              java.util.Arrays.equals(this.EMAIL, other.getEMAIL()))) &&
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              java.util.Arrays.equals(this.SMS, other.getSMS()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship()))) &&
            ((this.deleteForInsert==null && other.getDeleteForInsert()==null) || 
             (this.deleteForInsert!=null &&
              this.deleteForInsert.equals(other.getDeleteForInsert()))) &&
            ((this.transLanguage==null && other.getTransLanguage()==null) || 
             (this.transLanguage!=null &&
              this.transLanguage.equals(other.getTransLanguage())));
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
        if (getMAXINTERRORMSG() != null) {
            _hashCode += getMAXINTERRORMSG().hashCode();
        }
        if (getACCEPTINGWFMAIL() != null) {
            _hashCode += getACCEPTINGWFMAIL().hashCode();
        }
        if (getADDRESSLINE1() != null) {
            _hashCode += getADDRESSLINE1().hashCode();
        }
        if (getADDRESSLINE2() != null) {
            _hashCode += getADDRESSLINE2().hashCode();
        }
        if (getADDRESSLINE3() != null) {
            _hashCode += getADDRESSLINE3().hashCode();
        }
        if (getBILLTOADDRESS() != null) {
            _hashCode += getBILLTOADDRESS().hashCode();
        }
        if (getBIRTHDATE() != null) {
            _hashCode += getBIRTHDATE().hashCode();
        }
        if (getCALTYPE() != null) {
            _hashCode += getCALTYPE().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
        }
        if (getCOUNTRY() != null) {
            _hashCode += getCOUNTRY().hashCode();
        }
        if (getCOUNTY() != null) {
            _hashCode += getCOUNTY().hashCode();
        }
        if (getDELEGATE() != null) {
            _hashCode += getDELEGATE().hashCode();
        }
        if (getDELEGATEFROMDATE() != null) {
            _hashCode += getDELEGATEFROMDATE().hashCode();
        }
        if (getDELEGATETODATE() != null) {
            _hashCode += getDELEGATETODATE().hashCode();
        }
        if (getDEPARTMENT() != null) {
            _hashCode += getDEPARTMENT().hashCode();
        }
        if (getDEVICECLASS() != null) {
            _hashCode += getDEVICECLASS().hashCode();
        }
        if (getDFLTAPP() != null) {
            _hashCode += getDFLTAPP().hashCode();
        }
        if (getDISPLAYNAME() != null) {
            _hashCode += getDISPLAYNAME().hashCode();
        }
        if (getDROPPOINT() != null) {
            _hashCode += getDROPPOINT().hashCode();
        }
        if (getEMPLOYEETYPE() != null) {
            _hashCode += getEMPLOYEETYPE().hashCode();
        }
        if (getEXTERNALREFID() != null) {
            _hashCode += getEXTERNALREFID().hashCode();
        }
        if (getFIRSTNAME() != null) {
            _hashCode += getFIRSTNAME().hashCode();
        }
        if (getHIREDATE() != null) {
            _hashCode += getHIREDATE().hashCode();
        }
        if (getIM_ID() != null) {
            _hashCode += getIM_ID().hashCode();
        }
        if (getJOBCODE() != null) {
            _hashCode += getJOBCODE().hashCode();
        }
        if (getLANGUAGE() != null) {
            _hashCode += getLANGUAGE().hashCode();
        }
        if (getLASTEVALDATE() != null) {
            _hashCode += getLASTEVALDATE().hashCode();
        }
        if (getLASTNAME() != null) {
            _hashCode += getLASTNAME().hashCode();
        }
        if (getLOCALE() != null) {
            _hashCode += getLOCALE().hashCode();
        }
        if (getLOCATION() != null) {
            _hashCode += getLOCATION().hashCode();
        }
        if (getLOCATIONORG() != null) {
            _hashCode += getLOCATIONORG().hashCode();
        }
        if (getLOCATIONSITE() != null) {
            _hashCode += getLOCATIONSITE().hashCode();
        }
        if (getLOCTOSERVREQ() != null) {
            _hashCode += getLOCTOSERVREQ().hashCode();
        }
        if (getNEXTEVALDATE() != null) {
            _hashCode += getNEXTEVALDATE().hashCode();
        }
        if (getNP_STATUSMEMO() != null) {
            _hashCode += getNP_STATUSMEMO().hashCode();
        }
        if (getOWNERGROUP() != null) {
            _hashCode += getOWNERGROUP().hashCode();
        }
        if (getOWNERSYSID() != null) {
            _hashCode += getOWNERSYSID().hashCode();
        }
        if (getPCARDEXPDATE() != null) {
            _hashCode += getPCARDEXPDATE().hashCode();
        }
        if (getPCARDNUM() != null) {
            _hashCode += getPCARDNUM().hashCode();
        }
        if (getPCARDTYPE() != null) {
            _hashCode += getPCARDTYPE().hashCode();
        }
        if (getPCARDVERIFICATION() != null) {
            _hashCode += getPCARDVERIFICATION().hashCode();
        }
        if (getPERSONID() != null) {
            _hashCode += getPERSONID().hashCode();
        }
        if (getPERSONUID() != null) {
            _hashCode += getPERSONUID().hashCode();
        }
        if (getPOSTALCODE() != null) {
            _hashCode += getPOSTALCODE().hashCode();
        }
        if (getPRIMARYEMAIL() != null) {
            _hashCode += getPRIMARYEMAIL().hashCode();
        }
        if (getPRIMARYPHONE() != null) {
            _hashCode += getPRIMARYPHONE().hashCode();
        }
        if (getPRIMARYSMS() != null) {
            _hashCode += getPRIMARYSMS().hashCode();
        }
        if (getREGIONDISTRICT() != null) {
            _hashCode += getREGIONDISTRICT().hashCode();
        }
        if (getSENDERSYSID() != null) {
            _hashCode += getSENDERSYSID().hashCode();
        }
        if (getSHIPTOADDRESS() != null) {
            _hashCode += getSHIPTOADDRESS().hashCode();
        }
        if (getSOURCESYSID() != null) {
            _hashCode += getSOURCESYSID().hashCode();
        }
        if (getSTATEPROVINCE() != null) {
            _hashCode += getSTATEPROVINCE().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getSTATUSDATE() != null) {
            _hashCode += getSTATUSDATE().hashCode();
        }
        if (getSTATUSIFACE() != null) {
            _hashCode += getSTATUSIFACE().hashCode();
        }
        if (getSUPERVISOR() != null) {
            _hashCode += getSUPERVISOR().hashCode();
        }
        if (getTERMINATIONDATE() != null) {
            _hashCode += getTERMINATIONDATE().hashCode();
        }
        if (getTIMEZONE() != null) {
            _hashCode += getTIMEZONE().hashCode();
        }
        if (getTITLE() != null) {
            _hashCode += getTITLE().hashCode();
        }
        if (getTRANSEMAILELECTION() != null) {
            _hashCode += getTRANSEMAILELECTION().hashCode();
        }
        if (getVIP() != null) {
            _hashCode += getVIP().hashCode();
        }
        if (getWFMAILELECTION() != null) {
            _hashCode += getWFMAILELECTION().hashCode();
        }
        if (getWOPRIORITY() != null) {
            _hashCode += getWOPRIORITY().hashCode();
        }
        if (getPHONE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPHONE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPHONE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEMAIL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMAIL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMAIL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTransLanguage() != null) {
            _hashCode += getTransLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXPERSON_PERSONType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PERSONType"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transLanguage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transLanguage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAXINTERRORMSG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MAXINTERRORMSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCEPTINGWFMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACCEPTINGWFMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILLTOADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BILLTOADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIRTHDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BIRTHDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COUNTRY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COUNTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATEFROMDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATEFROMDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATETODATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATETODATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPARTMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DEPARTMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEVICECLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DEVICECLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFLTAPP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DFLTAPP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISPLAYNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DISPLAYNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DROPPOINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DROPPOINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMPLOYEETYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMPLOYEETYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTERNALREFID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EXTERNALREFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRSTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FIRSTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HIREDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HIREDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IM_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IM_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JOBCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JOBCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LANGUAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LANGUAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTEVALDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTEVALDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCALE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCALE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATIONORG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATIONORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATIONSITE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATIONSITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCTOSERVREQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCTOSERVREQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEXTEVALDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NEXTEVALDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NP_STATUSMEMO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NP_STATUSMEMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNERGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNERGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNERSYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNERSYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDEXPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDEXPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDVERIFICATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDVERIFICATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSTALCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "POSTALCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRIMARYEMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PRIMARYEMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRIMARYPHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PRIMARYPHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRIMARYSMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PRIMARYSMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIONDISTRICT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REGIONDISTRICT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDERSYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SENDERSYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHIPTOADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SHIPTOADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOURCESYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SOURCESYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATEPROVINCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATEPROVINCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUSDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATUSDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUSIFACE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATUSIFACE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPERVISOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SUPERVISOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINATIONDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TERMINATIONDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIMEZONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TIMEZONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSEMAILELECTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TRANSEMAILELECTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WFMAILELECTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WFMAILELECTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PHONEType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_EMAILType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_SMSType"));
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
