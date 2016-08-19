/**
 * MXWOLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo.wsdl.MXWO;

public class MXWOLocator extends org.apache.axis.client.Service implements com.ibm.www.maximo.wsdl.MXWO.MXWO {

    public MXWOLocator() {
    }


    public MXWOLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MXWOLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MXWOSOAP11Port
    private java.lang.String MXWOSOAP11Port_address = "http://localhost:7001/meaweb/services/MXWO";

    public java.lang.String getMXWOSOAP11PortAddress() {
        return MXWOSOAP11Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MXWOSOAP11PortWSDDServiceName = "MXWOSOAP11Port";

    public java.lang.String getMXWOSOAP11PortWSDDServiceName() {
        return MXWOSOAP11PortWSDDServiceName;
    }

    public void setMXWOSOAP11PortWSDDServiceName(java.lang.String name) {
        MXWOSOAP11PortWSDDServiceName = name;
    }

    public com.ibm.www.maximo.wsdl.MXWO.MXWOPortType getMXWOSOAP11Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MXWOSOAP11Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMXWOSOAP11Port(endpoint);
    }

    public com.ibm.www.maximo.wsdl.MXWO.MXWOPortType getMXWOSOAP11Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.www.maximo.wsdl.MXWO.MXWOSOAP11BindingStub _stub = new com.ibm.www.maximo.wsdl.MXWO.MXWOSOAP11BindingStub(portAddress, this);
            _stub.setPortName(getMXWOSOAP11PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMXWOSOAP11PortEndpointAddress(java.lang.String address) {
        MXWOSOAP11Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.www.maximo.wsdl.MXWO.MXWOPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.www.maximo.wsdl.MXWO.MXWOSOAP11BindingStub _stub = new com.ibm.www.maximo.wsdl.MXWO.MXWOSOAP11BindingStub(new java.net.URL(MXWOSOAP11Port_address), this);
                _stub.setPortName(getMXWOSOAP11PortWSDDServiceName());
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
        if ("MXWOSOAP11Port".equals(inputPortName)) {
            return getMXWOSOAP11Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.ibm.com/maximo/wsdl/MXWO", "MXWO");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.ibm.com/maximo/wsdl/MXWO", "MXWOSOAP11Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MXWOSOAP11Port".equals(portName)) {
            setMXWOSOAP11PortEndpointAddress(address);
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
