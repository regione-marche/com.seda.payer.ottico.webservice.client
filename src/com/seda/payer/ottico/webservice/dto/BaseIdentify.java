package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
/**
 * @author aniello.labua
 */
public class BaseIdentify implements Serializable {

	private static final long serialVersionUID = 1L;
	private String identify;

	/**
	 * Default constructor
	 */
	public BaseIdentify(){}
	
	/**
	 * 
	 * @param identify
	 */
	public BaseIdentify(String identify) {
		this.identify = identify;
	}

	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String toString() {
		return "BaseIdentify [identify=" + identify + "]";
	}
}