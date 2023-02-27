package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 * @author aniello.labua
 */
public class InformazioniAggiornamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Timestamp data;
	private String operatoreUltimoAgg;
	
	/**
	 * 
	 * @param data
	 * @param operatoreUltimoAgg
	 */
	public InformazioniAggiornamento(Timestamp data, String operatoreUltimoAgg) {
		super();
		this.data = data;
		this.operatoreUltimoAgg = operatoreUltimoAgg;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getOperatoreUltimoAgg() {
		return operatoreUltimoAgg;
	}

	public void setOperatoreUltimoAgg(String operatoreUltimoAgg) {
		this.operatoreUltimoAgg = operatoreUltimoAgg;
	}

	
	public String toString() {
		return "InformazioniAggiornamento [data=" + data + ", operatoreUltimoAgg=" + operatoreUltimoAgg + "]";
	}	

}
