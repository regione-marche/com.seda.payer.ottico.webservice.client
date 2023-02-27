package com.seda.payer.ottico.webservice.configurazione.source;

import java.io.File;
import java.io.FilenameFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

import com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.CreaAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.CreaParametriOtticoResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.DettaglioAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.DettaglioParametriOtticoResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.EliminaAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.EliminaParametriOtticoResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.ListaAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.ListaParametriOtticoResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.ModificaAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.ModificaParametriOtticoResponse;
import com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateRequest;
import com.seda.payer.ottico.webservice.configurazione.dati.VerificaAssociaTemplateResponse;
import com.seda.payer.ottico.webservice.configurazione.srv.FaultType;

public class TestService_Configurazione {

	private Logger log = Logger.getLogger(TestService_Configurazione.class);

	public TestService_Configurazione(){

	}

	private ConfigurazioneInterface getConfigurazioneRef(){

		ConfigurazioneInterface config = null;
		try {
			ConfigurazioneServiceLocator configServiceLocator=new ConfigurazioneServiceLocator();
			/*
			 * URL_MDECURTIS: http://10.10.80.6:10081/IntegraConfigurazioneService/integraConfigurazione?
			 * URL_IARGENIO: http://10.10.80.6:8979/IntegraConfigurazioneService/integraConfigurazione?
			 */
			config = configServiceLocator.getConfigurazionePort(new URL("http://10.10.80.6:9078/OtticoService/configurazione"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return config;
	}

	public static void main(String[] args) {
		String messaggio = "";

		try {
			TestService_Configurazione test = new TestService_Configurazione();
			//1.
			//test.creaAssociaTemplate();
			//2.
			//test.creaParametriOttico();
			//3.
			//test.eliminaAssociaTemplate();
			//4.
		    //test.eliminaParametriOttico();
			//5.
			//test.modificaAssociaTemplate();
			//6.
			test.modificaParametriOttico();
			//7.
			//test.listaParametriOttico();
			//8.
			//test.listaAssociaTemplate();
			//9.
			//test.dettaglioParametriOttico();
			//10.
			//test.dettaglioAssociaTemplate();
			
			
//			Calendar dataInizio = Calendar.getInstance(); {
//				dataInizio.setTime(Date.valueOf("2011-06-26"));
//			}
//			Calendar dataFine = Calendar.getInstance(); {
//				dataFine.setTime(Date.valueOf("2011-06-30"));
//			}
//			VerificaAssociaTemplateRequest t =
////				new VerificaAssociaTemplateRequest("Q", "", "", "", "", dataInizio, dataFine, null);
//				new VerificaAssociaTemplateRequest("B", "00004", "TAR", "000TO", "ANE0000011", dataInizio, dataFine, null);
//			
//			VerificaAssociaTemplateResponse response = test.getConfigurazioneRef().verificaAssociaTemplate(t);
//			
//			System.out.println(response.isWasExist());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String creaAssociaTemplate(){
		String out ="";
		//pk: c3c0fd5b9  
		
			Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
			Calendar cal = GregorianCalendar.getInstance (  );
			cal.setTimeInMillis(ts.getTime()); 

			System.out.println("Chiamato metodo associa template");

//			CreaAssociaTemplateRequest req  = new CreaAssociaTemplateRequest(
//					codiceSocieta[5], codiceUtente, codiceEnte, 
//					tipoBollettino[1], dataInizio, dataFine, 
//					tipologiaServizio, tipoDocumento, riferimentoTemplate, 
//					cal, operatore[50]); [10 + chiave + ]
			
			CreaAssociaTemplateRequest t = 
				new CreaAssociaTemplateRequest("00001", "00058", "ANE000004", "C", cal, cal, "123", "D", 
						"D:/FileTemporanei/Payer/Ottico/template/bollettino.rptdesign", cal, "usrammi");
				
//				new CreaAssociaTemplateRequest("00001", "00058", "ANE000004", "C", cal, cal, "123", "D", 
//						"D:/FileTemporanei/Payer/Ottico/template/bollettino.rptdesign", cal, "usrammi");

			TestService_Configurazione tsc = new TestService_Configurazione();
			try {
				CreaAssociaTemplateResponse resp = tsc.getConfigurazioneRef().creaAssociaTemplate(t);
			} catch (FaultType e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}

		
		return out;
	}

	public String creaParametriOttico(){
		
		String out ="";
		//pk: c3c0fd5b9  
		
			Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
			Calendar cal = GregorianCalendar.getInstance (  );
			cal.setTimeInMillis(ts.getTime()); 

			System.out.println("Chiamato metodo CREA OTTICO");
			
			CreaParametriOtticoRequest req = new CreaParametriOtticoRequest(
					"00001",
					"00058", 
					"ANE0000004", 
					"N", 
					"N", 
					"N", 
					"N", 
					"P", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					"A", 
					cal,
					"A");
			
			TestService_Configurazione tsc = new TestService_Configurazione();
			
			try {
				CreaParametriOtticoResponse resp = tsc.getConfigurazioneRef().creaParametriOttico(req);
				return out;
			} catch (FaultType e) {
				e.printStackTrace();
				return "ERROR";
			} catch (RemoteException e) {
				e.printStackTrace();
				return "ERROR";
			}
		
	}

	public Boolean eliminaAssociaTemplate(){
		
		String chiaveTemplate = "GTD0000015";
		TestService_Configurazione tsc = new TestService_Configurazione();
		EliminaAssociaTemplateRequest eat = new EliminaAssociaTemplateRequest(chiaveTemplate);
		try {
			EliminaAssociaTemplateResponse resp = tsc.getConfigurazioneRef().eliminaAssociaTemplate(eat);
			System.out.println("OUT DELETE EL.AS.TEMP: " + Integer.parseInt(resp.getResponse().getRetCode().getValue()));
			return Boolean.TRUE;
			
		} catch (FaultType e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (RemoteException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
	
	public Boolean eliminaParametriOttico(){
		
		TestService_Configurazione tsc = new TestService_Configurazione();
		EliminaParametriOtticoRequest req = new EliminaParametriOtticoRequest(
				"00004","000TO","ANE0000009");
		
		try {
			EliminaParametriOtticoResponse resp = tsc.getConfigurazioneRef().eliminaParametriOttico(req);
			System.out.println("OUT: RESUL EL.PARAM. OTTICO: " + Integer.parseInt(resp.getResponse().getRetCode().getValue()));
			return Boolean.TRUE;
		} catch (FaultType e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (RemoteException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
	
	public void listaAssociaTemplate(){
		
		Timestamp t1 =Timestamp.valueOf("2011-06-01 12:29:01.838");
		Calendar cal1 = GregorianCalendar.getInstance (  );
		cal1.setTimeInMillis(t1.getTime());
		
		Timestamp t2 = Timestamp.valueOf("2011-06-01 12:29:01.838"); 
		Calendar cal2 = GregorianCalendar.getInstance (  );
		cal2.setTimeInMillis(t2.getTime()); 
			
		TestService_Configurazione tsc = new TestService_Configurazione();
//		ListaAssociaTemplateRequest request = new ListaAssociaTemplateRequest(
//				codiceSocieta, codiceUtente, codiceEnte, 
//				siglaProvincia, dataInizio, dataFine, 
//				tipologiaServizio, tipoDocumento, rowsPerPage, pageNumber);
		ListaAssociaTemplateRequest request = new ListaAssociaTemplateRequest(
				"00001",
				"00058",
				"ANE0000004",
				null,
				cal1,
				cal2,
				"333",
				"B",
				2,
				2);
		
		try {
			ListaAssociaTemplateResponse response = tsc.getConfigurazioneRef().listaAssociaTemplate(request);
			System.out.println("OUT listaAssociaTemplate: " + Integer.parseInt(response.getResponse().getRetCode().getValue()));
		} catch (FaultType e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public void listaParametriOttico(){
		TestService_Configurazione tsc = new TestService_Configurazione();
//		ListaParametriOtticoRequest req = new ListaParametriOtticoRequest(
//				codiceSocieta, codiceUtente, codiceEnte, siglaProvincia,
//				flagWebServiceOttico, rowsPerPage, pageNumber)
		ListaParametriOtticoRequest request = new ListaParametriOtticoRequest(
				"00004", "000T0", "ANE0000011", null,
				"A", 2, 2);
		
		try {
			ListaParametriOtticoResponse  response = tsc.getConfigurazioneRef().listaParametriOttico(request);
			System.out.println("OUT listaParametriOttico: " + Integer.parseInt(response.getResponse().getRetCode().getValue()));
		} catch (FaultType e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
			
	}
	
	public Boolean modificaAssociaTemplate(){
		
		TestService_Configurazione tsc = new TestService_Configurazione();
		Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
		Calendar cal = GregorianCalendar.getInstance (  );
		cal.setTimeInMillis(ts.getTime()); 

//		ModificaAssociaTemplateRequest aa  = new ModificaAssociaTemplateRequest(
//				chiaveTemplate, codiceSocieta, codiceUtente, 
//				codiceEnte, tipoBollettino, dataInizio, 
//				dataFine, tipologiaServizio, tipoDocumento, 
//				riferimentoTemplate, dataUltimoAgg, operatore);
		
		ModificaAssociaTemplateRequest req = new ModificaAssociaTemplateRequest(
				"GTD0000016",
				"00001", 
				"00058", 
				"ANE0000004", 
				"F",
			cal, 
			cal, 
			"333", 
			"B", 
			"D:/RIF-TEMPLATE/template.rpt",
			cal,
			"testOp");
		
		try {
			ModificaAssociaTemplateResponse resp = tsc.getConfigurazioneRef().modificaAssociaTemplate(req);
			return Boolean.TRUE;
		} catch (FaultType e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (RemoteException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
		
	}
	
	public Boolean modificaParametriOttico(){
		
		TestService_Configurazione tsc = new TestService_Configurazione();
		Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
		Calendar cal = GregorianCalendar.getInstance (  );
		cal.setTimeInMillis(ts.getTime()); 
		
		System.out.println("Chiamato modifica parametri ottico");
		
//		ModificaParametriOtticoRequest s = new ModificaParametriOtticoRequest(
//				codiceSocieta, codiceUtente, codiceEnte, 
//				flagDocumento, flagRelata, flagBollettino, flagQuietanza, 
//				flagWebServiceOttico, indirizzoWebServiceOttico, userWebServiceOttico, 
//				passwordWebServiceOttico, emailAmministratoreOttico, directoryFlussiDatiOttico, 
//				directoryFlussiDatiOtticoOld, directoryFlussiImmaginiOttico, 
//				directoryFlussiImmaginiOtticoOld, directoryImmaginiOttico, 
//				directoryLogOtticoOld, dataUltimoAgg, operatore);
		
		ModificaParametriOtticoRequest req = new ModificaParametriOtticoRequest(
				"00003", 
				"00011", 
				"ANE0000040", 
				"T",
				"I", 
				"N", 
				"N",
				"A",
				"indWS", 
				"usrWS", 
				"passWS", 
				"adm@test.com",
				"dir",
				"dir",
				"dir",
				"dir", 
				"dir", 
				"dir",
				cal,
				"usrammi");
		
		try {
			ModificaParametriOtticoResponse mpr = tsc.getConfigurazioneRef().modificaParametriOttico(req);
			return Boolean.TRUE;
		} catch (FaultType e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} catch (RemoteException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
	
	public void dettaglioParametriOttico(){
		
		System.out.println("Chiamato dettaglio parametri ottico");
		TestService_Configurazione tsc = new TestService_Configurazione();
		Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
		Calendar cal = GregorianCalendar.getInstance (  );
		cal.setTimeInMillis(ts.getTime()); 
		
//		DettaglioParametriOtticoRequest request = new DettaglioParametriOtticoRequest("00001",
//				"00058",
//				"ANE0000005");

		DettaglioParametriOtticoRequest request = new DettaglioParametriOtticoRequest("00001",
				"000TO",
				"ANE0000009");
		try {
			DettaglioParametriOtticoResponse response = tsc.getConfigurazioneRef().dettaglioParametriOttico(request);
			System.out.println("OUT listaParametriOttico: " + Integer.parseInt(response.getResponse().getRetCode().getValue()));
		} catch (FaultType e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dettaglioAssociaTemplate(){
		
		System.out.println("Chiamato dettaglio associa template");
		TestService_Configurazione tsc = new TestService_Configurazione();
		Timestamp ts = new Timestamp ( System.currentTimeMillis (  )  ) ; 
		Calendar cal = GregorianCalendar.getInstance (  );
		cal.setTimeInMillis(ts.getTime()); 
		
		//DettaglioAssociaTemplateRequest requestx = new DettaglioAssociaTemplateRequest();
		DettaglioAssociaTemplateRequest request = new DettaglioAssociaTemplateRequest("GTD0000016");
		
		try {
			DettaglioAssociaTemplateResponse response = tsc.getConfigurazioneRef().dettaglioAssociaTemplate(request);
			System.out.println("OUT dettaglioAssociaTemplate: " + Integer.parseInt(response.getResponse().getRetCode().getValue()));
		} catch (FaultType e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
