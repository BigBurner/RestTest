package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_VALIDATIONS database table.
 * 
 */
@Entity
@Table(name="UT_VALIDATIONS")
@NamedQuery(name="UtValidation.findAll", query="SELECT u FROM UtValidation u")
public class UtValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="VALIDATION_ID")
	private String validationId;

	@Column(name="APPLY_VALIDATION")
	private BigDecimal applyValidation;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="INDEX_NO")
	private BigDecimal indexNo;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	@Lob
	private String validation;

	//bi-directional many-to-one association to UtTestImplValResult
	@OneToMany(mappedBy="utValidation")
	private List<UtTestImplValResult> utTestImplValResults;

	//bi-directional many-to-one association to UtLibValidation
	@ManyToOne
	@JoinColumn(name="LIB_VALIDATION_ID")
	private UtLibValidation utLibValidation;

	//bi-directional many-to-one association to UtTestImpl
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	public UtValidation() {
	}

	public String getValidationId() {
		return this.validationId;
	}

	public void setValidationId(String validationId) {
		this.validationId = validationId;
	}

	public BigDecimal getApplyValidation() {
		return this.applyValidation;
	}

	public void setApplyValidation(BigDecimal applyValidation) {
		this.applyValidation = applyValidation;
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

	public BigDecimal getIndexNo() {
		return this.indexNo;
	}

	public void setIndexNo(BigDecimal indexNo) {
		this.indexNo = indexNo;
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

	public String getValidation() {
		return this.validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public List<UtTestImplValResult> getUtTestImplValResults() {
		return this.utTestImplValResults;
	}

	public void setUtTestImplValResults(List<UtTestImplValResult> utTestImplValResults) {
		this.utTestImplValResults = utTestImplValResults;
	}

	public UtTestImplValResult addUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().add(utTestImplValResult);
		utTestImplValResult.setUtValidation(this);

		return utTestImplValResult;
	}

	public UtTestImplValResult removeUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().remove(utTestImplValResult);
		utTestImplValResult.setUtValidation(null);

		return utTestImplValResult;
	}

	public UtLibValidation getUtLibValidation() {
		return this.utLibValidation;
	}

	public void setUtLibValidation(UtLibValidation utLibValidation) {
		this.utLibValidation = utLibValidation;
	}

	public UtTestImpl getUtTestImpl() {
		return this.utTestImpl;
	}

	public void setUtTestImpl(UtTestImpl utTestImpl) {
		this.utTestImpl = utTestImpl;
	}

}