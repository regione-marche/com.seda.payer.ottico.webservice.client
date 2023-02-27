/**
 * VerificaAssociaTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.dati;

public class VerificaAssociaTemplateResponse  implements java.io.Serializable {
    private boolean wasExist;

    private com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response;

    public VerificaAssociaTemplateResponse() {
    }

    public VerificaAssociaTemplateResponse(
           boolean wasExist,
           com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response) {
           this.wasExist = wasExist;
           this.response = response;
    }


    /**
     * Gets the wasExist value for this VerificaAssociaTemplateResponse.
     * 
     * @return wasExist
     */
    public boolean isWasExist() {
        return wasExist;
    }


    /**
     * Sets the wasExist value for this VerificaAssociaTemplateResponse.
     * 
     * @param wasExist
     */
    public void setWasExist(boolean wasExist) {
        this.wasExist = wasExist;
    }


    /**
     * Gets the response value for this VerificaAssociaTemplateResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.configurazione.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this VerificaAssociaTemplateResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaAssociaTemplateResponse)) return false;
        VerificaAssociaTemplateResponse other = (VerificaAssociaTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.wasExist == other.isWasExist() &&
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
        _hashCode += (isWasExist() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaAssociaTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">VerificaAssociaTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasExist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "wasExist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ResponseType"));
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
