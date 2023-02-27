/**
 * ConfigurazioneSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.source;

public class ConfigurazioneSOAPBindingStub extends org.apache.axis.client.Stub implements com.seda.payer.ottico.webservice.configurazione.source.ConfigurazioneInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("creaAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "CreaAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "CreaAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("creaParametriOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "CreaParametriOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaParametriOtticoRequest"), com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaParametriOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "CreaParametriOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminaAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "EliminaAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "EliminaAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("eliminaParametriOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "EliminaParametriOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaParametriOtticoRequest"), com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaParametriOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "EliminaParametriOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listaAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListaAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListaAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listaParametriOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListaParametriOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaParametriOtticoRequest"), com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaParametriOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListaParametriOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ModificaAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ModificaAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modificaParametriOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ModificaParametriOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaParametriOtticoRequest"), com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaParametriOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ModificaParametriOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dettaglioParametriOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "DettaglioParametriOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioParametriOtticoRequest"), com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioParametriOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "DettaglioParametriOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dettaglioAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "DettaglioAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "DettaglioAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaAssociaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "VerificaAssociaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateRequest"), com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "VerificaAssociaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.configurazione.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public ConfigurazioneSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ConfigurazioneSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ConfigurazioneSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaParametriOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">CreaParametriOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioParametriOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">DettaglioParametriOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaParametriOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">EliminaParametriOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaParametriOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaParametriOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListResponseType>pageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListResponseTypePageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaParametriOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaParametriOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ResponseType>retCode");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ResponseTypeRetCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ResponseType>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.dati.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://srv.configurazione.webservice.ottico.payer.seda.com", "FaultType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.configurazione.srv.FaultType.class;
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

    public com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse creaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "creaAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse creaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "creaParametriOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse eliminaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "eliminaAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse eliminaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "eliminaParametriOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse listaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listaAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse listaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listaParametriOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse modificaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modificaAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse modificaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modificaParametriOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse dettaglioParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "dettaglioParametriOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse dettaglioAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "dettaglioAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse verificaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaAssociaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.configurazione.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.configurazione.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
