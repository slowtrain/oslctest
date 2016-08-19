package com.ibm.www.maximo.wsdl.MXPERSON;

public class MXPERSONPortTypeProxy implements com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType {
  private String _endpoint = null;
  private com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType mXPERSONPortType = null;
  
  public MXPERSONPortTypeProxy() {
    _initMXPERSONPortTypeProxy();
  }
  
  public MXPERSONPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMXPERSONPortTypeProxy();
  }
  
  private void _initMXPERSONPortTypeProxy() {
    try {
      mXPERSONPortType = (new com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONLocator()).getMXPERSONSOAP11Port();
      if (mXPERSONPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mXPERSONPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mXPERSONPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mXPERSONPortType != null)
      ((javax.xml.rpc.Stub)mXPERSONPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType getMXPERSONPortType() {
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType;
  }
  
  public com.ibm.www.maximo.QueryMXPERSONResponseType queryMXPERSON(com.ibm.www.maximo.QueryMXPERSONType parameters) throws java.rmi.RemoteException{
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType.queryMXPERSON(parameters);
  }
  
  public com.ibm.www.maximo.SyncMXPERSONResponseType syncMXPERSON(com.ibm.www.maximo.SyncMXPERSONType parameters) throws java.rmi.RemoteException{
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType.syncMXPERSON(parameters);
  }
  
  public com.ibm.www.maximo.UpdateMXPERSONResponseType updateMXPERSON(com.ibm.www.maximo.UpdateMXPERSONType parameters) throws java.rmi.RemoteException{
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType.updateMXPERSON(parameters);
  }
  
  public com.ibm.www.maximo.CreateMXPERSONResponseType createMXPERSON(com.ibm.www.maximo.CreateMXPERSONType parameters) throws java.rmi.RemoteException{
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType.createMXPERSON(parameters);
  }
  
  public com.ibm.www.maximo.DeleteMXPERSONResponseType deleteMXPERSON(com.ibm.www.maximo.DeleteMXPERSONType parameters) throws java.rmi.RemoteException{
    if (mXPERSONPortType == null)
      _initMXPERSONPortTypeProxy();
    return mXPERSONPortType.deleteMXPERSON(parameters);
  }
  
  
}