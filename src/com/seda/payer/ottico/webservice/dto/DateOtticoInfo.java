package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
/**
 * @author aniello.labua
 */
public class DateOtticoInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date dataElaborazione;
	private Date dataCreazioneFlusso;
	private Timestamp dataElabDA;
	private Timestamp dataElabA;
	private Timestamp dataCreazDA;
	private Timestamp dataCreazA;
	
	public DateOtticoInfo(Date dataElaborazione, Date dataCreazioneFlusso,
			Timestamp dataElabDA, Timestamp dataElabA, Timestamp dataCreazDA,
			Timestamp dataCreazA) {
		super();
		this.dataElaborazione = dataElaborazione;
		this.dataCreazioneFlusso = dataCreazioneFlusso;
		this.dataElabDA = dataElabDA;
		this.dataElabA = dataElabA;
		this.dataCreazDA = dataCreazDA;
		this.dataCreazA = dataCreazA;
	}

	public Date getDataElaborazione() {
		return dataElaborazione;
	}

	public void setDataElaborazione(Date dataElaborazione) {
		this.dataElaborazione = dataElaborazione;
	}

	public Date getDataCreazioneFlusso() {
		return dataCreazioneFlusso;
	}

	public void setDataCreazioneFlusso(Date dataCreazioneFlusso) {
		this.dataCreazioneFlusso = dataCreazioneFlusso;
	}

	public Timestamp getDataElabDA() {
		return dataElabDA;
	}

	public void setDataElabDA(Timestamp dataElabDA) {
		this.dataElabDA = dataElabDA;
	}

	public Timestamp getDataElabA() {
		return dataElabA;
	}

	public void setDataElabA(Timestamp dataElabA) {
		this.dataElabA = dataElabA;
	}

	public Timestamp getDataCreazDA() {
		return dataCreazDA;
	}

	public void setDataCreazDA(Timestamp dataCreazDA) {
		this.dataCreazDA = dataCreazDA;
	}

	public Timestamp getDataCreazA() {
		return dataCreazA;
	}

	public void setDataCreazA(Timestamp dataCreazA) {
		this.dataCreazA = dataCreazA;
	}

	public String toString() {
		return "DateOtticoInfo [dataCreazA=" + dataCreazA + ", dataCreazDA="
				+ dataCreazDA + ", dataCreazioneFlusso=" + dataCreazioneFlusso
				+ ", dataElabA=" + dataElabA + ", dataElabDA=" + dataElabDA
				+ ", dataElaborazione=" + dataElaborazione + "]";
	}
	
}
