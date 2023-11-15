package com.seda.payer.ottico.webservice.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgRequest;
import com.seda.payer.ottico.webservice.dati.LogElaborazioneFlussiImgResponse;
import com.seda.payer.ottico.webservice.dati.RecuperaTemplateRequest;
import com.seda.payer.ottico.webservice.dati.RecuperaTemplateResponse;
import com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoRequest;
import com.seda.payer.ottico.webservice.dati.VerificaConfigurazioneOtticoResponse;
import com.seda.payer.ottico.webservice.dati.VerificaFlussoRequest;
import com.seda.payer.ottico.webservice.dati.VerificaFlussoResponse;

public class TestService {

	// private static final LoggerWrapper log =  CustomLoggerManager.get(TestService.class);
	
	public TestService(){

	}
	
	private OtticoInterface getOtticoRef(){
		
		OtticoInterface ottico = null;
		try {
			OtticoServiceLocator otticoServiceLocator=new OtticoServiceLocator();
			/*
			 * URL_MDECURTIS: http://10.10.80.6:10081/IntegraOtticoService/integraOttico?
			 * URL_IARGENIO: http://10.10.80.6:8979/IntegraOtticoService/integraOttico?
			 * MMONTISANO 9078
			 */
			ottico= otticoServiceLocator.getOtticoPort(new URL("http://10.10.80.6:8979/OtticoService/ottico"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ottico;
	}
	
	public static void main(String[] args) {
		String messaggio = "";
		
		try {
			TestService test = new TestService();
			
			//1. elaboraFlussiImg
			//ElaboraFlussiImgResponse response = test.getOtticoRef().elaboraFlussiImg(new ElaboraFlussiImgRequest("dummy") );
			//System.out.println("RET: " + response.getResponse().getRetCode().getValue() + " - " + response.getResponse().getRetMessage());

			//2. logElaborazioneFlussi Imgtest.logElaborazioneFlussiImg();
			//3. recuperaTempalte 
			//test.recuperaTemplate();
			//4. stampaBollettino 
			//
			//test.stampaBollettino();
			//5. stampaDocumento
			//test.stampaDocumento();
			//6. stampaQuietanza 
			//test.stampaQuietanza();
			//7. stampaRelata 
			//test.stampaRelata();
			//8.test.verificaConfigurazioneOttico();
			//9.test.verificaFlusso();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public int logElaborazioneFlussiImg() throws Exception{
		try {
		
			TestService test = new TestService();
			
			LogElaborazioneFlussiImgResponse lefi = test.getOtticoRef().logElaborazioneFlussiImg(new LogElaborazioneFlussiImgRequest("testo nel file di log","D:\\FileTemporanei\\Payer\\Log\\","log_LEFI_Ottico.log"));
			System.out.println("RET: " + lefi.getResponse().getRetCode().getValue() + " - " + lefi.getResponse().getRetMessage());

			return Integer.parseInt(lefi.getResponse().getRetCode().getValue());

		} catch (Exception e) {
			throw e;
		}
	}
	
	public int recuperaTemplate(){
		TestService test = new TestService();
	
		Timestamp t1 =Timestamp.valueOf("2011-06-25 00:00:00.0");
		Calendar cal1 = GregorianCalendar.getInstance (  );
		cal1.setTimeInMillis(t1.getTime());

		RecuperaTemplateRequest request = new RecuperaTemplateRequest("B",
				"", "ICI", "", 
				"", "C", 	cal1);
		RecuperaTemplateResponse response = null;
		try {
			response = test.getOtticoRef().recuperaTemplate(request);
			System.out.println("RESPONSE: " + response.getRiferimentoTemplate());
		
		} catch (RemoteException e) {
			e.printStackTrace();
		} 
		
		return Integer.parseInt(response.getResponse().getRetCode().getValue());
	}
	
	public int verificaConfigurazioneOttico() throws Exception{
		try {
		
			TestService test = new TestService();
			
			VerificaConfigurazioneOtticoResponse vcor = test.getOtticoRef().verificaConfigurazioneOttico(new VerificaConfigurazioneOtticoRequest("00004","000TO","ANE0000009"));
			
			System.out.println("VERIFICA response: " + vcor.getFlagVisualizzaRelata());
			System.out.println("RET: " + vcor.getResponse().getRetCode().getValue() + " - " + vcor.getResponse().getRetMessage());

			return Integer.parseInt(vcor.getResponse().getRetCode().getValue());

		} catch (Exception e) {
			throw e;
		}
	}
	
	public int verificaFlusso()throws Exception{
		try {
		 
			TestService test = new TestService();
			
			VerificaFlussoResponse vfr = test.getOtticoRef().verificaFlusso(new VerificaFlussoRequest("00004","000TO","ANE0000009","sdfsdf"));
			
			System.out.println("VERIFICA_FLUSSO response: " + vfr.getPresenzaFlusso());
			System.out.println("RET: " + vfr.getResponse().getRetCode().getValue() + " - " + vfr.getResponse().getRetMessage());

			return Integer.parseInt(vfr.getResponse().getRetCode().getValue());

		} catch (Exception e) {
			throw e;
		}
	}
	
	public int stampaDocumento()throws Exception{
		
		TestService test = new TestService();
		return 0;
	}
// OLD
//		StampaDocumentoRequest request = new StampaDocumentoRequest(
//				chiaveDocumento, flagDocumento, flagWebServiceOttico, 
//				indirizzoWebServiceOttico, userWebServiceOttico, 
//				passwordWebServiceOttico, emailAmministratoreOttico,
//				riferimentoTemplate)
		
// NEW
//		StampaDocumentoRequest request = new StampaDocumentoRequest(
//				codiceSocieta, codiceUtente, codiceEnte,
//				chiaveDocumento, flagDocumento, flagWebServiceOttico,
//				indirizzoWebServiceOttico, userWebServiceOttico,
//				passwordWebServiceOttico, emailAmministratoreOttico,
//				riferimentoTemplate)
		
		//FLAGDOC I o T
//		StampaDocumentoRequest request = new StampaDocumentoRequest(
//				"00004","000TO","06954",
//				"74545b0b-49c6-4c1d-8f93-b93565c6c88c", "I", "P", 
//				"", "", 
//				"", "",
//				"");
//		StampaDocumentoRequest r = new StampaDocumentoRequest(
//				codiceSocieta, codiceUtente, codiceEnte, listaDocumento,
//				listaScadenze, listaTributi, listaMovimenti, chiaveDocumento, 
//				flagDocumento, flagWebServiceOttico, indirizzoWebServiceOttico,
//				userWebServiceOttico, passwordWebServiceOttico, emailAmministratoreOttico, 
//				riferimentoTemplate);
		
	//	StampaDocumentoResponse response = test.getOtticoRef().stampaDocumento(request);
		
	//	return Integer.parseInt(response.getResponse().getRetCode().getValue());
	//}
	
	/*public int stampaBollettino() throws Exception{
		try{
			TestService test = new TestService();

			StampaBollettinoRequest request = new StampaBollettinoRequest("", "", "", 
					"", "74545b0b-49c6-4c1d-8f93-b93565c6c88c", "SI", "P",
					"", "", "",
					"", null);
			StampaBollettinoResponse response = test.getOtticoRef().stampaBollettino(request);
			
			return Integer.parseInt(response.getResponse().getRetCode().getValue());
		}catch(Exception e){
			throw e;
		} 
	
	}*/
	
	/*public int stampaQuietanza() throws Exception{
		try{
			TestService test = new TestService();

			StampaQuietanzaRequest request = new StampaQuietanzaRequest("74545b0b-49c6-4c1d-8f93-b93565c6c88c",
					"SI", null);
			StampaQuietanzaResponse response = test.getOtticoRef().stampaQuietanza(request);
			
			System.out.println("TEST stampaQuietanza: " + response.getQuietanza());
			return Integer.parseInt(response.getResponse().getRetCode().getValue());
			
		}catch(Exception e){
			throw e;
		} 
	}*/
	
	/*public int stampaRelata() throws Exception{
		try{
			TestService test = new TestService();

			StampaRelataRequest request = new StampaRelataRequest("38475629583495023949",
					"00004", "000TO", "ANE0000009",
					"P", 
					"", 
					"", 
					"", 
					"");
			StampaRelataResponse response = test.getOtticoRef().stampaRelata(request);
			String[] relate =  response.getRelate();
			for(int i = 0; i < relate.length; i++){
				System.out.println("TEST stampaRelata - [" + i + "] = " + relate[i]);
			}
			System.out.println("TEST stampaRelata - hai un totale di : " + 
					(response.getRelate() != null ? response.getRelate().length : -1) + " relate.");
			return Integer.parseInt(response.getResponse().getRetCode().getValue());
			
		}catch(Exception e){
			throw e;
		}
	}*/
	
	public int stampaImmagineContenzioso()throws Exception{
		
		TestService test = new TestService();
		return 0;
	}
	
	public int stampaImmagine()throws Exception{
		
		TestService test = new TestService();
		return 0;
	}
}
