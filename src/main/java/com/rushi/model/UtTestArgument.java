package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_TEST_ARGUMENTS database table.
 * 
 */
@Entity
@Table(name="UT_TEST_ARGUMENTS")
@NamedQuery(name="UtTestArgument.findAll", query="SELECT u FROM UtTestArgument u")
public class UtTestArgument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ARG_ID")
	private String argId;

	@Column(name="ARGUMENT_NAME")
	private String argumentName;

	@Column(name="CHAR_LENGTH")
	private BigDecimal charLength;

	@Column(name="CHAR_USED")
	private String charUsed;

	@Column(name="CHARACTER_SET_NAME")
	private String characterSetName;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Column(name="DATA_LENGTH")
	private BigDecimal dataLength;

	@Column(name="DATA_LEVEL")
	private BigDecimal dataLevel;

	@Column(name="DATA_PRECISION")
	private BigDecimal dataPrecision;

	@Column(name="DATA_SCALE")
	private BigDecimal dataScale;

	@Column(name="DATA_TYPE")
	private String dataType;

	@Column(name="DEFAULT_LENGTH")
	private BigDecimal defaultLength;

	@Column(name="IN_OUT")
	private String inOut;

	@Column(name="OBJECT_ID")
	private BigDecimal objectId;

	@Column(name="OBJECT_NAME")
	private String objectName;

	private String overload;

	private String owner;

	@Column(name="PACKAGE_NAME")
	private String packageName;

	@Column(name="PLS_TYPE")
	private String plsType;

	private BigDecimal position;

	private BigDecimal radix;

	private BigDecimal sequence;

	@Column(name="TYPE_LINK")
	private String typeLink;

	@Column(name="TYPE_NAME")
	private String typeName;

	@Column(name="TYPE_OWNER")
	private String typeOwner;

	@Column(name="TYPE_SUBNAME")
	private String typeSubname;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTest
	@ManyToOne
	@JoinColumn(name="UT_ID")
	private UtTest utTest;

	//bi-directional many-to-one association to UtTestImplArgument
	@OneToMany(mappedBy="utTestArgument")
	private List<UtTestImplArgument> utTestImplArguments;

	//bi-directional many-to-one association to UtTestImplArgResult
	@OneToMany(mappedBy="utTestArgument")
	private List<UtTestImplArgResult> utTestImplArgResults;

	public UtTestArgument() {
	}

	public String getArgId() {
		return this.argId;
	}

	public void setArgId(String argId) {
		this.argId = argId;
	}

	public String getArgumentName() {
		return this.argumentName;
	}

	public void setArgumentName(String argumentName) {
		this.argumentName = argumentName;
	}

	public BigDecimal getCharLength() {
		return this.charLength;
	}

	public void setCharLength(BigDecimal charLength) {
		this.charLength = charLength;
	}

	public String getCharUsed() {
		return this.charUsed;
	}

	public void setCharUsed(String charUsed) {
		this.charUsed = charUsed;
	}

	public String getCharacterSetName() {
		return this.characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
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

	public BigDecimal getDataLength() {
		return this.dataLength;
	}

	public void setDataLength(BigDecimal dataLength) {
		this.dataLength = dataLength;
	}

	public BigDecimal getDataLevel() {
		return this.dataLevel;
	}

	public void setDataLevel(BigDecimal dataLevel) {
		this.dataLevel = dataLevel;
	}

	public BigDecimal getDataPrecision() {
		return this.dataPrecision;
	}

	public void setDataPrecision(BigDecimal dataPrecision) {
		this.dataPrecision = dataPrecision;
	}

	public BigDecimal getDataScale() {
		return this.dataScale;
	}

	public void setDataScale(BigDecimal dataScale) {
		this.dataScale = dataScale;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public BigDecimal getDefaultLength() {
		return this.defaultLength;
	}

	public void setDefaultLength(BigDecimal defaultLength) {
		this.defaultLength = defaultLength;
	}

	public String getInOut() {
		return this.inOut;
	}

	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public BigDecimal getObjectId() {
		return this.objectId;
	}

	public void setObjectId(BigDecimal objectId) {
		this.objectId = objectId;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getOverload() {
		return this.overload;
	}

	public void setOverload(String overload) {
		this.overload = overload;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPlsType() {
		return this.plsType;
	}

	public void setPlsType(String plsType) {
		this.plsType = plsType;
	}

	public BigDecimal getPosition() {
		return this.position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	public BigDecimal getRadix() {
		return this.radix;
	}

	public void setRadix(BigDecimal radix) {
		this.radix = radix;
	}

	public BigDecimal getSequence() {
		return this.sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

	public String getTypeLink() {
		return this.typeLink;
	}

	public void setTypeLink(String typeLink) {
		this.typeLink = typeLink;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeOwner() {
		return this.typeOwner;
	}

	public void setTypeOwner(String typeOwner) {
		this.typeOwner = typeOwner;
	}

	public String getTypeSubname() {
		return this.typeSubname;
	}

	public void setTypeSubname(String typeSubname) {
		this.typeSubname = typeSubname;
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
		utTestImplArgument.setUtTestArgument(this);

		return utTestImplArgument;
	}

	public UtTestImplArgument removeUtTestImplArgument(UtTestImplArgument utTestImplArgument) {
		getUtTestImplArguments().remove(utTestImplArgument);
		utTestImplArgument.setUtTestArgument(null);

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
		utTestImplArgResult.setUtTestArgument(this);

		return utTestImplArgResult;
	}

	public UtTestImplArgResult removeUtTestImplArgResult(UtTestImplArgResult utTestImplArgResult) {
		getUtTestImplArgResults().remove(utTestImplArgResult);
		utTestImplArgResult.setUtTestArgument(null);

		return utTestImplArgResult;
	}

}