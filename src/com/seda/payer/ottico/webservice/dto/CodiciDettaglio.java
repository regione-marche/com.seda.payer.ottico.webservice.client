package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class CodiciDettaglio implements Serializable{

	private static final long serialVersionUID = 1L;
	private String codiceBollettino;
	private String codiceQuietanza;
	private String codiceRelata;
	
	/**
	 * 
	 * @param codiceBollettino
	 * @param codiceQuietanza
	 * @param codiceRelata
	 */
	public CodiciDettaglio(String codiceBollettino, String codiceQuietanza,
			String codiceRelata) {
		super();
		this.codiceBollettino = codiceBollettino;
		this.codiceQuietanza = codiceQuietanza;
		this.codiceRelata = codiceRelata;
	}

	public String getCodiceBollettino() {
		return codiceBollettino;
	}

	public CodiciDettaglio setCodiceBollettino(String codiceBollettino) {
		this.codiceBollettino = codiceBollettino;
		return this;
	}

	public String getCodiceQuietanza() {
		return codiceQuietanza;
	}

	public CodiciDettaglio setCodiceQuietanza(String codiceQuietanza) {
		this.codiceQuietanza = codiceQuietanza;
		return this;
	}

	public String getCodiceRelata() {
		return codiceRelata;
	}

	public CodiciDettaglio setCodiceRelata(String codiceRelata) {
		this.codiceRelata = codiceRelata;
		return this;
	}

	public String toString() {
		return "CodiciDettaglio [codiceBollettino=" + codiceBollettino
				+ ", codiceQuietanza=" + codiceQuietanza + ", codiceRelata="
				+ codiceRelata + "]";
	}

}
