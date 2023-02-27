/**
 * ConfigurazioneInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.source;

public interface ConfigurazioneInterface extends java.rmi.Remote {
    public com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse creaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse creaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse eliminaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse eliminaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse listaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse listaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse modificaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse modificaParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse dettaglioParametriOttico(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse dettaglioAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
    public com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse verificaAssociaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
}
