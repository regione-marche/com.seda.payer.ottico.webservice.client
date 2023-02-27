package com.seda.payer.ottico.webservice.manager.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.seda.payer.ottico.webservice.configurazione.srv.FaultType;
import com.seda.payer.ottico.webservice.manager.dati.RicercaListaElabOtticoRequest;
import com.seda.payer.ottico.webservice.manager.dati.RicercaListaElabOtticoResponse;

public class TestService_Manager {

	public static void main(String args[]){
		
		TestService_Manager tsm = new TestService_Manager();
		
		tsm.ricercaListaElabOttico();
	}
	
	public TestService_Manager(){
		
	}
	
	private ManagerInterface getManagerRef(){

		ManagerInterface manager = null;
		try {
			ManagerServiceLocator managerServiceLocator=new ManagerServiceLocator();
			/*
			 * URL_MDECURTIS: http://10.10.80.6:10081/IntegraConfigurazioneService/integraConfigurazione?
			 * URL_IARGENIO: http://10.10.80.6:8979/IntegraConfigurazioneService/integraConfigurazione?
			 */
			manager = managerServiceLocator.getManagerPort(new URL("http://10.10.80.6:8979/OtticoService/manager"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return manager;
	}
	
	/*3.*/
	public void ricercaListaElabOttico(){
		
		Timestamp t1 =Timestamp.valueOf("2011-01-26 11:57:33.52");
		Calendar cal1 = GregorianCalendar.getInstance (  );
		cal1.setTimeInMillis(t1.getTime());
		
		TestService_Manager tsm = new TestService_Manager();
		
//		RicercaListaElabOtticoRequest req =  new RicercaListaElabOtticoRequest(
//				codiceSocieta, codiceUtente, codiceEnte,
//				siglaProvincia, dataElaborazioneDa, 
//				dataElaborazioneA, dataCreazioneDa, 
//				dataCreazioneA, tipologiaFlusso, 
//				rowsPerPage, pageNumber);
		
		RicercaListaElabOtticoRequest req =  new RicercaListaElabOtticoRequest(
				"00004", "000TO", "ANE0000009",
				null, cal1, 
				cal1, cal1, 
				cal1, "asd","1",
				0, 0, "");
		
		try {
			RicercaListaElabOtticoResponse response = tsm.getManagerRef().ricercaListaElabOttico(req);
			System.out.println("OUT ricercaListaElabOttico: " + Integer.parseInt(response.getResponse().getRetCode().getValue()));
			
		} catch (FaultType e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		}
	}

