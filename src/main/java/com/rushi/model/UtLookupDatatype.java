package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LOOKUP_DATATYPES database table.
 * 
 */
@Entity
@Table(name="UT_LOOKUP_DATATYPES")
@NamedQuery(name="UtLookupDatatype.findAll", query="SELECT u FROM UtLookupDatatype u")
public class UtLookupDatatype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="TYPE_ID")
	private BigDecimal typeId;

	@Column(name="TYPE_STRING")
	private String typeString;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtLookupCategory
	@ManyToOne
	@JoinColumn(name="CAT_ID")
	private UtLookupCategory utLookupCategory;

	//bi-directional many-to-one association to UtLookupValue
	@OneToMany(mappedBy="utLookupDatatype")
	private List<UtLookupValue> utLookupValues;

	public UtLookupDatatype() {
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

	public BigDecimal getTypeId() {
		return this.typeId;
	}

	public void setTypeId(BigDecimal typeId) {
		this.typeId = typeId;
	}

	public String getTypeString() {
		return this.typeString;
	}

	public void setTypeString(String typeString) {
		this.typeString = typeString;
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

	public UtLookupCategory getUtLookupCategory() {
		return this.utLookupCategory;
	}

	public void setUtLookupCategory(UtLookupCategory utLookupCategory) {
		this.utLookupCategory = utLookupCategory;
	}

	public List<UtLookupValue> getUtLookupValues() {
		return this.utLookupValues;
	}

	public void setUtLookupValues(List<UtLookupValue> utLookupValues) {
		this.utLookupValues = utLookupValues;
	}

	public UtLookupValue addUtLookupValue(UtLookupValue utLookupValue) {
		getUtLookupValues().add(utLookupValue);
		utLookupValue.setUtLookupDatatype(this);

		return utLookupValue;
	}

	public UtLookupValue removeUtLookupValue(UtLookupValue utLookupValue) {
		getUtLookupValues().remove(utLookupValue);
		utLookupValue.setUtLookupDatatype(null);

		return utLookupValue;
	}

}