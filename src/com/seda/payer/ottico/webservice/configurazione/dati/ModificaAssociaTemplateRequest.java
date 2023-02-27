/**
 * ModificaAssociaTemplateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.dati;

public class ModificaAssociaTemplateRequest  implements java.io.Serializable {
    private java.lang.String chiaveTemplate;

    private java.lang.String codiceSocieta;

    private java.lang.String codiceUtente;

    private java.lang.String codiceEnte;

    private java.lang.String tipoBollettino;

    private java.util.Calendar dataInizio;

    private java.util.Calendar dataFine;

    private java.lang.String tipologiaServizio;

    private java.lang.String tipoDocumento;

    private java.lang.String riferimentoTemplate;

    private java.util.Calendar dataUltimoAgg;

    private java.lang.String operatore;

    public ModificaAssociaTemplateRequest() {
    }

    public ModificaAssociaTemplateRequest(
           java.lang.String chiaveTemplate,
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String tipoBollettino,
           java.util.Calendar dataInizio,
           java.util.Calendar dataFine,
           java.lang.String tipologiaServizio,
           java.lang.String tipoDocumento,
           java.lang.String riferimentoTemplate,
           java.util.Calendar dataUltimoAgg,
           java.lang.String operatore) {
           this.chiaveTemplate = chiaveTemplate;
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.tipoBollettino = tipoBollettino;
           this.dataInizio = dataInizio;
           this.dataFine = dataFine;
           this.tipologiaServizio = tipologiaServizio;
           this.tipoDocumento = tipoDocumento;
           this.riferimentoTemplate = riferimentoTemplate;
           this.dataUltimoAgg = dataUltimoAgg;
           this.operatore = operatore;
    }


    /**
     * Gets the chiaveTemplate value for this ModificaAssociaTemplateRequest.
     * 
     * @return chiaveTemplate
     */
    public java.lang.String getChiaveTemplate() {
        return chiaveTemplate;
    }


    /**
     * Sets the chiaveTemplate value for this ModificaAssociaTemplateRequest.
     * 
     * @param chiaveTemplate
     */
    public void setChiaveTemplate(java.lang.String chiaveTemplate) {
        this.chiaveTemplate = chiaveTemplate;
    }


    /**
     * Gets the codiceSocieta value for this ModificaAssociaTemplateRequest.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this ModificaAssociaTemplateRequest.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this ModificaAssociaTemplateRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this ModificaAssociaTemplateRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this ModificaAssociaTemplateRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this ModificaAssociaTemplateRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the tipoBollettino value for this ModificaAssociaTemplateRequest.
     * 
     * @return tipoBollettino
     */
    public java.lang.String getTipoBollettino() {
        return tipoBollettino;
    }


    /**
     * Sets the tipoBollettino value for this ModificaAssociaTemplateRequest.
     * 
     * @param tipoBollettino
     */
    public void setTipoBollettino(java.lang.String tipoBollettino) {
        this.tipoBollettino = tipoBollettino;
    }


    /**
     * Gets the dataInizio value for this ModificaAssociaTemplateRequest.
     * 
     * @return dataInizio
     */
    public java.util.Calendar getDataInizio() {
        return dataInizio;
    }


    /**
     * Sets the dataInizio value for this ModificaAssociaTemplateRequest.
     * 
     * @param dataInizio
     */
    public void setDataInizio(java.util.Calendar dataInizio) {
        this.dataInizio = dataInizio;
    }


    /**
     * Gets the dataFine value for this ModificaAssociaTemplateRequest.
     * 
     * @return dataFine
     */
    public java.util.Calendar getDataFine() {
        return dataFine;
    }


    /**
     * Sets the dataFine value for this ModificaAssociaTemplateRequest.
     * 
     * @param dataFine
     */
    public void setDataFine(java.util.Calendar dataFine) {
        this.dataFine = dataFine;
    }


    /**
     * Gets the tipologiaServizio value for this ModificaAssociaTemplateRequest.
     * 
     * @return tipologiaServizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this ModificaAssociaTemplateRequest.
     * 
     * @param tipologiaServizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the tipoDocumento value for this ModificaAssociaTemplateRequest.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ModificaAssociaTemplateRequest.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the riferimentoTemplate value for this ModificaAssociaTemplateRequest.
     * 
     * @return riferimentoTemplate
     */
    public java.lang.String getRiferimentoTemplate() {
        return riferimentoTemplate;
    }


    /**
     * Sets the riferimentoTemplate value for this ModificaAssociaTemplateRequest.
     * 
     * @param riferimentoTemplate
     */
    public void setRiferimentoTemplate(java.lang.String riferimentoTemplate) {
        this.riferimentoTemplate = riferimentoTemplate;
    }


    /**
     * Gets the dataUltimoAgg value for this ModificaAssociaTemplateRequest.
     * 
     * @return dataUltimoAgg
     */
    public java.util.Calendar getDataUltimoAgg() {
        return dataUltimoAgg;
    }


    /**
     * Sets the dataUltimoAgg value for this ModificaAssociaTemplateRequest.
     * 
     * @param dataUltimoAgg
     */
    public void setDataUltimoAgg(java.util.Calendar dataUltimoAgg) {
        this.dataUltimoAgg = dataUltimoAgg;
    }


    /**
     * Gets the operatore value for this ModificaAssociaTemplateRequest.
     * 
     * @return operatore
     */
    public java.lang.String getOperatore() {
        return operatore;
    }


    /**
     * Sets the operatore value for this ModificaAssociaTemplateRequest.
     * 
     * @param operatore
     */
    public void setOperatore(java.lang.String operatore) {
        this.operatore = operatore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModificaAssociaTemplateRequest)) return false;
        ModificaAssociaTemplateRequest other = (ModificaAssociaTemplateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTemplate==null && other.getChiaveTemplate()==null) || 
             (this.chiaveTemplate!=null &&
              this.chiaveTemplate.equals(other.getChiaveTemplate()))) &&
            ((this.codiceSocieta==null && other.getCodiceSocieta()==null) || 
             (this.codiceSocieta!=null &&
              this.codiceSocieta.equals(other.getCodiceSocieta()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.tipoBollettino==null && other.getTipoBollettino()==null) || 
             (this.tipoBollettino!=null &&
              this.tipoBollettino.equals(other.getTipoBollettino()))) &&
            ((this.dataInizio==null && other.getDataInizio()==null) || 
             (this.dataInizio!=null &&
              this.dataInizio.equals(other.getDataInizio()))) &&
            ((this.dataFine==null && other.getDataFine()==null) || 
             (this.dataFine!=null &&
              this.dataFine.equals(other.getDataFine()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.riferimentoTemplate==null && other.getRiferimentoTemplate()==null) || 
             (this.riferimentoTemplate!=null &&
              this.riferimentoTemplate.equals(other.getRiferimentoTemplate()))) &&
            ((this.dataUltimoAgg==null && other.getDataUltimoAgg()==null) || 
             (this.dataUltimoAgg!=null &&
              this.dataUltimoAgg.equals(other.getDataUltimoAgg()))) &&
            ((this.operatore==null && other.getOperatore()==null) || 
             (this.operatore!=null &&
              this.operatore.equals(other.getOperatore())));
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
        if (getChiaveTemplate() != null) {
            _hashCode += getChiaveTemplate().hashCode();
        }
        if (getCodiceSocieta() != null) {
            _hashCode += getCodiceSocieta().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getTipoBollettino() != null) {
            _hashCode += getTipoBollettino().hashCode();
        }
        if (getDataInizio() != null) {
            _hashCode += getDataInizio().hashCode();
        }
        if (getDataFine() != null) {
            _hashCode += getDataFine().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getRiferimentoTemplate() != null) {
            _hashCode += getRiferimentoTemplate().hashCode();
        }
        if (getDataUltimoAgg() != null) {
            _hashCode += getDataUltimoAgg().hashCode();
        }
        if (getOperatore() != null) {
            _hashCode += getOperatore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModificaAssociaTemplateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ModificaAssociaTemplateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "chiaveTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "tipoBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "dataInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "dataFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riferimentoTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "riferimentoTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimoAgg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "dataUltimoAgg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "operatore"));
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
