package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LOOKUP_CATEGORIES database table.
 * 
 */
@Entity
@Table(name="UT_LOOKUP_CATEGORIES")
@NamedQuery(name="UtLookupCategory.findAll", query="SELECT u FROM UtLookupCategory u")
public class UtLookupCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String name;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtLookupDatatype
	@OneToMany(mappedBy="utLookupCategory")
	private List<UtLookupDatatype> utLookupDatatypes;

	public UtLookupCategory() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<UtLookupDatatype> getUtLookupDatatypes() {
		return this.utLookupDatatypes;
	}

	public void setUtLookupDatatypes(List<UtLookupDatatype> utLookupDatatypes) {
		this.utLookupDatatypes = utLookupDatatypes;
	}

	public UtLookupDatatype addUtLookupDatatype(UtLookupDatatype utLookupDatatype) {
		getUtLookupDatatypes().add(utLookupDatatype);
		utLookupDatatype.setUtLookupCategory(this);

		return utLookupDatatype;
	}

	public UtLookupDatatype removeUtLookupDatatype(UtLookupDatatype utLookupDatatype) {
		getUtLookupDatatypes().remove(utLookupDatatype);
		utLookupDatatype.setUtLookupCategory(null);

		return utLookupDatatype;
	}

}