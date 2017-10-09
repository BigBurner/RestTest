package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_TEST_IMPL_RESULTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_IMPL_RESULTS")
@NamedQuery(name="UtTestImplResult.findAll", query="SELECT u FROM UtTestImplResult u")
public class UtTestImplResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTIR_ID")
	private String utirId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private BigDecimal duration;

	@Column(name="END_TIME")
	private String endTime;

	private String message;

	private String name;

	@Column(name="OP_CALL_DURATION")
	private BigDecimal opCallDuration;

	@Column(name="OP_CALL_END_TIME")
	private String opCallEndTime;

	@Column(name="OP_CALL_MESSAGE")
	private String opCallMessage;

	@Column(name="OP_CALL_START_TIME")
	private String opCallStartTime;

	@Column(name="OP_CALL_STATUS")
	private String opCallStatus;

	@Column(name="RUN_DATE")
	private Timestamp runDate;

	@Column(name="START_TIME")
	private String startTime;

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

	//bi-directional many-to-one association to UtTestCoverageStat
	@OneToMany(mappedBy="utTestImplResult")
	private List<UtTestCoverageStat> utTestCoverageStats;

	//bi-directional many-to-one association to UtTestImpl
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	//bi-directional many-to-one association to UtTestResult
	@ManyToOne
	@JoinColumn(name="UTR_ID")
	private UtTestResult utTestResult;

	//bi-directional many-to-one association to UtTestImplValResult
	@OneToMany(mappedBy="utTestImplResult")
	private List<UtTestImplValResult> utTestImplValResults;

	public UtTestImplResult() {
	}

	public String getUtirId() {
		return this.utirId;
	}

	public void setUtirId(String utirId) {
		this.utirId = utirId;
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

	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public BigDecimal getOpCallDuration() {
		return this.opCallDuration;
	}

	public void setOpCallDuration(BigDecimal opCallDuration) {
		this.opCallDuration = opCallDuration;
	}

	public String getOpCallEndTime() {
		return this.opCallEndTime;
	}

	public void setOpCallEndTime(String opCallEndTime) {
		this.opCallEndTime = opCallEndTime;
	}

	public String getOpCallMessage() {
		return this.opCallMessage;
	}

	public void setOpCallMessage(String opCallMessage) {
		this.opCallMessage = opCallMessage;
	}

	public String getOpCallStartTime() {
		return this.opCallStartTime;
	}

	public void setOpCallStartTime(String opCallStartTime) {
		this.opCallStartTime = opCallStartTime;
	}

	public String getOpCallStatus() {
		return this.opCallStatus;
	}

	public void setOpCallStatus(String opCallStatus) {
		this.opCallStatus = opCallStatus;
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
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

	public List<UtTestCoverageStat> getUtTestCoverageStats() {
		return this.utTestCoverageStats;
	}

	public void setUtTestCoverageStats(List<UtTestCoverageStat> utTestCoverageStats) {
		this.utTestCoverageStats = utTestCoverageStats;
	}

	public UtTestCoverageStat addUtTestCoverageStat(UtTestCoverageStat utTestCoverageStat) {
		getUtTestCoverageStats().add(utTestCoverageStat);
		utTestCoverageStat.setUtTestImplResult(this);

		return utTestCoverageStat;
	}

	public UtTestCoverageStat removeUtTestCoverageStat(UtTestCoverageStat utTestCoverageStat) {
		getUtTestCoverageStats().remove(utTestCoverageStat);
		utTestCoverageStat.setUtTestImplResult(null);

		return utTestCoverageStat;
	}

	public UtTestImpl getUtTestImpl() {
		return this.utTestImpl;
	}

	public void setUtTestImpl(UtTestImpl utTestImpl) {
		this.utTestImpl = utTestImpl;
	}

	public UtTestResult getUtTestResult() {
		return this.utTestResult;
	}

	public void setUtTestResult(UtTestResult utTestResult) {
		this.utTestResult = utTestResult;
	}

	public List<UtTestImplValResult> getUtTestImplValResults() {
		return this.utTestImplValResults;
	}

	public void setUtTestImplValResults(List<UtTestImplValResult> utTestImplValResults) {
		this.utTestImplValResults = utTestImplValResults;
	}

	public UtTestImplValResult addUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().add(utTestImplValResult);
		utTestImplValResult.setUtTestImplResult(this);

		return utTestImplValResult;
	}

	public UtTestImplValResult removeUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().remove(utTestImplValResult);
		utTestImplValResult.setUtTestImplResult(null);

		return utTestImplValResult;
	}

}