package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_STARTUPS database table.
 * 
 */
@Entity
@Table(name="UT_STARTUPS")
@NamedQuery(name="UtStartup.findAll", query="SELECT u FROM UtStartup u")
public class UtStartup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STARTUP_ID")
	private String startupId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="INDEX_NO")
	private BigDecimal indexNo;

	@Lob
	private String startup;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtLibStartup
	@ManyToOne
	@JoinColumn(name="LIB_STARTUP_ID")
	private UtLibStartup utLibStartup;

	//bi-directional many-to-one association to UtSuite
	@ManyToOne
	@JoinColumn(name="UT_SID")
	private UtSuite utSuite;

	//bi-directional many-to-one association to UtTest
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	public UtStartup() {
	}

	public String getStartupId() {
		return this.startupId;
	}

	public void setStartupId(String startupId) {
		this.startupId = startupId;
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

	public String getStartup() {
		return this.startup;
	}

	public void setStartup(String startup) {
		this.startup = startup;
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

	public UtLibStartup getUtLibStartup() {
		return this.utLibStartup;
	}

	public void setUtLibStartup(UtLibStartup utLibStartup) {
		this.utLibStartup = utLibStartup;
	}

	public UtSuite getUtSuite() {
		return this.utSuite;
	}

	public void setUtSuite(UtSuite utSuite) {
		this.utSuite = utSuite;
	}

	public UtTest getUtTest() {
		return this.utTest;
	}

	public void setUtTest(UtTest utTest) {
		this.utTest = utTest;
	}

}