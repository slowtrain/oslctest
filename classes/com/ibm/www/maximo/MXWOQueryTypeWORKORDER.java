/**
 * MXWOQueryTypeWORKORDER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo;

public class MXWOQueryTypeWORKORDER  implements java.io.Serializable {
    private com.ibm.www.maximo.MXDateTimeQueryType[] ACTFINISH;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTMATCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTSERVCOST;

    private com.ibm.www.maximo.MXDateTimeQueryType[] ACTSTART;

    private com.ibm.www.maximo.MXDoubleQueryType[] ACTTOOLCOST;

    private com.ibm.www.maximo.MXStringQueryType[] AMCREW;

    private com.ibm.www.maximo.MXBooleanQueryType[] AMS;

    private com.ibm.www.maximo.MXBooleanQueryType[] AOS;

    private com.ibm.www.maximo.MXBooleanQueryType[] APPTREQUIRED;

    private com.ibm.www.maximo.MXLongQueryType[] ASSETLOCPRIORITY;

    private com.ibm.www.maximo.MXStringQueryType[] ASSETNUM;

    private com.ibm.www.maximo.MXStringQueryType[] ASSIGNEDOWNERGROUP;

    private com.ibm.www.maximo.MXDateTimeQueryType[] AVAILSTATUSDATE;

    private com.ibm.www.maximo.MXStringQueryType[] BACKOUTPLAN;

    private com.ibm.www.maximo.MXStringQueryType[] CALCCALENDAR;

    private com.ibm.www.maximo.MXStringQueryType[] CALCORGID;

    private com.ibm.www.maximo.MXLongQueryType[] CALCPRIORITY;

    private com.ibm.www.maximo.MXStringQueryType[] CALCSHIFT;

    private com.ibm.www.maximo.MXStringQueryType[] CALENDAR;

    private com.ibm.www.maximo.MXStringQueryType[] CHANGEBY;

    private com.ibm.www.maximo.MXDateTimeQueryType[] CHANGEDATE;

    private com.ibm.www.maximo.MXBooleanQueryType[] CHARGESTORE;

    private com.ibm.www.maximo.MXStringQueryType[] CINUM;

    private com.ibm.www.maximo.MXStringQueryType[] CLASSSTRUCTUREID;

    private com.ibm.www.maximo.MXStringQueryType[] COMMODITY;

    private com.ibm.www.maximo.MXStringQueryType[] COMMODITYGROUP;

    private com.ibm.www.maximo.MXStringQueryType[] CONTRACT;

    private com.ibm.www.maximo.MXStringQueryType[] CREWID;

    private com.ibm.www.maximo.MXStringQueryType[] CREWWORKGROUP;

    private com.ibm.www.maximo.MXStringQueryType[] DESCRIPTION;

    private com.ibm.www.maximo.MXDomainQueryType[] DIRISSUEMTLSTATUS;

    private com.ibm.www.maximo.MXBooleanQueryType[] DISABLED;

    private com.ibm.www.maximo.MXBooleanQueryType[] DOWNTIME;

    private com.ibm.www.maximo.MXStringQueryType[] ENVIRONMENT;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRMATCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRSERVCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRTOOLCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTDUR;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTMATCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABHRS;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTSERVCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] ESTTOOLCOST;

    private com.ibm.www.maximo.MXStringQueryType[] EXTERNALREFID;

    private com.ibm.www.maximo.MXDateTimeQueryType[] FAILDATE;

    private com.ibm.www.maximo.MXStringQueryType[] FAILURECODE;

    private com.ibm.www.maximo.MXStringQueryType[] FINCNTRLID;

    private com.ibm.www.maximo.MXStringQueryType[] FIRSTAPPRSTATUS;

    private com.ibm.www.maximo.MXStringQueryType[] FLOWACTION;

    private com.ibm.www.maximo.MXBooleanQueryType[] FLOWACTIONASSIST;

    private com.ibm.www.maximo.MXBooleanQueryType[] FLOWCONTROLLED;

    private com.ibm.www.maximo.MXDateTimeQueryType[] FNLCONSTRAINT;

    private com.ibm.www.maximo.MXStringQueryType[] GENERATEDFORPO;

    private com.ibm.www.maximo.MXLongQueryType[] GENFORPOLINEID;

    private com.ibm.www.maximo.MXLongQueryType[] GENFORPOREVISION;

    private com.ibm.www.maximo.MXGLAccountQueryType[] GLACCOUNT;

    private com.ibm.www.maximo.MXBooleanQueryType[] HASCHILDREN;

    private com.ibm.www.maximo.MXBooleanQueryType[] HASFOLLOWUPWORK;

    private com.ibm.www.maximo.MXBooleanQueryType[] HISTORYFLAG;

    private com.ibm.www.maximo.MXBooleanQueryType[] IGNOREDIAVAIL;

    private com.ibm.www.maximo.MXBooleanQueryType[] IGNORESRMAVAIL;

    private com.ibm.www.maximo.MXBooleanQueryType[] INCTASKSINSCHED;

    private com.ibm.www.maximo.MXStringQueryType[] INSPECTOR;

    private com.ibm.www.maximo.MXBooleanQueryType[] INTERRUPTIBLE;

    private com.ibm.www.maximo.MXBooleanQueryType[] ISTASK;

    private com.ibm.www.maximo.MXLongQueryType[] JOBTASKID;

    private com.ibm.www.maximo.MXStringQueryType[] JPNUM;

    private com.ibm.www.maximo.MXStringQueryType[] JUSTIFYPRIORITY;

    private com.ibm.www.maximo.MXDateTimeQueryType[] LASTCOPYLINKDATE;

    private com.ibm.www.maximo.MXStringQueryType[] LAUNCHENTRYNAME;

    private com.ibm.www.maximo.MXStringQueryType[] LEAD;

    private com.ibm.www.maximo.MXBooleanQueryType[] LMS;

    private com.ibm.www.maximo.MXStringQueryType[] LOCATION;

    private com.ibm.www.maximo.MXBooleanQueryType[] LOS;

    private com.ibm.www.maximo.MXDateTimeQueryType[] MEASUREDATE;

    private com.ibm.www.maximo.MXDoubleQueryType[] MEASUREMENTVALUE;

    private com.ibm.www.maximo.MXBooleanQueryType[] NESTEDJPINPROCESS;

    private com.ibm.www.maximo.MXStringQueryType[] NEWCHILDCLASS;

    private com.ibm.www.maximo.MXStringQueryType[] OBSERVATION;

    private com.ibm.www.maximo.MXStringQueryType[] ONBEHALFOF;

    private com.ibm.www.maximo.MXStringQueryType[] ORGID;

    private com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDCLASS;

    private com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDID;

    private com.ibm.www.maximo.MXDoubleQueryType[] OUTLABCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] OUTMATCOST;

    private com.ibm.www.maximo.MXDoubleQueryType[] OUTTOOLCOST;

    private com.ibm.www.maximo.MXStringQueryType[] OWNER;

    private com.ibm.www.maximo.MXStringQueryType[] OWNERGROUP;

    private com.ibm.www.maximo.MXStringQueryType[] OWNERSYSID;

    private com.ibm.www.maximo.MXStringQueryType[] PARENT;

    private com.ibm.www.maximo.MXBooleanQueryType[] PARENTCHGSSTATUS;

    private com.ibm.www.maximo.MXStringQueryType[] PERSONGROUP;

    private com.ibm.www.maximo.MXStringQueryType[] PHONE;

    private com.ibm.www.maximo.MXLongQueryType[] PLUSCFREQUENCY;

    private com.ibm.www.maximo.MXDomainQueryType[] PLUSCFREQUNIT;

    private com.ibm.www.maximo.MXBooleanQueryType[] PLUSCISMOBILE;

    private com.ibm.www.maximo.MXLongQueryType[] PLUSCJPREVNUM;

    private com.ibm.www.maximo.MXBooleanQueryType[] PLUSCLOOP;

    private com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCNEXTDATE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCOVERDUEDATE;

    private com.ibm.www.maximo.MXStringQueryType[] PLUSCPHYLOC;

    private com.ibm.www.maximo.MXDateTimeQueryType[] PMDUEDATE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] PMEXTDATE;

    private com.ibm.www.maximo.MXDateTimeQueryType[] PMNEXTDUEDATE;

    private com.ibm.www.maximo.MXStringQueryType[] PMNUM;

    private com.ibm.www.maximo.MXStringQueryType[] POINTNUM;

    private com.ibm.www.maximo.MXStringQueryType[] PROBLEMCODE;

    private com.ibm.www.maximo.MXStringQueryType[] REASONFORCHANGE;

    private com.ibm.www.maximo.MXDoubleQueryType[] REMDUR;

    private com.ibm.www.maximo.MXStringQueryType[] REPAIRFACILITY;

    private com.ibm.www.maximo.MXStringQueryType[] REPFACSITEID;

    private com.ibm.www.maximo.MXDateTimeQueryType[] REPORTDATE;

    private com.ibm.www.maximo.MXStringQueryType[] REPORTEDBY;

    private com.ibm.www.maximo.MXBooleanQueryType[] REQASSTDWNTIME;

    private com.ibm.www.maximo.MXDateTimeQueryType[] RESPONDBY;

    private com.ibm.www.maximo.MXStringQueryType[] RISK;

    private com.ibm.www.maximo.MXStringQueryType[] ROUTE;

    private com.ibm.www.maximo.MXLongQueryType[] ROUTESTOPID;

    private com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDFINISH;

    private com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDSTART;

    private com.ibm.www.maximo.MXStringQueryType[] SENDERSYSID;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] SITEID;

    private com.ibm.www.maximo.MXDateTimeQueryType[] SNECONSTRAINT;

    private com.ibm.www.maximo.MXStringQueryType[] SOURCESYSID;

    private com.ibm.www.maximo.MXDomainQueryType[] STATUS;

    private com.ibm.www.maximo.MXDateTimeQueryType[] STATUSDATE;

    private com.ibm.www.maximo.MXDomainQueryType[] STOREROOMMTLSTATUS;

    private com.ibm.www.maximo.MXStringQueryType[] SUPERVISOR;

    private com.ibm.www.maximo.MXBooleanQueryType[] SUSPENDFLOW;

    private com.ibm.www.maximo.MXDateTimeQueryType[] TARGCOMPDATE;

    private com.ibm.www.maximo.MXStringQueryType[] TARGETDESC;

    private com.ibm.www.maximo.MXDateTimeQueryType[] TARGSTARTDATE;

    private com.ibm.www.maximo.MXLongQueryType[] TASKID;

    private com.ibm.www.maximo.MXStringQueryType[] VENDOR;

    private com.ibm.www.maximo.MXStringQueryType[] VERIFICATION;

    private com.ibm.www.maximo.MXStringQueryType[] WHOMISCHANGEFOR;

    private com.ibm.www.maximo.MXBooleanQueryType[] WOACCEPTSCHARGES;

    private com.ibm.www.maximo.MXDomainQueryType[] WOCLASS;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ1;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ10;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ11;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOEQ12;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ13;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOEQ14;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ2;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ3;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ4;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOEQ5;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ6;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOEQ7;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ8;

    private com.ibm.www.maximo.MXStringQueryType[] WOEQ9;

    private com.ibm.www.maximo.MXStringQueryType[] WOGROUP;

    private com.ibm.www.maximo.MXBooleanQueryType[] WOISSWAP;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO1;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO2;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO3;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOJO4;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO5;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO6;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO7;

    private com.ibm.www.maximo.MXStringQueryType[] WOJO8;

    private com.ibm.www.maximo.MXStringQueryType[] WOJP1;

    private com.ibm.www.maximo.MXStringQueryType[] WOJP2;

    private com.ibm.www.maximo.MXStringQueryType[] WOJP3;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOJP4;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WOJP5;

    private com.ibm.www.maximo.MXStringQueryType[] WOL1;

    private com.ibm.www.maximo.MXStringQueryType[] WOL2;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOL3;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WOL4;

    private com.ibm.www.maximo.MXStringQueryType[] WOLABLNK;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO1;

    private com.ibm.www.maximo.MXLongQueryType[] WOLO10;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO2;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO3;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO4;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO5;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOLO6;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WOLO7;

    private com.ibm.www.maximo.MXDoubleQueryType[] WOLO8;

    private com.ibm.www.maximo.MXStringQueryType[] WOLO9;

    /* Unique Key Component */
    private com.ibm.www.maximo.MXStringQueryType[] WONUM;

    private com.ibm.www.maximo.MXLongQueryType[] WOPRIORITY;

    private com.ibm.www.maximo.MXStringQueryType[] WORKLOCATION;

    private com.ibm.www.maximo.MXLongQueryType[] WORKORDERID;

    private com.ibm.www.maximo.MXDomainQueryType[] WORKPACKMTLSTATUS;

    private com.ibm.www.maximo.MXStringQueryType[] WORKTYPE;

    private com.ibm.www.maximo.MXStringQueryType[] WORTS1;

    private com.ibm.www.maximo.MXStringQueryType[] WORTS2;

    private com.ibm.www.maximo.MXStringQueryType[] WORTS3;

    private com.ibm.www.maximo.MXDateTimeQueryType[] WORTS4;

    private com.ibm.www.maximo.MXDoubleQueryType[] WORTS5;

    private com.ibm.www.maximo.MXLongQueryType[] WOSEQUENCE;

    public MXWOQueryTypeWORKORDER() {
    }

    public MXWOQueryTypeWORKORDER(
           com.ibm.www.maximo.MXDateTimeQueryType[] ACTFINISH,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTMATCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTSERVCOST,
           com.ibm.www.maximo.MXDateTimeQueryType[] ACTSTART,
           com.ibm.www.maximo.MXDoubleQueryType[] ACTTOOLCOST,
           com.ibm.www.maximo.MXStringQueryType[] AMCREW,
           com.ibm.www.maximo.MXBooleanQueryType[] AMS,
           com.ibm.www.maximo.MXBooleanQueryType[] AOS,
           com.ibm.www.maximo.MXBooleanQueryType[] APPTREQUIRED,
           com.ibm.www.maximo.MXLongQueryType[] ASSETLOCPRIORITY,
           com.ibm.www.maximo.MXStringQueryType[] ASSETNUM,
           com.ibm.www.maximo.MXStringQueryType[] ASSIGNEDOWNERGROUP,
           com.ibm.www.maximo.MXDateTimeQueryType[] AVAILSTATUSDATE,
           com.ibm.www.maximo.MXStringQueryType[] BACKOUTPLAN,
           com.ibm.www.maximo.MXStringQueryType[] CALCCALENDAR,
           com.ibm.www.maximo.MXStringQueryType[] CALCORGID,
           com.ibm.www.maximo.MXLongQueryType[] CALCPRIORITY,
           com.ibm.www.maximo.MXStringQueryType[] CALCSHIFT,
           com.ibm.www.maximo.MXStringQueryType[] CALENDAR,
           com.ibm.www.maximo.MXStringQueryType[] CHANGEBY,
           com.ibm.www.maximo.MXDateTimeQueryType[] CHANGEDATE,
           com.ibm.www.maximo.MXBooleanQueryType[] CHARGESTORE,
           com.ibm.www.maximo.MXStringQueryType[] CINUM,
           com.ibm.www.maximo.MXStringQueryType[] CLASSSTRUCTUREID,
           com.ibm.www.maximo.MXStringQueryType[] COMMODITY,
           com.ibm.www.maximo.MXStringQueryType[] COMMODITYGROUP,
           com.ibm.www.maximo.MXStringQueryType[] CONTRACT,
           com.ibm.www.maximo.MXStringQueryType[] CREWID,
           com.ibm.www.maximo.MXStringQueryType[] CREWWORKGROUP,
           com.ibm.www.maximo.MXStringQueryType[] DESCRIPTION,
           com.ibm.www.maximo.MXDomainQueryType[] DIRISSUEMTLSTATUS,
           com.ibm.www.maximo.MXBooleanQueryType[] DISABLED,
           com.ibm.www.maximo.MXBooleanQueryType[] DOWNTIME,
           com.ibm.www.maximo.MXStringQueryType[] ENVIRONMENT,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRMATCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRSERVCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRTOOLCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTDUR,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTMATCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABHRS,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTSERVCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] ESTTOOLCOST,
           com.ibm.www.maximo.MXStringQueryType[] EXTERNALREFID,
           com.ibm.www.maximo.MXDateTimeQueryType[] FAILDATE,
           com.ibm.www.maximo.MXStringQueryType[] FAILURECODE,
           com.ibm.www.maximo.MXStringQueryType[] FINCNTRLID,
           com.ibm.www.maximo.MXStringQueryType[] FIRSTAPPRSTATUS,
           com.ibm.www.maximo.MXStringQueryType[] FLOWACTION,
           com.ibm.www.maximo.MXBooleanQueryType[] FLOWACTIONASSIST,
           com.ibm.www.maximo.MXBooleanQueryType[] FLOWCONTROLLED,
           com.ibm.www.maximo.MXDateTimeQueryType[] FNLCONSTRAINT,
           com.ibm.www.maximo.MXStringQueryType[] GENERATEDFORPO,
           com.ibm.www.maximo.MXLongQueryType[] GENFORPOLINEID,
           com.ibm.www.maximo.MXLongQueryType[] GENFORPOREVISION,
           com.ibm.www.maximo.MXGLAccountQueryType[] GLACCOUNT,
           com.ibm.www.maximo.MXBooleanQueryType[] HASCHILDREN,
           com.ibm.www.maximo.MXBooleanQueryType[] HASFOLLOWUPWORK,
           com.ibm.www.maximo.MXBooleanQueryType[] HISTORYFLAG,
           com.ibm.www.maximo.MXBooleanQueryType[] IGNOREDIAVAIL,
           com.ibm.www.maximo.MXBooleanQueryType[] IGNORESRMAVAIL,
           com.ibm.www.maximo.MXBooleanQueryType[] INCTASKSINSCHED,
           com.ibm.www.maximo.MXStringQueryType[] INSPECTOR,
           com.ibm.www.maximo.MXBooleanQueryType[] INTERRUPTIBLE,
           com.ibm.www.maximo.MXBooleanQueryType[] ISTASK,
           com.ibm.www.maximo.MXLongQueryType[] JOBTASKID,
           com.ibm.www.maximo.MXStringQueryType[] JPNUM,
           com.ibm.www.maximo.MXStringQueryType[] JUSTIFYPRIORITY,
           com.ibm.www.maximo.MXDateTimeQueryType[] LASTCOPYLINKDATE,
           com.ibm.www.maximo.MXStringQueryType[] LAUNCHENTRYNAME,
           com.ibm.www.maximo.MXStringQueryType[] LEAD,
           com.ibm.www.maximo.MXBooleanQueryType[] LMS,
           com.ibm.www.maximo.MXStringQueryType[] LOCATION,
           com.ibm.www.maximo.MXBooleanQueryType[] LOS,
           com.ibm.www.maximo.MXDateTimeQueryType[] MEASUREDATE,
           com.ibm.www.maximo.MXDoubleQueryType[] MEASUREMENTVALUE,
           com.ibm.www.maximo.MXBooleanQueryType[] NESTEDJPINPROCESS,
           com.ibm.www.maximo.MXStringQueryType[] NEWCHILDCLASS,
           com.ibm.www.maximo.MXStringQueryType[] OBSERVATION,
           com.ibm.www.maximo.MXStringQueryType[] ONBEHALFOF,
           com.ibm.www.maximo.MXStringQueryType[] ORGID,
           com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDCLASS,
           com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDID,
           com.ibm.www.maximo.MXDoubleQueryType[] OUTLABCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] OUTMATCOST,
           com.ibm.www.maximo.MXDoubleQueryType[] OUTTOOLCOST,
           com.ibm.www.maximo.MXStringQueryType[] OWNER,
           com.ibm.www.maximo.MXStringQueryType[] OWNERGROUP,
           com.ibm.www.maximo.MXStringQueryType[] OWNERSYSID,
           com.ibm.www.maximo.MXStringQueryType[] PARENT,
           com.ibm.www.maximo.MXBooleanQueryType[] PARENTCHGSSTATUS,
           com.ibm.www.maximo.MXStringQueryType[] PERSONGROUP,
           com.ibm.www.maximo.MXStringQueryType[] PHONE,
           com.ibm.www.maximo.MXLongQueryType[] PLUSCFREQUENCY,
           com.ibm.www.maximo.MXDomainQueryType[] PLUSCFREQUNIT,
           com.ibm.www.maximo.MXBooleanQueryType[] PLUSCISMOBILE,
           com.ibm.www.maximo.MXLongQueryType[] PLUSCJPREVNUM,
           com.ibm.www.maximo.MXBooleanQueryType[] PLUSCLOOP,
           com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCNEXTDATE,
           com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCOVERDUEDATE,
           com.ibm.www.maximo.MXStringQueryType[] PLUSCPHYLOC,
           com.ibm.www.maximo.MXDateTimeQueryType[] PMDUEDATE,
           com.ibm.www.maximo.MXDateTimeQueryType[] PMEXTDATE,
           com.ibm.www.maximo.MXDateTimeQueryType[] PMNEXTDUEDATE,
           com.ibm.www.maximo.MXStringQueryType[] PMNUM,
           com.ibm.www.maximo.MXStringQueryType[] POINTNUM,
           com.ibm.www.maximo.MXStringQueryType[] PROBLEMCODE,
           com.ibm.www.maximo.MXStringQueryType[] REASONFORCHANGE,
           com.ibm.www.maximo.MXDoubleQueryType[] REMDUR,
           com.ibm.www.maximo.MXStringQueryType[] REPAIRFACILITY,
           com.ibm.www.maximo.MXStringQueryType[] REPFACSITEID,
           com.ibm.www.maximo.MXDateTimeQueryType[] REPORTDATE,
           com.ibm.www.maximo.MXStringQueryType[] REPORTEDBY,
           com.ibm.www.maximo.MXBooleanQueryType[] REQASSTDWNTIME,
           com.ibm.www.maximo.MXDateTimeQueryType[] RESPONDBY,
           com.ibm.www.maximo.MXStringQueryType[] RISK,
           com.ibm.www.maximo.MXStringQueryType[] ROUTE,
           com.ibm.www.maximo.MXLongQueryType[] ROUTESTOPID,
           com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDFINISH,
           com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDSTART,
           com.ibm.www.maximo.MXStringQueryType[] SENDERSYSID,
           com.ibm.www.maximo.MXStringQueryType[] SITEID,
           com.ibm.www.maximo.MXDateTimeQueryType[] SNECONSTRAINT,
           com.ibm.www.maximo.MXStringQueryType[] SOURCESYSID,
           com.ibm.www.maximo.MXDomainQueryType[] STATUS,
           com.ibm.www.maximo.MXDateTimeQueryType[] STATUSDATE,
           com.ibm.www.maximo.MXDomainQueryType[] STOREROOMMTLSTATUS,
           com.ibm.www.maximo.MXStringQueryType[] SUPERVISOR,
           com.ibm.www.maximo.MXBooleanQueryType[] SUSPENDFLOW,
           com.ibm.www.maximo.MXDateTimeQueryType[] TARGCOMPDATE,
           com.ibm.www.maximo.MXStringQueryType[] TARGETDESC,
           com.ibm.www.maximo.MXDateTimeQueryType[] TARGSTARTDATE,
           com.ibm.www.maximo.MXLongQueryType[] TASKID,
           com.ibm.www.maximo.MXStringQueryType[] VENDOR,
           com.ibm.www.maximo.MXStringQueryType[] VERIFICATION,
           com.ibm.www.maximo.MXStringQueryType[] WHOMISCHANGEFOR,
           com.ibm.www.maximo.MXBooleanQueryType[] WOACCEPTSCHARGES,
           com.ibm.www.maximo.MXDomainQueryType[] WOCLASS,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ1,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ10,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ11,
           com.ibm.www.maximo.MXDoubleQueryType[] WOEQ12,
           com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ13,
           com.ibm.www.maximo.MXDoubleQueryType[] WOEQ14,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ2,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ3,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ4,
           com.ibm.www.maximo.MXDoubleQueryType[] WOEQ5,
           com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ6,
           com.ibm.www.maximo.MXDoubleQueryType[] WOEQ7,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ8,
           com.ibm.www.maximo.MXStringQueryType[] WOEQ9,
           com.ibm.www.maximo.MXStringQueryType[] WOGROUP,
           com.ibm.www.maximo.MXBooleanQueryType[] WOISSWAP,
           com.ibm.www.maximo.MXStringQueryType[] WOJO1,
           com.ibm.www.maximo.MXStringQueryType[] WOJO2,
           com.ibm.www.maximo.MXStringQueryType[] WOJO3,
           com.ibm.www.maximo.MXDoubleQueryType[] WOJO4,
           com.ibm.www.maximo.MXStringQueryType[] WOJO5,
           com.ibm.www.maximo.MXStringQueryType[] WOJO6,
           com.ibm.www.maximo.MXStringQueryType[] WOJO7,
           com.ibm.www.maximo.MXStringQueryType[] WOJO8,
           com.ibm.www.maximo.MXStringQueryType[] WOJP1,
           com.ibm.www.maximo.MXStringQueryType[] WOJP2,
           com.ibm.www.maximo.MXStringQueryType[] WOJP3,
           com.ibm.www.maximo.MXDoubleQueryType[] WOJP4,
           com.ibm.www.maximo.MXDateTimeQueryType[] WOJP5,
           com.ibm.www.maximo.MXStringQueryType[] WOL1,
           com.ibm.www.maximo.MXStringQueryType[] WOL2,
           com.ibm.www.maximo.MXDoubleQueryType[] WOL3,
           com.ibm.www.maximo.MXDateTimeQueryType[] WOL4,
           com.ibm.www.maximo.MXStringQueryType[] WOLABLNK,
           com.ibm.www.maximo.MXStringQueryType[] WOLO1,
           com.ibm.www.maximo.MXLongQueryType[] WOLO10,
           com.ibm.www.maximo.MXStringQueryType[] WOLO2,
           com.ibm.www.maximo.MXStringQueryType[] WOLO3,
           com.ibm.www.maximo.MXStringQueryType[] WOLO4,
           com.ibm.www.maximo.MXStringQueryType[] WOLO5,
           com.ibm.www.maximo.MXDoubleQueryType[] WOLO6,
           com.ibm.www.maximo.MXDateTimeQueryType[] WOLO7,
           com.ibm.www.maximo.MXDoubleQueryType[] WOLO8,
           com.ibm.www.maximo.MXStringQueryType[] WOLO9,
           com.ibm.www.maximo.MXStringQueryType[] WONUM,
           com.ibm.www.maximo.MXLongQueryType[] WOPRIORITY,
           com.ibm.www.maximo.MXStringQueryType[] WORKLOCATION,
           com.ibm.www.maximo.MXLongQueryType[] WORKORDERID,
           com.ibm.www.maximo.MXDomainQueryType[] WORKPACKMTLSTATUS,
           com.ibm.www.maximo.MXStringQueryType[] WORKTYPE,
           com.ibm.www.maximo.MXStringQueryType[] WORTS1,
           com.ibm.www.maximo.MXStringQueryType[] WORTS2,
           com.ibm.www.maximo.MXStringQueryType[] WORTS3,
           com.ibm.www.maximo.MXDateTimeQueryType[] WORTS4,
           com.ibm.www.maximo.MXDoubleQueryType[] WORTS5,
           com.ibm.www.maximo.MXLongQueryType[] WOSEQUENCE) {
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
    }


    /**
     * Gets the ACTFINISH value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTFINISH
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getACTFINISH() {
        return ACTFINISH;
    }


    /**
     * Sets the ACTFINISH value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTFINISH
     */
    public void setACTFINISH(com.ibm.www.maximo.MXDateTimeQueryType[] ACTFINISH) {
        this.ACTFINISH = ACTFINISH;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getACTFINISH(int i) {
        return this.ACTFINISH[i];
    }

    public void setACTFINISH(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.ACTFINISH[i] = _value;
    }


    /**
     * Gets the ACTINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTINTLABCOST() {
        return ACTINTLABCOST;
    }


    /**
     * Sets the ACTINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTINTLABCOST
     */
    public void setACTINTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABCOST) {
        this.ACTINTLABCOST = ACTINTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTINTLABCOST(int i) {
        return this.ACTINTLABCOST[i];
    }

    public void setACTINTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTINTLABCOST[i] = _value;
    }


    /**
     * Gets the ACTINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTINTLABHRS() {
        return ACTINTLABHRS;
    }


    /**
     * Sets the ACTINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTINTLABHRS
     */
    public void setACTINTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ACTINTLABHRS) {
        this.ACTINTLABHRS = ACTINTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTINTLABHRS(int i) {
        return this.ACTINTLABHRS[i];
    }

    public void setACTINTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTINTLABHRS[i] = _value;
    }


    /**
     * Gets the ACTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTLABCOST() {
        return ACTLABCOST;
    }


    /**
     * Sets the ACTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTLABCOST
     */
    public void setACTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTLABCOST) {
        this.ACTLABCOST = ACTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTLABCOST(int i) {
        return this.ACTLABCOST[i];
    }

    public void setACTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTLABCOST[i] = _value;
    }


    /**
     * Gets the ACTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTLABHRS() {
        return ACTLABHRS;
    }


    /**
     * Sets the ACTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTLABHRS
     */
    public void setACTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ACTLABHRS) {
        this.ACTLABHRS = ACTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTLABHRS(int i) {
        return this.ACTLABHRS[i];
    }

    public void setACTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTLABHRS[i] = _value;
    }


    /**
     * Gets the ACTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTMATCOST() {
        return ACTMATCOST;
    }


    /**
     * Sets the ACTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTMATCOST
     */
    public void setACTMATCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTMATCOST) {
        this.ACTMATCOST = ACTMATCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTMATCOST(int i) {
        return this.ACTMATCOST[i];
    }

    public void setACTMATCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTMATCOST[i] = _value;
    }


    /**
     * Gets the ACTOUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTOUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTOUTLABCOST() {
        return ACTOUTLABCOST;
    }


    /**
     * Sets the ACTOUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTOUTLABCOST
     */
    public void setACTOUTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABCOST) {
        this.ACTOUTLABCOST = ACTOUTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTOUTLABCOST(int i) {
        return this.ACTOUTLABCOST[i];
    }

    public void setACTOUTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTOUTLABCOST[i] = _value;
    }


    /**
     * Gets the ACTOUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTOUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTOUTLABHRS() {
        return ACTOUTLABHRS;
    }


    /**
     * Sets the ACTOUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTOUTLABHRS
     */
    public void setACTOUTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ACTOUTLABHRS) {
        this.ACTOUTLABHRS = ACTOUTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTOUTLABHRS(int i) {
        return this.ACTOUTLABHRS[i];
    }

    public void setACTOUTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTOUTLABHRS[i] = _value;
    }


    /**
     * Gets the ACTSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTSERVCOST() {
        return ACTSERVCOST;
    }


    /**
     * Sets the ACTSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTSERVCOST
     */
    public void setACTSERVCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTSERVCOST) {
        this.ACTSERVCOST = ACTSERVCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTSERVCOST(int i) {
        return this.ACTSERVCOST[i];
    }

    public void setACTSERVCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTSERVCOST[i] = _value;
    }


    /**
     * Gets the ACTSTART value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTSTART
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getACTSTART() {
        return ACTSTART;
    }


    /**
     * Sets the ACTSTART value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTSTART
     */
    public void setACTSTART(com.ibm.www.maximo.MXDateTimeQueryType[] ACTSTART) {
        this.ACTSTART = ACTSTART;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getACTSTART(int i) {
        return this.ACTSTART[i];
    }

    public void setACTSTART(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.ACTSTART[i] = _value;
    }


    /**
     * Gets the ACTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ACTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getACTTOOLCOST() {
        return ACTTOOLCOST;
    }


    /**
     * Sets the ACTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ACTTOOLCOST
     */
    public void setACTTOOLCOST(com.ibm.www.maximo.MXDoubleQueryType[] ACTTOOLCOST) {
        this.ACTTOOLCOST = ACTTOOLCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getACTTOOLCOST(int i) {
        return this.ACTTOOLCOST[i];
    }

    public void setACTTOOLCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ACTTOOLCOST[i] = _value;
    }


    /**
     * Gets the AMCREW value for this MXWOQueryTypeWORKORDER.
     * 
     * @return AMCREW
     */
    public com.ibm.www.maximo.MXStringQueryType[] getAMCREW() {
        return AMCREW;
    }


    /**
     * Sets the AMCREW value for this MXWOQueryTypeWORKORDER.
     * 
     * @param AMCREW
     */
    public void setAMCREW(com.ibm.www.maximo.MXStringQueryType[] AMCREW) {
        this.AMCREW = AMCREW;
    }

    public com.ibm.www.maximo.MXStringQueryType getAMCREW(int i) {
        return this.AMCREW[i];
    }

    public void setAMCREW(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.AMCREW[i] = _value;
    }


    /**
     * Gets the AMS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return AMS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getAMS() {
        return AMS;
    }


    /**
     * Sets the AMS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param AMS
     */
    public void setAMS(com.ibm.www.maximo.MXBooleanQueryType[] AMS) {
        this.AMS = AMS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getAMS(int i) {
        return this.AMS[i];
    }

    public void setAMS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.AMS[i] = _value;
    }


    /**
     * Gets the AOS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return AOS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getAOS() {
        return AOS;
    }


    /**
     * Sets the AOS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param AOS
     */
    public void setAOS(com.ibm.www.maximo.MXBooleanQueryType[] AOS) {
        this.AOS = AOS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getAOS(int i) {
        return this.AOS[i];
    }

    public void setAOS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.AOS[i] = _value;
    }


    /**
     * Gets the APPTREQUIRED value for this MXWOQueryTypeWORKORDER.
     * 
     * @return APPTREQUIRED
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getAPPTREQUIRED() {
        return APPTREQUIRED;
    }


    /**
     * Sets the APPTREQUIRED value for this MXWOQueryTypeWORKORDER.
     * 
     * @param APPTREQUIRED
     */
    public void setAPPTREQUIRED(com.ibm.www.maximo.MXBooleanQueryType[] APPTREQUIRED) {
        this.APPTREQUIRED = APPTREQUIRED;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getAPPTREQUIRED(int i) {
        return this.APPTREQUIRED[i];
    }

    public void setAPPTREQUIRED(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.APPTREQUIRED[i] = _value;
    }


    /**
     * Gets the ASSETLOCPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ASSETLOCPRIORITY
     */
    public com.ibm.www.maximo.MXLongQueryType[] getASSETLOCPRIORITY() {
        return ASSETLOCPRIORITY;
    }


    /**
     * Sets the ASSETLOCPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ASSETLOCPRIORITY
     */
    public void setASSETLOCPRIORITY(com.ibm.www.maximo.MXLongQueryType[] ASSETLOCPRIORITY) {
        this.ASSETLOCPRIORITY = ASSETLOCPRIORITY;
    }

    public com.ibm.www.maximo.MXLongQueryType getASSETLOCPRIORITY(int i) {
        return this.ASSETLOCPRIORITY[i];
    }

    public void setASSETLOCPRIORITY(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.ASSETLOCPRIORITY[i] = _value;
    }


    /**
     * Gets the ASSETNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ASSETNUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getASSETNUM() {
        return ASSETNUM;
    }


    /**
     * Sets the ASSETNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ASSETNUM
     */
    public void setASSETNUM(com.ibm.www.maximo.MXStringQueryType[] ASSETNUM) {
        this.ASSETNUM = ASSETNUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getASSETNUM(int i) {
        return this.ASSETNUM[i];
    }

    public void setASSETNUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ASSETNUM[i] = _value;
    }


    /**
     * Gets the ASSIGNEDOWNERGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ASSIGNEDOWNERGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getASSIGNEDOWNERGROUP() {
        return ASSIGNEDOWNERGROUP;
    }


    /**
     * Sets the ASSIGNEDOWNERGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ASSIGNEDOWNERGROUP
     */
    public void setASSIGNEDOWNERGROUP(com.ibm.www.maximo.MXStringQueryType[] ASSIGNEDOWNERGROUP) {
        this.ASSIGNEDOWNERGROUP = ASSIGNEDOWNERGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getASSIGNEDOWNERGROUP(int i) {
        return this.ASSIGNEDOWNERGROUP[i];
    }

    public void setASSIGNEDOWNERGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ASSIGNEDOWNERGROUP[i] = _value;
    }


    /**
     * Gets the AVAILSTATUSDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return AVAILSTATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getAVAILSTATUSDATE() {
        return AVAILSTATUSDATE;
    }


    /**
     * Sets the AVAILSTATUSDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param AVAILSTATUSDATE
     */
    public void setAVAILSTATUSDATE(com.ibm.www.maximo.MXDateTimeQueryType[] AVAILSTATUSDATE) {
        this.AVAILSTATUSDATE = AVAILSTATUSDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getAVAILSTATUSDATE(int i) {
        return this.AVAILSTATUSDATE[i];
    }

    public void setAVAILSTATUSDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.AVAILSTATUSDATE[i] = _value;
    }


    /**
     * Gets the BACKOUTPLAN value for this MXWOQueryTypeWORKORDER.
     * 
     * @return BACKOUTPLAN
     */
    public com.ibm.www.maximo.MXStringQueryType[] getBACKOUTPLAN() {
        return BACKOUTPLAN;
    }


    /**
     * Sets the BACKOUTPLAN value for this MXWOQueryTypeWORKORDER.
     * 
     * @param BACKOUTPLAN
     */
    public void setBACKOUTPLAN(com.ibm.www.maximo.MXStringQueryType[] BACKOUTPLAN) {
        this.BACKOUTPLAN = BACKOUTPLAN;
    }

    public com.ibm.www.maximo.MXStringQueryType getBACKOUTPLAN(int i) {
        return this.BACKOUTPLAN[i];
    }

    public void setBACKOUTPLAN(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.BACKOUTPLAN[i] = _value;
    }


    /**
     * Gets the CALCCALENDAR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CALCCALENDAR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCALCCALENDAR() {
        return CALCCALENDAR;
    }


    /**
     * Sets the CALCCALENDAR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CALCCALENDAR
     */
    public void setCALCCALENDAR(com.ibm.www.maximo.MXStringQueryType[] CALCCALENDAR) {
        this.CALCCALENDAR = CALCCALENDAR;
    }

    public com.ibm.www.maximo.MXStringQueryType getCALCCALENDAR(int i) {
        return this.CALCCALENDAR[i];
    }

    public void setCALCCALENDAR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CALCCALENDAR[i] = _value;
    }


    /**
     * Gets the CALCORGID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CALCORGID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCALCORGID() {
        return CALCORGID;
    }


    /**
     * Sets the CALCORGID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CALCORGID
     */
    public void setCALCORGID(com.ibm.www.maximo.MXStringQueryType[] CALCORGID) {
        this.CALCORGID = CALCORGID;
    }

    public com.ibm.www.maximo.MXStringQueryType getCALCORGID(int i) {
        return this.CALCORGID[i];
    }

    public void setCALCORGID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CALCORGID[i] = _value;
    }


    /**
     * Gets the CALCPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CALCPRIORITY
     */
    public com.ibm.www.maximo.MXLongQueryType[] getCALCPRIORITY() {
        return CALCPRIORITY;
    }


    /**
     * Sets the CALCPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CALCPRIORITY
     */
    public void setCALCPRIORITY(com.ibm.www.maximo.MXLongQueryType[] CALCPRIORITY) {
        this.CALCPRIORITY = CALCPRIORITY;
    }

    public com.ibm.www.maximo.MXLongQueryType getCALCPRIORITY(int i) {
        return this.CALCPRIORITY[i];
    }

    public void setCALCPRIORITY(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.CALCPRIORITY[i] = _value;
    }


    /**
     * Gets the CALCSHIFT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CALCSHIFT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCALCSHIFT() {
        return CALCSHIFT;
    }


    /**
     * Sets the CALCSHIFT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CALCSHIFT
     */
    public void setCALCSHIFT(com.ibm.www.maximo.MXStringQueryType[] CALCSHIFT) {
        this.CALCSHIFT = CALCSHIFT;
    }

    public com.ibm.www.maximo.MXStringQueryType getCALCSHIFT(int i) {
        return this.CALCSHIFT[i];
    }

    public void setCALCSHIFT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CALCSHIFT[i] = _value;
    }


    /**
     * Gets the CALENDAR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CALENDAR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCALENDAR() {
        return CALENDAR;
    }


    /**
     * Sets the CALENDAR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CALENDAR
     */
    public void setCALENDAR(com.ibm.www.maximo.MXStringQueryType[] CALENDAR) {
        this.CALENDAR = CALENDAR;
    }

    public com.ibm.www.maximo.MXStringQueryType getCALENDAR(int i) {
        return this.CALENDAR[i];
    }

    public void setCALENDAR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CALENDAR[i] = _value;
    }


    /**
     * Gets the CHANGEBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CHANGEBY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCHANGEBY() {
        return CHANGEBY;
    }


    /**
     * Sets the CHANGEBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CHANGEBY
     */
    public void setCHANGEBY(com.ibm.www.maximo.MXStringQueryType[] CHANGEBY) {
        this.CHANGEBY = CHANGEBY;
    }

    public com.ibm.www.maximo.MXStringQueryType getCHANGEBY(int i) {
        return this.CHANGEBY[i];
    }

    public void setCHANGEBY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CHANGEBY[i] = _value;
    }


    /**
     * Gets the CHANGEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CHANGEDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getCHANGEDATE() {
        return CHANGEDATE;
    }


    /**
     * Sets the CHANGEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CHANGEDATE
     */
    public void setCHANGEDATE(com.ibm.www.maximo.MXDateTimeQueryType[] CHANGEDATE) {
        this.CHANGEDATE = CHANGEDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getCHANGEDATE(int i) {
        return this.CHANGEDATE[i];
    }

    public void setCHANGEDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.CHANGEDATE[i] = _value;
    }


    /**
     * Gets the CHARGESTORE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CHARGESTORE
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getCHARGESTORE() {
        return CHARGESTORE;
    }


    /**
     * Sets the CHARGESTORE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CHARGESTORE
     */
    public void setCHARGESTORE(com.ibm.www.maximo.MXBooleanQueryType[] CHARGESTORE) {
        this.CHARGESTORE = CHARGESTORE;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getCHARGESTORE(int i) {
        return this.CHARGESTORE[i];
    }

    public void setCHARGESTORE(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.CHARGESTORE[i] = _value;
    }


    /**
     * Gets the CINUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CINUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCINUM() {
        return CINUM;
    }


    /**
     * Sets the CINUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CINUM
     */
    public void setCINUM(com.ibm.www.maximo.MXStringQueryType[] CINUM) {
        this.CINUM = CINUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getCINUM(int i) {
        return this.CINUM[i];
    }

    public void setCINUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CINUM[i] = _value;
    }


    /**
     * Gets the CLASSSTRUCTUREID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CLASSSTRUCTUREID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCLASSSTRUCTUREID() {
        return CLASSSTRUCTUREID;
    }


    /**
     * Sets the CLASSSTRUCTUREID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CLASSSTRUCTUREID
     */
    public void setCLASSSTRUCTUREID(com.ibm.www.maximo.MXStringQueryType[] CLASSSTRUCTUREID) {
        this.CLASSSTRUCTUREID = CLASSSTRUCTUREID;
    }

    public com.ibm.www.maximo.MXStringQueryType getCLASSSTRUCTUREID(int i) {
        return this.CLASSSTRUCTUREID[i];
    }

    public void setCLASSSTRUCTUREID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CLASSSTRUCTUREID[i] = _value;
    }


    /**
     * Gets the COMMODITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return COMMODITY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCOMMODITY() {
        return COMMODITY;
    }


    /**
     * Sets the COMMODITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param COMMODITY
     */
    public void setCOMMODITY(com.ibm.www.maximo.MXStringQueryType[] COMMODITY) {
        this.COMMODITY = COMMODITY;
    }

    public com.ibm.www.maximo.MXStringQueryType getCOMMODITY(int i) {
        return this.COMMODITY[i];
    }

    public void setCOMMODITY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.COMMODITY[i] = _value;
    }


    /**
     * Gets the COMMODITYGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return COMMODITYGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCOMMODITYGROUP() {
        return COMMODITYGROUP;
    }


    /**
     * Sets the COMMODITYGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param COMMODITYGROUP
     */
    public void setCOMMODITYGROUP(com.ibm.www.maximo.MXStringQueryType[] COMMODITYGROUP) {
        this.COMMODITYGROUP = COMMODITYGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getCOMMODITYGROUP(int i) {
        return this.COMMODITYGROUP[i];
    }

    public void setCOMMODITYGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.COMMODITYGROUP[i] = _value;
    }


    /**
     * Gets the CONTRACT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CONTRACT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCONTRACT() {
        return CONTRACT;
    }


    /**
     * Sets the CONTRACT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CONTRACT
     */
    public void setCONTRACT(com.ibm.www.maximo.MXStringQueryType[] CONTRACT) {
        this.CONTRACT = CONTRACT;
    }

    public com.ibm.www.maximo.MXStringQueryType getCONTRACT(int i) {
        return this.CONTRACT[i];
    }

    public void setCONTRACT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CONTRACT[i] = _value;
    }


    /**
     * Gets the CREWID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CREWID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCREWID() {
        return CREWID;
    }


    /**
     * Sets the CREWID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CREWID
     */
    public void setCREWID(com.ibm.www.maximo.MXStringQueryType[] CREWID) {
        this.CREWID = CREWID;
    }

    public com.ibm.www.maximo.MXStringQueryType getCREWID(int i) {
        return this.CREWID[i];
    }

    public void setCREWID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CREWID[i] = _value;
    }


    /**
     * Gets the CREWWORKGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return CREWWORKGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getCREWWORKGROUP() {
        return CREWWORKGROUP;
    }


    /**
     * Sets the CREWWORKGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param CREWWORKGROUP
     */
    public void setCREWWORKGROUP(com.ibm.www.maximo.MXStringQueryType[] CREWWORKGROUP) {
        this.CREWWORKGROUP = CREWWORKGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getCREWWORKGROUP(int i) {
        return this.CREWWORKGROUP[i];
    }

    public void setCREWWORKGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.CREWWORKGROUP[i] = _value;
    }


    /**
     * Gets the DESCRIPTION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return DESCRIPTION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getDESCRIPTION() {
        return DESCRIPTION;
    }


    /**
     * Sets the DESCRIPTION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param DESCRIPTION
     */
    public void setDESCRIPTION(com.ibm.www.maximo.MXStringQueryType[] DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public com.ibm.www.maximo.MXStringQueryType getDESCRIPTION(int i) {
        return this.DESCRIPTION[i];
    }

    public void setDESCRIPTION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.DESCRIPTION[i] = _value;
    }


    /**
     * Gets the DIRISSUEMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return DIRISSUEMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getDIRISSUEMTLSTATUS() {
        return DIRISSUEMTLSTATUS;
    }


    /**
     * Sets the DIRISSUEMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param DIRISSUEMTLSTATUS
     */
    public void setDIRISSUEMTLSTATUS(com.ibm.www.maximo.MXDomainQueryType[] DIRISSUEMTLSTATUS) {
        this.DIRISSUEMTLSTATUS = DIRISSUEMTLSTATUS;
    }

    public com.ibm.www.maximo.MXDomainQueryType getDIRISSUEMTLSTATUS(int i) {
        return this.DIRISSUEMTLSTATUS[i];
    }

    public void setDIRISSUEMTLSTATUS(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.DIRISSUEMTLSTATUS[i] = _value;
    }


    /**
     * Gets the DISABLED value for this MXWOQueryTypeWORKORDER.
     * 
     * @return DISABLED
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getDISABLED() {
        return DISABLED;
    }


    /**
     * Sets the DISABLED value for this MXWOQueryTypeWORKORDER.
     * 
     * @param DISABLED
     */
    public void setDISABLED(com.ibm.www.maximo.MXBooleanQueryType[] DISABLED) {
        this.DISABLED = DISABLED;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getDISABLED(int i) {
        return this.DISABLED[i];
    }

    public void setDISABLED(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.DISABLED[i] = _value;
    }


    /**
     * Gets the DOWNTIME value for this MXWOQueryTypeWORKORDER.
     * 
     * @return DOWNTIME
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getDOWNTIME() {
        return DOWNTIME;
    }


    /**
     * Sets the DOWNTIME value for this MXWOQueryTypeWORKORDER.
     * 
     * @param DOWNTIME
     */
    public void setDOWNTIME(com.ibm.www.maximo.MXBooleanQueryType[] DOWNTIME) {
        this.DOWNTIME = DOWNTIME;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getDOWNTIME(int i) {
        return this.DOWNTIME[i];
    }

    public void setDOWNTIME(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.DOWNTIME[i] = _value;
    }


    /**
     * Gets the ENVIRONMENT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ENVIRONMENT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getENVIRONMENT() {
        return ENVIRONMENT;
    }


    /**
     * Sets the ENVIRONMENT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ENVIRONMENT
     */
    public void setENVIRONMENT(com.ibm.www.maximo.MXStringQueryType[] ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
    }

    public com.ibm.www.maximo.MXStringQueryType getENVIRONMENT(int i) {
        return this.ENVIRONMENT[i];
    }

    public void setENVIRONMENT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ENVIRONMENT[i] = _value;
    }


    /**
     * Gets the ESTATAPPRINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRINTLABCOST() {
        return ESTATAPPRINTLABCOST;
    }


    /**
     * Sets the ESTATAPPRINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRINTLABCOST
     */
    public void setESTATAPPRINTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABCOST) {
        this.ESTATAPPRINTLABCOST = ESTATAPPRINTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRINTLABCOST(int i) {
        return this.ESTATAPPRINTLABCOST[i];
    }

    public void setESTATAPPRINTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRINTLABCOST[i] = _value;
    }


    /**
     * Gets the ESTATAPPRINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRINTLABHRS() {
        return ESTATAPPRINTLABHRS;
    }


    /**
     * Sets the ESTATAPPRINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRINTLABHRS
     */
    public void setESTATAPPRINTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRINTLABHRS) {
        this.ESTATAPPRINTLABHRS = ESTATAPPRINTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRINTLABHRS(int i) {
        return this.ESTATAPPRINTLABHRS[i];
    }

    public void setESTATAPPRINTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRINTLABHRS[i] = _value;
    }


    /**
     * Gets the ESTATAPPRLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRLABCOST() {
        return ESTATAPPRLABCOST;
    }


    /**
     * Sets the ESTATAPPRLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRLABCOST
     */
    public void setESTATAPPRLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABCOST) {
        this.ESTATAPPRLABCOST = ESTATAPPRLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRLABCOST(int i) {
        return this.ESTATAPPRLABCOST[i];
    }

    public void setESTATAPPRLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRLABCOST[i] = _value;
    }


    /**
     * Gets the ESTATAPPRLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRLABHRS() {
        return ESTATAPPRLABHRS;
    }


    /**
     * Sets the ESTATAPPRLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRLABHRS
     */
    public void setESTATAPPRLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRLABHRS) {
        this.ESTATAPPRLABHRS = ESTATAPPRLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRLABHRS(int i) {
        return this.ESTATAPPRLABHRS[i];
    }

    public void setESTATAPPRLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRLABHRS[i] = _value;
    }


    /**
     * Gets the ESTATAPPRMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRMATCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRMATCOST() {
        return ESTATAPPRMATCOST;
    }


    /**
     * Sets the ESTATAPPRMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRMATCOST
     */
    public void setESTATAPPRMATCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRMATCOST) {
        this.ESTATAPPRMATCOST = ESTATAPPRMATCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRMATCOST(int i) {
        return this.ESTATAPPRMATCOST[i];
    }

    public void setESTATAPPRMATCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRMATCOST[i] = _value;
    }


    /**
     * Gets the ESTATAPPROUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPROUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPROUTLABCOST() {
        return ESTATAPPROUTLABCOST;
    }


    /**
     * Sets the ESTATAPPROUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPROUTLABCOST
     */
    public void setESTATAPPROUTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABCOST) {
        this.ESTATAPPROUTLABCOST = ESTATAPPROUTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPROUTLABCOST(int i) {
        return this.ESTATAPPROUTLABCOST[i];
    }

    public void setESTATAPPROUTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPROUTLABCOST[i] = _value;
    }


    /**
     * Gets the ESTATAPPROUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPROUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPROUTLABHRS() {
        return ESTATAPPROUTLABHRS;
    }


    /**
     * Sets the ESTATAPPROUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPROUTLABHRS
     */
    public void setESTATAPPROUTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPROUTLABHRS) {
        this.ESTATAPPROUTLABHRS = ESTATAPPROUTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPROUTLABHRS(int i) {
        return this.ESTATAPPROUTLABHRS[i];
    }

    public void setESTATAPPROUTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPROUTLABHRS[i] = _value;
    }


    /**
     * Gets the ESTATAPPRSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRSERVCOST() {
        return ESTATAPPRSERVCOST;
    }


    /**
     * Sets the ESTATAPPRSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRSERVCOST
     */
    public void setESTATAPPRSERVCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRSERVCOST) {
        this.ESTATAPPRSERVCOST = ESTATAPPRSERVCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRSERVCOST(int i) {
        return this.ESTATAPPRSERVCOST[i];
    }

    public void setESTATAPPRSERVCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRSERVCOST[i] = _value;
    }


    /**
     * Gets the ESTATAPPRTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTATAPPRTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTATAPPRTOOLCOST() {
        return ESTATAPPRTOOLCOST;
    }


    /**
     * Sets the ESTATAPPRTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTATAPPRTOOLCOST
     */
    public void setESTATAPPRTOOLCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTATAPPRTOOLCOST) {
        this.ESTATAPPRTOOLCOST = ESTATAPPRTOOLCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTATAPPRTOOLCOST(int i) {
        return this.ESTATAPPRTOOLCOST[i];
    }

    public void setESTATAPPRTOOLCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTATAPPRTOOLCOST[i] = _value;
    }


    /**
     * Gets the ESTDUR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTDUR
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTDUR() {
        return ESTDUR;
    }


    /**
     * Sets the ESTDUR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTDUR
     */
    public void setESTDUR(com.ibm.www.maximo.MXDoubleQueryType[] ESTDUR) {
        this.ESTDUR = ESTDUR;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTDUR(int i) {
        return this.ESTDUR[i];
    }

    public void setESTDUR(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTDUR[i] = _value;
    }


    /**
     * Gets the ESTINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTINTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTINTLABCOST() {
        return ESTINTLABCOST;
    }


    /**
     * Sets the ESTINTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTINTLABCOST
     */
    public void setESTINTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABCOST) {
        this.ESTINTLABCOST = ESTINTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTINTLABCOST(int i) {
        return this.ESTINTLABCOST[i];
    }

    public void setESTINTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTINTLABCOST[i] = _value;
    }


    /**
     * Gets the ESTINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTINTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTINTLABHRS() {
        return ESTINTLABHRS;
    }


    /**
     * Sets the ESTINTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTINTLABHRS
     */
    public void setESTINTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTINTLABHRS) {
        this.ESTINTLABHRS = ESTINTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTINTLABHRS(int i) {
        return this.ESTINTLABHRS[i];
    }

    public void setESTINTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTINTLABHRS[i] = _value;
    }


    /**
     * Gets the ESTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTLABCOST() {
        return ESTLABCOST;
    }


    /**
     * Sets the ESTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTLABCOST
     */
    public void setESTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTLABCOST) {
        this.ESTLABCOST = ESTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTLABCOST(int i) {
        return this.ESTLABCOST[i];
    }

    public void setESTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTLABCOST[i] = _value;
    }


    /**
     * Gets the ESTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTLABHRS() {
        return ESTLABHRS;
    }


    /**
     * Sets the ESTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTLABHRS
     */
    public void setESTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTLABHRS) {
        this.ESTLABHRS = ESTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTLABHRS(int i) {
        return this.ESTLABHRS[i];
    }

    public void setESTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTLABHRS[i] = _value;
    }


    /**
     * Gets the ESTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTMATCOST() {
        return ESTMATCOST;
    }


    /**
     * Sets the ESTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTMATCOST
     */
    public void setESTMATCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTMATCOST) {
        this.ESTMATCOST = ESTMATCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTMATCOST(int i) {
        return this.ESTMATCOST[i];
    }

    public void setESTMATCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTMATCOST[i] = _value;
    }


    /**
     * Gets the ESTOUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTOUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTOUTLABCOST() {
        return ESTOUTLABCOST;
    }


    /**
     * Sets the ESTOUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTOUTLABCOST
     */
    public void setESTOUTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABCOST) {
        this.ESTOUTLABCOST = ESTOUTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTOUTLABCOST(int i) {
        return this.ESTOUTLABCOST[i];
    }

    public void setESTOUTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTOUTLABCOST[i] = _value;
    }


    /**
     * Gets the ESTOUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTOUTLABHRS
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTOUTLABHRS() {
        return ESTOUTLABHRS;
    }


    /**
     * Sets the ESTOUTLABHRS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTOUTLABHRS
     */
    public void setESTOUTLABHRS(com.ibm.www.maximo.MXDoubleQueryType[] ESTOUTLABHRS) {
        this.ESTOUTLABHRS = ESTOUTLABHRS;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTOUTLABHRS(int i) {
        return this.ESTOUTLABHRS[i];
    }

    public void setESTOUTLABHRS(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTOUTLABHRS[i] = _value;
    }


    /**
     * Gets the ESTSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTSERVCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTSERVCOST() {
        return ESTSERVCOST;
    }


    /**
     * Sets the ESTSERVCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTSERVCOST
     */
    public void setESTSERVCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTSERVCOST) {
        this.ESTSERVCOST = ESTSERVCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTSERVCOST(int i) {
        return this.ESTSERVCOST[i];
    }

    public void setESTSERVCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTSERVCOST[i] = _value;
    }


    /**
     * Gets the ESTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ESTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getESTTOOLCOST() {
        return ESTTOOLCOST;
    }


    /**
     * Sets the ESTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ESTTOOLCOST
     */
    public void setESTTOOLCOST(com.ibm.www.maximo.MXDoubleQueryType[] ESTTOOLCOST) {
        this.ESTTOOLCOST = ESTTOOLCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getESTTOOLCOST(int i) {
        return this.ESTTOOLCOST[i];
    }

    public void setESTTOOLCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.ESTTOOLCOST[i] = _value;
    }


    /**
     * Gets the EXTERNALREFID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return EXTERNALREFID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getEXTERNALREFID() {
        return EXTERNALREFID;
    }


    /**
     * Sets the EXTERNALREFID value for this MXWOQueryTypeWORKORDER.
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
     * Gets the FAILDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FAILDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getFAILDATE() {
        return FAILDATE;
    }


    /**
     * Sets the FAILDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FAILDATE
     */
    public void setFAILDATE(com.ibm.www.maximo.MXDateTimeQueryType[] FAILDATE) {
        this.FAILDATE = FAILDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getFAILDATE(int i) {
        return this.FAILDATE[i];
    }

    public void setFAILDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.FAILDATE[i] = _value;
    }


    /**
     * Gets the FAILURECODE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FAILURECODE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getFAILURECODE() {
        return FAILURECODE;
    }


    /**
     * Sets the FAILURECODE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FAILURECODE
     */
    public void setFAILURECODE(com.ibm.www.maximo.MXStringQueryType[] FAILURECODE) {
        this.FAILURECODE = FAILURECODE;
    }

    public com.ibm.www.maximo.MXStringQueryType getFAILURECODE(int i) {
        return this.FAILURECODE[i];
    }

    public void setFAILURECODE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.FAILURECODE[i] = _value;
    }


    /**
     * Gets the FINCNTRLID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FINCNTRLID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getFINCNTRLID() {
        return FINCNTRLID;
    }


    /**
     * Sets the FINCNTRLID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FINCNTRLID
     */
    public void setFINCNTRLID(com.ibm.www.maximo.MXStringQueryType[] FINCNTRLID) {
        this.FINCNTRLID = FINCNTRLID;
    }

    public com.ibm.www.maximo.MXStringQueryType getFINCNTRLID(int i) {
        return this.FINCNTRLID[i];
    }

    public void setFINCNTRLID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.FINCNTRLID[i] = _value;
    }


    /**
     * Gets the FIRSTAPPRSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FIRSTAPPRSTATUS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getFIRSTAPPRSTATUS() {
        return FIRSTAPPRSTATUS;
    }


    /**
     * Sets the FIRSTAPPRSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FIRSTAPPRSTATUS
     */
    public void setFIRSTAPPRSTATUS(com.ibm.www.maximo.MXStringQueryType[] FIRSTAPPRSTATUS) {
        this.FIRSTAPPRSTATUS = FIRSTAPPRSTATUS;
    }

    public com.ibm.www.maximo.MXStringQueryType getFIRSTAPPRSTATUS(int i) {
        return this.FIRSTAPPRSTATUS[i];
    }

    public void setFIRSTAPPRSTATUS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.FIRSTAPPRSTATUS[i] = _value;
    }


    /**
     * Gets the FLOWACTION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FLOWACTION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getFLOWACTION() {
        return FLOWACTION;
    }


    /**
     * Sets the FLOWACTION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FLOWACTION
     */
    public void setFLOWACTION(com.ibm.www.maximo.MXStringQueryType[] FLOWACTION) {
        this.FLOWACTION = FLOWACTION;
    }

    public com.ibm.www.maximo.MXStringQueryType getFLOWACTION(int i) {
        return this.FLOWACTION[i];
    }

    public void setFLOWACTION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.FLOWACTION[i] = _value;
    }


    /**
     * Gets the FLOWACTIONASSIST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FLOWACTIONASSIST
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getFLOWACTIONASSIST() {
        return FLOWACTIONASSIST;
    }


    /**
     * Sets the FLOWACTIONASSIST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FLOWACTIONASSIST
     */
    public void setFLOWACTIONASSIST(com.ibm.www.maximo.MXBooleanQueryType[] FLOWACTIONASSIST) {
        this.FLOWACTIONASSIST = FLOWACTIONASSIST;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getFLOWACTIONASSIST(int i) {
        return this.FLOWACTIONASSIST[i];
    }

    public void setFLOWACTIONASSIST(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.FLOWACTIONASSIST[i] = _value;
    }


    /**
     * Gets the FLOWCONTROLLED value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FLOWCONTROLLED
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getFLOWCONTROLLED() {
        return FLOWCONTROLLED;
    }


    /**
     * Sets the FLOWCONTROLLED value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FLOWCONTROLLED
     */
    public void setFLOWCONTROLLED(com.ibm.www.maximo.MXBooleanQueryType[] FLOWCONTROLLED) {
        this.FLOWCONTROLLED = FLOWCONTROLLED;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getFLOWCONTROLLED(int i) {
        return this.FLOWCONTROLLED[i];
    }

    public void setFLOWCONTROLLED(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.FLOWCONTROLLED[i] = _value;
    }


    /**
     * Gets the FNLCONSTRAINT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return FNLCONSTRAINT
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getFNLCONSTRAINT() {
        return FNLCONSTRAINT;
    }


    /**
     * Sets the FNLCONSTRAINT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param FNLCONSTRAINT
     */
    public void setFNLCONSTRAINT(com.ibm.www.maximo.MXDateTimeQueryType[] FNLCONSTRAINT) {
        this.FNLCONSTRAINT = FNLCONSTRAINT;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getFNLCONSTRAINT(int i) {
        return this.FNLCONSTRAINT[i];
    }

    public void setFNLCONSTRAINT(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.FNLCONSTRAINT[i] = _value;
    }


    /**
     * Gets the GENERATEDFORPO value for this MXWOQueryTypeWORKORDER.
     * 
     * @return GENERATEDFORPO
     */
    public com.ibm.www.maximo.MXStringQueryType[] getGENERATEDFORPO() {
        return GENERATEDFORPO;
    }


    /**
     * Sets the GENERATEDFORPO value for this MXWOQueryTypeWORKORDER.
     * 
     * @param GENERATEDFORPO
     */
    public void setGENERATEDFORPO(com.ibm.www.maximo.MXStringQueryType[] GENERATEDFORPO) {
        this.GENERATEDFORPO = GENERATEDFORPO;
    }

    public com.ibm.www.maximo.MXStringQueryType getGENERATEDFORPO(int i) {
        return this.GENERATEDFORPO[i];
    }

    public void setGENERATEDFORPO(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.GENERATEDFORPO[i] = _value;
    }


    /**
     * Gets the GENFORPOLINEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return GENFORPOLINEID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getGENFORPOLINEID() {
        return GENFORPOLINEID;
    }


    /**
     * Sets the GENFORPOLINEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param GENFORPOLINEID
     */
    public void setGENFORPOLINEID(com.ibm.www.maximo.MXLongQueryType[] GENFORPOLINEID) {
        this.GENFORPOLINEID = GENFORPOLINEID;
    }

    public com.ibm.www.maximo.MXLongQueryType getGENFORPOLINEID(int i) {
        return this.GENFORPOLINEID[i];
    }

    public void setGENFORPOLINEID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.GENFORPOLINEID[i] = _value;
    }


    /**
     * Gets the GENFORPOREVISION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return GENFORPOREVISION
     */
    public com.ibm.www.maximo.MXLongQueryType[] getGENFORPOREVISION() {
        return GENFORPOREVISION;
    }


    /**
     * Sets the GENFORPOREVISION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param GENFORPOREVISION
     */
    public void setGENFORPOREVISION(com.ibm.www.maximo.MXLongQueryType[] GENFORPOREVISION) {
        this.GENFORPOREVISION = GENFORPOREVISION;
    }

    public com.ibm.www.maximo.MXLongQueryType getGENFORPOREVISION(int i) {
        return this.GENFORPOREVISION[i];
    }

    public void setGENFORPOREVISION(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.GENFORPOREVISION[i] = _value;
    }


    /**
     * Gets the GLACCOUNT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return GLACCOUNT
     */
    public com.ibm.www.maximo.MXGLAccountQueryType[] getGLACCOUNT() {
        return GLACCOUNT;
    }


    /**
     * Sets the GLACCOUNT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param GLACCOUNT
     */
    public void setGLACCOUNT(com.ibm.www.maximo.MXGLAccountQueryType[] GLACCOUNT) {
        this.GLACCOUNT = GLACCOUNT;
    }

    public com.ibm.www.maximo.MXGLAccountQueryType getGLACCOUNT(int i) {
        return this.GLACCOUNT[i];
    }

    public void setGLACCOUNT(int i, com.ibm.www.maximo.MXGLAccountQueryType _value) {
        this.GLACCOUNT[i] = _value;
    }


    /**
     * Gets the HASCHILDREN value for this MXWOQueryTypeWORKORDER.
     * 
     * @return HASCHILDREN
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getHASCHILDREN() {
        return HASCHILDREN;
    }


    /**
     * Sets the HASCHILDREN value for this MXWOQueryTypeWORKORDER.
     * 
     * @param HASCHILDREN
     */
    public void setHASCHILDREN(com.ibm.www.maximo.MXBooleanQueryType[] HASCHILDREN) {
        this.HASCHILDREN = HASCHILDREN;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getHASCHILDREN(int i) {
        return this.HASCHILDREN[i];
    }

    public void setHASCHILDREN(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.HASCHILDREN[i] = _value;
    }


    /**
     * Gets the HASFOLLOWUPWORK value for this MXWOQueryTypeWORKORDER.
     * 
     * @return HASFOLLOWUPWORK
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getHASFOLLOWUPWORK() {
        return HASFOLLOWUPWORK;
    }


    /**
     * Sets the HASFOLLOWUPWORK value for this MXWOQueryTypeWORKORDER.
     * 
     * @param HASFOLLOWUPWORK
     */
    public void setHASFOLLOWUPWORK(com.ibm.www.maximo.MXBooleanQueryType[] HASFOLLOWUPWORK) {
        this.HASFOLLOWUPWORK = HASFOLLOWUPWORK;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getHASFOLLOWUPWORK(int i) {
        return this.HASFOLLOWUPWORK[i];
    }

    public void setHASFOLLOWUPWORK(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.HASFOLLOWUPWORK[i] = _value;
    }


    /**
     * Gets the HISTORYFLAG value for this MXWOQueryTypeWORKORDER.
     * 
     * @return HISTORYFLAG
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getHISTORYFLAG() {
        return HISTORYFLAG;
    }


    /**
     * Sets the HISTORYFLAG value for this MXWOQueryTypeWORKORDER.
     * 
     * @param HISTORYFLAG
     */
    public void setHISTORYFLAG(com.ibm.www.maximo.MXBooleanQueryType[] HISTORYFLAG) {
        this.HISTORYFLAG = HISTORYFLAG;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getHISTORYFLAG(int i) {
        return this.HISTORYFLAG[i];
    }

    public void setHISTORYFLAG(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.HISTORYFLAG[i] = _value;
    }


    /**
     * Gets the IGNOREDIAVAIL value for this MXWOQueryTypeWORKORDER.
     * 
     * @return IGNOREDIAVAIL
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getIGNOREDIAVAIL() {
        return IGNOREDIAVAIL;
    }


    /**
     * Sets the IGNOREDIAVAIL value for this MXWOQueryTypeWORKORDER.
     * 
     * @param IGNOREDIAVAIL
     */
    public void setIGNOREDIAVAIL(com.ibm.www.maximo.MXBooleanQueryType[] IGNOREDIAVAIL) {
        this.IGNOREDIAVAIL = IGNOREDIAVAIL;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getIGNOREDIAVAIL(int i) {
        return this.IGNOREDIAVAIL[i];
    }

    public void setIGNOREDIAVAIL(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.IGNOREDIAVAIL[i] = _value;
    }


    /**
     * Gets the IGNORESRMAVAIL value for this MXWOQueryTypeWORKORDER.
     * 
     * @return IGNORESRMAVAIL
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getIGNORESRMAVAIL() {
        return IGNORESRMAVAIL;
    }


    /**
     * Sets the IGNORESRMAVAIL value for this MXWOQueryTypeWORKORDER.
     * 
     * @param IGNORESRMAVAIL
     */
    public void setIGNORESRMAVAIL(com.ibm.www.maximo.MXBooleanQueryType[] IGNORESRMAVAIL) {
        this.IGNORESRMAVAIL = IGNORESRMAVAIL;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getIGNORESRMAVAIL(int i) {
        return this.IGNORESRMAVAIL[i];
    }

    public void setIGNORESRMAVAIL(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.IGNORESRMAVAIL[i] = _value;
    }


    /**
     * Gets the INCTASKSINSCHED value for this MXWOQueryTypeWORKORDER.
     * 
     * @return INCTASKSINSCHED
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getINCTASKSINSCHED() {
        return INCTASKSINSCHED;
    }


    /**
     * Sets the INCTASKSINSCHED value for this MXWOQueryTypeWORKORDER.
     * 
     * @param INCTASKSINSCHED
     */
    public void setINCTASKSINSCHED(com.ibm.www.maximo.MXBooleanQueryType[] INCTASKSINSCHED) {
        this.INCTASKSINSCHED = INCTASKSINSCHED;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getINCTASKSINSCHED(int i) {
        return this.INCTASKSINSCHED[i];
    }

    public void setINCTASKSINSCHED(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.INCTASKSINSCHED[i] = _value;
    }


    /**
     * Gets the INSPECTOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return INSPECTOR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getINSPECTOR() {
        return INSPECTOR;
    }


    /**
     * Sets the INSPECTOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param INSPECTOR
     */
    public void setINSPECTOR(com.ibm.www.maximo.MXStringQueryType[] INSPECTOR) {
        this.INSPECTOR = INSPECTOR;
    }

    public com.ibm.www.maximo.MXStringQueryType getINSPECTOR(int i) {
        return this.INSPECTOR[i];
    }

    public void setINSPECTOR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.INSPECTOR[i] = _value;
    }


    /**
     * Gets the INTERRUPTIBLE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return INTERRUPTIBLE
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getINTERRUPTIBLE() {
        return INTERRUPTIBLE;
    }


    /**
     * Sets the INTERRUPTIBLE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param INTERRUPTIBLE
     */
    public void setINTERRUPTIBLE(com.ibm.www.maximo.MXBooleanQueryType[] INTERRUPTIBLE) {
        this.INTERRUPTIBLE = INTERRUPTIBLE;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getINTERRUPTIBLE(int i) {
        return this.INTERRUPTIBLE[i];
    }

    public void setINTERRUPTIBLE(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.INTERRUPTIBLE[i] = _value;
    }


    /**
     * Gets the ISTASK value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ISTASK
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getISTASK() {
        return ISTASK;
    }


    /**
     * Sets the ISTASK value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ISTASK
     */
    public void setISTASK(com.ibm.www.maximo.MXBooleanQueryType[] ISTASK) {
        this.ISTASK = ISTASK;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getISTASK(int i) {
        return this.ISTASK[i];
    }

    public void setISTASK(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.ISTASK[i] = _value;
    }


    /**
     * Gets the JOBTASKID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return JOBTASKID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getJOBTASKID() {
        return JOBTASKID;
    }


    /**
     * Sets the JOBTASKID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param JOBTASKID
     */
    public void setJOBTASKID(com.ibm.www.maximo.MXLongQueryType[] JOBTASKID) {
        this.JOBTASKID = JOBTASKID;
    }

    public com.ibm.www.maximo.MXLongQueryType getJOBTASKID(int i) {
        return this.JOBTASKID[i];
    }

    public void setJOBTASKID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.JOBTASKID[i] = _value;
    }


    /**
     * Gets the JPNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return JPNUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getJPNUM() {
        return JPNUM;
    }


    /**
     * Sets the JPNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param JPNUM
     */
    public void setJPNUM(com.ibm.www.maximo.MXStringQueryType[] JPNUM) {
        this.JPNUM = JPNUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getJPNUM(int i) {
        return this.JPNUM[i];
    }

    public void setJPNUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.JPNUM[i] = _value;
    }


    /**
     * Gets the JUSTIFYPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return JUSTIFYPRIORITY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getJUSTIFYPRIORITY() {
        return JUSTIFYPRIORITY;
    }


    /**
     * Sets the JUSTIFYPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param JUSTIFYPRIORITY
     */
    public void setJUSTIFYPRIORITY(com.ibm.www.maximo.MXStringQueryType[] JUSTIFYPRIORITY) {
        this.JUSTIFYPRIORITY = JUSTIFYPRIORITY;
    }

    public com.ibm.www.maximo.MXStringQueryType getJUSTIFYPRIORITY(int i) {
        return this.JUSTIFYPRIORITY[i];
    }

    public void setJUSTIFYPRIORITY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.JUSTIFYPRIORITY[i] = _value;
    }


    /**
     * Gets the LASTCOPYLINKDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LASTCOPYLINKDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getLASTCOPYLINKDATE() {
        return LASTCOPYLINKDATE;
    }


    /**
     * Sets the LASTCOPYLINKDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param LASTCOPYLINKDATE
     */
    public void setLASTCOPYLINKDATE(com.ibm.www.maximo.MXDateTimeQueryType[] LASTCOPYLINKDATE) {
        this.LASTCOPYLINKDATE = LASTCOPYLINKDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getLASTCOPYLINKDATE(int i) {
        return this.LASTCOPYLINKDATE[i];
    }

    public void setLASTCOPYLINKDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.LASTCOPYLINKDATE[i] = _value;
    }


    /**
     * Gets the LAUNCHENTRYNAME value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LAUNCHENTRYNAME
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLAUNCHENTRYNAME() {
        return LAUNCHENTRYNAME;
    }


    /**
     * Sets the LAUNCHENTRYNAME value for this MXWOQueryTypeWORKORDER.
     * 
     * @param LAUNCHENTRYNAME
     */
    public void setLAUNCHENTRYNAME(com.ibm.www.maximo.MXStringQueryType[] LAUNCHENTRYNAME) {
        this.LAUNCHENTRYNAME = LAUNCHENTRYNAME;
    }

    public com.ibm.www.maximo.MXStringQueryType getLAUNCHENTRYNAME(int i) {
        return this.LAUNCHENTRYNAME[i];
    }

    public void setLAUNCHENTRYNAME(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LAUNCHENTRYNAME[i] = _value;
    }


    /**
     * Gets the LEAD value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LEAD
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLEAD() {
        return LEAD;
    }


    /**
     * Sets the LEAD value for this MXWOQueryTypeWORKORDER.
     * 
     * @param LEAD
     */
    public void setLEAD(com.ibm.www.maximo.MXStringQueryType[] LEAD) {
        this.LEAD = LEAD;
    }

    public com.ibm.www.maximo.MXStringQueryType getLEAD(int i) {
        return this.LEAD[i];
    }

    public void setLEAD(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.LEAD[i] = _value;
    }


    /**
     * Gets the LMS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LMS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getLMS() {
        return LMS;
    }


    /**
     * Sets the LMS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param LMS
     */
    public void setLMS(com.ibm.www.maximo.MXBooleanQueryType[] LMS) {
        this.LMS = LMS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getLMS(int i) {
        return this.LMS[i];
    }

    public void setLMS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.LMS[i] = _value;
    }


    /**
     * Gets the LOCATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LOCATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getLOCATION() {
        return LOCATION;
    }


    /**
     * Sets the LOCATION value for this MXWOQueryTypeWORKORDER.
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
     * Gets the LOS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return LOS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getLOS() {
        return LOS;
    }


    /**
     * Sets the LOS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param LOS
     */
    public void setLOS(com.ibm.www.maximo.MXBooleanQueryType[] LOS) {
        this.LOS = LOS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getLOS(int i) {
        return this.LOS[i];
    }

    public void setLOS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.LOS[i] = _value;
    }


    /**
     * Gets the MEASUREDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return MEASUREDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getMEASUREDATE() {
        return MEASUREDATE;
    }


    /**
     * Sets the MEASUREDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param MEASUREDATE
     */
    public void setMEASUREDATE(com.ibm.www.maximo.MXDateTimeQueryType[] MEASUREDATE) {
        this.MEASUREDATE = MEASUREDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getMEASUREDATE(int i) {
        return this.MEASUREDATE[i];
    }

    public void setMEASUREDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.MEASUREDATE[i] = _value;
    }


    /**
     * Gets the MEASUREMENTVALUE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return MEASUREMENTVALUE
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getMEASUREMENTVALUE() {
        return MEASUREMENTVALUE;
    }


    /**
     * Sets the MEASUREMENTVALUE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param MEASUREMENTVALUE
     */
    public void setMEASUREMENTVALUE(com.ibm.www.maximo.MXDoubleQueryType[] MEASUREMENTVALUE) {
        this.MEASUREMENTVALUE = MEASUREMENTVALUE;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getMEASUREMENTVALUE(int i) {
        return this.MEASUREMENTVALUE[i];
    }

    public void setMEASUREMENTVALUE(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.MEASUREMENTVALUE[i] = _value;
    }


    /**
     * Gets the NESTEDJPINPROCESS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return NESTEDJPINPROCESS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getNESTEDJPINPROCESS() {
        return NESTEDJPINPROCESS;
    }


    /**
     * Sets the NESTEDJPINPROCESS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param NESTEDJPINPROCESS
     */
    public void setNESTEDJPINPROCESS(com.ibm.www.maximo.MXBooleanQueryType[] NESTEDJPINPROCESS) {
        this.NESTEDJPINPROCESS = NESTEDJPINPROCESS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getNESTEDJPINPROCESS(int i) {
        return this.NESTEDJPINPROCESS[i];
    }

    public void setNESTEDJPINPROCESS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.NESTEDJPINPROCESS[i] = _value;
    }


    /**
     * Gets the NEWCHILDCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return NEWCHILDCLASS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getNEWCHILDCLASS() {
        return NEWCHILDCLASS;
    }


    /**
     * Sets the NEWCHILDCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param NEWCHILDCLASS
     */
    public void setNEWCHILDCLASS(com.ibm.www.maximo.MXStringQueryType[] NEWCHILDCLASS) {
        this.NEWCHILDCLASS = NEWCHILDCLASS;
    }

    public com.ibm.www.maximo.MXStringQueryType getNEWCHILDCLASS(int i) {
        return this.NEWCHILDCLASS[i];
    }

    public void setNEWCHILDCLASS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.NEWCHILDCLASS[i] = _value;
    }


    /**
     * Gets the OBSERVATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OBSERVATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOBSERVATION() {
        return OBSERVATION;
    }


    /**
     * Sets the OBSERVATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param OBSERVATION
     */
    public void setOBSERVATION(com.ibm.www.maximo.MXStringQueryType[] OBSERVATION) {
        this.OBSERVATION = OBSERVATION;
    }

    public com.ibm.www.maximo.MXStringQueryType getOBSERVATION(int i) {
        return this.OBSERVATION[i];
    }

    public void setOBSERVATION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.OBSERVATION[i] = _value;
    }


    /**
     * Gets the ONBEHALFOF value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ONBEHALFOF
     */
    public com.ibm.www.maximo.MXStringQueryType[] getONBEHALFOF() {
        return ONBEHALFOF;
    }


    /**
     * Sets the ONBEHALFOF value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ONBEHALFOF
     */
    public void setONBEHALFOF(com.ibm.www.maximo.MXStringQueryType[] ONBEHALFOF) {
        this.ONBEHALFOF = ONBEHALFOF;
    }

    public com.ibm.www.maximo.MXStringQueryType getONBEHALFOF(int i) {
        return this.ONBEHALFOF[i];
    }

    public void setONBEHALFOF(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ONBEHALFOF[i] = _value;
    }


    /**
     * Gets the ORGID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ORGID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getORGID() {
        return ORGID;
    }


    /**
     * Sets the ORGID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ORGID
     */
    public void setORGID(com.ibm.www.maximo.MXStringQueryType[] ORGID) {
        this.ORGID = ORGID;
    }

    public com.ibm.www.maximo.MXStringQueryType getORGID(int i) {
        return this.ORGID[i];
    }

    public void setORGID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ORGID[i] = _value;
    }


    /**
     * Gets the ORIGRECORDCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ORIGRECORDCLASS
     */
    public com.ibm.www.maximo.MXStringQueryType[] getORIGRECORDCLASS() {
        return ORIGRECORDCLASS;
    }


    /**
     * Sets the ORIGRECORDCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ORIGRECORDCLASS
     */
    public void setORIGRECORDCLASS(com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDCLASS) {
        this.ORIGRECORDCLASS = ORIGRECORDCLASS;
    }

    public com.ibm.www.maximo.MXStringQueryType getORIGRECORDCLASS(int i) {
        return this.ORIGRECORDCLASS[i];
    }

    public void setORIGRECORDCLASS(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ORIGRECORDCLASS[i] = _value;
    }


    /**
     * Gets the ORIGRECORDID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ORIGRECORDID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getORIGRECORDID() {
        return ORIGRECORDID;
    }


    /**
     * Sets the ORIGRECORDID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ORIGRECORDID
     */
    public void setORIGRECORDID(com.ibm.www.maximo.MXStringQueryType[] ORIGRECORDID) {
        this.ORIGRECORDID = ORIGRECORDID;
    }

    public com.ibm.www.maximo.MXStringQueryType getORIGRECORDID(int i) {
        return this.ORIGRECORDID[i];
    }

    public void setORIGRECORDID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ORIGRECORDID[i] = _value;
    }


    /**
     * Gets the OUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OUTLABCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getOUTLABCOST() {
        return OUTLABCOST;
    }


    /**
     * Sets the OUTLABCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param OUTLABCOST
     */
    public void setOUTLABCOST(com.ibm.www.maximo.MXDoubleQueryType[] OUTLABCOST) {
        this.OUTLABCOST = OUTLABCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getOUTLABCOST(int i) {
        return this.OUTLABCOST[i];
    }

    public void setOUTLABCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.OUTLABCOST[i] = _value;
    }


    /**
     * Gets the OUTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OUTMATCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getOUTMATCOST() {
        return OUTMATCOST;
    }


    /**
     * Sets the OUTMATCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param OUTMATCOST
     */
    public void setOUTMATCOST(com.ibm.www.maximo.MXDoubleQueryType[] OUTMATCOST) {
        this.OUTMATCOST = OUTMATCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getOUTMATCOST(int i) {
        return this.OUTMATCOST[i];
    }

    public void setOUTMATCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.OUTMATCOST[i] = _value;
    }


    /**
     * Gets the OUTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OUTTOOLCOST
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getOUTTOOLCOST() {
        return OUTTOOLCOST;
    }


    /**
     * Sets the OUTTOOLCOST value for this MXWOQueryTypeWORKORDER.
     * 
     * @param OUTTOOLCOST
     */
    public void setOUTTOOLCOST(com.ibm.www.maximo.MXDoubleQueryType[] OUTTOOLCOST) {
        this.OUTTOOLCOST = OUTTOOLCOST;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getOUTTOOLCOST(int i) {
        return this.OUTTOOLCOST[i];
    }

    public void setOUTTOOLCOST(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.OUTTOOLCOST[i] = _value;
    }


    /**
     * Gets the OWNER value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OWNER
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOWNER() {
        return OWNER;
    }


    /**
     * Sets the OWNER value for this MXWOQueryTypeWORKORDER.
     * 
     * @param OWNER
     */
    public void setOWNER(com.ibm.www.maximo.MXStringQueryType[] OWNER) {
        this.OWNER = OWNER;
    }

    public com.ibm.www.maximo.MXStringQueryType getOWNER(int i) {
        return this.OWNER[i];
    }

    public void setOWNER(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.OWNER[i] = _value;
    }


    /**
     * Gets the OWNERGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OWNERGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOWNERGROUP() {
        return OWNERGROUP;
    }


    /**
     * Sets the OWNERGROUP value for this MXWOQueryTypeWORKORDER.
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
     * Gets the OWNERSYSID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return OWNERSYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getOWNERSYSID() {
        return OWNERSYSID;
    }


    /**
     * Sets the OWNERSYSID value for this MXWOQueryTypeWORKORDER.
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
     * Gets the PARENT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PARENT
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPARENT() {
        return PARENT;
    }


    /**
     * Sets the PARENT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PARENT
     */
    public void setPARENT(com.ibm.www.maximo.MXStringQueryType[] PARENT) {
        this.PARENT = PARENT;
    }

    public com.ibm.www.maximo.MXStringQueryType getPARENT(int i) {
        return this.PARENT[i];
    }

    public void setPARENT(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PARENT[i] = _value;
    }


    /**
     * Gets the PARENTCHGSSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PARENTCHGSSTATUS
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getPARENTCHGSSTATUS() {
        return PARENTCHGSSTATUS;
    }


    /**
     * Sets the PARENTCHGSSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PARENTCHGSSTATUS
     */
    public void setPARENTCHGSSTATUS(com.ibm.www.maximo.MXBooleanQueryType[] PARENTCHGSSTATUS) {
        this.PARENTCHGSSTATUS = PARENTCHGSSTATUS;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getPARENTCHGSSTATUS(int i) {
        return this.PARENTCHGSSTATUS[i];
    }

    public void setPARENTCHGSSTATUS(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.PARENTCHGSSTATUS[i] = _value;
    }


    /**
     * Gets the PERSONGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PERSONGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPERSONGROUP() {
        return PERSONGROUP;
    }


    /**
     * Sets the PERSONGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PERSONGROUP
     */
    public void setPERSONGROUP(com.ibm.www.maximo.MXStringQueryType[] PERSONGROUP) {
        this.PERSONGROUP = PERSONGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getPERSONGROUP(int i) {
        return this.PERSONGROUP[i];
    }

    public void setPERSONGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PERSONGROUP[i] = _value;
    }


    /**
     * Gets the PHONE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PHONE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPHONE() {
        return PHONE;
    }


    /**
     * Sets the PHONE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PHONE
     */
    public void setPHONE(com.ibm.www.maximo.MXStringQueryType[] PHONE) {
        this.PHONE = PHONE;
    }

    public com.ibm.www.maximo.MXStringQueryType getPHONE(int i) {
        return this.PHONE[i];
    }

    public void setPHONE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PHONE[i] = _value;
    }


    /**
     * Gets the PLUSCFREQUENCY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCFREQUENCY
     */
    public com.ibm.www.maximo.MXLongQueryType[] getPLUSCFREQUENCY() {
        return PLUSCFREQUENCY;
    }


    /**
     * Sets the PLUSCFREQUENCY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCFREQUENCY
     */
    public void setPLUSCFREQUENCY(com.ibm.www.maximo.MXLongQueryType[] PLUSCFREQUENCY) {
        this.PLUSCFREQUENCY = PLUSCFREQUENCY;
    }

    public com.ibm.www.maximo.MXLongQueryType getPLUSCFREQUENCY(int i) {
        return this.PLUSCFREQUENCY[i];
    }

    public void setPLUSCFREQUENCY(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.PLUSCFREQUENCY[i] = _value;
    }


    /**
     * Gets the PLUSCFREQUNIT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCFREQUNIT
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getPLUSCFREQUNIT() {
        return PLUSCFREQUNIT;
    }


    /**
     * Sets the PLUSCFREQUNIT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCFREQUNIT
     */
    public void setPLUSCFREQUNIT(com.ibm.www.maximo.MXDomainQueryType[] PLUSCFREQUNIT) {
        this.PLUSCFREQUNIT = PLUSCFREQUNIT;
    }

    public com.ibm.www.maximo.MXDomainQueryType getPLUSCFREQUNIT(int i) {
        return this.PLUSCFREQUNIT[i];
    }

    public void setPLUSCFREQUNIT(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.PLUSCFREQUNIT[i] = _value;
    }


    /**
     * Gets the PLUSCISMOBILE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCISMOBILE
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getPLUSCISMOBILE() {
        return PLUSCISMOBILE;
    }


    /**
     * Sets the PLUSCISMOBILE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCISMOBILE
     */
    public void setPLUSCISMOBILE(com.ibm.www.maximo.MXBooleanQueryType[] PLUSCISMOBILE) {
        this.PLUSCISMOBILE = PLUSCISMOBILE;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getPLUSCISMOBILE(int i) {
        return this.PLUSCISMOBILE[i];
    }

    public void setPLUSCISMOBILE(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.PLUSCISMOBILE[i] = _value;
    }


    /**
     * Gets the PLUSCJPREVNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCJPREVNUM
     */
    public com.ibm.www.maximo.MXLongQueryType[] getPLUSCJPREVNUM() {
        return PLUSCJPREVNUM;
    }


    /**
     * Sets the PLUSCJPREVNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCJPREVNUM
     */
    public void setPLUSCJPREVNUM(com.ibm.www.maximo.MXLongQueryType[] PLUSCJPREVNUM) {
        this.PLUSCJPREVNUM = PLUSCJPREVNUM;
    }

    public com.ibm.www.maximo.MXLongQueryType getPLUSCJPREVNUM(int i) {
        return this.PLUSCJPREVNUM[i];
    }

    public void setPLUSCJPREVNUM(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.PLUSCJPREVNUM[i] = _value;
    }


    /**
     * Gets the PLUSCLOOP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCLOOP
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getPLUSCLOOP() {
        return PLUSCLOOP;
    }


    /**
     * Sets the PLUSCLOOP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCLOOP
     */
    public void setPLUSCLOOP(com.ibm.www.maximo.MXBooleanQueryType[] PLUSCLOOP) {
        this.PLUSCLOOP = PLUSCLOOP;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getPLUSCLOOP(int i) {
        return this.PLUSCLOOP[i];
    }

    public void setPLUSCLOOP(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.PLUSCLOOP[i] = _value;
    }


    /**
     * Gets the PLUSCNEXTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCNEXTDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getPLUSCNEXTDATE() {
        return PLUSCNEXTDATE;
    }


    /**
     * Sets the PLUSCNEXTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCNEXTDATE
     */
    public void setPLUSCNEXTDATE(com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCNEXTDATE) {
        this.PLUSCNEXTDATE = PLUSCNEXTDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getPLUSCNEXTDATE(int i) {
        return this.PLUSCNEXTDATE[i];
    }

    public void setPLUSCNEXTDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.PLUSCNEXTDATE[i] = _value;
    }


    /**
     * Gets the PLUSCOVERDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCOVERDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getPLUSCOVERDUEDATE() {
        return PLUSCOVERDUEDATE;
    }


    /**
     * Sets the PLUSCOVERDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCOVERDUEDATE
     */
    public void setPLUSCOVERDUEDATE(com.ibm.www.maximo.MXDateTimeQueryType[] PLUSCOVERDUEDATE) {
        this.PLUSCOVERDUEDATE = PLUSCOVERDUEDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getPLUSCOVERDUEDATE(int i) {
        return this.PLUSCOVERDUEDATE[i];
    }

    public void setPLUSCOVERDUEDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.PLUSCOVERDUEDATE[i] = _value;
    }


    /**
     * Gets the PLUSCPHYLOC value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PLUSCPHYLOC
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPLUSCPHYLOC() {
        return PLUSCPHYLOC;
    }


    /**
     * Sets the PLUSCPHYLOC value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PLUSCPHYLOC
     */
    public void setPLUSCPHYLOC(com.ibm.www.maximo.MXStringQueryType[] PLUSCPHYLOC) {
        this.PLUSCPHYLOC = PLUSCPHYLOC;
    }

    public com.ibm.www.maximo.MXStringQueryType getPLUSCPHYLOC(int i) {
        return this.PLUSCPHYLOC[i];
    }

    public void setPLUSCPHYLOC(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PLUSCPHYLOC[i] = _value;
    }


    /**
     * Gets the PMDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PMDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getPMDUEDATE() {
        return PMDUEDATE;
    }


    /**
     * Sets the PMDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PMDUEDATE
     */
    public void setPMDUEDATE(com.ibm.www.maximo.MXDateTimeQueryType[] PMDUEDATE) {
        this.PMDUEDATE = PMDUEDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getPMDUEDATE(int i) {
        return this.PMDUEDATE[i];
    }

    public void setPMDUEDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.PMDUEDATE[i] = _value;
    }


    /**
     * Gets the PMEXTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PMEXTDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getPMEXTDATE() {
        return PMEXTDATE;
    }


    /**
     * Sets the PMEXTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PMEXTDATE
     */
    public void setPMEXTDATE(com.ibm.www.maximo.MXDateTimeQueryType[] PMEXTDATE) {
        this.PMEXTDATE = PMEXTDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getPMEXTDATE(int i) {
        return this.PMEXTDATE[i];
    }

    public void setPMEXTDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.PMEXTDATE[i] = _value;
    }


    /**
     * Gets the PMNEXTDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PMNEXTDUEDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getPMNEXTDUEDATE() {
        return PMNEXTDUEDATE;
    }


    /**
     * Sets the PMNEXTDUEDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PMNEXTDUEDATE
     */
    public void setPMNEXTDUEDATE(com.ibm.www.maximo.MXDateTimeQueryType[] PMNEXTDUEDATE) {
        this.PMNEXTDUEDATE = PMNEXTDUEDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getPMNEXTDUEDATE(int i) {
        return this.PMNEXTDUEDATE[i];
    }

    public void setPMNEXTDUEDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.PMNEXTDUEDATE[i] = _value;
    }


    /**
     * Gets the PMNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PMNUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPMNUM() {
        return PMNUM;
    }


    /**
     * Sets the PMNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PMNUM
     */
    public void setPMNUM(com.ibm.www.maximo.MXStringQueryType[] PMNUM) {
        this.PMNUM = PMNUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getPMNUM(int i) {
        return this.PMNUM[i];
    }

    public void setPMNUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PMNUM[i] = _value;
    }


    /**
     * Gets the POINTNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return POINTNUM
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPOINTNUM() {
        return POINTNUM;
    }


    /**
     * Sets the POINTNUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param POINTNUM
     */
    public void setPOINTNUM(com.ibm.www.maximo.MXStringQueryType[] POINTNUM) {
        this.POINTNUM = POINTNUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getPOINTNUM(int i) {
        return this.POINTNUM[i];
    }

    public void setPOINTNUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.POINTNUM[i] = _value;
    }


    /**
     * Gets the PROBLEMCODE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return PROBLEMCODE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getPROBLEMCODE() {
        return PROBLEMCODE;
    }


    /**
     * Sets the PROBLEMCODE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param PROBLEMCODE
     */
    public void setPROBLEMCODE(com.ibm.www.maximo.MXStringQueryType[] PROBLEMCODE) {
        this.PROBLEMCODE = PROBLEMCODE;
    }

    public com.ibm.www.maximo.MXStringQueryType getPROBLEMCODE(int i) {
        return this.PROBLEMCODE[i];
    }

    public void setPROBLEMCODE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.PROBLEMCODE[i] = _value;
    }


    /**
     * Gets the REASONFORCHANGE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REASONFORCHANGE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getREASONFORCHANGE() {
        return REASONFORCHANGE;
    }


    /**
     * Sets the REASONFORCHANGE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REASONFORCHANGE
     */
    public void setREASONFORCHANGE(com.ibm.www.maximo.MXStringQueryType[] REASONFORCHANGE) {
        this.REASONFORCHANGE = REASONFORCHANGE;
    }

    public com.ibm.www.maximo.MXStringQueryType getREASONFORCHANGE(int i) {
        return this.REASONFORCHANGE[i];
    }

    public void setREASONFORCHANGE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.REASONFORCHANGE[i] = _value;
    }


    /**
     * Gets the REMDUR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REMDUR
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getREMDUR() {
        return REMDUR;
    }


    /**
     * Sets the REMDUR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REMDUR
     */
    public void setREMDUR(com.ibm.www.maximo.MXDoubleQueryType[] REMDUR) {
        this.REMDUR = REMDUR;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getREMDUR(int i) {
        return this.REMDUR[i];
    }

    public void setREMDUR(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.REMDUR[i] = _value;
    }


    /**
     * Gets the REPAIRFACILITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REPAIRFACILITY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getREPAIRFACILITY() {
        return REPAIRFACILITY;
    }


    /**
     * Sets the REPAIRFACILITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REPAIRFACILITY
     */
    public void setREPAIRFACILITY(com.ibm.www.maximo.MXStringQueryType[] REPAIRFACILITY) {
        this.REPAIRFACILITY = REPAIRFACILITY;
    }

    public com.ibm.www.maximo.MXStringQueryType getREPAIRFACILITY(int i) {
        return this.REPAIRFACILITY[i];
    }

    public void setREPAIRFACILITY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.REPAIRFACILITY[i] = _value;
    }


    /**
     * Gets the REPFACSITEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REPFACSITEID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getREPFACSITEID() {
        return REPFACSITEID;
    }


    /**
     * Sets the REPFACSITEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REPFACSITEID
     */
    public void setREPFACSITEID(com.ibm.www.maximo.MXStringQueryType[] REPFACSITEID) {
        this.REPFACSITEID = REPFACSITEID;
    }

    public com.ibm.www.maximo.MXStringQueryType getREPFACSITEID(int i) {
        return this.REPFACSITEID[i];
    }

    public void setREPFACSITEID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.REPFACSITEID[i] = _value;
    }


    /**
     * Gets the REPORTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REPORTDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getREPORTDATE() {
        return REPORTDATE;
    }


    /**
     * Sets the REPORTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REPORTDATE
     */
    public void setREPORTDATE(com.ibm.www.maximo.MXDateTimeQueryType[] REPORTDATE) {
        this.REPORTDATE = REPORTDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getREPORTDATE(int i) {
        return this.REPORTDATE[i];
    }

    public void setREPORTDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.REPORTDATE[i] = _value;
    }


    /**
     * Gets the REPORTEDBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REPORTEDBY
     */
    public com.ibm.www.maximo.MXStringQueryType[] getREPORTEDBY() {
        return REPORTEDBY;
    }


    /**
     * Sets the REPORTEDBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REPORTEDBY
     */
    public void setREPORTEDBY(com.ibm.www.maximo.MXStringQueryType[] REPORTEDBY) {
        this.REPORTEDBY = REPORTEDBY;
    }

    public com.ibm.www.maximo.MXStringQueryType getREPORTEDBY(int i) {
        return this.REPORTEDBY[i];
    }

    public void setREPORTEDBY(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.REPORTEDBY[i] = _value;
    }


    /**
     * Gets the REQASSTDWNTIME value for this MXWOQueryTypeWORKORDER.
     * 
     * @return REQASSTDWNTIME
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getREQASSTDWNTIME() {
        return REQASSTDWNTIME;
    }


    /**
     * Sets the REQASSTDWNTIME value for this MXWOQueryTypeWORKORDER.
     * 
     * @param REQASSTDWNTIME
     */
    public void setREQASSTDWNTIME(com.ibm.www.maximo.MXBooleanQueryType[] REQASSTDWNTIME) {
        this.REQASSTDWNTIME = REQASSTDWNTIME;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getREQASSTDWNTIME(int i) {
        return this.REQASSTDWNTIME[i];
    }

    public void setREQASSTDWNTIME(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.REQASSTDWNTIME[i] = _value;
    }


    /**
     * Gets the RESPONDBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return RESPONDBY
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getRESPONDBY() {
        return RESPONDBY;
    }


    /**
     * Sets the RESPONDBY value for this MXWOQueryTypeWORKORDER.
     * 
     * @param RESPONDBY
     */
    public void setRESPONDBY(com.ibm.www.maximo.MXDateTimeQueryType[] RESPONDBY) {
        this.RESPONDBY = RESPONDBY;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getRESPONDBY(int i) {
        return this.RESPONDBY[i];
    }

    public void setRESPONDBY(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.RESPONDBY[i] = _value;
    }


    /**
     * Gets the RISK value for this MXWOQueryTypeWORKORDER.
     * 
     * @return RISK
     */
    public com.ibm.www.maximo.MXStringQueryType[] getRISK() {
        return RISK;
    }


    /**
     * Sets the RISK value for this MXWOQueryTypeWORKORDER.
     * 
     * @param RISK
     */
    public void setRISK(com.ibm.www.maximo.MXStringQueryType[] RISK) {
        this.RISK = RISK;
    }

    public com.ibm.www.maximo.MXStringQueryType getRISK(int i) {
        return this.RISK[i];
    }

    public void setRISK(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.RISK[i] = _value;
    }


    /**
     * Gets the ROUTE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ROUTE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getROUTE() {
        return ROUTE;
    }


    /**
     * Sets the ROUTE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ROUTE
     */
    public void setROUTE(com.ibm.www.maximo.MXStringQueryType[] ROUTE) {
        this.ROUTE = ROUTE;
    }

    public com.ibm.www.maximo.MXStringQueryType getROUTE(int i) {
        return this.ROUTE[i];
    }

    public void setROUTE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.ROUTE[i] = _value;
    }


    /**
     * Gets the ROUTESTOPID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return ROUTESTOPID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getROUTESTOPID() {
        return ROUTESTOPID;
    }


    /**
     * Sets the ROUTESTOPID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param ROUTESTOPID
     */
    public void setROUTESTOPID(com.ibm.www.maximo.MXLongQueryType[] ROUTESTOPID) {
        this.ROUTESTOPID = ROUTESTOPID;
    }

    public com.ibm.www.maximo.MXLongQueryType getROUTESTOPID(int i) {
        return this.ROUTESTOPID[i];
    }

    public void setROUTESTOPID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.ROUTESTOPID[i] = _value;
    }


    /**
     * Gets the SCHEDFINISH value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SCHEDFINISH
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getSCHEDFINISH() {
        return SCHEDFINISH;
    }


    /**
     * Sets the SCHEDFINISH value for this MXWOQueryTypeWORKORDER.
     * 
     * @param SCHEDFINISH
     */
    public void setSCHEDFINISH(com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDFINISH) {
        this.SCHEDFINISH = SCHEDFINISH;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getSCHEDFINISH(int i) {
        return this.SCHEDFINISH[i];
    }

    public void setSCHEDFINISH(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.SCHEDFINISH[i] = _value;
    }


    /**
     * Gets the SCHEDSTART value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SCHEDSTART
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getSCHEDSTART() {
        return SCHEDSTART;
    }


    /**
     * Sets the SCHEDSTART value for this MXWOQueryTypeWORKORDER.
     * 
     * @param SCHEDSTART
     */
    public void setSCHEDSTART(com.ibm.www.maximo.MXDateTimeQueryType[] SCHEDSTART) {
        this.SCHEDSTART = SCHEDSTART;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getSCHEDSTART(int i) {
        return this.SCHEDSTART[i];
    }

    public void setSCHEDSTART(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.SCHEDSTART[i] = _value;
    }


    /**
     * Gets the SENDERSYSID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SENDERSYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSENDERSYSID() {
        return SENDERSYSID;
    }


    /**
     * Sets the SENDERSYSID value for this MXWOQueryTypeWORKORDER.
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
     * Gets the SITEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SITEID   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSITEID() {
        return SITEID;
    }


    /**
     * Sets the SITEID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param SITEID   * Unique Key Component
     */
    public void setSITEID(com.ibm.www.maximo.MXStringQueryType[] SITEID) {
        this.SITEID = SITEID;
    }

    public com.ibm.www.maximo.MXStringQueryType getSITEID(int i) {
        return this.SITEID[i];
    }

    public void setSITEID(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.SITEID[i] = _value;
    }


    /**
     * Gets the SNECONSTRAINT value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SNECONSTRAINT
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getSNECONSTRAINT() {
        return SNECONSTRAINT;
    }


    /**
     * Sets the SNECONSTRAINT value for this MXWOQueryTypeWORKORDER.
     * 
     * @param SNECONSTRAINT
     */
    public void setSNECONSTRAINT(com.ibm.www.maximo.MXDateTimeQueryType[] SNECONSTRAINT) {
        this.SNECONSTRAINT = SNECONSTRAINT;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getSNECONSTRAINT(int i) {
        return this.SNECONSTRAINT[i];
    }

    public void setSNECONSTRAINT(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.SNECONSTRAINT[i] = _value;
    }


    /**
     * Gets the SOURCESYSID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SOURCESYSID
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSOURCESYSID() {
        return SOURCESYSID;
    }


    /**
     * Sets the SOURCESYSID value for this MXWOQueryTypeWORKORDER.
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
     * Gets the STATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return STATUS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this MXWOQueryTypeWORKORDER.
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
     * Gets the STATUSDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return STATUSDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getSTATUSDATE() {
        return STATUSDATE;
    }


    /**
     * Sets the STATUSDATE value for this MXWOQueryTypeWORKORDER.
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
     * Gets the STOREROOMMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return STOREROOMMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getSTOREROOMMTLSTATUS() {
        return STOREROOMMTLSTATUS;
    }


    /**
     * Sets the STOREROOMMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param STOREROOMMTLSTATUS
     */
    public void setSTOREROOMMTLSTATUS(com.ibm.www.maximo.MXDomainQueryType[] STOREROOMMTLSTATUS) {
        this.STOREROOMMTLSTATUS = STOREROOMMTLSTATUS;
    }

    public com.ibm.www.maximo.MXDomainQueryType getSTOREROOMMTLSTATUS(int i) {
        return this.STOREROOMMTLSTATUS[i];
    }

    public void setSTOREROOMMTLSTATUS(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.STOREROOMMTLSTATUS[i] = _value;
    }


    /**
     * Gets the SUPERVISOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SUPERVISOR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getSUPERVISOR() {
        return SUPERVISOR;
    }


    /**
     * Sets the SUPERVISOR value for this MXWOQueryTypeWORKORDER.
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
     * Gets the SUSPENDFLOW value for this MXWOQueryTypeWORKORDER.
     * 
     * @return SUSPENDFLOW
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getSUSPENDFLOW() {
        return SUSPENDFLOW;
    }


    /**
     * Sets the SUSPENDFLOW value for this MXWOQueryTypeWORKORDER.
     * 
     * @param SUSPENDFLOW
     */
    public void setSUSPENDFLOW(com.ibm.www.maximo.MXBooleanQueryType[] SUSPENDFLOW) {
        this.SUSPENDFLOW = SUSPENDFLOW;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getSUSPENDFLOW(int i) {
        return this.SUSPENDFLOW[i];
    }

    public void setSUSPENDFLOW(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.SUSPENDFLOW[i] = _value;
    }


    /**
     * Gets the TARGCOMPDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return TARGCOMPDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getTARGCOMPDATE() {
        return TARGCOMPDATE;
    }


    /**
     * Sets the TARGCOMPDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param TARGCOMPDATE
     */
    public void setTARGCOMPDATE(com.ibm.www.maximo.MXDateTimeQueryType[] TARGCOMPDATE) {
        this.TARGCOMPDATE = TARGCOMPDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getTARGCOMPDATE(int i) {
        return this.TARGCOMPDATE[i];
    }

    public void setTARGCOMPDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.TARGCOMPDATE[i] = _value;
    }


    /**
     * Gets the TARGETDESC value for this MXWOQueryTypeWORKORDER.
     * 
     * @return TARGETDESC
     */
    public com.ibm.www.maximo.MXStringQueryType[] getTARGETDESC() {
        return TARGETDESC;
    }


    /**
     * Sets the TARGETDESC value for this MXWOQueryTypeWORKORDER.
     * 
     * @param TARGETDESC
     */
    public void setTARGETDESC(com.ibm.www.maximo.MXStringQueryType[] TARGETDESC) {
        this.TARGETDESC = TARGETDESC;
    }

    public com.ibm.www.maximo.MXStringQueryType getTARGETDESC(int i) {
        return this.TARGETDESC[i];
    }

    public void setTARGETDESC(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.TARGETDESC[i] = _value;
    }


    /**
     * Gets the TARGSTARTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return TARGSTARTDATE
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getTARGSTARTDATE() {
        return TARGSTARTDATE;
    }


    /**
     * Sets the TARGSTARTDATE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param TARGSTARTDATE
     */
    public void setTARGSTARTDATE(com.ibm.www.maximo.MXDateTimeQueryType[] TARGSTARTDATE) {
        this.TARGSTARTDATE = TARGSTARTDATE;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getTARGSTARTDATE(int i) {
        return this.TARGSTARTDATE[i];
    }

    public void setTARGSTARTDATE(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.TARGSTARTDATE[i] = _value;
    }


    /**
     * Gets the TASKID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return TASKID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getTASKID() {
        return TASKID;
    }


    /**
     * Sets the TASKID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param TASKID
     */
    public void setTASKID(com.ibm.www.maximo.MXLongQueryType[] TASKID) {
        this.TASKID = TASKID;
    }

    public com.ibm.www.maximo.MXLongQueryType getTASKID(int i) {
        return this.TASKID[i];
    }

    public void setTASKID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.TASKID[i] = _value;
    }


    /**
     * Gets the VENDOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return VENDOR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getVENDOR() {
        return VENDOR;
    }


    /**
     * Sets the VENDOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param VENDOR
     */
    public void setVENDOR(com.ibm.www.maximo.MXStringQueryType[] VENDOR) {
        this.VENDOR = VENDOR;
    }

    public com.ibm.www.maximo.MXStringQueryType getVENDOR(int i) {
        return this.VENDOR[i];
    }

    public void setVENDOR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.VENDOR[i] = _value;
    }


    /**
     * Gets the VERIFICATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return VERIFICATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getVERIFICATION() {
        return VERIFICATION;
    }


    /**
     * Sets the VERIFICATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param VERIFICATION
     */
    public void setVERIFICATION(com.ibm.www.maximo.MXStringQueryType[] VERIFICATION) {
        this.VERIFICATION = VERIFICATION;
    }

    public com.ibm.www.maximo.MXStringQueryType getVERIFICATION(int i) {
        return this.VERIFICATION[i];
    }

    public void setVERIFICATION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.VERIFICATION[i] = _value;
    }


    /**
     * Gets the WHOMISCHANGEFOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WHOMISCHANGEFOR
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWHOMISCHANGEFOR() {
        return WHOMISCHANGEFOR;
    }


    /**
     * Sets the WHOMISCHANGEFOR value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WHOMISCHANGEFOR
     */
    public void setWHOMISCHANGEFOR(com.ibm.www.maximo.MXStringQueryType[] WHOMISCHANGEFOR) {
        this.WHOMISCHANGEFOR = WHOMISCHANGEFOR;
    }

    public com.ibm.www.maximo.MXStringQueryType getWHOMISCHANGEFOR(int i) {
        return this.WHOMISCHANGEFOR[i];
    }

    public void setWHOMISCHANGEFOR(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WHOMISCHANGEFOR[i] = _value;
    }


    /**
     * Gets the WOACCEPTSCHARGES value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOACCEPTSCHARGES
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getWOACCEPTSCHARGES() {
        return WOACCEPTSCHARGES;
    }


    /**
     * Sets the WOACCEPTSCHARGES value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOACCEPTSCHARGES
     */
    public void setWOACCEPTSCHARGES(com.ibm.www.maximo.MXBooleanQueryType[] WOACCEPTSCHARGES) {
        this.WOACCEPTSCHARGES = WOACCEPTSCHARGES;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getWOACCEPTSCHARGES(int i) {
        return this.WOACCEPTSCHARGES[i];
    }

    public void setWOACCEPTSCHARGES(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.WOACCEPTSCHARGES[i] = _value;
    }


    /**
     * Gets the WOCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOCLASS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getWOCLASS() {
        return WOCLASS;
    }


    /**
     * Sets the WOCLASS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOCLASS
     */
    public void setWOCLASS(com.ibm.www.maximo.MXDomainQueryType[] WOCLASS) {
        this.WOCLASS = WOCLASS;
    }

    public com.ibm.www.maximo.MXDomainQueryType getWOCLASS(int i) {
        return this.WOCLASS[i];
    }

    public void setWOCLASS(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.WOCLASS[i] = _value;
    }


    /**
     * Gets the WOEQ1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ1() {
        return WOEQ1;
    }


    /**
     * Sets the WOEQ1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ1
     */
    public void setWOEQ1(com.ibm.www.maximo.MXStringQueryType[] WOEQ1) {
        this.WOEQ1 = WOEQ1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ1(int i) {
        return this.WOEQ1[i];
    }

    public void setWOEQ1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ1[i] = _value;
    }


    /**
     * Gets the WOEQ10 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ10
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ10() {
        return WOEQ10;
    }


    /**
     * Sets the WOEQ10 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ10
     */
    public void setWOEQ10(com.ibm.www.maximo.MXStringQueryType[] WOEQ10) {
        this.WOEQ10 = WOEQ10;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ10(int i) {
        return this.WOEQ10[i];
    }

    public void setWOEQ10(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ10[i] = _value;
    }


    /**
     * Gets the WOEQ11 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ11
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ11() {
        return WOEQ11;
    }


    /**
     * Sets the WOEQ11 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ11
     */
    public void setWOEQ11(com.ibm.www.maximo.MXStringQueryType[] WOEQ11) {
        this.WOEQ11 = WOEQ11;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ11(int i) {
        return this.WOEQ11[i];
    }

    public void setWOEQ11(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ11[i] = _value;
    }


    /**
     * Gets the WOEQ12 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ12
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOEQ12() {
        return WOEQ12;
    }


    /**
     * Sets the WOEQ12 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ12
     */
    public void setWOEQ12(com.ibm.www.maximo.MXDoubleQueryType[] WOEQ12) {
        this.WOEQ12 = WOEQ12;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOEQ12(int i) {
        return this.WOEQ12[i];
    }

    public void setWOEQ12(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOEQ12[i] = _value;
    }


    /**
     * Gets the WOEQ13 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ13
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWOEQ13() {
        return WOEQ13;
    }


    /**
     * Sets the WOEQ13 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ13
     */
    public void setWOEQ13(com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ13) {
        this.WOEQ13 = WOEQ13;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWOEQ13(int i) {
        return this.WOEQ13[i];
    }

    public void setWOEQ13(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WOEQ13[i] = _value;
    }


    /**
     * Gets the WOEQ14 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ14
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOEQ14() {
        return WOEQ14;
    }


    /**
     * Sets the WOEQ14 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ14
     */
    public void setWOEQ14(com.ibm.www.maximo.MXDoubleQueryType[] WOEQ14) {
        this.WOEQ14 = WOEQ14;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOEQ14(int i) {
        return this.WOEQ14[i];
    }

    public void setWOEQ14(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOEQ14[i] = _value;
    }


    /**
     * Gets the WOEQ2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ2() {
        return WOEQ2;
    }


    /**
     * Sets the WOEQ2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ2
     */
    public void setWOEQ2(com.ibm.www.maximo.MXStringQueryType[] WOEQ2) {
        this.WOEQ2 = WOEQ2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ2(int i) {
        return this.WOEQ2[i];
    }

    public void setWOEQ2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ2[i] = _value;
    }


    /**
     * Gets the WOEQ3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ3() {
        return WOEQ3;
    }


    /**
     * Sets the WOEQ3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ3
     */
    public void setWOEQ3(com.ibm.www.maximo.MXStringQueryType[] WOEQ3) {
        this.WOEQ3 = WOEQ3;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ3(int i) {
        return this.WOEQ3[i];
    }

    public void setWOEQ3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ3[i] = _value;
    }


    /**
     * Gets the WOEQ4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ4
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ4() {
        return WOEQ4;
    }


    /**
     * Sets the WOEQ4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ4
     */
    public void setWOEQ4(com.ibm.www.maximo.MXStringQueryType[] WOEQ4) {
        this.WOEQ4 = WOEQ4;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ4(int i) {
        return this.WOEQ4[i];
    }

    public void setWOEQ4(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ4[i] = _value;
    }


    /**
     * Gets the WOEQ5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ5
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOEQ5() {
        return WOEQ5;
    }


    /**
     * Sets the WOEQ5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ5
     */
    public void setWOEQ5(com.ibm.www.maximo.MXDoubleQueryType[] WOEQ5) {
        this.WOEQ5 = WOEQ5;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOEQ5(int i) {
        return this.WOEQ5[i];
    }

    public void setWOEQ5(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOEQ5[i] = _value;
    }


    /**
     * Gets the WOEQ6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ6
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWOEQ6() {
        return WOEQ6;
    }


    /**
     * Sets the WOEQ6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ6
     */
    public void setWOEQ6(com.ibm.www.maximo.MXDateTimeQueryType[] WOEQ6) {
        this.WOEQ6 = WOEQ6;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWOEQ6(int i) {
        return this.WOEQ6[i];
    }

    public void setWOEQ6(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WOEQ6[i] = _value;
    }


    /**
     * Gets the WOEQ7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ7
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOEQ7() {
        return WOEQ7;
    }


    /**
     * Sets the WOEQ7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ7
     */
    public void setWOEQ7(com.ibm.www.maximo.MXDoubleQueryType[] WOEQ7) {
        this.WOEQ7 = WOEQ7;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOEQ7(int i) {
        return this.WOEQ7[i];
    }

    public void setWOEQ7(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOEQ7[i] = _value;
    }


    /**
     * Gets the WOEQ8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ8
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ8() {
        return WOEQ8;
    }


    /**
     * Sets the WOEQ8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ8
     */
    public void setWOEQ8(com.ibm.www.maximo.MXStringQueryType[] WOEQ8) {
        this.WOEQ8 = WOEQ8;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ8(int i) {
        return this.WOEQ8[i];
    }

    public void setWOEQ8(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ8[i] = _value;
    }


    /**
     * Gets the WOEQ9 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOEQ9
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOEQ9() {
        return WOEQ9;
    }


    /**
     * Sets the WOEQ9 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOEQ9
     */
    public void setWOEQ9(com.ibm.www.maximo.MXStringQueryType[] WOEQ9) {
        this.WOEQ9 = WOEQ9;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOEQ9(int i) {
        return this.WOEQ9[i];
    }

    public void setWOEQ9(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOEQ9[i] = _value;
    }


    /**
     * Gets the WOGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOGROUP
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOGROUP() {
        return WOGROUP;
    }


    /**
     * Sets the WOGROUP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOGROUP
     */
    public void setWOGROUP(com.ibm.www.maximo.MXStringQueryType[] WOGROUP) {
        this.WOGROUP = WOGROUP;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOGROUP(int i) {
        return this.WOGROUP[i];
    }

    public void setWOGROUP(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOGROUP[i] = _value;
    }


    /**
     * Gets the WOISSWAP value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOISSWAP
     */
    public com.ibm.www.maximo.MXBooleanQueryType[] getWOISSWAP() {
        return WOISSWAP;
    }


    /**
     * Sets the WOISSWAP value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOISSWAP
     */
    public void setWOISSWAP(com.ibm.www.maximo.MXBooleanQueryType[] WOISSWAP) {
        this.WOISSWAP = WOISSWAP;
    }

    public com.ibm.www.maximo.MXBooleanQueryType getWOISSWAP(int i) {
        return this.WOISSWAP[i];
    }

    public void setWOISSWAP(int i, com.ibm.www.maximo.MXBooleanQueryType _value) {
        this.WOISSWAP[i] = _value;
    }


    /**
     * Gets the WOJO1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO1() {
        return WOJO1;
    }


    /**
     * Sets the WOJO1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO1
     */
    public void setWOJO1(com.ibm.www.maximo.MXStringQueryType[] WOJO1) {
        this.WOJO1 = WOJO1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO1(int i) {
        return this.WOJO1[i];
    }

    public void setWOJO1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO1[i] = _value;
    }


    /**
     * Gets the WOJO2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO2() {
        return WOJO2;
    }


    /**
     * Sets the WOJO2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO2
     */
    public void setWOJO2(com.ibm.www.maximo.MXStringQueryType[] WOJO2) {
        this.WOJO2 = WOJO2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO2(int i) {
        return this.WOJO2[i];
    }

    public void setWOJO2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO2[i] = _value;
    }


    /**
     * Gets the WOJO3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO3() {
        return WOJO3;
    }


    /**
     * Sets the WOJO3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO3
     */
    public void setWOJO3(com.ibm.www.maximo.MXStringQueryType[] WOJO3) {
        this.WOJO3 = WOJO3;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO3(int i) {
        return this.WOJO3[i];
    }

    public void setWOJO3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO3[i] = _value;
    }


    /**
     * Gets the WOJO4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO4
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOJO4() {
        return WOJO4;
    }


    /**
     * Sets the WOJO4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO4
     */
    public void setWOJO4(com.ibm.www.maximo.MXDoubleQueryType[] WOJO4) {
        this.WOJO4 = WOJO4;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOJO4(int i) {
        return this.WOJO4[i];
    }

    public void setWOJO4(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOJO4[i] = _value;
    }


    /**
     * Gets the WOJO5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO5
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO5() {
        return WOJO5;
    }


    /**
     * Sets the WOJO5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO5
     */
    public void setWOJO5(com.ibm.www.maximo.MXStringQueryType[] WOJO5) {
        this.WOJO5 = WOJO5;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO5(int i) {
        return this.WOJO5[i];
    }

    public void setWOJO5(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO5[i] = _value;
    }


    /**
     * Gets the WOJO6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO6
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO6() {
        return WOJO6;
    }


    /**
     * Sets the WOJO6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO6
     */
    public void setWOJO6(com.ibm.www.maximo.MXStringQueryType[] WOJO6) {
        this.WOJO6 = WOJO6;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO6(int i) {
        return this.WOJO6[i];
    }

    public void setWOJO6(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO6[i] = _value;
    }


    /**
     * Gets the WOJO7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO7
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO7() {
        return WOJO7;
    }


    /**
     * Sets the WOJO7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO7
     */
    public void setWOJO7(com.ibm.www.maximo.MXStringQueryType[] WOJO7) {
        this.WOJO7 = WOJO7;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO7(int i) {
        return this.WOJO7[i];
    }

    public void setWOJO7(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO7[i] = _value;
    }


    /**
     * Gets the WOJO8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJO8
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJO8() {
        return WOJO8;
    }


    /**
     * Sets the WOJO8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJO8
     */
    public void setWOJO8(com.ibm.www.maximo.MXStringQueryType[] WOJO8) {
        this.WOJO8 = WOJO8;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJO8(int i) {
        return this.WOJO8[i];
    }

    public void setWOJO8(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJO8[i] = _value;
    }


    /**
     * Gets the WOJP1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJP1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJP1() {
        return WOJP1;
    }


    /**
     * Sets the WOJP1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJP1
     */
    public void setWOJP1(com.ibm.www.maximo.MXStringQueryType[] WOJP1) {
        this.WOJP1 = WOJP1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJP1(int i) {
        return this.WOJP1[i];
    }

    public void setWOJP1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJP1[i] = _value;
    }


    /**
     * Gets the WOJP2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJP2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJP2() {
        return WOJP2;
    }


    /**
     * Sets the WOJP2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJP2
     */
    public void setWOJP2(com.ibm.www.maximo.MXStringQueryType[] WOJP2) {
        this.WOJP2 = WOJP2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJP2(int i) {
        return this.WOJP2[i];
    }

    public void setWOJP2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJP2[i] = _value;
    }


    /**
     * Gets the WOJP3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJP3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOJP3() {
        return WOJP3;
    }


    /**
     * Sets the WOJP3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJP3
     */
    public void setWOJP3(com.ibm.www.maximo.MXStringQueryType[] WOJP3) {
        this.WOJP3 = WOJP3;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOJP3(int i) {
        return this.WOJP3[i];
    }

    public void setWOJP3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOJP3[i] = _value;
    }


    /**
     * Gets the WOJP4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJP4
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOJP4() {
        return WOJP4;
    }


    /**
     * Sets the WOJP4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJP4
     */
    public void setWOJP4(com.ibm.www.maximo.MXDoubleQueryType[] WOJP4) {
        this.WOJP4 = WOJP4;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOJP4(int i) {
        return this.WOJP4[i];
    }

    public void setWOJP4(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOJP4[i] = _value;
    }


    /**
     * Gets the WOJP5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOJP5
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWOJP5() {
        return WOJP5;
    }


    /**
     * Sets the WOJP5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOJP5
     */
    public void setWOJP5(com.ibm.www.maximo.MXDateTimeQueryType[] WOJP5) {
        this.WOJP5 = WOJP5;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWOJP5(int i) {
        return this.WOJP5[i];
    }

    public void setWOJP5(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WOJP5[i] = _value;
    }


    /**
     * Gets the WOL1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOL1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOL1() {
        return WOL1;
    }


    /**
     * Sets the WOL1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOL1
     */
    public void setWOL1(com.ibm.www.maximo.MXStringQueryType[] WOL1) {
        this.WOL1 = WOL1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOL1(int i) {
        return this.WOL1[i];
    }

    public void setWOL1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOL1[i] = _value;
    }


    /**
     * Gets the WOL2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOL2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOL2() {
        return WOL2;
    }


    /**
     * Sets the WOL2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOL2
     */
    public void setWOL2(com.ibm.www.maximo.MXStringQueryType[] WOL2) {
        this.WOL2 = WOL2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOL2(int i) {
        return this.WOL2[i];
    }

    public void setWOL2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOL2[i] = _value;
    }


    /**
     * Gets the WOL3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOL3
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOL3() {
        return WOL3;
    }


    /**
     * Sets the WOL3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOL3
     */
    public void setWOL3(com.ibm.www.maximo.MXDoubleQueryType[] WOL3) {
        this.WOL3 = WOL3;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOL3(int i) {
        return this.WOL3[i];
    }

    public void setWOL3(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOL3[i] = _value;
    }


    /**
     * Gets the WOL4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOL4
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWOL4() {
        return WOL4;
    }


    /**
     * Sets the WOL4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOL4
     */
    public void setWOL4(com.ibm.www.maximo.MXDateTimeQueryType[] WOL4) {
        this.WOL4 = WOL4;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWOL4(int i) {
        return this.WOL4[i];
    }

    public void setWOL4(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WOL4[i] = _value;
    }


    /**
     * Gets the WOLABLNK value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLABLNK
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLABLNK() {
        return WOLABLNK;
    }


    /**
     * Sets the WOLABLNK value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLABLNK
     */
    public void setWOLABLNK(com.ibm.www.maximo.MXStringQueryType[] WOLABLNK) {
        this.WOLABLNK = WOLABLNK;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLABLNK(int i) {
        return this.WOLABLNK[i];
    }

    public void setWOLABLNK(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLABLNK[i] = _value;
    }


    /**
     * Gets the WOLO1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO1() {
        return WOLO1;
    }


    /**
     * Sets the WOLO1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO1
     */
    public void setWOLO1(com.ibm.www.maximo.MXStringQueryType[] WOLO1) {
        this.WOLO1 = WOLO1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO1(int i) {
        return this.WOLO1[i];
    }

    public void setWOLO1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO1[i] = _value;
    }


    /**
     * Gets the WOLO10 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO10
     */
    public com.ibm.www.maximo.MXLongQueryType[] getWOLO10() {
        return WOLO10;
    }


    /**
     * Sets the WOLO10 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO10
     */
    public void setWOLO10(com.ibm.www.maximo.MXLongQueryType[] WOLO10) {
        this.WOLO10 = WOLO10;
    }

    public com.ibm.www.maximo.MXLongQueryType getWOLO10(int i) {
        return this.WOLO10[i];
    }

    public void setWOLO10(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.WOLO10[i] = _value;
    }


    /**
     * Gets the WOLO2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO2() {
        return WOLO2;
    }


    /**
     * Sets the WOLO2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO2
     */
    public void setWOLO2(com.ibm.www.maximo.MXStringQueryType[] WOLO2) {
        this.WOLO2 = WOLO2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO2(int i) {
        return this.WOLO2[i];
    }

    public void setWOLO2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO2[i] = _value;
    }


    /**
     * Gets the WOLO3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO3() {
        return WOLO3;
    }


    /**
     * Sets the WOLO3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO3
     */
    public void setWOLO3(com.ibm.www.maximo.MXStringQueryType[] WOLO3) {
        this.WOLO3 = WOLO3;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO3(int i) {
        return this.WOLO3[i];
    }

    public void setWOLO3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO3[i] = _value;
    }


    /**
     * Gets the WOLO4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO4
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO4() {
        return WOLO4;
    }


    /**
     * Sets the WOLO4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO4
     */
    public void setWOLO4(com.ibm.www.maximo.MXStringQueryType[] WOLO4) {
        this.WOLO4 = WOLO4;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO4(int i) {
        return this.WOLO4[i];
    }

    public void setWOLO4(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO4[i] = _value;
    }


    /**
     * Gets the WOLO5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO5
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO5() {
        return WOLO5;
    }


    /**
     * Sets the WOLO5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO5
     */
    public void setWOLO5(com.ibm.www.maximo.MXStringQueryType[] WOLO5) {
        this.WOLO5 = WOLO5;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO5(int i) {
        return this.WOLO5[i];
    }

    public void setWOLO5(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO5[i] = _value;
    }


    /**
     * Gets the WOLO6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO6
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOLO6() {
        return WOLO6;
    }


    /**
     * Sets the WOLO6 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO6
     */
    public void setWOLO6(com.ibm.www.maximo.MXDoubleQueryType[] WOLO6) {
        this.WOLO6 = WOLO6;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOLO6(int i) {
        return this.WOLO6[i];
    }

    public void setWOLO6(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOLO6[i] = _value;
    }


    /**
     * Gets the WOLO7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO7
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWOLO7() {
        return WOLO7;
    }


    /**
     * Sets the WOLO7 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO7
     */
    public void setWOLO7(com.ibm.www.maximo.MXDateTimeQueryType[] WOLO7) {
        this.WOLO7 = WOLO7;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWOLO7(int i) {
        return this.WOLO7[i];
    }

    public void setWOLO7(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WOLO7[i] = _value;
    }


    /**
     * Gets the WOLO8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO8
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWOLO8() {
        return WOLO8;
    }


    /**
     * Sets the WOLO8 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO8
     */
    public void setWOLO8(com.ibm.www.maximo.MXDoubleQueryType[] WOLO8) {
        this.WOLO8 = WOLO8;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWOLO8(int i) {
        return this.WOLO8[i];
    }

    public void setWOLO8(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WOLO8[i] = _value;
    }


    /**
     * Gets the WOLO9 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOLO9
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWOLO9() {
        return WOLO9;
    }


    /**
     * Sets the WOLO9 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOLO9
     */
    public void setWOLO9(com.ibm.www.maximo.MXStringQueryType[] WOLO9) {
        this.WOLO9 = WOLO9;
    }

    public com.ibm.www.maximo.MXStringQueryType getWOLO9(int i) {
        return this.WOLO9[i];
    }

    public void setWOLO9(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WOLO9[i] = _value;
    }


    /**
     * Gets the WONUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WONUM   * Unique Key Component
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWONUM() {
        return WONUM;
    }


    /**
     * Sets the WONUM value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WONUM   * Unique Key Component
     */
    public void setWONUM(com.ibm.www.maximo.MXStringQueryType[] WONUM) {
        this.WONUM = WONUM;
    }

    public com.ibm.www.maximo.MXStringQueryType getWONUM(int i) {
        return this.WONUM[i];
    }

    public void setWONUM(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WONUM[i] = _value;
    }


    /**
     * Gets the WOPRIORITY value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOPRIORITY
     */
    public com.ibm.www.maximo.MXLongQueryType[] getWOPRIORITY() {
        return WOPRIORITY;
    }


    /**
     * Sets the WOPRIORITY value for this MXWOQueryTypeWORKORDER.
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
     * Gets the WORKLOCATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORKLOCATION
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWORKLOCATION() {
        return WORKLOCATION;
    }


    /**
     * Sets the WORKLOCATION value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORKLOCATION
     */
    public void setWORKLOCATION(com.ibm.www.maximo.MXStringQueryType[] WORKLOCATION) {
        this.WORKLOCATION = WORKLOCATION;
    }

    public com.ibm.www.maximo.MXStringQueryType getWORKLOCATION(int i) {
        return this.WORKLOCATION[i];
    }

    public void setWORKLOCATION(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WORKLOCATION[i] = _value;
    }


    /**
     * Gets the WORKORDERID value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORKORDERID
     */
    public com.ibm.www.maximo.MXLongQueryType[] getWORKORDERID() {
        return WORKORDERID;
    }


    /**
     * Sets the WORKORDERID value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORKORDERID
     */
    public void setWORKORDERID(com.ibm.www.maximo.MXLongQueryType[] WORKORDERID) {
        this.WORKORDERID = WORKORDERID;
    }

    public com.ibm.www.maximo.MXLongQueryType getWORKORDERID(int i) {
        return this.WORKORDERID[i];
    }

    public void setWORKORDERID(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.WORKORDERID[i] = _value;
    }


    /**
     * Gets the WORKPACKMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORKPACKMTLSTATUS
     */
    public com.ibm.www.maximo.MXDomainQueryType[] getWORKPACKMTLSTATUS() {
        return WORKPACKMTLSTATUS;
    }


    /**
     * Sets the WORKPACKMTLSTATUS value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORKPACKMTLSTATUS
     */
    public void setWORKPACKMTLSTATUS(com.ibm.www.maximo.MXDomainQueryType[] WORKPACKMTLSTATUS) {
        this.WORKPACKMTLSTATUS = WORKPACKMTLSTATUS;
    }

    public com.ibm.www.maximo.MXDomainQueryType getWORKPACKMTLSTATUS(int i) {
        return this.WORKPACKMTLSTATUS[i];
    }

    public void setWORKPACKMTLSTATUS(int i, com.ibm.www.maximo.MXDomainQueryType _value) {
        this.WORKPACKMTLSTATUS[i] = _value;
    }


    /**
     * Gets the WORKTYPE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORKTYPE
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWORKTYPE() {
        return WORKTYPE;
    }


    /**
     * Sets the WORKTYPE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORKTYPE
     */
    public void setWORKTYPE(com.ibm.www.maximo.MXStringQueryType[] WORKTYPE) {
        this.WORKTYPE = WORKTYPE;
    }

    public com.ibm.www.maximo.MXStringQueryType getWORKTYPE(int i) {
        return this.WORKTYPE[i];
    }

    public void setWORKTYPE(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WORKTYPE[i] = _value;
    }


    /**
     * Gets the WORTS1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORTS1
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWORTS1() {
        return WORTS1;
    }


    /**
     * Sets the WORTS1 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORTS1
     */
    public void setWORTS1(com.ibm.www.maximo.MXStringQueryType[] WORTS1) {
        this.WORTS1 = WORTS1;
    }

    public com.ibm.www.maximo.MXStringQueryType getWORTS1(int i) {
        return this.WORTS1[i];
    }

    public void setWORTS1(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WORTS1[i] = _value;
    }


    /**
     * Gets the WORTS2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORTS2
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWORTS2() {
        return WORTS2;
    }


    /**
     * Sets the WORTS2 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORTS2
     */
    public void setWORTS2(com.ibm.www.maximo.MXStringQueryType[] WORTS2) {
        this.WORTS2 = WORTS2;
    }

    public com.ibm.www.maximo.MXStringQueryType getWORTS2(int i) {
        return this.WORTS2[i];
    }

    public void setWORTS2(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WORTS2[i] = _value;
    }


    /**
     * Gets the WORTS3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORTS3
     */
    public com.ibm.www.maximo.MXStringQueryType[] getWORTS3() {
        return WORTS3;
    }


    /**
     * Sets the WORTS3 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORTS3
     */
    public void setWORTS3(com.ibm.www.maximo.MXStringQueryType[] WORTS3) {
        this.WORTS3 = WORTS3;
    }

    public com.ibm.www.maximo.MXStringQueryType getWORTS3(int i) {
        return this.WORTS3[i];
    }

    public void setWORTS3(int i, com.ibm.www.maximo.MXStringQueryType _value) {
        this.WORTS3[i] = _value;
    }


    /**
     * Gets the WORTS4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORTS4
     */
    public com.ibm.www.maximo.MXDateTimeQueryType[] getWORTS4() {
        return WORTS4;
    }


    /**
     * Sets the WORTS4 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORTS4
     */
    public void setWORTS4(com.ibm.www.maximo.MXDateTimeQueryType[] WORTS4) {
        this.WORTS4 = WORTS4;
    }

    public com.ibm.www.maximo.MXDateTimeQueryType getWORTS4(int i) {
        return this.WORTS4[i];
    }

    public void setWORTS4(int i, com.ibm.www.maximo.MXDateTimeQueryType _value) {
        this.WORTS4[i] = _value;
    }


    /**
     * Gets the WORTS5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WORTS5
     */
    public com.ibm.www.maximo.MXDoubleQueryType[] getWORTS5() {
        return WORTS5;
    }


    /**
     * Sets the WORTS5 value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WORTS5
     */
    public void setWORTS5(com.ibm.www.maximo.MXDoubleQueryType[] WORTS5) {
        this.WORTS5 = WORTS5;
    }

    public com.ibm.www.maximo.MXDoubleQueryType getWORTS5(int i) {
        return this.WORTS5[i];
    }

    public void setWORTS5(int i, com.ibm.www.maximo.MXDoubleQueryType _value) {
        this.WORTS5[i] = _value;
    }


    /**
     * Gets the WOSEQUENCE value for this MXWOQueryTypeWORKORDER.
     * 
     * @return WOSEQUENCE
     */
    public com.ibm.www.maximo.MXLongQueryType[] getWOSEQUENCE() {
        return WOSEQUENCE;
    }


    /**
     * Sets the WOSEQUENCE value for this MXWOQueryTypeWORKORDER.
     * 
     * @param WOSEQUENCE
     */
    public void setWOSEQUENCE(com.ibm.www.maximo.MXLongQueryType[] WOSEQUENCE) {
        this.WOSEQUENCE = WOSEQUENCE;
    }

    public com.ibm.www.maximo.MXLongQueryType getWOSEQUENCE(int i) {
        return this.WOSEQUENCE[i];
    }

    public void setWOSEQUENCE(int i, com.ibm.www.maximo.MXLongQueryType _value) {
        this.WOSEQUENCE[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MXWOQueryTypeWORKORDER)) return false;
        MXWOQueryTypeWORKORDER other = (MXWOQueryTypeWORKORDER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACTFINISH==null && other.getACTFINISH()==null) || 
             (this.ACTFINISH!=null &&
              java.util.Arrays.equals(this.ACTFINISH, other.getACTFINISH()))) &&
            ((this.ACTINTLABCOST==null && other.getACTINTLABCOST()==null) || 
             (this.ACTINTLABCOST!=null &&
              java.util.Arrays.equals(this.ACTINTLABCOST, other.getACTINTLABCOST()))) &&
            ((this.ACTINTLABHRS==null && other.getACTINTLABHRS()==null) || 
             (this.ACTINTLABHRS!=null &&
              java.util.Arrays.equals(this.ACTINTLABHRS, other.getACTINTLABHRS()))) &&
            ((this.ACTLABCOST==null && other.getACTLABCOST()==null) || 
             (this.ACTLABCOST!=null &&
              java.util.Arrays.equals(this.ACTLABCOST, other.getACTLABCOST()))) &&
            ((this.ACTLABHRS==null && other.getACTLABHRS()==null) || 
             (this.ACTLABHRS!=null &&
              java.util.Arrays.equals(this.ACTLABHRS, other.getACTLABHRS()))) &&
            ((this.ACTMATCOST==null && other.getACTMATCOST()==null) || 
             (this.ACTMATCOST!=null &&
              java.util.Arrays.equals(this.ACTMATCOST, other.getACTMATCOST()))) &&
            ((this.ACTOUTLABCOST==null && other.getACTOUTLABCOST()==null) || 
             (this.ACTOUTLABCOST!=null &&
              java.util.Arrays.equals(this.ACTOUTLABCOST, other.getACTOUTLABCOST()))) &&
            ((this.ACTOUTLABHRS==null && other.getACTOUTLABHRS()==null) || 
             (this.ACTOUTLABHRS!=null &&
              java.util.Arrays.equals(this.ACTOUTLABHRS, other.getACTOUTLABHRS()))) &&
            ((this.ACTSERVCOST==null && other.getACTSERVCOST()==null) || 
             (this.ACTSERVCOST!=null &&
              java.util.Arrays.equals(this.ACTSERVCOST, other.getACTSERVCOST()))) &&
            ((this.ACTSTART==null && other.getACTSTART()==null) || 
             (this.ACTSTART!=null &&
              java.util.Arrays.equals(this.ACTSTART, other.getACTSTART()))) &&
            ((this.ACTTOOLCOST==null && other.getACTTOOLCOST()==null) || 
             (this.ACTTOOLCOST!=null &&
              java.util.Arrays.equals(this.ACTTOOLCOST, other.getACTTOOLCOST()))) &&
            ((this.AMCREW==null && other.getAMCREW()==null) || 
             (this.AMCREW!=null &&
              java.util.Arrays.equals(this.AMCREW, other.getAMCREW()))) &&
            ((this.AMS==null && other.getAMS()==null) || 
             (this.AMS!=null &&
              java.util.Arrays.equals(this.AMS, other.getAMS()))) &&
            ((this.AOS==null && other.getAOS()==null) || 
             (this.AOS!=null &&
              java.util.Arrays.equals(this.AOS, other.getAOS()))) &&
            ((this.APPTREQUIRED==null && other.getAPPTREQUIRED()==null) || 
             (this.APPTREQUIRED!=null &&
              java.util.Arrays.equals(this.APPTREQUIRED, other.getAPPTREQUIRED()))) &&
            ((this.ASSETLOCPRIORITY==null && other.getASSETLOCPRIORITY()==null) || 
             (this.ASSETLOCPRIORITY!=null &&
              java.util.Arrays.equals(this.ASSETLOCPRIORITY, other.getASSETLOCPRIORITY()))) &&
            ((this.ASSETNUM==null && other.getASSETNUM()==null) || 
             (this.ASSETNUM!=null &&
              java.util.Arrays.equals(this.ASSETNUM, other.getASSETNUM()))) &&
            ((this.ASSIGNEDOWNERGROUP==null && other.getASSIGNEDOWNERGROUP()==null) || 
             (this.ASSIGNEDOWNERGROUP!=null &&
              java.util.Arrays.equals(this.ASSIGNEDOWNERGROUP, other.getASSIGNEDOWNERGROUP()))) &&
            ((this.AVAILSTATUSDATE==null && other.getAVAILSTATUSDATE()==null) || 
             (this.AVAILSTATUSDATE!=null &&
              java.util.Arrays.equals(this.AVAILSTATUSDATE, other.getAVAILSTATUSDATE()))) &&
            ((this.BACKOUTPLAN==null && other.getBACKOUTPLAN()==null) || 
             (this.BACKOUTPLAN!=null &&
              java.util.Arrays.equals(this.BACKOUTPLAN, other.getBACKOUTPLAN()))) &&
            ((this.CALCCALENDAR==null && other.getCALCCALENDAR()==null) || 
             (this.CALCCALENDAR!=null &&
              java.util.Arrays.equals(this.CALCCALENDAR, other.getCALCCALENDAR()))) &&
            ((this.CALCORGID==null && other.getCALCORGID()==null) || 
             (this.CALCORGID!=null &&
              java.util.Arrays.equals(this.CALCORGID, other.getCALCORGID()))) &&
            ((this.CALCPRIORITY==null && other.getCALCPRIORITY()==null) || 
             (this.CALCPRIORITY!=null &&
              java.util.Arrays.equals(this.CALCPRIORITY, other.getCALCPRIORITY()))) &&
            ((this.CALCSHIFT==null && other.getCALCSHIFT()==null) || 
             (this.CALCSHIFT!=null &&
              java.util.Arrays.equals(this.CALCSHIFT, other.getCALCSHIFT()))) &&
            ((this.CALENDAR==null && other.getCALENDAR()==null) || 
             (this.CALENDAR!=null &&
              java.util.Arrays.equals(this.CALENDAR, other.getCALENDAR()))) &&
            ((this.CHANGEBY==null && other.getCHANGEBY()==null) || 
             (this.CHANGEBY!=null &&
              java.util.Arrays.equals(this.CHANGEBY, other.getCHANGEBY()))) &&
            ((this.CHANGEDATE==null && other.getCHANGEDATE()==null) || 
             (this.CHANGEDATE!=null &&
              java.util.Arrays.equals(this.CHANGEDATE, other.getCHANGEDATE()))) &&
            ((this.CHARGESTORE==null && other.getCHARGESTORE()==null) || 
             (this.CHARGESTORE!=null &&
              java.util.Arrays.equals(this.CHARGESTORE, other.getCHARGESTORE()))) &&
            ((this.CINUM==null && other.getCINUM()==null) || 
             (this.CINUM!=null &&
              java.util.Arrays.equals(this.CINUM, other.getCINUM()))) &&
            ((this.CLASSSTRUCTUREID==null && other.getCLASSSTRUCTUREID()==null) || 
             (this.CLASSSTRUCTUREID!=null &&
              java.util.Arrays.equals(this.CLASSSTRUCTUREID, other.getCLASSSTRUCTUREID()))) &&
            ((this.COMMODITY==null && other.getCOMMODITY()==null) || 
             (this.COMMODITY!=null &&
              java.util.Arrays.equals(this.COMMODITY, other.getCOMMODITY()))) &&
            ((this.COMMODITYGROUP==null && other.getCOMMODITYGROUP()==null) || 
             (this.COMMODITYGROUP!=null &&
              java.util.Arrays.equals(this.COMMODITYGROUP, other.getCOMMODITYGROUP()))) &&
            ((this.CONTRACT==null && other.getCONTRACT()==null) || 
             (this.CONTRACT!=null &&
              java.util.Arrays.equals(this.CONTRACT, other.getCONTRACT()))) &&
            ((this.CREWID==null && other.getCREWID()==null) || 
             (this.CREWID!=null &&
              java.util.Arrays.equals(this.CREWID, other.getCREWID()))) &&
            ((this.CREWWORKGROUP==null && other.getCREWWORKGROUP()==null) || 
             (this.CREWWORKGROUP!=null &&
              java.util.Arrays.equals(this.CREWWORKGROUP, other.getCREWWORKGROUP()))) &&
            ((this.DESCRIPTION==null && other.getDESCRIPTION()==null) || 
             (this.DESCRIPTION!=null &&
              java.util.Arrays.equals(this.DESCRIPTION, other.getDESCRIPTION()))) &&
            ((this.DIRISSUEMTLSTATUS==null && other.getDIRISSUEMTLSTATUS()==null) || 
             (this.DIRISSUEMTLSTATUS!=null &&
              java.util.Arrays.equals(this.DIRISSUEMTLSTATUS, other.getDIRISSUEMTLSTATUS()))) &&
            ((this.DISABLED==null && other.getDISABLED()==null) || 
             (this.DISABLED!=null &&
              java.util.Arrays.equals(this.DISABLED, other.getDISABLED()))) &&
            ((this.DOWNTIME==null && other.getDOWNTIME()==null) || 
             (this.DOWNTIME!=null &&
              java.util.Arrays.equals(this.DOWNTIME, other.getDOWNTIME()))) &&
            ((this.ENVIRONMENT==null && other.getENVIRONMENT()==null) || 
             (this.ENVIRONMENT!=null &&
              java.util.Arrays.equals(this.ENVIRONMENT, other.getENVIRONMENT()))) &&
            ((this.ESTATAPPRINTLABCOST==null && other.getESTATAPPRINTLABCOST()==null) || 
             (this.ESTATAPPRINTLABCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPRINTLABCOST, other.getESTATAPPRINTLABCOST()))) &&
            ((this.ESTATAPPRINTLABHRS==null && other.getESTATAPPRINTLABHRS()==null) || 
             (this.ESTATAPPRINTLABHRS!=null &&
              java.util.Arrays.equals(this.ESTATAPPRINTLABHRS, other.getESTATAPPRINTLABHRS()))) &&
            ((this.ESTATAPPRLABCOST==null && other.getESTATAPPRLABCOST()==null) || 
             (this.ESTATAPPRLABCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPRLABCOST, other.getESTATAPPRLABCOST()))) &&
            ((this.ESTATAPPRLABHRS==null && other.getESTATAPPRLABHRS()==null) || 
             (this.ESTATAPPRLABHRS!=null &&
              java.util.Arrays.equals(this.ESTATAPPRLABHRS, other.getESTATAPPRLABHRS()))) &&
            ((this.ESTATAPPRMATCOST==null && other.getESTATAPPRMATCOST()==null) || 
             (this.ESTATAPPRMATCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPRMATCOST, other.getESTATAPPRMATCOST()))) &&
            ((this.ESTATAPPROUTLABCOST==null && other.getESTATAPPROUTLABCOST()==null) || 
             (this.ESTATAPPROUTLABCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPROUTLABCOST, other.getESTATAPPROUTLABCOST()))) &&
            ((this.ESTATAPPROUTLABHRS==null && other.getESTATAPPROUTLABHRS()==null) || 
             (this.ESTATAPPROUTLABHRS!=null &&
              java.util.Arrays.equals(this.ESTATAPPROUTLABHRS, other.getESTATAPPROUTLABHRS()))) &&
            ((this.ESTATAPPRSERVCOST==null && other.getESTATAPPRSERVCOST()==null) || 
             (this.ESTATAPPRSERVCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPRSERVCOST, other.getESTATAPPRSERVCOST()))) &&
            ((this.ESTATAPPRTOOLCOST==null && other.getESTATAPPRTOOLCOST()==null) || 
             (this.ESTATAPPRTOOLCOST!=null &&
              java.util.Arrays.equals(this.ESTATAPPRTOOLCOST, other.getESTATAPPRTOOLCOST()))) &&
            ((this.ESTDUR==null && other.getESTDUR()==null) || 
             (this.ESTDUR!=null &&
              java.util.Arrays.equals(this.ESTDUR, other.getESTDUR()))) &&
            ((this.ESTINTLABCOST==null && other.getESTINTLABCOST()==null) || 
             (this.ESTINTLABCOST!=null &&
              java.util.Arrays.equals(this.ESTINTLABCOST, other.getESTINTLABCOST()))) &&
            ((this.ESTINTLABHRS==null && other.getESTINTLABHRS()==null) || 
             (this.ESTINTLABHRS!=null &&
              java.util.Arrays.equals(this.ESTINTLABHRS, other.getESTINTLABHRS()))) &&
            ((this.ESTLABCOST==null && other.getESTLABCOST()==null) || 
             (this.ESTLABCOST!=null &&
              java.util.Arrays.equals(this.ESTLABCOST, other.getESTLABCOST()))) &&
            ((this.ESTLABHRS==null && other.getESTLABHRS()==null) || 
             (this.ESTLABHRS!=null &&
              java.util.Arrays.equals(this.ESTLABHRS, other.getESTLABHRS()))) &&
            ((this.ESTMATCOST==null && other.getESTMATCOST()==null) || 
             (this.ESTMATCOST!=null &&
              java.util.Arrays.equals(this.ESTMATCOST, other.getESTMATCOST()))) &&
            ((this.ESTOUTLABCOST==null && other.getESTOUTLABCOST()==null) || 
             (this.ESTOUTLABCOST!=null &&
              java.util.Arrays.equals(this.ESTOUTLABCOST, other.getESTOUTLABCOST()))) &&
            ((this.ESTOUTLABHRS==null && other.getESTOUTLABHRS()==null) || 
             (this.ESTOUTLABHRS!=null &&
              java.util.Arrays.equals(this.ESTOUTLABHRS, other.getESTOUTLABHRS()))) &&
            ((this.ESTSERVCOST==null && other.getESTSERVCOST()==null) || 
             (this.ESTSERVCOST!=null &&
              java.util.Arrays.equals(this.ESTSERVCOST, other.getESTSERVCOST()))) &&
            ((this.ESTTOOLCOST==null && other.getESTTOOLCOST()==null) || 
             (this.ESTTOOLCOST!=null &&
              java.util.Arrays.equals(this.ESTTOOLCOST, other.getESTTOOLCOST()))) &&
            ((this.EXTERNALREFID==null && other.getEXTERNALREFID()==null) || 
             (this.EXTERNALREFID!=null &&
              java.util.Arrays.equals(this.EXTERNALREFID, other.getEXTERNALREFID()))) &&
            ((this.FAILDATE==null && other.getFAILDATE()==null) || 
             (this.FAILDATE!=null &&
              java.util.Arrays.equals(this.FAILDATE, other.getFAILDATE()))) &&
            ((this.FAILURECODE==null && other.getFAILURECODE()==null) || 
             (this.FAILURECODE!=null &&
              java.util.Arrays.equals(this.FAILURECODE, other.getFAILURECODE()))) &&
            ((this.FINCNTRLID==null && other.getFINCNTRLID()==null) || 
             (this.FINCNTRLID!=null &&
              java.util.Arrays.equals(this.FINCNTRLID, other.getFINCNTRLID()))) &&
            ((this.FIRSTAPPRSTATUS==null && other.getFIRSTAPPRSTATUS()==null) || 
             (this.FIRSTAPPRSTATUS!=null &&
              java.util.Arrays.equals(this.FIRSTAPPRSTATUS, other.getFIRSTAPPRSTATUS()))) &&
            ((this.FLOWACTION==null && other.getFLOWACTION()==null) || 
             (this.FLOWACTION!=null &&
              java.util.Arrays.equals(this.FLOWACTION, other.getFLOWACTION()))) &&
            ((this.FLOWACTIONASSIST==null && other.getFLOWACTIONASSIST()==null) || 
             (this.FLOWACTIONASSIST!=null &&
              java.util.Arrays.equals(this.FLOWACTIONASSIST, other.getFLOWACTIONASSIST()))) &&
            ((this.FLOWCONTROLLED==null && other.getFLOWCONTROLLED()==null) || 
             (this.FLOWCONTROLLED!=null &&
              java.util.Arrays.equals(this.FLOWCONTROLLED, other.getFLOWCONTROLLED()))) &&
            ((this.FNLCONSTRAINT==null && other.getFNLCONSTRAINT()==null) || 
             (this.FNLCONSTRAINT!=null &&
              java.util.Arrays.equals(this.FNLCONSTRAINT, other.getFNLCONSTRAINT()))) &&
            ((this.GENERATEDFORPO==null && other.getGENERATEDFORPO()==null) || 
             (this.GENERATEDFORPO!=null &&
              java.util.Arrays.equals(this.GENERATEDFORPO, other.getGENERATEDFORPO()))) &&
            ((this.GENFORPOLINEID==null && other.getGENFORPOLINEID()==null) || 
             (this.GENFORPOLINEID!=null &&
              java.util.Arrays.equals(this.GENFORPOLINEID, other.getGENFORPOLINEID()))) &&
            ((this.GENFORPOREVISION==null && other.getGENFORPOREVISION()==null) || 
             (this.GENFORPOREVISION!=null &&
              java.util.Arrays.equals(this.GENFORPOREVISION, other.getGENFORPOREVISION()))) &&
            ((this.GLACCOUNT==null && other.getGLACCOUNT()==null) || 
             (this.GLACCOUNT!=null &&
              java.util.Arrays.equals(this.GLACCOUNT, other.getGLACCOUNT()))) &&
            ((this.HASCHILDREN==null && other.getHASCHILDREN()==null) || 
             (this.HASCHILDREN!=null &&
              java.util.Arrays.equals(this.HASCHILDREN, other.getHASCHILDREN()))) &&
            ((this.HASFOLLOWUPWORK==null && other.getHASFOLLOWUPWORK()==null) || 
             (this.HASFOLLOWUPWORK!=null &&
              java.util.Arrays.equals(this.HASFOLLOWUPWORK, other.getHASFOLLOWUPWORK()))) &&
            ((this.HISTORYFLAG==null && other.getHISTORYFLAG()==null) || 
             (this.HISTORYFLAG!=null &&
              java.util.Arrays.equals(this.HISTORYFLAG, other.getHISTORYFLAG()))) &&
            ((this.IGNOREDIAVAIL==null && other.getIGNOREDIAVAIL()==null) || 
             (this.IGNOREDIAVAIL!=null &&
              java.util.Arrays.equals(this.IGNOREDIAVAIL, other.getIGNOREDIAVAIL()))) &&
            ((this.IGNORESRMAVAIL==null && other.getIGNORESRMAVAIL()==null) || 
             (this.IGNORESRMAVAIL!=null &&
              java.util.Arrays.equals(this.IGNORESRMAVAIL, other.getIGNORESRMAVAIL()))) &&
            ((this.INCTASKSINSCHED==null && other.getINCTASKSINSCHED()==null) || 
             (this.INCTASKSINSCHED!=null &&
              java.util.Arrays.equals(this.INCTASKSINSCHED, other.getINCTASKSINSCHED()))) &&
            ((this.INSPECTOR==null && other.getINSPECTOR()==null) || 
             (this.INSPECTOR!=null &&
              java.util.Arrays.equals(this.INSPECTOR, other.getINSPECTOR()))) &&
            ((this.INTERRUPTIBLE==null && other.getINTERRUPTIBLE()==null) || 
             (this.INTERRUPTIBLE!=null &&
              java.util.Arrays.equals(this.INTERRUPTIBLE, other.getINTERRUPTIBLE()))) &&
            ((this.ISTASK==null && other.getISTASK()==null) || 
             (this.ISTASK!=null &&
              java.util.Arrays.equals(this.ISTASK, other.getISTASK()))) &&
            ((this.JOBTASKID==null && other.getJOBTASKID()==null) || 
             (this.JOBTASKID!=null &&
              java.util.Arrays.equals(this.JOBTASKID, other.getJOBTASKID()))) &&
            ((this.JPNUM==null && other.getJPNUM()==null) || 
             (this.JPNUM!=null &&
              java.util.Arrays.equals(this.JPNUM, other.getJPNUM()))) &&
            ((this.JUSTIFYPRIORITY==null && other.getJUSTIFYPRIORITY()==null) || 
             (this.JUSTIFYPRIORITY!=null &&
              java.util.Arrays.equals(this.JUSTIFYPRIORITY, other.getJUSTIFYPRIORITY()))) &&
            ((this.LASTCOPYLINKDATE==null && other.getLASTCOPYLINKDATE()==null) || 
             (this.LASTCOPYLINKDATE!=null &&
              java.util.Arrays.equals(this.LASTCOPYLINKDATE, other.getLASTCOPYLINKDATE()))) &&
            ((this.LAUNCHENTRYNAME==null && other.getLAUNCHENTRYNAME()==null) || 
             (this.LAUNCHENTRYNAME!=null &&
              java.util.Arrays.equals(this.LAUNCHENTRYNAME, other.getLAUNCHENTRYNAME()))) &&
            ((this.LEAD==null && other.getLEAD()==null) || 
             (this.LEAD!=null &&
              java.util.Arrays.equals(this.LEAD, other.getLEAD()))) &&
            ((this.LMS==null && other.getLMS()==null) || 
             (this.LMS!=null &&
              java.util.Arrays.equals(this.LMS, other.getLMS()))) &&
            ((this.LOCATION==null && other.getLOCATION()==null) || 
             (this.LOCATION!=null &&
              java.util.Arrays.equals(this.LOCATION, other.getLOCATION()))) &&
            ((this.LOS==null && other.getLOS()==null) || 
             (this.LOS!=null &&
              java.util.Arrays.equals(this.LOS, other.getLOS()))) &&
            ((this.MEASUREDATE==null && other.getMEASUREDATE()==null) || 
             (this.MEASUREDATE!=null &&
              java.util.Arrays.equals(this.MEASUREDATE, other.getMEASUREDATE()))) &&
            ((this.MEASUREMENTVALUE==null && other.getMEASUREMENTVALUE()==null) || 
             (this.MEASUREMENTVALUE!=null &&
              java.util.Arrays.equals(this.MEASUREMENTVALUE, other.getMEASUREMENTVALUE()))) &&
            ((this.NESTEDJPINPROCESS==null && other.getNESTEDJPINPROCESS()==null) || 
             (this.NESTEDJPINPROCESS!=null &&
              java.util.Arrays.equals(this.NESTEDJPINPROCESS, other.getNESTEDJPINPROCESS()))) &&
            ((this.NEWCHILDCLASS==null && other.getNEWCHILDCLASS()==null) || 
             (this.NEWCHILDCLASS!=null &&
              java.util.Arrays.equals(this.NEWCHILDCLASS, other.getNEWCHILDCLASS()))) &&
            ((this.OBSERVATION==null && other.getOBSERVATION()==null) || 
             (this.OBSERVATION!=null &&
              java.util.Arrays.equals(this.OBSERVATION, other.getOBSERVATION()))) &&
            ((this.ONBEHALFOF==null && other.getONBEHALFOF()==null) || 
             (this.ONBEHALFOF!=null &&
              java.util.Arrays.equals(this.ONBEHALFOF, other.getONBEHALFOF()))) &&
            ((this.ORGID==null && other.getORGID()==null) || 
             (this.ORGID!=null &&
              java.util.Arrays.equals(this.ORGID, other.getORGID()))) &&
            ((this.ORIGRECORDCLASS==null && other.getORIGRECORDCLASS()==null) || 
             (this.ORIGRECORDCLASS!=null &&
              java.util.Arrays.equals(this.ORIGRECORDCLASS, other.getORIGRECORDCLASS()))) &&
            ((this.ORIGRECORDID==null && other.getORIGRECORDID()==null) || 
             (this.ORIGRECORDID!=null &&
              java.util.Arrays.equals(this.ORIGRECORDID, other.getORIGRECORDID()))) &&
            ((this.OUTLABCOST==null && other.getOUTLABCOST()==null) || 
             (this.OUTLABCOST!=null &&
              java.util.Arrays.equals(this.OUTLABCOST, other.getOUTLABCOST()))) &&
            ((this.OUTMATCOST==null && other.getOUTMATCOST()==null) || 
             (this.OUTMATCOST!=null &&
              java.util.Arrays.equals(this.OUTMATCOST, other.getOUTMATCOST()))) &&
            ((this.OUTTOOLCOST==null && other.getOUTTOOLCOST()==null) || 
             (this.OUTTOOLCOST!=null &&
              java.util.Arrays.equals(this.OUTTOOLCOST, other.getOUTTOOLCOST()))) &&
            ((this.OWNER==null && other.getOWNER()==null) || 
             (this.OWNER!=null &&
              java.util.Arrays.equals(this.OWNER, other.getOWNER()))) &&
            ((this.OWNERGROUP==null && other.getOWNERGROUP()==null) || 
             (this.OWNERGROUP!=null &&
              java.util.Arrays.equals(this.OWNERGROUP, other.getOWNERGROUP()))) &&
            ((this.OWNERSYSID==null && other.getOWNERSYSID()==null) || 
             (this.OWNERSYSID!=null &&
              java.util.Arrays.equals(this.OWNERSYSID, other.getOWNERSYSID()))) &&
            ((this.PARENT==null && other.getPARENT()==null) || 
             (this.PARENT!=null &&
              java.util.Arrays.equals(this.PARENT, other.getPARENT()))) &&
            ((this.PARENTCHGSSTATUS==null && other.getPARENTCHGSSTATUS()==null) || 
             (this.PARENTCHGSSTATUS!=null &&
              java.util.Arrays.equals(this.PARENTCHGSSTATUS, other.getPARENTCHGSSTATUS()))) &&
            ((this.PERSONGROUP==null && other.getPERSONGROUP()==null) || 
             (this.PERSONGROUP!=null &&
              java.util.Arrays.equals(this.PERSONGROUP, other.getPERSONGROUP()))) &&
            ((this.PHONE==null && other.getPHONE()==null) || 
             (this.PHONE!=null &&
              java.util.Arrays.equals(this.PHONE, other.getPHONE()))) &&
            ((this.PLUSCFREQUENCY==null && other.getPLUSCFREQUENCY()==null) || 
             (this.PLUSCFREQUENCY!=null &&
              java.util.Arrays.equals(this.PLUSCFREQUENCY, other.getPLUSCFREQUENCY()))) &&
            ((this.PLUSCFREQUNIT==null && other.getPLUSCFREQUNIT()==null) || 
             (this.PLUSCFREQUNIT!=null &&
              java.util.Arrays.equals(this.PLUSCFREQUNIT, other.getPLUSCFREQUNIT()))) &&
            ((this.PLUSCISMOBILE==null && other.getPLUSCISMOBILE()==null) || 
             (this.PLUSCISMOBILE!=null &&
              java.util.Arrays.equals(this.PLUSCISMOBILE, other.getPLUSCISMOBILE()))) &&
            ((this.PLUSCJPREVNUM==null && other.getPLUSCJPREVNUM()==null) || 
             (this.PLUSCJPREVNUM!=null &&
              java.util.Arrays.equals(this.PLUSCJPREVNUM, other.getPLUSCJPREVNUM()))) &&
            ((this.PLUSCLOOP==null && other.getPLUSCLOOP()==null) || 
             (this.PLUSCLOOP!=null &&
              java.util.Arrays.equals(this.PLUSCLOOP, other.getPLUSCLOOP()))) &&
            ((this.PLUSCNEXTDATE==null && other.getPLUSCNEXTDATE()==null) || 
             (this.PLUSCNEXTDATE!=null &&
              java.util.Arrays.equals(this.PLUSCNEXTDATE, other.getPLUSCNEXTDATE()))) &&
            ((this.PLUSCOVERDUEDATE==null && other.getPLUSCOVERDUEDATE()==null) || 
             (this.PLUSCOVERDUEDATE!=null &&
              java.util.Arrays.equals(this.PLUSCOVERDUEDATE, other.getPLUSCOVERDUEDATE()))) &&
            ((this.PLUSCPHYLOC==null && other.getPLUSCPHYLOC()==null) || 
             (this.PLUSCPHYLOC!=null &&
              java.util.Arrays.equals(this.PLUSCPHYLOC, other.getPLUSCPHYLOC()))) &&
            ((this.PMDUEDATE==null && other.getPMDUEDATE()==null) || 
             (this.PMDUEDATE!=null &&
              java.util.Arrays.equals(this.PMDUEDATE, other.getPMDUEDATE()))) &&
            ((this.PMEXTDATE==null && other.getPMEXTDATE()==null) || 
             (this.PMEXTDATE!=null &&
              java.util.Arrays.equals(this.PMEXTDATE, other.getPMEXTDATE()))) &&
            ((this.PMNEXTDUEDATE==null && other.getPMNEXTDUEDATE()==null) || 
             (this.PMNEXTDUEDATE!=null &&
              java.util.Arrays.equals(this.PMNEXTDUEDATE, other.getPMNEXTDUEDATE()))) &&
            ((this.PMNUM==null && other.getPMNUM()==null) || 
             (this.PMNUM!=null &&
              java.util.Arrays.equals(this.PMNUM, other.getPMNUM()))) &&
            ((this.POINTNUM==null && other.getPOINTNUM()==null) || 
             (this.POINTNUM!=null &&
              java.util.Arrays.equals(this.POINTNUM, other.getPOINTNUM()))) &&
            ((this.PROBLEMCODE==null && other.getPROBLEMCODE()==null) || 
             (this.PROBLEMCODE!=null &&
              java.util.Arrays.equals(this.PROBLEMCODE, other.getPROBLEMCODE()))) &&
            ((this.REASONFORCHANGE==null && other.getREASONFORCHANGE()==null) || 
             (this.REASONFORCHANGE!=null &&
              java.util.Arrays.equals(this.REASONFORCHANGE, other.getREASONFORCHANGE()))) &&
            ((this.REMDUR==null && other.getREMDUR()==null) || 
             (this.REMDUR!=null &&
              java.util.Arrays.equals(this.REMDUR, other.getREMDUR()))) &&
            ((this.REPAIRFACILITY==null && other.getREPAIRFACILITY()==null) || 
             (this.REPAIRFACILITY!=null &&
              java.util.Arrays.equals(this.REPAIRFACILITY, other.getREPAIRFACILITY()))) &&
            ((this.REPFACSITEID==null && other.getREPFACSITEID()==null) || 
             (this.REPFACSITEID!=null &&
              java.util.Arrays.equals(this.REPFACSITEID, other.getREPFACSITEID()))) &&
            ((this.REPORTDATE==null && other.getREPORTDATE()==null) || 
             (this.REPORTDATE!=null &&
              java.util.Arrays.equals(this.REPORTDATE, other.getREPORTDATE()))) &&
            ((this.REPORTEDBY==null && other.getREPORTEDBY()==null) || 
             (this.REPORTEDBY!=null &&
              java.util.Arrays.equals(this.REPORTEDBY, other.getREPORTEDBY()))) &&
            ((this.REQASSTDWNTIME==null && other.getREQASSTDWNTIME()==null) || 
             (this.REQASSTDWNTIME!=null &&
              java.util.Arrays.equals(this.REQASSTDWNTIME, other.getREQASSTDWNTIME()))) &&
            ((this.RESPONDBY==null && other.getRESPONDBY()==null) || 
             (this.RESPONDBY!=null &&
              java.util.Arrays.equals(this.RESPONDBY, other.getRESPONDBY()))) &&
            ((this.RISK==null && other.getRISK()==null) || 
             (this.RISK!=null &&
              java.util.Arrays.equals(this.RISK, other.getRISK()))) &&
            ((this.ROUTE==null && other.getROUTE()==null) || 
             (this.ROUTE!=null &&
              java.util.Arrays.equals(this.ROUTE, other.getROUTE()))) &&
            ((this.ROUTESTOPID==null && other.getROUTESTOPID()==null) || 
             (this.ROUTESTOPID!=null &&
              java.util.Arrays.equals(this.ROUTESTOPID, other.getROUTESTOPID()))) &&
            ((this.SCHEDFINISH==null && other.getSCHEDFINISH()==null) || 
             (this.SCHEDFINISH!=null &&
              java.util.Arrays.equals(this.SCHEDFINISH, other.getSCHEDFINISH()))) &&
            ((this.SCHEDSTART==null && other.getSCHEDSTART()==null) || 
             (this.SCHEDSTART!=null &&
              java.util.Arrays.equals(this.SCHEDSTART, other.getSCHEDSTART()))) &&
            ((this.SENDERSYSID==null && other.getSENDERSYSID()==null) || 
             (this.SENDERSYSID!=null &&
              java.util.Arrays.equals(this.SENDERSYSID, other.getSENDERSYSID()))) &&
            ((this.SITEID==null && other.getSITEID()==null) || 
             (this.SITEID!=null &&
              java.util.Arrays.equals(this.SITEID, other.getSITEID()))) &&
            ((this.SNECONSTRAINT==null && other.getSNECONSTRAINT()==null) || 
             (this.SNECONSTRAINT!=null &&
              java.util.Arrays.equals(this.SNECONSTRAINT, other.getSNECONSTRAINT()))) &&
            ((this.SOURCESYSID==null && other.getSOURCESYSID()==null) || 
             (this.SOURCESYSID!=null &&
              java.util.Arrays.equals(this.SOURCESYSID, other.getSOURCESYSID()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              java.util.Arrays.equals(this.STATUS, other.getSTATUS()))) &&
            ((this.STATUSDATE==null && other.getSTATUSDATE()==null) || 
             (this.STATUSDATE!=null &&
              java.util.Arrays.equals(this.STATUSDATE, other.getSTATUSDATE()))) &&
            ((this.STOREROOMMTLSTATUS==null && other.getSTOREROOMMTLSTATUS()==null) || 
             (this.STOREROOMMTLSTATUS!=null &&
              java.util.Arrays.equals(this.STOREROOMMTLSTATUS, other.getSTOREROOMMTLSTATUS()))) &&
            ((this.SUPERVISOR==null && other.getSUPERVISOR()==null) || 
             (this.SUPERVISOR!=null &&
              java.util.Arrays.equals(this.SUPERVISOR, other.getSUPERVISOR()))) &&
            ((this.SUSPENDFLOW==null && other.getSUSPENDFLOW()==null) || 
             (this.SUSPENDFLOW!=null &&
              java.util.Arrays.equals(this.SUSPENDFLOW, other.getSUSPENDFLOW()))) &&
            ((this.TARGCOMPDATE==null && other.getTARGCOMPDATE()==null) || 
             (this.TARGCOMPDATE!=null &&
              java.util.Arrays.equals(this.TARGCOMPDATE, other.getTARGCOMPDATE()))) &&
            ((this.TARGETDESC==null && other.getTARGETDESC()==null) || 
             (this.TARGETDESC!=null &&
              java.util.Arrays.equals(this.TARGETDESC, other.getTARGETDESC()))) &&
            ((this.TARGSTARTDATE==null && other.getTARGSTARTDATE()==null) || 
             (this.TARGSTARTDATE!=null &&
              java.util.Arrays.equals(this.TARGSTARTDATE, other.getTARGSTARTDATE()))) &&
            ((this.TASKID==null && other.getTASKID()==null) || 
             (this.TASKID!=null &&
              java.util.Arrays.equals(this.TASKID, other.getTASKID()))) &&
            ((this.VENDOR==null && other.getVENDOR()==null) || 
             (this.VENDOR!=null &&
              java.util.Arrays.equals(this.VENDOR, other.getVENDOR()))) &&
            ((this.VERIFICATION==null && other.getVERIFICATION()==null) || 
             (this.VERIFICATION!=null &&
              java.util.Arrays.equals(this.VERIFICATION, other.getVERIFICATION()))) &&
            ((this.WHOMISCHANGEFOR==null && other.getWHOMISCHANGEFOR()==null) || 
             (this.WHOMISCHANGEFOR!=null &&
              java.util.Arrays.equals(this.WHOMISCHANGEFOR, other.getWHOMISCHANGEFOR()))) &&
            ((this.WOACCEPTSCHARGES==null && other.getWOACCEPTSCHARGES()==null) || 
             (this.WOACCEPTSCHARGES!=null &&
              java.util.Arrays.equals(this.WOACCEPTSCHARGES, other.getWOACCEPTSCHARGES()))) &&
            ((this.WOCLASS==null && other.getWOCLASS()==null) || 
             (this.WOCLASS!=null &&
              java.util.Arrays.equals(this.WOCLASS, other.getWOCLASS()))) &&
            ((this.WOEQ1==null && other.getWOEQ1()==null) || 
             (this.WOEQ1!=null &&
              java.util.Arrays.equals(this.WOEQ1, other.getWOEQ1()))) &&
            ((this.WOEQ10==null && other.getWOEQ10()==null) || 
             (this.WOEQ10!=null &&
              java.util.Arrays.equals(this.WOEQ10, other.getWOEQ10()))) &&
            ((this.WOEQ11==null && other.getWOEQ11()==null) || 
             (this.WOEQ11!=null &&
              java.util.Arrays.equals(this.WOEQ11, other.getWOEQ11()))) &&
            ((this.WOEQ12==null && other.getWOEQ12()==null) || 
             (this.WOEQ12!=null &&
              java.util.Arrays.equals(this.WOEQ12, other.getWOEQ12()))) &&
            ((this.WOEQ13==null && other.getWOEQ13()==null) || 
             (this.WOEQ13!=null &&
              java.util.Arrays.equals(this.WOEQ13, other.getWOEQ13()))) &&
            ((this.WOEQ14==null && other.getWOEQ14()==null) || 
             (this.WOEQ14!=null &&
              java.util.Arrays.equals(this.WOEQ14, other.getWOEQ14()))) &&
            ((this.WOEQ2==null && other.getWOEQ2()==null) || 
             (this.WOEQ2!=null &&
              java.util.Arrays.equals(this.WOEQ2, other.getWOEQ2()))) &&
            ((this.WOEQ3==null && other.getWOEQ3()==null) || 
             (this.WOEQ3!=null &&
              java.util.Arrays.equals(this.WOEQ3, other.getWOEQ3()))) &&
            ((this.WOEQ4==null && other.getWOEQ4()==null) || 
             (this.WOEQ4!=null &&
              java.util.Arrays.equals(this.WOEQ4, other.getWOEQ4()))) &&
            ((this.WOEQ5==null && other.getWOEQ5()==null) || 
             (this.WOEQ5!=null &&
              java.util.Arrays.equals(this.WOEQ5, other.getWOEQ5()))) &&
            ((this.WOEQ6==null && other.getWOEQ6()==null) || 
             (this.WOEQ6!=null &&
              java.util.Arrays.equals(this.WOEQ6, other.getWOEQ6()))) &&
            ((this.WOEQ7==null && other.getWOEQ7()==null) || 
             (this.WOEQ7!=null &&
              java.util.Arrays.equals(this.WOEQ7, other.getWOEQ7()))) &&
            ((this.WOEQ8==null && other.getWOEQ8()==null) || 
             (this.WOEQ8!=null &&
              java.util.Arrays.equals(this.WOEQ8, other.getWOEQ8()))) &&
            ((this.WOEQ9==null && other.getWOEQ9()==null) || 
             (this.WOEQ9!=null &&
              java.util.Arrays.equals(this.WOEQ9, other.getWOEQ9()))) &&
            ((this.WOGROUP==null && other.getWOGROUP()==null) || 
             (this.WOGROUP!=null &&
              java.util.Arrays.equals(this.WOGROUP, other.getWOGROUP()))) &&
            ((this.WOISSWAP==null && other.getWOISSWAP()==null) || 
             (this.WOISSWAP!=null &&
              java.util.Arrays.equals(this.WOISSWAP, other.getWOISSWAP()))) &&
            ((this.WOJO1==null && other.getWOJO1()==null) || 
             (this.WOJO1!=null &&
              java.util.Arrays.equals(this.WOJO1, other.getWOJO1()))) &&
            ((this.WOJO2==null && other.getWOJO2()==null) || 
             (this.WOJO2!=null &&
              java.util.Arrays.equals(this.WOJO2, other.getWOJO2()))) &&
            ((this.WOJO3==null && other.getWOJO3()==null) || 
             (this.WOJO3!=null &&
              java.util.Arrays.equals(this.WOJO3, other.getWOJO3()))) &&
            ((this.WOJO4==null && other.getWOJO4()==null) || 
             (this.WOJO4!=null &&
              java.util.Arrays.equals(this.WOJO4, other.getWOJO4()))) &&
            ((this.WOJO5==null && other.getWOJO5()==null) || 
             (this.WOJO5!=null &&
              java.util.Arrays.equals(this.WOJO5, other.getWOJO5()))) &&
            ((this.WOJO6==null && other.getWOJO6()==null) || 
             (this.WOJO6!=null &&
              java.util.Arrays.equals(this.WOJO6, other.getWOJO6()))) &&
            ((this.WOJO7==null && other.getWOJO7()==null) || 
             (this.WOJO7!=null &&
              java.util.Arrays.equals(this.WOJO7, other.getWOJO7()))) &&
            ((this.WOJO8==null && other.getWOJO8()==null) || 
             (this.WOJO8!=null &&
              java.util.Arrays.equals(this.WOJO8, other.getWOJO8()))) &&
            ((this.WOJP1==null && other.getWOJP1()==null) || 
             (this.WOJP1!=null &&
              java.util.Arrays.equals(this.WOJP1, other.getWOJP1()))) &&
            ((this.WOJP2==null && other.getWOJP2()==null) || 
             (this.WOJP2!=null &&
              java.util.Arrays.equals(this.WOJP2, other.getWOJP2()))) &&
            ((this.WOJP3==null && other.getWOJP3()==null) || 
             (this.WOJP3!=null &&
              java.util.Arrays.equals(this.WOJP3, other.getWOJP3()))) &&
            ((this.WOJP4==null && other.getWOJP4()==null) || 
             (this.WOJP4!=null &&
              java.util.Arrays.equals(this.WOJP4, other.getWOJP4()))) &&
            ((this.WOJP5==null && other.getWOJP5()==null) || 
             (this.WOJP5!=null &&
              java.util.Arrays.equals(this.WOJP5, other.getWOJP5()))) &&
            ((this.WOL1==null && other.getWOL1()==null) || 
             (this.WOL1!=null &&
              java.util.Arrays.equals(this.WOL1, other.getWOL1()))) &&
            ((this.WOL2==null && other.getWOL2()==null) || 
             (this.WOL2!=null &&
              java.util.Arrays.equals(this.WOL2, other.getWOL2()))) &&
            ((this.WOL3==null && other.getWOL3()==null) || 
             (this.WOL3!=null &&
              java.util.Arrays.equals(this.WOL3, other.getWOL3()))) &&
            ((this.WOL4==null && other.getWOL4()==null) || 
             (this.WOL4!=null &&
              java.util.Arrays.equals(this.WOL4, other.getWOL4()))) &&
            ((this.WOLABLNK==null && other.getWOLABLNK()==null) || 
             (this.WOLABLNK!=null &&
              java.util.Arrays.equals(this.WOLABLNK, other.getWOLABLNK()))) &&
            ((this.WOLO1==null && other.getWOLO1()==null) || 
             (this.WOLO1!=null &&
              java.util.Arrays.equals(this.WOLO1, other.getWOLO1()))) &&
            ((this.WOLO10==null && other.getWOLO10()==null) || 
             (this.WOLO10!=null &&
              java.util.Arrays.equals(this.WOLO10, other.getWOLO10()))) &&
            ((this.WOLO2==null && other.getWOLO2()==null) || 
             (this.WOLO2!=null &&
              java.util.Arrays.equals(this.WOLO2, other.getWOLO2()))) &&
            ((this.WOLO3==null && other.getWOLO3()==null) || 
             (this.WOLO3!=null &&
              java.util.Arrays.equals(this.WOLO3, other.getWOLO3()))) &&
            ((this.WOLO4==null && other.getWOLO4()==null) || 
             (this.WOLO4!=null &&
              java.util.Arrays.equals(this.WOLO4, other.getWOLO4()))) &&
            ((this.WOLO5==null && other.getWOLO5()==null) || 
             (this.WOLO5!=null &&
              java.util.Arrays.equals(this.WOLO5, other.getWOLO5()))) &&
            ((this.WOLO6==null && other.getWOLO6()==null) || 
             (this.WOLO6!=null &&
              java.util.Arrays.equals(this.WOLO6, other.getWOLO6()))) &&
            ((this.WOLO7==null && other.getWOLO7()==null) || 
             (this.WOLO7!=null &&
              java.util.Arrays.equals(this.WOLO7, other.getWOLO7()))) &&
            ((this.WOLO8==null && other.getWOLO8()==null) || 
             (this.WOLO8!=null &&
              java.util.Arrays.equals(this.WOLO8, other.getWOLO8()))) &&
            ((this.WOLO9==null && other.getWOLO9()==null) || 
             (this.WOLO9!=null &&
              java.util.Arrays.equals(this.WOLO9, other.getWOLO9()))) &&
            ((this.WONUM==null && other.getWONUM()==null) || 
             (this.WONUM!=null &&
              java.util.Arrays.equals(this.WONUM, other.getWONUM()))) &&
            ((this.WOPRIORITY==null && other.getWOPRIORITY()==null) || 
             (this.WOPRIORITY!=null &&
              java.util.Arrays.equals(this.WOPRIORITY, other.getWOPRIORITY()))) &&
            ((this.WORKLOCATION==null && other.getWORKLOCATION()==null) || 
             (this.WORKLOCATION!=null &&
              java.util.Arrays.equals(this.WORKLOCATION, other.getWORKLOCATION()))) &&
            ((this.WORKORDERID==null && other.getWORKORDERID()==null) || 
             (this.WORKORDERID!=null &&
              java.util.Arrays.equals(this.WORKORDERID, other.getWORKORDERID()))) &&
            ((this.WORKPACKMTLSTATUS==null && other.getWORKPACKMTLSTATUS()==null) || 
             (this.WORKPACKMTLSTATUS!=null &&
              java.util.Arrays.equals(this.WORKPACKMTLSTATUS, other.getWORKPACKMTLSTATUS()))) &&
            ((this.WORKTYPE==null && other.getWORKTYPE()==null) || 
             (this.WORKTYPE!=null &&
              java.util.Arrays.equals(this.WORKTYPE, other.getWORKTYPE()))) &&
            ((this.WORTS1==null && other.getWORTS1()==null) || 
             (this.WORTS1!=null &&
              java.util.Arrays.equals(this.WORTS1, other.getWORTS1()))) &&
            ((this.WORTS2==null && other.getWORTS2()==null) || 
             (this.WORTS2!=null &&
              java.util.Arrays.equals(this.WORTS2, other.getWORTS2()))) &&
            ((this.WORTS3==null && other.getWORTS3()==null) || 
             (this.WORTS3!=null &&
              java.util.Arrays.equals(this.WORTS3, other.getWORTS3()))) &&
            ((this.WORTS4==null && other.getWORTS4()==null) || 
             (this.WORTS4!=null &&
              java.util.Arrays.equals(this.WORTS4, other.getWORTS4()))) &&
            ((this.WORTS5==null && other.getWORTS5()==null) || 
             (this.WORTS5!=null &&
              java.util.Arrays.equals(this.WORTS5, other.getWORTS5()))) &&
            ((this.WOSEQUENCE==null && other.getWOSEQUENCE()==null) || 
             (this.WOSEQUENCE!=null &&
              java.util.Arrays.equals(this.WOSEQUENCE, other.getWOSEQUENCE())));
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
        if (getACTFINISH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTFINISH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTFINISH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTINTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTINTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTINTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTINTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTINTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTINTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTMATCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTMATCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTMATCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTOUTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTOUTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTOUTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTOUTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTOUTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTOUTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTSERVCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTSERVCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTSERVCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTSTART() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTSTART());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTSTART(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getACTTOOLCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACTTOOLCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACTTOOLCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAMCREW() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAMCREW());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAMCREW(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAMS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAPPTREQUIRED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAPPTREQUIRED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAPPTREQUIRED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getASSETLOCPRIORITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getASSETLOCPRIORITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getASSETLOCPRIORITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getASSETNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getASSETNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getASSETNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getASSIGNEDOWNERGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getASSIGNEDOWNERGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getASSIGNEDOWNERGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAVAILSTATUSDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAVAILSTATUSDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAVAILSTATUSDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBACKOUTPLAN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBACKOUTPLAN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBACKOUTPLAN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALCCALENDAR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALCCALENDAR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALCCALENDAR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALCORGID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALCORGID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALCORGID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALCPRIORITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALCPRIORITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALCPRIORITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALCSHIFT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALCSHIFT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALCSHIFT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCALENDAR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCALENDAR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCALENDAR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCHANGEBY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCHANGEBY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCHANGEBY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCHANGEDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCHANGEDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCHANGEDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCHARGESTORE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCHARGESTORE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCHARGESTORE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCINUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCINUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCINUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCLASSSTRUCTUREID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCLASSSTRUCTUREID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCLASSSTRUCTUREID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOMMODITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOMMODITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOMMODITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOMMODITYGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOMMODITYGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOMMODITYGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCONTRACT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCONTRACT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCONTRACT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCREWID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCREWID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCREWID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCREWWORKGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCREWWORKGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCREWWORKGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDESCRIPTION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDESCRIPTION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDESCRIPTION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDIRISSUEMTLSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDIRISSUEMTLSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDIRISSUEMTLSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDISABLED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDISABLED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDISABLED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOWNTIME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOWNTIME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOWNTIME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getENVIRONMENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getENVIRONMENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getENVIRONMENT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRINTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRINTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRINTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRINTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRINTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRINTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRMATCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRMATCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRMATCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPROUTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPROUTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPROUTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPROUTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPROUTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPROUTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRSERVCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRSERVCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRSERVCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTATAPPRTOOLCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTATAPPRTOOLCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTATAPPRTOOLCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTDUR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTDUR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTDUR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTINTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTINTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTINTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTINTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTINTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTINTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTMATCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTMATCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTMATCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTOUTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTOUTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTOUTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTOUTLABHRS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTOUTLABHRS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTOUTLABHRS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTSERVCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTSERVCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTSERVCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESTTOOLCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESTTOOLCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESTTOOLCOST(), i);
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
        if (getFAILDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFAILDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFAILDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFAILURECODE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFAILURECODE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFAILURECODE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFINCNTRLID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFINCNTRLID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFINCNTRLID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFIRSTAPPRSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFIRSTAPPRSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFIRSTAPPRSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFLOWACTION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFLOWACTION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFLOWACTION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFLOWACTIONASSIST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFLOWACTIONASSIST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFLOWACTIONASSIST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFLOWCONTROLLED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFLOWCONTROLLED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFLOWCONTROLLED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFNLCONSTRAINT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFNLCONSTRAINT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFNLCONSTRAINT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGENERATEDFORPO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGENERATEDFORPO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGENERATEDFORPO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGENFORPOLINEID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGENFORPOLINEID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGENFORPOLINEID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGENFORPOREVISION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGENFORPOREVISION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGENFORPOREVISION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGLACCOUNT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGLACCOUNT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGLACCOUNT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHASCHILDREN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHASCHILDREN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHASCHILDREN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHASFOLLOWUPWORK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHASFOLLOWUPWORK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHASFOLLOWUPWORK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHISTORYFLAG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHISTORYFLAG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHISTORYFLAG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIGNOREDIAVAIL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIGNOREDIAVAIL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIGNOREDIAVAIL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIGNORESRMAVAIL() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIGNORESRMAVAIL());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIGNORESRMAVAIL(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getINCTASKSINSCHED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINCTASKSINSCHED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINCTASKSINSCHED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getINSPECTOR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINSPECTOR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINSPECTOR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getINTERRUPTIBLE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getINTERRUPTIBLE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getINTERRUPTIBLE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getISTASK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISTASK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISTASK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJOBTASKID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJOBTASKID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJOBTASKID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJPNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJPNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJPNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJUSTIFYPRIORITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJUSTIFYPRIORITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJUSTIFYPRIORITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLASTCOPYLINKDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLASTCOPYLINKDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLASTCOPYLINKDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLAUNCHENTRYNAME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLAUNCHENTRYNAME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLAUNCHENTRYNAME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLEAD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLEAD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLEAD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLMS(), i);
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
        if (getLOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMEASUREDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMEASUREDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMEASUREDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMEASUREMENTVALUE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMEASUREMENTVALUE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMEASUREMENTVALUE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNESTEDJPINPROCESS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNESTEDJPINPROCESS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNESTEDJPINPROCESS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNEWCHILDCLASS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNEWCHILDCLASS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNEWCHILDCLASS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOBSERVATION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOBSERVATION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOBSERVATION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getONBEHALFOF() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getONBEHALFOF());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getONBEHALFOF(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getORGID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getORGID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getORGID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getORIGRECORDCLASS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getORIGRECORDCLASS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getORIGRECORDCLASS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getORIGRECORDID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getORIGRECORDID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getORIGRECORDID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOUTLABCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOUTLABCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOUTLABCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOUTMATCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOUTMATCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOUTMATCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOUTTOOLCOST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOUTTOOLCOST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOUTTOOLCOST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOWNER() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOWNER());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOWNER(), i);
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
        if (getPARENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPARENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPARENT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPARENTCHGSSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPARENTCHGSSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPARENTCHGSSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPERSONGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPERSONGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPERSONGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPLUSCFREQUENCY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCFREQUENCY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCFREQUENCY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCFREQUNIT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCFREQUNIT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCFREQUNIT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCISMOBILE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCISMOBILE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCISMOBILE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCJPREVNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCJPREVNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCJPREVNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCLOOP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCLOOP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCLOOP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCNEXTDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCNEXTDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCNEXTDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCOVERDUEDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCOVERDUEDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCOVERDUEDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLUSCPHYLOC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLUSCPHYLOC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLUSCPHYLOC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPMDUEDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPMDUEDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPMDUEDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPMEXTDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPMEXTDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPMEXTDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPMNEXTDUEDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPMNEXTDUEDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPMNEXTDUEDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPMNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPMNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPMNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPOINTNUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPOINTNUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPOINTNUM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPROBLEMCODE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPROBLEMCODE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPROBLEMCODE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREASONFORCHANGE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREASONFORCHANGE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREASONFORCHANGE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREMDUR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREMDUR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREMDUR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREPAIRFACILITY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREPAIRFACILITY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREPAIRFACILITY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREPFACSITEID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREPFACSITEID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREPFACSITEID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREPORTDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREPORTDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREPORTDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREPORTEDBY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREPORTEDBY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREPORTEDBY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREQASSTDWNTIME() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREQASSTDWNTIME());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREQASSTDWNTIME(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRESPONDBY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRESPONDBY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRESPONDBY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRISK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRISK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRISK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getROUTE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getROUTE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getROUTE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getROUTESTOPID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getROUTESTOPID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getROUTESTOPID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSCHEDFINISH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSCHEDFINISH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSCHEDFINISH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSCHEDSTART() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSCHEDSTART());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSCHEDSTART(), i);
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
        if (getSITEID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSITEID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSITEID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSNECONSTRAINT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSNECONSTRAINT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSNECONSTRAINT(), i);
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
        if (getSTOREROOMMTLSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTOREROOMMTLSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTOREROOMMTLSTATUS(), i);
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
        if (getSUSPENDFLOW() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSUSPENDFLOW());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSUSPENDFLOW(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTARGCOMPDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTARGCOMPDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTARGCOMPDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTARGETDESC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTARGETDESC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTARGETDESC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTARGSTARTDATE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTARGSTARTDATE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTARGSTARTDATE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTASKID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTASKID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTASKID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVENDOR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVENDOR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVENDOR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVERIFICATION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVERIFICATION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVERIFICATION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWHOMISCHANGEFOR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWHOMISCHANGEFOR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWHOMISCHANGEFOR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOACCEPTSCHARGES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOACCEPTSCHARGES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOACCEPTSCHARGES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOCLASS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOCLASS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOCLASS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ10() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ10());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ10(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ11() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ11());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ11(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ12() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ12());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ12(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ13() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ13());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ13(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ14() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ14());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ14(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ6() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ6());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ6(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ7() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ7());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ7(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ8() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ8());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ8(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOEQ9() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOEQ9());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOEQ9(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOGROUP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOGROUP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOGROUP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOISSWAP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOISSWAP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOISSWAP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO6() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO6());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO6(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO7() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO7());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO7(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJO8() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJO8());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJO8(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJP1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJP1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJP1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJP2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJP2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJP2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJP3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJP3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJP3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJP4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJP4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJP4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOJP5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOJP5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOJP5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOL1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOL1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOL1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOL2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOL2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOL2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOL3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOL3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOL3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOL4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOL4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOL4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLABLNK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLABLNK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLABLNK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO10() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO10());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO10(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO6() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO6());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO6(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO7() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO7());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO7(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO8() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO8());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO8(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOLO9() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOLO9());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOLO9(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWONUM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWONUM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWONUM(), i);
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
        if (getWORKLOCATION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORKLOCATION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORKLOCATION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORKORDERID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORKORDERID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORKORDERID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORKPACKMTLSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORKPACKMTLSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORKPACKMTLSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORKTYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORKTYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORKTYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORTS1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORTS1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORTS1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORTS2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORTS2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORTS2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORTS3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORTS3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORTS3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORTS4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORTS4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORTS4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWORTS5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWORTS5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWORTS5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWOSEQUENCE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWOSEQUENCE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWOSEQUENCE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MXWOQueryTypeWORKORDER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXWOQueryType>WORKORDER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTFINISH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTFINISH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTOUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTOUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTOUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTOUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTSTART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTSTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ACTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMCREW");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AMCREW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APPTREQUIRED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "APPTREQUIRED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSETLOCPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSETLOCPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSETNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSETNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASSIGNEDOWNERGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ASSIGNEDOWNERGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVAILSTATUSDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "AVAILSTATUSDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BACKOUTPLAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "BACKOUTPLAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCCALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCCALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCORGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCORGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALCSHIFT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALCSHIFT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CALENDAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CALENDAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHANGEBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHANGEBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHANGEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHANGEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHARGESTORE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CHARGESTORE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CINUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CINUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLASSSTRUCTUREID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CLASSSTRUCTUREID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMODITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COMMODITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMMODITYGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "COMMODITYGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTRACT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CONTRACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREWID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CREWID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREWWORKGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CREWWORKGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DESCRIPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIRISSUEMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DIRISSUEMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISABLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DISABLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOWNTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DOWNTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENVIRONMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ENVIRONMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPROUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPROUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPROUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPROUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTATAPPRTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTATAPPRTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTDUR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTDUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTINTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTINTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTINTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTINTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTOUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTOUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTOUTLABHRS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTOUTLABHRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTSERVCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTSERVCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ESTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("FAILDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FAILDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAILURECODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FAILURECODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FINCNTRLID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FINCNTRLID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIRSTAPPRSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FIRSTAPPRSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWACTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWACTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWACTIONASSIST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWACTIONASSIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLOWCONTROLLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FLOWCONTROLLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FNLCONSTRAINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "FNLCONSTRAINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENERATEDFORPO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENERATEDFORPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENFORPOLINEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENFORPOLINEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENFORPOREVISION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GENFORPOREVISION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "GLACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HASCHILDREN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HASCHILDREN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HASFOLLOWUPWORK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HASFOLLOWUPWORK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HISTORYFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "HISTORYFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGNOREDIAVAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IGNOREDIAVAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IGNORESRMAVAIL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "IGNORESRMAVAIL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCTASKSINSCHED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INCTASKSINSCHED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSPECTOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INSPECTOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTERRUPTIBLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "INTERRUPTIBLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISTASK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ISTASK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JOBTASKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JOBTASKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JPNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JPNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JUSTIFYPRIORITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "JUSTIFYPRIORITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTCOPYLINKDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LASTCOPYLINKDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAUNCHENTRYNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LAUNCHENTRYNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEAD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LEAD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LMS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
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
        elemField.setFieldName("LOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "LOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASUREDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MEASUREDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASUREMENTVALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MEASUREMENTVALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NESTEDJPINPROCESS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NESTEDJPINPROCESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NEWCHILDCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "NEWCHILDCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBSERVATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OBSERVATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ONBEHALFOF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ONBEHALFOF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORGID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGRECORDCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORIGRECORDCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORIGRECORDID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ORIGRECORDID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTLABCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTLABCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTMATCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTMATCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTTOOLCOST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OUTTOOLCOST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OWNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("PARENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PARENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARENTCHGSSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PARENTCHGSSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSONGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHONE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PHONE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCFREQUENCY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCFREQUENCY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCFREQUNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCFREQUNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCISMOBILE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCISMOBILE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCJPREVNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCJPREVNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCLOOP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCLOOP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCNEXTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCNEXTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCOVERDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCOVERDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLUSCPHYLOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PLUSCPHYLOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMEXTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMEXTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNEXTDUEDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMNEXTDUEDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PMNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "POINTNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROBLEMCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PROBLEMCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REASONFORCHANGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REASONFORCHANGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMDUR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REMDUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPAIRFACILITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPAIRFACILITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPFACSITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPFACSITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPORTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPORTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REPORTEDBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REPORTEDBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REQASSTDWNTIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "REQASSTDWNTIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESPONDBY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "RESPONDBY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RISK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "RISK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROUTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ROUTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROUTESTOPID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ROUTESTOPID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDFINISH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SCHEDFINISH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEDSTART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SCHEDSTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("SITEID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SITEID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNECONSTRAINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SNECONSTRAINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("STOREROOMMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "STOREROOMMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("SUSPENDFLOW");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SUSPENDFLOW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGCOMPDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGCOMPDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGETDESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGETDESC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TARGSTARTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TARGSTARTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TASKID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "TASKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VENDOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VENDOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERIFICATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "VERIFICATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHOMISCHANGEFOR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WHOMISCHANGEFOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOACCEPTSCHARGES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOACCEPTSCHARGES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ11");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ12");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ13");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ13"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ14");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ14"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOEQ9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOEQ9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOGROUP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOGROUP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOISSWAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOISSWAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJO8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJO8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOJP5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOJP5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOL4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOL4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLABLNK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLABLNK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO8");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOLO9");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOLO9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WONUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WONUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
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
        elemField.setFieldName("WORKLOCATION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKLOCATION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKORDERID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKPACKMTLSTATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKPACKMTLSTATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORKTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WORTS5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORTS5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WOSEQUENCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WOSEQUENCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
