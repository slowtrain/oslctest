/**
 * MXPERSONSOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo.wsdl.MXPERSON;

public class MXPERSONSOAP11BindingStub extends org.apache.axis.client.Stub implements com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryMXPERSON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONType"), com.ibm.www.maximo.QueryMXPERSONType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.QueryMXPERSONResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SyncMXPERSON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSONType"), com.ibm.www.maximo.SyncMXPERSONType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSONResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.SyncMXPERSONResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSONResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateMXPERSON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSONType"), com.ibm.www.maximo.UpdateMXPERSONType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSONResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.UpdateMXPERSONResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSONResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateMXPERSON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSONType"), com.ibm.www.maximo.CreateMXPERSONType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSONResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.CreateMXPERSONResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSONResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteMXPERSON");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSON"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSONType"), com.ibm.www.maximo.DeleteMXPERSONType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSONResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.DeleteMXPERSONResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSONResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public MXPERSONSOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MXPERSONSOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MXPERSONSOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>EMAIL");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSONQueryTypePERSONEMAIL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>PHONE");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSONQueryTypePERSONPHONE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">>MXPERSONQueryType>PERSON>SMS");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSONQueryTypePERSONSMS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXPERSONQueryType>PERSON");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSONQueryTypePERSON.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSONResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.CreateMXPERSONResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXPERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.CreateMXPERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSONResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.DeleteMXPERSONResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXPERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.DeleteMXPERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MaximoVersionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXBooleanQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXBooleanType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXBooleanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDateTimeQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDateTimeType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDomainQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDomainType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDomainType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXLongQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXLongType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXLongType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_EMAILType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSON_EMAILType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSON_PERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PHONEType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSON_PHONEType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_SMSType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSON_SMSType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSONQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSONQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSONSetType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXPERSON_PERSONType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXPERSON_PERSONType");
            qName2 = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSON");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXStringQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXStringType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXStringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OperandModeType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.OperandModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONKeyType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.PERSONKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONMboKeySetType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.PERSONKeyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSONKeyType");
            qName2 = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "PERSON");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ProcessingActionType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.ProcessingActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryMXPERSONResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXPERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryMXPERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryOperatorType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSONResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.SyncMXPERSONResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXPERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.SyncMXPERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSONResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.UpdateMXPERSONResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXPERSONType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.UpdateMXPERSONType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.ibm.www.maximo.QueryMXPERSONResponseType queryMXPERSON(com.ibm.www.maximo.QueryMXPERSONType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryMXPERSON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.QueryMXPERSONResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.QueryMXPERSONResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.QueryMXPERSONResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.SyncMXPERSONResponseType syncMXPERSON(com.ibm.www.maximo.SyncMXPERSONType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SyncMXPERSON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.SyncMXPERSONResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.SyncMXPERSONResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.SyncMXPERSONResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.UpdateMXPERSONResponseType updateMXPERSON(com.ibm.www.maximo.UpdateMXPERSONType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateMXPERSON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.UpdateMXPERSONResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.UpdateMXPERSONResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.UpdateMXPERSONResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.CreateMXPERSONResponseType createMXPERSON(com.ibm.www.maximo.CreateMXPERSONType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateMXPERSON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.CreateMXPERSONResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.CreateMXPERSONResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.CreateMXPERSONResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.DeleteMXPERSONResponseType deleteMXPERSON(com.ibm.www.maximo.DeleteMXPERSONType parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteMXPERSON"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.DeleteMXPERSONResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.DeleteMXPERSONResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.DeleteMXPERSONResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
