package com.rushi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


/**
 * The persistent class for the UT_SUITE_ITEM_RESULTS database table.
 * 
 */
@Embeddable
public class UtSuiteItemResultPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String utsrId;
	private String utrId;
	private String utrNsid;
	public String getUtsrId() {
		return utsrId;
	}
	public void setUtsrId(String utsrId) {
		this.utsrId = utsrId;
	}
	public String getUtrId() {
		return utrId;
	}
	public void setUtrId(String utrId) {
		this.utrId = utrId;
	}
	public String getUtrNsid() {
		return utrNsid;
	}
	public void setUtrNsid(String utrNsid) {
		this.utrNsid = utrNsid;
	}

	
}