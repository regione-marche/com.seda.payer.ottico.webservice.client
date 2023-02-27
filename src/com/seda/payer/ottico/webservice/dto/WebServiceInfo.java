package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class WebServiceInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	public static final WebServiceInfoType PAYER_TYPE = new WebServiceInfoType("P");
	public static final WebServiceInfoType OTHER_TYPE = new WebServiceInfoType("A");
	//we define webservice info
	private String flagWebserviceOttico;
	private String indirizzoWebService;
	private String userWebService;
	private String passWebService;
	private String emailAmministratore;
	
	public static class WebServiceInfoType implements Serializable {
		private static final long serialVersionUID = 1L;
		private String typeValue;
		public WebServiceInfoType(String typeValue) {
			this.typeValue = typeValue;
		}
		public String getTypeValue() {
			return typeValue;
		}
		public void setTypeValue(String typeValue) {
			this.typeValue = typeValue;
		}
		public static WebServiceInfoType parse(String typeValue) {
			return new WebServiceInfoType(typeValue.toUpperCase());
		}

		public String toString() {
			return "WebServiceInfoType [typeValue=" + typeValue + "]";
		}	
	}
	
	/**
	 * 
	 * @param indirizzoWebService
	 * @param userWebService
	 * @param passWebService
	 * @param emailAmministratore
	 * @param flagWebserviceOttico
	 */
	public WebServiceInfo(String indirizzoWebService, String userWebService,
			String passWebService, String emailAmministratore, WebServiceInfoType flagWebserviceOttico) {
		super();
		this.flagWebserviceOttico = flagWebserviceOttico.getTypeValue();
		this.indirizzoWebService = indirizzoWebService;
		this.userWebService = userWebService;
		this.passWebService = passWebService;
		this.emailAmministratore = emailAmministratore;
	}

	public String getIndirizzoWebService() {
		return indirizzoWebService;
	}

	public void setIndirizzoWebService(String indirizzoWebService) {
		this.indirizzoWebService = indirizzoWebService;
	}

	public String getUserWebService() {
		return userWebService;
	}

	public void setUserWebService(String userWebService) {
		this.userWebService = userWebService;
	}

	public String getPassWebService() {
		return passWebService;
	}

	public void setPassWebService(String passWebService) {
		this.passWebService = passWebService;
	}

	public String getEmailAmministratore() {
		return emailAmministratore;
	}

	public void setEmailAmministratore(String emailAmministratore) {
		this.emailAmministratore = emailAmministratore;
	}

	public String getFlagWebserviceOttico() {
		return flagWebserviceOttico;
	}

	public void setFlagWebserviceOttico(String flagWebserviceOttico) {
		this.flagWebserviceOttico = flagWebserviceOttico;
	}

	public String toString() {
		return "WebServiceInfo [emailAmministratore=" + emailAmministratore
				+ ", flagWebserviceOttico=" + flagWebserviceOttico
				+ ", indirizzoWebService=" + indirizzoWebService
				+ ", passWebService=" + passWebService + ", userWebService="
				+ userWebService + "]";
	}	
	
}
