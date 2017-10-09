package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_SUITE_ITEMS database table.
 * 
 */
@Entity
@Table(name="UT_SUITE_ITEMS")
@NamedQuery(name="UtSuiteItem.findAll", query="SELECT u FROM UtSuiteItem u")
public class UtSuiteItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UtSuiteItemPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="RUN_START")
	private String runStart;

	@Column(name="RUN_TEAR")
	private String runTear;

	private BigDecimal sequence;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtSuite
	@MapsId("utSid")
	@ManyToOne
	@JoinColumn(name="UT_SID")
	private UtSuite utSuite1;

	//bi-directional many-to-one association to UtSuite
	@MapsId("utNsid")
	@ManyToOne
	@JoinColumn(name="UT_NSID")
	private UtSuite utSuite2;

	//bi-directional many-to-one association to UtTest
	@MapsId("utId")
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	public UtSuiteItem() {
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

	public String getRunStart() {
		return this.runStart;
	}

	public void setRunStart(String runStart) {
		this.runStart = runStart;
	}

	public String getRunTear() {
		return this.runTear;
	}

	public void setRunTear(String runTear) {
		this.runTear = runTear;
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

	public UtSuite getUtSuite1() {
		return this.utSuite1;
	}

	public void setUtSuite1(UtSuite utSuite1) {
		this.utSuite1 = utSuite1;
	}

	public UtSuite getUtSuite2() {
		return this.utSuite2;
	}

	public void setUtSuite2(UtSuite utSuite2) {
		this.utSuite2 = utSuite2;
	}

	public UtTest getUtTest() {
		return this.utTest;
	}

	public void setUtTest(UtTest utTest) {
		this.utTest = utTest;
	}

	public UtSuiteItemPK getId() {
		return id;
	}

	public void setId(UtSuiteItemPK id) {
		this.id = id;
	}

}