package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class DocumentDetailInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	private String tipologiaDocumento;
	private String numeroDocumento;
	private int chiaveQuietanza;
	
	/**
	 * 
	 * @param tipologiaDocumento
	 * @param numeroDocumento
	 * @param chiaveQuietanza
	 */
	public DocumentDetailInfo(String tipologiaDocumento,
			String numeroDocumento, int chiaveQuietanza) {
		super();
		this.tipologiaDocumento = tipologiaDocumento;
		this.numeroDocumento = numeroDocumento;
		this.chiaveQuietanza = chiaveQuietanza;
	}

	public String getTipologiaDocumento() {
		return tipologiaDocumento;
	}

	public void setTipologiaDocumento(String tipologiaDocumento) {
		this.tipologiaDocumento = tipologiaDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public int getChiaveQuietanza() {
		return chiaveQuietanza;
	}

	public void setChiaveQuietanza(int chiaveQuietanza) {
		this.chiaveQuietanza = chiaveQuietanza;
	}

	public String toString() {
		return "DocumentDetailInfo [chiaveQuietanza=" + chiaveQuietanza
				+ ", numeroDocumento=" + numeroDocumento
				+ ", tipologiaDocumento=" + tipologiaDocumento + "]";
	}
	
}
