/**
 * RecuperaTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class RecuperaTemplateResponse  implements java.io.Serializable {
    private java.lang.String riferimentoTemplate;

    private com.seda.payer.ottico.webservice.dati.ResponseType response;

    public RecuperaTemplateResponse() {
    }

    public RecuperaTemplateResponse(
           java.lang.String riferimentoTemplate,
           com.seda.payer.ottico.webservice.dati.ResponseType response) {
           this.riferimentoTemplate = riferimentoTemplate;
           this.response = response;
    }


    /**
     * Gets the riferimentoTemplate value for this RecuperaTemplateResponse.
     * 
     * @return riferimentoTemplate
     */
    public java.lang.String getRiferimentoTemplate() {
        return riferimentoTemplate;
    }


    /**
     * Sets the riferimentoTemplate value for this RecuperaTemplateResponse.
     * 
     * @param riferimentoTemplate
     */
    public void setRiferimentoTemplate(java.lang.String riferimentoTemplate) {
        this.riferimentoTemplate = riferimentoTemplate;
    }


    /**
     * Gets the response value for this RecuperaTemplateResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this RecuperaTemplateResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaTemplateResponse)) return false;
        RecuperaTemplateResponse other = (RecuperaTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.riferimentoTemplate==null && other.getRiferimentoTemplate()==null) || 
             (this.riferimentoTemplate!=null &&
              this.riferimentoTemplate.equals(other.getRiferimentoTemplate()))) &&
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
        if (getRiferimentoTemplate() != null) {
            _hashCode += getRiferimentoTemplate().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">RecuperaTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riferimentoTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "riferimentoTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
