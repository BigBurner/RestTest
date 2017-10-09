package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_TEST_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_RESULTS")
@NamedQuery(name="UtTestResult.findAll", query="SELECT u FROM UtTestResult u")
public class UtTestResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTR_ID")
	private String utrId;

	@Column(name="CONNECTION_NAME")
	private String connectionName;

	private BigDecimal coverage;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String message;

	private String name;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	private String status;

	@Column(name="TEST_USER_NAME")
	private String testUserName;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtSuiteItemResult
	@OneToMany(mappedBy="utTestResult")
	private List<UtSuiteItemResult> utSuiteItemResults;

	//bi-directional many-to-one association to UtTestImplResult
	@OneToMany(mappedBy="utTestResult")
	private List<UtTestImplResult> utTestImplResults;

	//bi-directional many-to-one association to UtTest
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	public UtTestResult() {
	}

	public String getUtrId() {
		return this.utrId;
	}

	public void setUtrId(String utrId) {
		this.utrId = utrId;
	}

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public BigDecimal getCoverage() {
		return this.coverage;
	}

	public void setCoverage(BigDecimal coverage) {
		this.coverage = coverage;
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

	public String getTestUserName() {
		return this.testUserName;
	}

	public void setTestUserName(String testUserName) {
		this.testUserName = testUserName;
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

	public List<UtSuiteItemResult> getUtSuiteItemResults() {
		return this.utSuiteItemResults;
	}

	public void setUtSuiteItemResults(List<UtSuiteItemResult> utSuiteItemResults) {
		this.utSuiteItemResults = utSuiteItemResults;
	}

	public UtSuiteItemResult addUtSuiteItemResult(UtSuiteItemResult utSuiteItemResult) {
		getUtSuiteItemResults().add(utSuiteItemResult);
		utSuiteItemResult.setUtTestResult(this);

		return utSuiteItemResult;
	}

	public UtSuiteItemResult removeUtSuiteItemResult(UtSuiteItemResult utSuiteItemResult) {
		getUtSuiteItemResults().remove(utSuiteItemResult);
		utSuiteItemResult.setUtTestResult(null);

		return utSuiteItemResult;
	}

	public List<UtTestImplResult> getUtTestImplResults() {
		return this.utTestImplResults;
	}

	public void setUtTestImplResults(List<UtTestImplResult> utTestImplResults) {
		this.utTestImplResults = utTestImplResults;
	}

	public UtTestImplResult addUtTestImplResult(UtTestImplResult utTestImplResult) {
		getUtTestImplResults().add(utTestImplResult);
		utTestImplResult.setUtTestResult(this);

		return utTestImplResult;
	}

	public UtTestImplResult removeUtTestImplResult(UtTestImplResult utTestImplResult) {
		getUtTestImplResults().remove(utTestImplResult);
		utTestImplResult.setUtTestResult(null);

		return utTestImplResult;
	}

	public UtTest getUtTest() {
		return this.utTest;
	}

	public void setUtTest(UtTest utTest) {
		this.utTest = utTest;
	}

}