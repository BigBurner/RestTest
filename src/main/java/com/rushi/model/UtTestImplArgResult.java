package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_TEST_IMPL_ARG_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_IMPL_ARG_RESULTS")
@NamedQuery(name="UtTestImplArgResult.findAll", query="SELECT u FROM UtTestImplArgResult u")
public class UtTestImplArgResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTIAR_ID")
	private String utiarId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String message;

	private String name;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	private String status;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	@Column(name="UTIR_ID")
	private String utirId;

	//bi-directional many-to-one association to UtTestArgument
	@ManyToOne
	@JoinColumn(name="ARG_ID")
	private UtTestArgument utTestArgument;

	//bi-directional many-to-one association to UtTestImpl
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	public UtTestImplArgResult() {
	}

	public String getUtiarId() {
		return this.utiarId;
	}

	public void setUtiarId(String utiarId) {
		this.utiarId = utiarId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUtirId() {
		return this.utirId;
	}

	public void setUtirId(String utirId) {
		this.utirId = utirId;
	}

	public UtTestArgument getUtTestArgument() {
		return this.utTestArgument;
	}

	public void setUtTestArgument(UtTestArgument utTestArgument) {
		this.utTestArgument = utTestArgument;
	}

	public UtTestImpl getUtTestImpl() {
		return this.utTestImpl;
	}

	public void setUtTestImpl(UtTestImpl utTestImpl) {
		this.utTestImpl = utTestImpl;
	}

}