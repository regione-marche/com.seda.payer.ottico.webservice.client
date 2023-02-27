package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class DirectoryInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String directoryFlussiDatiOtticoInput;
	private String directorySalvataggoFlussiDatiOtticoInput;
	private String directoryFlussiImmaginiOtticoInput;
	private String directorySalvataggioFlussiImmaginiOtticoInput;
	private String directoryLogElaborazione;
	private String directoryImmaginiOtticoPerEstrattoConto;
	
	/**
	 * Default constructor
	 */
	public DirectoryInfo(){}
	
	/**
	 * 
	 * @param directoryFlussiDatiOtticoInput
	 * @param directorySalvataggoFlussiDatiOtticoInput
	 * @param directoryFlussiImmaginiOtticoInput
	 * @param directorySalvataggioFlussiImmaginiOtticoInput
	 * @param directoryLogElaborazione
	 * @param directoryImmaginiOtticoPerEstrattoConto
	 */
	public DirectoryInfo(String directoryFlussiDatiOtticoInput,
			String directorySalvataggoFlussiDatiOtticoInput,
			String directoryFlussiImmaginiOtticoInput,
			String directorySalvataggioFlussiImmaginiOtticoInput,
			String directoryLogElaborazione,
			String directoryImmaginiOtticoPerEstrattoConto) {
		super();
		this.directoryFlussiDatiOtticoInput = directoryFlussiDatiOtticoInput;
		this.directorySalvataggoFlussiDatiOtticoInput = directorySalvataggoFlussiDatiOtticoInput;
		this.directoryFlussiImmaginiOtticoInput = directoryFlussiImmaginiOtticoInput;
		this.directorySalvataggioFlussiImmaginiOtticoInput = directorySalvataggioFlussiImmaginiOtticoInput;
		this.directoryLogElaborazione = directoryLogElaborazione;
		this.directoryImmaginiOtticoPerEstrattoConto = directoryImmaginiOtticoPerEstrattoConto;
	}

	public String getDirectoryFlussiDatiOtticoInput() {
		return directoryFlussiDatiOtticoInput;
	}

	public DirectoryInfo setDirectoryFlussiDatiOtticoInput(
			String directoryFlussiDatiOtticoInput) {
		this.directoryFlussiDatiOtticoInput = directoryFlussiDatiOtticoInput;
		return this;
	}

	public String getDirectorySalvataggoFlussiDatiOtticoInput() {
		return directorySalvataggoFlussiDatiOtticoInput;
	}

	public DirectoryInfo setDirectorySalvataggoFlussiDatiOtticoInput(
			String directorySalvataggoFlussiDatiOtticoInput) {
		this.directorySalvataggoFlussiDatiOtticoInput = directorySalvataggoFlussiDatiOtticoInput;
		return this;
	}

	public String getDirectoryFlussiImmaginiOtticoInput() {
		return directoryFlussiImmaginiOtticoInput;
	}

	public DirectoryInfo setDirectoryFlussiImmaginiOtticoInput(
			String directoryFlussiImmaginiOtticoInput) {
		this.directoryFlussiImmaginiOtticoInput = directoryFlussiImmaginiOtticoInput;
		return this;
	}

	public String getDirectorySalvataggioFlussiImmaginiOtticoInput() {
		return directorySalvataggioFlussiImmaginiOtticoInput;
	}

	public DirectoryInfo setDirectorySalvataggioFlussiImmaginiOtticoInput(
			String directorySalvataggioFlussiImmaginiOtticoInput) {
		this.directorySalvataggioFlussiImmaginiOtticoInput = directorySalvataggioFlussiImmaginiOtticoInput;
		return this;
	}

	public String getDirectoryLogElaborazione() {
		return directoryLogElaborazione;
	}

	public DirectoryInfo setDirectoryLogElaborazione(String directoryLogElaborazione) {
		this.directoryLogElaborazione = directoryLogElaborazione;
		return this;
	}

	public String getDirectoryImmaginiOtticoPerEstrattoConto() {
		return directoryImmaginiOtticoPerEstrattoConto;
	}

	public DirectoryInfo setDirectoryImmaginiOtticoPerEstrattoConto(
			String directoryImmaginiOtticoPerEstrattoConto) {
		this.directoryImmaginiOtticoPerEstrattoConto = directoryImmaginiOtticoPerEstrattoConto;
		return this;
	}

	
	public String toString() {
		return "DirectoryInfo [directoryFlussiDatiOtticoInput="
				+ directoryFlussiDatiOtticoInput
				+ ", directoryFlussiImmaginiOtticoInput="
				+ directoryFlussiImmaginiOtticoInput
				+ ", directoryImmaginiOtticoPerEstrattoConto="
				+ directoryImmaginiOtticoPerEstrattoConto
				+ ", directoryLogElaborazione=" + directoryLogElaborazione
				+ ", directorySalvataggioFlussiImmaginiOtticoInput="
				+ directorySalvataggioFlussiImmaginiOtticoInput
				+ ", directorySalvataggoFlussiDatiOtticoInput="
				+ directorySalvataggoFlussiDatiOtticoInput + "]";
	}

}
