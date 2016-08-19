/**
 * MXPERSONLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo.wsdl.MXPERSON;

public class MXPERSONLocator extends org.apache.axis.client.Service implements com.ibm.www.maximo.wsdl.MXPERSON.MXPERSON {

    public MXPERSONLocator() {
    }


    public MXPERSONLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MXPERSONLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MXPERSONSOAP11Port
    private java.lang.String MXPERSONSOAP11Port_address = "http://localhost:7001/meaweb/services/MXPERSON";

    public java.lang.String getMXPERSONSOAP11PortAddress() {
        return MXPERSONSOAP11Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MXPERSONSOAP11PortWSDDServiceName = "MXPERSONSOAP11Port";

    public java.lang.String getMXPERSONSOAP11PortWSDDServiceName() {
        return MXPERSONSOAP11PortWSDDServiceName;
    }

    public void setMXPERSONSOAP11PortWSDDServiceName(java.lang.String name) {
        MXPERSONSOAP11PortWSDDServiceName = name;
    }

    public com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType getMXPERSONSOAP11Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MXPERSONSOAP11Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMXPERSONSOAP11Port(endpoint);
    }

    public com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType getMXPERSONSOAP11Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONSOAP11BindingStub _stub = new com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getMXPERSONSOAP11PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMXPERSONSOAP11PortEndpointAddress(java.lang.String address) {
        MXPERSONSOAP11Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONSOAP11BindingStub _stub = new com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONSOAP11BindingStub(new java.net.URL(MXPERSONSOAP11Port_address), this);
                _stub.setPortName(getMXPERSONSOAP11PortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MXPERSONSOAP11Port".equals(inputPortName)) {
            return getMXPERSONSOAP11Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.ibm.com/maximo/wsdl/MXPERSON", "MXPERSON");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.ibm.com/maximo/wsdl/MXPERSON", "MXPERSONSOAP11Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MXPERSONSOAP11Port".equals(portName)) {
            setMXPERSONSOAP11PortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
