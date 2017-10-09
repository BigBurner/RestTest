package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the UT_TEST_IMPL_ARGUMENTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_IMPL_ARGUMENTS")
@NamedQuery(name="UtTestImplArgument.findAll", query="SELECT u FROM UtTestImplArgument u")
public class UtTestImplArgument implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtTestImplArgumentPK id;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="INPUT_VALUE")
	private String inputValue;

	@Lob
	@Column(name="OUTPUT_VALUE")
	private String outputValue;

	@Column(name="TEST_OUTVAL")
	private BigDecimal testOutval;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTestArgument
	@MapsId("argId")
	@ManyToOne
	@JoinColumn(name="ARG_ID")
	private UtTestArgument utTestArgument;

	//bi-directional many-to-one association to UtTestImpl
	@MapsId("utiId")
	@ManyToOne
	@JoinColumn(name="UTI_ID")
	private UtTestImpl utTestImpl;

	public UtTestImplArgument() {
	}

	public UtTestImplArgumentPK getId() {
		return this.id;
	}

	public void setId(UtTestImplArgumentPK id) {
		this.id = id;
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

	public String getInputValue() {
		return this.inputValue;
	}

	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}

	public String getOutputValue() {
		return this.outputValue;
	}

	public void setOutputValue(String outputValue) {
		this.outputValue = outputValue;
	}

	public BigDecimal getTestOutval() {
		return this.testOutval;
	}

	public void setTestOutval(BigDecimal testOutval) {
		this.testOutval = testOutval;
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

	public UtTestArgument getUtTestArgument() {
		return this.utTestArgument;
	}

	public void setUtTestArgument(UtTestArgument utTestArgument) {
		this.utTestArgument = utTestArgument;
	}

	public UtTestImpl getUtTestImpl() {
		return this.utTestImpl;
	}

	public void setUtTestImpl(UtTestImpl utTestImpl) {
		this.utTestImpl = utTestImpl;
	}

}