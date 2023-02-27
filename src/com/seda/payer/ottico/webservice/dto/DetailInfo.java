package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class DetailInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	private int numeroDettagli;
	private int numeroDettagliCaricati;
	private int numeroDettagliScartati;
	
	/**
	 * 
	 * @param numeroDettagli
	 * @param numeroDettagliCaricati
	 * @param numeroDettagliScartati
	 */
	public DetailInfo(int numeroDettagli, int numeroDettagliCaricati,
			int numeroDettagliScartati) {
		super();
		this.numeroDettagli = numeroDettagli;
		this.numeroDettagliCaricati = numeroDettagliCaricati;
		this.numeroDettagliScartati = numeroDettagliScartati;
	}

	public int getNumeroDettagli() {
		return numeroDettagli;
	}

	public void setNumeroDettagli(int numeroDettagli) {
		this.numeroDettagli = numeroDettagli;
	}

	public int getNumeroDettagliCaricati() {
		return numeroDettagliCaricati;
	}

	public void setNumeroDettagliCaricati(int numeroDettagliCaricati) {
		this.numeroDettagliCaricati = numeroDettagliCaricati;
	}

	public int getNumeroDettagliScartati() {
		return numeroDettagliScartati;
	}

	public void setNumeroDettagliScartati(int numeroDettagliScartati) {
		this.numeroDettagliScartati = numeroDettagliScartati;
	}

	public String toString() {
		return "DetailInfo [numeroDettagli=" + numeroDettagli
				+ ", numeroDettagliCaricati=" + numeroDettagliCaricati
				+ ", numeroDettagliScartati=" + numeroDettagliScartati + "]";
	}

}
