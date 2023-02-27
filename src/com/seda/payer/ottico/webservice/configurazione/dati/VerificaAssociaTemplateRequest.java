/**
 * VerificaAssociaTemplateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.dati;

public class VerificaAssociaTemplateRequest  implements java.io.Serializable {
    private java.lang.String tipoDocumento;

    private java.lang.String codiceSocieta;

    private java.lang.String tipologiaServizio;

    private java.lang.String codiceUtente;

    private java.lang.String codiceEnte;

    private java.util.Calendar dataInizio;

    private java.util.Calendar dataFine;

    private java.lang.String chiaveTemplate;

    public VerificaAssociaTemplateRequest() {
    }

    public VerificaAssociaTemplateRequest(
           java.lang.String tipoDocumento,
           java.lang.String codiceSocieta,
           java.lang.String tipologiaServizio,
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.util.Calendar dataInizio,
           java.util.Calendar dataFine,
           java.lang.String chiaveTemplate) {
           this.tipoDocumento = tipoDocumento;
           this.codiceSocieta = codiceSocieta;
           this.tipologiaServizio = tipologiaServizio;
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.dataInizio = dataInizio;
           this.dataFine = dataFine;
           this.chiaveTemplate = chiaveTemplate;
    }


    /**
     * Gets the tipoDocumento value for this VerificaAssociaTemplateRequest.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this VerificaAssociaTemplateRequest.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the codiceSocieta value for this VerificaAssociaTemplateRequest.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this VerificaAssociaTemplateRequest.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the tipologiaServizio value for this VerificaAssociaTemplateRequest.
     * 
     * @return tipologiaServizio
     */
    public java.lang.String getTipologiaServizio() {
        return tipologiaServizio;
    }


    /**
     * Sets the tipologiaServizio value for this VerificaAssociaTemplateRequest.
     * 
     * @param tipologiaServizio
     */
    public void setTipologiaServizio(java.lang.String tipologiaServizio) {
        this.tipologiaServizio = tipologiaServizio;
    }


    /**
     * Gets the codiceUtente value for this VerificaAssociaTemplateRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this VerificaAssociaTemplateRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this VerificaAssociaTemplateRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this VerificaAssociaTemplateRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the dataInizio value for this VerificaAssociaTemplateRequest.
     * 
     * @return dataInizio
     */
    public java.util.Calendar getDataInizio() {
        return dataInizio;
    }


    /**
     * Sets the dataInizio value for this VerificaAssociaTemplateRequest.
     * 
     * @param dataInizio
     */
    public void setDataInizio(java.util.Calendar dataInizio) {
        this.dataInizio = dataInizio;
    }


    /**
     * Gets the dataFine value for this VerificaAssociaTemplateRequest.
     * 
     * @return dataFine
     */
    public java.util.Calendar getDataFine() {
        return dataFine;
    }


    /**
     * Sets the dataFine value for this VerificaAssociaTemplateRequest.
     * 
     * @param dataFine
     */
    public void setDataFine(java.util.Calendar dataFine) {
        this.dataFine = dataFine;
    }


    /**
     * Gets the chiaveTemplate value for this VerificaAssociaTemplateRequest.
     * 
     * @return chiaveTemplate
     */
    public java.lang.String getChiaveTemplate() {
        return chiaveTemplate;
    }


    /**
     * Sets the chiaveTemplate value for this VerificaAssociaTemplateRequest.
     * 
     * @param chiaveTemplate
     */
    public void setChiaveTemplate(java.lang.String chiaveTemplate) {
        this.chiaveTemplate = chiaveTemplate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaAssociaTemplateRequest)) return false;
        VerificaAssociaTemplateRequest other = (VerificaAssociaTemplateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.codiceSocieta==null && other.getCodiceSocieta()==null) || 
             (this.codiceSocieta!=null &&
              this.codiceSocieta.equals(other.getCodiceSocieta()))) &&
            ((this.tipologiaServizio==null && other.getTipologiaServizio()==null) || 
             (this.tipologiaServizio!=null &&
              this.tipologiaServizio.equals(other.getTipologiaServizio()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.dataInizio==null && other.getDataInizio()==null) || 
             (this.dataInizio!=null &&
              this.dataInizio.equals(other.getDataInizio()))) &&
            ((this.dataFine==null && other.getDataFine()==null) || 
             (this.dataFine!=null &&
              this.dataFine.equals(other.getDataFine()))) &&
            ((this.chiaveTemplate==null && other.getChiaveTemplate()==null) || 
             (this.chiaveTemplate!=null &&
              this.chiaveTemplate.equals(other.getChiaveTemplate())));
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
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getCodiceSocieta() != null) {
            _hashCode += getCodiceSocieta().hashCode();
        }
        if (getTipologiaServizio() != null) {
            _hashCode += getTipologiaServizio().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getDataInizio() != null) {
            _hashCode += getDataInizio().hashCode();
        }
        if (getDataFine() != null) {
            _hashCode += getDataFine().hashCode();
        }
        if (getChiaveTemplate() != null) {
            _hashCode += getChiaveTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaAssociaTemplateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "tipologiaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "dataInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "dataFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "chiaveTemplate"));
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
