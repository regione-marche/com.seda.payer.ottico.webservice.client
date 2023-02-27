/**
 * GetListaImmaginiResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class GetListaImmaginiResponse  implements java.io.Serializable {
    private java.lang.String listXmlImmagini;

    private com.seda.payer.ottico.webservice.dati.ResponseType response;

    public GetListaImmaginiResponse() {
    }

    public GetListaImmaginiResponse(
           java.lang.String listXmlImmagini,
           com.seda.payer.ottico.webservice.dati.ResponseType response) {
           this.listXmlImmagini = listXmlImmagini;
           this.response = response;
    }


    /**
     * Gets the listXmlImmagini value for this GetListaImmaginiResponse.
     * 
     * @return listXmlImmagini
     */
    public java.lang.String getListXmlImmagini() {
        return listXmlImmagini;
    }


    /**
     * Sets the listXmlImmagini value for this GetListaImmaginiResponse.
     * 
     * @param listXmlImmagini
     */
    public void setListXmlImmagini(java.lang.String listXmlImmagini) {
        this.listXmlImmagini = listXmlImmagini;
    }


    /**
     * Gets the response value for this GetListaImmaginiResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this GetListaImmaginiResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetListaImmaginiResponse)) return false;
        GetListaImmaginiResponse other = (GetListaImmaginiResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listXmlImmagini==null && other.getListXmlImmagini()==null) || 
             (this.listXmlImmagini!=null &&
              this.listXmlImmagini.equals(other.getListXmlImmagini()))) &&
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
        if (getListXmlImmagini() != null) {
            _hashCode += getListXmlImmagini().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetListaImmaginiResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">GetListaImmaginiResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listXmlImmagini");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "listXmlImmagini"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
