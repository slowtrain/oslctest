/**
 * MXPERSONQueryTypePERSON.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXPERSONQueryTypePERSON  implements java.io.Serializable {
    private com.ibm.www.maximo.MXBooleanQueryType[] ACCEPTINGWFMAIL;

    private com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE1;

    private com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE2;

    private com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE3;

    private com.ibm.www.maximo.MXStringQueryType[] BILLTOADDRESS;

    private com.ibm.www.maximo.MXDateTimeQueryType[] BIRTHDATE;

    private com.ibm.www.maximo.MXStringQueryType[] CALTYPE;

    private com.ibm.www.maximo.MXStringQueryType[] CITY;

    private com.ibm.www.maximo.MXStringQueryType[] COUNTRY;

    private com.ibm.www.maximo.MXStringQueryType[] COUNTY;

    private com.ibm.www.maximo.MXStringQueryType[] DELEGATE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATEFROMDATE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATETODATE;

    private com.ibm.www.maximo.MXStringQueryType[] DEPARTMENT;

    private com.ibm.www.maximo.MXLongQueryType[] DEVICECLASS;

    private com.ibm.www.maximo.MXStringQueryType[] DFLTAPP;

    /* Multiple languages supported */
    private com.ibm.www.maximo.MXStringQueryType[] DISPLAYNAME;

    private com.ibm.www.maximo.MXStringQueryType[] DROPPOINT;

    private com.ibm.www.maximo.MXStringQueryType[] EMPLOYEETYPE;

    private com.ibm.www.maximo.MXStringQueryType[] EXTERNALREFID;

    private com.ibm.www.maximo.MXStringQueryType[] FIRSTNAME;

    private com.ibm.www.maximo.MXDateTimeQueryType[] HIREDATE;

    private com.ibm.www.maximo.MXStringQueryType[] IM_ID;

    private com.ibm.www.maximo.MXStringQueryType[] JOBCODE;

    private com.ibm.www.maximo.MXStringQueryType[] LANGUAGE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] LASTEVALDATE;

    private com.ibm.www.maximo.MXStringQueryType[] LASTNAME;

    private com.ibm.www.maximo.MXStringQueryType[] LOCALE;

    private com.ibm.www.maximo.MXStringQueryType[] LOCATION;

    private com.ibm.www.maximo.MXStringQueryType[] LOCATIONORG;

    private com.ibm.www.maximo.MXStringQueryType[] LOCATIONSITE;

    private com.ibm.www.maximo.MXBooleanQueryType[] LOCTOSERVREQ;

    private com.ibm.www.maximo.MXDateTimeQueryType[] NEXTEVALDATE;

    private com.ibm.www.maximo.MXStringQueryType[] OWNERGROUP;

    private com.ibm.www.maximo.MXStringQueryType[] OWNERSYSID;

    private com.ibm.www.maximo.MXStringQueryType[] PCARDEXPDATE;

    private com.ibm.www.maximo.MXStringQueryType[] PCARDNUM;

    private com.ibm.www.maximo.MXStringQueryType[] PCARDTYPE;

    private com.ibm.www.maximo.MXStringQueryType[] PCARDVERIFICATION;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] PERSONID;

    private com.ibm.www.maximo.MXLongQueryType[] PERSONUID;

    private com.ibm.www.maximo.MXStringQueryType[] POSTALCODE;

    private com.ibm.www.maximo.MXStringQueryType[] PRIMARYSMS;

    private com.ibm.www.maximo.MXStringQueryType[] REGIONDISTRICT;

    private com.ibm.www.maximo.MXStringQueryType[] SENDERSYSID;

    private com.ibm.www.maximo.MXStringQueryType[] SHIPTOADDRESS;

    private com.ibm.www.maximo.MXStringQueryType[] SOURCESYSID;

    private com.ibm.www.maximo.MXStringQueryType[] STATEPROVINCE;

    private com.ibm.www.maximo.MXDomainQueryType[] STATUS;

    private com.ibm.www.maximo.MXDateTimeQueryType[] STATUSDATE;

    private com.ibm.www.maximo.MXStringQueryType[] SUPERVISOR;

    private com.ibm.www.maximo.MXDateTimeQueryType[] TERMINATIONDATE;

    private com.ibm.www.maximo.MXDomainQueryType[] TIMEZONE;

    /* Multiple languages supported */
    private com.ibm.www.maximo.MXStringQueryType[] TITLE;

    private com.ibm.www.maximo.MXDomainQueryType[] TRANSEMAILELECTION;

    private com.ibm.www.maximo.MXLongQueryType[] VIP;

    private com.ibm.www.maximo.MXDomainQueryType[] WFMAILELECTION;

    private com.ibm.www.maximo.MXLongQueryType[] WOPRIORITY;

    private com.ibm.www.maximo.MXPERSONQueryTypePERSONPHONE PHONE;

    private com.ibm.www.maximo.MXPERSONQueryTypePERSONEMAIL EMAIL;

    private com.ibm.www.maximo.MXPERSONQueryTypePERSONSMS SMS;

    public MXPERSONQueryTypePERSON() {
    }

    public MXPERSONQueryTypePERSON(
           com.ibm.www.maximo.MXBooleanQueryType[] ACCEPTINGWFMAIL,
           com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE1,
           com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE2,
           com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE3,
           com.ibm.www.maximo.MXStringQueryType[] BILLTOADDRESS,
           com.ibm.www.maximo.MXDateTimeQueryType[] BIRTHDATE,
           com.ibm.www.maximo.MXStringQueryType[] CALTYPE,
           com.ibm.www.maximo.MXStringQueryType[] CITY,
           com.ibm.www.maximo.MXStringQueryType[] COUNTRY,
           com.ibm.www.maximo.MXStringQueryType[] COUNTY,
           com.ibm.www.maximo.MXStringQueryType[] DELEGATE,
           com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATEFROMDATE,
           com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATETODATE,
           com.ibm.www.maximo.MXStringQueryType[] DEPARTMENT,
           com.ibm.www.maximo.MXLongQueryType[] DEVICECLASS,
           com.ibm.www.maximo.MXStringQueryType[] DFLTAPP,
           com.ibm.www.maximo.MXStringQueryType[] DISPLAYNAME,
           com.ibm.www.maximo.MXStringQueryType[] DROPPOINT,
           com.ibm.www.maximo.MXStringQueryType[] EMPLOYEETYPE,
           com.ibm.www.maximo.MXStringQueryType[] EXTERNALREFID,
           com.ibm.www.maximo.MXStringQueryType[] FIRSTNAME,
           com.ibm.www.maximo.MXDateTimeQueryType[] HIREDATE,
           com.ibm.www.maximo.MXStringQueryType[] IM_ID,
           com.ibm.www.maximo.MXStringQueryType[] JOBCODE,
           com.ibm.www.maximo.MXStringQueryType[] LANGUAGE,
           com.ibm.www.maximo.MXDateTimeQueryType[] LASTEVALDATE,
           com.ibm.www.maximo.MXStringQueryType[] LASTNAME,
           com.ibm.www.maximo.MXStringQueryType[] LOCALE,
           com.ibm.www.maximo.MXStringQueryType[] LOCATION,
           com.ibm.www.maximo.MXStringQueryType[] LOCATIONORG,
           com.ibm.www.maximo.MXStringQueryType[] LOCATIONSITE,
           com.ibm.www.maximo.MXBooleanQueryType[] LOCTOSERVREQ,
           com.ibm.www.maximo.MXDateTimeQueryType[] NEXTEVALDATE,
           com.ibm.www.maximo.MXStringQueryType[] OWNERGROUP,
           com.ibm.www.maximo.MXStringQueryType[] OWNERSYSID,
           com.ibm.www.maximo.MXStringQueryType[] PCARDEXPDATE,
           com.ibm.www.maximo.MXStringQueryType[] PCARDNUM,
           com.ibm.www.maximo.MXStringQueryType[] PCARDTYPE,
           com.ibm.www.maximo.MXStringQueryType[] PCARDVERIFICATION,
           com.ibm.www.maximo.MXStringQueryType[] PERSONID,
           com.ibm.www.maximo.MXLongQueryType[] PERSONUID,
           com.ibm.www.maximo.MXStringQueryType[] POSTALCODE,
           com.ibm.www.maximo.MXStringQueryType[] PRIMARYSMS,
           com.ibm.www.maximo.MXStringQueryType[] REGIONDISTRICT,
           com.ibm.www.maximo.MXStringQueryType[] SENDERSYSID,
           com.ibm.www.maximo.MXStringQueryType[] SHIPTOADDRESS,
           com.ibm.www.maximo.MXStringQueryType[] SOURCESYSID,
           com.ibm.www.maximo.MXStringQueryType[] STATEPROVINCE,
           com.ibm.www.maximo.MXDomainQueryType[] STATUS,
           com.ibm.www.maximo.MXDateTimeQueryType[] STATUSDATE,
           com.ibm.www.maximo.MXStringQueryType[] SUPERVISOR,
           com.ibm.www.maximo.MXDateTimeQueryType[] TERMINATIONDATE,
           com.ibm.www.maximo.MXDomainQueryType[] TIMEZONE,
           com.ibm.www.maximo.MXStringQueryType[] TITLE,
           com.ibm.www.maximo.MXDomainQueryType[] TRANSEMAILELECTION,
           com.ibm.www.maximo.MXLongQueryType[] VIP,
           com.ibm.www.maximo.MXDomainQueryType[] WFMAILELECTION,
           com.ibm.www.maximo.MXLongQueryType[] WOPRIORITY,
           com.ibm.www.maximo.MXPERSONQueryTypePERSONPHONE PHONE,
           com.ibm.www.maximo.MXPERSONQueryTypePERSONEMAIL EMAIL,
           com.ibm.www.maximo.MXPERSONQueryTypePERSONSMS SMS) {
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
           this.OWNERGROUP = OWNERGROUP;
           this.OWNERSYSID = OWNERSYSID;
           this.PCARDEXPDATE = PCARDEXPDATE;
           this.PCARDNUM = PCARDNUM;
           this.PCARDTYPE = PCARDTYPE;
           this.PCARDVERIFICATION = PCARDVERIFICATION;
           this.PERSONID = PERSONID;
           this.PERSONUID = PERSONUID;
           this.POSTALCODE = POSTALCODE;
           this.PRIMARYSMS = PRIMARYSMS;
           this.REGIONDISTRICT = REGIONDISTRICT;
           this.SENDERSYSID = SENDERSYSID;
           this.SHIPTOADDRESS = SHIPTOADDRESS;
           this.SOURCESYSID = SOURCESYSID;
           this.STATEPROVINCE = STATEPROVINCE;
           this.STATUS = STATUS;
           this.STATUSDATE = STATUSDATE;
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
    }


    /**
     * Gets the ACCEPTINGWFMAIL value for this MXPERSONQueryTypePERSON.
     * 
     * @return ACCEPTINGWFMAIL
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getACCEPTINGWFMAIL() {
        return ACCEPTINGWFMAIL;
    }


    /**
     * Sets the ACCEPTINGWFMAIL value for this MXPERSONQueryTypePERSON.
     * 
     * @param ACCEPTINGWFMAIL
     */
    public void setACCEPTINGWFMAIL(com.ibm.www.maximo.MXBooleanQueryType[] ACCEPTINGWFMAIL) {
        this.ACCEPTINGWFMAIL = ACCEPTINGWFMAIL;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getACCEPTINGWFMAIL(int i) {
        return this.ACCEPTINGWFMAIL[i];
    }

    public void setACCEPTINGWFMAIL(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.ACCEPTINGWFMAIL[i] = _value;
    }


    /**
     * Gets the ADDRESSLINE1 value for this MXPERSONQueryTypePERSON.
     * 
     * @return ADDRESSLINE1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getADDRESSLINE1() {
        return ADDRESSLINE1;
    }


    /**
     * Sets the ADDRESSLINE1 value for this MXPERSONQueryTypePERSON.
     * 
     * @param ADDRESSLINE1
     */
    public void setADDRESSLINE1(com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public com.ibm.www.maximo.MXStringQueryType getADDRESSLINE1(int i) {
        return this.ADDRESSLINE1[i];
    }

    public void setADDRESSLINE1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ADDRESSLINE1[i] = _value;
    }


    /**
     * Gets the ADDRESSLINE2 value for this MXPERSONQueryTypePERSON.
     * 
     * @return ADDRESSLINE2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getADDRESSLINE2() {
        return ADDRESSLINE2;
    }


    /**
     * Sets the ADDRESSLINE2 value for this MXPERSONQueryTypePERSON.
     * 
     * @param ADDRESSLINE2
     */
    public void setADDRESSLINE2(com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public com.ibm.www.maximo.MXStringQueryType getADDRESSLINE2(int i) {
        return this.ADDRESSLINE2[i];
    }

    public void setADDRESSLINE2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ADDRESSLINE2[i] = _value;
    }


    /**
     * Gets the ADDRESSLINE3 value for this MXPERSONQueryTypePERSON.
     * 
     * @return ADDRESSLINE3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getADDRESSLINE3() {
        return ADDRESSLINE3;
    }


    /**
     * Sets the ADDRESSLINE3 value for this MXPERSONQueryTypePERSON.
     * 
     * @param ADDRESSLINE3
     */
    public void setADDRESSLINE3(com.ibm.www.maximo.MXStringQueryType[] ADDRESSLINE3) {
        this.ADDRESSLINE3 = ADDRESSLINE3;
    }

    public com.ibm.www.maximo.MXStringQueryType getADDRESSLINE3(int i) {
        return this.ADDRESSLINE3[i];
    }

    public void setADDRESSLINE3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ADDRESSLINE3[i] = _value;
    }


    /**
     * Gets the BILLTOADDRESS value for this MXPERSONQueryTypePERSON.
     * 
     * @return BILLTOADDRESS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getBILLTOADDRESS() {
        return BILLTOADDRESS;
    }


    /**
     * Sets the BILLTOADDRESS value for this MXPERSONQueryTypePERSON.
     * 
     * @param BILLTOADDRESS
     */
    public void setBILLTOADDRESS(com.ibm.www.maximo.MXStringQueryType[] BILLTOADDRESS) {
        this.BILLTOADDRESS = BILLTOADDRESS;
    }

    public com.ibm.www.maximo.MXStringQueryType getBILLTOADDRESS(int i) {
        return this.BILLTOADDRESS[i];
    }

    public void setBILLTOADDRESS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.BILLTOADDRESS[i] = _value;
    }


    /**
     * Gets the BIRTHDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return BIRTHDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getBIRTHDATE() {
        return BIRTHDATE;
    }


    /**
     * Sets the BIRTHDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param BIRTHDATE
     */
    public void setBIRTHDATE(com.ibm.www.maximo.MXDateTimeQueryType[] BIRTHDATE) {
        this.BIRTHDATE = BIRTHDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getBIRTHDATE(int i) {
        return this.BIRTHDATE[i];
    }

    public void setBIRTHDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.BIRTHDATE[i] = _value;
    }


    /**
     * Gets the CALTYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @return CALTYPE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCALTYPE() {
        return CALTYPE;
    }


    /**
     * Sets the CALTYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @param CALTYPE
     */
    public void setCALTYPE(com.ibm.www.maximo.MXStringQueryType[] CALTYPE) {
        this.CALTYPE = CALTYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getCALTYPE(int i) {
        return this.CALTYPE[i];
    }

    public void setCALTYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CALTYPE[i] = _value;
    }


    /**
     * Gets the CITY value for this MXPERSONQueryTypePERSON.
     * 
     * @return CITY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this MXPERSONQueryTypePERSON.
     * 
     * @param CITY
     */
    public void setCITY(com.ibm.www.maximo.MXStringQueryType[] CITY) {
        this.CITY = CITY;
    }

    public com.ibm.www.maximo.MXStringQueryType getCITY(int i) {
        return this.CITY[i];
    }

    public void setCITY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CITY[i] = _value;
    }


    /**
     * Gets the COUNTRY value for this MXPERSONQueryTypePERSON.
     * 
     * @return COUNTRY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this MXPERSONQueryTypePERSON.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(com.ibm.www.maximo.MXStringQueryType[] COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public com.ibm.www.maximo.MXStringQueryType getCOUNTRY(int i) {
        return this.COUNTRY[i];
    }

    public void setCOUNTRY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.COUNTRY[i] = _value;
    }


    /**
     * Gets the COUNTY value for this MXPERSONQueryTypePERSON.
     * 
     * @return COUNTY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCOUNTY() {
        return COUNTY;
    }


    /**
     * Sets the COUNTY value for this MXPERSONQueryTypePERSON.
     * 
     * @param COUNTY
     */
    public void setCOUNTY(com.ibm.www.maximo.MXStringQueryType[] COUNTY) {
        this.COUNTY = COUNTY;
    }

    public com.ibm.www.maximo.MXStringQueryType getCOUNTY(int i) {
        return this.COUNTY[i];
    }

    public void setCOUNTY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.COUNTY[i] = _value;
    }


    /**
     * Gets the DELEGATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return DELEGATE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDELEGATE() {
        return DELEGATE;
    }


    /**
     * Sets the DELEGATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param DELEGATE
     */
    public void setDELEGATE(com.ibm.www.maximo.MXStringQueryType[] DELEGATE) {
        this.DELEGATE = DELEGATE;
    }

    public com.ibm.www.maximo.MXStringQueryType getDELEGATE(int i) {
        return this.DELEGATE[i];
    }

    public void setDELEGATE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DELEGATE[i] = _value;
    }


    /**
     * Gets the DELEGATEFROMDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return DELEGATEFROMDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getDELEGATEFROMDATE() {
        return DELEGATEFROMDATE;
    }


    /**
     * Sets the DELEGATEFROMDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param DELEGATEFROMDATE
     */
    public void setDELEGATEFROMDATE(com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATEFROMDATE) {
        this.DELEGATEFROMDATE = DELEGATEFROMDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getDELEGATEFROMDATE(int i) {
        return this.DELEGATEFROMDATE[i];
    }

    public void setDELEGATEFROMDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.DELEGATEFROMDATE[i] = _value;
    }


    /**
     * Gets the DELEGATETODATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return DELEGATETODATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getDELEGATETODATE() {
        return DELEGATETODATE;
    }


    /**
     * Sets the DELEGATETODATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param DELEGATETODATE
     */
    public void setDELEGATETODATE(com.ibm.www.maximo.MXDateTimeQueryType[] DELEGATETODATE) {
        this.DELEGATETODATE = DELEGATETODATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getDELEGATETODATE(int i) {
        return this.DELEGATETODATE[i];
    }

    public void setDELEGATETODATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.DELEGATETODATE[i] = _value;
    }


    /**
     * Gets the DEPARTMENT value for this MXPERSONQueryTypePERSON.
     * 
     * @return DEPARTMENT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDEPARTMENT() {
        return DEPARTMENT;
    }


    /**
     * Sets the DEPARTMENT value for this MXPERSONQueryTypePERSON.
     * 
     * @param DEPARTMENT
     */
    public void setDEPARTMENT(com.ibm.www.maximo.MXStringQueryType[] DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public com.ibm.www.maximo.MXStringQueryType getDEPARTMENT(int i) {
        return this.DEPARTMENT[i];
    }

    public void setDEPARTMENT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DEPARTMENT[i] = _value;
    }


    /**
     * Gets the DEVICECLASS value for this MXPERSONQueryTypePERSON.
     * 
     * @return DEVICECLASS
     */
    public com.ibm.www.maximo.MXLongQueryType[] getDEVICECLASS() {
        return DEVICECLASS;
    }


    /**
     * Sets the DEVICECLASS value for this MXPERSONQueryTypePERSON.
     * 
     * @param DEVICECLASS
     */
    public void setDEVICECLASS(com.ibm.www.maximo.MXLongQueryType[] DEVICECLASS) {
        this.DEVICECLASS = DEVICECLASS;
    }

    public com.ibm.www.maximo.MXLongQueryType getDEVICECLASS(int i) {
        return this.DEVICECLASS[i];
    }

    public void setDEVICECLASS(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.DEVICECLASS[i] = _value;
    }


    /**
     * Gets the DFLTAPP value for this MXPERSONQueryTypePERSON.
     * 
     * @return DFLTAPP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDFLTAPP() {
        return DFLTAPP;
    }


    /**
     * Sets the DFLTAPP value for this MXPERSONQueryTypePERSON.
     * 
     * @param DFLTAPP
     */
    public void setDFLTAPP(com.ibm.www.maximo.MXStringQueryType[] DFLTAPP) {
        this.DFLTAPP = DFLTAPP;
    }

    public com.ibm.www.maximo.MXStringQueryType getDFLTAPP(int i) {
        return this.DFLTAPP[i];
    }

    public void setDFLTAPP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DFLTAPP[i] = _value;
    }


    /**
     * Gets the DISPLAYNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @return DISPLAYNAME   * Multiple languages supported
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDISPLAYNAME() {
        return DISPLAYNAME;
    }


    /**
     * Sets the DISPLAYNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @param DISPLAYNAME   * Multiple languages supported
     */
    public void setDISPLAYNAME(com.ibm.www.maximo.MXStringQueryType[] DISPLAYNAME) {
        this.DISPLAYNAME = DISPLAYNAME;
    }

    public com.ibm.www.maximo.MXStringQueryType getDISPLAYNAME(int i) {
        return this.DISPLAYNAME[i];
    }

    public void setDISPLAYNAME(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DISPLAYNAME[i] = _value;
    }


    /**
     * Gets the DROPPOINT value for this MXPERSONQueryTypePERSON.
     * 
     * @return DROPPOINT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDROPPOINT() {
        return DROPPOINT;
    }


    /**
     * Sets the DROPPOINT value for this MXPERSONQueryTypePERSON.
     * 
     * @param DROPPOINT
     */
    public void setDROPPOINT(com.ibm.www.maximo.MXStringQueryType[] DROPPOINT) {
        this.DROPPOINT = DROPPOINT;
    }

    public com.ibm.www.maximo.MXStringQueryType getDROPPOINT(int i) {
        return this.DROPPOINT[i];
    }

    public void setDROPPOINT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DROPPOINT[i] = _value;
    }


    /**
     * Gets the EMPLOYEETYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @return EMPLOYEETYPE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getEMPLOYEETYPE() {
        return EMPLOYEETYPE;
    }


    /**
     * Sets the EMPLOYEETYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @param EMPLOYEETYPE
     */
    public void setEMPLOYEETYPE(com.ibm.www.maximo.MXStringQueryType[] EMPLOYEETYPE) {
        this.EMPLOYEETYPE = EMPLOYEETYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getEMPLOYEETYPE(int i) {
        return this.EMPLOYEETYPE[i];
    }

    public void setEMPLOYEETYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.EMPLOYEETYPE[i] = _value;
    }


    /**
     * Gets the EXTERNALREFID value for this MXPERSONQueryTypePERSON.
     * 
     * @return EXTERNALREFID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getEXTERNALREFID() {
        return EXTERNALREFID;
    }


    /**
     * Sets the EXTERNALREFID value for this MXPERSONQueryTypePERSON.
     * 
     * @param EXTERNALREFID
     */
    public void setEXTERNALREFID(com.ibm.www.maximo.MXStringQueryType[] EXTERNALREFID) {
        this.EXTERNALREFID = EXTERNALREFID;
    }

    public com.ibm.www.maximo.MXStringQueryType getEXTERNALREFID(int i) {
        return this.EXTERNALREFID[i];
    }

    public void setEXTERNALREFID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.EXTERNALREFID[i] = _value;
    }


    /**
     * Gets the FIRSTNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @return FIRSTNAME
     */
    public com.ibm.www.maximo.MXStringQueryType[] getFIRSTNAME() {
        return FIRSTNAME;
    }


    /**
     * Sets the FIRSTNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @param FIRSTNAME
     */
    public void setFIRSTNAME(com.ibm.www.maximo.MXStringQueryType[] FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

    public com.ibm.www.maximo.MXStringQueryType getFIRSTNAME(int i) {
        return this.FIRSTNAME[i];
    }

    public void setFIRSTNAME(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.FIRSTNAME[i] = _value;
    }


    /**
     * Gets the HIREDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return HIREDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getHIREDATE() {
        return HIREDATE;
    }


    /**
     * Sets the HIREDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param HIREDATE
     */
    public void setHIREDATE(com.ibm.www.maximo.MXDateTimeQueryType[] HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getHIREDATE(int i) {
        return this.HIREDATE[i];
    }

    public void setHIREDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.HIREDATE[i] = _value;
    }


    /**
     * Gets the IM_ID value for this MXPERSONQueryTypePERSON.
     * 
     * @return IM_ID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getIM_ID() {
        return IM_ID;
    }


    /**
     * Sets the IM_ID value for this MXPERSONQueryTypePERSON.
     * 
     * @param IM_ID
     */
    public void setIM_ID(com.ibm.www.maximo.MXStringQueryType[] IM_ID) {
        this.IM_ID = IM_ID;
    }

    public com.ibm.www.maximo.MXStringQueryType getIM_ID(int i) {
        return this.IM_ID[i];
    }

    public void setIM_ID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.IM_ID[i] = _value;
    }


    /**
     * Gets the JOBCODE value for this MXPERSONQueryTypePERSON.
     * 
     * @return JOBCODE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getJOBCODE() {
        return JOBCODE;
    }


    /**
     * Sets the JOBCODE value for this MXPERSONQueryTypePERSON.
     * 
     * @param JOBCODE
     */
    public void setJOBCODE(com.ibm.www.maximo.MXStringQueryType[] JOBCODE) {
        this.JOBCODE = JOBCODE;
    }

    public com.ibm.www.maximo.MXStringQueryType getJOBCODE(int i) {
        return this.JOBCODE[i];
    }

    public void setJOBCODE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.JOBCODE[i] = _value;
    }


    /**
     * Gets the LANGUAGE value for this MXPERSONQueryTypePERSON.
     * 
     * @return LANGUAGE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLANGUAGE() {
        return LANGUAGE;
    }


    /**
     * Sets the LANGUAGE value for this MXPERSONQueryTypePERSON.
     * 
     * @param LANGUAGE
     */
    public void setLANGUAGE(com.ibm.www.maximo.MXStringQueryType[] LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public com.ibm.www.maximo.MXStringQueryType getLANGUAGE(int i) {
        return this.LANGUAGE[i];
    }

    public void setLANGUAGE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LANGUAGE[i] = _value;
    }


    /**
     * Gets the LASTEVALDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return LASTEVALDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getLASTEVALDATE() {
        return LASTEVALDATE;
    }


    /**
     * Sets the LASTEVALDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param LASTEVALDATE
     */
    public void setLASTEVALDATE(com.ibm.www.maximo.MXDateTimeQueryType[] LASTEVALDATE) {
        this.LASTEVALDATE = LASTEVALDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getLASTEVALDATE(int i) {
        return this.LASTEVALDATE[i];
    }

    public void setLASTEVALDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.LASTEVALDATE[i] = _value;
    }


    /**
     * Gets the LASTNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @return LASTNAME
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLASTNAME() {
        return LASTNAME;
    }


    /**
     * Sets the LASTNAME value for this MXPERSONQueryTypePERSON.
     * 
     * @param LASTNAME
     */
    public void setLASTNAME(com.ibm.www.maximo.MXStringQueryType[] LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public com.ibm.www.maximo.MXStringQueryType getLASTNAME(int i) {
        return this.LASTNAME[i];
    }

    public void setLASTNAME(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LASTNAME[i] = _value;
    }


    /**
     * Gets the LOCALE value for this MXPERSONQueryTypePERSON.
     * 
     * @return LOCALE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLOCALE() {
        return LOCALE;
    }


    /**
     * Sets the LOCALE value for this MXPERSONQueryTypePERSON.
     * 
     * @param LOCALE
     */
    public void setLOCALE(com.ibm.www.maximo.MXStringQueryType[] LOCALE) {
        this.LOCALE = LOCALE;
    }

    public com.ibm.www.maximo.MXStringQueryType getLOCALE(int i) {
        return this.LOCALE[i];
    }

    public void setLOCALE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LOCALE[i] = _value;
    }


    /**
     * Gets the LOCATION value for this MXPERSONQueryTypePERSON.
     * 
     * @return LOCATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLOCATION() {
        return LOCATION;
    }


    /**
     * Sets the LOCATION value for this MXPERSONQueryTypePERSON.
     * 
     * @param LOCATION
     */
    public void setLOCATION(com.ibm.www.maximo.MXStringQueryType[] LOCATION) {
        this.LOCATION = LOCATION;
    }

    public com.ibm.www.maximo.MXStringQueryType getLOCATION(int i) {
        return this.LOCATION[i];
    }

    public void setLOCATION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LOCATION[i] = _value;
    }


    /**
     * Gets the LOCATIONORG value for this MXPERSONQueryTypePERSON.
     * 
     * @return LOCATIONORG
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLOCATIONORG() {
        return LOCATIONORG;
    }


    /**
     * Sets the LOCATIONORG value for this MXPERSONQueryTypePERSON.
     * 
     * @param LOCATIONORG
     */
    public void setLOCATIONORG(com.ibm.www.maximo.MXStringQueryType[] LOCATIONORG) {
        this.LOCATIONORG = LOCATIONORG;
    }

    public com.ibm.www.maximo.MXStringQueryType getLOCATIONORG(int i) {
        return this.LOCATIONORG[i];
    }

    public void setLOCATIONORG(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LOCATIONORG[i] = _value;
    }


    /**
     * Gets the LOCATIONSITE value for this MXPERSONQueryTypePERSON.
     * 
     * @return LOCATIONSITE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLOCATIONSITE() {
        return LOCATIONSITE;
    }


    /**
     * Sets the LOCATIONSITE value for this MXPERSONQueryTypePERSON.
     * 
     * @param LOCATIONSITE
     */
    public void setLOCATIONSITE(com.ibm.www.maximo.MXStringQueryType[] LOCATIONSITE) {
        this.LOCATIONSITE = LOCATIONSITE;
    }

    public com.ibm.www.maximo.MXStringQueryType getLOCATIONSITE(int i) {
        return this.LOCATIONSITE[i];
    }

    public void setLOCATIONSITE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LOCATIONSITE[i] = _value;
    }


    /**
     * Gets the LOCTOSERVREQ value for this MXPERSONQueryTypePERSON.
     * 
     * @return LOCTOSERVREQ
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getLOCTOSERVREQ() {
        return LOCTOSERVREQ;
    }


    /**
     * Sets the LOCTOSERVREQ value for this MXPERSONQueryTypePERSON.
     * 
     * @param LOCTOSERVREQ
     */
    public void setLOCTOSERVREQ(com.ibm.www.maximo.MXBooleanQueryType[] LOCTOSERVREQ) {
        this.LOCTOSERVREQ = LOCTOSERVREQ;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getLOCTOSERVREQ(int i) {
        return this.LOCTOSERVREQ[i];
    }

    public void setLOCTOSERVREQ(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.LOCTOSERVREQ[i] = _value;
    }


    /**
     * Gets the NEXTEVALDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return NEXTEVALDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getNEXTEVALDATE() {
        return NEXTEVALDATE;
    }


    /**
     * Sets the NEXTEVALDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param NEXTEVALDATE
     */
    public void setNEXTEVALDATE(com.ibm.www.maximo.MXDateTimeQueryType[] NEXTEVALDATE) {
        this.NEXTEVALDATE = NEXTEVALDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getNEXTEVALDATE(int i) {
        return this.NEXTEVALDATE[i];
    }

    public void setNEXTEVALDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.NEXTEVALDATE[i] = _value;
    }


    /**
     * Gets the OWNERGROUP value for this MXPERSONQueryTypePERSON.
     * 
     * @return OWNERGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOWNERGROUP() {
        return OWNERGROUP;
    }


    /**
     * Sets the OWNERGROUP value for this MXPERSONQueryTypePERSON.
     * 
     * @param OWNERGROUP
     */
    public void setOWNERGROUP(com.ibm.www.maximo.MXStringQueryType[] OWNERGROUP) {
        this.OWNERGROUP = OWNERGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getOWNERGROUP(int i) {
        return this.OWNERGROUP[i];
    }

    public void setOWNERGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.OWNERGROUP[i] = _value;
    }


    /**
     * Gets the OWNERSYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @return OWNERSYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOWNERSYSID() {
        return OWNERSYSID;
    }


    /**
     * Sets the OWNERSYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @param OWNERSYSID
     */
    public void setOWNERSYSID(com.ibm.www.maximo.MXStringQueryType[] OWNERSYSID) {
        this.OWNERSYSID = OWNERSYSID;
    }

    public com.ibm.www.maximo.MXStringQueryType getOWNERSYSID(int i) {
        return this.OWNERSYSID[i];
    }

    public void setOWNERSYSID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.OWNERSYSID[i] = _value;
    }


    /**
     * Gets the PCARDEXPDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return PCARDEXPDATE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPCARDEXPDATE() {
        return PCARDEXPDATE;
    }


    /**
     * Sets the PCARDEXPDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param PCARDEXPDATE
     */
    public void setPCARDEXPDATE(com.ibm.www.maximo.MXStringQueryType[] PCARDEXPDATE) {
        this.PCARDEXPDATE = PCARDEXPDATE;
    }

    public com.ibm.www.maximo.MXStringQueryType getPCARDEXPDATE(int i) {
        return this.PCARDEXPDATE[i];
    }

    public void setPCARDEXPDATE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PCARDEXPDATE[i] = _value;
    }


    /**
     * Gets the PCARDNUM value for this MXPERSONQueryTypePERSON.
     * 
     * @return PCARDNUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPCARDNUM() {
        return PCARDNUM;
    }


    /**
     * Sets the PCARDNUM value for this MXPERSONQueryTypePERSON.
     * 
     * @param PCARDNUM
     */
    public void setPCARDNUM(com.ibm.www.maximo.MXStringQueryType[] PCARDNUM) {
        this.PCARDNUM = PCARDNUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getPCARDNUM(int i) {
        return this.PCARDNUM[i];
    }

    public void setPCARDNUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PCARDNUM[i] = _value;
    }


    /**
     * Gets the PCARDTYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @return PCARDTYPE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPCARDTYPE() {
        return PCARDTYPE;
    }


    /**
     * Sets the PCARDTYPE value for this MXPERSONQueryTypePERSON.
     * 
     * @param PCARDTYPE
     */
    public void setPCARDTYPE(com.ibm.www.maximo.MXStringQueryType[] PCARDTYPE) {
        this.PCARDTYPE = PCARDTYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getPCARDTYPE(int i) {
        return this.PCARDTYPE[i];
    }

    public void setPCARDTYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PCARDTYPE[i] = _value;
    }


    /**
     * Gets the PCARDVERIFICATION value for this MXPERSONQueryTypePERSON.
     * 
     * @return PCARDVERIFICATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPCARDVERIFICATION() {
        return PCARDVERIFICATION;
    }


    /**
     * Sets the PCARDVERIFICATION value for this MXPERSONQueryTypePERSON.
     * 
     * @param PCARDVERIFICATION
     */
    public void setPCARDVERIFICATION(com.ibm.www.maximo.MXStringQueryType[] PCARDVERIFICATION) {
        this.PCARDVERIFICATION = PCARDVERIFICATION;
    }

    public com.ibm.www.maximo.MXStringQueryType getPCARDVERIFICATION(int i) {
        return this.PCARDVERIFICATION[i];
    }

    public void setPCARDVERIFICATION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PCARDVERIFICATION[i] = _value;
    }


    /**
     * Gets the PERSONID value for this MXPERSONQueryTypePERSON.
     * 
     * @return PERSONID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPERSONID() {
        return PERSONID;
    }


    /**
     * Sets the PERSONID value for this MXPERSONQueryTypePERSON.
     * 
     * @param PERSONID   * Unique Key Component
     */
    public void setPERSONID(com.ibm.www.maximo.MXStringQueryType[] PERSONID) {
        this.PERSONID = PERSONID;
    }

    public com.ibm.www.maximo.MXStringQueryType getPERSONID(int i) {
        return this.PERSONID[i];
    }

    public void setPERSONID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PERSONID[i] = _value;
    }


    /**
     * Gets the PERSONUID value for this MXPERSONQueryTypePERSON.
     * 
     * @return PERSONUID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getPERSONUID() {
        return PERSONUID;
    }


    /**
     * Sets the PERSONUID value for this MXPERSONQueryTypePERSON.
     * 
     * @param PERSONUID
     */
    public void setPERSONUID(com.ibm.www.maximo.MXLongQueryType[] PERSONUID) {
        this.PERSONUID = PERSONUID;
    }

    public com.ibm.www.maximo.MXLongQueryType getPERSONUID(int i) {
        return this.PERSONUID[i];
    }

    public void setPERSONUID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.PERSONUID[i] = _value;
    }


    /**
     * Gets the POSTALCODE value for this MXPERSONQueryTypePERSON.
     * 
     * @return POSTALCODE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPOSTALCODE() {
        return POSTALCODE;
    }


    /**
     * Sets the POSTALCODE value for this MXPERSONQueryTypePERSON.
     * 
     * @param POSTALCODE
     */
    public void setPOSTALCODE(com.ibm.www.maximo.MXStringQueryType[] POSTALCODE) {
        this.POSTALCODE = POSTALCODE;
    }

    public com.ibm.www.maximo.MXStringQueryType getPOSTALCODE(int i) {
        return this.POSTALCODE[i];
    }

    public void setPOSTALCODE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.POSTALCODE[i] = _value;
    }


    /**
     * Gets the PRIMARYSMS value for this MXPERSONQueryTypePERSON.
     * 
     * @return PRIMARYSMS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPRIMARYSMS() {
        return PRIMARYSMS;
    }


    /**
     * Sets the PRIMARYSMS value for this MXPERSONQueryTypePERSON.
     * 
     * @param PRIMARYSMS
     */
    public void setPRIMARYSMS(com.ibm.www.maximo.MXStringQueryType[] PRIMARYSMS) {
        this.PRIMARYSMS = PRIMARYSMS;
    }

    public com.ibm.www.maximo.MXStringQueryType getPRIMARYSMS(int i) {
        return this.PRIMARYSMS[i];
    }

    public void setPRIMARYSMS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PRIMARYSMS[i] = _value;
    }


    /**
     * Gets the REGIONDISTRICT value for this MXPERSONQueryTypePERSON.
     * 
     * @return REGIONDISTRICT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getREGIONDISTRICT() {
        return REGIONDISTRICT;
    }


    /**
     * Sets the REGIONDISTRICT value for this MXPERSONQueryTypePERSON.
     * 
     * @param REGIONDISTRICT
     */
    public void setREGIONDISTRICT(com.ibm.www.maximo.MXStringQueryType[] REGIONDISTRICT) {
        this.REGIONDISTRICT = REGIONDISTRICT;
    }

    public com.ibm.www.maximo.MXStringQueryType getREGIONDISTRICT(int i) {
        return this.REGIONDISTRICT[i];
    }

    public void setREGIONDISTRICT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.REGIONDISTRICT[i] = _value;
    }


    /**
     * Gets the SENDERSYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @return SENDERSYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSENDERSYSID() {
        return SENDERSYSID;
    }


    /**
     * Sets the SENDERSYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @param SENDERSYSID
     */
    public void setSENDERSYSID(com.ibm.www.maximo.MXStringQueryType[] SENDERSYSID) {
        this.SENDERSYSID = SENDERSYSID;
    }

    public com.ibm.www.maximo.MXStringQueryType getSENDERSYSID(int i) {
        return this.SENDERSYSID[i];
    }

    public void setSENDERSYSID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SENDERSYSID[i] = _value;
    }


    /**
     * Gets the SHIPTOADDRESS value for this MXPERSONQueryTypePERSON.
     * 
     * @return SHIPTOADDRESS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSHIPTOADDRESS() {
        return SHIPTOADDRESS;
    }


    /**
     * Sets the SHIPTOADDRESS value for this MXPERSONQueryTypePERSON.
     * 
     * @param SHIPTOADDRESS
     */
    public void setSHIPTOADDRESS(com.ibm.www.maximo.MXStringQueryType[] SHIPTOADDRESS) {
        this.SHIPTOADDRESS = SHIPTOADDRESS;
    }

    public com.ibm.www.maximo.MXStringQueryType getSHIPTOADDRESS(int i) {
        return this.SHIPTOADDRESS[i];
    }

    public void setSHIPTOADDRESS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SHIPTOADDRESS[i] = _value;
    }


    /**
     * Gets the SOURCESYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @return SOURCESYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSOURCESYSID() {
        return SOURCESYSID;
    }


    /**
     * Sets the SOURCESYSID value for this MXPERSONQueryTypePERSON.
     * 
     * @param SOURCESYSID
     */
    public void setSOURCESYSID(com.ibm.www.maximo.MXStringQueryType[] SOURCESYSID) {
        this.SOURCESYSID = SOURCESYSID;
    }

    public com.ibm.www.maximo.MXStringQueryType getSOURCESYSID(int i) {
        return this.SOURCESYSID[i];
    }

    public void setSOURCESYSID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SOURCESYSID[i] = _value;
    }


    /**
     * Gets the STATEPROVINCE value for this MXPERSONQueryTypePERSON.
     * 
     * @return STATEPROVINCE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSTATEPROVINCE() {
        return STATEPROVINCE;
    }


    /**
     * Sets the STATEPROVINCE value for this MXPERSONQueryTypePERSON.
     * 
     * @param STATEPROVINCE
     */
    public void setSTATEPROVINCE(com.ibm.www.maximo.MXStringQueryType[] STATEPROVINCE) {
        this.STATEPROVINCE = STATEPROVINCE;
    }

    public com.ibm.www.maximo.MXStringQueryType getSTATEPROVINCE(int i) {
        return this.STATEPROVINCE[i];
    }

    public void setSTATEPROVINCE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.STATEPROVINCE[i] = _value;
    }


    /**
     * Gets the STATUS value for this MXPERSONQueryTypePERSON.
     * 
     * @return STATUS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this MXPERSONQueryTypePERSON.
     * 
     * @param STATUS
     */
    public void setSTATUS(com.ibm.www.maximo.MXDomainQueryType[] STATUS) {
        this.STATUS = STATUS;
    }

    public com.ibm.www.maximo.MXDomainQueryType getSTATUS(int i) {
        return this.STATUS[i];
    }

    public void setSTATUS(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.STATUS[i] = _value;
    }


    /**
     * Gets the STATUSDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return STATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getSTATUSDATE() {
        return STATUSDATE;
    }


    /**
     * Sets the STATUSDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param STATUSDATE
     */
    public void setSTATUSDATE(com.ibm.www.maximo.MXDateTimeQueryType[] STATUSDATE) {
        this.STATUSDATE = STATUSDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getSTATUSDATE(int i) {
        return this.STATUSDATE[i];
    }

    public void setSTATUSDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.STATUSDATE[i] = _value;
    }


    /**
     * Gets the SUPERVISOR value for this MXPERSONQueryTypePERSON.
     * 
     * @return SUPERVISOR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSUPERVISOR() {
        return SUPERVISOR;
    }


    /**
     * Sets the SUPERVISOR value for this MXPERSONQueryTypePERSON.
     * 
     * @param SUPERVISOR
     */
    public void setSUPERVISOR(com.ibm.www.maximo.MXStringQueryType[] SUPERVISOR) {
        this.SUPERVISOR = SUPERVISOR;
    }

    public com.ibm.www.maximo.MXStringQueryType getSUPERVISOR(int i) {
        return this.SUPERVISOR[i];
    }

    public void setSUPERVISOR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SUPERVISOR[i] = _value;
    }


    /**
     * Gets the TERMINATIONDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @return TERMINATIONDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getTERMINATIONDATE() {
        return TERMINATIONDATE;
    }


    /**
     * Sets the TERMINATIONDATE value for this MXPERSONQueryTypePERSON.
     * 
     * @param TERMINATIONDATE
     */
    public void setTERMINATIONDATE(com.ibm.www.maximo.MXDateTimeQueryType[] TERMINATIONDATE) {
        this.TERMINATIONDATE = TERMINATIONDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getTERMINATIONDATE(int i) {
        return this.TERMINATIONDATE[i];
    }

    public void setTERMINATIONDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.TERMINATIONDATE[i] = _value;
    }


    /**
     * Gets the TIMEZONE value for this MXPERSONQueryTypePERSON.
     * 
     * @return TIMEZONE
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getTIMEZONE() {
        return TIMEZONE;
    }


    /**
     * Sets the TIMEZONE value for this MXPERSONQueryTypePERSON.
     * 
     * @param TIMEZONE
     */
    public void setTIMEZONE(com.ibm.www.maximo.MXDomainQueryType[] TIMEZONE) {
        this.TIMEZONE = TIMEZONE;
    }

    public com.ibm.www.maximo.MXDomainQueryType getTIMEZONE(int i) {
        return this.TIMEZONE[i];
    }

    public void setTIMEZONE(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.TIMEZONE[i] = _value;
    }


    /**
     * Gets the TITLE value for this MXPERSONQueryTypePERSON.
     * 
     * @return TITLE   * Multiple languages supported
     */
    public com.ibm.www.maximo.MXStringQueryType[] getTITLE() {
        return TITLE;
    }


    /**
     * Sets the TITLE value for this MXPERSONQueryTypePERSON.
     * 
     * @param TITLE   * Multiple languages supported
     */
    public void setTITLE(com.ibm.www.maximo.MXStringQueryType[] TITLE) {
        this.TITLE = TITLE;
    }

    public com.ibm.www.maximo.MXStringQueryType getTITLE(int i) {
        return this.TITLE[i];
    }

    public void setTITLE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.TITLE[i] = _value;
    }


    /**
     * Gets the TRANSEMAILELECTION value for this MXPERSONQueryTypePERSON.
     * 
     * @return TRANSEMAILELECTION
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getTRANSEMAILELECTION() {
        return TRANSEMAILELECTION;
    }


    /**
     * Sets the TRANSEMAILELECTION value for this MXPERSONQueryTypePERSON.
     * 
     * @param TRANSEMAILELECTION
     */
    public void setTRANSEMAILELECTION(com.ibm.www.maximo.MXDomainQueryType[] TRANSEMAILELECTION) {
        this.TRANSEMAILELECTION = TRANSEMAILELECTION;
    }

    public com.ibm.www.maximo.MXDomainQueryType getTRANSEMAILELECTION(int i) {
        return this.TRANSEMAILELECTION[i];
    }

    public void setTRANSEMAILELECTION(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.TRANSEMAILELECTION[i] = _value;
    }


    /**
     * Gets the VIP value for this MXPERSONQueryTypePERSON.
     * 
     * @return VIP
     */
    public com.ibm.www.maximo.MXLongQueryType[] getVIP() {
        return VIP;
    }


    /**
     * Sets the VIP value for this MXPERSONQueryTypePERSON.
     * 
     * @param VIP
     */
    public void setVIP(com.ibm.www.maximo.MXLongQueryType[] VIP) {
        this.VIP = VIP;
    }

    public com.ibm.www.maximo.MXLongQueryType getVIP(int i) {
        return this.VIP[i];
    }

    public void setVIP(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.VIP[i] = _value;
    }


    /**
     * Gets the WFMAILELECTION value for this MXPERSONQueryTypePERSON.
     * 
     * @return WFMAILELECTION
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getWFMAILELECTION() {
        return WFMAILELECTION;
    }


    /**
     * Sets the WFMAILELECTION value for this MXPERSONQueryTypePERSON.
     * 
     * @param WFMAILELECTION
     */
    public void setWFMAILELECTION(com.ibm.www.maximo.MXDomainQueryType[] WFMAILELECTION) {
        this.WFMAILELECTION = WFMAILELECTION;
    }

    public com.ibm.www.maximo.MXDomainQueryType getWFMAILELECTION(int i) {
        return this.WFMAILELECTION[i];
    }

    public void setWFMAILELECTION(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.WFMAILELECTION[i] = _value;
    }


    /**
     * Gets the WOPRIORITY value for this MXPERSONQueryTypePERSON.
     * 
     * @return WOPRIORITY
     */
    public com.ibm.www.maximo.MXLongQueryType[] getWOPRIORITY() {
        return WOPRIORITY;
    }


    /**
     * Sets the WOPRIORITY value for this MXPERSONQueryTypePERSON.
     * 
     * @param WOPRIORITY
     */
    public void setWOPRIORITY(com.ibm.www.maximo.MXLongQueryType[] WOPRIORITY) {
        this.WOPRIORITY = WOPRIORITY;
    }

    public com.ibm.www.maximo.MXLongQueryType getWOPRIORITY(int i) {
        return this.WOPRIORITY[i];
    }

    public void setWOPRIORITY(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.WOPRIORITY[i] = _value;
    }


    /**
     * Gets the PHONE value for this MXPERSONQueryTypePERSON.
     * 
     * @return PHONE
     */
    public com.ibm.www.maximo.MXPERSONQueryTypePERSONPHONE getPHONE() {
        return PHONE;
    }


    /**
     * Sets the PHONE value for this MXPERSONQueryTypePERSON.
     * 
     * @param PHONE
     */
    public void setPHONE(com.ibm.www.maximo.MXPERSONQueryTypePERSONPHONE PHONE) {
        this.PHONE = PHONE;
    }


    /**
     * Gets the EMAIL value for this MXPERSONQueryTypePERSON.
     * 
     * @return EMAIL
     */
    public com.ibm.www.maximo.MXPERSONQueryTypePERSONEMAIL getEMAIL() {
        return EMAIL;
    }


    /**
     * Sets the EMAIL value for this MXPERSONQueryTypePERSON.
     * 
     * @param EMAIL
     */
    public void setEMAIL(com.ibm.www.maximo.MXPERSONQueryTypePERSONEMAIL EMAIL) {
        this.EMAIL = EMAIL;
    }


    /**
     * Gets the SMS value for this MXPERSONQueryTypePERSON.
     * 
     * @return SMS
     */
    public com.ibm.www.maximo.MXPERSONQueryTypePERSONSMS getSMS() {
        return SMS;
    }


    /**
     * Sets the SMS value for this MXPERSONQueryTypePERSON.
     * 
     * @param SMS
     */
    public void setSMS(com.ibm.www.maximo.MXPERSONQueryTypePERSONSMS SMS) {
        this.SMS = SMS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXPERSONQueryTypePERSON)) return false;
        MXPERSONQueryTypePERSON other = (MXPERSONQueryTypePERSON) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCEPTINGWFMAIL==null && other.getACCEPTINGWFMAIL()==null) || 
             (this.ACCEPTINGWFMAIL!=null &&
              java.util.Arrays.equals(this.ACCEPTINGWFMAIL, other.getACCEPTINGWFMAIL()))) &&
            ((this.ADDRESSLINE1==null && other.getADDRESSLINE1()==null) || 
             (this.ADDRESSLINE1!=null &&
              java.util.Arrays.equals(this.ADDRESSLINE1, other.getADDRESSLINE1()))) &&
            ((this.ADDRESSLINE2==null && other.getADDRESSLINE2()==null) || 
             (this.ADDRESSLINE2!=null &&
              java.util.Arrays.equals(this.ADDRESSLINE2, other.getADDRESSLINE2()))) &&
            ((this.ADDRESSLINE3==null && other.getADDRESSLINE3()==null) || 
             (this.ADDRESSLINE3!=null &&
              java.util.Arrays.equals(this.ADDRESSLINE3, other.getADDRESSLINE3()))) &&
            ((this.BILLTOADDRESS==null && other.getBILLTOADDRESS()==null) || 
             (this.BILLTOADDRESS!=null &&
              java.util.Arrays.equals(this.BILLTOADDRESS, other.getBILLTOADDRESS()))) &&
            ((this.BIRTHDATE==null && other.getBIRTHDATE()==null) || 
             (this.BIRTHDATE!=null &&
              java.util.Arrays.equals(this.BIRTHDATE, other.getBIRTHDATE()))) &&
            ((this.CALTYPE==null && other.getCALTYPE()==null) || 
             (this.CALTYPE!=null &&
              java.util.Arrays.equals(this.CALTYPE, other.getCALTYPE()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              java.util.Arrays.equals(this.CITY, other.getCITY()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              java.util.Arrays.equals(this.COUNTRY, other.getCOUNTRY()))) &&
            ((this.COUNTY==null && other.getCOUNTY()==null) || 
             (this.COUNTY!=null &&
              java.util.Arrays.equals(this.COUNTY, other.getCOUNTY()))) &&
            ((this.DELEGATE==null && other.getDELEGATE()==null) || 
             (this.DELEGATE!=null &&
              java.util.Arrays.equals(this.DELEGATE, other.getDELEGATE()))) &&
            ((this.DELEGATEFROMDATE==null && other.getDELEGATEFROMDATE()==null) || 
             (this.DELEGATEFROMDATE!=null &&
              java.util.Arrays.equals(this.DELEGATEFROMDATE, other.getDELEGATEFROMDATE()))) &&
            ((this.DELEGATETODATE==null && other.getDELEGATETODATE()==null) || 
             (this.DELEGATETODATE!=null &&
              java.util.Arrays.equals(this.DELEGATETODATE, other.getDELEGATETODATE()))) &&
            ((this.DEPARTMENT==null && other.getDEPARTMENT()==null) || 
             (this.DEPARTMENT!=null &&
              java.util.Arrays.equals(this.DEPARTMENT, other.getDEPARTMENT()))) &&
            ((this.DEVICECLASS==null && other.getDEVICECLASS()==null) || 
             (this.DEVICECLASS!=null &&
              java.util.Arrays.equals(this.DEVICECLASS, other.getDEVICECLASS()))) &&
            ((this.DFLTAPP==null && other.getDFLTAPP()==null) || 
             (this.DFLTAPP!=null &&
              java.util.Arrays.equals(this.DFLTAPP, other.getDFLTAPP()))) &&
            ((this.DISPLAYNAME==null && other.getDISPLAYNAME()==null) || 
             (this.DISPLAYNAME!=null &&
              java.util.Arrays.equals(this.DISPLAYNAME, other.getDISPLAYNAME()))) &&
            ((this.DROPPOINT==null && other.getDROPPOINT()==null) || 
             (this.DROPPOINT!=null &&
              java.util.Arrays.equals(this.DROPPOINT, other.getDROPPOINT()))) &&
            ((this.EMPLOYEETYPE==null && other.getEMPLOYEETYPE()==null) || 
             (this.EMPLOYEETYPE!=null &&
              java.util.Arrays.equals(this.EMPLOYEETYPE, other.getEMPLOYEETYPE()))) &&
            ((this.EXTERNALREFID==null && other.getEXTERNALREFID()==null) || 
             (this.EXTERNALREFID!=null &&
              java.util.Arrays.equals(this.EXTERNALREFID, other.getEXTERNALREFID()))) &&
            ((this.FIRSTNAME==null && other.getFIRSTNAME()==null) || 
             (this.FIRSTNAME!=null &&
              java.util.Arrays.equals(this.FIRSTNAME, other.getFIRSTNAME()))) &&
            ((this.HIREDATE==null && other.getHIREDATE()==null) || 
             (this.HIREDATE!=null &&
              java.util.Arrays.equals(this.HIREDATE, other.getHIREDATE()))) &&
            ((this.IM_ID==null && other.getIM_ID()==null) || 
             (this.IM_ID!=null &&
              java.util.Arrays.equals(this.IM_ID, other.getIM_ID()))) &&
            ((this.JOBCODE==null && other.getJOBCODE()==null) || 
             (this.JOBCODE!=null &&
              java.util.Arrays.equals(this.JOBCODE, other.getJOBCODE()))) &&
            ((this.LANGUAGE==null && other.getLANGUAGE()==null) || 
             (this.LANGUAGE!=null &&
              java.util.Arrays.equals(this.LANGUAGE, other.getLANGUAGE()))) &&
            ((this.LASTEVALDATE==null && other.getLASTEVALDATE()==null) || 
             (this.LASTEVALDATE!=null &&
              java.util.Arrays.equals(this.LASTEVALDATE, other.getLASTEVALDATE()))) &&
            ((this.LASTNAME==null && other.getLASTNAME()==null) || 
             (this.LASTNAME!=null &&
              java.util.Arrays.equals(this.LASTNAME, other.getLASTNAME()))) &&
            ((this.LOCALE==null && other.getLOCALE()==null) || 
             (this.LOCALE!=null &&
              java.util.Arrays.equals(this.LOCALE, other.getLOCALE()))) &&
            ((this.LOCATION==null && other.getLOCATION()==null) || 
             (this.LOCATION!=null &&
              java.util.Arrays.equals(this.LOCATION, other.getLOCATION()))) &&
            ((this.LOCATIONORG==null && other.getLOCATIONORG()==null) || 
             (this.LOCATIONORG!=null &&
              java.util.Arrays.equals(this.LOCATIONORG, other.getLOCATIONORG()))) &&
            ((this.LOCATIONSITE==null && other.getLOCATIONSITE()==null) || 
             (this.LOCATIONSITE!=null &&
              java.util.Arrays.equals(this.LOCATIONSITE, other.getLOCATIONSITE()))) &&
            ((this.LOCTOSERVREQ==null && other.getLOCTOSERVREQ()==null) || 
             (this.LOCTOSERVREQ!=null &&
              java.util.Arrays.equals(this.LOCTOSERVREQ, other.getLOCTOSERVREQ()))) &&
            ((this.NEXTEVALDATE==null && other.getNEXTEVALDATE()==null) || 
             (this.NEXTEVALDATE!=null &&
              java.util.Arrays.equals(this.NEXTEVALDATE, other.getNEXTEVALDATE()))) &&
            ((this.OWNERGROUP==null && other.getOWNERGROUP()==null) || 
             (this.OWNERGROUP!=null &&
              java.util.Arrays.equals(this.OWNERGROUP, other.getOWNERGROUP()))) &&
            ((this.OWNERSYSID==null && other.getOWNERSYSID()==null) || 
             (this.OWNERSYSID!=null &&
              java.util.Arrays.equals(this.OWNERSYSID, other.getOWNERSYSID()))) &&
            ((this.PCARDEXPDATE==null && other.getPCARDEXPDATE()==null) || 
             (this.PCARDEXPDATE!=null &&
              java.util.Arrays.equals(this.PCARDEXPDATE, other.getPCARDEXPDATE()))) &&
            ((this.PCARDNUM==null && other.getPCARDNUM()==null) || 
             (this.PCARDNUM!=null &&
              java.util.Arrays.equals(this.PCARDNUM, other.getPCARDNUM()))) &&
            ((this.PCARDTYPE==null && other.getPCARDTYPE()==null) || 
             (this.PCARDTYPE!=null &&
              java.util.Arrays.equals(this.PCARDTYPE, other.getPCARDTYPE()))) &&
            ((this.PCARDVERIFICATION==null && other.getPCARDVERIFICATION()==null) || 
             (this.PCARDVERIFICATION!=null &&
              java.util.Arrays.equals(this.PCARDVERIFICATION, other.getPCARDVERIFICATION()))) &&
            ((this.PERSONID==null && other.getPERSONID()==null) || 
             (this.PERSONID!=null &&
              java.util.Arrays.equals(this.PERSONID, other.getPERSONID()))) &&
            ((this.PERSONUID==null && other.getPERSONUID()==null) || 
             (this.PERSONUID!=null &&
              java.util.Arrays.equals(this.PERSONUID, other.getPERSONUID()))) &&
            ((this.POSTALCODE==null && other.getPOSTALCODE()==null) || 
             (this.POSTALCODE!=null &&
              java.util.Arrays.equals(this.POSTALCODE, other.getPOSTALCODE()))) &&
            ((this.PRIMARYSMS==null && other.getPRIMARYSMS()==null) || 
             (this.PRIMARYSMS!=null &&
              java.util.Arrays.equals(this.PRIMARYSMS, other.getPRIMARYSMS()))) &&
            ((this.REGIONDISTRICT==null && other.getREGIONDISTRICT()==null) || 
             (this.REGIONDISTRICT!=null &&
              java.util.Arrays.equals(this.REGIONDISTRICT, other.getREGIONDISTRICT()))) &&
            ((this.SENDERSYSID==null && other.getSENDERSYSID()==null) || 
             (this.SENDERSYSID!=null &&
              java.util.Arrays.equals(this.SENDERSYSID, other.getSENDERSYSID()))) &&
            ((this.SHIPTOADDRESS==null && other.getSHIPTOADDRESS()==null) || 
             (this.SHIPTOADDRESS!=null &&
              java.util.Arrays.equals(this.SHIPTOADDRESS, other.getSHIPTOADDRESS()))) &&
            ((this.SOURCESYSID==null && other.getSOURCESYSID()==null) || 
             (this.SOURCESYSID!=null &&
              java.util.Arrays.equals(this.SOURCESYSID, other.getSOURCESYSID()))) &&
            ((this.STATEPROVINCE==null && other.getSTATEPROVINCE()==null) || 
             (this.STATEPROVINCE!=null &&
              java.util.Arrays.equals(this.STATEPROVINCE, other.getSTATEPROVINCE()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              java.util.Arrays.equals(this.STATUS, other.getSTATUS()))) &&
            ((this.STATUSDATE==null && other.getSTATUSDATE()==null) || 
             (this.STATUSDATE!=null &&
              java.util.Arrays.equals(this.STATUSDATE, other.getSTATUSDATE()))) &&
            ((this.SUPERVISOR==null && other.getSUPERVISOR()==null) || 
             (this.SUPERVISOR!=null &&
              java.util.Arrays.equals(this.SUPERVISOR, other.getSUPERVISOR()))) &&
            ((this.TERMINATIONDATE==null && other.getTERMINATIONDATE()==null) || 
             (this.TERMINATIONDATE!=null &&
              java.util.Arrays.equals(this.TERMINATIONDATE, other.getTERMINATIONDATE()))) &&
            ((this.TIMEZONE==null && other.getTIMEZONE()==null) || 
             (this.TIMEZONE!=null &&
              java.util.Arrays.equals(this.TIMEZONE, other.getTIMEZONE()))) &&
            ((this.TITLE==null && other.getTITLE()==null) || 
             (this.TITLE!=null &&
              java.util.Arrays.equals(this.TITLE, other.getTITLE()))) &&
            ((this.TRANSEMAILELECTION==null && other.getTRANSEMAILELECTION()==null) || 
             (this.TRANSEMAILELECTION!=null &&
              java.util.Arrays.equals(this.TRANSEMAILELECTION, other.getTRANSEMAILELECTION()))) &&
            ((this.VIP==null && other.getVIP()==null) || 
             (this.VIP!=null &&
              java.util.Arrays.equals(this.VIP, other.getVIP()))) &&
            ((this.WFMAILELECTION==null && other.getWFMAILELECTION()==null) || 
             (this.WFMAILELECTION!=null &&
              java.util.Arrays.equals(this.WFMAILELECTION, other.getWFMAILELECTION()))) &&
            ((this.WOPRIORITY==null && other.getWOPRIORITY()==null) || 
             (this.WOPRIORITY!=null &&
              java.util.Arrays.equals(this.WOPRIORITY, other.getWOPRIORITY()))) &&
            ((this.PHONE==null && other.getPHONE()==null) || 
             (this.PHONE!=null &&
              this.PHONE.equals(other.getPHONE()))) &&
            ((this.EMAIL==null && other.getEMAIL()==null) || 
             (this.EMAIL!=null &&
              this.EMAIL.equals(other.getEMAIL()))) &&
            ((this.SMS==null && other.getSMS()==null) || 
             (this.SMS!=null &&
              this.SMS.equals(other.getSMS())));
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
        if (getACCEPTINGWFMAIL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACCEPTINGWFMAIL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACCEPTINGWFMAIL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getADDRESSLINE1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDRESSLINE1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDRESSLINE1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getADDRESSLINE2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDRESSLINE2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDRESSLINE2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getADDRESSLINE3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDRESSLINE3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDRESSLINE3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBILLTOADDRESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBILLTOADDRESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBILLTOADDRESS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBIRTHDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBIRTHDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBIRTHDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALTYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALTYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALTYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOUNTRY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOUNTRY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOUNTRY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOUNTY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOUNTY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOUNTY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDELEGATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDELEGATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDELEGATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDELEGATEFROMDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDELEGATEFROMDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDELEGATEFROMDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDELEGATETODATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDELEGATETODATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDELEGATETODATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDEPARTMENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDEPARTMENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDEPARTMENT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDEVICECLASS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDEVICECLASS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDEVICECLASS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDFLTAPP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFLTAPP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFLTAPP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDISPLAYNAME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDISPLAYNAME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDISPLAYNAME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDROPPOINT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDROPPOINT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDROPPOINT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEMPLOYEETYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEMPLOYEETYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEMPLOYEETYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEXTERNALREFID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEXTERNALREFID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEXTERNALREFID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFIRSTNAME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFIRSTNAME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFIRSTNAME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHIREDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHIREDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHIREDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIM_ID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIM_ID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIM_ID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJOBCODE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJOBCODE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJOBCODE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLANGUAGE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLANGUAGE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLANGUAGE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLASTEVALDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLASTEVALDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLASTEVALDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLASTNAME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLASTNAME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLASTNAME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCALE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCALE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOCALE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCATION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCATION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOCATION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCATIONORG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCATIONORG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOCATIONORG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCATIONSITE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCATIONSITE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOCATIONSITE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLOCTOSERVREQ() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOCTOSERVREQ());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOCTOSERVREQ(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNEXTEVALDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNEXTEVALDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNEXTEVALDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOWNERGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOWNERGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOWNERGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOWNERSYSID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOWNERSYSID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOWNERSYSID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCARDEXPDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCARDEXPDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCARDEXPDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCARDNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCARDNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCARDNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCARDTYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCARDTYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCARDTYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPCARDVERIFICATION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPCARDVERIFICATION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPCARDVERIFICATION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPERSONID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPERSONID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPERSONID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPERSONUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPERSONUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPERSONUID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPOSTALCODE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOSTALCODE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPOSTALCODE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPRIMARYSMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRIMARYSMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRIMARYSMS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREGIONDISTRICT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREGIONDISTRICT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREGIONDISTRICT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSENDERSYSID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSENDERSYSID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSENDERSYSID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSHIPTOADDRESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSHIPTOADDRESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSHIPTOADDRESS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSOURCESYSID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSOURCESYSID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSOURCESYSID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTATEPROVINCE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTATEPROVINCE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTATEPROVINCE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTATUSDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTATUSDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTATUSDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSUPERVISOR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSUPERVISOR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSUPERVISOR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTERMINATIONDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTERMINATIONDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTERMINATIONDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTIMEZONE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTIMEZONE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTIMEZONE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTITLE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTITLE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTITLE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTRANSEMAILELECTION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTRANSEMAILELECTION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTRANSEMAILELECTION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVIP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVIP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVIP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWFMAILELECTION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWFMAILELECTION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWFMAILELECTION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOPRIORITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOPRIORITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOPRIORITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPHONE() != null) {
            _hashCode += getPHONE().hashCode();
        }
        if (getEMAIL() != null) {
            _hashCode += getEMAIL().hashCode();
        }
        if (getSMS() != null) {
            _hashCode += getSMS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXPERSONQueryTypePERSON.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXPERSONQueryType>PERSON"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCEPTINGWFMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACCEPTINGWFMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDRESSLINE3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ADDRESSLINE3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BILLTOADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BILLTOADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIRTHDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BIRTHDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COUNTRY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COUNTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATEFROMDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATEFROMDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DELEGATETODATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DELEGATETODATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPARTMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DEPARTMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEVICECLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DEVICECLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFLTAPP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DFLTAPP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISPLAYNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DISPLAYNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DROPPOINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DROPPOINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMPLOYEETYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMPLOYEETYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTERNALREFID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EXTERNALREFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRSTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FIRSTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HIREDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HIREDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IM_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IM_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JOBCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JOBCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LANGUAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LANGUAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTEVALDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTEVALDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCALE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCALE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATIONORG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATIONORG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCATIONSITE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCATIONSITE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCTOSERVREQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOCTOSERVREQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEXTEVALDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NEXTEVALDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNERGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNERGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNERSYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNERSYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDEXPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDEXPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCARDVERIFICATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PCARDVERIFICATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSTALCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "POSTALCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRIMARYSMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PRIMARYSMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIONDISTRICT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REGIONDISTRICT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDERSYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SENDERSYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SHIPTOADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SHIPTOADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOURCESYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SOURCESYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATEPROVINCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATEPROVINCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUSDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STATUSDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUPERVISOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SUPERVISOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TERMINATIONDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TERMINATIONDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIMEZONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TIMEZONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSEMAILELECTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TRANSEMAILELECTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WFMAILELECTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WFMAILELECTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>PHONE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EMAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>EMAIL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>SMS"));
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
