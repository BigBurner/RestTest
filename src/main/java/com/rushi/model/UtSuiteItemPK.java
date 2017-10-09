package com.rushi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


/**
 * The persistent class for the UT_SUITE_ITEMS database table.
 * 
 */
@Embeddable
public class UtSuiteItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Column(name="UT_SID")
	private String utSid;

//	@Column(name="UT_NSID")
	private String utNsid;

//	@Column(name="UT_ID")
	private String utId;


	public UtSuiteItemPK() {
	}


	public String getUtSid() {
		return utSid;
	}


	public void setUtSid(String utSid) {
		this.utSid = utSid;
	}


	public String getUtNsid() {
		return utNsid;
	}


	public void setUtNsid(String utNsid) {
		this.utNsid = utNsid;
	}


	public String getUtId() {
		return utId;
	}


	public void setUtId(String utId) {
		this.utId = utId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((utId == null) ? 0 : utId.hashCode());
		result = prime * result + ((utNsid == null) ? 0 : utNsid.hashCode());
		result = prime * result + ((utSid == null) ? 0 : utSid.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UtSuiteItemPK other = (UtSuiteItemPK) obj;
		if (utId == null) {
			if (other.utId != null)
				return false;
		} else if (!utId.equals(other.utId))
			return false;
		if (utNsid == null) {
			if (other.utNsid != null)
				return false;
		} else if (!utNsid.equals(other.utNsid))
			return false;
		if (utSid == null) {
			if (other.utSid != null)
				return false;
		} else if (!utSid.equals(other.utSid))
			return false;
		return true;
	}


}