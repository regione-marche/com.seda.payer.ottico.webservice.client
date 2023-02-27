/**
 * StampaDocumentoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class StampaDocumentoRequest  implements java.io.Serializable {
    private java.lang.String codiceSocieta;

    private java.lang.String codiceUtente;

    private java.lang.String chiaveEnte;

    private java.lang.String codiceEnte;

    private java.lang.String dettaglioDocumentoXml;

    private java.lang.String listaScadenzeXml;

    private java.lang.String listaTributiXml;

    private java.lang.String listaMovimentiXml;

    private java.lang.String numeroDocumento;

    private java.lang.String flagDocumento;

    private java.lang.String flagWebServiceOttico;

    private java.lang.String indirizzoWebServiceOttico;

    private java.lang.String userWebServiceOttico;

    private java.lang.String passwordWebServiceOttico;

    private java.lang.String codiceFiscale;

    private java.lang.String codiceImpostaServizio;

    public StampaDocumentoRequest() {
    }

    public StampaDocumentoRequest(
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String chiaveEnte,
           java.lang.String codiceEnte,
           java.lang.String dettaglioDocumentoXml,
           java.lang.String listaScadenzeXml,
           java.lang.String listaTributiXml,
           java.lang.String listaMovimentiXml,
           java.lang.String numeroDocumento,
           java.lang.String flagDocumento,
           java.lang.String flagWebServiceOttico,
           java.lang.String indirizzoWebServiceOttico,
           java.lang.String userWebServiceOttico,
           java.lang.String passwordWebServiceOttico) {
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.chiaveEnte = chiaveEnte;
           this.codiceEnte = codiceEnte;
           this.dettaglioDocumentoXml = dettaglioDocumentoXml;
           this.listaScadenzeXml = listaScadenzeXml;
           this.listaTributiXml = listaTributiXml;
           this.listaMovimentiXml = listaMovimentiXml;
           this.numeroDocumento = numeroDocumento;
           this.flagDocumento = flagDocumento;
           this.flagWebServiceOttico = flagWebServiceOttico;
           this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
           this.userWebServiceOttico = userWebServiceOttico;
           this.passwordWebServiceOttico = passwordWebServiceOttico;
    }

    public StampaDocumentoRequest(
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String chiaveEnte,
           java.lang.String codiceEnte,
           java.lang.String dettaglioDocumentoXml,
           java.lang.String listaScadenzeXml,
           java.lang.String listaTributiXml,
           java.lang.String listaMovimentiXml,
           java.lang.String numeroDocumento,
           java.lang.String flagDocumento,
           java.lang.String flagWebServiceOttico,
           java.lang.String indirizzoWebServiceOttico,
           java.lang.String userWebServiceOttico,
           java.lang.String passwordWebServiceOttico,
           java.lang.String codiceFiscale,
           java.lang.String codiceImpostaServizio) {
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.chiaveEnte = chiaveEnte;
           this.codiceEnte = codiceEnte;
           this.dettaglioDocumentoXml = dettaglioDocumentoXml;
           this.listaScadenzeXml = listaScadenzeXml;
           this.listaTributiXml = listaTributiXml;
           this.listaMovimentiXml = listaMovimentiXml;
           this.numeroDocumento = numeroDocumento;
           this.flagDocumento = flagDocumento;
           this.flagWebServiceOttico = flagWebServiceOttico;
           this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
           this.userWebServiceOttico = userWebServiceOttico;
           this.passwordWebServiceOttico = passwordWebServiceOttico;
           this.codiceFiscale = codiceFiscale;
           this.codiceImpostaServizio = codiceImpostaServizio;
    }


    /**
     * Gets the codiceSocieta value for this StampaDocumentoRequest.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this StampaDocumentoRequest.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this StampaDocumentoRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this StampaDocumentoRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the chiaveEnte value for this StampaDocumentoRequest.
     * 
     * @return chiaveEnte
     */
    public java.lang.String getChiaveEnte() {
        return chiaveEnte;
    }


    /**
     * Sets the chiaveEnte value for this StampaDocumentoRequest.
     * 
     * @param chiaveEnte
     */
    public void setChiaveEnte(java.lang.String chiaveEnte) {
        this.chiaveEnte = chiaveEnte;
    }


    /**
     * Gets the codiceEnte value for this StampaDocumentoRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this StampaDocumentoRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the dettaglioDocumentoXml value for this StampaDocumentoRequest.
     * 
     * @return dettaglioDocumentoXml
     */
    public java.lang.String getDettaglioDocumentoXml() {
        return dettaglioDocumentoXml;
    }


    /**
     * Sets the dettaglioDocumentoXml value for this StampaDocumentoRequest.
     * 
     * @param dettaglioDocumentoXml
     */
    public void setDettaglioDocumentoXml(java.lang.String dettaglioDocumentoXml) {
        this.dettaglioDocumentoXml = dettaglioDocumentoXml;
    }


    /**
     * Gets the listaScadenzeXml value for this StampaDocumentoRequest.
     * 
     * @return listaScadenzeXml
     */
    public java.lang.String getListaScadenzeXml() {
        return listaScadenzeXml;
    }


    /**
     * Sets the listaScadenzeXml value for this StampaDocumentoRequest.
     * 
     * @param listaScadenzeXml
     */
    public void setListaScadenzeXml(java.lang.String listaScadenzeXml) {
        this.listaScadenzeXml = listaScadenzeXml;
    }


    /**
     * Gets the listaTributiXml value for this StampaDocumentoRequest.
     * 
     * @return listaTributiXml
     */
    public java.lang.String getListaTributiXml() {
        return listaTributiXml;
    }


    /**
     * Sets the listaTributiXml value for this StampaDocumentoRequest.
     * 
     * @param listaTributiXml
     */
    public void setListaTributiXml(java.lang.String listaTributiXml) {
        this.listaTributiXml = listaTributiXml;
    }


    /**
     * Gets the listaMovimentiXml value for this StampaDocumentoRequest.
     * 
     * @return listaMovimentiXml
     */
    public java.lang.String getListaMovimentiXml() {
        return listaMovimentiXml;
    }


    /**
     * Sets the listaMovimentiXml value for this StampaDocumentoRequest.
     * 
     * @param listaMovimentiXml
     */
    public void setListaMovimentiXml(java.lang.String listaMovimentiXml) {
        this.listaMovimentiXml = listaMovimentiXml;
    }


    /**
     * Gets the numeroDocumento value for this StampaDocumentoRequest.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this StampaDocumentoRequest.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the flagDocumento value for this StampaDocumentoRequest.
     * 
     * @return flagDocumento
     */
    public java.lang.String getFlagDocumento() {
        return flagDocumento;
    }


    /**
     * Sets the flagDocumento value for this StampaDocumentoRequest.
     * 
     * @param flagDocumento
     */
    public void setFlagDocumento(java.lang.String flagDocumento) {
        this.flagDocumento = flagDocumento;
    }


    /**
     * Gets the flagWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @return flagWebServiceOttico
     */
    public java.lang.String getFlagWebServiceOttico() {
        return flagWebServiceOttico;
    }


    /**
     * Sets the flagWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @param flagWebServiceOttico
     */
    public void setFlagWebServiceOttico(java.lang.String flagWebServiceOttico) {
        this.flagWebServiceOttico = flagWebServiceOttico;
    }


    /**
     * Gets the indirizzoWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @return indirizzoWebServiceOttico
     */
    public java.lang.String getIndirizzoWebServiceOttico() {
        return indirizzoWebServiceOttico;
    }


    /**
     * Sets the indirizzoWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @param indirizzoWebServiceOttico
     */
    public void setIndirizzoWebServiceOttico(java.lang.String indirizzoWebServiceOttico) {
        this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
    }


    /**
     * Gets the userWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @return userWebServiceOttico
     */
    public java.lang.String getUserWebServiceOttico() {
        return userWebServiceOttico;
    }


    /**
     * Sets the userWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @param userWebServiceOttico
     */
    public void setUserWebServiceOttico(java.lang.String userWebServiceOttico) {
        this.userWebServiceOttico = userWebServiceOttico;
    }


    /**
     * Gets the passwordWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @return passwordWebServiceOttico
     */
    public java.lang.String getPasswordWebServiceOttico() {
        return passwordWebServiceOttico;
    }


    /**
     * Sets the passwordWebServiceOttico value for this StampaDocumentoRequest.
     * 
     * @param passwordWebServiceOttico
     */
    public void setPasswordWebServiceOttico(java.lang.String passwordWebServiceOttico) {
        this.passwordWebServiceOttico = passwordWebServiceOttico;
    }


    /**
     * Gets the codiceFiscale value for this StampaDocumentoRequest.
     * 
     * @return codiceFiscale
     */
    public java.lang.String getCodiceFiscale() {
        return codiceFiscale;
    }


    /**
     * Sets the codiceFiscale value for this StampaDocumentoRequest.
     * 
     * @param codiceFiscale
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }


    /**
     * Gets the codiceImpostaServizio value for this StampaDocumentoRequest.
     * 
     * @return codiceImpostaServizio
     */
    public java.lang.String getCodiceImpostaServizio() {
        return codiceImpostaServizio;
    }


    /**
     * Sets the codiceImpostaServizio value for this StampaDocumentoRequest.
     * 
     * @param codiceImpostaServizio
     */
    public void setCodiceImpostaServizio(java.lang.String codiceImpostaServizio) {
        this.codiceImpostaServizio = codiceImpostaServizio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StampaDocumentoRequest)) return false;
        StampaDocumentoRequest other = (StampaDocumentoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceSocieta==null && other.getCodiceSocieta()==null) || 
             (this.codiceSocieta!=null &&
              this.codiceSocieta.equals(other.getCodiceSocieta()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.chiaveEnte==null && other.getChiaveEnte()==null) || 
             (this.chiaveEnte!=null &&
              this.chiaveEnte.equals(other.getChiaveEnte()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.dettaglioDocumentoXml==null && other.getDettaglioDocumentoXml()==null) || 
             (this.dettaglioDocumentoXml!=null &&
              this.dettaglioDocumentoXml.equals(other.getDettaglioDocumentoXml()))) &&
            ((this.listaScadenzeXml==null && other.getListaScadenzeXml()==null) || 
             (this.listaScadenzeXml!=null &&
              this.listaScadenzeXml.equals(other.getListaScadenzeXml()))) &&
            ((this.listaTributiXml==null && other.getListaTributiXml()==null) || 
             (this.listaTributiXml!=null &&
              this.listaTributiXml.equals(other.getListaTributiXml()))) &&
            ((this.listaMovimentiXml==null && other.getListaMovimentiXml()==null) || 
             (this.listaMovimentiXml!=null &&
              this.listaMovimentiXml.equals(other.getListaMovimentiXml()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.flagDocumento==null && other.getFlagDocumento()==null) || 
             (this.flagDocumento!=null &&
              this.flagDocumento.equals(other.getFlagDocumento()))) &&
            ((this.flagWebServiceOttico==null && other.getFlagWebServiceOttico()==null) || 
             (this.flagWebServiceOttico!=null &&
              this.flagWebServiceOttico.equals(other.getFlagWebServiceOttico()))) &&
            ((this.indirizzoWebServiceOttico==null && other.getIndirizzoWebServiceOttico()==null) || 
             (this.indirizzoWebServiceOttico!=null &&
              this.indirizzoWebServiceOttico.equals(other.getIndirizzoWebServiceOttico()))) &&
            ((this.userWebServiceOttico==null && other.getUserWebServiceOttico()==null) || 
             (this.userWebServiceOttico!=null &&
              this.userWebServiceOttico.equals(other.getUserWebServiceOttico()))) &&
            ((this.passwordWebServiceOttico==null && other.getPasswordWebServiceOttico()==null) || 
             (this.passwordWebServiceOttico!=null &&
              this.passwordWebServiceOttico.equals(other.getPasswordWebServiceOttico()))) &&
            ((this.codiceFiscale==null && other.getCodiceFiscale()==null) || 
             (this.codiceFiscale!=null &&
              this.codiceFiscale.equals(other.getCodiceFiscale()))) &&
            ((this.codiceImpostaServizio==null && other.getCodiceImpostaServizio()==null) || 
             (this.codiceImpostaServizio!=null &&
              this.codiceImpostaServizio.equals(other.getCodiceImpostaServizio())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodiceSocieta() != null) {
            _hashCode += getCodiceSocieta().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getChiaveEnte() != null) {
            _hashCode += getChiaveEnte().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getDettaglioDocumentoXml() != null) {
            _hashCode += getDettaglioDocumentoXml().hashCode();
        }
        if (getListaScadenzeXml() != null) {
            _hashCode += getListaScadenzeXml().hashCode();
        }
        if (getListaTributiXml() != null) {
            _hashCode += getListaTributiXml().hashCode();
        }
        if (getListaMovimentiXml() != null) {
            _hashCode += getListaMovimentiXml().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getFlagDocumento() != null) {
            _hashCode += getFlagDocumento().hashCode();
        }
        if (getFlagWebServiceOttico() != null) {
            _hashCode += getFlagWebServiceOttico().hashCode();
        }
        if (getIndirizzoWebServiceOttico() != null) {
            _hashCode += getIndirizzoWebServiceOttico().hashCode();
        }
        if (getUserWebServiceOttico() != null) {
            _hashCode += getUserWebServiceOttico().hashCode();
        }
        if (getPasswordWebServiceOttico() != null) {
            _hashCode += getPasswordWebServiceOttico().hashCode();
        }
        if (getCodiceFiscale() != null) {
            _hashCode += getCodiceFiscale().hashCode();
        }
        if (getCodiceImpostaServizio() != null) {
            _hashCode += getCodiceImpostaServizio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StampaDocumentoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaDocumentoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "chiaveEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dettaglioDocumentoXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "dettaglioDocumentoXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaScadenzeXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "listaScadenzeXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTributiXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "listaTributiXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaMovimentiXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "listaMovimentiXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "flagDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagWebServiceOttico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "flagWebServiceOttico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoWebServiceOttico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "indirizzoWebServiceOttico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userWebServiceOttico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "userWebServiceOttico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordWebServiceOttico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "passwordWebServiceOttico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceFiscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceImpostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
