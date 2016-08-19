package com.ibm.www.maximo.wsdl.MXWO;

public class MXWOPortTypeProxy implements com.ibm.www.maximo.wsdl.MXWO.MXWOPortType {
  private String _endpoint = null;
  private com.ibm.www.maximo.wsdl.MXWO.MXWOPortType mXWOPortType = null;
  
  public MXWOPortTypeProxy() {
    _initMXWOPortTypeProxy();
  }
  
  public MXWOPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMXWOPortTypeProxy();
  }
  
  private void _initMXWOPortTypeProxy() {
    try {
      mXWOPortType = (new com.ibm.www.maximo.wsdl.MXWO.MXWOLocator()).getMXWOSOAP11Port();
      if (mXWOPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mXWOPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mXWOPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mXWOPortType != null)
      ((javax.xml.rpc.Stub)mXWOPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.www.maximo.wsdl.MXWO.MXWOPortType getMXWOPortType() {
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType;
  }
  
  public com.ibm.www.maximo.QueryMXWOResponseType queryMXWO(com.ibm.www.maximo.QueryMXWOType parameters) throws java.rmi.RemoteException{
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType.queryMXWO(parameters);
  }
  
  public com.ibm.www.maximo.SyncMXWOResponseType syncMXWO(com.ibm.www.maximo.SyncMXWOType parameters) throws java.rmi.RemoteException{
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType.syncMXWO(parameters);
  }
  
  public com.ibm.www.maximo.UpdateMXWOResponseType updateMXWO(com.ibm.www.maximo.UpdateMXWOType parameters) throws java.rmi.RemoteException{
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType.updateMXWO(parameters);
  }
  
  public com.ibm.www.maximo.CreateMXWOResponseType createMXWO(com.ibm.www.maximo.CreateMXWOType parameters) throws java.rmi.RemoteException{
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType.createMXWO(parameters);
  }
  
  public com.ibm.www.maximo.DeleteMXWOResponseType deleteMXWO(com.ibm.www.maximo.DeleteMXWOType parameters) throws java.rmi.RemoteException{
    if (mXWOPortType == null)
      _initMXWOPortTypeProxy();
    return mXWOPortType.deleteMXWO(parameters);
  }
  
  
}