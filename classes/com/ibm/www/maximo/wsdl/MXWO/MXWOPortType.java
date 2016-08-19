/**
 * MXWOPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.www.maximo.wsdl.MXWO;

public interface MXWOPortType extends java.rmi.Remote {
    public com.ibm.www.maximo.QueryMXWOResponseType queryMXWO(com.ibm.www.maximo.QueryMXWOType parameters) throws java.rmi.RemoteException;
    public com.ibm.www.maximo.SyncMXWOResponseType syncMXWO(com.ibm.www.maximo.SyncMXWOType parameters) throws java.rmi.RemoteException;
    public com.ibm.www.maximo.UpdateMXWOResponseType updateMXWO(com.ibm.www.maximo.UpdateMXWOType parameters) throws java.rmi.RemoteException;
    public com.ibm.www.maximo.CreateMXWOResponseType createMXWO(com.ibm.www.maximo.CreateMXWOType parameters) throws java.rmi.RemoteException;
    public com.ibm.www.maximo.DeleteMXWOResponseType deleteMXWO(com.ibm.www.maximo.DeleteMXWOType parameters) throws java.rmi.RemoteException;
}
