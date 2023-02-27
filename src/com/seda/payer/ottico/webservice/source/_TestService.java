package com.seda.payer.ottico.webservice.source;

import com.seda.payer.ottico.webservice.dati.PresenzaFlussoTypeKeys;

public class _TestService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			boolean appo = false;

			System.out.println(PresenzaFlussoTypeKeys.parse(String.valueOf(appo)));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private void tabellaGTD(){
		
//CAMPI
//		1. GTD_KGTDKGTD - CHAR(10)      - PK
//		2. GTD_FGTDTIPO - CHAR(1)
//		3. GTD_CSOCCSOC - CHAR(5)
//		4. GTD_CTSECTSE - CHAR(3)
//		5. GTD_CUTECUTE - CHAR(5)
//		6. GTD_KANEKENT - CHAR(10)
//		7. GTD_FGTDTIPB - CHAR(1)
//		8. GTD_GGTDDTINB - TIMESTAMP
//		9. GTD_GGTDDTFI  - TIMESTAMP
//		10. GTD_CGTDTEMP - VARCHAR(256)
//		11. GTD_GGTDGAGG - TIMESTAMP
//		12. GTD_CGTDCOPE - VARCHAR(50)
	}

}
