/**
 * RicercaListaElabOtticoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.manager.dati;

public class RicercaListaElabOtticoRequest  implements java.io.Serializable {
    private java.lang.String codiceSocieta;

    private java.lang.String codiceUtente;

    private java.lang.String codiceEnte;

    private java.lang.String siglaProvincia;

    private java.util.Calendar dataElaborazioneDa;

    private java.util.Calendar dataElaborazioneA;

    private java.util.Calendar dataCreazioneDa;

    private java.util.Calendar dataCreazioneA;

    private java.lang.String tipologiaFlusso;

    private java.lang.String statoFlusso;

    private java.lang.Integer rowsPerPage;

    private java.lang.Integer pageNumber;

    private java.lang.String order;

    public RicercaListaElabOtticoRequest() {
    }

    public RicercaListaElabOtticoRequest(
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String codiceEnte,
           java.lang.String siglaProvincia,
           java.util.Calendar dataElaborazioneDa,
           java.util.Calendar dataElaborazioneA,
           java.util.Calendar dataCreazioneDa,
           java.util.Calendar dataCreazioneA,
           java.lang.String tipologiaFlusso,
           java.lang.String statoFlusso,
           java.lang.Integer rowsPerPage,
           java.lang.Integer pageNumber,
           java.lang.String order) {
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.codiceEnte = codiceEnte;
           this.siglaProvincia = siglaProvincia;
           this.dataElaborazioneDa = dataElaborazioneDa;
           this.dataElaborazioneA = dataElaborazioneA;
           this.dataCreazioneDa = dataCreazioneDa;
           this.dataCreazioneA = dataCreazioneA;
           this.tipologiaFlusso = tipologiaFlusso;
           this.statoFlusso = statoFlusso;
           this.rowsPerPage = rowsPerPage;
           this.pageNumber = pageNumber;
           this.order = order;
    }


    /**
     * Gets the codiceSocieta value for this RicercaListaElabOtticoRequest.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this RicercaListaElabOtticoRequest.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this RicercaListaElabOtticoRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this RicercaListaElabOtticoRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnte value for this RicercaListaElabOtticoRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this RicercaListaElabOtticoRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the siglaProvincia value for this RicercaListaElabOtticoRequest.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this RicercaListaElabOtticoRequest.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the dataElaborazioneDa value for this RicercaListaElabOtticoRequest.
     * 
     * @return dataElaborazioneDa
     */
    public java.util.Calendar getDataElaborazioneDa() {
        return dataElaborazioneDa;
    }


    /**
     * Sets the dataElaborazioneDa value for this RicercaListaElabOtticoRequest.
     * 
     * @param dataElaborazioneDa
     */
    public void setDataElaborazioneDa(java.util.Calendar dataElaborazioneDa) {
        this.dataElaborazioneDa = dataElaborazioneDa;
    }


    /**
     * Gets the dataElaborazioneA value for this RicercaListaElabOtticoRequest.
     * 
     * @return dataElaborazioneA
     */
    public java.util.Calendar getDataElaborazioneA() {
        return dataElaborazioneA;
    }


    /**
     * Sets the dataElaborazioneA value for this RicercaListaElabOtticoRequest.
     * 
     * @param dataElaborazioneA
     */
    public void setDataElaborazioneA(java.util.Calendar dataElaborazioneA) {
        this.dataElaborazioneA = dataElaborazioneA;
    }


    /**
     * Gets the dataCreazioneDa value for this RicercaListaElabOtticoRequest.
     * 
     * @return dataCreazioneDa
     */
    public java.util.Calendar getDataCreazioneDa() {
        return dataCreazioneDa;
    }


    /**
     * Sets the dataCreazioneDa value for this RicercaListaElabOtticoRequest.
     * 
     * @param dataCreazioneDa
     */
    public void setDataCreazioneDa(java.util.Calendar dataCreazioneDa) {
        this.dataCreazioneDa = dataCreazioneDa;
    }


    /**
     * Gets the dataCreazioneA value for this RicercaListaElabOtticoRequest.
     * 
     * @return dataCreazioneA
     */
    public java.util.Calendar getDataCreazioneA() {
        return dataCreazioneA;
    }


    /**
     * Sets the dataCreazioneA value for this RicercaListaElabOtticoRequest.
     * 
     * @param dataCreazioneA
     */
    public void setDataCreazioneA(java.util.Calendar dataCreazioneA) {
        this.dataCreazioneA = dataCreazioneA;
    }


    /**
     * Gets the tipologiaFlusso value for this RicercaListaElabOtticoRequest.
     * 
     * @return tipologiaFlusso
     */
    public java.lang.String getTipologiaFlusso() {
        return tipologiaFlusso;
    }


    /**
     * Sets the tipologiaFlusso value for this RicercaListaElabOtticoRequest.
     * 
     * @param tipologiaFlusso
     */
    public void setTipologiaFlusso(java.lang.String tipologiaFlusso) {
        this.tipologiaFlusso = tipologiaFlusso;
    }


    /**
     * Gets the statoFlusso value for this RicercaListaElabOtticoRequest.
     * 
     * @return statoFlusso
     */
    public java.lang.String getStatoFlusso() {
        return statoFlusso;
    }


    /**
     * Sets the statoFlusso value for this RicercaListaElabOtticoRequest.
     * 
     * @param statoFlusso
     */
    public void setStatoFlusso(java.lang.String statoFlusso) {
        this.statoFlusso = statoFlusso;
    }


    /**
     * Gets the rowsPerPage value for this RicercaListaElabOtticoRequest.
     * 
     * @return rowsPerPage
     */
    public java.lang.Integer getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this RicercaListaElabOtticoRequest.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(java.lang.Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the pageNumber value for this RicercaListaElabOtticoRequest.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this RicercaListaElabOtticoRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the order value for this RicercaListaElabOtticoRequest.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this RicercaListaElabOtticoRequest.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RicercaListaElabOtticoRequest)) return false;
        RicercaListaElabOtticoRequest other = (RicercaListaElabOtticoRequest) obj;
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
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia()))) &&
            ((this.dataElaborazioneDa==null && other.getDataElaborazioneDa()==null) || 
             (this.dataElaborazioneDa!=null &&
              this.dataElaborazioneDa.equals(other.getDataElaborazioneDa()))) &&
            ((this.dataElaborazioneA==null && other.getDataElaborazioneA()==null) || 
             (this.dataElaborazioneA!=null &&
              this.dataElaborazioneA.equals(other.getDataElaborazioneA()))) &&
            ((this.dataCreazioneDa==null && other.getDataCreazioneDa()==null) || 
             (this.dataCreazioneDa!=null &&
              this.dataCreazioneDa.equals(other.getDataCreazioneDa()))) &&
            ((this.dataCreazioneA==null && other.getDataCreazioneA()==null) || 
             (this.dataCreazioneA!=null &&
              this.dataCreazioneA.equals(other.getDataCreazioneA()))) &&
            ((this.tipologiaFlusso==null && other.getTipologiaFlusso()==null) || 
             (this.tipologiaFlusso!=null &&
              this.tipologiaFlusso.equals(other.getTipologiaFlusso()))) &&
            ((this.statoFlusso==null && other.getStatoFlusso()==null) || 
             (this.statoFlusso!=null &&
              this.statoFlusso.equals(other.getStatoFlusso()))) &&
            ((this.rowsPerPage==null && other.getRowsPerPage()==null) || 
             (this.rowsPerPage!=null &&
              this.rowsPerPage.equals(other.getRowsPerPage()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder())));
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
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        if (getDataElaborazioneDa() != null) {
            _hashCode += getDataElaborazioneDa().hashCode();
        }
        if (getDataElaborazioneA() != null) {
            _hashCode += getDataElaborazioneA().hashCode();
        }
        if (getDataCreazioneDa() != null) {
            _hashCode += getDataCreazioneDa().hashCode();
        }
        if (getDataCreazioneA() != null) {
            _hashCode += getDataCreazioneA().hashCode();
        }
        if (getTipologiaFlusso() != null) {
            _hashCode += getTipologiaFlusso().hashCode();
        }
        if (getStatoFlusso() != null) {
            _hashCode += getStatoFlusso().hashCode();
        }
        if (getRowsPerPage() != null) {
            _hashCode += getRowsPerPage().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RicercaListaElabOtticoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", ">RicercaListaElabOtticoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "codiceEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "siglaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataElaborazioneDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "dataElaborazioneDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataElaborazioneA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "dataElaborazioneA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCreazioneDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "dataCreazioneDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCreazioneA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "dataCreazioneA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaFlusso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "tipologiaFlusso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoFlusso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "statoFlusso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "rowsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.manager.webservice.ottico.payer.seda.com", "order"));
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
