package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import com.seda.payer.core.bean.TemplateDocumento;
/**
 * @author aniello.labua
 */
public class TemplateDocumentoDto extends BaseIdentify implements  Serializable{

	private static final long serialVersionUID = 1L;
	private BaseSearchKeys srcKey;
	private String tipoBollettino;
	private Timestamp dataInizio;
	private Timestamp dataFine;
	private String tipologiaServizio;
	private String tipoDocumento;
	private String riferimentoTemplate;
	private String siglaProvincia;
	private InformazioniAggiornamento infoUpdate;
	/**
	 * Default constructor
	 */
	public TemplateDocumentoDto() {
	}
	
	/**
	 * 
	 * @param identify
	 */
	public TemplateDocumentoDto(String identify) {
		if (identify == null)
			return;

		setIdentify(identify);
	}
	
	/**
	 * 
	 * @param bean
	 */
	public TemplateDocumentoDto(TemplateDocumento bean) {
		if (bean == null)
			return;

		setIdentify(bean.getChiaveTemplate());
		//we set base search keys
		this.setSrcKey(new ConfigurazioneIdentify(bean.getCodiceSocieta(),
				bean.getCodiceUtente(),bean.getCodiceEnte()));
		//we set TemplateDocumento info
		this.riferimentoTemplate = bean.getRiferimentoTemplate();
		this.setTipoBollettino(bean.getTipoBollettino());
		this.setDataInizio(bean.getDataInizio());
		this.setDataFine(bean.getDataFine());
		this.setTipologiaServizio(bean.getTipologiaServizio());
		this.setTipoDocumento(bean.getTipoDocumento());
		
	}

	public BaseSearchKeys getSrcKey() {
		return srcKey;
	}

	public TemplateDocumentoDto setSrcKey(BaseSearchKeys srcKey) {
		this.srcKey = srcKey;
		return this;
	}

	public String getTipoBollettino() {
		return tipoBollettino;
	}

	public TemplateDocumentoDto setTipoBollettino(String tipoBollettino) {
		this.tipoBollettino = tipoBollettino;
		return this;
	}

	public Timestamp getDataInizio() {
		return dataInizio;
	}

	public TemplateDocumentoDto setDataInizio(Timestamp dataInizio) {
		this.dataInizio = dataInizio;
		return this;
	}

	public Timestamp getDataFine() {
		return dataFine;
	}

	public TemplateDocumentoDto setDataFine(Timestamp dataFine) {
		this.dataFine = dataFine;
		return this;
	}

	public String getTipologiaServizio() {
		return tipologiaServizio;
	}

	public TemplateDocumentoDto setTipologiaServizio(String tipologiaServizio) {
		this.tipologiaServizio = tipologiaServizio;
		return this;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public TemplateDocumentoDto setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		return this;
	}

	public String getRiferimentoTemplate() {
		return riferimentoTemplate;
	}

	public TemplateDocumentoDto setRiferimentoTemplate(String riferimentoTemplate) {
		this.riferimentoTemplate = riferimentoTemplate;
		return this;
	}
	
	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public TemplateDocumentoDto setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
		return this;
	}

	public InformazioniAggiornamento getInfoUpdate() {
		return infoUpdate;
	}

	public TemplateDocumentoDto setInfoUpdate(InformazioniAggiornamento infoUpdate) {
		this.infoUpdate = infoUpdate;
		return this;
	}

	public TemplateDocumento toBean(TemplateDocumentoDto dtoObj){
		
		TemplateDocumento bean = new TemplateDocumento();
		
		if(dtoObj.getIdentify()!=null)
			bean.setChiaveTemplate(dtoObj.getIdentify());
		
		if(dtoObj.getSrcKey()!=null){
			bean.setCodiceSocieta(dtoObj.getSrcKey().getCodiceSocieta());
			bean.setCodiceUtente(dtoObj.getSrcKey().getCodiceUtente());
			bean.setCodiceEnte(dtoObj.getSrcKey().getCodiceEnte());
		}
		
		if(dtoObj.getTipoDocumento()!=null)
			bean.setTipoDocumento(dtoObj.getTipoDocumento());
		
		if(dtoObj.getTipologiaServizio()!=null)
			bean.setTipologiaServizio(dtoObj.getTipologiaServizio());
		
		if(dtoObj.getTipoBollettino()!=null)
			bean.setTipoBollettino(dtoObj.getTipoBollettino());
		
		if(dtoObj.getDataInizio()!=null)
			bean.setDataInizio(dtoObj.getDataInizio());
		
		if(dtoObj.getDataFine()!=null)
			bean.setDataFine(dtoObj.getDataFine());
		
		if(dtoObj.getRiferimentoTemplate()!=null)
			bean.setRiferimentoTemplate(dtoObj.getRiferimentoTemplate());
		
		if(dtoObj.getSiglaProvincia()!=null)
			bean.setSiglaProvincia(dtoObj.getSiglaProvincia());
		
		if(dtoObj.getInfoUpdate() != null){
			bean.setDataUltimoAggiornamento(dtoObj.getInfoUpdate().getData());
			bean.setOperatoreUltimoAggiornamento(dtoObj.getInfoUpdate().getOperatoreUltimoAgg());
		}
		
		return bean;
	}
	

	public String toString() {
		return "TemplateDocumentoDto [dataFine=" + dataFine + ", dataInizio="
				+ dataInizio + ", riferimentoTemplate=" + riferimentoTemplate
				+ ", srcKey=" + srcKey + ", tipoBollettino=" + tipoBollettino
				+ ", tipoDocumento=" + tipoDocumento + ", tipologiaServizio="
				+ tipologiaServizio + ", chiaveTemplate=" +super.getIdentify()+ "]";
	}
	
}
