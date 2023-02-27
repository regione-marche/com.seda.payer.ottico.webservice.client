/**
 * OtticoSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.source;

public class OtticoSOAPBindingStub extends org.apache.axis.client.Stub implements com.seda.payer.ottico.webservice.source.OtticoInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("elaboraFlussiImg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "ElaboraFlussiImgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ElaboraFlussiImgRequest"), com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ElaboraFlussiImgResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "ElaboraFlussiImgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logElaborazioneFlussiImg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "LogElaborazioneFlussiImgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">LogElaborazioneFlussiImgRequest"), com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">LogElaborazioneFlussiImgResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "LogElaborazioneFlussiImgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "RecuperaTemplateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">RecuperaTemplateRequest"), com.seda.payer.ottico.webservice.dati.RecuperaTemplateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">RecuperaTemplateResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "RecuperaTemplateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaBollettino");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaBollettinoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaBollettinoRequest"), com.seda.payer.ottico.webservice.dati.StampaBollettinoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaBollettinoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaBollettinoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaDocumentoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaDocumentoRequest"), com.seda.payer.ottico.webservice.dati.StampaDocumentoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaDocumentoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaDocumentoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaQuietanza");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaQuietanzaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaQuietanzaRequest"), com.seda.payer.ottico.webservice.dati.StampaQuietanzaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaQuietanzaResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaQuietanzaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaRelata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaRelataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaRelataRequest"), com.seda.payer.ottico.webservice.dati.StampaRelataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaRelataResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaRelataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaRelataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaConfigurazioneOttico");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "VerificaConfigurazioneOtticoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaConfigurazioneOtticoRequest"), com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaConfigurazioneOtticoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "VerificaConfigurazioneOtticoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaFlusso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "VerificaFlussoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaFlussoRequest"), com.seda.payer.ottico.webservice.dati.VerificaFlussoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaFlussoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "VerificaFlussoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListaImmagini");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "GetListaImmaginiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">GetListaImmaginiRequest"), com.seda.payer.ottico.webservice.dati.GetListaImmaginiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">GetListaImmaginiResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "GetListaImmaginiResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaImmagineContenzioso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaImmagineContenziosoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineContenziosoRequest"), com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineContenziosoResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaImmagineContenziosoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stampaImmagine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaImmagineRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineRequest"), com.seda.payer.ottico.webservice.dati.StampaImmagineRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineResponse"));
        oper.setReturnClass(com.seda.payer.ottico.webservice.dati.StampaImmagineResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "StampaImmagineResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "Fault"),
                      "com.seda.payer.ottico.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[11] = oper;

    }

    public OtticoSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OtticoSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OtticoSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ElaboraFlussiImgRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ElaboraFlussiImgResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">GetListaImmaginiRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.GetListaImmaginiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">GetListaImmaginiResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">LogElaborazioneFlussiImgRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">LogElaborazioneFlussiImgResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">RecuperaTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.RecuperaTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">RecuperaTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ResponseType>retCode");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.ResponseTypeRetCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">ResponseType>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaBollettinoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaBollettinoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaBollettinoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaDocumentoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaDocumentoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaDocumentoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineContenziosoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineContenziosoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaImmagineRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaImmagineResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaQuietanzaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaQuietanzaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaQuietanzaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaRelataRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaRelataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaRelataResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.StampaRelataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaConfigurazioneOtticoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaConfigurazioneOtticoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaFlussoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.VerificaFlussoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaFlussoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "ResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.dati.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://srv.webservice.ottico.payer.seda.com", "FaultType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.ottico.webservice.srv.FaultType.class;
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

    public com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse elaboraFlussiImg(com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "elaboraFlussiImg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse logElaborazioneFlussiImg(com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "logElaborazioneFlussiImg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse recuperaTemplate(com.seda.payer.ottico.webservice.dati.RecuperaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse stampaBollettino(com.seda.payer.ottico.webservice.dati.StampaBollettinoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaBollettino"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse stampaDocumento(com.seda.payer.ottico.webservice.dati.StampaDocumentoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse stampaQuietanza(com.seda.payer.ottico.webservice.dati.StampaQuietanzaRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaQuietanza"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaRelataResponse stampaRelata(com.seda.payer.ottico.webservice.dati.StampaRelataRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaRelata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaRelataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaRelataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaRelataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse verificaConfigurazioneOttico(com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaConfigurazioneOttico"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse verificaFlusso(com.seda.payer.ottico.webservice.dati.VerificaFlussoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaFlusso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse getListaImmagini(com.seda.payer.ottico.webservice.dati.GetListaImmaginiRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getListaImmagini"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse stampaImmagineContenzioso(com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaImmagineContenzioso"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.ottico.webservice.dati.StampaImmagineResponse stampaImmagine(com.seda.payer.ottico.webservice.dati.StampaImmagineRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaImmagine"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.ottico.webservice.dati.StampaImmagineResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.ottico.webservice.dati.StampaImmagineResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.ottico.webservice.dati.StampaImmagineResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.ottico.webservice.srv.FaultType) {
              throw (com.seda.payer.ottico.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
