/**
 * ManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.manager.source;

public class ManagerServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.ottico.webservice.manager.source.ManagerService {

    public ManagerServiceLocator() {
    }


    public ManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagerPort
    private java.lang.String ManagerPort_address = "http://localhost:8080/ManagerService/manager";

    public java.lang.String getManagerPortAddress() {
        return ManagerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagerPortWSDDServiceName = "ManagerPort";

    public java.lang.String getManagerPortWSDDServiceName() {
        return ManagerPortWSDDServiceName;
    }

    public void setManagerPortWSDDServiceName(java.lang.String name) {
        ManagerPortWSDDServiceName = name;
    }

    public com.seda.payer.ottico.webservice.manager.source.ManagerInterface getManagerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagerPort(endpoint);
    }

    public com.seda.payer.ottico.webservice.manager.source.ManagerInterface getManagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.ottico.webservice.manager.source.ManagerSOAPBindingStub _stub = new com.seda.payer.ottico.webservice.manager.source.ManagerSOAPBindingStub(portAddress, this);
            _stub.setPortName(getManagerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagerPortEndpointAddress(java.lang.String address) {
        ManagerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.ottico.webservice.manager.source.ManagerInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.ottico.webservice.manager.source.ManagerSOAPBindingStub _stub = new com.seda.payer.ottico.webservice.manager.source.ManagerSOAPBindingStub(new java.net.URL(ManagerPort_address), this);
                _stub.setPortName(getManagerPortWSDDServiceName());
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
        if ("ManagerPort".equals(inputPortName)) {
            return getManagerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.manager.webservice.ottico.payer.seda.com", "ManagerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.manager.webservice.ottico.payer.seda.com", "ManagerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagerPort".equals(portName)) {
            setManagerPortEndpointAddress(address);
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
