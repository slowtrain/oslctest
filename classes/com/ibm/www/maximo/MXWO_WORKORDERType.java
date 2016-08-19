/**
 * MXWO_WORKORDERType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXWO_WORKORDERType  implements java.io.Serializable {
    private java.lang.String MAXINTERRORMSG;

    private com.ibm.www.maximo.MXDateTimeType ACTFINISH;

    private com.ibm.www.maximo.MXDoubleType ACTINTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ACTINTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ACTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ACTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ACTMATCOST;

    private com.ibm.www.maximo.MXDoubleType ACTOUTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ACTOUTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ACTSERVCOST;

    private com.ibm.www.maximo.MXDateTimeType ACTSTART;

    private com.ibm.www.maximo.MXDoubleType ACTTOOLCOST;

    private com.ibm.www.maximo.MXStringType AMCREW;

    private com.ibm.www.maximo.MXBooleanType AMS;

    private com.ibm.www.maximo.MXBooleanType AOS;

    private com.ibm.www.maximo.MXBooleanType APPTREQUIRED;

    private com.ibm.www.maximo.MXLongType ASSETLOCPRIORITY;

    private com.ibm.www.maximo.MXStringType ASSETNUM;

    private com.ibm.www.maximo.MXStringType ASSIGNEDOWNERGROUP;

    private com.ibm.www.maximo.MXDateTimeType AVAILSTATUSDATE;

    private com.ibm.www.maximo.MXStringType BACKOUTPLAN;

    private com.ibm.www.maximo.MXStringType CALCCALENDAR;

    private com.ibm.www.maximo.MXStringType CALCORGID;

    private com.ibm.www.maximo.MXLongType CALCPRIORITY;

    private com.ibm.www.maximo.MXStringType CALCSHIFT;

    private com.ibm.www.maximo.MXStringType CALENDAR;

    private com.ibm.www.maximo.MXStringType CHANGEBY;

    private com.ibm.www.maximo.MXDateTimeType CHANGEDATE;

    private com.ibm.www.maximo.MXBooleanType CHARGESTORE;

    private com.ibm.www.maximo.MXStringType CINUM;

    private com.ibm.www.maximo.MXStringType CLASSSTRUCTUREID;

    private com.ibm.www.maximo.MXStringType COMMODITY;

    private com.ibm.www.maximo.MXStringType COMMODITYGROUP;

    private com.ibm.www.maximo.MXStringType CONTRACT;

    private com.ibm.www.maximo.MXStringType CREWID;

    private com.ibm.www.maximo.MXStringType CREWWORKGROUP;

    private com.ibm.www.maximo.MXStringType DESCRIPTION;

    private com.ibm.www.maximo.MXStringType DESCRIPTION_LONGDESCRIPTION;

    private com.ibm.www.maximo.MXDomainType DIRISSUEMTLSTATUS;

    private com.ibm.www.maximo.MXBooleanType DISABLED;

    private com.ibm.www.maximo.MXBooleanType DOWNTIME;

    private com.ibm.www.maximo.MXStringType ENVIRONMENT;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRMATCOST;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRSERVCOST;

    private com.ibm.www.maximo.MXDoubleType ESTATAPPRTOOLCOST;

    private com.ibm.www.maximo.MXDoubleType ESTDUR;

    private com.ibm.www.maximo.MXDoubleType ESTINTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTINTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTMATCOST;

    private com.ibm.www.maximo.MXDoubleType ESTOUTLABCOST;

    private com.ibm.www.maximo.MXDoubleType ESTOUTLABHRS;

    private com.ibm.www.maximo.MXDoubleType ESTSERVCOST;

    private com.ibm.www.maximo.MXDoubleType ESTTOOLCOST;

    private com.ibm.www.maximo.MXStringType EXTERNALREFID;

    private com.ibm.www.maximo.MXDateTimeType FAILDATE;

    private com.ibm.www.maximo.MXStringType FAILURECODE;

    private com.ibm.www.maximo.MXStringType FCPROJECTID;

    private com.ibm.www.maximo.MXStringType FCTASKID;

    private com.ibm.www.maximo.MXStringType FINCNTRLID;

    private com.ibm.www.maximo.MXStringType FIRSTAPPRSTATUS;

    private com.ibm.www.maximo.MXStringType FLOWACTION;

    private com.ibm.www.maximo.MXBooleanType FLOWACTIONASSIST;

    private com.ibm.www.maximo.MXBooleanType FLOWCONTROLLED;

    private com.ibm.www.maximo.MXDateTimeType FNLCONSTRAINT;

    private com.ibm.www.maximo.MXStringType GENERATEDFORPO;

    private com.ibm.www.maximo.MXLongType GENFORPOLINEID;

    private com.ibm.www.maximo.MXLongType GENFORPOREVISION;

    private com.ibm.www.maximo.MXGLAccountType GLACCOUNT;

    private com.ibm.www.maximo.MXBooleanType HASCHILDREN;

    private com.ibm.www.maximo.MXBooleanType HASFOLLOWUPWORK;

    private com.ibm.www.maximo.MXBooleanType HISTORYFLAG;

    private com.ibm.www.maximo.MXBooleanType IGNOREDIAVAIL;

    private com.ibm.www.maximo.MXBooleanType IGNORESRMAVAIL;

    private com.ibm.www.maximo.MXBooleanType INCTASKSINSCHED;

    private com.ibm.www.maximo.MXStringType INSPECTOR;

    private com.ibm.www.maximo.MXBooleanType INTERRUPTIBLE;

    private com.ibm.www.maximo.MXBooleanType ISTASK;

    private com.ibm.www.maximo.MXLongType JOBTASKID;

    private com.ibm.www.maximo.MXStringType JPNUM;

    private com.ibm.www.maximo.MXStringType JUSTIFYPRIORITY;

    private com.ibm.www.maximo.MXDateTimeType LASTCOPYLINKDATE;

    private com.ibm.www.maximo.MXStringType LAUNCHENTRYNAME;

    private com.ibm.www.maximo.MXStringType LEAD;

    private com.ibm.www.maximo.MXBooleanType LMS;

    private com.ibm.www.maximo.MXStringType LOCATION;

    private com.ibm.www.maximo.MXBooleanType LOS;

    private com.ibm.www.maximo.MXDateTimeType MEASUREDATE;

    private com.ibm.www.maximo.MXDoubleType MEASUREMENTVALUE;

    private com.ibm.www.maximo.MXBooleanType NESTEDJPINPROCESS;

    private com.ibm.www.maximo.MXStringType NEWCHILDCLASS;

    private com.ibm.www.maximo.MXStringType NP_STATUSMEMO;

    private com.ibm.www.maximo.MXStringType OBSERVATION;

    private com.ibm.www.maximo.MXStringType ONBEHALFOF;

    private com.ibm.www.maximo.MXStringType ORGID;

    private com.ibm.www.maximo.MXStringType ORIGRECORDCLASS;

    private com.ibm.www.maximo.MXStringType ORIGRECORDID;

    private com.ibm.www.maximo.MXDoubleType OUTLABCOST;

    private com.ibm.www.maximo.MXDoubleType OUTMATCOST;

    private com.ibm.www.maximo.MXDoubleType OUTTOOLCOST;

    private com.ibm.www.maximo.MXStringType OWNER;

    private com.ibm.www.maximo.MXStringType OWNERGROUP;

    private com.ibm.www.maximo.MXStringType OWNERSYSID;

    private com.ibm.www.maximo.MXStringType PARENT;

    private com.ibm.www.maximo.MXBooleanType PARENTCHGSSTATUS;

    private com.ibm.www.maximo.MXStringType PERSONGROUP;

    private com.ibm.www.maximo.MXStringType PHONE;

    private com.ibm.www.maximo.MXLongType PLUSCFREQUENCY;

    private com.ibm.www.maximo.MXDomainType PLUSCFREQUNIT;

    private com.ibm.www.maximo.MXBooleanType PLUSCISMOBILE;

    private com.ibm.www.maximo.MXLongType PLUSCJPREVNUM;

    private com.ibm.www.maximo.MXBooleanType PLUSCLOOP;

    private com.ibm.www.maximo.MXDateTimeType PLUSCNEXTDATE;

    private com.ibm.www.maximo.MXDateTimeType PLUSCOVERDUEDATE;

    private com.ibm.www.maximo.MXStringType PLUSCPHYLOC;

    private com.ibm.www.maximo.MXDateTimeType PMDUEDATE;

    private com.ibm.www.maximo.MXDateTimeType PMEXTDATE;

    private com.ibm.www.maximo.MXDateTimeType PMNEXTDUEDATE;

    private com.ibm.www.maximo.MXStringType PMNUM;

    private com.ibm.www.maximo.MXStringType POINTNUM;

    private com.ibm.www.maximo.MXStringType PROBLEMCODE;

    private com.ibm.www.maximo.MXStringType REASONFORCHANGE;

    private com.ibm.www.maximo.MXDoubleType REMDUR;

    private com.ibm.www.maximo.MXStringType REPAIRFACILITY;

    private com.ibm.www.maximo.MXStringType REPFACSITEID;

    private com.ibm.www.maximo.MXDateTimeType REPORTDATE;

    private com.ibm.www.maximo.MXStringType REPORTEDBY;

    private com.ibm.www.maximo.MXBooleanType REQASSTDWNTIME;

    private com.ibm.www.maximo.MXDateTimeType RESPONDBY;

    private com.ibm.www.maximo.MXStringType RISK;

    private com.ibm.www.maximo.MXStringType ROUTE;

    private com.ibm.www.maximo.MXLongType ROUTESTOPID;

    private com.ibm.www.maximo.MXDateTimeType SCHEDFINISH;

    private com.ibm.www.maximo.MXDateTimeType SCHEDSTART;

    private com.ibm.www.maximo.MXStringType SENDERSYSID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType SITEID;

    private com.ibm.www.maximo.MXDateTimeType SNECONSTRAINT;

    private com.ibm.www.maximo.MXStringType SOURCESYSID;

    private com.ibm.www.maximo.MXDomainType STATUS;

    private com.ibm.www.maximo.MXDateTimeType STATUSDATE;

    private com.ibm.www.maximo.MXBooleanType STATUSIFACE;

    private com.ibm.www.maximo.MXDomainType STOREROOMMTLSTATUS;

    private com.ibm.www.maximo.MXStringType SUPERVISOR;

    private com.ibm.www.maximo.MXBooleanType SUSPENDFLOW;

    private com.ibm.www.maximo.MXDateTimeType TARGCOMPDATE;

    private com.ibm.www.maximo.MXStringType TARGETDESC;

    private com.ibm.www.maximo.MXDateTimeType TARGSTARTDATE;

    private com.ibm.www.maximo.MXLongType TASKID;

    private com.ibm.www.maximo.MXStringType VENDOR;

    private com.ibm.www.maximo.MXStringType VERIFICATION;

    private com.ibm.www.maximo.MXStringType WHOMISCHANGEFOR;

    private com.ibm.www.maximo.MXBooleanType WOACCEPTSCHARGES;

    private com.ibm.www.maximo.MXDomainType WOCLASS;

    private com.ibm.www.maximo.MXStringType WOEQ1;

    private com.ibm.www.maximo.MXStringType WOEQ10;

    private com.ibm.www.maximo.MXStringType WOEQ11;

    private com.ibm.www.maximo.MXDoubleType WOEQ12;

    private com.ibm.www.maximo.MXDateTimeType WOEQ13;

    private com.ibm.www.maximo.MXDoubleType WOEQ14;

    private com.ibm.www.maximo.MXStringType WOEQ2;

    private com.ibm.www.maximo.MXStringType WOEQ3;

    private com.ibm.www.maximo.MXStringType WOEQ4;

    private com.ibm.www.maximo.MXDoubleType WOEQ5;

    private com.ibm.www.maximo.MXDateTimeType WOEQ6;

    private com.ibm.www.maximo.MXDoubleType WOEQ7;

    private com.ibm.www.maximo.MXStringType WOEQ8;

    private com.ibm.www.maximo.MXStringType WOEQ9;

    private com.ibm.www.maximo.MXStringType WOGROUP;

    private com.ibm.www.maximo.MXBooleanType WOISSWAP;

    private com.ibm.www.maximo.MXStringType WOJO1;

    private com.ibm.www.maximo.MXStringType WOJO2;

    private com.ibm.www.maximo.MXStringType WOJO3;

    private com.ibm.www.maximo.MXDoubleType WOJO4;

    private com.ibm.www.maximo.MXStringType WOJO5;

    private com.ibm.www.maximo.MXStringType WOJO6;

    private com.ibm.www.maximo.MXStringType WOJO7;

    private com.ibm.www.maximo.MXStringType WOJO8;

    private com.ibm.www.maximo.MXStringType WOJP1;

    private com.ibm.www.maximo.MXStringType WOJP2;

    private com.ibm.www.maximo.MXStringType WOJP3;

    private com.ibm.www.maximo.MXDoubleType WOJP4;

    private com.ibm.www.maximo.MXDateTimeType WOJP5;

    private com.ibm.www.maximo.MXStringType WOL1;

    private com.ibm.www.maximo.MXStringType WOL2;

    private com.ibm.www.maximo.MXDoubleType WOL3;

    private com.ibm.www.maximo.MXDateTimeType WOL4;

    private com.ibm.www.maximo.MXStringType WOLABLNK;

    private com.ibm.www.maximo.MXStringType WOLO1;

    private com.ibm.www.maximo.MXLongType WOLO10;

    private com.ibm.www.maximo.MXStringType WOLO2;

    private com.ibm.www.maximo.MXStringType WOLO3;

    private com.ibm.www.maximo.MXStringType WOLO4;

    private com.ibm.www.maximo.MXStringType WOLO5;

    private com.ibm.www.maximo.MXDoubleType WOLO6;

    private com.ibm.www.maximo.MXDateTimeType WOLO7;

    private com.ibm.www.maximo.MXDoubleType WOLO8;

    private com.ibm.www.maximo.MXStringType WOLO9;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringType WONUM;

    private com.ibm.www.maximo.MXLongType WOPRIORITY;

    private com.ibm.www.maximo.MXStringType WORKLOCATION;

    private com.ibm.www.maximo.MXLongType WORKORDERID;

    private com.ibm.www.maximo.MXDomainType WORKPACKMTLSTATUS;

    private com.ibm.www.maximo.MXStringType WORKTYPE;

    private com.ibm.www.maximo.MXStringType WORTS1;

    private com.ibm.www.maximo.MXStringType WORTS2;

    private com.ibm.www.maximo.MXStringType WORTS3;

    private com.ibm.www.maximo.MXDateTimeType WORTS4;

    private com.ibm.www.maximo.MXDoubleType WORTS5;

    private com.ibm.www.maximo.MXLongType WOSEQUENCE;

    private com.ibm.www.maximo.ProcessingActionType action;  // attribute

    private java.lang.String relationship;  // attribute

    private java.lang.String deleteForInsert;  // attribute

    private java.lang.String transLanguage;  // attribute

    public MXWO_WORKORDERType() {
    }

    public MXWO_WORKORDERType(
           java.lang.String MAXINTERRORMSG,
           com.ibm.www.maximo.MXDateTimeType ACTFINISH,
           com.ibm.www.maximo.MXDoubleType ACTINTLABCOST,
           com.ibm.www.maximo.MXDoubleType ACTINTLABHRS,
           com.ibm.www.maximo.MXDoubleType ACTLABCOST,
           com.ibm.www.maximo.MXDoubleType ACTLABHRS,
           com.ibm.www.maximo.MXDoubleType ACTMATCOST,
           com.ibm.www.maximo.MXDoubleType ACTOUTLABCOST,
           com.ibm.www.maximo.MXDoubleType ACTOUTLABHRS,
           com.ibm.www.maximo.MXDoubleType ACTSERVCOST,
           com.ibm.www.maximo.MXDateTimeType ACTSTART,
           com.ibm.www.maximo.MXDoubleType ACTTOOLCOST,
           com.ibm.www.maximo.MXStringType AMCREW,
           com.ibm.www.maximo.MXBooleanType AMS,
           com.ibm.www.maximo.MXBooleanType AOS,
           com.ibm.www.maximo.MXBooleanType APPTREQUIRED,
           com.ibm.www.maximo.MXLongType ASSETLOCPRIORITY,
           com.ibm.www.maximo.MXStringType ASSETNUM,
           com.ibm.www.maximo.MXStringType ASSIGNEDOWNERGROUP,
           com.ibm.www.maximo.MXDateTimeType AVAILSTATUSDATE,
           com.ibm.www.maximo.MXStringType BACKOUTPLAN,
           com.ibm.www.maximo.MXStringType CALCCALENDAR,
           com.ibm.www.maximo.MXStringType CALCORGID,
           com.ibm.www.maximo.MXLongType CALCPRIORITY,
           com.ibm.www.maximo.MXStringType CALCSHIFT,
           com.ibm.www.maximo.MXStringType CALENDAR,
           com.ibm.www.maximo.MXStringType CHANGEBY,
           com.ibm.www.maximo.MXDateTimeType CHANGEDATE,
           com.ibm.www.maximo.MXBooleanType CHARGESTORE,
           com.ibm.www.maximo.MXStringType CINUM,
           com.ibm.www.maximo.MXStringType CLASSSTRUCTUREID,
           com.ibm.www.maximo.MXStringType COMMODITY,
           com.ibm.www.maximo.MXStringType COMMODITYGROUP,
           com.ibm.www.maximo.MXStringType CONTRACT,
           com.ibm.www.maximo.MXStringType CREWID,
           com.ibm.www.maximo.MXStringType CREWWORKGROUP,
           com.ibm.www.maximo.MXStringType DESCRIPTION,
           com.ibm.www.maximo.MXStringType DESCRIPTION_LONGDESCRIPTION,
           com.ibm.www.maximo.MXDomainType DIRISSUEMTLSTATUS,
           com.ibm.www.maximo.MXBooleanType DISABLED,
           com.ibm.www.maximo.MXBooleanType DOWNTIME,
           com.ibm.www.maximo.MXStringType ENVIRONMENT,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRMATCOST,
           com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRSERVCOST,
           com.ibm.www.maximo.MXDoubleType ESTATAPPRTOOLCOST,
           com.ibm.www.maximo.MXDoubleType ESTDUR,
           com.ibm.www.maximo.MXDoubleType ESTINTLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTINTLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTMATCOST,
           com.ibm.www.maximo.MXDoubleType ESTOUTLABCOST,
           com.ibm.www.maximo.MXDoubleType ESTOUTLABHRS,
           com.ibm.www.maximo.MXDoubleType ESTSERVCOST,
           com.ibm.www.maximo.MXDoubleType ESTTOOLCOST,
           com.ibm.www.maximo.MXStringType EXTERNALREFID,
           com.ibm.www.maximo.MXDateTimeType FAILDATE,
           com.ibm.www.maximo.MXStringType FAILURECODE,
           com.ibm.www.maximo.MXStringType FCPROJECTID,
           com.ibm.www.maximo.MXStringType FCTASKID,
           com.ibm.www.maximo.MXStringType FINCNTRLID,
           com.ibm.www.maximo.MXStringType FIRSTAPPRSTATUS,
           com.ibm.www.maximo.MXStringType FLOWACTION,
           com.ibm.www.maximo.MXBooleanType FLOWACTIONASSIST,
           com.ibm.www.maximo.MXBooleanType FLOWCONTROLLED,
           com.ibm.www.maximo.MXDateTimeType FNLCONSTRAINT,
           com.ibm.www.maximo.MXStringType GENERATEDFORPO,
           com.ibm.www.maximo.MXLongType GENFORPOLINEID,
           com.ibm.www.maximo.MXLongType GENFORPOREVISION,
           com.ibm.www.maximo.MXGLAccountType GLACCOUNT,
           com.ibm.www.maximo.MXBooleanType HASCHILDREN,
           com.ibm.www.maximo.MXBooleanType HASFOLLOWUPWORK,
           com.ibm.www.maximo.MXBooleanType HISTORYFLAG,
           com.ibm.www.maximo.MXBooleanType IGNOREDIAVAIL,
           com.ibm.www.maximo.MXBooleanType IGNORESRMAVAIL,
           com.ibm.www.maximo.MXBooleanType INCTASKSINSCHED,
           com.ibm.www.maximo.MXStringType INSPECTOR,
           com.ibm.www.maximo.MXBooleanType INTERRUPTIBLE,
           com.ibm.www.maximo.MXBooleanType ISTASK,
           com.ibm.www.maximo.MXLongType JOBTASKID,
           com.ibm.www.maximo.MXStringType JPNUM,
           com.ibm.www.maximo.MXStringType JUSTIFYPRIORITY,
           com.ibm.www.maximo.MXDateTimeType LASTCOPYLINKDATE,
           com.ibm.www.maximo.MXStringType LAUNCHENTRYNAME,
           com.ibm.www.maximo.MXStringType LEAD,
           com.ibm.www.maximo.MXBooleanType LMS,
           com.ibm.www.maximo.MXStringType LOCATION,
           com.ibm.www.maximo.MXBooleanType LOS,
           com.ibm.www.maximo.MXDateTimeType MEASUREDATE,
           com.ibm.www.maximo.MXDoubleType MEASUREMENTVALUE,
           com.ibm.www.maximo.MXBooleanType NESTEDJPINPROCESS,
           com.ibm.www.maximo.MXStringType NEWCHILDCLASS,
           com.ibm.www.maximo.MXStringType NP_STATUSMEMO,
           com.ibm.www.maximo.MXStringType OBSERVATION,
           com.ibm.www.maximo.MXStringType ONBEHALFOF,
           com.ibm.www.maximo.MXStringType ORGID,
           com.ibm.www.maximo.MXStringType ORIGRECORDCLASS,
           com.ibm.www.maximo.MXStringType ORIGRECORDID,
           com.ibm.www.maximo.MXDoubleType OUTLABCOST,
           com.ibm.www.maximo.MXDoubleType OUTMATCOST,
           com.ibm.www.maximo.MXDoubleType OUTTOOLCOST,
           com.ibm.www.maximo.MXStringType OWNER,
           com.ibm.www.maximo.MXStringType OWNERGROUP,
           com.ibm.www.maximo.MXStringType OWNERSYSID,
           com.ibm.www.maximo.MXStringType PARENT,
           com.ibm.www.maximo.MXBooleanType PARENTCHGSSTATUS,
           com.ibm.www.maximo.MXStringType PERSONGROUP,
           com.ibm.www.maximo.MXStringType PHONE,
           com.ibm.www.maximo.MXLongType PLUSCFREQUENCY,
           com.ibm.www.maximo.MXDomainType PLUSCFREQUNIT,
           com.ibm.www.maximo.MXBooleanType PLUSCISMOBILE,
           com.ibm.www.maximo.MXLongType PLUSCJPREVNUM,
           com.ibm.www.maximo.MXBooleanType PLUSCLOOP,
           com.ibm.www.maximo.MXDateTimeType PLUSCNEXTDATE,
           com.ibm.www.maximo.MXDateTimeType PLUSCOVERDUEDATE,
           com.ibm.www.maximo.MXStringType PLUSCPHYLOC,
           com.ibm.www.maximo.MXDateTimeType PMDUEDATE,
           com.ibm.www.maximo.MXDateTimeType PMEXTDATE,
           com.ibm.www.maximo.MXDateTimeType PMNEXTDUEDATE,
           com.ibm.www.maximo.MXStringType PMNUM,
           com.ibm.www.maximo.MXStringType POINTNUM,
           com.ibm.www.maximo.MXStringType PROBLEMCODE,
           com.ibm.www.maximo.MXStringType REASONFORCHANGE,
           com.ibm.www.maximo.MXDoubleType REMDUR,
           com.ibm.www.maximo.MXStringType REPAIRFACILITY,
           com.ibm.www.maximo.MXStringType REPFACSITEID,
           com.ibm.www.maximo.MXDateTimeType REPORTDATE,
           com.ibm.www.maximo.MXStringType REPORTEDBY,
           com.ibm.www.maximo.MXBooleanType REQASSTDWNTIME,
           com.ibm.www.maximo.MXDateTimeType RESPONDBY,
           com.ibm.www.maximo.MXStringType RISK,
           com.ibm.www.maximo.MXStringType ROUTE,
           com.ibm.www.maximo.MXLongType ROUTESTOPID,
           com.ibm.www.maximo.MXDateTimeType SCHEDFINISH,
           com.ibm.www.maximo.MXDateTimeType SCHEDSTART,
           com.ibm.www.maximo.MXStringType SENDERSYSID,
           com.ibm.www.maximo.MXStringType SITEID,
           com.ibm.www.maximo.MXDateTimeType SNECONSTRAINT,
           com.ibm.www.maximo.MXStringType SOURCESYSID,
           com.ibm.www.maximo.MXDomainType STATUS,
           com.ibm.www.maximo.MXDateTimeType STATUSDATE,
           com.ibm.www.maximo.MXBooleanType STATUSIFACE,
           com.ibm.www.maximo.MXDomainType STOREROOMMTLSTATUS,
           com.ibm.www.maximo.MXStringType SUPERVISOR,
           com.ibm.www.maximo.MXBooleanType SUSPENDFLOW,
           com.ibm.www.maximo.MXDateTimeType TARGCOMPDATE,
           com.ibm.www.maximo.MXStringType TARGETDESC,
           com.ibm.www.maximo.MXDateTimeType TARGSTARTDATE,
           com.ibm.www.maximo.MXLongType TASKID,
           com.ibm.www.maximo.MXStringType VENDOR,
           com.ibm.www.maximo.MXStringType VERIFICATION,
           com.ibm.www.maximo.MXStringType WHOMISCHANGEFOR,
           com.ibm.www.maximo.MXBooleanType WOACCEPTSCHARGES,
           com.ibm.www.maximo.MXDomainType WOCLASS,
           com.ibm.www.maximo.MXStringType WOEQ1,
           com.ibm.www.maximo.MXStringType WOEQ10,
           com.ibm.www.maximo.MXStringType WOEQ11,
           com.ibm.www.maximo.MXDoubleType WOEQ12,
           com.ibm.www.maximo.MXDateTimeType WOEQ13,
           com.ibm.www.maximo.MXDoubleType WOEQ14,
           com.ibm.www.maximo.MXStringType WOEQ2,
           com.ibm.www.maximo.MXStringType WOEQ3,
           com.ibm.www.maximo.MXStringType WOEQ4,
           com.ibm.www.maximo.MXDoubleType WOEQ5,
           com.ibm.www.maximo.MXDateTimeType WOEQ6,
           com.ibm.www.maximo.MXDoubleType WOEQ7,
           com.ibm.www.maximo.MXStringType WOEQ8,
           com.ibm.www.maximo.MXStringType WOEQ9,
           com.ibm.www.maximo.MXStringType WOGROUP,
           com.ibm.www.maximo.MXBooleanType WOISSWAP,
           com.ibm.www.maximo.MXStringType WOJO1,
           com.ibm.www.maximo.MXStringType WOJO2,
           com.ibm.www.maximo.MXStringType WOJO3,
           com.ibm.www.maximo.MXDoubleType WOJO4,
           com.ibm.www.maximo.MXStringType WOJO5,
           com.ibm.www.maximo.MXStringType WOJO6,
           com.ibm.www.maximo.MXStringType WOJO7,
           com.ibm.www.maximo.MXStringType WOJO8,
           com.ibm.www.maximo.MXStringType WOJP1,
           com.ibm.www.maximo.MXStringType WOJP2,
           com.ibm.www.maximo.MXStringType WOJP3,
           com.ibm.www.maximo.MXDoubleType WOJP4,
           com.ibm.www.maximo.MXDateTimeType WOJP5,
           com.ibm.www.maximo.MXStringType WOL1,
           com.ibm.www.maximo.MXStringType WOL2,
           com.ibm.www.maximo.MXDoubleType WOL3,
           com.ibm.www.maximo.MXDateTimeType WOL4,
           com.ibm.www.maximo.MXStringType WOLABLNK,
           com.ibm.www.maximo.MXStringType WOLO1,
           com.ibm.www.maximo.MXLongType WOLO10,
           com.ibm.www.maximo.MXStringType WOLO2,
           com.ibm.www.maximo.MXStringType WOLO3,
           com.ibm.www.maximo.MXStringType WOLO4,
           com.ibm.www.maximo.MXStringType WOLO5,
           com.ibm.www.maximo.MXDoubleType WOLO6,
           com.ibm.www.maximo.MXDateTimeType WOLO7,
           com.ibm.www.maximo.MXDoubleType WOLO8,
           com.ibm.www.maximo.MXStringType WOLO9,
           com.ibm.www.maximo.MXStringType WONUM,
           com.ibm.www.maximo.MXLongType WOPRIORITY,
           com.ibm.www.maximo.MXStringType WORKLOCATION,
           com.ibm.www.maximo.MXLongType WORKORDERID,
           com.ibm.www.maximo.MXDomainType WORKPACKMTLSTATUS,
           com.ibm.www.maximo.MXStringType WORKTYPE,
           com.ibm.www.maximo.MXStringType WORTS1,
           com.ibm.www.maximo.MXStringType WORTS2,
           com.ibm.www.maximo.MXStringType WORTS3,
           com.ibm.www.maximo.MXDateTimeType WORTS4,
           com.ibm.www.maximo.MXDoubleType WORTS5,
           com.ibm.www.maximo.MXLongType WOSEQUENCE,
           com.ibm.www.maximo.ProcessingActionType action,
           java.lang.String relationship,
           java.lang.String deleteForInsert,
           java.lang.String transLanguage) {
           this.MAXINTERRORMSG = MAXINTERRORMSG;
           this.ACTFINISH = ACTFINISH;
           this.ACTINTLABCOST = ACTINTLABCOST;
           this.ACTINTLABHRS = ACTINTLABHRS;
           this.ACTLABCOST = ACTLABCOST;
           this.ACTLABHRS = ACTLABHRS;
           this.ACTMATCOST = ACTMATCOST;
           this.ACTOUTLABCOST = ACTOUTLABCOST;
           this.ACTOUTLABHRS = ACTOUTLABHRS;
           this.ACTSERVCOST = ACTSERVCOST;
           this.ACTSTART = ACTSTART;
           this.ACTTOOLCOST = ACTTOOLCOST;
           this.AMCREW = AMCREW;
           this.AMS = AMS;
           this.AOS = AOS;
           this.APPTREQUIRED = APPTREQUIRED;
           this.ASSETLOCPRIORITY = ASSETLOCPRIORITY;
           this.ASSETNUM = ASSETNUM;
           this.ASSIGNEDOWNERGROUP = ASSIGNEDOWNERGROUP;
           this.AVAILSTATUSDATE = AVAILSTATUSDATE;
           this.BACKOUTPLAN = BACKOUTPLAN;
           this.CALCCALENDAR = CALCCALENDAR;
           this.CALCORGID = CALCORGID;
           this.CALCPRIORITY = CALCPRIORITY;
           this.CALCSHIFT = CALCSHIFT;
           this.CALENDAR = CALENDAR;
           this.CHANGEBY = CHANGEBY;
           this.CHANGEDATE = CHANGEDATE;
           this.CHARGESTORE = CHARGESTORE;
           this.CINUM = CINUM;
           this.CLASSSTRUCTUREID = CLASSSTRUCTUREID;
           this.COMMODITY = COMMODITY;
           this.COMMODITYGROUP = COMMODITYGROUP;
           this.CONTRACT = CONTRACT;
           this.CREWID = CREWID;
           this.CREWWORKGROUP = CREWWORKGROUP;
           this.DESCRIPTION = DESCRIPTION;
           this.DESCRIPTION_LONGDESCRIPTION = DESCRIPTION_LONGDESCRIPTION;
           this.DIRISSUEMTLSTATUS = DIRISSUEMTLSTATUS;
           this.DISABLED = DISABLED;
           this.DOWNTIME = DOWNTIME;
           this.ENVIRONMENT = ENVIRONMENT;
           this.ESTATAPPRINTLABCOST = ESTATAPPRINTLABCOST;
           this.ESTATAPPRINTLABHRS = ESTATAPPRINTLABHRS;
           this.ESTATAPPRLABCOST = ESTATAPPRLABCOST;
           this.ESTATAPPRLABHRS = ESTATAPPRLABHRS;
           this.ESTATAPPRMATCOST = ESTATAPPRMATCOST;
           this.ESTATAPPROUTLABCOST = ESTATAPPROUTLABCOST;
           this.ESTATAPPROUTLABHRS = ESTATAPPROUTLABHRS;
           this.ESTATAPPRSERVCOST = ESTATAPPRSERVCOST;
           this.ESTATAPPRTOOLCOST = ESTATAPPRTOOLCOST;
           this.ESTDUR = ESTDUR;
           this.ESTINTLABCOST = ESTINTLABCOST;
           this.ESTINTLABHRS = ESTINTLABHRS;
           this.ESTLABCOST = ESTLABCOST;
           this.ESTLABHRS = ESTLABHRS;
           this.ESTMATCOST = ESTMATCOST;
           this.ESTOUTLABCOST = ESTOUTLABCOST;
           this.ESTOUTLABHRS = ESTOUTLABHRS;
           this.ESTSERVCOST = ESTSERVCOST;
           this.ESTTOOLCOST = ESTTOOLCOST;
           this.EXTERNALREFID = EXTERNALREFID;
           this.FAILDATE = FAILDATE;
           this.FAILURECODE = FAILURECODE;
           this.FCPROJECTID = FCPROJECTID;
           this.FCTASKID = FCTASKID;
           this.FINCNTRLID = FINCNTRLID;
           this.FIRSTAPPRSTATUS = FIRSTAPPRSTATUS;
           this.FLOWACTION = FLOWACTION;
           this.FLOWACTIONASSIST = FLOWACTIONASSIST;
           this.FLOWCONTROLLED = FLOWCONTROLLED;
           this.FNLCONSTRAINT = FNLCONSTRAINT;
           this.GENERATEDFORPO = GENERATEDFORPO;
           this.GENFORPOLINEID = GENFORPOLINEID;
           this.GENFORPOREVISION = GENFORPOREVISION;
           this.GLACCOUNT = GLACCOUNT;
           this.HASCHILDREN = HASCHILDREN;
           this.HASFOLLOWUPWORK = HASFOLLOWUPWORK;
           this.HISTORYFLAG = HISTORYFLAG;
           this.IGNOREDIAVAIL = IGNOREDIAVAIL;
           this.IGNORESRMAVAIL = IGNORESRMAVAIL;
           this.INCTASKSINSCHED = INCTASKSINSCHED;
           this.INSPECTOR = INSPECTOR;
           this.INTERRUPTIBLE = INTERRUPTIBLE;
           this.ISTASK = ISTASK;
           this.JOBTASKID = JOBTASKID;
           this.JPNUM = JPNUM;
           this.JUSTIFYPRIORITY = JUSTIFYPRIORITY;
           this.LASTCOPYLINKDATE = LASTCOPYLINKDATE;
           this.LAUNCHENTRYNAME = LAUNCHENTRYNAME;
           this.LEAD = LEAD;
           this.LMS = LMS;
           this.LOCATION = LOCATION;
           this.LOS = LOS;
           this.MEASUREDATE = MEASUREDATE;
           this.MEASUREMENTVALUE = MEASUREMENTVALUE;
           this.NESTEDJPINPROCESS = NESTEDJPINPROCESS;
           this.NEWCHILDCLASS = NEWCHILDCLASS;
           this.NP_STATUSMEMO = NP_STATUSMEMO;
           this.OBSERVATION = OBSERVATION;
           this.ONBEHALFOF = ONBEHALFOF;
           this.ORGID = ORGID;
           this.ORIGRECORDCLASS = ORIGRECORDCLASS;
           this.ORIGRECORDID = ORIGRECORDID;
           this.OUTLABCOST = OUTLABCOST;
           this.OUTMATCOST = OUTMATCOST;
           this.OUTTOOLCOST = OUTTOOLCOST;
           this.OWNER = OWNER;
           this.OWNERGROUP = OWNERGROUP;
           this.OWNERSYSID = OWNERSYSID;
           this.PARENT = PARENT;
           this.PARENTCHGSSTATUS = PARENTCHGSSTATUS;
           this.PERSONGROUP = PERSONGROUP;
           this.PHONE = PHONE;
           this.PLUSCFREQUENCY = PLUSCFREQUENCY;
           this.PLUSCFREQUNIT = PLUSCFREQUNIT;
           this.PLUSCISMOBILE = PLUSCISMOBILE;
           this.PLUSCJPREVNUM = PLUSCJPREVNUM;
           this.PLUSCLOOP = PLUSCLOOP;
           this.PLUSCNEXTDATE = PLUSCNEXTDATE;
           this.PLUSCOVERDUEDATE = PLUSCOVERDUEDATE;
           this.PLUSCPHYLOC = PLUSCPHYLOC;
           this.PMDUEDATE = PMDUEDATE;
           this.PMEXTDATE = PMEXTDATE;
           this.PMNEXTDUEDATE = PMNEXTDUEDATE;
           this.PMNUM = PMNUM;
           this.POINTNUM = POINTNUM;
           this.PROBLEMCODE = PROBLEMCODE;
           this.REASONFORCHANGE = REASONFORCHANGE;
           this.REMDUR = REMDUR;
           this.REPAIRFACILITY = REPAIRFACILITY;
           this.REPFACSITEID = REPFACSITEID;
           this.REPORTDATE = REPORTDATE;
           this.REPORTEDBY = REPORTEDBY;
           this.REQASSTDWNTIME = REQASSTDWNTIME;
           this.RESPONDBY = RESPONDBY;
           this.RISK = RISK;
           this.ROUTE = ROUTE;
           this.ROUTESTOPID = ROUTESTOPID;
           this.SCHEDFINISH = SCHEDFINISH;
           this.SCHEDSTART = SCHEDSTART;
           this.SENDERSYSID = SENDERSYSID;
           this.SITEID = SITEID;
           this.SNECONSTRAINT = SNECONSTRAINT;
           this.SOURCESYSID = SOURCESYSID;
           this.STATUS = STATUS;
           this.STATUSDATE = STATUSDATE;
           this.STATUSIFACE = STATUSIFACE;
           this.STOREROOMMTLSTATUS = STOREROOMMTLSTATUS;
           this.SUPERVISOR = SUPERVISOR;
           this.SUSPENDFLOW = SUSPENDFLOW;
           this.TARGCOMPDATE = TARGCOMPDATE;
           this.TARGETDESC = TARGETDESC;
           this.TARGSTARTDATE = TARGSTARTDATE;
           this.TASKID = TASKID;
           this.VENDOR = VENDOR;
           this.VERIFICATION = VERIFICATION;
           this.WHOMISCHANGEFOR = WHOMISCHANGEFOR;
           this.WOACCEPTSCHARGES = WOACCEPTSCHARGES;
           this.WOCLASS = WOCLASS;
           this.WOEQ1 = WOEQ1;
           this.WOEQ10 = WOEQ10;
           this.WOEQ11 = WOEQ11;
           this.WOEQ12 = WOEQ12;
           this.WOEQ13 = WOEQ13;
           this.WOEQ14 = WOEQ14;
           this.WOEQ2 = WOEQ2;
           this.WOEQ3 = WOEQ3;
           this.WOEQ4 = WOEQ4;
           this.WOEQ5 = WOEQ5;
           this.WOEQ6 = WOEQ6;
           this.WOEQ7 = WOEQ7;
           this.WOEQ8 = WOEQ8;
           this.WOEQ9 = WOEQ9;
           this.WOGROUP = WOGROUP;
           this.WOISSWAP = WOISSWAP;
           this.WOJO1 = WOJO1;
           this.WOJO2 = WOJO2;
           this.WOJO3 = WOJO3;
           this.WOJO4 = WOJO4;
           this.WOJO5 = WOJO5;
           this.WOJO6 = WOJO6;
           this.WOJO7 = WOJO7;
           this.WOJO8 = WOJO8;
           this.WOJP1 = WOJP1;
           this.WOJP2 = WOJP2;
           this.WOJP3 = WOJP3;
           this.WOJP4 = WOJP4;
           this.WOJP5 = WOJP5;
           this.WOL1 = WOL1;
           this.WOL2 = WOL2;
           this.WOL3 = WOL3;
           this.WOL4 = WOL4;
           this.WOLABLNK = WOLABLNK;
           this.WOLO1 = WOLO1;
           this.WOLO10 = WOLO10;
           this.WOLO2 = WOLO2;
           this.WOLO3 = WOLO3;
           this.WOLO4 = WOLO4;
           this.WOLO5 = WOLO5;
           this.WOLO6 = WOLO6;
           this.WOLO7 = WOLO7;
           this.WOLO8 = WOLO8;
           this.WOLO9 = WOLO9;
           this.WONUM = WONUM;
           this.WOPRIORITY = WOPRIORITY;
           this.WORKLOCATION = WORKLOCATION;
           this.WORKORDERID = WORKORDERID;
           this.WORKPACKMTLSTATUS = WORKPACKMTLSTATUS;
           this.WORKTYPE = WORKTYPE;
           this.WORTS1 = WORTS1;
           this.WORTS2 = WORTS2;
           this.WORTS3 = WORTS3;
           this.WORTS4 = WORTS4;
           this.WORTS5 = WORTS5;
           this.WOSEQUENCE = WOSEQUENCE;
           this.action = action;
           this.relationship = relationship;
           this.deleteForInsert = deleteForInsert;
           this.transLanguage = transLanguage;
    }


    /**
     * Gets the MAXINTERRORMSG value for this MXWO_WORKORDERType.
     * 
     * @return MAXINTERRORMSG
     */
    public java.lang.String getMAXINTERRORMSG() {
        return MAXINTERRORMSG;
    }


    /**
     * Sets the MAXINTERRORMSG value for this MXWO_WORKORDERType.
     * 
     * @param MAXINTERRORMSG
     */
    public void setMAXINTERRORMSG(java.lang.String MAXINTERRORMSG) {
        this.MAXINTERRORMSG = MAXINTERRORMSG;
    }


    /**
     * Gets the ACTFINISH value for this MXWO_WORKORDERType.
     * 
     * @return ACTFINISH
     */
    public com.ibm.www.maximo.MXDateTimeType getACTFINISH() {
        return ACTFINISH;
    }


    /**
     * Sets the ACTFINISH value for this MXWO_WORKORDERType.
     * 
     * @param ACTFINISH
     */
    public void setACTFINISH(com.ibm.www.maximo.MXDateTimeType ACTFINISH) {
        this.ACTFINISH = ACTFINISH;
    }


    /**
     * Gets the ACTINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTINTLABCOST() {
        return ACTINTLABCOST;
    }


    /**
     * Sets the ACTINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTINTLABCOST
     */
    public void setACTINTLABCOST(com.ibm.www.maximo.MXDoubleType ACTINTLABCOST) {
        this.ACTINTLABCOST = ACTINTLABCOST;
    }


    /**
     * Gets the ACTINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ACTINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getACTINTLABHRS() {
        return ACTINTLABHRS;
    }


    /**
     * Sets the ACTINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ACTINTLABHRS
     */
    public void setACTINTLABHRS(com.ibm.www.maximo.MXDoubleType ACTINTLABHRS) {
        this.ACTINTLABHRS = ACTINTLABHRS;
    }


    /**
     * Gets the ACTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTLABCOST() {
        return ACTLABCOST;
    }


    /**
     * Sets the ACTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTLABCOST
     */
    public void setACTLABCOST(com.ibm.www.maximo.MXDoubleType ACTLABCOST) {
        this.ACTLABCOST = ACTLABCOST;
    }


    /**
     * Gets the ACTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ACTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getACTLABHRS() {
        return ACTLABHRS;
    }


    /**
     * Sets the ACTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ACTLABHRS
     */
    public void setACTLABHRS(com.ibm.www.maximo.MXDoubleType ACTLABHRS) {
        this.ACTLABHRS = ACTLABHRS;
    }


    /**
     * Gets the ACTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTMATCOST() {
        return ACTMATCOST;
    }


    /**
     * Sets the ACTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTMATCOST
     */
    public void setACTMATCOST(com.ibm.www.maximo.MXDoubleType ACTMATCOST) {
        this.ACTMATCOST = ACTMATCOST;
    }


    /**
     * Gets the ACTOUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTOUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTOUTLABCOST() {
        return ACTOUTLABCOST;
    }


    /**
     * Sets the ACTOUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTOUTLABCOST
     */
    public void setACTOUTLABCOST(com.ibm.www.maximo.MXDoubleType ACTOUTLABCOST) {
        this.ACTOUTLABCOST = ACTOUTLABCOST;
    }


    /**
     * Gets the ACTOUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ACTOUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getACTOUTLABHRS() {
        return ACTOUTLABHRS;
    }


    /**
     * Sets the ACTOUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ACTOUTLABHRS
     */
    public void setACTOUTLABHRS(com.ibm.www.maximo.MXDoubleType ACTOUTLABHRS) {
        this.ACTOUTLABHRS = ACTOUTLABHRS;
    }


    /**
     * Gets the ACTSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTSERVCOST() {
        return ACTSERVCOST;
    }


    /**
     * Sets the ACTSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTSERVCOST
     */
    public void setACTSERVCOST(com.ibm.www.maximo.MXDoubleType ACTSERVCOST) {
        this.ACTSERVCOST = ACTSERVCOST;
    }


    /**
     * Gets the ACTSTART value for this MXWO_WORKORDERType.
     * 
     * @return ACTSTART
     */
    public com.ibm.www.maximo.MXDateTimeType getACTSTART() {
        return ACTSTART;
    }


    /**
     * Sets the ACTSTART value for this MXWO_WORKORDERType.
     * 
     * @param ACTSTART
     */
    public void setACTSTART(com.ibm.www.maximo.MXDateTimeType ACTSTART) {
        this.ACTSTART = ACTSTART;
    }


    /**
     * Gets the ACTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @return ACTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleType getACTTOOLCOST() {
        return ACTTOOLCOST;
    }


    /**
     * Sets the ACTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @param ACTTOOLCOST
     */
    public void setACTTOOLCOST(com.ibm.www.maximo.MXDoubleType ACTTOOLCOST) {
        this.ACTTOOLCOST = ACTTOOLCOST;
    }


    /**
     * Gets the AMCREW value for this MXWO_WORKORDERType.
     * 
     * @return AMCREW
     */
    public com.ibm.www.maximo.MXStringType getAMCREW() {
        return AMCREW;
    }


    /**
     * Sets the AMCREW value for this MXWO_WORKORDERType.
     * 
     * @param AMCREW
     */
    public void setAMCREW(com.ibm.www.maximo.MXStringType AMCREW) {
        this.AMCREW = AMCREW;
    }


    /**
     * Gets the AMS value for this MXWO_WORKORDERType.
     * 
     * @return AMS
     */
    public com.ibm.www.maximo.MXBooleanType getAMS() {
        return AMS;
    }


    /**
     * Sets the AMS value for this MXWO_WORKORDERType.
     * 
     * @param AMS
     */
    public void setAMS(com.ibm.www.maximo.MXBooleanType AMS) {
        this.AMS = AMS;
    }


    /**
     * Gets the AOS value for this MXWO_WORKORDERType.
     * 
     * @return AOS
     */
    public com.ibm.www.maximo.MXBooleanType getAOS() {
        return AOS;
    }


    /**
     * Sets the AOS value for this MXWO_WORKORDERType.
     * 
     * @param AOS
     */
    public void setAOS(com.ibm.www.maximo.MXBooleanType AOS) {
        this.AOS = AOS;
    }


    /**
     * Gets the APPTREQUIRED value for this MXWO_WORKORDERType.
     * 
     * @return APPTREQUIRED
     */
    public com.ibm.www.maximo.MXBooleanType getAPPTREQUIRED() {
        return APPTREQUIRED;
    }


    /**
     * Sets the APPTREQUIRED value for this MXWO_WORKORDERType.
     * 
     * @param APPTREQUIRED
     */
    public void setAPPTREQUIRED(com.ibm.www.maximo.MXBooleanType APPTREQUIRED) {
        this.APPTREQUIRED = APPTREQUIRED;
    }


    /**
     * Gets the ASSETLOCPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @return ASSETLOCPRIORITY
     */
    public com.ibm.www.maximo.MXLongType getASSETLOCPRIORITY() {
        return ASSETLOCPRIORITY;
    }


    /**
     * Sets the ASSETLOCPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @param ASSETLOCPRIORITY
     */
    public void setASSETLOCPRIORITY(com.ibm.www.maximo.MXLongType ASSETLOCPRIORITY) {
        this.ASSETLOCPRIORITY = ASSETLOCPRIORITY;
    }


    /**
     * Gets the ASSETNUM value for this MXWO_WORKORDERType.
     * 
     * @return ASSETNUM
     */
    public com.ibm.www.maximo.MXStringType getASSETNUM() {
        return ASSETNUM;
    }


    /**
     * Sets the ASSETNUM value for this MXWO_WORKORDERType.
     * 
     * @param ASSETNUM
     */
    public void setASSETNUM(com.ibm.www.maximo.MXStringType ASSETNUM) {
        this.ASSETNUM = ASSETNUM;
    }


    /**
     * Gets the ASSIGNEDOWNERGROUP value for this MXWO_WORKORDERType.
     * 
     * @return ASSIGNEDOWNERGROUP
     */
    public com.ibm.www.maximo.MXStringType getASSIGNEDOWNERGROUP() {
        return ASSIGNEDOWNERGROUP;
    }


    /**
     * Sets the ASSIGNEDOWNERGROUP value for this MXWO_WORKORDERType.
     * 
     * @param ASSIGNEDOWNERGROUP
     */
    public void setASSIGNEDOWNERGROUP(com.ibm.www.maximo.MXStringType ASSIGNEDOWNERGROUP) {
        this.ASSIGNEDOWNERGROUP = ASSIGNEDOWNERGROUP;
    }


    /**
     * Gets the AVAILSTATUSDATE value for this MXWO_WORKORDERType.
     * 
     * @return AVAILSTATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getAVAILSTATUSDATE() {
        return AVAILSTATUSDATE;
    }


    /**
     * Sets the AVAILSTATUSDATE value for this MXWO_WORKORDERType.
     * 
     * @param AVAILSTATUSDATE
     */
    public void setAVAILSTATUSDATE(com.ibm.www.maximo.MXDateTimeType AVAILSTATUSDATE) {
        this.AVAILSTATUSDATE = AVAILSTATUSDATE;
    }


    /**
     * Gets the BACKOUTPLAN value for this MXWO_WORKORDERType.
     * 
     * @return BACKOUTPLAN
     */
    public com.ibm.www.maximo.MXStringType getBACKOUTPLAN() {
        return BACKOUTPLAN;
    }


    /**
     * Sets the BACKOUTPLAN value for this MXWO_WORKORDERType.
     * 
     * @param BACKOUTPLAN
     */
    public void setBACKOUTPLAN(com.ibm.www.maximo.MXStringType BACKOUTPLAN) {
        this.BACKOUTPLAN = BACKOUTPLAN;
    }


    /**
     * Gets the CALCCALENDAR value for this MXWO_WORKORDERType.
     * 
     * @return CALCCALENDAR
     */
    public com.ibm.www.maximo.MXStringType getCALCCALENDAR() {
        return CALCCALENDAR;
    }


    /**
     * Sets the CALCCALENDAR value for this MXWO_WORKORDERType.
     * 
     * @param CALCCALENDAR
     */
    public void setCALCCALENDAR(com.ibm.www.maximo.MXStringType CALCCALENDAR) {
        this.CALCCALENDAR = CALCCALENDAR;
    }


    /**
     * Gets the CALCORGID value for this MXWO_WORKORDERType.
     * 
     * @return CALCORGID
     */
    public com.ibm.www.maximo.MXStringType getCALCORGID() {
        return CALCORGID;
    }


    /**
     * Sets the CALCORGID value for this MXWO_WORKORDERType.
     * 
     * @param CALCORGID
     */
    public void setCALCORGID(com.ibm.www.maximo.MXStringType CALCORGID) {
        this.CALCORGID = CALCORGID;
    }


    /**
     * Gets the CALCPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @return CALCPRIORITY
     */
    public com.ibm.www.maximo.MXLongType getCALCPRIORITY() {
        return CALCPRIORITY;
    }


    /**
     * Sets the CALCPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @param CALCPRIORITY
     */
    public void setCALCPRIORITY(com.ibm.www.maximo.MXLongType CALCPRIORITY) {
        this.CALCPRIORITY = CALCPRIORITY;
    }


    /**
     * Gets the CALCSHIFT value for this MXWO_WORKORDERType.
     * 
     * @return CALCSHIFT
     */
    public com.ibm.www.maximo.MXStringType getCALCSHIFT() {
        return CALCSHIFT;
    }


    /**
     * Sets the CALCSHIFT value for this MXWO_WORKORDERType.
     * 
     * @param CALCSHIFT
     */
    public void setCALCSHIFT(com.ibm.www.maximo.MXStringType CALCSHIFT) {
        this.CALCSHIFT = CALCSHIFT;
    }


    /**
     * Gets the CALENDAR value for this MXWO_WORKORDERType.
     * 
     * @return CALENDAR
     */
    public com.ibm.www.maximo.MXStringType getCALENDAR() {
        return CALENDAR;
    }


    /**
     * Sets the CALENDAR value for this MXWO_WORKORDERType.
     * 
     * @param CALENDAR
     */
    public void setCALENDAR(com.ibm.www.maximo.MXStringType CALENDAR) {
        this.CALENDAR = CALENDAR;
    }


    /**
     * Gets the CHANGEBY value for this MXWO_WORKORDERType.
     * 
     * @return CHANGEBY
     */
    public com.ibm.www.maximo.MXStringType getCHANGEBY() {
        return CHANGEBY;
    }


    /**
     * Sets the CHANGEBY value for this MXWO_WORKORDERType.
     * 
     * @param CHANGEBY
     */
    public void setCHANGEBY(com.ibm.www.maximo.MXStringType CHANGEBY) {
        this.CHANGEBY = CHANGEBY;
    }


    /**
     * Gets the CHANGEDATE value for this MXWO_WORKORDERType.
     * 
     * @return CHANGEDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getCHANGEDATE() {
        return CHANGEDATE;
    }


    /**
     * Sets the CHANGEDATE value for this MXWO_WORKORDERType.
     * 
     * @param CHANGEDATE
     */
    public void setCHANGEDATE(com.ibm.www.maximo.MXDateTimeType CHANGEDATE) {
        this.CHANGEDATE = CHANGEDATE;
    }


    /**
     * Gets the CHARGESTORE value for this MXWO_WORKORDERType.
     * 
     * @return CHARGESTORE
     */
    public com.ibm.www.maximo.MXBooleanType getCHARGESTORE() {
        return CHARGESTORE;
    }


    /**
     * Sets the CHARGESTORE value for this MXWO_WORKORDERType.
     * 
     * @param CHARGESTORE
     */
    public void setCHARGESTORE(com.ibm.www.maximo.MXBooleanType CHARGESTORE) {
        this.CHARGESTORE = CHARGESTORE;
    }


    /**
     * Gets the CINUM value for this MXWO_WORKORDERType.
     * 
     * @return CINUM
     */
    public com.ibm.www.maximo.MXStringType getCINUM() {
        return CINUM;
    }


    /**
     * Sets the CINUM value for this MXWO_WORKORDERType.
     * 
     * @param CINUM
     */
    public void setCINUM(com.ibm.www.maximo.MXStringType CINUM) {
        this.CINUM = CINUM;
    }


    /**
     * Gets the CLASSSTRUCTUREID value for this MXWO_WORKORDERType.
     * 
     * @return CLASSSTRUCTUREID
     */
    public com.ibm.www.maximo.MXStringType getCLASSSTRUCTUREID() {
        return CLASSSTRUCTUREID;
    }


    /**
     * Sets the CLASSSTRUCTUREID value for this MXWO_WORKORDERType.
     * 
     * @param CLASSSTRUCTUREID
     */
    public void setCLASSSTRUCTUREID(com.ibm.www.maximo.MXStringType CLASSSTRUCTUREID) {
        this.CLASSSTRUCTUREID = CLASSSTRUCTUREID;
    }


    /**
     * Gets the COMMODITY value for this MXWO_WORKORDERType.
     * 
     * @return COMMODITY
     */
    public com.ibm.www.maximo.MXStringType getCOMMODITY() {
        return COMMODITY;
    }


    /**
     * Sets the COMMODITY value for this MXWO_WORKORDERType.
     * 
     * @param COMMODITY
     */
    public void setCOMMODITY(com.ibm.www.maximo.MXStringType COMMODITY) {
        this.COMMODITY = COMMODITY;
    }


    /**
     * Gets the COMMODITYGROUP value for this MXWO_WORKORDERType.
     * 
     * @return COMMODITYGROUP
     */
    public com.ibm.www.maximo.MXStringType getCOMMODITYGROUP() {
        return COMMODITYGROUP;
    }


    /**
     * Sets the COMMODITYGROUP value for this MXWO_WORKORDERType.
     * 
     * @param COMMODITYGROUP
     */
    public void setCOMMODITYGROUP(com.ibm.www.maximo.MXStringType COMMODITYGROUP) {
        this.COMMODITYGROUP = COMMODITYGROUP;
    }


    /**
     * Gets the CONTRACT value for this MXWO_WORKORDERType.
     * 
     * @return CONTRACT
     */
    public com.ibm.www.maximo.MXStringType getCONTRACT() {
        return CONTRACT;
    }


    /**
     * Sets the CONTRACT value for this MXWO_WORKORDERType.
     * 
     * @param CONTRACT
     */
    public void setCONTRACT(com.ibm.www.maximo.MXStringType CONTRACT) {
        this.CONTRACT = CONTRACT;
    }


    /**
     * Gets the CREWID value for this MXWO_WORKORDERType.
     * 
     * @return CREWID
     */
    public com.ibm.www.maximo.MXStringType getCREWID() {
        return CREWID;
    }


    /**
     * Sets the CREWID value for this MXWO_WORKORDERType.
     * 
     * @param CREWID
     */
    public void setCREWID(com.ibm.www.maximo.MXStringType CREWID) {
        this.CREWID = CREWID;
    }


    /**
     * Gets the CREWWORKGROUP value for this MXWO_WORKORDERType.
     * 
     * @return CREWWORKGROUP
     */
    public com.ibm.www.maximo.MXStringType getCREWWORKGROUP() {
        return CREWWORKGROUP;
    }


    /**
     * Sets the CREWWORKGROUP value for this MXWO_WORKORDERType.
     * 
     * @param CREWWORKGROUP
     */
    public void setCREWWORKGROUP(com.ibm.www.maximo.MXStringType CREWWORKGROUP) {
        this.CREWWORKGROUP = CREWWORKGROUP;
    }


    /**
     * Gets the DESCRIPTION value for this MXWO_WORKORDERType.
     * 
     * @return DESCRIPTION
     */
    public com.ibm.www.maximo.MXStringType getDESCRIPTION() {
        return DESCRIPTION;
    }


    /**
     * Sets the DESCRIPTION value for this MXWO_WORKORDERType.
     * 
     * @param DESCRIPTION
     */
    public void setDESCRIPTION(com.ibm.www.maximo.MXStringType DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }


    /**
     * Gets the DESCRIPTION_LONGDESCRIPTION value for this MXWO_WORKORDERType.
     * 
     * @return DESCRIPTION_LONGDESCRIPTION
     */
    public com.ibm.www.maximo.MXStringType getDESCRIPTION_LONGDESCRIPTION() {
        return DESCRIPTION_LONGDESCRIPTION;
    }


    /**
     * Sets the DESCRIPTION_LONGDESCRIPTION value for this MXWO_WORKORDERType.
     * 
     * @param DESCRIPTION_LONGDESCRIPTION
     */
    public void setDESCRIPTION_LONGDESCRIPTION(com.ibm.www.maximo.MXStringType DESCRIPTION_LONGDESCRIPTION) {
        this.DESCRIPTION_LONGDESCRIPTION = DESCRIPTION_LONGDESCRIPTION;
    }


    /**
     * Gets the DIRISSUEMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @return DIRISSUEMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainType getDIRISSUEMTLSTATUS() {
        return DIRISSUEMTLSTATUS;
    }


    /**
     * Sets the DIRISSUEMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @param DIRISSUEMTLSTATUS
     */
    public void setDIRISSUEMTLSTATUS(com.ibm.www.maximo.MXDomainType DIRISSUEMTLSTATUS) {
        this.DIRISSUEMTLSTATUS = DIRISSUEMTLSTATUS;
    }


    /**
     * Gets the DISABLED value for this MXWO_WORKORDERType.
     * 
     * @return DISABLED
     */
    public com.ibm.www.maximo.MXBooleanType getDISABLED() {
        return DISABLED;
    }


    /**
     * Sets the DISABLED value for this MXWO_WORKORDERType.
     * 
     * @param DISABLED
     */
    public void setDISABLED(com.ibm.www.maximo.MXBooleanType DISABLED) {
        this.DISABLED = DISABLED;
    }


    /**
     * Gets the DOWNTIME value for this MXWO_WORKORDERType.
     * 
     * @return DOWNTIME
     */
    public com.ibm.www.maximo.MXBooleanType getDOWNTIME() {
        return DOWNTIME;
    }


    /**
     * Sets the DOWNTIME value for this MXWO_WORKORDERType.
     * 
     * @param DOWNTIME
     */
    public void setDOWNTIME(com.ibm.www.maximo.MXBooleanType DOWNTIME) {
        this.DOWNTIME = DOWNTIME;
    }


    /**
     * Gets the ENVIRONMENT value for this MXWO_WORKORDERType.
     * 
     * @return ENVIRONMENT
     */
    public com.ibm.www.maximo.MXStringType getENVIRONMENT() {
        return ENVIRONMENT;
    }


    /**
     * Sets the ENVIRONMENT value for this MXWO_WORKORDERType.
     * 
     * @param ENVIRONMENT
     */
    public void setENVIRONMENT(com.ibm.www.maximo.MXStringType ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
    }


    /**
     * Gets the ESTATAPPRINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRINTLABCOST() {
        return ESTATAPPRINTLABCOST;
    }


    /**
     * Sets the ESTATAPPRINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRINTLABCOST
     */
    public void setESTATAPPRINTLABCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABCOST) {
        this.ESTATAPPRINTLABCOST = ESTATAPPRINTLABCOST;
    }


    /**
     * Gets the ESTATAPPRINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRINTLABHRS() {
        return ESTATAPPRINTLABHRS;
    }


    /**
     * Sets the ESTATAPPRINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRINTLABHRS
     */
    public void setESTATAPPRINTLABHRS(com.ibm.www.maximo.MXDoubleType ESTATAPPRINTLABHRS) {
        this.ESTATAPPRINTLABHRS = ESTATAPPRINTLABHRS;
    }


    /**
     * Gets the ESTATAPPRLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRLABCOST() {
        return ESTATAPPRLABCOST;
    }


    /**
     * Sets the ESTATAPPRLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRLABCOST
     */
    public void setESTATAPPRLABCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPRLABCOST) {
        this.ESTATAPPRLABCOST = ESTATAPPRLABCOST;
    }


    /**
     * Gets the ESTATAPPRLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRLABHRS() {
        return ESTATAPPRLABHRS;
    }


    /**
     * Sets the ESTATAPPRLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRLABHRS
     */
    public void setESTATAPPRLABHRS(com.ibm.www.maximo.MXDoubleType ESTATAPPRLABHRS) {
        this.ESTATAPPRLABHRS = ESTATAPPRLABHRS;
    }


    /**
     * Gets the ESTATAPPRMATCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRMATCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRMATCOST() {
        return ESTATAPPRMATCOST;
    }


    /**
     * Sets the ESTATAPPRMATCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRMATCOST
     */
    public void setESTATAPPRMATCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPRMATCOST) {
        this.ESTATAPPRMATCOST = ESTATAPPRMATCOST;
    }


    /**
     * Gets the ESTATAPPROUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPROUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPROUTLABCOST() {
        return ESTATAPPROUTLABCOST;
    }


    /**
     * Sets the ESTATAPPROUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPROUTLABCOST
     */
    public void setESTATAPPROUTLABCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABCOST) {
        this.ESTATAPPROUTLABCOST = ESTATAPPROUTLABCOST;
    }


    /**
     * Gets the ESTATAPPROUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPROUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPROUTLABHRS() {
        return ESTATAPPROUTLABHRS;
    }


    /**
     * Sets the ESTATAPPROUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPROUTLABHRS
     */
    public void setESTATAPPROUTLABHRS(com.ibm.www.maximo.MXDoubleType ESTATAPPROUTLABHRS) {
        this.ESTATAPPROUTLABHRS = ESTATAPPROUTLABHRS;
    }


    /**
     * Gets the ESTATAPPRSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRSERVCOST() {
        return ESTATAPPRSERVCOST;
    }


    /**
     * Sets the ESTATAPPRSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRSERVCOST
     */
    public void setESTATAPPRSERVCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPRSERVCOST) {
        this.ESTATAPPRSERVCOST = ESTATAPPRSERVCOST;
    }


    /**
     * Gets the ESTATAPPRTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTATAPPRTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTATAPPRTOOLCOST() {
        return ESTATAPPRTOOLCOST;
    }


    /**
     * Sets the ESTATAPPRTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTATAPPRTOOLCOST
     */
    public void setESTATAPPRTOOLCOST(com.ibm.www.maximo.MXDoubleType ESTATAPPRTOOLCOST) {
        this.ESTATAPPRTOOLCOST = ESTATAPPRTOOLCOST;
    }


    /**
     * Gets the ESTDUR value for this MXWO_WORKORDERType.
     * 
     * @return ESTDUR
     */
    public com.ibm.www.maximo.MXDoubleType getESTDUR() {
        return ESTDUR;
    }


    /**
     * Sets the ESTDUR value for this MXWO_WORKORDERType.
     * 
     * @param ESTDUR
     */
    public void setESTDUR(com.ibm.www.maximo.MXDoubleType ESTDUR) {
        this.ESTDUR = ESTDUR;
    }


    /**
     * Gets the ESTINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTINTLABCOST() {
        return ESTINTLABCOST;
    }


    /**
     * Sets the ESTINTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTINTLABCOST
     */
    public void setESTINTLABCOST(com.ibm.www.maximo.MXDoubleType ESTINTLABCOST) {
        this.ESTINTLABCOST = ESTINTLABCOST;
    }


    /**
     * Gets the ESTINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTINTLABHRS() {
        return ESTINTLABHRS;
    }


    /**
     * Sets the ESTINTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTINTLABHRS
     */
    public void setESTINTLABHRS(com.ibm.www.maximo.MXDoubleType ESTINTLABHRS) {
        this.ESTINTLABHRS = ESTINTLABHRS;
    }


    /**
     * Gets the ESTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTLABCOST() {
        return ESTLABCOST;
    }


    /**
     * Sets the ESTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTLABCOST
     */
    public void setESTLABCOST(com.ibm.www.maximo.MXDoubleType ESTLABCOST) {
        this.ESTLABCOST = ESTLABCOST;
    }


    /**
     * Gets the ESTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTLABHRS() {
        return ESTLABHRS;
    }


    /**
     * Sets the ESTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTLABHRS
     */
    public void setESTLABHRS(com.ibm.www.maximo.MXDoubleType ESTLABHRS) {
        this.ESTLABHRS = ESTLABHRS;
    }


    /**
     * Gets the ESTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTMATCOST() {
        return ESTMATCOST;
    }


    /**
     * Sets the ESTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTMATCOST
     */
    public void setESTMATCOST(com.ibm.www.maximo.MXDoubleType ESTMATCOST) {
        this.ESTMATCOST = ESTMATCOST;
    }


    /**
     * Gets the ESTOUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTOUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTOUTLABCOST() {
        return ESTOUTLABCOST;
    }


    /**
     * Sets the ESTOUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTOUTLABCOST
     */
    public void setESTOUTLABCOST(com.ibm.www.maximo.MXDoubleType ESTOUTLABCOST) {
        this.ESTOUTLABCOST = ESTOUTLABCOST;
    }


    /**
     * Gets the ESTOUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @return ESTOUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleType getESTOUTLABHRS() {
        return ESTOUTLABHRS;
    }


    /**
     * Sets the ESTOUTLABHRS value for this MXWO_WORKORDERType.
     * 
     * @param ESTOUTLABHRS
     */
    public void setESTOUTLABHRS(com.ibm.www.maximo.MXDoubleType ESTOUTLABHRS) {
        this.ESTOUTLABHRS = ESTOUTLABHRS;
    }


    /**
     * Gets the ESTSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTSERVCOST() {
        return ESTSERVCOST;
    }


    /**
     * Sets the ESTSERVCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTSERVCOST
     */
    public void setESTSERVCOST(com.ibm.www.maximo.MXDoubleType ESTSERVCOST) {
        this.ESTSERVCOST = ESTSERVCOST;
    }


    /**
     * Gets the ESTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @return ESTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleType getESTTOOLCOST() {
        return ESTTOOLCOST;
    }


    /**
     * Sets the ESTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @param ESTTOOLCOST
     */
    public void setESTTOOLCOST(com.ibm.www.maximo.MXDoubleType ESTTOOLCOST) {
        this.ESTTOOLCOST = ESTTOOLCOST;
    }


    /**
     * Gets the EXTERNALREFID value for this MXWO_WORKORDERType.
     * 
     * @return EXTERNALREFID
     */
    public com.ibm.www.maximo.MXStringType getEXTERNALREFID() {
        return EXTERNALREFID;
    }


    /**
     * Sets the EXTERNALREFID value for this MXWO_WORKORDERType.
     * 
     * @param EXTERNALREFID
     */
    public void setEXTERNALREFID(com.ibm.www.maximo.MXStringType EXTERNALREFID) {
        this.EXTERNALREFID = EXTERNALREFID;
    }


    /**
     * Gets the FAILDATE value for this MXWO_WORKORDERType.
     * 
     * @return FAILDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getFAILDATE() {
        return FAILDATE;
    }


    /**
     * Sets the FAILDATE value for this MXWO_WORKORDERType.
     * 
     * @param FAILDATE
     */
    public void setFAILDATE(com.ibm.www.maximo.MXDateTimeType FAILDATE) {
        this.FAILDATE = FAILDATE;
    }


    /**
     * Gets the FAILURECODE value for this MXWO_WORKORDERType.
     * 
     * @return FAILURECODE
     */
    public com.ibm.www.maximo.MXStringType getFAILURECODE() {
        return FAILURECODE;
    }


    /**
     * Sets the FAILURECODE value for this MXWO_WORKORDERType.
     * 
     * @param FAILURECODE
     */
    public void setFAILURECODE(com.ibm.www.maximo.MXStringType FAILURECODE) {
        this.FAILURECODE = FAILURECODE;
    }


    /**
     * Gets the FCPROJECTID value for this MXWO_WORKORDERType.
     * 
     * @return FCPROJECTID
     */
    public com.ibm.www.maximo.MXStringType getFCPROJECTID() {
        return FCPROJECTID;
    }


    /**
     * Sets the FCPROJECTID value for this MXWO_WORKORDERType.
     * 
     * @param FCPROJECTID
     */
    public void setFCPROJECTID(com.ibm.www.maximo.MXStringType FCPROJECTID) {
        this.FCPROJECTID = FCPROJECTID;
    }


    /**
     * Gets the FCTASKID value for this MXWO_WORKORDERType.
     * 
     * @return FCTASKID
     */
    public com.ibm.www.maximo.MXStringType getFCTASKID() {
        return FCTASKID;
    }


    /**
     * Sets the FCTASKID value for this MXWO_WORKORDERType.
     * 
     * @param FCTASKID
     */
    public void setFCTASKID(com.ibm.www.maximo.MXStringType FCTASKID) {
        this.FCTASKID = FCTASKID;
    }


    /**
     * Gets the FINCNTRLID value for this MXWO_WORKORDERType.
     * 
     * @return FINCNTRLID
     */
    public com.ibm.www.maximo.MXStringType getFINCNTRLID() {
        return FINCNTRLID;
    }


    /**
     * Sets the FINCNTRLID value for this MXWO_WORKORDERType.
     * 
     * @param FINCNTRLID
     */
    public void setFINCNTRLID(com.ibm.www.maximo.MXStringType FINCNTRLID) {
        this.FINCNTRLID = FINCNTRLID;
    }


    /**
     * Gets the FIRSTAPPRSTATUS value for this MXWO_WORKORDERType.
     * 
     * @return FIRSTAPPRSTATUS
     */
    public com.ibm.www.maximo.MXStringType getFIRSTAPPRSTATUS() {
        return FIRSTAPPRSTATUS;
    }


    /**
     * Sets the FIRSTAPPRSTATUS value for this MXWO_WORKORDERType.
     * 
     * @param FIRSTAPPRSTATUS
     */
    public void setFIRSTAPPRSTATUS(com.ibm.www.maximo.MXStringType FIRSTAPPRSTATUS) {
        this.FIRSTAPPRSTATUS = FIRSTAPPRSTATUS;
    }


    /**
     * Gets the FLOWACTION value for this MXWO_WORKORDERType.
     * 
     * @return FLOWACTION
     */
    public com.ibm.www.maximo.MXStringType getFLOWACTION() {
        return FLOWACTION;
    }


    /**
     * Sets the FLOWACTION value for this MXWO_WORKORDERType.
     * 
     * @param FLOWACTION
     */
    public void setFLOWACTION(com.ibm.www.maximo.MXStringType FLOWACTION) {
        this.FLOWACTION = FLOWACTION;
    }


    /**
     * Gets the FLOWACTIONASSIST value for this MXWO_WORKORDERType.
     * 
     * @return FLOWACTIONASSIST
     */
    public com.ibm.www.maximo.MXBooleanType getFLOWACTIONASSIST() {
        return FLOWACTIONASSIST;
    }


    /**
     * Sets the FLOWACTIONASSIST value for this MXWO_WORKORDERType.
     * 
     * @param FLOWACTIONASSIST
     */
    public void setFLOWACTIONASSIST(com.ibm.www.maximo.MXBooleanType FLOWACTIONASSIST) {
        this.FLOWACTIONASSIST = FLOWACTIONASSIST;
    }


    /**
     * Gets the FLOWCONTROLLED value for this MXWO_WORKORDERType.
     * 
     * @return FLOWCONTROLLED
     */
    public com.ibm.www.maximo.MXBooleanType getFLOWCONTROLLED() {
        return FLOWCONTROLLED;
    }


    /**
     * Sets the FLOWCONTROLLED value for this MXWO_WORKORDERType.
     * 
     * @param FLOWCONTROLLED
     */
    public void setFLOWCONTROLLED(com.ibm.www.maximo.MXBooleanType FLOWCONTROLLED) {
        this.FLOWCONTROLLED = FLOWCONTROLLED;
    }


    /**
     * Gets the FNLCONSTRAINT value for this MXWO_WORKORDERType.
     * 
     * @return FNLCONSTRAINT
     */
    public com.ibm.www.maximo.MXDateTimeType getFNLCONSTRAINT() {
        return FNLCONSTRAINT;
    }


    /**
     * Sets the FNLCONSTRAINT value for this MXWO_WORKORDERType.
     * 
     * @param FNLCONSTRAINT
     */
    public void setFNLCONSTRAINT(com.ibm.www.maximo.MXDateTimeType FNLCONSTRAINT) {
        this.FNLCONSTRAINT = FNLCONSTRAINT;
    }


    /**
     * Gets the GENERATEDFORPO value for this MXWO_WORKORDERType.
     * 
     * @return GENERATEDFORPO
     */
    public com.ibm.www.maximo.MXStringType getGENERATEDFORPO() {
        return GENERATEDFORPO;
    }


    /**
     * Sets the GENERATEDFORPO value for this MXWO_WORKORDERType.
     * 
     * @param GENERATEDFORPO
     */
    public void setGENERATEDFORPO(com.ibm.www.maximo.MXStringType GENERATEDFORPO) {
        this.GENERATEDFORPO = GENERATEDFORPO;
    }


    /**
     * Gets the GENFORPOLINEID value for this MXWO_WORKORDERType.
     * 
     * @return GENFORPOLINEID
     */
    public com.ibm.www.maximo.MXLongType getGENFORPOLINEID() {
        return GENFORPOLINEID;
    }


    /**
     * Sets the GENFORPOLINEID value for this MXWO_WORKORDERType.
     * 
     * @param GENFORPOLINEID
     */
    public void setGENFORPOLINEID(com.ibm.www.maximo.MXLongType GENFORPOLINEID) {
        this.GENFORPOLINEID = GENFORPOLINEID;
    }


    /**
     * Gets the GENFORPOREVISION value for this MXWO_WORKORDERType.
     * 
     * @return GENFORPOREVISION
     */
    public com.ibm.www.maximo.MXLongType getGENFORPOREVISION() {
        return GENFORPOREVISION;
    }


    /**
     * Sets the GENFORPOREVISION value for this MXWO_WORKORDERType.
     * 
     * @param GENFORPOREVISION
     */
    public void setGENFORPOREVISION(com.ibm.www.maximo.MXLongType GENFORPOREVISION) {
        this.GENFORPOREVISION = GENFORPOREVISION;
    }


    /**
     * Gets the GLACCOUNT value for this MXWO_WORKORDERType.
     * 
     * @return GLACCOUNT
     */
    public com.ibm.www.maximo.MXGLAccountType getGLACCOUNT() {
        return GLACCOUNT;
    }


    /**
     * Sets the GLACCOUNT value for this MXWO_WORKORDERType.
     * 
     * @param GLACCOUNT
     */
    public void setGLACCOUNT(com.ibm.www.maximo.MXGLAccountType GLACCOUNT) {
        this.GLACCOUNT = GLACCOUNT;
    }


    /**
     * Gets the HASCHILDREN value for this MXWO_WORKORDERType.
     * 
     * @return HASCHILDREN
     */
    public com.ibm.www.maximo.MXBooleanType getHASCHILDREN() {
        return HASCHILDREN;
    }


    /**
     * Sets the HASCHILDREN value for this MXWO_WORKORDERType.
     * 
     * @param HASCHILDREN
     */
    public void setHASCHILDREN(com.ibm.www.maximo.MXBooleanType HASCHILDREN) {
        this.HASCHILDREN = HASCHILDREN;
    }


    /**
     * Gets the HASFOLLOWUPWORK value for this MXWO_WORKORDERType.
     * 
     * @return HASFOLLOWUPWORK
     */
    public com.ibm.www.maximo.MXBooleanType getHASFOLLOWUPWORK() {
        return HASFOLLOWUPWORK;
    }


    /**
     * Sets the HASFOLLOWUPWORK value for this MXWO_WORKORDERType.
     * 
     * @param HASFOLLOWUPWORK
     */
    public void setHASFOLLOWUPWORK(com.ibm.www.maximo.MXBooleanType HASFOLLOWUPWORK) {
        this.HASFOLLOWUPWORK = HASFOLLOWUPWORK;
    }


    /**
     * Gets the HISTORYFLAG value for this MXWO_WORKORDERType.
     * 
     * @return HISTORYFLAG
     */
    public com.ibm.www.maximo.MXBooleanType getHISTORYFLAG() {
        return HISTORYFLAG;
    }


    /**
     * Sets the HISTORYFLAG value for this MXWO_WORKORDERType.
     * 
     * @param HISTORYFLAG
     */
    public void setHISTORYFLAG(com.ibm.www.maximo.MXBooleanType HISTORYFLAG) {
        this.HISTORYFLAG = HISTORYFLAG;
    }


    /**
     * Gets the IGNOREDIAVAIL value for this MXWO_WORKORDERType.
     * 
     * @return IGNOREDIAVAIL
     */
    public com.ibm.www.maximo.MXBooleanType getIGNOREDIAVAIL() {
        return IGNOREDIAVAIL;
    }


    /**
     * Sets the IGNOREDIAVAIL value for this MXWO_WORKORDERType.
     * 
     * @param IGNOREDIAVAIL
     */
    public void setIGNOREDIAVAIL(com.ibm.www.maximo.MXBooleanType IGNOREDIAVAIL) {
        this.IGNOREDIAVAIL = IGNOREDIAVAIL;
    }


    /**
     * Gets the IGNORESRMAVAIL value for this MXWO_WORKORDERType.
     * 
     * @return IGNORESRMAVAIL
     */
    public com.ibm.www.maximo.MXBooleanType getIGNORESRMAVAIL() {
        return IGNORESRMAVAIL;
    }


    /**
     * Sets the IGNORESRMAVAIL value for this MXWO_WORKORDERType.
     * 
     * @param IGNORESRMAVAIL
     */
    public void setIGNORESRMAVAIL(com.ibm.www.maximo.MXBooleanType IGNORESRMAVAIL) {
        this.IGNORESRMAVAIL = IGNORESRMAVAIL;
    }


    /**
     * Gets the INCTASKSINSCHED value for this MXWO_WORKORDERType.
     * 
     * @return INCTASKSINSCHED
     */
    public com.ibm.www.maximo.MXBooleanType getINCTASKSINSCHED() {
        return INCTASKSINSCHED;
    }


    /**
     * Sets the INCTASKSINSCHED value for this MXWO_WORKORDERType.
     * 
     * @param INCTASKSINSCHED
     */
    public void setINCTASKSINSCHED(com.ibm.www.maximo.MXBooleanType INCTASKSINSCHED) {
        this.INCTASKSINSCHED = INCTASKSINSCHED;
    }


    /**
     * Gets the INSPECTOR value for this MXWO_WORKORDERType.
     * 
     * @return INSPECTOR
     */
    public com.ibm.www.maximo.MXStringType getINSPECTOR() {
        return INSPECTOR;
    }


    /**
     * Sets the INSPECTOR value for this MXWO_WORKORDERType.
     * 
     * @param INSPECTOR
     */
    public void setINSPECTOR(com.ibm.www.maximo.MXStringType INSPECTOR) {
        this.INSPECTOR = INSPECTOR;
    }


    /**
     * Gets the INTERRUPTIBLE value for this MXWO_WORKORDERType.
     * 
     * @return INTERRUPTIBLE
     */
    public com.ibm.www.maximo.MXBooleanType getINTERRUPTIBLE() {
        return INTERRUPTIBLE;
    }


    /**
     * Sets the INTERRUPTIBLE value for this MXWO_WORKORDERType.
     * 
     * @param INTERRUPTIBLE
     */
    public void setINTERRUPTIBLE(com.ibm.www.maximo.MXBooleanType INTERRUPTIBLE) {
        this.INTERRUPTIBLE = INTERRUPTIBLE;
    }


    /**
     * Gets the ISTASK value for this MXWO_WORKORDERType.
     * 
     * @return ISTASK
     */
    public com.ibm.www.maximo.MXBooleanType getISTASK() {
        return ISTASK;
    }


    /**
     * Sets the ISTASK value for this MXWO_WORKORDERType.
     * 
     * @param ISTASK
     */
    public void setISTASK(com.ibm.www.maximo.MXBooleanType ISTASK) {
        this.ISTASK = ISTASK;
    }


    /**
     * Gets the JOBTASKID value for this MXWO_WORKORDERType.
     * 
     * @return JOBTASKID
     */
    public com.ibm.www.maximo.MXLongType getJOBTASKID() {
        return JOBTASKID;
    }


    /**
     * Sets the JOBTASKID value for this MXWO_WORKORDERType.
     * 
     * @param JOBTASKID
     */
    public void setJOBTASKID(com.ibm.www.maximo.MXLongType JOBTASKID) {
        this.JOBTASKID = JOBTASKID;
    }


    /**
     * Gets the JPNUM value for this MXWO_WORKORDERType.
     * 
     * @return JPNUM
     */
    public com.ibm.www.maximo.MXStringType getJPNUM() {
        return JPNUM;
    }


    /**
     * Sets the JPNUM value for this MXWO_WORKORDERType.
     * 
     * @param JPNUM
     */
    public void setJPNUM(com.ibm.www.maximo.MXStringType JPNUM) {
        this.JPNUM = JPNUM;
    }


    /**
     * Gets the JUSTIFYPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @return JUSTIFYPRIORITY
     */
    public com.ibm.www.maximo.MXStringType getJUSTIFYPRIORITY() {
        return JUSTIFYPRIORITY;
    }


    /**
     * Sets the JUSTIFYPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @param JUSTIFYPRIORITY
     */
    public void setJUSTIFYPRIORITY(com.ibm.www.maximo.MXStringType JUSTIFYPRIORITY) {
        this.JUSTIFYPRIORITY = JUSTIFYPRIORITY;
    }


    /**
     * Gets the LASTCOPYLINKDATE value for this MXWO_WORKORDERType.
     * 
     * @return LASTCOPYLINKDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getLASTCOPYLINKDATE() {
        return LASTCOPYLINKDATE;
    }


    /**
     * Sets the LASTCOPYLINKDATE value for this MXWO_WORKORDERType.
     * 
     * @param LASTCOPYLINKDATE
     */
    public void setLASTCOPYLINKDATE(com.ibm.www.maximo.MXDateTimeType LASTCOPYLINKDATE) {
        this.LASTCOPYLINKDATE = LASTCOPYLINKDATE;
    }


    /**
     * Gets the LAUNCHENTRYNAME value for this MXWO_WORKORDERType.
     * 
     * @return LAUNCHENTRYNAME
     */
    public com.ibm.www.maximo.MXStringType getLAUNCHENTRYNAME() {
        return LAUNCHENTRYNAME;
    }


    /**
     * Sets the LAUNCHENTRYNAME value for this MXWO_WORKORDERType.
     * 
     * @param LAUNCHENTRYNAME
     */
    public void setLAUNCHENTRYNAME(com.ibm.www.maximo.MXStringType LAUNCHENTRYNAME) {
        this.LAUNCHENTRYNAME = LAUNCHENTRYNAME;
    }


    /**
     * Gets the LEAD value for this MXWO_WORKORDERType.
     * 
     * @return LEAD
     */
    public com.ibm.www.maximo.MXStringType getLEAD() {
        return LEAD;
    }


    /**
     * Sets the LEAD value for this MXWO_WORKORDERType.
     * 
     * @param LEAD
     */
    public void setLEAD(com.ibm.www.maximo.MXStringType LEAD) {
        this.LEAD = LEAD;
    }


    /**
     * Gets the LMS value for this MXWO_WORKORDERType.
     * 
     * @return LMS
     */
    public com.ibm.www.maximo.MXBooleanType getLMS() {
        return LMS;
    }


    /**
     * Sets the LMS value for this MXWO_WORKORDERType.
     * 
     * @param LMS
     */
    public void setLMS(com.ibm.www.maximo.MXBooleanType LMS) {
        this.LMS = LMS;
    }


    /**
     * Gets the LOCATION value for this MXWO_WORKORDERType.
     * 
     * @return LOCATION
     */
    public com.ibm.www.maximo.MXStringType getLOCATION() {
        return LOCATION;
    }


    /**
     * Sets the LOCATION value for this MXWO_WORKORDERType.
     * 
     * @param LOCATION
     */
    public void setLOCATION(com.ibm.www.maximo.MXStringType LOCATION) {
        this.LOCATION = LOCATION;
    }


    /**
     * Gets the LOS value for this MXWO_WORKORDERType.
     * 
     * @return LOS
     */
    public com.ibm.www.maximo.MXBooleanType getLOS() {
        return LOS;
    }


    /**
     * Sets the LOS value for this MXWO_WORKORDERType.
     * 
     * @param LOS
     */
    public void setLOS(com.ibm.www.maximo.MXBooleanType LOS) {
        this.LOS = LOS;
    }


    /**
     * Gets the MEASUREDATE value for this MXWO_WORKORDERType.
     * 
     * @return MEASUREDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getMEASUREDATE() {
        return MEASUREDATE;
    }


    /**
     * Sets the MEASUREDATE value for this MXWO_WORKORDERType.
     * 
     * @param MEASUREDATE
     */
    public void setMEASUREDATE(com.ibm.www.maximo.MXDateTimeType MEASUREDATE) {
        this.MEASUREDATE = MEASUREDATE;
    }


    /**
     * Gets the MEASUREMENTVALUE value for this MXWO_WORKORDERType.
     * 
     * @return MEASUREMENTVALUE
     */
    public com.ibm.www.maximo.MXDoubleType getMEASUREMENTVALUE() {
        return MEASUREMENTVALUE;
    }


    /**
     * Sets the MEASUREMENTVALUE value for this MXWO_WORKORDERType.
     * 
     * @param MEASUREMENTVALUE
     */
    public void setMEASUREMENTVALUE(com.ibm.www.maximo.MXDoubleType MEASUREMENTVALUE) {
        this.MEASUREMENTVALUE = MEASUREMENTVALUE;
    }


    /**
     * Gets the NESTEDJPINPROCESS value for this MXWO_WORKORDERType.
     * 
     * @return NESTEDJPINPROCESS
     */
    public com.ibm.www.maximo.MXBooleanType getNESTEDJPINPROCESS() {
        return NESTEDJPINPROCESS;
    }


    /**
     * Sets the NESTEDJPINPROCESS value for this MXWO_WORKORDERType.
     * 
     * @param NESTEDJPINPROCESS
     */
    public void setNESTEDJPINPROCESS(com.ibm.www.maximo.MXBooleanType NESTEDJPINPROCESS) {
        this.NESTEDJPINPROCESS = NESTEDJPINPROCESS;
    }


    /**
     * Gets the NEWCHILDCLASS value for this MXWO_WORKORDERType.
     * 
     * @return NEWCHILDCLASS
     */
    public com.ibm.www.maximo.MXStringType getNEWCHILDCLASS() {
        return NEWCHILDCLASS;
    }


    /**
     * Sets the NEWCHILDCLASS value for this MXWO_WORKORDERType.
     * 
     * @param NEWCHILDCLASS
     */
    public void setNEWCHILDCLASS(com.ibm.www.maximo.MXStringType NEWCHILDCLASS) {
        this.NEWCHILDCLASS = NEWCHILDCLASS;
    }


    /**
     * Gets the NP_STATUSMEMO value for this MXWO_WORKORDERType.
     * 
     * @return NP_STATUSMEMO
     */
    public com.ibm.www.maximo.MXStringType getNP_STATUSMEMO() {
        return NP_STATUSMEMO;
    }


    /**
     * Sets the NP_STATUSMEMO value for this MXWO_WORKORDERType.
     * 
     * @param NP_STATUSMEMO
     */
    public void setNP_STATUSMEMO(com.ibm.www.maximo.MXStringType NP_STATUSMEMO) {
        this.NP_STATUSMEMO = NP_STATUSMEMO;
    }


    /**
     * Gets the OBSERVATION value for this MXWO_WORKORDERType.
     * 
     * @return OBSERVATION
     */
    public com.ibm.www.maximo.MXStringType getOBSERVATION() {
        return OBSERVATION;
    }


    /**
     * Sets the OBSERVATION value for this MXWO_WORKORDERType.
     * 
     * @param OBSERVATION
     */
    public void setOBSERVATION(com.ibm.www.maximo.MXStringType OBSERVATION) {
        this.OBSERVATION = OBSERVATION;
    }


    /**
     * Gets the ONBEHALFOF value for this MXWO_WORKORDERType.
     * 
     * @return ONBEHALFOF
     */
    public com.ibm.www.maximo.MXStringType getONBEHALFOF() {
        return ONBEHALFOF;
    }


    /**
     * Sets the ONBEHALFOF value for this MXWO_WORKORDERType.
     * 
     * @param ONBEHALFOF
     */
    public void setONBEHALFOF(com.ibm.www.maximo.MXStringType ONBEHALFOF) {
        this.ONBEHALFOF = ONBEHALFOF;
    }


    /**
     * Gets the ORGID value for this MXWO_WORKORDERType.
     * 
     * @return ORGID
     */
    public com.ibm.www.maximo.MXStringType getORGID() {
        return ORGID;
    }


    /**
     * Sets the ORGID value for this MXWO_WORKORDERType.
     * 
     * @param ORGID
     */
    public void setORGID(com.ibm.www.maximo.MXStringType ORGID) {
        this.ORGID = ORGID;
    }


    /**
     * Gets the ORIGRECORDCLASS value for this MXWO_WORKORDERType.
     * 
     * @return ORIGRECORDCLASS
     */
    public com.ibm.www.maximo.MXStringType getORIGRECORDCLASS() {
        return ORIGRECORDCLASS;
    }


    /**
     * Sets the ORIGRECORDCLASS value for this MXWO_WORKORDERType.
     * 
     * @param ORIGRECORDCLASS
     */
    public void setORIGRECORDCLASS(com.ibm.www.maximo.MXStringType ORIGRECORDCLASS) {
        this.ORIGRECORDCLASS = ORIGRECORDCLASS;
    }


    /**
     * Gets the ORIGRECORDID value for this MXWO_WORKORDERType.
     * 
     * @return ORIGRECORDID
     */
    public com.ibm.www.maximo.MXStringType getORIGRECORDID() {
        return ORIGRECORDID;
    }


    /**
     * Sets the ORIGRECORDID value for this MXWO_WORKORDERType.
     * 
     * @param ORIGRECORDID
     */
    public void setORIGRECORDID(com.ibm.www.maximo.MXStringType ORIGRECORDID) {
        this.ORIGRECORDID = ORIGRECORDID;
    }


    /**
     * Gets the OUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @return OUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleType getOUTLABCOST() {
        return OUTLABCOST;
    }


    /**
     * Sets the OUTLABCOST value for this MXWO_WORKORDERType.
     * 
     * @param OUTLABCOST
     */
    public void setOUTLABCOST(com.ibm.www.maximo.MXDoubleType OUTLABCOST) {
        this.OUTLABCOST = OUTLABCOST;
    }


    /**
     * Gets the OUTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @return OUTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleType getOUTMATCOST() {
        return OUTMATCOST;
    }


    /**
     * Sets the OUTMATCOST value for this MXWO_WORKORDERType.
     * 
     * @param OUTMATCOST
     */
    public void setOUTMATCOST(com.ibm.www.maximo.MXDoubleType OUTMATCOST) {
        this.OUTMATCOST = OUTMATCOST;
    }


    /**
     * Gets the OUTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @return OUTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleType getOUTTOOLCOST() {
        return OUTTOOLCOST;
    }


    /**
     * Sets the OUTTOOLCOST value for this MXWO_WORKORDERType.
     * 
     * @param OUTTOOLCOST
     */
    public void setOUTTOOLCOST(com.ibm.www.maximo.MXDoubleType OUTTOOLCOST) {
        this.OUTTOOLCOST = OUTTOOLCOST;
    }


    /**
     * Gets the OWNER value for this MXWO_WORKORDERType.
     * 
     * @return OWNER
     */
    public com.ibm.www.maximo.MXStringType getOWNER() {
        return OWNER;
    }


    /**
     * Sets the OWNER value for this MXWO_WORKORDERType.
     * 
     * @param OWNER
     */
    public void setOWNER(com.ibm.www.maximo.MXStringType OWNER) {
        this.OWNER = OWNER;
    }


    /**
     * Gets the OWNERGROUP value for this MXWO_WORKORDERType.
     * 
     * @return OWNERGROUP
     */
    public com.ibm.www.maximo.MXStringType getOWNERGROUP() {
        return OWNERGROUP;
    }


    /**
     * Sets the OWNERGROUP value for this MXWO_WORKORDERType.
     * 
     * @param OWNERGROUP
     */
    public void setOWNERGROUP(com.ibm.www.maximo.MXStringType OWNERGROUP) {
        this.OWNERGROUP = OWNERGROUP;
    }


    /**
     * Gets the OWNERSYSID value for this MXWO_WORKORDERType.
     * 
     * @return OWNERSYSID
     */
    public com.ibm.www.maximo.MXStringType getOWNERSYSID() {
        return OWNERSYSID;
    }


    /**
     * Sets the OWNERSYSID value for this MXWO_WORKORDERType.
     * 
     * @param OWNERSYSID
     */
    public void setOWNERSYSID(com.ibm.www.maximo.MXStringType OWNERSYSID) {
        this.OWNERSYSID = OWNERSYSID;
    }


    /**
     * Gets the PARENT value for this MXWO_WORKORDERType.
     * 
     * @return PARENT
     */
    public com.ibm.www.maximo.MXStringType getPARENT() {
        return PARENT;
    }


    /**
     * Sets the PARENT value for this MXWO_WORKORDERType.
     * 
     * @param PARENT
     */
    public void setPARENT(com.ibm.www.maximo.MXStringType PARENT) {
        this.PARENT = PARENT;
    }


    /**
     * Gets the PARENTCHGSSTATUS value for this MXWO_WORKORDERType.
     * 
     * @return PARENTCHGSSTATUS
     */
    public com.ibm.www.maximo.MXBooleanType getPARENTCHGSSTATUS() {
        return PARENTCHGSSTATUS;
    }


    /**
     * Sets the PARENTCHGSSTATUS value for this MXWO_WORKORDERType.
     * 
     * @param PARENTCHGSSTATUS
     */
    public void setPARENTCHGSSTATUS(com.ibm.www.maximo.MXBooleanType PARENTCHGSSTATUS) {
        this.PARENTCHGSSTATUS = PARENTCHGSSTATUS;
    }


    /**
     * Gets the PERSONGROUP value for this MXWO_WORKORDERType.
     * 
     * @return PERSONGROUP
     */
    public com.ibm.www.maximo.MXStringType getPERSONGROUP() {
        return PERSONGROUP;
    }


    /**
     * Sets the PERSONGROUP value for this MXWO_WORKORDERType.
     * 
     * @param PERSONGROUP
     */
    public void setPERSONGROUP(com.ibm.www.maximo.MXStringType PERSONGROUP) {
        this.PERSONGROUP = PERSONGROUP;
    }


    /**
     * Gets the PHONE value for this MXWO_WORKORDERType.
     * 
     * @return PHONE
     */
    public com.ibm.www.maximo.MXStringType getPHONE() {
        return PHONE;
    }


    /**
     * Sets the PHONE value for this MXWO_WORKORDERType.
     * 
     * @param PHONE
     */
    public void setPHONE(com.ibm.www.maximo.MXStringType PHONE) {
        this.PHONE = PHONE;
    }


    /**
     * Gets the PLUSCFREQUENCY value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCFREQUENCY
     */
    public com.ibm.www.maximo.MXLongType getPLUSCFREQUENCY() {
        return PLUSCFREQUENCY;
    }


    /**
     * Sets the PLUSCFREQUENCY value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCFREQUENCY
     */
    public void setPLUSCFREQUENCY(com.ibm.www.maximo.MXLongType PLUSCFREQUENCY) {
        this.PLUSCFREQUENCY = PLUSCFREQUENCY;
    }


    /**
     * Gets the PLUSCFREQUNIT value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCFREQUNIT
     */
    public com.ibm.www.maximo.MXDomainType getPLUSCFREQUNIT() {
        return PLUSCFREQUNIT;
    }


    /**
     * Sets the PLUSCFREQUNIT value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCFREQUNIT
     */
    public void setPLUSCFREQUNIT(com.ibm.www.maximo.MXDomainType PLUSCFREQUNIT) {
        this.PLUSCFREQUNIT = PLUSCFREQUNIT;
    }


    /**
     * Gets the PLUSCISMOBILE value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCISMOBILE
     */
    public com.ibm.www.maximo.MXBooleanType getPLUSCISMOBILE() {
        return PLUSCISMOBILE;
    }


    /**
     * Sets the PLUSCISMOBILE value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCISMOBILE
     */
    public void setPLUSCISMOBILE(com.ibm.www.maximo.MXBooleanType PLUSCISMOBILE) {
        this.PLUSCISMOBILE = PLUSCISMOBILE;
    }


    /**
     * Gets the PLUSCJPREVNUM value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCJPREVNUM
     */
    public com.ibm.www.maximo.MXLongType getPLUSCJPREVNUM() {
        return PLUSCJPREVNUM;
    }


    /**
     * Sets the PLUSCJPREVNUM value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCJPREVNUM
     */
    public void setPLUSCJPREVNUM(com.ibm.www.maximo.MXLongType PLUSCJPREVNUM) {
        this.PLUSCJPREVNUM = PLUSCJPREVNUM;
    }


    /**
     * Gets the PLUSCLOOP value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCLOOP
     */
    public com.ibm.www.maximo.MXBooleanType getPLUSCLOOP() {
        return PLUSCLOOP;
    }


    /**
     * Sets the PLUSCLOOP value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCLOOP
     */
    public void setPLUSCLOOP(com.ibm.www.maximo.MXBooleanType PLUSCLOOP) {
        this.PLUSCLOOP = PLUSCLOOP;
    }


    /**
     * Gets the PLUSCNEXTDATE value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCNEXTDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getPLUSCNEXTDATE() {
        return PLUSCNEXTDATE;
    }


    /**
     * Sets the PLUSCNEXTDATE value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCNEXTDATE
     */
    public void setPLUSCNEXTDATE(com.ibm.www.maximo.MXDateTimeType PLUSCNEXTDATE) {
        this.PLUSCNEXTDATE = PLUSCNEXTDATE;
    }


    /**
     * Gets the PLUSCOVERDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCOVERDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getPLUSCOVERDUEDATE() {
        return PLUSCOVERDUEDATE;
    }


    /**
     * Sets the PLUSCOVERDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCOVERDUEDATE
     */
    public void setPLUSCOVERDUEDATE(com.ibm.www.maximo.MXDateTimeType PLUSCOVERDUEDATE) {
        this.PLUSCOVERDUEDATE = PLUSCOVERDUEDATE;
    }


    /**
     * Gets the PLUSCPHYLOC value for this MXWO_WORKORDERType.
     * 
     * @return PLUSCPHYLOC
     */
    public com.ibm.www.maximo.MXStringType getPLUSCPHYLOC() {
        return PLUSCPHYLOC;
    }


    /**
     * Sets the PLUSCPHYLOC value for this MXWO_WORKORDERType.
     * 
     * @param PLUSCPHYLOC
     */
    public void setPLUSCPHYLOC(com.ibm.www.maximo.MXStringType PLUSCPHYLOC) {
        this.PLUSCPHYLOC = PLUSCPHYLOC;
    }


    /**
     * Gets the PMDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @return PMDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getPMDUEDATE() {
        return PMDUEDATE;
    }


    /**
     * Sets the PMDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @param PMDUEDATE
     */
    public void setPMDUEDATE(com.ibm.www.maximo.MXDateTimeType PMDUEDATE) {
        this.PMDUEDATE = PMDUEDATE;
    }


    /**
     * Gets the PMEXTDATE value for this MXWO_WORKORDERType.
     * 
     * @return PMEXTDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getPMEXTDATE() {
        return PMEXTDATE;
    }


    /**
     * Sets the PMEXTDATE value for this MXWO_WORKORDERType.
     * 
     * @param PMEXTDATE
     */
    public void setPMEXTDATE(com.ibm.www.maximo.MXDateTimeType PMEXTDATE) {
        this.PMEXTDATE = PMEXTDATE;
    }


    /**
     * Gets the PMNEXTDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @return PMNEXTDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getPMNEXTDUEDATE() {
        return PMNEXTDUEDATE;
    }


    /**
     * Sets the PMNEXTDUEDATE value for this MXWO_WORKORDERType.
     * 
     * @param PMNEXTDUEDATE
     */
    public void setPMNEXTDUEDATE(com.ibm.www.maximo.MXDateTimeType PMNEXTDUEDATE) {
        this.PMNEXTDUEDATE = PMNEXTDUEDATE;
    }


    /**
     * Gets the PMNUM value for this MXWO_WORKORDERType.
     * 
     * @return PMNUM
     */
    public com.ibm.www.maximo.MXStringType getPMNUM() {
        return PMNUM;
    }


    /**
     * Sets the PMNUM value for this MXWO_WORKORDERType.
     * 
     * @param PMNUM
     */
    public void setPMNUM(com.ibm.www.maximo.MXStringType PMNUM) {
        this.PMNUM = PMNUM;
    }


    /**
     * Gets the POINTNUM value for this MXWO_WORKORDERType.
     * 
     * @return POINTNUM
     */
    public com.ibm.www.maximo.MXStringType getPOINTNUM() {
        return POINTNUM;
    }


    /**
     * Sets the POINTNUM value for this MXWO_WORKORDERType.
     * 
     * @param POINTNUM
     */
    public void setPOINTNUM(com.ibm.www.maximo.MXStringType POINTNUM) {
        this.POINTNUM = POINTNUM;
    }


    /**
     * Gets the PROBLEMCODE value for this MXWO_WORKORDERType.
     * 
     * @return PROBLEMCODE
     */
    public com.ibm.www.maximo.MXStringType getPROBLEMCODE() {
        return PROBLEMCODE;
    }


    /**
     * Sets the PROBLEMCODE value for this MXWO_WORKORDERType.
     * 
     * @param PROBLEMCODE
     */
    public void setPROBLEMCODE(com.ibm.www.maximo.MXStringType PROBLEMCODE) {
        this.PROBLEMCODE = PROBLEMCODE;
    }


    /**
     * Gets the REASONFORCHANGE value for this MXWO_WORKORDERType.
     * 
     * @return REASONFORCHANGE
     */
    public com.ibm.www.maximo.MXStringType getREASONFORCHANGE() {
        return REASONFORCHANGE;
    }


    /**
     * Sets the REASONFORCHANGE value for this MXWO_WORKORDERType.
     * 
     * @param REASONFORCHANGE
     */
    public void setREASONFORCHANGE(com.ibm.www.maximo.MXStringType REASONFORCHANGE) {
        this.REASONFORCHANGE = REASONFORCHANGE;
    }


    /**
     * Gets the REMDUR value for this MXWO_WORKORDERType.
     * 
     * @return REMDUR
     */
    public com.ibm.www.maximo.MXDoubleType getREMDUR() {
        return REMDUR;
    }


    /**
     * Sets the REMDUR value for this MXWO_WORKORDERType.
     * 
     * @param REMDUR
     */
    public void setREMDUR(com.ibm.www.maximo.MXDoubleType REMDUR) {
        this.REMDUR = REMDUR;
    }


    /**
     * Gets the REPAIRFACILITY value for this MXWO_WORKORDERType.
     * 
     * @return REPAIRFACILITY
     */
    public com.ibm.www.maximo.MXStringType getREPAIRFACILITY() {
        return REPAIRFACILITY;
    }


    /**
     * Sets the REPAIRFACILITY value for this MXWO_WORKORDERType.
     * 
     * @param REPAIRFACILITY
     */
    public void setREPAIRFACILITY(com.ibm.www.maximo.MXStringType REPAIRFACILITY) {
        this.REPAIRFACILITY = REPAIRFACILITY;
    }


    /**
     * Gets the REPFACSITEID value for this MXWO_WORKORDERType.
     * 
     * @return REPFACSITEID
     */
    public com.ibm.www.maximo.MXStringType getREPFACSITEID() {
        return REPFACSITEID;
    }


    /**
     * Sets the REPFACSITEID value for this MXWO_WORKORDERType.
     * 
     * @param REPFACSITEID
     */
    public void setREPFACSITEID(com.ibm.www.maximo.MXStringType REPFACSITEID) {
        this.REPFACSITEID = REPFACSITEID;
    }


    /**
     * Gets the REPORTDATE value for this MXWO_WORKORDERType.
     * 
     * @return REPORTDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getREPORTDATE() {
        return REPORTDATE;
    }


    /**
     * Sets the REPORTDATE value for this MXWO_WORKORDERType.
     * 
     * @param REPORTDATE
     */
    public void setREPORTDATE(com.ibm.www.maximo.MXDateTimeType REPORTDATE) {
        this.REPORTDATE = REPORTDATE;
    }


    /**
     * Gets the REPORTEDBY value for this MXWO_WORKORDERType.
     * 
     * @return REPORTEDBY
     */
    public com.ibm.www.maximo.MXStringType getREPORTEDBY() {
        return REPORTEDBY;
    }


    /**
     * Sets the REPORTEDBY value for this MXWO_WORKORDERType.
     * 
     * @param REPORTEDBY
     */
    public void setREPORTEDBY(com.ibm.www.maximo.MXStringType REPORTEDBY) {
        this.REPORTEDBY = REPORTEDBY;
    }


    /**
     * Gets the REQASSTDWNTIME value for this MXWO_WORKORDERType.
     * 
     * @return REQASSTDWNTIME
     */
    public com.ibm.www.maximo.MXBooleanType getREQASSTDWNTIME() {
        return REQASSTDWNTIME;
    }


    /**
     * Sets the REQASSTDWNTIME value for this MXWO_WORKORDERType.
     * 
     * @param REQASSTDWNTIME
     */
    public void setREQASSTDWNTIME(com.ibm.www.maximo.MXBooleanType REQASSTDWNTIME) {
        this.REQASSTDWNTIME = REQASSTDWNTIME;
    }


    /**
     * Gets the RESPONDBY value for this MXWO_WORKORDERType.
     * 
     * @return RESPONDBY
     */
    public com.ibm.www.maximo.MXDateTimeType getRESPONDBY() {
        return RESPONDBY;
    }


    /**
     * Sets the RESPONDBY value for this MXWO_WORKORDERType.
     * 
     * @param RESPONDBY
     */
    public void setRESPONDBY(com.ibm.www.maximo.MXDateTimeType RESPONDBY) {
        this.RESPONDBY = RESPONDBY;
    }


    /**
     * Gets the RISK value for this MXWO_WORKORDERType.
     * 
     * @return RISK
     */
    public com.ibm.www.maximo.MXStringType getRISK() {
        return RISK;
    }


    /**
     * Sets the RISK value for this MXWO_WORKORDERType.
     * 
     * @param RISK
     */
    public void setRISK(com.ibm.www.maximo.MXStringType RISK) {
        this.RISK = RISK;
    }


    /**
     * Gets the ROUTE value for this MXWO_WORKORDERType.
     * 
     * @return ROUTE
     */
    public com.ibm.www.maximo.MXStringType getROUTE() {
        return ROUTE;
    }


    /**
     * Sets the ROUTE value for this MXWO_WORKORDERType.
     * 
     * @param ROUTE
     */
    public void setROUTE(com.ibm.www.maximo.MXStringType ROUTE) {
        this.ROUTE = ROUTE;
    }


    /**
     * Gets the ROUTESTOPID value for this MXWO_WORKORDERType.
     * 
     * @return ROUTESTOPID
     */
    public com.ibm.www.maximo.MXLongType getROUTESTOPID() {
        return ROUTESTOPID;
    }


    /**
     * Sets the ROUTESTOPID value for this MXWO_WORKORDERType.
     * 
     * @param ROUTESTOPID
     */
    public void setROUTESTOPID(com.ibm.www.maximo.MXLongType ROUTESTOPID) {
        this.ROUTESTOPID = ROUTESTOPID;
    }


    /**
     * Gets the SCHEDFINISH value for this MXWO_WORKORDERType.
     * 
     * @return SCHEDFINISH
     */
    public com.ibm.www.maximo.MXDateTimeType getSCHEDFINISH() {
        return SCHEDFINISH;
    }


    /**
     * Sets the SCHEDFINISH value for this MXWO_WORKORDERType.
     * 
     * @param SCHEDFINISH
     */
    public void setSCHEDFINISH(com.ibm.www.maximo.MXDateTimeType SCHEDFINISH) {
        this.SCHEDFINISH = SCHEDFINISH;
    }


    /**
     * Gets the SCHEDSTART value for this MXWO_WORKORDERType.
     * 
     * @return SCHEDSTART
     */
    public com.ibm.www.maximo.MXDateTimeType getSCHEDSTART() {
        return SCHEDSTART;
    }


    /**
     * Sets the SCHEDSTART value for this MXWO_WORKORDERType.
     * 
     * @param SCHEDSTART
     */
    public void setSCHEDSTART(com.ibm.www.maximo.MXDateTimeType SCHEDSTART) {
        this.SCHEDSTART = SCHEDSTART;
    }


    /**
     * Gets the SENDERSYSID value for this MXWO_WORKORDERType.
     * 
     * @return SENDERSYSID
     */
    public com.ibm.www.maximo.MXStringType getSENDERSYSID() {
        return SENDERSYSID;
    }


    /**
     * Sets the SENDERSYSID value for this MXWO_WORKORDERType.
     * 
     * @param SENDERSYSID
     */
    public void setSENDERSYSID(com.ibm.www.maximo.MXStringType SENDERSYSID) {
        this.SENDERSYSID = SENDERSYSID;
    }


    /**
     * Gets the SITEID value for this MXWO_WORKORDERType.
     * 
     * @return SITEID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getSITEID() {
        return SITEID;
    }


    /**
     * Sets the SITEID value for this MXWO_WORKORDERType.
     * 
     * @param SITEID   * Unique Key Component
     */
    public void setSITEID(com.ibm.www.maximo.MXStringType SITEID) {
        this.SITEID = SITEID;
    }


    /**
     * Gets the SNECONSTRAINT value for this MXWO_WORKORDERType.
     * 
     * @return SNECONSTRAINT
     */
    public com.ibm.www.maximo.MXDateTimeType getSNECONSTRAINT() {
        return SNECONSTRAINT;
    }


    /**
     * Sets the SNECONSTRAINT value for this MXWO_WORKORDERType.
     * 
     * @param SNECONSTRAINT
     */
    public void setSNECONSTRAINT(com.ibm.www.maximo.MXDateTimeType SNECONSTRAINT) {
        this.SNECONSTRAINT = SNECONSTRAINT;
    }


    /**
     * Gets the SOURCESYSID value for this MXWO_WORKORDERType.
     * 
     * @return SOURCESYSID
     */
    public com.ibm.www.maximo.MXStringType getSOURCESYSID() {
        return SOURCESYSID;
    }


    /**
     * Sets the SOURCESYSID value for this MXWO_WORKORDERType.
     * 
     * @param SOURCESYSID
     */
    public void setSOURCESYSID(com.ibm.www.maximo.MXStringType SOURCESYSID) {
        this.SOURCESYSID = SOURCESYSID;
    }


    /**
     * Gets the STATUS value for this MXWO_WORKORDERType.
     * 
     * @return STATUS
     */
    public com.ibm.www.maximo.MXDomainType getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this MXWO_WORKORDERType.
     * 
     * @param STATUS
     */
    public void setSTATUS(com.ibm.www.maximo.MXDomainType STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the STATUSDATE value for this MXWO_WORKORDERType.
     * 
     * @return STATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getSTATUSDATE() {
        return STATUSDATE;
    }


    /**
     * Sets the STATUSDATE value for this MXWO_WORKORDERType.
     * 
     * @param STATUSDATE
     */
    public void setSTATUSDATE(com.ibm.www.maximo.MXDateTimeType STATUSDATE) {
        this.STATUSDATE = STATUSDATE;
    }


    /**
     * Gets the STATUSIFACE value for this MXWO_WORKORDERType.
     * 
     * @return STATUSIFACE
     */
    public com.ibm.www.maximo.MXBooleanType getSTATUSIFACE() {
        return STATUSIFACE;
    }


    /**
     * Sets the STATUSIFACE value for this MXWO_WORKORDERType.
     * 
     * @param STATUSIFACE
     */
    public void setSTATUSIFACE(com.ibm.www.maximo.MXBooleanType STATUSIFACE) {
        this.STATUSIFACE = STATUSIFACE;
    }


    /**
     * Gets the STOREROOMMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @return STOREROOMMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainType getSTOREROOMMTLSTATUS() {
        return STOREROOMMTLSTATUS;
    }


    /**
     * Sets the STOREROOMMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @param STOREROOMMTLSTATUS
     */
    public void setSTOREROOMMTLSTATUS(com.ibm.www.maximo.MXDomainType STOREROOMMTLSTATUS) {
        this.STOREROOMMTLSTATUS = STOREROOMMTLSTATUS;
    }


    /**
     * Gets the SUPERVISOR value for this MXWO_WORKORDERType.
     * 
     * @return SUPERVISOR
     */
    public com.ibm.www.maximo.MXStringType getSUPERVISOR() {
        return SUPERVISOR;
    }


    /**
     * Sets the SUPERVISOR value for this MXWO_WORKORDERType.
     * 
     * @param SUPERVISOR
     */
    public void setSUPERVISOR(com.ibm.www.maximo.MXStringType SUPERVISOR) {
        this.SUPERVISOR = SUPERVISOR;
    }


    /**
     * Gets the SUSPENDFLOW value for this MXWO_WORKORDERType.
     * 
     * @return SUSPENDFLOW
     */
    public com.ibm.www.maximo.MXBooleanType getSUSPENDFLOW() {
        return SUSPENDFLOW;
    }


    /**
     * Sets the SUSPENDFLOW value for this MXWO_WORKORDERType.
     * 
     * @param SUSPENDFLOW
     */
    public void setSUSPENDFLOW(com.ibm.www.maximo.MXBooleanType SUSPENDFLOW) {
        this.SUSPENDFLOW = SUSPENDFLOW;
    }


    /**
     * Gets the TARGCOMPDATE value for this MXWO_WORKORDERType.
     * 
     * @return TARGCOMPDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getTARGCOMPDATE() {
        return TARGCOMPDATE;
    }


    /**
     * Sets the TARGCOMPDATE value for this MXWO_WORKORDERType.
     * 
     * @param TARGCOMPDATE
     */
    public void setTARGCOMPDATE(com.ibm.www.maximo.MXDateTimeType TARGCOMPDATE) {
        this.TARGCOMPDATE = TARGCOMPDATE;
    }


    /**
     * Gets the TARGETDESC value for this MXWO_WORKORDERType.
     * 
     * @return TARGETDESC
     */
    public com.ibm.www.maximo.MXStringType getTARGETDESC() {
        return TARGETDESC;
    }


    /**
     * Sets the TARGETDESC value for this MXWO_WORKORDERType.
     * 
     * @param TARGETDESC
     */
    public void setTARGETDESC(com.ibm.www.maximo.MXStringType TARGETDESC) {
        this.TARGETDESC = TARGETDESC;
    }


    /**
     * Gets the TARGSTARTDATE value for this MXWO_WORKORDERType.
     * 
     * @return TARGSTARTDATE
     */
    public com.ibm.www.maximo.MXDateTimeType getTARGSTARTDATE() {
        return TARGSTARTDATE;
    }


    /**
     * Sets the TARGSTARTDATE value for this MXWO_WORKORDERType.
     * 
     * @param TARGSTARTDATE
     */
    public void setTARGSTARTDATE(com.ibm.www.maximo.MXDateTimeType TARGSTARTDATE) {
        this.TARGSTARTDATE = TARGSTARTDATE;
    }


    /**
     * Gets the TASKID value for this MXWO_WORKORDERType.
     * 
     * @return TASKID
     */
    public com.ibm.www.maximo.MXLongType getTASKID() {
        return TASKID;
    }


    /**
     * Sets the TASKID value for this MXWO_WORKORDERType.
     * 
     * @param TASKID
     */
    public void setTASKID(com.ibm.www.maximo.MXLongType TASKID) {
        this.TASKID = TASKID;
    }


    /**
     * Gets the VENDOR value for this MXWO_WORKORDERType.
     * 
     * @return VENDOR
     */
    public com.ibm.www.maximo.MXStringType getVENDOR() {
        return VENDOR;
    }


    /**
     * Sets the VENDOR value for this MXWO_WORKORDERType.
     * 
     * @param VENDOR
     */
    public void setVENDOR(com.ibm.www.maximo.MXStringType VENDOR) {
        this.VENDOR = VENDOR;
    }


    /**
     * Gets the VERIFICATION value for this MXWO_WORKORDERType.
     * 
     * @return VERIFICATION
     */
    public com.ibm.www.maximo.MXStringType getVERIFICATION() {
        return VERIFICATION;
    }


    /**
     * Sets the VERIFICATION value for this MXWO_WORKORDERType.
     * 
     * @param VERIFICATION
     */
    public void setVERIFICATION(com.ibm.www.maximo.MXStringType VERIFICATION) {
        this.VERIFICATION = VERIFICATION;
    }


    /**
     * Gets the WHOMISCHANGEFOR value for this MXWO_WORKORDERType.
     * 
     * @return WHOMISCHANGEFOR
     */
    public com.ibm.www.maximo.MXStringType getWHOMISCHANGEFOR() {
        return WHOMISCHANGEFOR;
    }


    /**
     * Sets the WHOMISCHANGEFOR value for this MXWO_WORKORDERType.
     * 
     * @param WHOMISCHANGEFOR
     */
    public void setWHOMISCHANGEFOR(com.ibm.www.maximo.MXStringType WHOMISCHANGEFOR) {
        this.WHOMISCHANGEFOR = WHOMISCHANGEFOR;
    }


    /**
     * Gets the WOACCEPTSCHARGES value for this MXWO_WORKORDERType.
     * 
     * @return WOACCEPTSCHARGES
     */
    public com.ibm.www.maximo.MXBooleanType getWOACCEPTSCHARGES() {
        return WOACCEPTSCHARGES;
    }


    /**
     * Sets the WOACCEPTSCHARGES value for this MXWO_WORKORDERType.
     * 
     * @param WOACCEPTSCHARGES
     */
    public void setWOACCEPTSCHARGES(com.ibm.www.maximo.MXBooleanType WOACCEPTSCHARGES) {
        this.WOACCEPTSCHARGES = WOACCEPTSCHARGES;
    }


    /**
     * Gets the WOCLASS value for this MXWO_WORKORDERType.
     * 
     * @return WOCLASS
     */
    public com.ibm.www.maximo.MXDomainType getWOCLASS() {
        return WOCLASS;
    }


    /**
     * Sets the WOCLASS value for this MXWO_WORKORDERType.
     * 
     * @param WOCLASS
     */
    public void setWOCLASS(com.ibm.www.maximo.MXDomainType WOCLASS) {
        this.WOCLASS = WOCLASS;
    }


    /**
     * Gets the WOEQ1 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ1
     */
    public com.ibm.www.maximo.MXStringType getWOEQ1() {
        return WOEQ1;
    }


    /**
     * Sets the WOEQ1 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ1
     */
    public void setWOEQ1(com.ibm.www.maximo.MXStringType WOEQ1) {
        this.WOEQ1 = WOEQ1;
    }


    /**
     * Gets the WOEQ10 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ10
     */
    public com.ibm.www.maximo.MXStringType getWOEQ10() {
        return WOEQ10;
    }


    /**
     * Sets the WOEQ10 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ10
     */
    public void setWOEQ10(com.ibm.www.maximo.MXStringType WOEQ10) {
        this.WOEQ10 = WOEQ10;
    }


    /**
     * Gets the WOEQ11 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ11
     */
    public com.ibm.www.maximo.MXStringType getWOEQ11() {
        return WOEQ11;
    }


    /**
     * Sets the WOEQ11 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ11
     */
    public void setWOEQ11(com.ibm.www.maximo.MXStringType WOEQ11) {
        this.WOEQ11 = WOEQ11;
    }


    /**
     * Gets the WOEQ12 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ12
     */
    public com.ibm.www.maximo.MXDoubleType getWOEQ12() {
        return WOEQ12;
    }


    /**
     * Sets the WOEQ12 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ12
     */
    public void setWOEQ12(com.ibm.www.maximo.MXDoubleType WOEQ12) {
        this.WOEQ12 = WOEQ12;
    }


    /**
     * Gets the WOEQ13 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ13
     */
    public com.ibm.www.maximo.MXDateTimeType getWOEQ13() {
        return WOEQ13;
    }


    /**
     * Sets the WOEQ13 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ13
     */
    public void setWOEQ13(com.ibm.www.maximo.MXDateTimeType WOEQ13) {
        this.WOEQ13 = WOEQ13;
    }


    /**
     * Gets the WOEQ14 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ14
     */
    public com.ibm.www.maximo.MXDoubleType getWOEQ14() {
        return WOEQ14;
    }


    /**
     * Sets the WOEQ14 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ14
     */
    public void setWOEQ14(com.ibm.www.maximo.MXDoubleType WOEQ14) {
        this.WOEQ14 = WOEQ14;
    }


    /**
     * Gets the WOEQ2 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ2
     */
    public com.ibm.www.maximo.MXStringType getWOEQ2() {
        return WOEQ2;
    }


    /**
     * Sets the WOEQ2 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ2
     */
    public void setWOEQ2(com.ibm.www.maximo.MXStringType WOEQ2) {
        this.WOEQ2 = WOEQ2;
    }


    /**
     * Gets the WOEQ3 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ3
     */
    public com.ibm.www.maximo.MXStringType getWOEQ3() {
        return WOEQ3;
    }


    /**
     * Sets the WOEQ3 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ3
     */
    public void setWOEQ3(com.ibm.www.maximo.MXStringType WOEQ3) {
        this.WOEQ3 = WOEQ3;
    }


    /**
     * Gets the WOEQ4 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ4
     */
    public com.ibm.www.maximo.MXStringType getWOEQ4() {
        return WOEQ4;
    }


    /**
     * Sets the WOEQ4 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ4
     */
    public void setWOEQ4(com.ibm.www.maximo.MXStringType WOEQ4) {
        this.WOEQ4 = WOEQ4;
    }


    /**
     * Gets the WOEQ5 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ5
     */
    public com.ibm.www.maximo.MXDoubleType getWOEQ5() {
        return WOEQ5;
    }


    /**
     * Sets the WOEQ5 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ5
     */
    public void setWOEQ5(com.ibm.www.maximo.MXDoubleType WOEQ5) {
        this.WOEQ5 = WOEQ5;
    }


    /**
     * Gets the WOEQ6 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ6
     */
    public com.ibm.www.maximo.MXDateTimeType getWOEQ6() {
        return WOEQ6;
    }


    /**
     * Sets the WOEQ6 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ6
     */
    public void setWOEQ6(com.ibm.www.maximo.MXDateTimeType WOEQ6) {
        this.WOEQ6 = WOEQ6;
    }


    /**
     * Gets the WOEQ7 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ7
     */
    public com.ibm.www.maximo.MXDoubleType getWOEQ7() {
        return WOEQ7;
    }


    /**
     * Sets the WOEQ7 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ7
     */
    public void setWOEQ7(com.ibm.www.maximo.MXDoubleType WOEQ7) {
        this.WOEQ7 = WOEQ7;
    }


    /**
     * Gets the WOEQ8 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ8
     */
    public com.ibm.www.maximo.MXStringType getWOEQ8() {
        return WOEQ8;
    }


    /**
     * Sets the WOEQ8 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ8
     */
    public void setWOEQ8(com.ibm.www.maximo.MXStringType WOEQ8) {
        this.WOEQ8 = WOEQ8;
    }


    /**
     * Gets the WOEQ9 value for this MXWO_WORKORDERType.
     * 
     * @return WOEQ9
     */
    public com.ibm.www.maximo.MXStringType getWOEQ9() {
        return WOEQ9;
    }


    /**
     * Sets the WOEQ9 value for this MXWO_WORKORDERType.
     * 
     * @param WOEQ9
     */
    public void setWOEQ9(com.ibm.www.maximo.MXStringType WOEQ9) {
        this.WOEQ9 = WOEQ9;
    }


    /**
     * Gets the WOGROUP value for this MXWO_WORKORDERType.
     * 
     * @return WOGROUP
     */
    public com.ibm.www.maximo.MXStringType getWOGROUP() {
        return WOGROUP;
    }


    /**
     * Sets the WOGROUP value for this MXWO_WORKORDERType.
     * 
     * @param WOGROUP
     */
    public void setWOGROUP(com.ibm.www.maximo.MXStringType WOGROUP) {
        this.WOGROUP = WOGROUP;
    }


    /**
     * Gets the WOISSWAP value for this MXWO_WORKORDERType.
     * 
     * @return WOISSWAP
     */
    public com.ibm.www.maximo.MXBooleanType getWOISSWAP() {
        return WOISSWAP;
    }


    /**
     * Sets the WOISSWAP value for this MXWO_WORKORDERType.
     * 
     * @param WOISSWAP
     */
    public void setWOISSWAP(com.ibm.www.maximo.MXBooleanType WOISSWAP) {
        this.WOISSWAP = WOISSWAP;
    }


    /**
     * Gets the WOJO1 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO1
     */
    public com.ibm.www.maximo.MXStringType getWOJO1() {
        return WOJO1;
    }


    /**
     * Sets the WOJO1 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO1
     */
    public void setWOJO1(com.ibm.www.maximo.MXStringType WOJO1) {
        this.WOJO1 = WOJO1;
    }


    /**
     * Gets the WOJO2 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO2
     */
    public com.ibm.www.maximo.MXStringType getWOJO2() {
        return WOJO2;
    }


    /**
     * Sets the WOJO2 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO2
     */
    public void setWOJO2(com.ibm.www.maximo.MXStringType WOJO2) {
        this.WOJO2 = WOJO2;
    }


    /**
     * Gets the WOJO3 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO3
     */
    public com.ibm.www.maximo.MXStringType getWOJO3() {
        return WOJO3;
    }


    /**
     * Sets the WOJO3 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO3
     */
    public void setWOJO3(com.ibm.www.maximo.MXStringType WOJO3) {
        this.WOJO3 = WOJO3;
    }


    /**
     * Gets the WOJO4 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO4
     */
    public com.ibm.www.maximo.MXDoubleType getWOJO4() {
        return WOJO4;
    }


    /**
     * Sets the WOJO4 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO4
     */
    public void setWOJO4(com.ibm.www.maximo.MXDoubleType WOJO4) {
        this.WOJO4 = WOJO4;
    }


    /**
     * Gets the WOJO5 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO5
     */
    public com.ibm.www.maximo.MXStringType getWOJO5() {
        return WOJO5;
    }


    /**
     * Sets the WOJO5 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO5
     */
    public void setWOJO5(com.ibm.www.maximo.MXStringType WOJO5) {
        this.WOJO5 = WOJO5;
    }


    /**
     * Gets the WOJO6 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO6
     */
    public com.ibm.www.maximo.MXStringType getWOJO6() {
        return WOJO6;
    }


    /**
     * Sets the WOJO6 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO6
     */
    public void setWOJO6(com.ibm.www.maximo.MXStringType WOJO6) {
        this.WOJO6 = WOJO6;
    }


    /**
     * Gets the WOJO7 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO7
     */
    public com.ibm.www.maximo.MXStringType getWOJO7() {
        return WOJO7;
    }


    /**
     * Sets the WOJO7 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO7
     */
    public void setWOJO7(com.ibm.www.maximo.MXStringType WOJO7) {
        this.WOJO7 = WOJO7;
    }


    /**
     * Gets the WOJO8 value for this MXWO_WORKORDERType.
     * 
     * @return WOJO8
     */
    public com.ibm.www.maximo.MXStringType getWOJO8() {
        return WOJO8;
    }


    /**
     * Sets the WOJO8 value for this MXWO_WORKORDERType.
     * 
     * @param WOJO8
     */
    public void setWOJO8(com.ibm.www.maximo.MXStringType WOJO8) {
        this.WOJO8 = WOJO8;
    }


    /**
     * Gets the WOJP1 value for this MXWO_WORKORDERType.
     * 
     * @return WOJP1
     */
    public com.ibm.www.maximo.MXStringType getWOJP1() {
        return WOJP1;
    }


    /**
     * Sets the WOJP1 value for this MXWO_WORKORDERType.
     * 
     * @param WOJP1
     */
    public void setWOJP1(com.ibm.www.maximo.MXStringType WOJP1) {
        this.WOJP1 = WOJP1;
    }


    /**
     * Gets the WOJP2 value for this MXWO_WORKORDERType.
     * 
     * @return WOJP2
     */
    public com.ibm.www.maximo.MXStringType getWOJP2() {
        return WOJP2;
    }


    /**
     * Sets the WOJP2 value for this MXWO_WORKORDERType.
     * 
     * @param WOJP2
     */
    public void setWOJP2(com.ibm.www.maximo.MXStringType WOJP2) {
        this.WOJP2 = WOJP2;
    }


    /**
     * Gets the WOJP3 value for this MXWO_WORKORDERType.
     * 
     * @return WOJP3
     */
    public com.ibm.www.maximo.MXStringType getWOJP3() {
        return WOJP3;
    }


    /**
     * Sets the WOJP3 value for this MXWO_WORKORDERType.
     * 
     * @param WOJP3
     */
    public void setWOJP3(com.ibm.www.maximo.MXStringType WOJP3) {
        this.WOJP3 = WOJP3;
    }


    /**
     * Gets the WOJP4 value for this MXWO_WORKORDERType.
     * 
     * @return WOJP4
     */
    public com.ibm.www.maximo.MXDoubleType getWOJP4() {
        return WOJP4;
    }


    /**
     * Sets the WOJP4 value for this MXWO_WORKORDERType.
     * 
     * @param WOJP4
     */
    public void setWOJP4(com.ibm.www.maximo.MXDoubleType WOJP4) {
        this.WOJP4 = WOJP4;
    }


    /**
     * Gets the WOJP5 value for this MXWO_WORKORDERType.
     * 
     * @return WOJP5
     */
    public com.ibm.www.maximo.MXDateTimeType getWOJP5() {
        return WOJP5;
    }


    /**
     * Sets the WOJP5 value for this MXWO_WORKORDERType.
     * 
     * @param WOJP5
     */
    public void setWOJP5(com.ibm.www.maximo.MXDateTimeType WOJP5) {
        this.WOJP5 = WOJP5;
    }


    /**
     * Gets the WOL1 value for this MXWO_WORKORDERType.
     * 
     * @return WOL1
     */
    public com.ibm.www.maximo.MXStringType getWOL1() {
        return WOL1;
    }


    /**
     * Sets the WOL1 value for this MXWO_WORKORDERType.
     * 
     * @param WOL1
     */
    public void setWOL1(com.ibm.www.maximo.MXStringType WOL1) {
        this.WOL1 = WOL1;
    }


    /**
     * Gets the WOL2 value for this MXWO_WORKORDERType.
     * 
     * @return WOL2
     */
    public com.ibm.www.maximo.MXStringType getWOL2() {
        return WOL2;
    }


    /**
     * Sets the WOL2 value for this MXWO_WORKORDERType.
     * 
     * @param WOL2
     */
    public void setWOL2(com.ibm.www.maximo.MXStringType WOL2) {
        this.WOL2 = WOL2;
    }


    /**
     * Gets the WOL3 value for this MXWO_WORKORDERType.
     * 
     * @return WOL3
     */
    public com.ibm.www.maximo.MXDoubleType getWOL3() {
        return WOL3;
    }


    /**
     * Sets the WOL3 value for this MXWO_WORKORDERType.
     * 
     * @param WOL3
     */
    public void setWOL3(com.ibm.www.maximo.MXDoubleType WOL3) {
        this.WOL3 = WOL3;
    }


    /**
     * Gets the WOL4 value for this MXWO_WORKORDERType.
     * 
     * @return WOL4
     */
    public com.ibm.www.maximo.MXDateTimeType getWOL4() {
        return WOL4;
    }


    /**
     * Sets the WOL4 value for this MXWO_WORKORDERType.
     * 
     * @param WOL4
     */
    public void setWOL4(com.ibm.www.maximo.MXDateTimeType WOL4) {
        this.WOL4 = WOL4;
    }


    /**
     * Gets the WOLABLNK value for this MXWO_WORKORDERType.
     * 
     * @return WOLABLNK
     */
    public com.ibm.www.maximo.MXStringType getWOLABLNK() {
        return WOLABLNK;
    }


    /**
     * Sets the WOLABLNK value for this MXWO_WORKORDERType.
     * 
     * @param WOLABLNK
     */
    public void setWOLABLNK(com.ibm.www.maximo.MXStringType WOLABLNK) {
        this.WOLABLNK = WOLABLNK;
    }


    /**
     * Gets the WOLO1 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO1
     */
    public com.ibm.www.maximo.MXStringType getWOLO1() {
        return WOLO1;
    }


    /**
     * Sets the WOLO1 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO1
     */
    public void setWOLO1(com.ibm.www.maximo.MXStringType WOLO1) {
        this.WOLO1 = WOLO1;
    }


    /**
     * Gets the WOLO10 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO10
     */
    public com.ibm.www.maximo.MXLongType getWOLO10() {
        return WOLO10;
    }


    /**
     * Sets the WOLO10 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO10
     */
    public void setWOLO10(com.ibm.www.maximo.MXLongType WOLO10) {
        this.WOLO10 = WOLO10;
    }


    /**
     * Gets the WOLO2 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO2
     */
    public com.ibm.www.maximo.MXStringType getWOLO2() {
        return WOLO2;
    }


    /**
     * Sets the WOLO2 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO2
     */
    public void setWOLO2(com.ibm.www.maximo.MXStringType WOLO2) {
        this.WOLO2 = WOLO2;
    }


    /**
     * Gets the WOLO3 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO3
     */
    public com.ibm.www.maximo.MXStringType getWOLO3() {
        return WOLO3;
    }


    /**
     * Sets the WOLO3 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO3
     */
    public void setWOLO3(com.ibm.www.maximo.MXStringType WOLO3) {
        this.WOLO3 = WOLO3;
    }


    /**
     * Gets the WOLO4 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO4
     */
    public com.ibm.www.maximo.MXStringType getWOLO4() {
        return WOLO4;
    }


    /**
     * Sets the WOLO4 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO4
     */
    public void setWOLO4(com.ibm.www.maximo.MXStringType WOLO4) {
        this.WOLO4 = WOLO4;
    }


    /**
     * Gets the WOLO5 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO5
     */
    public com.ibm.www.maximo.MXStringType getWOLO5() {
        return WOLO5;
    }


    /**
     * Sets the WOLO5 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO5
     */
    public void setWOLO5(com.ibm.www.maximo.MXStringType WOLO5) {
        this.WOLO5 = WOLO5;
    }


    /**
     * Gets the WOLO6 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO6
     */
    public com.ibm.www.maximo.MXDoubleType getWOLO6() {
        return WOLO6;
    }


    /**
     * Sets the WOLO6 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO6
     */
    public void setWOLO6(com.ibm.www.maximo.MXDoubleType WOLO6) {
        this.WOLO6 = WOLO6;
    }


    /**
     * Gets the WOLO7 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO7
     */
    public com.ibm.www.maximo.MXDateTimeType getWOLO7() {
        return WOLO7;
    }


    /**
     * Sets the WOLO7 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO7
     */
    public void setWOLO7(com.ibm.www.maximo.MXDateTimeType WOLO7) {
        this.WOLO7 = WOLO7;
    }


    /**
     * Gets the WOLO8 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO8
     */
    public com.ibm.www.maximo.MXDoubleType getWOLO8() {
        return WOLO8;
    }


    /**
     * Sets the WOLO8 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO8
     */
    public void setWOLO8(com.ibm.www.maximo.MXDoubleType WOLO8) {
        this.WOLO8 = WOLO8;
    }


    /**
     * Gets the WOLO9 value for this MXWO_WORKORDERType.
     * 
     * @return WOLO9
     */
    public com.ibm.www.maximo.MXStringType getWOLO9() {
        return WOLO9;
    }


    /**
     * Sets the WOLO9 value for this MXWO_WORKORDERType.
     * 
     * @param WOLO9
     */
    public void setWOLO9(com.ibm.www.maximo.MXStringType WOLO9) {
        this.WOLO9 = WOLO9;
    }


    /**
     * Gets the WONUM value for this MXWO_WORKORDERType.
     * 
     * @return WONUM   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringType getWONUM() {
        return WONUM;
    }


    /**
     * Sets the WONUM value for this MXWO_WORKORDERType.
     * 
     * @param WONUM   * Unique Key Component
     */
    public void setWONUM(com.ibm.www.maximo.MXStringType WONUM) {
        this.WONUM = WONUM;
    }


    /**
     * Gets the WOPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @return WOPRIORITY
     */
    public com.ibm.www.maximo.MXLongType getWOPRIORITY() {
        return WOPRIORITY;
    }


    /**
     * Sets the WOPRIORITY value for this MXWO_WORKORDERType.
     * 
     * @param WOPRIORITY
     */
    public void setWOPRIORITY(com.ibm.www.maximo.MXLongType WOPRIORITY) {
        this.WOPRIORITY = WOPRIORITY;
    }


    /**
     * Gets the WORKLOCATION value for this MXWO_WORKORDERType.
     * 
     * @return WORKLOCATION
     */
    public com.ibm.www.maximo.MXStringType getWORKLOCATION() {
        return WORKLOCATION;
    }


    /**
     * Sets the WORKLOCATION value for this MXWO_WORKORDERType.
     * 
     * @param WORKLOCATION
     */
    public void setWORKLOCATION(com.ibm.www.maximo.MXStringType WORKLOCATION) {
        this.WORKLOCATION = WORKLOCATION;
    }


    /**
     * Gets the WORKORDERID value for this MXWO_WORKORDERType.
     * 
     * @return WORKORDERID
     */
    public com.ibm.www.maximo.MXLongType getWORKORDERID() {
        return WORKORDERID;
    }


    /**
     * Sets the WORKORDERID value for this MXWO_WORKORDERType.
     * 
     * @param WORKORDERID
     */
    public void setWORKORDERID(com.ibm.www.maximo.MXLongType WORKORDERID) {
        this.WORKORDERID = WORKORDERID;
    }


    /**
     * Gets the WORKPACKMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @return WORKPACKMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainType getWORKPACKMTLSTATUS() {
        return WORKPACKMTLSTATUS;
    }


    /**
     * Sets the WORKPACKMTLSTATUS value for this MXWO_WORKORDERType.
     * 
     * @param WORKPACKMTLSTATUS
     */
    public void setWORKPACKMTLSTATUS(com.ibm.www.maximo.MXDomainType WORKPACKMTLSTATUS) {
        this.WORKPACKMTLSTATUS = WORKPACKMTLSTATUS;
    }


    /**
     * Gets the WORKTYPE value for this MXWO_WORKORDERType.
     * 
     * @return WORKTYPE
     */
    public com.ibm.www.maximo.MXStringType getWORKTYPE() {
        return WORKTYPE;
    }


    /**
     * Sets the WORKTYPE value for this MXWO_WORKORDERType.
     * 
     * @param WORKTYPE
     */
    public void setWORKTYPE(com.ibm.www.maximo.MXStringType WORKTYPE) {
        this.WORKTYPE = WORKTYPE;
    }


    /**
     * Gets the WORTS1 value for this MXWO_WORKORDERType.
     * 
     * @return WORTS1
     */
    public com.ibm.www.maximo.MXStringType getWORTS1() {
        return WORTS1;
    }


    /**
     * Sets the WORTS1 value for this MXWO_WORKORDERType.
     * 
     * @param WORTS1
     */
    public void setWORTS1(com.ibm.www.maximo.MXStringType WORTS1) {
        this.WORTS1 = WORTS1;
    }


    /**
     * Gets the WORTS2 value for this MXWO_WORKORDERType.
     * 
     * @return WORTS2
     */
    public com.ibm.www.maximo.MXStringType getWORTS2() {
        return WORTS2;
    }


    /**
     * Sets the WORTS2 value for this MXWO_WORKORDERType.
     * 
     * @param WORTS2
     */
    public void setWORTS2(com.ibm.www.maximo.MXStringType WORTS2) {
        this.WORTS2 = WORTS2;
    }


    /**
     * Gets the WORTS3 value for this MXWO_WORKORDERType.
     * 
     * @return WORTS3
     */
    public com.ibm.www.maximo.MXStringType getWORTS3() {
        return WORTS3;
    }


    /**
     * Sets the WORTS3 value for this MXWO_WORKORDERType.
     * 
     * @param WORTS3
     */
    public void setWORTS3(com.ibm.www.maximo.MXStringType WORTS3) {
        this.WORTS3 = WORTS3;
    }


    /**
     * Gets the WORTS4 value for this MXWO_WORKORDERType.
     * 
     * @return WORTS4
     */
    public com.ibm.www.maximo.MXDateTimeType getWORTS4() {
        return WORTS4;
    }


    /**
     * Sets the WORTS4 value for this MXWO_WORKORDERType.
     * 
     * @param WORTS4
     */
    public void setWORTS4(com.ibm.www.maximo.MXDateTimeType WORTS4) {
        this.WORTS4 = WORTS4;
    }


    /**
     * Gets the WORTS5 value for this MXWO_WORKORDERType.
     * 
     * @return WORTS5
     */
    public com.ibm.www.maximo.MXDoubleType getWORTS5() {
        return WORTS5;
    }


    /**
     * Sets the WORTS5 value for this MXWO_WORKORDERType.
     * 
     * @param WORTS5
     */
    public void setWORTS5(com.ibm.www.maximo.MXDoubleType WORTS5) {
        this.WORTS5 = WORTS5;
    }


    /**
     * Gets the WOSEQUENCE value for this MXWO_WORKORDERType.
     * 
     * @return WOSEQUENCE
     */
    public com.ibm.www.maximo.MXLongType getWOSEQUENCE() {
        return WOSEQUENCE;
    }


    /**
     * Sets the WOSEQUENCE value for this MXWO_WORKORDERType.
     * 
     * @param WOSEQUENCE
     */
    public void setWOSEQUENCE(com.ibm.www.maximo.MXLongType WOSEQUENCE) {
        this.WOSEQUENCE = WOSEQUENCE;
    }


    /**
     * Gets the action value for this MXWO_WORKORDERType.
     * 
     * @return action
     */
    public com.ibm.www.maximo.ProcessingActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this MXWO_WORKORDERType.
     * 
     * @param action
     */
    public void setAction(com.ibm.www.maximo.ProcessingActionType action) {
        this.action = action;
    }


    /**
     * Gets the relationship value for this MXWO_WORKORDERType.
     * 
     * @return relationship
     */
    public java.lang.String getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this MXWO_WORKORDERType.
     * 
     * @param relationship
     */
    public void setRelationship(java.lang.String relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the deleteForInsert value for this MXWO_WORKORDERType.
     * 
     * @return deleteForInsert
     */
    public java.lang.String getDeleteForInsert() {
        return deleteForInsert;
    }


    /**
     * Sets the deleteForInsert value for this MXWO_WORKORDERType.
     * 
     * @param deleteForInsert
     */
    public void setDeleteForInsert(java.lang.String deleteForInsert) {
        this.deleteForInsert = deleteForInsert;
    }


    /**
     * Gets the transLanguage value for this MXWO_WORKORDERType.
     * 
     * @return transLanguage
     */
    public java.lang.String getTransLanguage() {
        return transLanguage;
    }


    /**
     * Sets the transLanguage value for this MXWO_WORKORDERType.
     * 
     * @param transLanguage
     */
    public void setTransLanguage(java.lang.String transLanguage) {
        this.transLanguage = transLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXWO_WORKORDERType)) return false;
        MXWO_WORKORDERType other = (MXWO_WORKORDERType) obj;
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
            ((this.ACTFINISH==null && other.getACTFINISH()==null) || 
             (this.ACTFINISH!=null &&
              this.ACTFINISH.equals(other.getACTFINISH()))) &&
            ((this.ACTINTLABCOST==null && other.getACTINTLABCOST()==null) || 
             (this.ACTINTLABCOST!=null &&
              this.ACTINTLABCOST.equals(other.getACTINTLABCOST()))) &&
            ((this.ACTINTLABHRS==null && other.getACTINTLABHRS()==null) || 
             (this.ACTINTLABHRS!=null &&
              this.ACTINTLABHRS.equals(other.getACTINTLABHRS()))) &&
            ((this.ACTLABCOST==null && other.getACTLABCOST()==null) || 
             (this.ACTLABCOST!=null &&
              this.ACTLABCOST.equals(other.getACTLABCOST()))) &&
            ((this.ACTLABHRS==null && other.getACTLABHRS()==null) || 
             (this.ACTLABHRS!=null &&
              this.ACTLABHRS.equals(other.getACTLABHRS()))) &&
            ((this.ACTMATCOST==null && other.getACTMATCOST()==null) || 
             (this.ACTMATCOST!=null &&
              this.ACTMATCOST.equals(other.getACTMATCOST()))) &&
            ((this.ACTOUTLABCOST==null && other.getACTOUTLABCOST()==null) || 
             (this.ACTOUTLABCOST!=null &&
              this.ACTOUTLABCOST.equals(other.getACTOUTLABCOST()))) &&
            ((this.ACTOUTLABHRS==null && other.getACTOUTLABHRS()==null) || 
             (this.ACTOUTLABHRS!=null &&
              this.ACTOUTLABHRS.equals(other.getACTOUTLABHRS()))) &&
            ((this.ACTSERVCOST==null && other.getACTSERVCOST()==null) || 
             (this.ACTSERVCOST!=null &&
              this.ACTSERVCOST.equals(other.getACTSERVCOST()))) &&
            ((this.ACTSTART==null && other.getACTSTART()==null) || 
             (this.ACTSTART!=null &&
              this.ACTSTART.equals(other.getACTSTART()))) &&
            ((this.ACTTOOLCOST==null && other.getACTTOOLCOST()==null) || 
             (this.ACTTOOLCOST!=null &&
              this.ACTTOOLCOST.equals(other.getACTTOOLCOST()))) &&
            ((this.AMCREW==null && other.getAMCREW()==null) || 
             (this.AMCREW!=null &&
              this.AMCREW.equals(other.getAMCREW()))) &&
            ((this.AMS==null && other.getAMS()==null) || 
             (this.AMS!=null &&
              this.AMS.equals(other.getAMS()))) &&
            ((this.AOS==null && other.getAOS()==null) || 
             (this.AOS!=null &&
              this.AOS.equals(other.getAOS()))) &&
            ((this.APPTREQUIRED==null && other.getAPPTREQUIRED()==null) || 
             (this.APPTREQUIRED!=null &&
              this.APPTREQUIRED.equals(other.getAPPTREQUIRED()))) &&
            ((this.ASSETLOCPRIORITY==null && other.getASSETLOCPRIORITY()==null) || 
             (this.ASSETLOCPRIORITY!=null &&
              this.ASSETLOCPRIORITY.equals(other.getASSETLOCPRIORITY()))) &&
            ((this.ASSETNUM==null && other.getASSETNUM()==null) || 
             (this.ASSETNUM!=null &&
              this.ASSETNUM.equals(other.getASSETNUM()))) &&
            ((this.ASSIGNEDOWNERGROUP==null && other.getASSIGNEDOWNERGROUP()==null) || 
             (this.ASSIGNEDOWNERGROUP!=null &&
              this.ASSIGNEDOWNERGROUP.equals(other.getASSIGNEDOWNERGROUP()))) &&
            ((this.AVAILSTATUSDATE==null && other.getAVAILSTATUSDATE()==null) || 
             (this.AVAILSTATUSDATE!=null &&
              this.AVAILSTATUSDATE.equals(other.getAVAILSTATUSDATE()))) &&
            ((this.BACKOUTPLAN==null && other.getBACKOUTPLAN()==null) || 
             (this.BACKOUTPLAN!=null &&
              this.BACKOUTPLAN.equals(other.getBACKOUTPLAN()))) &&
            ((this.CALCCALENDAR==null && other.getCALCCALENDAR()==null) || 
             (this.CALCCALENDAR!=null &&
              this.CALCCALENDAR.equals(other.getCALCCALENDAR()))) &&
            ((this.CALCORGID==null && other.getCALCORGID()==null) || 
             (this.CALCORGID!=null &&
              this.CALCORGID.equals(other.getCALCORGID()))) &&
            ((this.CALCPRIORITY==null && other.getCALCPRIORITY()==null) || 
             (this.CALCPRIORITY!=null &&
              this.CALCPRIORITY.equals(other.getCALCPRIORITY()))) &&
            ((this.CALCSHIFT==null && other.getCALCSHIFT()==null) || 
             (this.CALCSHIFT!=null &&
              this.CALCSHIFT.equals(other.getCALCSHIFT()))) &&
            ((this.CALENDAR==null && other.getCALENDAR()==null) || 
             (this.CALENDAR!=null &&
              this.CALENDAR.equals(other.getCALENDAR()))) &&
            ((this.CHANGEBY==null && other.getCHANGEBY()==null) || 
             (this.CHANGEBY!=null &&
              this.CHANGEBY.equals(other.getCHANGEBY()))) &&
            ((this.CHANGEDATE==null && other.getCHANGEDATE()==null) || 
             (this.CHANGEDATE!=null &&
              this.CHANGEDATE.equals(other.getCHANGEDATE()))) &&
            ((this.CHARGESTORE==null && other.getCHARGESTORE()==null) || 
             (this.CHARGESTORE!=null &&
              this.CHARGESTORE.equals(other.getCHARGESTORE()))) &&
            ((this.CINUM==null && other.getCINUM()==null) || 
             (this.CINUM!=null &&
              this.CINUM.equals(other.getCINUM()))) &&
            ((this.CLASSSTRUCTUREID==null && other.getCLASSSTRUCTUREID()==null) || 
             (this.CLASSSTRUCTUREID!=null &&
              this.CLASSSTRUCTUREID.equals(other.getCLASSSTRUCTUREID()))) &&
            ((this.COMMODITY==null && other.getCOMMODITY()==null) || 
             (this.COMMODITY!=null &&
              this.COMMODITY.equals(other.getCOMMODITY()))) &&
            ((this.COMMODITYGROUP==null && other.getCOMMODITYGROUP()==null) || 
             (this.COMMODITYGROUP!=null &&
              this.COMMODITYGROUP.equals(other.getCOMMODITYGROUP()))) &&
            ((this.CONTRACT==null && other.getCONTRACT()==null) || 
             (this.CONTRACT!=null &&
              this.CONTRACT.equals(other.getCONTRACT()))) &&
            ((this.CREWID==null && other.getCREWID()==null) || 
             (this.CREWID!=null &&
              this.CREWID.equals(other.getCREWID()))) &&
            ((this.CREWWORKGROUP==null && other.getCREWWORKGROUP()==null) || 
             (this.CREWWORKGROUP!=null &&
              this.CREWWORKGROUP.equals(other.getCREWWORKGROUP()))) &&
            ((this.DESCRIPTION==null && other.getDESCRIPTION()==null) || 
             (this.DESCRIPTION!=null &&
              this.DESCRIPTION.equals(other.getDESCRIPTION()))) &&
            ((this.DESCRIPTION_LONGDESCRIPTION==null && other.getDESCRIPTION_LONGDESCRIPTION()==null) || 
             (this.DESCRIPTION_LONGDESCRIPTION!=null &&
              this.DESCRIPTION_LONGDESCRIPTION.equals(other.getDESCRIPTION_LONGDESCRIPTION()))) &&
            ((this.DIRISSUEMTLSTATUS==null && other.getDIRISSUEMTLSTATUS()==null) || 
             (this.DIRISSUEMTLSTATUS!=null &&
              this.DIRISSUEMTLSTATUS.equals(other.getDIRISSUEMTLSTATUS()))) &&
            ((this.DISABLED==null && other.getDISABLED()==null) || 
             (this.DISABLED!=null &&
              this.DISABLED.equals(other.getDISABLED()))) &&
            ((this.DOWNTIME==null && other.getDOWNTIME()==null) || 
             (this.DOWNTIME!=null &&
              this.DOWNTIME.equals(other.getDOWNTIME()))) &&
            ((this.ENVIRONMENT==null && other.getENVIRONMENT()==null) || 
             (this.ENVIRONMENT!=null &&
              this.ENVIRONMENT.equals(other.getENVIRONMENT()))) &&
            ((this.ESTATAPPRINTLABCOST==null && other.getESTATAPPRINTLABCOST()==null) || 
             (this.ESTATAPPRINTLABCOST!=null &&
              this.ESTATAPPRINTLABCOST.equals(other.getESTATAPPRINTLABCOST()))) &&
            ((this.ESTATAPPRINTLABHRS==null && other.getESTATAPPRINTLABHRS()==null) || 
             (this.ESTATAPPRINTLABHRS!=null &&
              this.ESTATAPPRINTLABHRS.equals(other.getESTATAPPRINTLABHRS()))) &&
            ((this.ESTATAPPRLABCOST==null && other.getESTATAPPRLABCOST()==null) || 
             (this.ESTATAPPRLABCOST!=null &&
              this.ESTATAPPRLABCOST.equals(other.getESTATAPPRLABCOST()))) &&
            ((this.ESTATAPPRLABHRS==null && other.getESTATAPPRLABHRS()==null) || 
             (this.ESTATAPPRLABHRS!=null &&
              this.ESTATAPPRLABHRS.equals(other.getESTATAPPRLABHRS()))) &&
            ((this.ESTATAPPRMATCOST==null && other.getESTATAPPRMATCOST()==null) || 
             (this.ESTATAPPRMATCOST!=null &&
              this.ESTATAPPRMATCOST.equals(other.getESTATAPPRMATCOST()))) &&
            ((this.ESTATAPPROUTLABCOST==null && other.getESTATAPPROUTLABCOST()==null) || 
             (this.ESTATAPPROUTLABCOST!=null &&
              this.ESTATAPPROUTLABCOST.equals(other.getESTATAPPROUTLABCOST()))) &&
            ((this.ESTATAPPROUTLABHRS==null && other.getESTATAPPROUTLABHRS()==null) || 
             (this.ESTATAPPROUTLABHRS!=null &&
              this.ESTATAPPROUTLABHRS.equals(other.getESTATAPPROUTLABHRS()))) &&
            ((this.ESTATAPPRSERVCOST==null && other.getESTATAPPRSERVCOST()==null) || 
             (this.ESTATAPPRSERVCOST!=null &&
              this.ESTATAPPRSERVCOST.equals(other.getESTATAPPRSERVCOST()))) &&
            ((this.ESTATAPPRTOOLCOST==null && other.getESTATAPPRTOOLCOST()==null) || 
             (this.ESTATAPPRTOOLCOST!=null &&
              this.ESTATAPPRTOOLCOST.equals(other.getESTATAPPRTOOLCOST()))) &&
            ((this.ESTDUR==null && other.getESTDUR()==null) || 
             (this.ESTDUR!=null &&
              this.ESTDUR.equals(other.getESTDUR()))) &&
            ((this.ESTINTLABCOST==null && other.getESTINTLABCOST()==null) || 
             (this.ESTINTLABCOST!=null &&
              this.ESTINTLABCOST.equals(other.getESTINTLABCOST()))) &&
            ((this.ESTINTLABHRS==null && other.getESTINTLABHRS()==null) || 
             (this.ESTINTLABHRS!=null &&
              this.ESTINTLABHRS.equals(other.getESTINTLABHRS()))) &&
            ((this.ESTLABCOST==null && other.getESTLABCOST()==null) || 
             (this.ESTLABCOST!=null &&
              this.ESTLABCOST.equals(other.getESTLABCOST()))) &&
            ((this.ESTLABHRS==null && other.getESTLABHRS()==null) || 
             (this.ESTLABHRS!=null &&
              this.ESTLABHRS.equals(other.getESTLABHRS()))) &&
            ((this.ESTMATCOST==null && other.getESTMATCOST()==null) || 
             (this.ESTMATCOST!=null &&
              this.ESTMATCOST.equals(other.getESTMATCOST()))) &&
            ((this.ESTOUTLABCOST==null && other.getESTOUTLABCOST()==null) || 
             (this.ESTOUTLABCOST!=null &&
              this.ESTOUTLABCOST.equals(other.getESTOUTLABCOST()))) &&
            ((this.ESTOUTLABHRS==null && other.getESTOUTLABHRS()==null) || 
             (this.ESTOUTLABHRS!=null &&
              this.ESTOUTLABHRS.equals(other.getESTOUTLABHRS()))) &&
            ((this.ESTSERVCOST==null && other.getESTSERVCOST()==null) || 
             (this.ESTSERVCOST!=null &&
              this.ESTSERVCOST.equals(other.getESTSERVCOST()))) &&
            ((this.ESTTOOLCOST==null && other.getESTTOOLCOST()==null) || 
             (this.ESTTOOLCOST!=null &&
              this.ESTTOOLCOST.equals(other.getESTTOOLCOST()))) &&
            ((this.EXTERNALREFID==null && other.getEXTERNALREFID()==null) || 
             (this.EXTERNALREFID!=null &&
              this.EXTERNALREFID.equals(other.getEXTERNALREFID()))) &&
            ((this.FAILDATE==null && other.getFAILDATE()==null) || 
             (this.FAILDATE!=null &&
              this.FAILDATE.equals(other.getFAILDATE()))) &&
            ((this.FAILURECODE==null && other.getFAILURECODE()==null) || 
             (this.FAILURECODE!=null &&
              this.FAILURECODE.equals(other.getFAILURECODE()))) &&
            ((this.FCPROJECTID==null && other.getFCPROJECTID()==null) || 
             (this.FCPROJECTID!=null &&
              this.FCPROJECTID.equals(other.getFCPROJECTID()))) &&
            ((this.FCTASKID==null && other.getFCTASKID()==null) || 
             (this.FCTASKID!=null &&
              this.FCTASKID.equals(other.getFCTASKID()))) &&
            ((this.FINCNTRLID==null && other.getFINCNTRLID()==null) || 
             (this.FINCNTRLID!=null &&
              this.FINCNTRLID.equals(other.getFINCNTRLID()))) &&
            ((this.FIRSTAPPRSTATUS==null && other.getFIRSTAPPRSTATUS()==null) || 
             (this.FIRSTAPPRSTATUS!=null &&
              this.FIRSTAPPRSTATUS.equals(other.getFIRSTAPPRSTATUS()))) &&
            ((this.FLOWACTION==null && other.getFLOWACTION()==null) || 
             (this.FLOWACTION!=null &&
              this.FLOWACTION.equals(other.getFLOWACTION()))) &&
            ((this.FLOWACTIONASSIST==null && other.getFLOWACTIONASSIST()==null) || 
             (this.FLOWACTIONASSIST!=null &&
              this.FLOWACTIONASSIST.equals(other.getFLOWACTIONASSIST()))) &&
            ((this.FLOWCONTROLLED==null && other.getFLOWCONTROLLED()==null) || 
             (this.FLOWCONTROLLED!=null &&
              this.FLOWCONTROLLED.equals(other.getFLOWCONTROLLED()))) &&
            ((this.FNLCONSTRAINT==null && other.getFNLCONSTRAINT()==null) || 
             (this.FNLCONSTRAINT!=null &&
              this.FNLCONSTRAINT.equals(other.getFNLCONSTRAINT()))) &&
            ((this.GENERATEDFORPO==null && other.getGENERATEDFORPO()==null) || 
             (this.GENERATEDFORPO!=null &&
              this.GENERATEDFORPO.equals(other.getGENERATEDFORPO()))) &&
            ((this.GENFORPOLINEID==null && other.getGENFORPOLINEID()==null) || 
             (this.GENFORPOLINEID!=null &&
              this.GENFORPOLINEID.equals(other.getGENFORPOLINEID()))) &&
            ((this.GENFORPOREVISION==null && other.getGENFORPOREVISION()==null) || 
             (this.GENFORPOREVISION!=null &&
              this.GENFORPOREVISION.equals(other.getGENFORPOREVISION()))) &&
            ((this.GLACCOUNT==null && other.getGLACCOUNT()==null) || 
             (this.GLACCOUNT!=null &&
              this.GLACCOUNT.equals(other.getGLACCOUNT()))) &&
            ((this.HASCHILDREN==null && other.getHASCHILDREN()==null) || 
             (this.HASCHILDREN!=null &&
              this.HASCHILDREN.equals(other.getHASCHILDREN()))) &&
            ((this.HASFOLLOWUPWORK==null && other.getHASFOLLOWUPWORK()==null) || 
             (this.HASFOLLOWUPWORK!=null &&
              this.HASFOLLOWUPWORK.equals(other.getHASFOLLOWUPWORK()))) &&
            ((this.HISTORYFLAG==null && other.getHISTORYFLAG()==null) || 
             (this.HISTORYFLAG!=null &&
              this.HISTORYFLAG.equals(other.getHISTORYFLAG()))) &&
            ((this.IGNOREDIAVAIL==null && other.getIGNOREDIAVAIL()==null) || 
             (this.IGNOREDIAVAIL!=null &&
              this.IGNOREDIAVAIL.equals(other.getIGNOREDIAVAIL()))) &&
            ((this.IGNORESRMAVAIL==null && other.getIGNORESRMAVAIL()==null) || 
             (this.IGNORESRMAVAIL!=null &&
              this.IGNORESRMAVAIL.equals(other.getIGNORESRMAVAIL()))) &&
            ((this.INCTASKSINSCHED==null && other.getINCTASKSINSCHED()==null) || 
             (this.INCTASKSINSCHED!=null &&
              this.INCTASKSINSCHED.equals(other.getINCTASKSINSCHED()))) &&
            ((this.INSPECTOR==null && other.getINSPECTOR()==null) || 
             (this.INSPECTOR!=null &&
              this.INSPECTOR.equals(other.getINSPECTOR()))) &&
            ((this.INTERRUPTIBLE==null && other.getINTERRUPTIBLE()==null) || 
             (this.INTERRUPTIBLE!=null &&
              this.INTERRUPTIBLE.equals(other.getINTERRUPTIBLE()))) &&
            ((this.ISTASK==null && other.getISTASK()==null) || 
             (this.ISTASK!=null &&
              this.ISTASK.equals(other.getISTASK()))) &&
            ((this.JOBTASKID==null && other.getJOBTASKID()==null) || 
             (this.JOBTASKID!=null &&
              this.JOBTASKID.equals(other.getJOBTASKID()))) &&
            ((this.JPNUM==null && other.getJPNUM()==null) || 
             (this.JPNUM!=null &&
              this.JPNUM.equals(other.getJPNUM()))) &&
            ((this.JUSTIFYPRIORITY==null && other.getJUSTIFYPRIORITY()==null) || 
             (this.JUSTIFYPRIORITY!=null &&
              this.JUSTIFYPRIORITY.equals(other.getJUSTIFYPRIORITY()))) &&
            ((this.LASTCOPYLINKDATE==null && other.getLASTCOPYLINKDATE()==null) || 
             (this.LASTCOPYLINKDATE!=null &&
              this.LASTCOPYLINKDATE.equals(other.getLASTCOPYLINKDATE()))) &&
            ((this.LAUNCHENTRYNAME==null && other.getLAUNCHENTRYNAME()==null) || 
             (this.LAUNCHENTRYNAME!=null &&
              this.LAUNCHENTRYNAME.equals(other.getLAUNCHENTRYNAME()))) &&
            ((this.LEAD==null && other.getLEAD()==null) || 
             (this.LEAD!=null &&
              this.LEAD.equals(other.getLEAD()))) &&
            ((this.LMS==null && other.getLMS()==null) || 
             (this.LMS!=null &&
              this.LMS.equals(other.getLMS()))) &&
            ((this.LOCATION==null && other.getLOCATION()==null) || 
             (this.LOCATION!=null &&
              this.LOCATION.equals(other.getLOCATION()))) &&
            ((this.LOS==null && other.getLOS()==null) || 
             (this.LOS!=null &&
              this.LOS.equals(other.getLOS()))) &&
            ((this.MEASUREDATE==null && other.getMEASUREDATE()==null) || 
             (this.MEASUREDATE!=null &&
              this.MEASUREDATE.equals(other.getMEASUREDATE()))) &&
            ((this.MEASUREMENTVALUE==null && other.getMEASUREMENTVALUE()==null) || 
             (this.MEASUREMENTVALUE!=null &&
              this.MEASUREMENTVALUE.equals(other.getMEASUREMENTVALUE()))) &&
            ((this.NESTEDJPINPROCESS==null && other.getNESTEDJPINPROCESS()==null) || 
             (this.NESTEDJPINPROCESS!=null &&
              this.NESTEDJPINPROCESS.equals(other.getNESTEDJPINPROCESS()))) &&
            ((this.NEWCHILDCLASS==null && other.getNEWCHILDCLASS()==null) || 
             (this.NEWCHILDCLASS!=null &&
              this.NEWCHILDCLASS.equals(other.getNEWCHILDCLASS()))) &&
            ((this.NP_STATUSMEMO==null && other.getNP_STATUSMEMO()==null) || 
             (this.NP_STATUSMEMO!=null &&
              this.NP_STATUSMEMO.equals(other.getNP_STATUSMEMO()))) &&
            ((this.OBSERVATION==null && other.getOBSERVATION()==null) || 
             (this.OBSERVATION!=null &&
              this.OBSERVATION.equals(other.getOBSERVATION()))) &&
            ((this.ONBEHALFOF==null && other.getONBEHALFOF()==null) || 
             (this.ONBEHALFOF!=null &&
              this.ONBEHALFOF.equals(other.getONBEHALFOF()))) &&
            ((this.ORGID==null && other.getORGID()==null) || 
             (this.ORGID!=null &&
              this.ORGID.equals(other.getORGID()))) &&
            ((this.ORIGRECORDCLASS==null && other.getORIGRECORDCLASS()==null) || 
             (this.ORIGRECORDCLASS!=null &&
              this.ORIGRECORDCLASS.equals(other.getORIGRECORDCLASS()))) &&
            ((this.ORIGRECORDID==null && other.getORIGRECORDID()==null) || 
             (this.ORIGRECORDID!=null &&
              this.ORIGRECORDID.equals(other.getORIGRECORDID()))) &&
            ((this.OUTLABCOST==null && other.getOUTLABCOST()==null) || 
             (this.OUTLABCOST!=null &&
              this.OUTLABCOST.equals(other.getOUTLABCOST()))) &&
            ((this.OUTMATCOST==null && other.getOUTMATCOST()==null) || 
             (this.OUTMATCOST!=null &&
              this.OUTMATCOST.equals(other.getOUTMATCOST()))) &&
            ((this.OUTTOOLCOST==null && other.getOUTTOOLCOST()==null) || 
             (this.OUTTOOLCOST!=null &&
              this.OUTTOOLCOST.equals(other.getOUTTOOLCOST()))) &&
            ((this.OWNER==null && other.getOWNER()==null) || 
             (this.OWNER!=null &&
              this.OWNER.equals(other.getOWNER()))) &&
            ((this.OWNERGROUP==null && other.getOWNERGROUP()==null) || 
             (this.OWNERGROUP!=null &&
              this.OWNERGROUP.equals(other.getOWNERGROUP()))) &&
            ((this.OWNERSYSID==null && other.getOWNERSYSID()==null) || 
             (this.OWNERSYSID!=null &&
              this.OWNERSYSID.equals(other.getOWNERSYSID()))) &&
            ((this.PARENT==null && other.getPARENT()==null) || 
             (this.PARENT!=null &&
              this.PARENT.equals(other.getPARENT()))) &&
            ((this.PARENTCHGSSTATUS==null && other.getPARENTCHGSSTATUS()==null) || 
             (this.PARENTCHGSSTATUS!=null &&
              this.PARENTCHGSSTATUS.equals(other.getPARENTCHGSSTATUS()))) &&
            ((this.PERSONGROUP==null && other.getPERSONGROUP()==null) || 
             (this.PERSONGROUP!=null &&
              this.PERSONGROUP.equals(other.getPERSONGROUP()))) &&
            ((this.PHONE==null && other.getPHONE()==null) || 
             (this.PHONE!=null &&
              this.PHONE.equals(other.getPHONE()))) &&
            ((this.PLUSCFREQUENCY==null && other.getPLUSCFREQUENCY()==null) || 
             (this.PLUSCFREQUENCY!=null &&
              this.PLUSCFREQUENCY.equals(other.getPLUSCFREQUENCY()))) &&
            ((this.PLUSCFREQUNIT==null && other.getPLUSCFREQUNIT()==null) || 
             (this.PLUSCFREQUNIT!=null &&
              this.PLUSCFREQUNIT.equals(other.getPLUSCFREQUNIT()))) &&
            ((this.PLUSCISMOBILE==null && other.getPLUSCISMOBILE()==null) || 
             (this.PLUSCISMOBILE!=null &&
              this.PLUSCISMOBILE.equals(other.getPLUSCISMOBILE()))) &&
            ((this.PLUSCJPREVNUM==null && other.getPLUSCJPREVNUM()==null) || 
             (this.PLUSCJPREVNUM!=null &&
              this.PLUSCJPREVNUM.equals(other.getPLUSCJPREVNUM()))) &&
            ((this.PLUSCLOOP==null && other.getPLUSCLOOP()==null) || 
             (this.PLUSCLOOP!=null &&
              this.PLUSCLOOP.equals(other.getPLUSCLOOP()))) &&
            ((this.PLUSCNEXTDATE==null && other.getPLUSCNEXTDATE()==null) || 
             (this.PLUSCNEXTDATE!=null &&
              this.PLUSCNEXTDATE.equals(other.getPLUSCNEXTDATE()))) &&
            ((this.PLUSCOVERDUEDATE==null && other.getPLUSCOVERDUEDATE()==null) || 
             (this.PLUSCOVERDUEDATE!=null &&
              this.PLUSCOVERDUEDATE.equals(other.getPLUSCOVERDUEDATE()))) &&
            ((this.PLUSCPHYLOC==null && other.getPLUSCPHYLOC()==null) || 
             (this.PLUSCPHYLOC!=null &&
              this.PLUSCPHYLOC.equals(other.getPLUSCPHYLOC()))) &&
            ((this.PMDUEDATE==null && other.getPMDUEDATE()==null) || 
             (this.PMDUEDATE!=null &&
              this.PMDUEDATE.equals(other.getPMDUEDATE()))) &&
            ((this.PMEXTDATE==null && other.getPMEXTDATE()==null) || 
             (this.PMEXTDATE!=null &&
              this.PMEXTDATE.equals(other.getPMEXTDATE()))) &&
            ((this.PMNEXTDUEDATE==null && other.getPMNEXTDUEDATE()==null) || 
             (this.PMNEXTDUEDATE!=null &&
              this.PMNEXTDUEDATE.equals(other.getPMNEXTDUEDATE()))) &&
            ((this.PMNUM==null && other.getPMNUM()==null) || 
             (this.PMNUM!=null &&
              this.PMNUM.equals(other.getPMNUM()))) &&
            ((this.POINTNUM==null && other.getPOINTNUM()==null) || 
             (this.POINTNUM!=null &&
              this.POINTNUM.equals(other.getPOINTNUM()))) &&
            ((this.PROBLEMCODE==null && other.getPROBLEMCODE()==null) || 
             (this.PROBLEMCODE!=null &&
              this.PROBLEMCODE.equals(other.getPROBLEMCODE()))) &&
            ((this.REASONFORCHANGE==null && other.getREASONFORCHANGE()==null) || 
             (this.REASONFORCHANGE!=null &&
              this.REASONFORCHANGE.equals(other.getREASONFORCHANGE()))) &&
            ((this.REMDUR==null && other.getREMDUR()==null) || 
             (this.REMDUR!=null &&
              this.REMDUR.equals(other.getREMDUR()))) &&
            ((this.REPAIRFACILITY==null && other.getREPAIRFACILITY()==null) || 
             (this.REPAIRFACILITY!=null &&
              this.REPAIRFACILITY.equals(other.getREPAIRFACILITY()))) &&
            ((this.REPFACSITEID==null && other.getREPFACSITEID()==null) || 
             (this.REPFACSITEID!=null &&
              this.REPFACSITEID.equals(other.getREPFACSITEID()))) &&
            ((this.REPORTDATE==null && other.getREPORTDATE()==null) || 
             (this.REPORTDATE!=null &&
              this.REPORTDATE.equals(other.getREPORTDATE()))) &&
            ((this.REPORTEDBY==null && other.getREPORTEDBY()==null) || 
             (this.REPORTEDBY!=null &&
              this.REPORTEDBY.equals(other.getREPORTEDBY()))) &&
            ((this.REQASSTDWNTIME==null && other.getREQASSTDWNTIME()==null) || 
             (this.REQASSTDWNTIME!=null &&
              this.REQASSTDWNTIME.equals(other.getREQASSTDWNTIME()))) &&
            ((this.RESPONDBY==null && other.getRESPONDBY()==null) || 
             (this.RESPONDBY!=null &&
              this.RESPONDBY.equals(other.getRESPONDBY()))) &&
            ((this.RISK==null && other.getRISK()==null) || 
             (this.RISK!=null &&
              this.RISK.equals(other.getRISK()))) &&
            ((this.ROUTE==null && other.getROUTE()==null) || 
             (this.ROUTE!=null &&
              this.ROUTE.equals(other.getROUTE()))) &&
            ((this.ROUTESTOPID==null && other.getROUTESTOPID()==null) || 
             (this.ROUTESTOPID!=null &&
              this.ROUTESTOPID.equals(other.getROUTESTOPID()))) &&
            ((this.SCHEDFINISH==null && other.getSCHEDFINISH()==null) || 
             (this.SCHEDFINISH!=null &&
              this.SCHEDFINISH.equals(other.getSCHEDFINISH()))) &&
            ((this.SCHEDSTART==null && other.getSCHEDSTART()==null) || 
             (this.SCHEDSTART!=null &&
              this.SCHEDSTART.equals(other.getSCHEDSTART()))) &&
            ((this.SENDERSYSID==null && other.getSENDERSYSID()==null) || 
             (this.SENDERSYSID!=null &&
              this.SENDERSYSID.equals(other.getSENDERSYSID()))) &&
            ((this.SITEID==null && other.getSITEID()==null) || 
             (this.SITEID!=null &&
              this.SITEID.equals(other.getSITEID()))) &&
            ((this.SNECONSTRAINT==null && other.getSNECONSTRAINT()==null) || 
             (this.SNECONSTRAINT!=null &&
              this.SNECONSTRAINT.equals(other.getSNECONSTRAINT()))) &&
            ((this.SOURCESYSID==null && other.getSOURCESYSID()==null) || 
             (this.SOURCESYSID!=null &&
              this.SOURCESYSID.equals(other.getSOURCESYSID()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.STATUSDATE==null && other.getSTATUSDATE()==null) || 
             (this.STATUSDATE!=null &&
              this.STATUSDATE.equals(other.getSTATUSDATE()))) &&
            ((this.STATUSIFACE==null && other.getSTATUSIFACE()==null) || 
             (this.STATUSIFACE!=null &&
              this.STATUSIFACE.equals(other.getSTATUSIFACE()))) &&
            ((this.STOREROOMMTLSTATUS==null && other.getSTOREROOMMTLSTATUS()==null) || 
             (this.STOREROOMMTLSTATUS!=null &&
              this.STOREROOMMTLSTATUS.equals(other.getSTOREROOMMTLSTATUS()))) &&
            ((this.SUPERVISOR==null && other.getSUPERVISOR()==null) || 
             (this.SUPERVISOR!=null &&
              this.SUPERVISOR.equals(other.getSUPERVISOR()))) &&
            ((this.SUSPENDFLOW==null && other.getSUSPENDFLOW()==null) || 
             (this.SUSPENDFLOW!=null &&
              this.SUSPENDFLOW.equals(other.getSUSPENDFLOW()))) &&
            ((this.TARGCOMPDATE==null && other.getTARGCOMPDATE()==null) || 
             (this.TARGCOMPDATE!=null &&
              this.TARGCOMPDATE.equals(other.getTARGCOMPDATE()))) &&
            ((this.TARGETDESC==null && other.getTARGETDESC()==null) || 
             (this.TARGETDESC!=null &&
              this.TARGETDESC.equals(other.getTARGETDESC()))) &&
            ((this.TARGSTARTDATE==null && other.getTARGSTARTDATE()==null) || 
             (this.TARGSTARTDATE!=null &&
              this.TARGSTARTDATE.equals(other.getTARGSTARTDATE()))) &&
            ((this.TASKID==null && other.getTASKID()==null) || 
             (this.TASKID!=null &&
              this.TASKID.equals(other.getTASKID()))) &&
            ((this.VENDOR==null && other.getVENDOR()==null) || 
             (this.VENDOR!=null &&
              this.VENDOR.equals(other.getVENDOR()))) &&
            ((this.VERIFICATION==null && other.getVERIFICATION()==null) || 
             (this.VERIFICATION!=null &&
              this.VERIFICATION.equals(other.getVERIFICATION()))) &&
            ((this.WHOMISCHANGEFOR==null && other.getWHOMISCHANGEFOR()==null) || 
             (this.WHOMISCHANGEFOR!=null &&
              this.WHOMISCHANGEFOR.equals(other.getWHOMISCHANGEFOR()))) &&
            ((this.WOACCEPTSCHARGES==null && other.getWOACCEPTSCHARGES()==null) || 
             (this.WOACCEPTSCHARGES!=null &&
              this.WOACCEPTSCHARGES.equals(other.getWOACCEPTSCHARGES()))) &&
            ((this.WOCLASS==null && other.getWOCLASS()==null) || 
             (this.WOCLASS!=null &&
              this.WOCLASS.equals(other.getWOCLASS()))) &&
            ((this.WOEQ1==null && other.getWOEQ1()==null) || 
             (this.WOEQ1!=null &&
              this.WOEQ1.equals(other.getWOEQ1()))) &&
            ((this.WOEQ10==null && other.getWOEQ10()==null) || 
             (this.WOEQ10!=null &&
              this.WOEQ10.equals(other.getWOEQ10()))) &&
            ((this.WOEQ11==null && other.getWOEQ11()==null) || 
             (this.WOEQ11!=null &&
              this.WOEQ11.equals(other.getWOEQ11()))) &&
            ((this.WOEQ12==null && other.getWOEQ12()==null) || 
             (this.WOEQ12!=null &&
              this.WOEQ12.equals(other.getWOEQ12()))) &&
            ((this.WOEQ13==null && other.getWOEQ13()==null) || 
             (this.WOEQ13!=null &&
              this.WOEQ13.equals(other.getWOEQ13()))) &&
            ((this.WOEQ14==null && other.getWOEQ14()==null) || 
             (this.WOEQ14!=null &&
              this.WOEQ14.equals(other.getWOEQ14()))) &&
            ((this.WOEQ2==null && other.getWOEQ2()==null) || 
             (this.WOEQ2!=null &&
              this.WOEQ2.equals(other.getWOEQ2()))) &&
            ((this.WOEQ3==null && other.getWOEQ3()==null) || 
             (this.WOEQ3!=null &&
              this.WOEQ3.equals(other.getWOEQ3()))) &&
            ((this.WOEQ4==null && other.getWOEQ4()==null) || 
             (this.WOEQ4!=null &&
              this.WOEQ4.equals(other.getWOEQ4()))) &&
            ((this.WOEQ5==null && other.getWOEQ5()==null) || 
             (this.WOEQ5!=null &&
              this.WOEQ5.equals(other.getWOEQ5()))) &&
            ((this.WOEQ6==null && other.getWOEQ6()==null) || 
             (this.WOEQ6!=null &&
              this.WOEQ6.equals(other.getWOEQ6()))) &&
            ((this.WOEQ7==null && other.getWOEQ7()==null) || 
             (this.WOEQ7!=null &&
              this.WOEQ7.equals(other.getWOEQ7()))) &&
            ((this.WOEQ8==null && other.getWOEQ8()==null) || 
             (this.WOEQ8!=null &&
              this.WOEQ8.equals(other.getWOEQ8()))) &&
            ((this.WOEQ9==null && other.getWOEQ9()==null) || 
             (this.WOEQ9!=null &&
              this.WOEQ9.equals(other.getWOEQ9()))) &&
            ((this.WOGROUP==null && other.getWOGROUP()==null) || 
             (this.WOGROUP!=null &&
              this.WOGROUP.equals(other.getWOGROUP()))) &&
            ((this.WOISSWAP==null && other.getWOISSWAP()==null) || 
             (this.WOISSWAP!=null &&
              this.WOISSWAP.equals(other.getWOISSWAP()))) &&
            ((this.WOJO1==null && other.getWOJO1()==null) || 
             (this.WOJO1!=null &&
              this.WOJO1.equals(other.getWOJO1()))) &&
            ((this.WOJO2==null && other.getWOJO2()==null) || 
             (this.WOJO2!=null &&
              this.WOJO2.equals(other.getWOJO2()))) &&
            ((this.WOJO3==null && other.getWOJO3()==null) || 
             (this.WOJO3!=null &&
              this.WOJO3.equals(other.getWOJO3()))) &&
            ((this.WOJO4==null && other.getWOJO4()==null) || 
             (this.WOJO4!=null &&
              this.WOJO4.equals(other.getWOJO4()))) &&
            ((this.WOJO5==null && other.getWOJO5()==null) || 
             (this.WOJO5!=null &&
              this.WOJO5.equals(other.getWOJO5()))) &&
            ((this.WOJO6==null && other.getWOJO6()==null) || 
             (this.WOJO6!=null &&
              this.WOJO6.equals(other.getWOJO6()))) &&
            ((this.WOJO7==null && other.getWOJO7()==null) || 
             (this.WOJO7!=null &&
              this.WOJO7.equals(other.getWOJO7()))) &&
            ((this.WOJO8==null && other.getWOJO8()==null) || 
             (this.WOJO8!=null &&
              this.WOJO8.equals(other.getWOJO8()))) &&
            ((this.WOJP1==null && other.getWOJP1()==null) || 
             (this.WOJP1!=null &&
              this.WOJP1.equals(other.getWOJP1()))) &&
            ((this.WOJP2==null && other.getWOJP2()==null) || 
             (this.WOJP2!=null &&
              this.WOJP2.equals(other.getWOJP2()))) &&
            ((this.WOJP3==null && other.getWOJP3()==null) || 
             (this.WOJP3!=null &&
              this.WOJP3.equals(other.getWOJP3()))) &&
            ((this.WOJP4==null && other.getWOJP4()==null) || 
             (this.WOJP4!=null &&
              this.WOJP4.equals(other.getWOJP4()))) &&
            ((this.WOJP5==null && other.getWOJP5()==null) || 
             (this.WOJP5!=null &&
              this.WOJP5.equals(other.getWOJP5()))) &&
            ((this.WOL1==null && other.getWOL1()==null) || 
             (this.WOL1!=null &&
              this.WOL1.equals(other.getWOL1()))) &&
            ((this.WOL2==null && other.getWOL2()==null) || 
             (this.WOL2!=null &&
              this.WOL2.equals(other.getWOL2()))) &&
            ((this.WOL3==null && other.getWOL3()==null) || 
             (this.WOL3!=null &&
              this.WOL3.equals(other.getWOL3()))) &&
            ((this.WOL4==null && other.getWOL4()==null) || 
             (this.WOL4!=null &&
              this.WOL4.equals(other.getWOL4()))) &&
            ((this.WOLABLNK==null && other.getWOLABLNK()==null) || 
             (this.WOLABLNK!=null &&
              this.WOLABLNK.equals(other.getWOLABLNK()))) &&
            ((this.WOLO1==null && other.getWOLO1()==null) || 
             (this.WOLO1!=null &&
              this.WOLO1.equals(other.getWOLO1()))) &&
            ((this.WOLO10==null && other.getWOLO10()==null) || 
             (this.WOLO10!=null &&
              this.WOLO10.equals(other.getWOLO10()))) &&
            ((this.WOLO2==null && other.getWOLO2()==null) || 
             (this.WOLO2!=null &&
              this.WOLO2.equals(other.getWOLO2()))) &&
            ((this.WOLO3==null && other.getWOLO3()==null) || 
             (this.WOLO3!=null &&
              this.WOLO3.equals(other.getWOLO3()))) &&
            ((this.WOLO4==null && other.getWOLO4()==null) || 
             (this.WOLO4!=null &&
              this.WOLO4.equals(other.getWOLO4()))) &&
            ((this.WOLO5==null && other.getWOLO5()==null) || 
             (this.WOLO5!=null &&
              this.WOLO5.equals(other.getWOLO5()))) &&
            ((this.WOLO6==null && other.getWOLO6()==null) || 
             (this.WOLO6!=null &&
              this.WOLO6.equals(other.getWOLO6()))) &&
            ((this.WOLO7==null && other.getWOLO7()==null) || 
             (this.WOLO7!=null &&
              this.WOLO7.equals(other.getWOLO7()))) &&
            ((this.WOLO8==null && other.getWOLO8()==null) || 
             (this.WOLO8!=null &&
              this.WOLO8.equals(other.getWOLO8()))) &&
            ((this.WOLO9==null && other.getWOLO9()==null) || 
             (this.WOLO9!=null &&
              this.WOLO9.equals(other.getWOLO9()))) &&
            ((this.WONUM==null && other.getWONUM()==null) || 
             (this.WONUM!=null &&
              this.WONUM.equals(other.getWONUM()))) &&
            ((this.WOPRIORITY==null && other.getWOPRIORITY()==null) || 
             (this.WOPRIORITY!=null &&
              this.WOPRIORITY.equals(other.getWOPRIORITY()))) &&
            ((this.WORKLOCATION==null && other.getWORKLOCATION()==null) || 
             (this.WORKLOCATION!=null &&
              this.WORKLOCATION.equals(other.getWORKLOCATION()))) &&
            ((this.WORKORDERID==null && other.getWORKORDERID()==null) || 
             (this.WORKORDERID!=null &&
              this.WORKORDERID.equals(other.getWORKORDERID()))) &&
            ((this.WORKPACKMTLSTATUS==null && other.getWORKPACKMTLSTATUS()==null) || 
             (this.WORKPACKMTLSTATUS!=null &&
              this.WORKPACKMTLSTATUS.equals(other.getWORKPACKMTLSTATUS()))) &&
            ((this.WORKTYPE==null && other.getWORKTYPE()==null) || 
             (this.WORKTYPE!=null &&
              this.WORKTYPE.equals(other.getWORKTYPE()))) &&
            ((this.WORTS1==null && other.getWORTS1()==null) || 
             (this.WORTS1!=null &&
              this.WORTS1.equals(other.getWORTS1()))) &&
            ((this.WORTS2==null && other.getWORTS2()==null) || 
             (this.WORTS2!=null &&
              this.WORTS2.equals(other.getWORTS2()))) &&
            ((this.WORTS3==null && other.getWORTS3()==null) || 
             (this.WORTS3!=null &&
              this.WORTS3.equals(other.getWORTS3()))) &&
            ((this.WORTS4==null && other.getWORTS4()==null) || 
             (this.WORTS4!=null &&
              this.WORTS4.equals(other.getWORTS4()))) &&
            ((this.WORTS5==null && other.getWORTS5()==null) || 
             (this.WORTS5!=null &&
              this.WORTS5.equals(other.getWORTS5()))) &&
            ((this.WOSEQUENCE==null && other.getWOSEQUENCE()==null) || 
             (this.WOSEQUENCE!=null &&
              this.WOSEQUENCE.equals(other.getWOSEQUENCE()))) &&
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
        if (getACTFINISH() != null) {
            _hashCode += getACTFINISH().hashCode();
        }
        if (getACTINTLABCOST() != null) {
            _hashCode += getACTINTLABCOST().hashCode();
        }
        if (getACTINTLABHRS() != null) {
            _hashCode += getACTINTLABHRS().hashCode();
        }
        if (getACTLABCOST() != null) {
            _hashCode += getACTLABCOST().hashCode();
        }
        if (getACTLABHRS() != null) {
            _hashCode += getACTLABHRS().hashCode();
        }
        if (getACTMATCOST() != null) {
            _hashCode += getACTMATCOST().hashCode();
        }
        if (getACTOUTLABCOST() != null) {
            _hashCode += getACTOUTLABCOST().hashCode();
        }
        if (getACTOUTLABHRS() != null) {
            _hashCode += getACTOUTLABHRS().hashCode();
        }
        if (getACTSERVCOST() != null) {
            _hashCode += getACTSERVCOST().hashCode();
        }
        if (getACTSTART() != null) {
            _hashCode += getACTSTART().hashCode();
        }
        if (getACTTOOLCOST() != null) {
            _hashCode += getACTTOOLCOST().hashCode();
        }
        if (getAMCREW() != null) {
            _hashCode += getAMCREW().hashCode();
        }
        if (getAMS() != null) {
            _hashCode += getAMS().hashCode();
        }
        if (getAOS() != null) {
            _hashCode += getAOS().hashCode();
        }
        if (getAPPTREQUIRED() != null) {
            _hashCode += getAPPTREQUIRED().hashCode();
        }
        if (getASSETLOCPRIORITY() != null) {
            _hashCode += getASSETLOCPRIORITY().hashCode();
        }
        if (getASSETNUM() != null) {
            _hashCode += getASSETNUM().hashCode();
        }
        if (getASSIGNEDOWNERGROUP() != null) {
            _hashCode += getASSIGNEDOWNERGROUP().hashCode();
        }
        if (getAVAILSTATUSDATE() != null) {
            _hashCode += getAVAILSTATUSDATE().hashCode();
        }
        if (getBACKOUTPLAN() != null) {
            _hashCode += getBACKOUTPLAN().hashCode();
        }
        if (getCALCCALENDAR() != null) {
            _hashCode += getCALCCALENDAR().hashCode();
        }
        if (getCALCORGID() != null) {
            _hashCode += getCALCORGID().hashCode();
        }
        if (getCALCPRIORITY() != null) {
            _hashCode += getCALCPRIORITY().hashCode();
        }
        if (getCALCSHIFT() != null) {
            _hashCode += getCALCSHIFT().hashCode();
        }
        if (getCALENDAR() != null) {
            _hashCode += getCALENDAR().hashCode();
        }
        if (getCHANGEBY() != null) {
            _hashCode += getCHANGEBY().hashCode();
        }
        if (getCHANGEDATE() != null) {
            _hashCode += getCHANGEDATE().hashCode();
        }
        if (getCHARGESTORE() != null) {
            _hashCode += getCHARGESTORE().hashCode();
        }
        if (getCINUM() != null) {
            _hashCode += getCINUM().hashCode();
        }
        if (getCLASSSTRUCTUREID() != null) {
            _hashCode += getCLASSSTRUCTUREID().hashCode();
        }
        if (getCOMMODITY() != null) {
            _hashCode += getCOMMODITY().hashCode();
        }
        if (getCOMMODITYGROUP() != null) {
            _hashCode += getCOMMODITYGROUP().hashCode();
        }
        if (getCONTRACT() != null) {
            _hashCode += getCONTRACT().hashCode();
        }
        if (getCREWID() != null) {
            _hashCode += getCREWID().hashCode();
        }
        if (getCREWWORKGROUP() != null) {
            _hashCode += getCREWWORKGROUP().hashCode();
        }
        if (getDESCRIPTION() != null) {
            _hashCode += getDESCRIPTION().hashCode();
        }
        if (getDESCRIPTION_LONGDESCRIPTION() != null) {
            _hashCode += getDESCRIPTION_LONGDESCRIPTION().hashCode();
        }
        if (getDIRISSUEMTLSTATUS() != null) {
            _hashCode += getDIRISSUEMTLSTATUS().hashCode();
        }
        if (getDISABLED() != null) {
            _hashCode += getDISABLED().hashCode();
        }
        if (getDOWNTIME() != null) {
            _hashCode += getDOWNTIME().hashCode();
        }
        if (getENVIRONMENT() != null) {
            _hashCode += getENVIRONMENT().hashCode();
        }
        if (getESTATAPPRINTLABCOST() != null) {
            _hashCode += getESTATAPPRINTLABCOST().hashCode();
        }
        if (getESTATAPPRINTLABHRS() != null) {
            _hashCode += getESTATAPPRINTLABHRS().hashCode();
        }
        if (getESTATAPPRLABCOST() != null) {
            _hashCode += getESTATAPPRLABCOST().hashCode();
        }
        if (getESTATAPPRLABHRS() != null) {
            _hashCode += getESTATAPPRLABHRS().hashCode();
        }
        if (getESTATAPPRMATCOST() != null) {
            _hashCode += getESTATAPPRMATCOST().hashCode();
        }
        if (getESTATAPPROUTLABCOST() != null) {
            _hashCode += getESTATAPPROUTLABCOST().hashCode();
        }
        if (getESTATAPPROUTLABHRS() != null) {
            _hashCode += getESTATAPPROUTLABHRS().hashCode();
        }
        if (getESTATAPPRSERVCOST() != null) {
            _hashCode += getESTATAPPRSERVCOST().hashCode();
        }
        if (getESTATAPPRTOOLCOST() != null) {
            _hashCode += getESTATAPPRTOOLCOST().hashCode();
        }
        if (getESTDUR() != null) {
            _hashCode += getESTDUR().hashCode();
        }
        if (getESTINTLABCOST() != null) {
            _hashCode += getESTINTLABCOST().hashCode();
        }
        if (getESTINTLABHRS() != null) {
            _hashCode += getESTINTLABHRS().hashCode();
        }
        if (getESTLABCOST() != null) {
            _hashCode += getESTLABCOST().hashCode();
        }
        if (getESTLABHRS() != null) {
            _hashCode += getESTLABHRS().hashCode();
        }
        if (getESTMATCOST() != null) {
            _hashCode += getESTMATCOST().hashCode();
        }
        if (getESTOUTLABCOST() != null) {
            _hashCode += getESTOUTLABCOST().hashCode();
        }
        if (getESTOUTLABHRS() != null) {
            _hashCode += getESTOUTLABHRS().hashCode();
        }
        if (getESTSERVCOST() != null) {
            _hashCode += getESTSERVCOST().hashCode();
        }
        if (getESTTOOLCOST() != null) {
            _hashCode += getESTTOOLCOST().hashCode();
        }
        if (getEXTERNALREFID() != null) {
            _hashCode += getEXTERNALREFID().hashCode();
        }
        if (getFAILDATE() != null) {
            _hashCode += getFAILDATE().hashCode();
        }
        if (getFAILURECODE() != null) {
            _hashCode += getFAILURECODE().hashCode();
        }
        if (getFCPROJECTID() != null) {
            _hashCode += getFCPROJECTID().hashCode();
        }
        if (getFCTASKID() != null) {
            _hashCode += getFCTASKID().hashCode();
        }
        if (getFINCNTRLID() != null) {
            _hashCode += getFINCNTRLID().hashCode();
        }
        if (getFIRSTAPPRSTATUS() != null) {
            _hashCode += getFIRSTAPPRSTATUS().hashCode();
        }
        if (getFLOWACTION() != null) {
            _hashCode += getFLOWACTION().hashCode();
        }
        if (getFLOWACTIONASSIST() != null) {
            _hashCode += getFLOWACTIONASSIST().hashCode();
        }
        if (getFLOWCONTROLLED() != null) {
            _hashCode += getFLOWCONTROLLED().hashCode();
        }
        if (getFNLCONSTRAINT() != null) {
            _hashCode += getFNLCONSTRAINT().hashCode();
        }
        if (getGENERATEDFORPO() != null) {
            _hashCode += getGENERATEDFORPO().hashCode();
        }
        if (getGENFORPOLINEID() != null) {
            _hashCode += getGENFORPOLINEID().hashCode();
        }
        if (getGENFORPOREVISION() != null) {
            _hashCode += getGENFORPOREVISION().hashCode();
        }
        if (getGLACCOUNT() != null) {
            _hashCode += getGLACCOUNT().hashCode();
        }
        if (getHASCHILDREN() != null) {
            _hashCode += getHASCHILDREN().hashCode();
        }
        if (getHASFOLLOWUPWORK() != null) {
            _hashCode += getHASFOLLOWUPWORK().hashCode();
        }
        if (getHISTORYFLAG() != null) {
            _hashCode += getHISTORYFLAG().hashCode();
        }
        if (getIGNOREDIAVAIL() != null) {
            _hashCode += getIGNOREDIAVAIL().hashCode();
        }
        if (getIGNORESRMAVAIL() != null) {
            _hashCode += getIGNORESRMAVAIL().hashCode();
        }
        if (getINCTASKSINSCHED() != null) {
            _hashCode += getINCTASKSINSCHED().hashCode();
        }
        if (getINSPECTOR() != null) {
            _hashCode += getINSPECTOR().hashCode();
        }
        if (getINTERRUPTIBLE() != null) {
            _hashCode += getINTERRUPTIBLE().hashCode();
        }
        if (getISTASK() != null) {
            _hashCode += getISTASK().hashCode();
        }
        if (getJOBTASKID() != null) {
            _hashCode += getJOBTASKID().hashCode();
        }
        if (getJPNUM() != null) {
            _hashCode += getJPNUM().hashCode();
        }
        if (getJUSTIFYPRIORITY() != null) {
            _hashCode += getJUSTIFYPRIORITY().hashCode();
        }
        if (getLASTCOPYLINKDATE() != null) {
            _hashCode += getLASTCOPYLINKDATE().hashCode();
        }
        if (getLAUNCHENTRYNAME() != null) {
            _hashCode += getLAUNCHENTRYNAME().hashCode();
        }
        if (getLEAD() != null) {
            _hashCode += getLEAD().hashCode();
        }
        if (getLMS() != null) {
            _hashCode += getLMS().hashCode();
        }
        if (getLOCATION() != null) {
            _hashCode += getLOCATION().hashCode();
        }
        if (getLOS() != null) {
            _hashCode += getLOS().hashCode();
        }
        if (getMEASUREDATE() != null) {
            _hashCode += getMEASUREDATE().hashCode();
        }
        if (getMEASUREMENTVALUE() != null) {
            _hashCode += getMEASUREMENTVALUE().hashCode();
        }
        if (getNESTEDJPINPROCESS() != null) {
            _hashCode += getNESTEDJPINPROCESS().hashCode();
        }
        if (getNEWCHILDCLASS() != null) {
            _hashCode += getNEWCHILDCLASS().hashCode();
        }
        if (getNP_STATUSMEMO() != null) {
            _hashCode += getNP_STATUSMEMO().hashCode();
        }
        if (getOBSERVATION() != null) {
            _hashCode += getOBSERVATION().hashCode();
        }
        if (getONBEHALFOF() != null) {
            _hashCode += getONBEHALFOF().hashCode();
        }
        if (getORGID() != null) {
            _hashCode += getORGID().hashCode();
        }
        if (getORIGRECORDCLASS() != null) {
            _hashCode += getORIGRECORDCLASS().hashCode();
        }
        if (getORIGRECORDID() != null) {
            _hashCode += getORIGRECORDID().hashCode();
        }
        if (getOUTLABCOST() != null) {
            _hashCode += getOUTLABCOST().hashCode();
        }
        if (getOUTMATCOST() != null) {
            _hashCode += getOUTMATCOST().hashCode();
        }
        if (getOUTTOOLCOST() != null) {
            _hashCode += getOUTTOOLCOST().hashCode();
        }
        if (getOWNER() != null) {
            _hashCode += getOWNER().hashCode();
        }
        if (getOWNERGROUP() != null) {
            _hashCode += getOWNERGROUP().hashCode();
        }
        if (getOWNERSYSID() != null) {
            _hashCode += getOWNERSYSID().hashCode();
        }
        if (getPARENT() != null) {
            _hashCode += getPARENT().hashCode();
        }
        if (getPARENTCHGSSTATUS() != null) {
            _hashCode += getPARENTCHGSSTATUS().hashCode();
        }
        if (getPERSONGROUP() != null) {
            _hashCode += getPERSONGROUP().hashCode();
        }
        if (getPHONE() != null) {
            _hashCode += getPHONE().hashCode();
        }
        if (getPLUSCFREQUENCY() != null) {
            _hashCode += getPLUSCFREQUENCY().hashCode();
        }
        if (getPLUSCFREQUNIT() != null) {
            _hashCode += getPLUSCFREQUNIT().hashCode();
        }
        if (getPLUSCISMOBILE() != null) {
            _hashCode += getPLUSCISMOBILE().hashCode();
        }
        if (getPLUSCJPREVNUM() != null) {
            _hashCode += getPLUSCJPREVNUM().hashCode();
        }
        if (getPLUSCLOOP() != null) {
            _hashCode += getPLUSCLOOP().hashCode();
        }
        if (getPLUSCNEXTDATE() != null) {
            _hashCode += getPLUSCNEXTDATE().hashCode();
        }
        if (getPLUSCOVERDUEDATE() != null) {
            _hashCode += getPLUSCOVERDUEDATE().hashCode();
        }
        if (getPLUSCPHYLOC() != null) {
            _hashCode += getPLUSCPHYLOC().hashCode();
        }
        if (getPMDUEDATE() != null) {
            _hashCode += getPMDUEDATE().hashCode();
        }
        if (getPMEXTDATE() != null) {
            _hashCode += getPMEXTDATE().hashCode();
        }
        if (getPMNEXTDUEDATE() != null) {
            _hashCode += getPMNEXTDUEDATE().hashCode();
        }
        if (getPMNUM() != null) {
            _hashCode += getPMNUM().hashCode();
        }
        if (getPOINTNUM() != null) {
            _hashCode += getPOINTNUM().hashCode();
        }
        if (getPROBLEMCODE() != null) {
            _hashCode += getPROBLEMCODE().hashCode();
        }
        if (getREASONFORCHANGE() != null) {
            _hashCode += getREASONFORCHANGE().hashCode();
        }
        if (getREMDUR() != null) {
            _hashCode += getREMDUR().hashCode();
        }
        if (getREPAIRFACILITY() != null) {
            _hashCode += getREPAIRFACILITY().hashCode();
        }
        if (getREPFACSITEID() != null) {
            _hashCode += getREPFACSITEID().hashCode();
        }
        if (getREPORTDATE() != null) {
            _hashCode += getREPORTDATE().hashCode();
        }
        if (getREPORTEDBY() != null) {
            _hashCode += getREPORTEDBY().hashCode();
        }
        if (getREQASSTDWNTIME() != null) {
            _hashCode += getREQASSTDWNTIME().hashCode();
        }
        if (getRESPONDBY() != null) {
            _hashCode += getRESPONDBY().hashCode();
        }
        if (getRISK() != null) {
            _hashCode += getRISK().hashCode();
        }
        if (getROUTE() != null) {
            _hashCode += getROUTE().hashCode();
        }
        if (getROUTESTOPID() != null) {
            _hashCode += getROUTESTOPID().hashCode();
        }
        if (getSCHEDFINISH() != null) {
            _hashCode += getSCHEDFINISH().hashCode();
        }
        if (getSCHEDSTART() != null) {
            _hashCode += getSCHEDSTART().hashCode();
        }
        if (getSENDERSYSID() != null) {
            _hashCode += getSENDERSYSID().hashCode();
        }
        if (getSITEID() != null) {
            _hashCode += getSITEID().hashCode();
        }
        if (getSNECONSTRAINT() != null) {
            _hashCode += getSNECONSTRAINT().hashCode();
        }
        if (getSOURCESYSID() != null) {
            _hashCode += getSOURCESYSID().hashCode();
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
        if (getSTOREROOMMTLSTATUS() != null) {
            _hashCode += getSTOREROOMMTLSTATUS().hashCode();
        }
        if (getSUPERVISOR() != null) {
            _hashCode += getSUPERVISOR().hashCode();
        }
        if (getSUSPENDFLOW() != null) {
            _hashCode += getSUSPENDFLOW().hashCode();
        }
        if (getTARGCOMPDATE() != null) {
            _hashCode += getTARGCOMPDATE().hashCode();
        }
        if (getTARGETDESC() != null) {
            _hashCode += getTARGETDESC().hashCode();
        }
        if (getTARGSTARTDATE() != null) {
            _hashCode += getTARGSTARTDATE().hashCode();
        }
        if (getTASKID() != null) {
            _hashCode += getTASKID().hashCode();
        }
        if (getVENDOR() != null) {
            _hashCode += getVENDOR().hashCode();
        }
        if (getVERIFICATION() != null) {
            _hashCode += getVERIFICATION().hashCode();
        }
        if (getWHOMISCHANGEFOR() != null) {
            _hashCode += getWHOMISCHANGEFOR().hashCode();
        }
        if (getWOACCEPTSCHARGES() != null) {
            _hashCode += getWOACCEPTSCHARGES().hashCode();
        }
        if (getWOCLASS() != null) {
            _hashCode += getWOCLASS().hashCode();
        }
        if (getWOEQ1() != null) {
            _hashCode += getWOEQ1().hashCode();
        }
        if (getWOEQ10() != null) {
            _hashCode += getWOEQ10().hashCode();
        }
        if (getWOEQ11() != null) {
            _hashCode += getWOEQ11().hashCode();
        }
        if (getWOEQ12() != null) {
            _hashCode += getWOEQ12().hashCode();
        }
        if (getWOEQ13() != null) {
            _hashCode += getWOEQ13().hashCode();
        }
        if (getWOEQ14() != null) {
            _hashCode += getWOEQ14().hashCode();
        }
        if (getWOEQ2() != null) {
            _hashCode += getWOEQ2().hashCode();
        }
        if (getWOEQ3() != null) {
            _hashCode += getWOEQ3().hashCode();
        }
        if (getWOEQ4() != null) {
            _hashCode += getWOEQ4().hashCode();
        }
        if (getWOEQ5() != null) {
            _hashCode += getWOEQ5().hashCode();
        }
        if (getWOEQ6() != null) {
            _hashCode += getWOEQ6().hashCode();
        }
        if (getWOEQ7() != null) {
            _hashCode += getWOEQ7().hashCode();
        }
        if (getWOEQ8() != null) {
            _hashCode += getWOEQ8().hashCode();
        }
        if (getWOEQ9() != null) {
            _hashCode += getWOEQ9().hashCode();
        }
        if (getWOGROUP() != null) {
            _hashCode += getWOGROUP().hashCode();
        }
        if (getWOISSWAP() != null) {
            _hashCode += getWOISSWAP().hashCode();
        }
        if (getWOJO1() != null) {
            _hashCode += getWOJO1().hashCode();
        }
        if (getWOJO2() != null) {
            _hashCode += getWOJO2().hashCode();
        }
        if (getWOJO3() != null) {
            _hashCode += getWOJO3().hashCode();
        }
        if (getWOJO4() != null) {
            _hashCode += getWOJO4().hashCode();
        }
        if (getWOJO5() != null) {
            _hashCode += getWOJO5().hashCode();
        }
        if (getWOJO6() != null) {
            _hashCode += getWOJO6().hashCode();
        }
        if (getWOJO7() != null) {
            _hashCode += getWOJO7().hashCode();
        }
        if (getWOJO8() != null) {
            _hashCode += getWOJO8().hashCode();
        }
        if (getWOJP1() != null) {
            _hashCode += getWOJP1().hashCode();
        }
        if (getWOJP2() != null) {
            _hashCode += getWOJP2().hashCode();
        }
        if (getWOJP3() != null) {
            _hashCode += getWOJP3().hashCode();
        }
        if (getWOJP4() != null) {
            _hashCode += getWOJP4().hashCode();
        }
        if (getWOJP5() != null) {
            _hashCode += getWOJP5().hashCode();
        }
        if (getWOL1() != null) {
            _hashCode += getWOL1().hashCode();
        }
        if (getWOL2() != null) {
            _hashCode += getWOL2().hashCode();
        }
        if (getWOL3() != null) {
            _hashCode += getWOL3().hashCode();
        }
        if (getWOL4() != null) {
            _hashCode += getWOL4().hashCode();
        }
        if (getWOLABLNK() != null) {
            _hashCode += getWOLABLNK().hashCode();
        }
        if (getWOLO1() != null) {
            _hashCode += getWOLO1().hashCode();
        }
        if (getWOLO10() != null) {
            _hashCode += getWOLO10().hashCode();
        }
        if (getWOLO2() != null) {
            _hashCode += getWOLO2().hashCode();
        }
        if (getWOLO3() != null) {
            _hashCode += getWOLO3().hashCode();
        }
        if (getWOLO4() != null) {
            _hashCode += getWOLO4().hashCode();
        }
        if (getWOLO5() != null) {
            _hashCode += getWOLO5().hashCode();
        }
        if (getWOLO6() != null) {
            _hashCode += getWOLO6().hashCode();
        }
        if (getWOLO7() != null) {
            _hashCode += getWOLO7().hashCode();
        }
        if (getWOLO8() != null) {
            _hashCode += getWOLO8().hashCode();
        }
        if (getWOLO9() != null) {
            _hashCode += getWOLO9().hashCode();
        }
        if (getWONUM() != null) {
            _hashCode += getWONUM().hashCode();
        }
        if (getWOPRIORITY() != null) {
            _hashCode += getWOPRIORITY().hashCode();
        }
        if (getWORKLOCATION() != null) {
            _hashCode += getWORKLOCATION().hashCode();
        }
        if (getWORKORDERID() != null) {
            _hashCode += getWORKORDERID().hashCode();
        }
        if (getWORKPACKMTLSTATUS() != null) {
            _hashCode += getWORKPACKMTLSTATUS().hashCode();
        }
        if (getWORKTYPE() != null) {
            _hashCode += getWORKTYPE().hashCode();
        }
        if (getWORTS1() != null) {
            _hashCode += getWORTS1().hashCode();
        }
        if (getWORTS2() != null) {
            _hashCode += getWORTS2().hashCode();
        }
        if (getWORTS3() != null) {
            _hashCode += getWORTS3().hashCode();
        }
        if (getWORTS4() != null) {
            _hashCode += getWORTS4().hashCode();
        }
        if (getWORTS5() != null) {
            _hashCode += getWORTS5().hashCode();
        }
        if (getWOSEQUENCE() != null) {
            _hashCode += getWOSEQUENCE().hashCode();
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
        new org.apache.axis.description.TypeDesc(MXWO_WORKORDERType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWO_WORKORDERType"));
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
        elemField.setFieldName("ACTFINISH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTFINISH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTOUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTOUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTOUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTOUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTSTART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTSTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMCREW");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AMCREW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APPTREQUIRED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "APPTREQUIRED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSETLOCPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSETLOCPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSETNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSETNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSIGNEDOWNERGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSIGNEDOWNERGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVAILSTATUSDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AVAILSTATUSDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BACKOUTPLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BACKOUTPLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCCALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCCALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCORGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCORGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCSHIFT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCSHIFT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHANGEBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHANGEBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHANGEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHANGEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHARGESTORE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHARGESTORE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CINUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CINUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLASSSTRUCTUREID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CLASSSTRUCTUREID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMODITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COMMODITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMODITYGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COMMODITYGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CONTRACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREWID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CREWID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREWWORKGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CREWWORKGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DESCRIPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPTION_LONGDESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DESCRIPTION_LONGDESCRIPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIRISSUEMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DIRISSUEMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISABLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DISABLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOWNTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DOWNTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENVIRONMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ENVIRONMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPROUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPROUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPROUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPROUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTDUR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTDUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTOUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTOUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTOUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTOUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXTERNALREFID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "EXTERNALREFID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAILDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FAILDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAILURECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FAILURECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FCPROJECTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FCPROJECTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FCTASKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FCTASKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FINCNTRLID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FINCNTRLID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRSTAPPRSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FIRSTAPPRSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWACTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWACTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWACTIONASSIST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWACTIONASSIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWCONTROLLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWCONTROLLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNLCONSTRAINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FNLCONSTRAINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENERATEDFORPO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENERATEDFORPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENFORPOLINEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENFORPOLINEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENFORPOREVISION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENFORPOREVISION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GLACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HASCHILDREN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HASCHILDREN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HASFOLLOWUPWORK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HASFOLLOWUPWORK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTORYFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HISTORYFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGNOREDIAVAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IGNOREDIAVAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGNORESRMAVAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IGNORESRMAVAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCTASKSINSCHED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INCTASKSINSCHED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSPECTOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INSPECTOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTERRUPTIBLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INTERRUPTIBLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISTASK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISTASK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JOBTASKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JOBTASKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JPNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JUSTIFYPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JUSTIFYPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTCOPYLINKDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTCOPYLINKDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAUNCHENTRYNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LAUNCHENTRYNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEAD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LEAD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
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
        elemField.setFieldName("LOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASUREDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MEASUREDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASUREMENTVALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MEASUREMENTVALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NESTEDJPINPROCESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NESTEDJPINPROCESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWCHILDCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NEWCHILDCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NP_STATUSMEMO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NP_STATUSMEMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBSERVATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OBSERVATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ONBEHALFOF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ONBEHALFOF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGRECORDCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORIGRECORDCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGRECORDID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORIGRECORDID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNER"));
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
        elemField.setFieldName("PARENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PARENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARENTCHGSSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PARENTCHGSSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCFREQUENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCFREQUENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCFREQUNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCFREQUNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCISMOBILE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCISMOBILE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCJPREVNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCJPREVNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCLOOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCLOOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCNEXTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCNEXTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCOVERDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCOVERDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCPHYLOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCPHYLOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMEXTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMEXTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNEXTDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMNEXTDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "POINTNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROBLEMCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PROBLEMCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REASONFORCHANGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REASONFORCHANGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMDUR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REMDUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPAIRFACILITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPAIRFACILITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPFACSITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPFACSITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPORTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPORTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPORTEDBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPORTEDBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REQASSTDWNTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REQASSTDWNTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONDBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "RESPONDBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "RISK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROUTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ROUTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROUTESTOPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ROUTESTOPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDFINISH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SCHEDFINISH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDSTART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SCHEDSTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDERSYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SENDERSYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNECONSTRAINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SNECONSTRAINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOURCESYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SOURCESYSID"));
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
        elemField.setFieldName("STOREROOMMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STOREROOMMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
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
        elemField.setFieldName("SUSPENDFLOW");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SUSPENDFLOW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGCOMPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGCOMPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGETDESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGETDESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGSTARTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGSTARTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TASKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TASKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VENDOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VENDOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERIFICATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VERIFICATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHOMISCHANGEFOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WHOMISCHANGEFOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOACCEPTSCHARGES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOACCEPTSCHARGES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ11");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ12");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ13");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ13"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ14");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ14"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOISSWAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOISSWAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLABLNK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLABLNK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WONUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WONUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
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
        elemField.setFieldName("WORKLOCATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKLOCATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKORDERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKPACKMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKPACKMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOSEQUENCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOSEQUENCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
