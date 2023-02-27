package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class FilenameInfo implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String nomeFileFisicoImg;
	private String nomeFileLog;
	private String nomeFileLogDettaglio;
	private String nomeFileDati;
	
	/**
	 * 
	 * @param nomeFileFisicoImg
	 * @param nomeFileLog
	 * @param nomeFileLogDettaglio
	 * @param nomeFileDati
	 */
	public FilenameInfo(String nomeFileFisicoImg, String nomeFileLog,
			String nomeFileLogDettaglio, String nomeFileDati) {
		super();
		this.nomeFileFisicoImg = nomeFileFisicoImg;
		this.nomeFileLog = nomeFileLog;
		this.nomeFileLogDettaglio = nomeFileLogDettaglio;
		this.nomeFileDati = nomeFileDati;
	}

	public String getNomeFileFisicoImg() {
		return nomeFileFisicoImg;
	}

	public void setNomeFileFisicoImg(String nomeFileFisicoImg) {
		this.nomeFileFisicoImg = nomeFileFisicoImg;
	}

	public String getNomeFileLog() {
		return nomeFileLog;
	}

	public void setNomeFileLog(String nomeFileLog) {
		this.nomeFileLog = nomeFileLog;
	}

	public String getNomeFileLogDettaglio() {
		return nomeFileLogDettaglio;
	}

	public void setNomeFileLogDettaglio(String nomeFileLogDettaglio) {
		this.nomeFileLogDettaglio = nomeFileLogDettaglio;
	}

	public String getNomeFileDati() {
		return nomeFileDati;
	}

	public void setNomeFileDati(String nomeFileDati) {
		this.nomeFileDati = nomeFileDati;
	}

	public String toString() {
		return "FileInfo [nomeFileDati=" + nomeFileDati
				+ ", nomeFileFisicoImg=" + nomeFileFisicoImg + ", nomeFileLog="
				+ nomeFileLog + ", nomeFileLogDettaglio="
				+ nomeFileLogDettaglio + "]";
	}
	
}
