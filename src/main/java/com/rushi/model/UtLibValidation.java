package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LIB_VALIDATIONS database table.
 * 
 */
@Entity
@Table(name="UT_LIB_VALIDATIONS")
@NamedQuery(name="UtLibValidation.findAll", query="SELECT u FROM UtLibValidation u")
public class UtLibValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIB_VALIDATION_ID")
	private String libValidationId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="LIB_VALIDATION")
	private String libValidation;

	@Column(name="LIB_VALIDATION_CLASS")
	private String libValidationClass;

	@Column(name="LIB_VALIDATION_NAME")
	private String libValidationName;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtValidation
	@OneToMany(mappedBy="utLibValidation")
	private List<UtValidation> utValidations;

	public UtLibValidation() {
	}

	public String getLibValidationId() {
		return this.libValidationId;
	}

	public void setLibValidationId(String libValidationId) {
		this.libValidationId = libValidationId;
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

	public String getLibValidation() {
		return this.libValidation;
	}

	public void setLibValidation(String libValidation) {
		this.libValidation = libValidation;
	}

	public String getLibValidationClass() {
		return this.libValidationClass;
	}

	public void setLibValidationClass(String libValidationClass) {
		this.libValidationClass = libValidationClass;
	}

	public String getLibValidationName() {
		return this.libValidationName;
	}

	public void setLibValidationName(String libValidationName) {
		this.libValidationName = libValidationName;
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

	public List<UtValidation> getUtValidations() {
		return this.utValidations;
	}

	public void setUtValidations(List<UtValidation> utValidations) {
		this.utValidations = utValidations;
	}

	public UtValidation addUtValidation(UtValidation utValidation) {
		getUtValidations().add(utValidation);
		utValidation.setUtLibValidation(this);

		return utValidation;
	}

	public UtValidation removeUtValidation(UtValidation utValidation) {
		getUtValidations().remove(utValidation);
		utValidation.setUtLibValidation(null);

		return utValidation;
	}

}