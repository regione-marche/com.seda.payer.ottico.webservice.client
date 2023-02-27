/**
 * OtticoInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.source;

public interface OtticoInterface extends java.rmi.Remote {
    public com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgResponse elaboraFlussiImg(com.seda.payer.ottico.webservice.dati.ElaboraFlussiImgRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse logElaborazioneFlussiImg(com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse recuperaTemplate(com.seda.payer.ottico.webservice.dati.RecuperaTemplateRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaBollettinoResponse stampaBollettino(com.seda.payer.ottico.webservice.dati.StampaBollettinoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaDocumentoResponse stampaDocumento(com.seda.payer.ottico.webservice.dati.StampaDocumentoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaQuietanzaResponse stampaQuietanza(com.seda.payer.ottico.webservice.dati.StampaQuietanzaRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaRelataResponse stampaRelata(com.seda.payer.ottico.webservice.dati.StampaRelataRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse verificaConfigurazioneOttico(com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse verificaFlusso(com.seda.payer.ottico.webservice.dati.VerificaFlussoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.GetListaImmaginiResponse getListaImmagini(com.seda.payer.ottico.webservice.dati.GetListaImmaginiRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoResponse stampaImmagineContenzioso(com.seda.payer.ottico.webservice.dati.StampaImmagineContenziosoRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
    public com.seda.payer.ottico.webservice.dati.StampaImmagineResponse stampaImmagine(com.seda.payer.ottico.webservice.dati.StampaImmagineRequest in) throws java.rmi.RemoteException, com.seda.payer.ottico.webservice.srv.FaultType;
}
