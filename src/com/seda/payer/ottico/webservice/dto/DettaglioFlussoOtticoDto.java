package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;

import com.seda.payer.core.bean.DettaglioFlussoOttico;
/**
 * @author aniello.labua
 */
public class DettaglioFlussoOtticoDto extends BaseIdentify implements Serializable{

	private static final long serialVersionUID = 1L;
	//we define base search keys
	private BaseSearchKeys baseSearchKeys;
	//we define flow key relation
	private String chiaveFlussoOttico;
	//we define code info
	private DocumentDetailInfo documentDetailInfo;
	//we define code info
	private CodiciDettaglio codiciDettaglio;
	//we define image file
	private String nomeFileImg;
	//we define update info object
	private InformazioniAggiornamento infoUpdt;
	
	/**
	 * Default constructor
	 */
	public DettaglioFlussoOtticoDto(){	}
	
	/**
	 * 
	 * @param identify
	 */
	public DettaglioFlussoOtticoDto(String identify){	
		super(identify);
	}
	
	/**
	 * 
	 * @param bean
	 */
	public DettaglioFlussoOtticoDto(DettaglioFlussoOttico bean){
		
		this.setBaseSearchKeys(new BaseSearchKeys(bean.getCodiceSocieta(),
				bean.getCodiceUtente(), bean.getCodiceEnte()));
		this.setDocumentDetailInfo(new DocumentDetailInfo(bean.getTipologiaDocumento(),
				bean.getNumeroDocumento(), bean.getChiaveQuietanza()));
		this.setCodiciDettaglio(new CodiciDettaglio(bean.getCodiceBollettino(), 
				bean.getNumeroQuietanza(), bean.getChiaveRelata()));
		this.setNomeFileImg(bean.getNomeFileFisicoImg());
		this.setInfoUpdt(new InformazioniAggiornamento(bean.getDataUltimoAggiornamento(),
				bean.getOperatoreUltimoAggiornamento()));
		
	}

	public BaseSearchKeys getBaseSearchKeys() {
		return baseSearchKeys;
	}
	
	public DettaglioFlussoOtticoDto setBaseSearchKeys(BaseSearchKeys baseSearchKeys) {
		this.baseSearchKeys = baseSearchKeys;
		return this;
	}

	public String getChiaveFlussoOttico() {
		return chiaveFlussoOttico;
	}

	public DettaglioFlussoOtticoDto setChiaveFlussoOttico(String chiaveFlussoOttico) {
		this.chiaveFlussoOttico = chiaveFlussoOttico;
		return this;
	}
	
	public DocumentDetailInfo getDocumentDetailInfo() {
		return documentDetailInfo;
	}

	public DettaglioFlussoOtticoDto setDocumentDetailInfo(DocumentDetailInfo documentDetailInfo) {
		this.documentDetailInfo = documentDetailInfo;
		return this;
	}

	public CodiciDettaglio getCodiciDettaglio() {
		return codiciDettaglio;
	}
	
	public DettaglioFlussoOtticoDto setCodiciDettaglio(CodiciDettaglio dettaglioCodice) {
		this.codiciDettaglio = dettaglioCodice;
		return this;
	}

	public String getNomeFileImg() {
		return nomeFileImg;
	}

	public DettaglioFlussoOtticoDto setNomeFileImg(String nomeFileImg) {
		this.nomeFileImg = nomeFileImg;
		return this;
	}

	public InformazioniAggiornamento getInfoUpdt() {
		return infoUpdt;
	}

	public  DettaglioFlussoOtticoDto setInfoUpdt(InformazioniAggiornamento infoUpdt) {
		this.infoUpdt = infoUpdt;
		return this;
	}

	public DettaglioFlussoOttico toBean(DettaglioFlussoOtticoDto dtoObj){
		
		DettaglioFlussoOttico bean = new DettaglioFlussoOttico();
		
		if(dtoObj.getIdentify()!=null)
			bean.setChiaveDettaglioFlussoOttico((dtoObj.getIdentify()));
		
		if(dtoObj.getChiaveFlussoOttico()!=null)
			bean.setChiaveFlussoOttico(dtoObj.getChiaveFlussoOttico());
		
		if(dtoObj.getBaseSearchKeys()!=null)
			bean.setCodiceSocieta(dtoObj.getBaseSearchKeys().getCodiceSocieta());
			bean.setCodiceUtente(dtoObj.getBaseSearchKeys().getCodiceUtente());
			bean.setCodiceEnte(dtoObj.getBaseSearchKeys().getCodiceEnte());
			
		if(dtoObj.getDocumentDetailInfo()!=null)
			bean.setTipologiaDocumento(dtoObj.getDocumentDetailInfo().getTipologiaDocumento());
			bean.setNumeroDocumento(dtoObj.getDocumentDetailInfo().getNumeroDocumento());
			bean.setChiaveQuietanza(dtoObj.getDocumentDetailInfo().getChiaveQuietanza());
		
		if(dtoObj.getCodiciDettaglio()!=null)
			bean.setCodiceBollettino(dtoObj.getCodiciDettaglio().getCodiceBollettino());
			bean.setNumeroQuietanza(dtoObj.getCodiciDettaglio().getCodiceQuietanza());
			bean.setChiaveRelata(dtoObj.getCodiciDettaglio().getCodiceRelata());
		
		if(dtoObj.getNomeFileImg()!=null)
			bean.setNomeFileFisicoImg(dtoObj.getNomeFileImg());
		
		if(dtoObj.getInfoUpdt() != null){
			bean.setDataUltimoAggiornamento(dtoObj.getInfoUpdt().getData());
			bean.setOperatoreUltimoAggiornamento(dtoObj.getInfoUpdt().getOperatoreUltimoAgg());
		}
		
		return bean;
	}
	
	public String toString() {
		return "DettaglioFlussoOtticoDto [baseSearchKeys=" + baseSearchKeys
				+ ", chiaveFlussoOttico=" + chiaveFlussoOttico
				+ ", codiciDettaglio=" + codiciDettaglio
				+ ", documentDetailInfo=" + documentDetailInfo + ", infoUpdt="
				+ infoUpdt + ", nomeFileImg=" + nomeFileImg + "]";
	}
	
	
}
