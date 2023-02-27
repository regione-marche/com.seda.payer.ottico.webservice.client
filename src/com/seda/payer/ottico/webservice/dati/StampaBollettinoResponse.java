/**
 * StampaBollettinoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class StampaBollettinoResponse  implements java.io.Serializable {
    private java.lang.String fileNameZip;

    private com.seda.payer.ottico.webservice.dati.ResponseType response;

    public StampaBollettinoResponse() {
    }

    public StampaBollettinoResponse(
           java.lang.String fileNameZip,
           com.seda.payer.ottico.webservice.dati.ResponseType response) {
           this.fileNameZip = fileNameZip;
           this.response = response;
    }


    /**
     * Gets the fileNameZip value for this StampaBollettinoResponse.
     * 
     * @return fileNameZip
     */
    public java.lang.String getFileNameZip() {
        return fileNameZip;
    }


    /**
     * Sets the fileNameZip value for this StampaBollettinoResponse.
     * 
     * @param fileNameZip
     */
    public void setFileNameZip(java.lang.String fileNameZip) {
        this.fileNameZip = fileNameZip;
    }


    /**
     * Gets the response value for this StampaBollettinoResponse.
     * 
     * @return response
     */
    public com.seda.payer.ottico.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this StampaBollettinoResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.ottico.webservice.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StampaBollettinoResponse)) return false;
        StampaBollettinoResponse other = (StampaBollettinoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileNameZip==null && other.getFileNameZip()==null) || 
             (this.fileNameZip!=null &&
              this.fileNameZip.equals(other.getFileNameZip()))) &&
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
        if (getFileNameZip() != null) {
            _hashCode += getFileNameZip().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StampaBollettinoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">StampaBollettinoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileNameZip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "fileNameZip"));
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
