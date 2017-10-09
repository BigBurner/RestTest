package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_TEST database table.
 * 
 */
@Entity
@Table(name="UT_TEST")
@NamedQuery(name="UtTest.findAll", query="SELECT u FROM UtTest u")
public class UtTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UT_ID")
	private String utId;

	@Column(name="CONNECTION_NAME")
	private String connectionName;

	private BigDecimal coverage;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	private String name;

	@Column(name="OBJECT_CALL")
	private String objectCall;

	@Column(name="OBJECT_NAME")
	private String objectName;

	@Column(name="OBJECT_OWNER")
	private String objectOwner;

	@Column(name="OBJECT_TYPE")
	private String objectType;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtStartup
	@OneToMany(mappedBy="utTest")
	private List<UtStartup> utStartups;

	//bi-directional many-to-one association to UtSuiteItem
	@OneToMany(mappedBy="utTest")
	private List<UtSuiteItem> utSuiteItems;

	//bi-directional many-to-one association to UtTeardown
	@OneToMany(mappedBy="utTest")
	private List<UtTeardown> utTeardowns;

	//bi-directional many-to-one association to UtTestArgument
	@OneToMany(mappedBy="utTest")
	private List<UtTestArgument> utTestArguments;

	//bi-directional many-to-one association to UtTestImpl
	@OneToMany(mappedBy="utTest")
	private List<UtTestImpl> utTestImpls;

	//bi-directional many-to-one association to UtTestResult
	@OneToMany(mappedBy="utTest")
	private List<UtTestResult> utTestResults;

	public UtTest() {
	}

	public String getUtId() {
		return this.utId;
	}

	public void setUtId(String utId) {
		this.utId = utId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectCall() {
		return this.objectCall;
	}

	public void setObjectCall(String objectCall) {
		this.objectCall = objectCall;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectOwner() {
		return this.objectOwner;
	}

	public void setObjectOwner(String objectOwner) {
		this.objectOwner = objectOwner;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
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
		utStartup.setUtTest(this);

		return utStartup;
	}

	public UtStartup removeUtStartup(UtStartup utStartup) {
		getUtStartups().remove(utStartup);
		utStartup.setUtTest(null);

		return utStartup;
	}

	public List<UtSuiteItem> getUtSuiteItems() {
		return this.utSuiteItems;
	}

	public void setUtSuiteItems(List<UtSuiteItem> utSuiteItems) {
		this.utSuiteItems = utSuiteItems;
	}

	public UtSuiteItem addUtSuiteItem(UtSuiteItem utSuiteItem) {
		getUtSuiteItems().add(utSuiteItem);
		utSuiteItem.setUtTest(this);

		return utSuiteItem;
	}

	public UtSuiteItem removeUtSuiteItem(UtSuiteItem utSuiteItem) {
		getUtSuiteItems().remove(utSuiteItem);
		utSuiteItem.setUtTest(null);

		return utSuiteItem;
	}

	public List<UtTeardown> getUtTeardowns() {
		return this.utTeardowns;
	}

	public void setUtTeardowns(List<UtTeardown> utTeardowns) {
		this.utTeardowns = utTeardowns;
	}

	public UtTeardown addUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().add(utTeardown);
		utTeardown.setUtTest(this);

		return utTeardown;
	}

	public UtTeardown removeUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().remove(utTeardown);
		utTeardown.setUtTest(null);

		return utTeardown;
	}

	public List<UtTestArgument> getUtTestArguments() {
		return this.utTestArguments;
	}

	public void setUtTestArguments(List<UtTestArgument> utTestArguments) {
		this.utTestArguments = utTestArguments;
	}

	public UtTestArgument addUtTestArgument(UtTestArgument utTestArgument) {
		getUtTestArguments().add(utTestArgument);
		utTestArgument.setUtTest(this);

		return utTestArgument;
	}

	public UtTestArgument removeUtTestArgument(UtTestArgument utTestArgument) {
		getUtTestArguments().remove(utTestArgument);
		utTestArgument.setUtTest(null);

		return utTestArgument;
	}

	public List<UtTestImpl> getUtTestImpls() {
		return this.utTestImpls;
	}

	public void setUtTestImpls(List<UtTestImpl> utTestImpls) {
		this.utTestImpls = utTestImpls;
	}

	public UtTestImpl addUtTestImpl(UtTestImpl utTestImpl) {
		getUtTestImpls().add(utTestImpl);
		utTestImpl.setUtTest(this);

		return utTestImpl;
	}

	public UtTestImpl removeUtTestImpl(UtTestImpl utTestImpl) {
		getUtTestImpls().remove(utTestImpl);
		utTestImpl.setUtTest(null);

		return utTestImpl;
	}

	public List<UtTestResult> getUtTestResults() {
		return this.utTestResults;
	}

	public void setUtTestResults(List<UtTestResult> utTestResults) {
		this.utTestResults = utTestResults;
	}

	public UtTestResult addUtTestResult(UtTestResult utTestResult) {
		getUtTestResults().add(utTestResult);
		utTestResult.setUtTest(this);

		return utTestResult;
	}

	public UtTestResult removeUtTestResult(UtTestResult utTestResult) {
		getUtTestResults().remove(utTestResult);
		utTestResult.setUtTest(null);

		return utTestResult;
	}

}