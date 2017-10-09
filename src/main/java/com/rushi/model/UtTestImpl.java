package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_TEST_IMPL database table.
 * 
 */
@Entity
@Table(name="UT_TEST_IMPL")
@NamedQuery(name="UtTestImpl.findAll", query="SELECT u FROM UtTestImpl u")
public class UtTestImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UTI_ID")
	private String utiId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="DYNAMIC_VALUE_QUERY")
	private String dynamicValueQuery;

	@Column(name="EXPECTED_RETURN")
	private String expectedReturn;

	@Column(name="EXPECTED_RETURN_ERROR")
	private String expectedReturnError;

	private String name;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTestCoverageStat
	@OneToMany(mappedBy="utTestImpl")
	private List<UtTestCoverageStat> utTestCoverageStats;

	//bi-directional many-to-one association to UtLibDynQuery
	@ManyToOne
	@JoinColumn(name="LIB_DYN_QUERY_ID")
	private UtLibDynQuery utLibDynQuery;

	//bi-directional many-to-one association to UtTest
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	//bi-directional many-to-one association to UtTestImplArgument
	@OneToMany(mappedBy="utTestImpl")
	private List<UtTestImplArgument> utTestImplArguments;

	//bi-directional many-to-one association to UtTestImplArgResult
	@OneToMany(mappedBy="utTestImpl")
	private List<UtTestImplArgResult> utTestImplArgResults;

	//bi-directional many-to-one association to UtTestImplResult
	@OneToMany(mappedBy="utTestImpl")
	private List<UtTestImplResult> utTestImplResults;

	//bi-directional many-to-one association to UtTestImplValResult
	@OneToMany(mappedBy="utTestImpl")
	private List<UtTestImplValResult> utTestImplValResults;

	//bi-directional many-to-one association to UtValidation
	@OneToMany(mappedBy="utTestImpl")
	private List<UtValidation> utValidations;

	public UtTestImpl() {
	}

	public String getUtiId() {
		return this.utiId;
	}

	public void setUtiId(String utiId) {
		this.utiId = utiId;
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

	public String getDynamicValueQuery() {
		return this.dynamicValueQuery;
	}

	public void setDynamicValueQuery(String dynamicValueQuery) {
		this.dynamicValueQuery = dynamicValueQuery;
	}

	public String getExpectedReturn() {
		return this.expectedReturn;
	}

	public void setExpectedReturn(String expectedReturn) {
		this.expectedReturn = expectedReturn;
	}

	public String getExpectedReturnError() {
		return this.expectedReturnError;
	}

	public void setExpectedReturnError(String expectedReturnError) {
		this.expectedReturnError = expectedReturnError;
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

	public List<UtTestCoverageStat> getUtTestCoverageStats() {
		return this.utTestCoverageStats;
	}

	public void setUtTestCoverageStats(List<UtTestCoverageStat> utTestCoverageStats) {
		this.utTestCoverageStats = utTestCoverageStats;
	}

	public UtTestCoverageStat addUtTestCoverageStat(UtTestCoverageStat utTestCoverageStat) {
		getUtTestCoverageStats().add(utTestCoverageStat);
		utTestCoverageStat.setUtTestImpl(this);

		return utTestCoverageStat;
	}

	public UtTestCoverageStat removeUtTestCoverageStat(UtTestCoverageStat utTestCoverageStat) {
		getUtTestCoverageStats().remove(utTestCoverageStat);
		utTestCoverageStat.setUtTestImpl(null);

		return utTestCoverageStat;
	}

	public UtLibDynQuery getUtLibDynQuery() {
		return this.utLibDynQuery;
	}

	public void setUtLibDynQuery(UtLibDynQuery utLibDynQuery) {
		this.utLibDynQuery = utLibDynQuery;
	}

	public UtTest getUtTest() {
		return this.utTest;
	}

	public void setUtTest(UtTest utTest) {
		this.utTest = utTest;
	}

	public List<UtTestImplArgument> getUtTestImplArguments() {
		return this.utTestImplArguments;
	}

	public void setUtTestImplArguments(List<UtTestImplArgument> utTestImplArguments) {
		this.utTestImplArguments = utTestImplArguments;
	}

	public UtTestImplArgument addUtTestImplArgument(UtTestImplArgument utTestImplArgument) {
		getUtTestImplArguments().add(utTestImplArgument);
		utTestImplArgument.setUtTestImpl(this);

		return utTestImplArgument;
	}

	public UtTestImplArgument removeUtTestImplArgument(UtTestImplArgument utTestImplArgument) {
		getUtTestImplArguments().remove(utTestImplArgument);
		utTestImplArgument.setUtTestImpl(null);

		return utTestImplArgument;
	}

	public List<UtTestImplArgResult> getUtTestImplArgResults() {
		return this.utTestImplArgResults;
	}

	public void setUtTestImplArgResults(List<UtTestImplArgResult> utTestImplArgResults) {
		this.utTestImplArgResults = utTestImplArgResults;
	}

	public UtTestImplArgResult addUtTestImplArgResult(UtTestImplArgResult utTestImplArgResult) {
		getUtTestImplArgResults().add(utTestImplArgResult);
		utTestImplArgResult.setUtTestImpl(this);

		return utTestImplArgResult;
	}

	public UtTestImplArgResult removeUtTestImplArgResult(UtTestImplArgResult utTestImplArgResult) {
		getUtTestImplArgResults().remove(utTestImplArgResult);
		utTestImplArgResult.setUtTestImpl(null);

		return utTestImplArgResult;
	}

	public List<UtTestImplResult> getUtTestImplResults() {
		return this.utTestImplResults;
	}

	public void setUtTestImplResults(List<UtTestImplResult> utTestImplResults) {
		this.utTestImplResults = utTestImplResults;
	}

	public UtTestImplResult addUtTestImplResult(UtTestImplResult utTestImplResult) {
		getUtTestImplResults().add(utTestImplResult);
		utTestImplResult.setUtTestImpl(this);

		return utTestImplResult;
	}

	public UtTestImplResult removeUtTestImplResult(UtTestImplResult utTestImplResult) {
		getUtTestImplResults().remove(utTestImplResult);
		utTestImplResult.setUtTestImpl(null);

		return utTestImplResult;
	}

	public List<UtTestImplValResult> getUtTestImplValResults() {
		return this.utTestImplValResults;
	}

	public void setUtTestImplValResults(List<UtTestImplValResult> utTestImplValResults) {
		this.utTestImplValResults = utTestImplValResults;
	}

	public UtTestImplValResult addUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().add(utTestImplValResult);
		utTestImplValResult.setUtTestImpl(this);

		return utTestImplValResult;
	}

	public UtTestImplValResult removeUtTestImplValResult(UtTestImplValResult utTestImplValResult) {
		getUtTestImplValResults().remove(utTestImplValResult);
		utTestImplValResult.setUtTestImpl(null);

		return utTestImplValResult;
	}

	public List<UtValidation> getUtValidations() {
		return this.utValidations;
	}

	public void setUtValidations(List<UtValidation> utValidations) {
		this.utValidations = utValidations;
	}

	public UtValidation addUtValidation(UtValidation utValidation) {
		getUtValidations().add(utValidation);
		utValidation.setUtTestImpl(this);

		return utValidation;
	}

	public UtValidation removeUtValidation(UtValidation utValidation) {
		getUtValidations().remove(utValidation);
		utValidation.setUtTestImpl(null);

		return utValidation;
	}

}