package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_TEST_IMPL_VAL_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_IMPL_VAL_RESULTS")
@NamedQuery(name="UtTestImplValResult.findAll", query="SELECT u FROM UtTestImplValResult u")
public class UtTestImplValResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTIVR_ID")
	private String utivrId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String message;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	private String status;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	@Column(name="VAL_DURATION")
	private BigDecimal valDuration;

	@Column(name="VAL_END_TIME")
	private String valEndTime;

	@Column(name="VAL_START_TIME")
	private String valStartTime;

	@Column(name="VAL_TYPE")
	private String valType;

	//bi-directional many-to-one association to UtTestImpl
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	//bi-directional many-to-one association to UtTestImplResult
	@ManyToOne
	@JoinColumn(name="UTIR_ID")
	private UtTestImplResult utTestImplResult;

	//bi-directional many-to-one association to UtValidation
	@ManyToOne
	@JoinColumn(name="VAL_ID")
	private UtValidation utValidation;

	public UtTestImplValResult() {
	}

	public String getUtivrId() {
		return this.utivrId;
	}

	public void setUtivrId(String utivrId) {
		this.utivrId = utivrId;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public BigDecimal getValDuration() {
		return this.valDuration;
	}

	public void setValDuration(BigDecimal valDuration) {
		this.valDuration = valDuration;
	}

	public String getValEndTime() {
		return this.valEndTime;
	}

	public void setValEndTime(String valEndTime) {
		this.valEndTime = valEndTime;
	}

	public String getValStartTime() {
		return this.valStartTime;
	}

	public void setValStartTime(String valStartTime) {
		this.valStartTime = valStartTime;
	}

	public String getValType() {
		return this.valType;
	}

	public void setValType(String valType) {
		this.valType = valType;
	}

	public UtTestImpl getUtTestImpl() {
		return this.utTestImpl;
	}

	public void setUtTestImpl(UtTestImpl utTestImpl) {
		this.utTestImpl = utTestImpl;
	}

	public UtTestImplResult getUtTestImplResult() {
		return this.utTestImplResult;
	}

	public void setUtTestImplResult(UtTestImplResult utTestImplResult) {
		this.utTestImplResult = utTestImplResult;
	}

	public UtValidation getUtValidation() {
		return this.utValidation;
	}

	public void setUtValidation(UtValidation utValidation) {
		this.utValidation = utValidation;
	}

}