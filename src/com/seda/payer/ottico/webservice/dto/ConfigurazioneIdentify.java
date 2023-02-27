package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;

public class ConfigurazioneIdentify extends BaseSearchKeys implements Serializable {

	private static final long serialVersionUID = 1L;

	public ConfigurazioneIdentify(String codiceSocieta, String codiceUtente,
			String codiceEnte) {
		super(codiceSocieta, codiceUtente, codiceEnte);
	}
}