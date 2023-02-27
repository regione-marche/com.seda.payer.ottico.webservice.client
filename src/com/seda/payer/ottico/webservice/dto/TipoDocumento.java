package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class TipoDocumento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String flagBollettino;
	private String flagDocumento;
	private String flagQuietanza;
	private String flagRelata;
	
	/**
	 * 
	 * @param flagBollettino
	 * @param flagDocumento
	 * @param flagQuietanza
	 * @param flagRelata
	 */
	public TipoDocumento(String flagBollettino, String flagDocumento,
			String flagQuietanza, String flagRelata) {
		super();
		this.flagBollettino = flagBollettino;
		this.flagDocumento = flagDocumento;
		this.flagQuietanza = flagQuietanza;
		this.flagRelata = flagRelata;
	}

	public String getFlagBollettino() {
		return flagBollettino;
	}

	public void setFlagBollettino(String flagBollettino) {
		this.flagBollettino = flagBollettino;
	}

	public String getFlagDocumento() {
		return flagDocumento;
	}

	public void setFlagDocumento(String flagDocumento) {
		this.flagDocumento = flagDocumento;
	}

	public String getFlagQuietanza() {
		return flagQuietanza;
	}

	public void setFlagQuietanza(String flagQuietanza) {
		this.flagQuietanza = flagQuietanza;
	}

	public String getFlagRelata() {
		return flagRelata;
	}

	public void setFlagRelata(String flagRelata) {
		this.flagRelata = flagRelata;
	}

	public String toString() {
		return "TipoDocumento [flagBollettino=" + flagBollettino
				+ ", flagDocumento=" + flagDocumento + ", flagQuietanza="
				+ flagQuietanza + ", flagRelata=" + flagRelata + "]";
	}
	
}