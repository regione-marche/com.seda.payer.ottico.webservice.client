/**
 * ListaAssociaTemplateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.configurazione.dati;

public class ListaAssociaTemplateResponse  implements java.io.Serializable {
    private com.seda.payer.ottico.webservice.configurazione.dati.ListResponseType listaTemplate;

    private com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response;

    public ListaAssociaTemplateResponse() {
    }

    public ListaAssociaTemplateResponse(
           com.seda.payer.ottico.webservice.configurazione.dati.ListResponseType listaTemplate,
           com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response) {
           this.listaTemplate = listaTemplate;
           this.response = response;
    }


    /**
     * Gets the listaTemplate value for this ListaAssociaTemplateResponse.
     * 
     * @return listaTemplate
     */
    public com.seda.payer.ottico.webservice.configurazione.dati.ListResponseType getListaTemplate() {
        return listaTemplate;
    }


    /**
     * Sets the listaTemplate value for this ListaAssociaTemplateResponse.
     * 
     * @param listaTemplate
     */
    public void setListaTemplate(com.seda.payer.ottico.webservice.configurazione.dati.ListResponseType listaTemplate) {
        this.listaTemplate = listaTemplate;
    }


    /**
     * Gets the response value for this ListaAssociaTemplateResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.configurazione.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ListaAssociaTemplateResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.configurazione.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaAssociaTemplateResponse)) return false;
        ListaAssociaTemplateResponse other = (ListaAssociaTemplateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaTemplate==null && other.getListaTemplate()==null) || 
             (this.listaTemplate!=null &&
              this.listaTemplate.equals(other.getListaTemplate()))) &&
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
        if (getListaTemplate() != null) {
            _hashCode += getListaTemplate().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaAssociaTemplateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", ">ListaAssociaTemplateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "listaTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.ottico.payer.seda.com", "ListResponseType"));
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
