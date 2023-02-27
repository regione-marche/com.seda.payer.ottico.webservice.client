/**
 * ManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.manager.source;

public interface ManagerService extends javax.xml.rpc.Service {
    public java.lang.String getManagerPortAddress();

    public com.seda.payer.ottico.webservice.manager.source.ManagerInterface getManagerPort() throws javax.xml.rpc.ServiceException;

    public com.seda.payer.ottico.webservice.manager.source.ManagerInterface getManagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
