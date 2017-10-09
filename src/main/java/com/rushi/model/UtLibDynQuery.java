package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LIB_DYN_QUERIES database table.
 * 
 */
@Entity
@Table(name="UT_LIB_DYN_QUERIES")
@NamedQuery(name="UtLibDynQuery.findAll", query="SELECT u FROM UtLibDynQuery u")
public class UtLibDynQuery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIB_DYN_QUERY_ID")
	private String libDynQueryId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="LIB_DYN_QUERY")
	private String libDynQuery;

	@Column(name="LIB_DYN_QUERY_CLASS")
	private String libDynQueryClass;

	@Column(name="LIB_DYN_QUERY_NAME")
	private String libDynQueryName;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTestImpl
	@OneToMany(mappedBy="utLibDynQuery")
	private List<UtTestImpl> utTestImpls;

	public UtLibDynQuery() {
	}

	public String getLibDynQueryId() {
		return this.libDynQueryId;
	}

	public void setLibDynQueryId(String libDynQueryId) {
		this.libDynQueryId = libDynQueryId;
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

	public String getLibDynQuery() {
		return this.libDynQuery;
	}

	public void setLibDynQuery(String libDynQuery) {
		this.libDynQuery = libDynQuery;
	}

	public String getLibDynQueryClass() {
		return this.libDynQueryClass;
	}

	public void setLibDynQueryClass(String libDynQueryClass) {
		this.libDynQueryClass = libDynQueryClass;
	}

	public String getLibDynQueryName() {
		return this.libDynQueryName;
	}

	public void setLibDynQueryName(String libDynQueryName) {
		this.libDynQueryName = libDynQueryName;
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

	public List<UtTestImpl> getUtTestImpls() {
		return this.utTestImpls;
	}

	public void setUtTestImpls(List<UtTestImpl> utTestImpls) {
		this.utTestImpls = utTestImpls;
	}

	public UtTestImpl addUtTestImpl(UtTestImpl utTestImpl) {
		getUtTestImpls().add(utTestImpl);
		utTestImpl.setUtLibDynQuery(this);

		return utTestImpl;
	}

	public UtTestImpl removeUtTestImpl(UtTestImpl utTestImpl) {
		getUtTestImpls().remove(utTestImpl);
		utTestImpl.setUtLibDynQuery(null);

		return utTestImpl;
	}

}