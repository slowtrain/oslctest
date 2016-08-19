/**
 * MXWOSOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo.wsdl.MXWO;

public class MXWOSOAP11BindingStub extends org.apache.axis.client.Stub implements com.ibm.www.maximo.wsdl.MXWO.MXWOPortType {
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
        oper.setName("QueryMXWO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOType"), com.ibm.www.maximo.QueryMXWOType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.QueryMXWOResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SyncMXWO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWOType"), com.ibm.www.maximo.SyncMXWOType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWOResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.SyncMXWOResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateMXWO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWOType"), com.ibm.www.maximo.UpdateMXWOType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWOResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.UpdateMXWOResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateMXWO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOType"), com.ibm.www.maximo.CreateMXWOType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.CreateMXWOResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteMXWO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWOType"), com.ibm.www.maximo.DeleteMXWOType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWOResponseType"));
        oper.setReturnClass(com.ibm.www.maximo.DeleteMXWOResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public MXWOSOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MXWOSOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MXWOSOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXGLComponentType>glorder");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", ">MXWOQueryType>WORKORDER");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXWOQueryTypeWORKORDER.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.CreateMXWOResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "CreateMXWOType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.CreateMXWOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWOResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.DeleteMXWOResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "DeleteMXWOType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.DeleteMXWOType.class;
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

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDoubleQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXDoubleType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXDoubleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXGLAccountQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLAccountType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXGLAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXGLComponentType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXGLComponentType.class;
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

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWO_WORKORDERType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXWO_WORKORDERType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWOQueryType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXWOQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWOSetType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.MXWO_WORKORDERType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "MXWO_WORKORDERType");
            qName2 = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDER");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "OperandModeType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.OperandModeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "ProcessingActionType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.ProcessingActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryMXWOResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryMXWOType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryMXWOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "QueryOperatorType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.QueryOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWOResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.SyncMXWOResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "SyncMXWOType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.SyncMXWOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWOResponseType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.UpdateMXWOResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "UpdateMXWOType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.UpdateMXWOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERKeyType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.WORKORDERKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERMboKeySetType");
            cachedSerQNames.add(qName);
            cls = com.ibm.www.maximo.WORKORDERKeyType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDERKeyType");
            qName2 = new javax.xml.namespace.QName("http://www.ibm.com/maximo", "WORKORDER");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public com.ibm.www.maximo.QueryMXWOResponseType queryMXWO(com.ibm.www.maximo.QueryMXWOType parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryMXWO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.QueryMXWOResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.QueryMXWOResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.QueryMXWOResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.SyncMXWOResponseType syncMXWO(com.ibm.www.maximo.SyncMXWOType parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "SyncMXWO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.SyncMXWOResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.SyncMXWOResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.SyncMXWOResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.UpdateMXWOResponseType updateMXWO(com.ibm.www.maximo.UpdateMXWOType parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateMXWO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.UpdateMXWOResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.UpdateMXWOResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.UpdateMXWOResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.CreateMXWOResponseType createMXWO(com.ibm.www.maximo.CreateMXWOType parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateMXWO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.CreateMXWOResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.CreateMXWOResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.CreateMXWOResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.ibm.www.maximo.DeleteMXWOResponseType deleteMXWO(com.ibm.www.maximo.DeleteMXWOType parameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteMXWO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.www.maximo.DeleteMXWOResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.www.maximo.DeleteMXWOResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.www.maximo.DeleteMXWOResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
