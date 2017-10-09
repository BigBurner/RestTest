package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_SUITE database table.
 * 
 */
@Entity
@Table(name="UT_SUITE")
@NamedQuery(name="UtSuite.findAll", query="SELECT u FROM UtSuite u")
public class UtSuite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UT_SID")
	private String utSid;

	private BigDecimal coverage;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String name;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtStartup
	@OneToMany(mappedBy="utSuite")
	private List<UtStartup> utStartups;

	//bi-directional many-to-one association to UtSuiteItem
	@OneToMany(mappedBy="utSuite1")
	private List<UtSuiteItem> utSuiteItems1;

	//bi-directional many-to-one association to UtSuiteItem
	@OneToMany(mappedBy="utSuite2")
	private List<UtSuiteItem> utSuiteItems2;

	//bi-directional many-to-one association to UtSuiteResult
	@OneToMany(mappedBy="utSuite")
	private List<UtSuiteResult> utSuiteResults;

	//bi-directional many-to-one association to UtTeardown
	@OneToMany(mappedBy="utSuite")
	private List<UtTeardown> utTeardowns;

	public UtSuite() {
	}

	public String getUtSid() {
		return this.utSid;
	}

	public void setUtSid(String utSid) {
		this.utSid = utSid;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<UtStartup> getUtStartups() {
		return this.utStartups;
	}

	public void setUtStartups(List<UtStartup> utStartups) {
		this.utStartups = utStartups;
	}

	public UtStartup addUtStartup(UtStartup utStartup) {
		getUtStartups().add(utStartup);
		utStartup.setUtSuite(this);

		return utStartup;
	}

	public UtStartup removeUtStartup(UtStartup utStartup) {
		getUtStartups().remove(utStartup);
		utStartup.setUtSuite(null);

		return utStartup;
	}

	public List<UtSuiteItem> getUtSuiteItems1() {
		return this.utSuiteItems1;
	}

	public void setUtSuiteItems1(List<UtSuiteItem> utSuiteItems1) {
		this.utSuiteItems1 = utSuiteItems1;
	}

	public UtSuiteItem addUtSuiteItems1(UtSuiteItem utSuiteItems1) {
		getUtSuiteItems1().add(utSuiteItems1);
		utSuiteItems1.setUtSuite1(this);

		return utSuiteItems1;
	}

	public UtSuiteItem removeUtSuiteItems1(UtSuiteItem utSuiteItems1) {
		getUtSuiteItems1().remove(utSuiteItems1);
		utSuiteItems1.setUtSuite1(null);

		return utSuiteItems1;
	}

	public List<UtSuiteItem> getUtSuiteItems2() {
		return this.utSuiteItems2;
	}

	public void setUtSuiteItems2(List<UtSuiteItem> utSuiteItems2) {
		this.utSuiteItems2 = utSuiteItems2;
	}

	public UtSuiteItem addUtSuiteItems2(UtSuiteItem utSuiteItems2) {
		getUtSuiteItems2().add(utSuiteItems2);
		utSuiteItems2.setUtSuite2(this);

		return utSuiteItems2;
	}

	public UtSuiteItem removeUtSuiteItems2(UtSuiteItem utSuiteItems2) {
		getUtSuiteItems2().remove(utSuiteItems2);
		utSuiteItems2.setUtSuite2(null);

		return utSuiteItems2;
	}

	public List<UtSuiteResult> getUtSuiteResults() {
		return this.utSuiteResults;
	}

	public void setUtSuiteResults(List<UtSuiteResult> utSuiteResults) {
		this.utSuiteResults = utSuiteResults;
	}

	public UtSuiteResult addUtSuiteResult(UtSuiteResult utSuiteResult) {
		getUtSuiteResults().add(utSuiteResult);
		utSuiteResult.setUtSuite(this);

		return utSuiteResult;
	}

	public UtSuiteResult removeUtSuiteResult(UtSuiteResult utSuiteResult) {
		getUtSuiteResults().remove(utSuiteResult);
		utSuiteResult.setUtSuite(null);

		return utSuiteResult;
	}

	public List<UtTeardown> getUtTeardowns() {
		return this.utTeardowns;
	}

	public void setUtTeardowns(List<UtTeardown> utTeardowns) {
		this.utTeardowns = utTeardowns;
	}

	public UtTeardown addUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().add(utTeardown);
		utTeardown.setUtSuite(this);

		return utTeardown;
	}

	public UtTeardown removeUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().remove(utTeardown);
		utTeardown.setUtSuite(null);

		return utTeardown;
	}

}