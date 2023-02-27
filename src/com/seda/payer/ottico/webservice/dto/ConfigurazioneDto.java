package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;

import com.seda.payer.core.bean.Configurazione;
import com.seda.payer.ottico.webservice.dto.WebServiceInfo.WebServiceInfoType;
/**
 * @author aniello.labua
 */
public class ConfigurazioneDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private ConfigurazioneIdentify identify;
	private TipoDocumento docType;
	private WebServiceInfo wsInfo;
	private InformazioniAggiornamento infoUpdt;
	private DirectoryInfo dirInfo;
	private String siglaProvincia;

	public ConfigurazioneDto(ConfigurazioneIdentify identify) {
		this.identify = identify; 
	}

	public ConfigurazioneDto(Configurazione bean){
		//we set base search key
		this.setIdentify(new ConfigurazioneIdentify(bean.getCodiceSocieta(),
				bean.getCodiceUtente(),bean.getCodiceEnte()));
		//we set document type
		this.setDocType(new TipoDocumento(bean.getFlagVisualizzaBollettino(), 
						bean.getFlagVisualizzaDocumento(),
						bean.getFlagVisualizzaQuietanza(), 
						bean.getFlagVisualizzaRelata()));
		//we set webservice info
		this.setWsInfo(new WebServiceInfo(bean.getIndirizzoServerOttico(),
				bean.getUserServerOttico(),
				bean.getPasswordServerOttico(),
				bean.getIndirizzoEmailAmministratore(),
				new WebServiceInfoType(bean.getFlagWebServiceOttico())));
		//we set directory info
		this.setDirInfo(new DirectoryInfo(bean.getDirectoryFlussiDatiOtticoInput(),
				bean.getDirectorySalvataggoFlussiDatiOtticoInput(), 
				bean.getDirectoryFlussiImmaginiOtticoInput(), 
				bean.getDirectorySalvataggioFlussiImmaginiOtticoInput(), 
				bean.getDirectoryLogElaborazione(), 
				bean.getDirectoryImmaginiOtticoPerEstrattoConto()));
		//we set update info
		this.setInfoUpdate(new InformazioniAggiornamento(bean.getDataUltimoAggiornamento(),
				bean.getOperatoreUltimoAggiornamento()));
		//we set 
		if(bean.getSiglaProvincia()!=null)
			this.setSiglaProvincia(bean.getSiglaProvincia());
		}

	public ConfigurazioneIdentify getIdentify() {
		return identify;
	}

	public ConfigurazioneDto setIdentify(ConfigurazioneIdentify identify) {
		this.identify = identify;
		return this;
	}

	public TipoDocumento getDocType() {
		return docType;
	}

	public ConfigurazioneDto setDocType(TipoDocumento doc) {
		this.docType = doc;
		return this;
	}

	public WebServiceInfo getWsInfo() {
		return wsInfo;
	}

	public ConfigurazioneDto setWsInfo(WebServiceInfo wsInfo) {
		this.wsInfo = wsInfo;
		return this;
	}

	public InformazioniAggiornamento getInfoUpdate() {
		return infoUpdt;
	}

	public ConfigurazioneDto setInfoUpdate(InformazioniAggiornamento infoUpdt) {
		this.infoUpdt = infoUpdt;
		return this;
	}

	public DirectoryInfo getDirInfo() {
		return dirInfo;
	}

	public ConfigurazioneDto setDirInfo(DirectoryInfo dirInfo) {
		this.dirInfo = dirInfo;
		return this;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public ConfigurazioneDto setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
		return this;
	}

	public Configurazione toBean(ConfigurazioneDto dtoObj){

		Configurazione bean = new Configurazione();

		bean.setCodiceSocieta(dtoObj.getIdentify().getCodiceSocieta());
		bean.setCodiceUtente(dtoObj.getIdentify().getCodiceUtente());
		bean.setCodiceEnte(dtoObj.getIdentify().getCodiceEnte());

		if(dtoObj.getDocType()!=null){
			bean.setFlagVisualizzaBollettino(dtoObj.getDocType().getFlagBollettino());
			bean.setFlagVisualizzaDocumento(dtoObj.getDocType().getFlagDocumento());
			bean.setFlagVisualizzaQuietanza(dtoObj.getDocType().getFlagQuietanza());
			bean.setFlagVisualizzaRelata(dtoObj.getDocType().getFlagRelata());
		}

		if(dtoObj.getWsInfo()!=null){
			bean.setFlagWebServiceOttico(dtoObj.getWsInfo().getFlagWebserviceOttico());
			bean.setIndirizzoServerOttico(dtoObj.getWsInfo().getIndirizzoWebService());
			bean.setUserServerOttico(dtoObj.getWsInfo().getUserWebService());
			bean.setPasswordServerOttico(dtoObj.getWsInfo().getPassWebService());
			bean.setIndirizzoEmailAmministratore(dtoObj.getWsInfo().getEmailAmministratore());
		}

		if(dtoObj.getDirInfo() != null){
			bean.setDirectoryFlussiDatiOtticoInput(dtoObj.getDirInfo().getDirectoryFlussiDatiOtticoInput());
			bean.setDirectorySalvataggoFlussiDatiOtticoInput(dtoObj.getDirInfo().getDirectorySalvataggoFlussiDatiOtticoInput());
			bean.setDirectoryFlussiImmaginiOtticoInput(dtoObj.getDirInfo().getDirectoryFlussiImmaginiOtticoInput());
			bean.setDirectorySalvataggioFlussiImmaginiOtticoInput(dtoObj.getDirInfo().getDirectorySalvataggioFlussiImmaginiOtticoInput());
			bean.setDirectoryLogElaborazione(dtoObj.getDirInfo().getDirectoryLogElaborazione());
			bean.setDirectoryImmaginiOtticoPerEstrattoConto(dtoObj.getDirInfo().getDirectoryImmaginiOtticoPerEstrattoConto());
		}

		if(dtoObj.getInfoUpdate() != null){
			bean.setDataUltimoAggiornamento(dtoObj.getInfoUpdate().getData());
			bean.setOperatoreUltimoAggiornamento(dtoObj.getInfoUpdate().getOperatoreUltimoAgg());
		}
		
		if(dtoObj.getSiglaProvincia()!=null)
			bean.setSiglaProvincia(dtoObj.getSiglaProvincia());

		return bean;
	}

	public String toString() {
		return "ConfigurazioneDto [dirInfo=" + dirInfo + ", docType=" + docType
		+ ", identify=" + identify + ", infoUpdt=" + infoUpdt
		+ ", wsInfo=" + wsInfo + "]";
	}

}