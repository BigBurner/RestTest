package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_TEARDOWNS database table.
 * 
 */
@Entity
@Table(name="UT_TEARDOWNS")
@NamedQuery(name="UtTeardown.findAll", query="SELECT u FROM UtTeardown u")
public class UtTeardown implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TEARDOWN_ID")
	private String teardownId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="INDEX_NO")
	private BigDecimal indexNo;

	@Lob
	private String teardown;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtLibTeardown
	@ManyToOne
	@JoinColumn(name="LIB_TEARDOWN_ID")
	private UtLibTeardown utLibTeardown;

	//bi-directional many-to-one association to UtSuite
	@ManyToOne
	@JoinColumn(name="UT_SID")
	private UtSuite utSuite;

	//bi-directional many-to-one association to UtTest
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	public UtTeardown() {
	}

	public String getTeardownId() {
		return this.teardownId;
	}

	public void setTeardownId(String teardownId) {
		this.teardownId = teardownId;
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

	public String getTeardown() {
		return this.teardown;
	}

	public void setTeardown(String teardown) {
		this.teardown = teardown;
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

	public UtLibTeardown getUtLibTeardown() {
		return this.utLibTeardown;
	}

	public void setUtLibTeardown(UtLibTeardown utLibTeardown) {
		this.utLibTeardown = utLibTeardown;
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