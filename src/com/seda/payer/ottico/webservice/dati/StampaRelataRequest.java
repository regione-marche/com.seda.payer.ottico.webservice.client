/**
 * StampaRelataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class StampaRelataRequest  implements java.io.Serializable {
    private java.lang.String numeroDocumento;

    private java.lang.String codiceSocieta;

    private java.lang.String codiceUtente;

    private java.lang.String chiaveEnte;

    private java.lang.String codiceEnte;

    private java.lang.String flagWebServiceOttico;

    private java.lang.String indirizzoWebServiceOttico;

    private java.lang.String userWebServiceOttico;

    private java.lang.String passwordWebServiceOttico;

    public StampaRelataRequest() {
    }

    public StampaRelataRequest(
           java.lang.String numeroDocumento,
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String chiaveEnte,
           java.lang.String codiceEnte,
           java.lang.String flagWebServiceOttico,
           java.lang.String indirizzoWebServiceOttico,
           java.lang.String userWebServiceOttico,
           java.lang.String passwordWebServiceOttico) {
           this.numeroDocumento = numeroDocumento;
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.chiaveEnte = chiaveEnte;
           this.codiceEnte = codiceEnte;
           this.flagWebServiceOttico = flagWebServiceOttico;
           this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
           this.userWebServiceOttico = userWebServiceOttico;
           this.passwordWebServiceOttico = passwordWebServiceOttico;
    }


    /**
     * Gets the numeroDocumento value for this StampaRelataRequest.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this StampaRelataRequest.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the codiceSocieta value for this StampaRelataRequest.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this StampaRelataRequest.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this StampaRelataRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this StampaRelataRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the chiaveEnte value for this StampaRelataRequest.
     * 
     * @return chiaveEnte
     */
    public java.lang.String getChiaveEnte() {
        return chiaveEnte;
    }


    /**
     * Sets the chiaveEnte value for this StampaRelataRequest.
     * 
     * @param chiaveEnte
     */
    public void setChiaveEnte(java.lang.String chiaveEnte) {
        this.chiaveEnte = chiaveEnte;
    }


    /**
     * Gets the codiceEnte value for this StampaRelataRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this StampaRelataRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the flagWebServiceOttico value for this StampaRelataRequest.
     * 
     * @return flagWebServiceOttico
     */
    public java.lang.String getFlagWebServiceOttico() {
        return flagWebServiceOttico;
    }


    /**
     * Sets the flagWebServiceOttico value for this StampaRelataRequest.
     * 
     * @param flagWebServiceOttico
     */
    public void setFlagWebServiceOttico(java.lang.String flagWebServiceOttico) {
        this.flagWebServiceOttico = flagWebServiceOttico;
    }


    /**
     * Gets the indirizzoWebServiceOttico value for this StampaRelataRequest.
     * 
     * @return indirizzoWebServiceOttico
     */
    public java.lang.String getIndirizzoWebServiceOttico() {
        return indirizzoWebServiceOttico;
    }


    /**
     * Sets the indirizzoWebServiceOttico value for this StampaRelataRequest.
     * 
     * @param indirizzoWebServiceOttico
     */
    public void setIndirizzoWebServiceOttico(java.lang.String indirizzoWebServiceOttico) {
        this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
    }


    /**
     * Gets the userWebServiceOttico value for this StampaRelataRequest.
     * 
     * @return userWebServiceOttico
     */
    public java.lang.String getUserWebServiceOttico() {
        return userWebServiceOttico;
    }


    /**
     * Sets the userWebServiceOttico value for this StampaRelataRequest.
     * 
     * @param userWebServiceOttico
     */
    public void setUserWebServiceOttico(java.lang.String userWebServiceOttico) {
        this.userWebServiceOttico = userWebServiceOttico;
    }


    /**
     * Gets the passwordWebServiceOttico value for this StampaRelataRequest.
     * 
     * @return passwordWebServiceOttico
     */
    public java.lang.String getPasswordWebServiceOttico() {
        return passwordWebServiceOttico;
    }


    /**
     * Sets the passwordWebServiceOttico value for this StampaRelataRequest.
     * 
     * @param passwordWebServiceOttico
     */
    public void setPasswordWebServiceOttico(java.lang.String passwordWebServiceOttico) {
        this.passwordWebServiceOttico = passwordWebServiceOttico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StampaRelataRequest)) return false;
        StampaRelataRequest other = (StampaRelataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
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
              this.passwordWebServiceOttico.equals(other.getPasswordWebServiceOttico())));
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
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StampaRelataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaRelataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
