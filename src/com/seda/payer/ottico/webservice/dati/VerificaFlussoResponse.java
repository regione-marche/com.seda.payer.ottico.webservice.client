/**
 * VerificaFlussoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class VerificaFlussoResponse  implements java.io.Serializable {
    private java.lang.String presenzaFlusso;

    private com.seda.payer.ottico.webservice.dati.ResponseType response;

    public VerificaFlussoResponse() {
    }

    public VerificaFlussoResponse(
           java.lang.String presenzaFlusso,
           com.seda.payer.ottico.webservice.dati.ResponseType response) {
           this.presenzaFlusso = presenzaFlusso;
           this.response = response;
    }


    /**
     * Gets the presenzaFlusso value for this VerificaFlussoResponse.
     * 
     * @return presenzaFlusso
     */
    public java.lang.String getPresenzaFlusso() {
        return presenzaFlusso;
    }


    /**
     * Sets the presenzaFlusso value for this VerificaFlussoResponse.
     * 
     * @param presenzaFlusso
     */
    public void setPresenzaFlusso(java.lang.String presenzaFlusso) {
        this.presenzaFlusso = presenzaFlusso;
    }


    /**
     * Gets the response value for this VerificaFlussoResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this VerificaFlussoResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaFlussoResponse)) return false;
        VerificaFlussoResponse other = (VerificaFlussoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.presenzaFlusso==null && other.getPresenzaFlusso()==null) || 
             (this.presenzaFlusso!=null &&
              this.presenzaFlusso.equals(other.getPresenzaFlusso()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getPresenzaFlusso() != null) {
            _hashCode += getPresenzaFlusso().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaFlussoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">VerificaFlussoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presenzaFlusso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "presenzaFlusso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "ResponseType"));
        elemField.setNillable(false);
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
