package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class InformazioniStampa implements Serializable{

	private static final long serialVersionUID = 1L;

	private BaseSearchKeys baseSearchKey;
	private WebServiceInfo webServiceOttico;
	
	private String numeroDocumento;
	private String cachedRowSetDoc;
	private String cachedRowSetScadenze;
	private String cachedRowSetMovimenti;
	private String cachedRowSetTributi;
	
	private String flagDocumento;
	
	private String codiceFiscale;
	private String codiceImpostaServizio;
	
	public InformazioniStampa() {
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @return the cachedRowSetDoc
	 */
	public String getCachedRowSetDoc() {
		return cachedRowSetDoc;
	}


	/**
	 * @param cachedRowSetDoc the cachedRowSetDoc to set
	 */
	public void setCachedRowSetDoc(String cachedRowSetDoc) {
		this.cachedRowSetDoc = cachedRowSetDoc;
	}


	/**
	 * @return the cachedRowSetScadenze
	 */
	public String getCachedRowSetScadenze() {
		return cachedRowSetScadenze;
	}


	/**
	 * @param cachedRowSetScadenze the cachedRowSetScadenze to set
	 */
	public void setCachedRowSetScadenze(String cachedRowSetScadenze) {
		this.cachedRowSetScadenze = cachedRowSetScadenze;
	}


	public void setCachedRowSetMovimenti(String cachedRowSetMovimenti) {
		this.cachedRowSetMovimenti = cachedRowSetMovimenti;
	}

	public String getCachedRowSetMovimenti() {
		return cachedRowSetMovimenti;
	}

	/**
	 * @return the cachedRowSetTributi
	 */
	public String getCachedRowSetTributi() {
		return cachedRowSetTributi;
	}


	/**
	 * @param cachedRowSetTributi the cachedRowSetTributi to set
	 */
	public void setCachedRowSetTributi(String cachedRowSetTributi) {
		this.cachedRowSetTributi = cachedRowSetTributi;
	}


	public BaseSearchKeys getBaseSearchKeys() {
		return baseSearchKey;
	}

	public void setBaseSearchKeys(BaseSearchKeys srcKey) {
		this.baseSearchKey = srcKey;
	}

	public WebServiceInfo getWebServiceOttico() {
		return webServiceOttico;
	}

	public void setWebServiceOttico(WebServiceInfo wsInfo) {
		this.webServiceOttico = wsInfo;
	}

	public void setFlagDocumento(String flagDocumento) {
		this.flagDocumento = flagDocumento;
	}

	public String getFlagDocumento() {
		return flagDocumento;
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	/**
	 * @return the codiceImpostaServizio
	 */
	public String getCodiceImpostaServizio() {
		return codiceImpostaServizio;
	}

	/**
	 * @param codiceImpostaServizio the codiceImpostaServizio to set
	 */
	public void setCodiceImpostaServizio(String codiceImpostaServizio) {
		this.codiceImpostaServizio = codiceImpostaServizio;
	}
	
}
