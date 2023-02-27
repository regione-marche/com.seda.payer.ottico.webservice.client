package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;

import com.seda.payer.core.bean.TestataFlussoOttico;
/**
 * @author aniello.labua
 */
public class TestataFlussoOtticoDto extends BaseIdentify implements Serializable {

	private static final long serialVersionUID = 1L;
	//we define base search keys
	private BaseSearchKeys baseSearchKeys;
	//we define detail info object
	private DetailInfo detailInfo;
	
	private String tipologiaDocumento;

	private String statoDocumento; //PG22XX09_YL5
	
	//we define filename info object
	private FilenameInfo filenameInfo;
	
	private String siglaProvincia;
	//we define date info object
	private DateOtticoInfo dateOtticoInfo;
	//we define update info object
	private InformazioniAggiornamento infoUpdt;

	/**
	 * Default constructor
	 */
	public TestataFlussoOtticoDto() { }
	
	/**
	 * 
	 * @param identify
	 */
	public TestataFlussoOtticoDto(String identify) {
		super(identify);
	}
	
	/**
	 * 
	 * @param bean
	 */
	public TestataFlussoOtticoDto(TestataFlussoOttico bean){
		
		this.setBaseSearchKeys(new BaseSearchKeys(bean.getCodiceSocieta(),
				bean.getCodiceUtente(), bean.getCodiceEnte()));
		
	}

	public BaseSearchKeys getBaseSearchKeys() {
		return baseSearchKeys;
	}

	public TestataFlussoOtticoDto setBaseSearchKeys(BaseSearchKeys baseSearchKeys) {
		this.baseSearchKeys = baseSearchKeys;
		return this;
	}

	public String getTipologiaDocumento() {
		return tipologiaDocumento;
	}

	public TestataFlussoOtticoDto setTipologiaDocumento(String tipologiaDocumento) {
		this.tipologiaDocumento = tipologiaDocumento;
		return this;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public TestataFlussoOtticoDto setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
		return this;
	}

	public DetailInfo getDetailInfo() {
		return detailInfo;
	}

	public TestataFlussoOtticoDto setDetailInfo(DetailInfo detailInfo) {
		this.detailInfo = detailInfo;
		return this;
	}

	public FilenameInfo getFilenameInfo() {
		return filenameInfo;
	}

	public TestataFlussoOtticoDto setFilenameInfo(FilenameInfo filenameInfo) {
		this.filenameInfo = filenameInfo;
		return this;
	}

	public DateOtticoInfo getDateOtticoInfo() {
		return dateOtticoInfo;
	}

	public TestataFlussoOtticoDto setDateOtticoInfo(DateOtticoInfo dateOtticoInfo) {
		this.dateOtticoInfo = dateOtticoInfo;
		return this;
	}

	public InformazioniAggiornamento getInfoUpdt() {
		return infoUpdt;
	}

	public  TestataFlussoOtticoDto setInfoUpdt(InformazioniAggiornamento infoUpdt) {
		this.infoUpdt = infoUpdt;
		return this;
	}
	
	public TestataFlussoOttico toBean(TestataFlussoOtticoDto dtoObj){
		
		TestataFlussoOttico bean = new TestataFlussoOttico();
		
		if(dtoObj.getIdentify()!=null)
			bean.setChiaveFlusso(dtoObj.getIdentify());
		
		if(dtoObj.getBaseSearchKeys()!=null)
			bean.setCodiceSocieta(dtoObj.getBaseSearchKeys().getCodiceSocieta());
			bean.setCodiceUtente(dtoObj.getBaseSearchKeys().getCodiceUtente());
			bean.setCodiceEnte(dtoObj.getBaseSearchKeys().getCodiceEnte());
		
		if(dtoObj.getDateOtticoInfo()!=null){
			bean.setDataElaborazione(dtoObj.getDateOtticoInfo().getDataElaborazione());
			bean.setDataCreazioneFlusso(dtoObj.getDateOtticoInfo().getDataCreazioneFlusso());
			//we set optional info
			if(dtoObj.getDateOtticoInfo().getDataCreazA()!=null)
				bean.setDataCreazA(dtoObj.getDateOtticoInfo().getDataCreazA());

			if(dtoObj.getDateOtticoInfo().getDataCreazDA()!=null)
				bean.setDataCreazDA(dtoObj.getDateOtticoInfo().getDataCreazDA());

			//we set 
			if(dtoObj.getDateOtticoInfo().getDataElabA()!=null)
				bean.setDataElabA(dtoObj.getDateOtticoInfo().getDataElabA());
			
			if (dtoObj.getDateOtticoInfo().getDataElabDA()!=null)
				bean.setDataElabDA(dtoObj.getDateOtticoInfo().getDataElabDA());
		}

		if(dtoObj.getTipologiaDocumento()!=null)
			bean.setTipologiaDocumento(dtoObj.getTipologiaDocumento());
		
		if(dtoObj.getSiglaProvincia()!=null)
			bean.setSiglaProvincia(dtoObj.getSiglaProvincia());
		
		if(dtoObj.getDetailInfo()!=null){
			bean.setNumeroDettagli(dtoObj.getDetailInfo().getNumeroDettagli());
			bean.setNumeroDettagliCaricati(dtoObj.getDetailInfo().getNumeroDettagliCaricati());
			bean.setNumeroDettagliScartati(dtoObj.getDetailInfo().getNumeroDettagliScartati());
		}
		
		if(dtoObj.getFilenameInfo() != null){
			bean.setNomeFileFisicoImg(dtoObj.getFilenameInfo().getNomeFileFisicoImg());
			bean.setNomeFileLog(dtoObj.getFilenameInfo().getNomeFileLog());
			bean.setNomeFileLogDettaglio(dtoObj.getFilenameInfo().getNomeFileLogDettaglio());
			bean.setNomeFileDati(dtoObj.getFilenameInfo().getNomeFileDati());
		}
		
		if(dtoObj.getInfoUpdt() != null){
			bean.setDataUltimoAgg(dtoObj.getInfoUpdt().getData());
			bean.setOperatoreUltimoAgg(dtoObj.getInfoUpdt().getOperatoreUltimoAgg());
		}
		//PG22XX09_YL5
		if (dtoObj.getStatoDocumento()!=null)
		bean.setStatoDocumento(dtoObj.getStatoDocumento());
		
		return bean;
	}

	public String toString() {
		return "TestataFlussoOtticoDto [baseSearchKeys=" + baseSearchKeys
				+ ", dateOtticoInfo=" + dateOtticoInfo + ", detailInfo="
				+ detailInfo + ", filenameInfo=" + filenameInfo + ", infoUpdt="
				+ infoUpdt + ", siglaProvincia=" + siglaProvincia
				+ ", tipologiaDocumento=" + tipologiaDocumento + "]";
	}

	//INI PG22XX09_YL5
	/**
	 * @return the statoDocumento
	 */
	public String getStatoDocumento() {
		return statoDocumento;
	}

	/**
	 * @param statoDocumento the statoDocumento to set
	 * @return 
	 */
	public TestataFlussoOtticoDto setStatoDocumento(String statoDocumento) {
		this.statoDocumento = statoDocumento;
		return this;
	}
	
	//FINE PG22XX09_YL5

	
}