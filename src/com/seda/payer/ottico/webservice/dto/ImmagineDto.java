/**
 * Immagine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.ottico.webservice.dto;

public class ImmagineDto  implements java.io.Serializable {
 
	private static final long serialVersionUID = -1187872605568009164L;

	private java.lang.String filePath;

    private java.lang.String dataDocumento;

    private java.lang.String tipoImmagine;

    private java.lang.String idDocumento;

    private java.lang.String flagVisibilita;
    
    //inizio LP OT200010
    private long indiceDoc = -1;
    private long numAllegati = 0;
    //fine LP OT200010

    public ImmagineDto() {
    }

    public ImmagineDto(
           java.lang.String filePath,
           java.lang.String dataDocumento,
           java.lang.String tipoImmagine,
           java.lang.String idDocumento,
           //inizio LP OT200010
           //java.lang.String flagVisibilita) {
           java.lang.String flagVisibilita,
           long indiceDoc) {
    	    //fine LP OT200010
           this.filePath = filePath;
           this.dataDocumento = dataDocumento;
           this.tipoImmagine = tipoImmagine;
           this.idDocumento = idDocumento;
           this.flagVisibilita = flagVisibilita;
           //inizio LP OT200010
           this.indiceDoc = indiceDoc;
           this.numAllegati = 0;
           //fine LP OT200010
    }


    /**
     * Gets the filePath value for this Immagine.
     * 
     * @return filePath
     */
    public java.lang.String getFilePath() {
        return filePath;
    }


    /**
     * Sets the filePath value for this Immagine.
     * 
     * @param filePath
     */
    public void setFilePath(java.lang.String filePath) {
        this.filePath = filePath;
    }


    /**
     * Gets the dataDocumento value for this Immagine.
     * 
     * @return dataDocumento
     */
    public java.lang.String getDataDocumento() {
        return dataDocumento;
    }


    /**
     * Sets the dataDocumento value for this Immagine.
     * 
     * @param dataDocumento
     */
    public void setDataDocumento(java.lang.String dataDocumento) {
        this.dataDocumento = dataDocumento;
    }


    /**
     * Gets the tipoImmagine value for this Immagine.
     * 
     * @return tipoImmagine
     */
    public java.lang.String getTipoImmagine() {
        return tipoImmagine;
    }


    /**
     * Sets the tipoImmagine value for this Immagine.
     * 
     * @param tipoImmagine
     */
    public void setTipoImmagine(java.lang.String tipoImmagine) {
        this.tipoImmagine = tipoImmagine;
    }


    /**
     * Gets the idDocumento value for this Immagine.
     * 
     * @return idDocumento
     */
    public java.lang.String getIdDocumento() {
        return idDocumento;
    }


    /**
     * Sets the idDocumento value for this Immagine.
     * 
     * @param idDocumento
     */
    public void setIdDocumento(java.lang.String idDocumento) {
        this.idDocumento = idDocumento;
    }


    /**
     * Gets the flagVisibilita value for this Immagine.
     * 
     * @return flagVisibilita
     */
    public java.lang.String getFlagVisibilita() {
        return flagVisibilita;
    }


    /**
     * Sets the flagVisibilita value for this Immagine.
     * 
     * @param flagVisibilita
     */
    public void setFlagVisibilita(java.lang.String flagVisibilita) {
        this.flagVisibilita = flagVisibilita;
    }

    //inizio LP OT200010
	public long getIndiceDoc() {
		return indiceDoc;
	}

	public void setIndiceDoc(long indiceDoc) {
		this.indiceDoc = indiceDoc;
	}

	public long getNumAllegati() {
		return numAllegati;
	}

	public void setNumAllegati(long numAllegati) {
		this.numAllegati = numAllegati;
	}
    //fine LP OT200010
}