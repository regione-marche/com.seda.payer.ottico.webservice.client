package com.seda.payer.ottico.webservice.dto;

import java.text.MessageFormat;
import java.util.ResourceBundle;
/**
 * @author marco.montisano
 */
public enum ElaboraFlussiImgState {
	Success, 
	Error, 
	ErrorConfiguration, 
	NotFound
	;
    private static ResourceBundle rb;

    public String format( Object... args ) {
        synchronized(ElaboraFlussiImgState.class) {
            if(rb==null)
                rb = ResourceBundle.getBundle(ElaboraFlussiImgState.class.getName());
            return MessageFormat.format(rb.getString(name()),args);
        }
    }
}