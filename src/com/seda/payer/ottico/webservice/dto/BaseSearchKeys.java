package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
public class BaseSearchKeys implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codiceSocieta;
	private String codiceUtente;
	private String codiceEnte;
	private String chiaveEntePayer;

	public BaseSearchKeys() {}
	
	/**
	 * 
	 * @param codiceSocieta
	 * @param codiceUtente
	 * @param codiceEnte
	 */
	public BaseSearchKeys(String codiceSocieta, String codiceUtente, String codiceEnte) {
		this.codiceSocieta = codiceSocieta;
		this.codiceUtente = codiceUtente;
		this.codiceEnte = codiceEnte;
	}

	public String getCodiceSocieta() {
		return codiceSocieta;
	}

	public void setCodiceSocieta(String codiceSocieta) {
		this.codiceSocieta = codiceSocieta;
	}

	public String getCodiceUtente() {
		return codiceUtente;
	}

	public void setCodiceUtente(String codiceUtente) {
		this.codiceUtente = codiceUtente;
	}

	public String getCodiceEnte() {
		return codiceEnte;
	}

	public void setCodiceEnte(String codiceEnte) {
		this.codiceEnte = codiceEnte;
	}

	public String toString() {
		return "BaseSearchKeys [codiceEnte=" + codiceEnte + ", codiceSocieta="
				+ codiceSocieta + ", codiceUtente=" + codiceUtente + "]";
	}

	public void setChiaveEntePayer(String chiaveEntePayer) {
		this.chiaveEntePayer = chiaveEntePayer;
	}

	public String getChiaveEntePayer() {
		return chiaveEntePayer;
	}
}