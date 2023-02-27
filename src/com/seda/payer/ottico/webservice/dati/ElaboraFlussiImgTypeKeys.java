package com.seda.payer.ottico.webservice.dati;

import java.util.Enumeration;
import java.util.ResourceBundle;

public enum ElaboraFlussiImgTypeKeys {
	Success,
	Error,
	ErrorConfiguration, 
	NotFound
	;
    private static ResourceBundle rb;
    public static String parse( String value ) {
        synchronized(ElaboraFlussiImgTypeKeys.class) {
            if (rb == null)
            	rb = ResourceBundle.getBundle(ElaboraFlussiImgTypeKeys.class.getName());

            Enumeration<String> keys = rb.getKeys();
            while (keys.hasMoreElements()) {
            	String nextKey = keys.nextElement();
            	String nextValue = rb.getString(nextKey);
            	if (nextKey.compareTo(value) == 0)
            		return nextValue;
            	else if (nextValue.compareTo(value) == 0)
            		return nextKey;
            }
            return null;
        }
    }
    /*public String format( Object... args ) {
        synchronized(ElaboraFlussiImgTypeKeys.class) {
            if (rb == null)
            	rb = ResourceBundle.getBundle(ElaboraFlussiImgTypeKeys.class.getName());

            return MessageFormat.format(rb.getString(name()), args);
        }
    }*/
}