package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the UT_TEST_IMPL_ARGUMENTS database table.
 * 
 */
@Embeddable
public class UtTestImplArgumentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

//	@Column(name="UTI_ID", insertable=false, updatable=false)
	private String utiId;

//	@Column(name="ARG_ID", insertable=false, updatable=false)
	private String argId;

	public UtTestImplArgumentPK() {
	}
	public String getUtiId() {
		return this.utiId;
	}
	public void setUtiId(String utiId) {
		this.utiId = utiId;
	}
	public String getArgId() {
		return this.argId;
	}
	public void setArgId(String argId) {
		this.argId = argId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtTestImplArgumentPK)) {
			return false;
		}
		UtTestImplArgumentPK castOther = (UtTestImplArgumentPK)other;
		return 
			this.utiId.equals(castOther.utiId)
			&& this.argId.equals(castOther.argId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.utiId.hashCode();
		hash = hash * prime + this.argId.hashCode();
		
		return hash;
	}
}