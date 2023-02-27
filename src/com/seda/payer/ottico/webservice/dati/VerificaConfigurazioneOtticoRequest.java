/**
 * VerificaConfigurazioneOtticoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class VerificaConfigurazioneOtticoRequest  implements java.io.Serializable {
    private java.lang.String chiaveSocieta;

    private java.lang.String chiaveUtente;

    private java.lang.String codiceEnte;

    public VerificaConfigurazioneOtticoRequest() {
    }

    public VerificaConfigurazioneOtticoRequest(
           java.lang.String chiaveSocieta,
           java.lang.String chiaveUtente,
           java.lang.String codiceEnte) {
           this.chiaveSocieta = chiaveSocieta;
           this.chiaveUtente = chiaveUtente;
           this.codiceEnte = codiceEnte;
    }


    /**
     * Gets the chiaveSocieta value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @return chiaveSocieta
     */
    public java.lang.String getChiaveSocieta() {
        return chiaveSocieta;
    }


    /**
     * Sets the chiaveSocieta value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @param chiaveSocieta
     */
    public void setChiaveSocieta(java.lang.String chiaveSocieta) {
        this.chiaveSocieta = chiaveSocieta;
    }


    /**
     * Gets the chiaveUtente value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @return chiaveUtente
     */
    public java.lang.String getChiaveUtente() {
        return chiaveUtente;
    }


    /**
     * Sets the chiaveUtente value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @param chiaveUtente
     */
    public void setChiaveUtente(java.lang.String chiaveUtente) {
        this.chiaveUtente = chiaveUtente;
    }


    /**
     * Gets the codiceEnte value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @return codiceEnte
     */
    public java.lang.String getCodiceEnte() {
        return codiceEnte;
    }


    /**
     * Sets the codiceEnte value for this VerificaConfigurazioneOtticoRequest.
     * 
     * @param codiceEnte
     */
    public void setCodiceEnte(java.lang.String codiceEnte) {
        this.codiceEnte = codiceEnte;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaConfigurazioneOtticoRequest)) return false;
        VerificaConfigurazioneOtticoRequest other = (VerificaConfigurazioneOtticoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveSocieta==null && other.getChiaveSocieta()==null) || 
             (this.chiaveSocieta!=null &&
              this.chiaveSocieta.equals(other.getChiaveSocieta()))) &&
            ((this.chiaveUtente==null && other.getChiaveUtente()==null) || 
             (this.chiaveUtente!=null &&
              this.chiaveUtente.equals(other.getChiaveUtente()))) &&
            ((this.codiceEnte==null && other.getCodiceEnte()==null) || 
             (this.codiceEnte!=null &&
              this.codiceEnte.equals(other.getCodiceEnte())));
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
        if (getChiaveSocieta() != null) {
            _hashCode += getChiaveSocieta().hashCode();
        }
        if (getChiaveUtente() != null) {
            _hashCode += getChiaveUtente().hashCode();
        }
        if (getCodiceEnte() != null) {
            _hashCode += getCodiceEnte().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaConfigurazioneOtticoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaConfigurazioneOtticoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "chiaveSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "chiaveUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "codiceEnte"));
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
