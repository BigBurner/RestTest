package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_SUITE_ITEM_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_SUITE_ITEM_RESULTS")
@NamedQuery(name="UtSuiteItemResult.findAll", query="SELECT u FROM UtSuiteItemResult u")
public class UtSuiteItemResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UtSuiteItemResultPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private BigDecimal sequence;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtSuiteResult
	@MapsId("utsrId")
	@ManyToOne
	@JoinColumn(name="UTSR_ID")
	private UtSuiteResult utSuiteResult1;

	//bi-directional many-to-one association to UtSuiteResult
	@MapsId("utrNsid")
	@ManyToOne
	@JoinColumn(name="UTR_NSID")
	private UtSuiteResult utSuiteResult2;

	//bi-directional many-to-one association to UtTestResult
	@MapsId("utrId")
	@ManyToOne
	@JoinColumn(name="UTR_ID")
	private UtTestResult utTestResult;

	public UtSuiteItemResult() {
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

	public BigDecimal getSequence() {
		return this.sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
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

	public UtSuiteResult getUtSuiteResult1() {
		return this.utSuiteResult1;
	}

	public void setUtSuiteResult1(UtSuiteResult utSuiteResult1) {
		this.utSuiteResult1 = utSuiteResult1;
	}

	public UtSuiteResult getUtSuiteResult2() {
		return this.utSuiteResult2;
	}

	public void setUtSuiteResult2(UtSuiteResult utSuiteResult2) {
		this.utSuiteResult2 = utSuiteResult2;
	}

	public UtTestResult getUtTestResult() {
		return this.utTestResult;
	}

	public void setUtTestResult(UtTestResult utTestResult) {
		this.utTestResult = utTestResult;
	}

	public UtSuiteItemResultPK getId() {
		return id;
	}

	public void setId(UtSuiteItemResultPK id) {
		this.id = id;
	}

}