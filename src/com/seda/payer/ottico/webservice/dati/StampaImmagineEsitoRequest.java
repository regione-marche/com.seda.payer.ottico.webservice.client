/**
 * StampaImmagineEsitoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class StampaImmagineEsitoRequest  implements java.io.Serializable {
    private java.lang.String idDocBarcode;

    private java.lang.String flagAccesso;

    private java.lang.Boolean pdfExt;

    private java.lang.String flagDocumento;

    private java.lang.String flagWebServiceOttico;

    private java.lang.String indirizzoWebServiceOttico;

    private java.lang.String userWebServiceOttico;

    private java.lang.String passwordWebServiceOttico;

    public StampaImmagineEsitoRequest() {
    }

    public StampaImmagineEsitoRequest(
           java.lang.String idDocBarcode,
           java.lang.String flagAccesso,
           java.lang.Boolean pdfExt,
           java.lang.String flagDocumento,
           java.lang.String flagWebServiceOttico,
           java.lang.String indirizzoWebServiceOttico,
           java.lang.String userWebServiceOttico,
           java.lang.String passwordWebServiceOttico) {
           this.idDocBarcode = idDocBarcode;
           this.flagAccesso = flagAccesso;
           this.pdfExt = pdfExt;
           this.flagDocumento = flagDocumento;
           this.flagWebServiceOttico = flagWebServiceOttico;
           this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
           this.userWebServiceOttico = userWebServiceOttico;
           this.passwordWebServiceOttico = passwordWebServiceOttico;
    }


    /**
     * Gets the idDocBarcode value for this StampaImmagineEsitoRequest.
     * 
     * @return idDocBarcode
     */
    public java.lang.String getIdDocBarcode() {
        return idDocBarcode;
    }


    /**
     * Sets the idDocBarcode value for this StampaImmagineEsitoRequest.
     * 
     * @param idDocBarcode
     */
    public void setIdDocBarcode(java.lang.String idDocBarcode) {
        this.idDocBarcode = idDocBarcode;
    }


    /**
     * Gets the flagAccesso value for this StampaImmagineEsitoRequest.
     * 
     * @return flagAccesso
     */
    public java.lang.String getFlagAccesso() {
        return flagAccesso;
    }


    /**
     * Sets the flagAccesso value for this StampaImmagineEsitoRequest.
     * 
     * @param flagAccesso
     */
    public void setFlagAccesso(java.lang.String flagAccesso) {
        this.flagAccesso = flagAccesso;
    }


    /**
     * Gets the pdfExt value for this StampaImmagineEsitoRequest.
     * 
     * @return pdfExt
     */
    public java.lang.Boolean getPdfExt() {
        return pdfExt;
    }


    /**
     * Sets the pdfExt value for this StampaImmagineEsitoRequest.
     * 
     * @param pdfExt
     */
    public void setPdfExt(java.lang.Boolean pdfExt) {
        this.pdfExt = pdfExt;
    }


    /**
     * Gets the flagDocumento value for this StampaImmagineEsitoRequest.
     * 
     * @return flagDocumento
     */
    public java.lang.String getFlagDocumento() {
        return flagDocumento;
    }


    /**
     * Sets the flagDocumento value for this StampaImmagineEsitoRequest.
     * 
     * @param flagDocumento
     */
    public void setFlagDocumento(java.lang.String flagDocumento) {
        this.flagDocumento = flagDocumento;
    }


    /**
     * Gets the flagWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @return flagWebServiceOttico
     */
    public java.lang.String getFlagWebServiceOttico() {
        return flagWebServiceOttico;
    }


    /**
     * Sets the flagWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @param flagWebServiceOttico
     */
    public void setFlagWebServiceOttico(java.lang.String flagWebServiceOttico) {
        this.flagWebServiceOttico = flagWebServiceOttico;
    }


    /**
     * Gets the indirizzoWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @return indirizzoWebServiceOttico
     */
    public java.lang.String getIndirizzoWebServiceOttico() {
        return indirizzoWebServiceOttico;
    }


    /**
     * Sets the indirizzoWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @param indirizzoWebServiceOttico
     */
    public void setIndirizzoWebServiceOttico(java.lang.String indirizzoWebServiceOttico) {
        this.indirizzoWebServiceOttico = indirizzoWebServiceOttico;
    }


    /**
     * Gets the userWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @return userWebServiceOttico
     */
    public java.lang.String getUserWebServiceOttico() {
        return userWebServiceOttico;
    }


    /**
     * Sets the userWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @param userWebServiceOttico
     */
    public void setUserWebServiceOttico(java.lang.String userWebServiceOttico) {
        this.userWebServiceOttico = userWebServiceOttico;
    }


    /**
     * Gets the passwordWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @return passwordWebServiceOttico
     */
    public java.lang.String getPasswordWebServiceOttico() {
        return passwordWebServiceOttico;
    }


    /**
     * Sets the passwordWebServiceOttico value for this StampaImmagineEsitoRequest.
     * 
     * @param passwordWebServiceOttico
     */
    public void setPasswordWebServiceOttico(java.lang.String passwordWebServiceOttico) {
        this.passwordWebServiceOttico = passwordWebServiceOttico;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StampaImmagineEsitoRequest)) return false;
        StampaImmagineEsitoRequest other = (StampaImmagineEsitoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idDocBarcode==null && other.getIdDocBarcode()==null) || 
             (this.idDocBarcode!=null &&
              this.idDocBarcode.equals(other.getIdDocBarcode()))) &&
            ((this.flagAccesso==null && other.getFlagAccesso()==null) || 
             (this.flagAccesso!=null &&
              this.flagAccesso.equals(other.getFlagAccesso()))) &&
            ((this.pdfExt==null && other.getPdfExt()==null) || 
             (this.pdfExt!=null &&
              this.pdfExt.equals(other.getPdfExt()))) &&
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
        if (getIdDocBarcode() != null) {
            _hashCode += getIdDocBarcode().hashCode();
        }
        if (getFlagAccesso() != null) {
            _hashCode += getFlagAccesso().hashCode();
        }
        if (getPdfExt() != null) {
            _hashCode += getPdfExt().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StampaImmagineEsitoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaImmagineEsitoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDocBarcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "idDocBarcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagAccesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "flagAccesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "pdfExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
