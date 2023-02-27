package com.seda.payer.ottico.webservice.dto;

import java.io.Serializable;
import com.seda.data.spi.PageInfo;

public class CollectionDto implements Serializable {

	private static final long serialVersionUID = 1L;
    private String listXml;
    private PageInfo pageInfo;

    public CollectionDto() { 
    	pageInfo = new PageInfo();
    }
    
    public CollectionDto(String listXml, PageInfo pageInfo) {
    	this.listXml = listXml;
    	this.pageInfo = pageInfo;
    }

	public String getListXml() {
		return listXml;
	}

	public void setListXml(String listXml) {
		this.listXml = listXml;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
}