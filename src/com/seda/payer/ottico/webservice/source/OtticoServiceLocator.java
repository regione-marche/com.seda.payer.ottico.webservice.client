/**
 * OtticoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.source;

public class OtticoServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.ottico.webservice.source.OtticoService {

    public OtticoServiceLocator() {
    }


    public OtticoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OtticoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OtticoPort
    private java.lang.String OtticoPort_address = "http://localhost:8080/OtticoService/ottico";

    public java.lang.String getOtticoPortAddress() {
        return OtticoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OtticoPortWSDDServiceName = "OtticoPort";

    public java.lang.String getOtticoPortWSDDServiceName() {
        return OtticoPortWSDDServiceName;
    }

    public void setOtticoPortWSDDServiceName(java.lang.String name) {
        OtticoPortWSDDServiceName = name;
    }

    public com.seda.payer.ottico.webservice.source.OtticoInterface getOtticoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OtticoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOtticoPort(endpoint);
    }

    public com.seda.payer.ottico.webservice.source.OtticoInterface getOtticoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.ottico.webservice.source.OtticoSOAPBindingStub _stub = new com.seda.payer.ottico.webservice.source.OtticoSOAPBindingStub(portAddress, this);
            _stub.setPortName(getOtticoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOtticoPortEndpointAddress(java.lang.String address) {
        OtticoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.ottico.webservice.source.OtticoInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.ottico.webservice.source.OtticoSOAPBindingStub _stub = new com.seda.payer.ottico.webservice.source.OtticoSOAPBindingStub(new java.net.URL(OtticoPort_address), this);
                _stub.setPortName(getOtticoPortWSDDServiceName());
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
        if ("OtticoPort".equals(inputPortName)) {
            return getOtticoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.webservice.ottico.payer.seda.com", "OtticoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.webservice.ottico.payer.seda.com", "OtticoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OtticoPort".equals(portName)) {
            setOtticoPortEndpointAddress(address);
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
