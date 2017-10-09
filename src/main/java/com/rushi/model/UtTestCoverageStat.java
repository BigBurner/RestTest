package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_TEST_COVERAGE_STATS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_COVERAGE_STATS")
@NamedQuery(name="UtTestCoverageStat.findAll", query="SELECT u FROM UtTestCoverageStat u")
public class UtTestCoverageStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTC_ID")
	private String utcId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private BigDecimal line;

	private String text;

	@Column(name="TOTAL_OCCUR")
	private BigDecimal totalOccur;

	@Column(name="TOTAL_TIME")
	private BigDecimal totalTime;

	@Column(name="UNIT_NAME")
	private String unitName;

	@Column(name="UNIT_OWNER")
	private String unitOwner;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTestImpl
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	//bi-directional many-to-one association to UtTestImplResult
	@ManyToOne
	@JoinColumn(name="UTIR_ID")
	private UtTestImplResult utTestImplResult;

	public UtTestCoverageStat() {
	}

	public String getUtcId() {
		return this.utcId;
	}

	public void setUtcId(String utcId) {
		this.utcId = utcId;
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

	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public BigDecimal getTotalOccur() {
		return this.totalOccur;
	}

	public void setTotalOccur(BigDecimal totalOccur) {
		this.totalOccur = totalOccur;
	}

	public BigDecimal getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(BigDecimal totalTime) {
		this.totalTime = totalTime;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitOwner() {
		return this.unitOwner;
	}

	public void setUnitOwner(String unitOwner) {
		this.unitOwner = unitOwner;
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

}