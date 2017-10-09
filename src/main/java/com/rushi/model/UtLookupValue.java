package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_LOOKUP_VALUES database table.
 * 
 */
@Entity
@Table(name="UT_LOOKUP_VALUES")
@NamedQuery(name="UtLookupValue.findAll", query="SELECT u FROM UtLookupValue u")
public class UtLookupValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	@Lob
	private String value;

	//bi-directional many-to-one association to UtLookupDatatype
	@ManyToOne
	@JoinColumn(name="DATA_ID")
	private UtLookupDatatype utLookupDatatype;

	public UtLookupValue() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public UtLookupDatatype getUtLookupDatatype() {
		return this.utLookupDatatype;
	}

	public void setUtLookupDatatype(UtLookupDatatype utLookupDatatype) {
		this.utLookupDatatype = utLookupDatatype;
	}

}