/**
 * LogElaborazioneFlussiImgRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dati;

public class LogElaborazioneFlussiImgRequest  implements java.io.Serializable {
    private java.lang.String testoFileLog;

    private java.lang.String directoryLog;

    private java.lang.String nomeFileLog;

    public LogElaborazioneFlussiImgRequest() {
    }

    public LogElaborazioneFlussiImgRequest(
           java.lang.String testoFileLog,
           java.lang.String directoryLog,
           java.lang.String nomeFileLog) {
           this.testoFileLog = testoFileLog;
           this.directoryLog = directoryLog;
           this.nomeFileLog = nomeFileLog;
    }


    /**
     * Gets the testoFileLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @return testoFileLog
     */
    public java.lang.String getTestoFileLog() {
        return testoFileLog;
    }


    /**
     * Sets the testoFileLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @param testoFileLog
     */
    public void setTestoFileLog(java.lang.String testoFileLog) {
        this.testoFileLog = testoFileLog;
    }


    /**
     * Gets the directoryLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @return directoryLog
     */
    public java.lang.String getDirectoryLog() {
        return directoryLog;
    }


    /**
     * Sets the directoryLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @param directoryLog
     */
    public void setDirectoryLog(java.lang.String directoryLog) {
        this.directoryLog = directoryLog;
    }


    /**
     * Gets the nomeFileLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @return nomeFileLog
     */
    public java.lang.String getNomeFileLog() {
        return nomeFileLog;
    }


    /**
     * Sets the nomeFileLog value for this LogElaborazioneFlussiImgRequest.
     * 
     * @param nomeFileLog
     */
    public void setNomeFileLog(java.lang.String nomeFileLog) {
        this.nomeFileLog = nomeFileLog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogElaborazioneFlussiImgRequest)) return false;
        LogElaborazioneFlussiImgRequest other = (LogElaborazioneFlussiImgRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testoFileLog==null && other.getTestoFileLog()==null) || 
             (this.testoFileLog!=null &&
              this.testoFileLog.equals(other.getTestoFileLog()))) &&
            ((this.directoryLog==null && other.getDirectoryLog()==null) || 
             (this.directoryLog!=null &&
              this.directoryLog.equals(other.getDirectoryLog()))) &&
            ((this.nomeFileLog==null && other.getNomeFileLog()==null) || 
             (this.nomeFileLog!=null &&
              this.nomeFileLog.equals(other.getNomeFileLog())));
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
        if (getTestoFileLog() != null) {
            _hashCode += getTestoFileLog().hashCode();
        }
        if (getDirectoryLog() != null) {
            _hashCode += getDirectoryLog().hashCode();
        }
        if (getNomeFileLog() != null) {
            _hashCode += getNomeFileLog().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogElaborazioneFlussiImgRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", ">LogElaborazioneFlussiImgRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testoFileLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "testoFileLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "directoryLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFileLog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.ottico.payer.seda.com", "nomeFileLog"));
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
