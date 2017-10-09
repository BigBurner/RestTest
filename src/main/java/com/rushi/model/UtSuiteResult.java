package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_SUITE_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_SUITE_RESULTS")
@NamedQuery(name="UtSuiteResult.findAll", query="SELECT u FROM UtSuiteResult u")
public class UtSuiteResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTSR_ID")
	private String utsrId;

	private BigDecimal coverage;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String message;

	private String name;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	@Column(name="STARTUP_DURATION")
	private BigDecimal startupDuration;

	@Column(name="STARTUP_END_TIME")
	private String startupEndTime;

	@Column(name="STARTUP_MESSAGE")
	private String startupMessage;

	@Column(name="STARTUP_START_TIME")
	private String startupStartTime;

	@Column(name="STARTUP_STATUS")
	private String startupStatus;

	private String status;

	@Column(name="TEARDOWN_DURATION")
	private BigDecimal teardownDuration;

	@Column(name="TEARDOWN_END_TIME")
	private String teardownEndTime;

	@Column(name="TEARDOWN_MESSAGE")
	private String teardownMessage;

	@Column(name="TEARDOWN_START_TIME")
	private String teardownStartTime;

	@Column(name="TEARDOWN_STATUS")
	private String teardownStatus;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtSuiteItemResult
	@OneToMany(mappedBy="utSuiteResult1")
	private List<UtSuiteItemResult> utSuiteItemResults1;

	//bi-directional many-to-one association to UtSuiteItemResult
	@OneToMany(mappedBy="utSuiteResult2")
	private List<UtSuiteItemResult> utSuiteItemResults2;

	//bi-directional many-to-one association to UtSuite
	@ManyToOne
	@JoinColumn(name="UT_SID")
	private UtSuite utSuite;

	public UtSuiteResult() {
	}

	public String getUtsrId() {
		return this.utsrId;
	}

	public void setUtsrId(String utsrId) {
		this.utsrId = utsrId;
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

	public BigDecimal getStartupDuration() {
		return this.startupDuration;
	}

	public void setStartupDuration(BigDecimal startupDuration) {
		this.startupDuration = startupDuration;
	}

	public String getStartupEndTime() {
		return this.startupEndTime;
	}

	public void setStartupEndTime(String startupEndTime) {
		this.startupEndTime = startupEndTime;
	}

	public String getStartupMessage() {
		return this.startupMessage;
	}

	public void setStartupMessage(String startupMessage) {
		this.startupMessage = startupMessage;
	}

	public String getStartupStartTime() {
		return this.startupStartTime;
	}

	public void setStartupStartTime(String startupStartTime) {
		this.startupStartTime = startupStartTime;
	}

	public String getStartupStatus() {
		return this.startupStatus;
	}

	public void setStartupStatus(String startupStatus) {
		this.startupStatus = startupStatus;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTeardownDuration() {
		return this.teardownDuration;
	}

	public void setTeardownDuration(BigDecimal teardownDuration) {
		this.teardownDuration = teardownDuration;
	}

	public String getTeardownEndTime() {
		return this.teardownEndTime;
	}

	public void setTeardownEndTime(String teardownEndTime) {
		this.teardownEndTime = teardownEndTime;
	}

	public String getTeardownMessage() {
		return this.teardownMessage;
	}

	public void setTeardownMessage(String teardownMessage) {
		this.teardownMessage = teardownMessage;
	}

	public String getTeardownStartTime() {
		return this.teardownStartTime;
	}

	public void setTeardownStartTime(String teardownStartTime) {
		this.teardownStartTime = teardownStartTime;
	}

	public String getTeardownStatus() {
		return this.teardownStatus;
	}

	public void setTeardownStatus(String teardownStatus) {
		this.teardownStatus = teardownStatus;
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

	public List<UtSuiteItemResult> getUtSuiteItemResults1() {
		return this.utSuiteItemResults1;
	}

	public void setUtSuiteItemResults1(List<UtSuiteItemResult> utSuiteItemResults1) {
		this.utSuiteItemResults1 = utSuiteItemResults1;
	}

	public UtSuiteItemResult addUtSuiteItemResults1(UtSuiteItemResult utSuiteItemResults1) {
		getUtSuiteItemResults1().add(utSuiteItemResults1);
		utSuiteItemResults1.setUtSuiteResult1(this);

		return utSuiteItemResults1;
	}

	public UtSuiteItemResult removeUtSuiteItemResults1(UtSuiteItemResult utSuiteItemResults1) {
		getUtSuiteItemResults1().remove(utSuiteItemResults1);
		utSuiteItemResults1.setUtSuiteResult1(null);

		return utSuiteItemResults1;
	}

	public List<UtSuiteItemResult> getUtSuiteItemResults2() {
		return this.utSuiteItemResults2;
	}

	public void setUtSuiteItemResults2(List<UtSuiteItemResult> utSuiteItemResults2) {
		this.utSuiteItemResults2 = utSuiteItemResults2;
	}

	public UtSuiteItemResult addUtSuiteItemResults2(UtSuiteItemResult utSuiteItemResults2) {
		getUtSuiteItemResults2().add(utSuiteItemResults2);
		utSuiteItemResults2.setUtSuiteResult2(this);

		return utSuiteItemResults2;
	}

	public UtSuiteItemResult removeUtSuiteItemResults2(UtSuiteItemResult utSuiteItemResults2) {
		getUtSuiteItemResults2().remove(utSuiteItemResults2);
		utSuiteItemResults2.setUtSuiteResult2(null);

		return utSuiteItemResults2;
	}

	public UtSuite getUtSuite() {
		return this.utSuite;
	}

	public void setUtSuite(UtSuite utSuite) {
		this.utSuite = utSuite;
	}

}