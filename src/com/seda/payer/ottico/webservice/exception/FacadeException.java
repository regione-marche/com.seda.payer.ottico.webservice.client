package com.seda.payer.ottico.webservice.exception;

/**
 * @author mmontisano
 */
public class FacadeException extends Exception {

	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorDescription;
	/**
	 * 
	 * @param message
	 */
	public FacadeException() {
		super();
	}
	/**
	 * 
	 * @param message
	 */
	public FacadeException(String message) {
		super(message);
		this.errorDescription = message;
	}
	/**
	 * 
	 * @param message
	 * @param t
	 */
	public FacadeException(String message, Throwable t) {
		super(message, t);
		this.errorDescription = message;
	}
	/**
	 * 
	 * @param t
	 */
	public FacadeException(Throwable t) {
		super(t);
	}
	/**
	 * 
	 * @param code
	 * @param message
	 */
	public FacadeException(int code, String message) {
		super(code + " - " + message);
		this.errorCode = code;
		this.errorDescription = message;
	}

	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	
}