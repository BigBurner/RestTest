package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LIB_STARTUPS database table.
 * 
 */
@Entity
@Table(name="UT_LIB_STARTUPS")
@NamedQuery(name="UtLibStartup.findAll", query="SELECT u FROM UtLibStartup u")
public class UtLibStartup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIB_STARTUP_ID")
	private String libStartupId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="LIB_STARTUP")
	private String libStartup;

	@Column(name="LIB_STARTUP_CLASS")
	private String libStartupClass;

	@Column(name="LIB_STARTUP_NAME")
	private String libStartupName;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtStartup
	@OneToMany(mappedBy="utLibStartup")
	private List<UtStartup> utStartups;

	public UtLibStartup() {
	}

	public String getLibStartupId() {
		return this.libStartupId;
	}

	public void setLibStartupId(String libStartupId) {
		this.libStartupId = libStartupId;
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

	public String getLibStartup() {
		return this.libStartup;
	}

	public void setLibStartup(String libStartup) {
		this.libStartup = libStartup;
	}

	public String getLibStartupClass() {
		return this.libStartupClass;
	}

	public void setLibStartupClass(String libStartupClass) {
		this.libStartupClass = libStartupClass;
	}

	public String getLibStartupName() {
		return this.libStartupName;
	}

	public void setLibStartupName(String libStartupName) {
		this.libStartupName = libStartupName;
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
		utStartup.setUtLibStartup(this);

		return utStartup;
	}

	public UtStartup removeUtStartup(UtStartup utStartup) {
		getUtStartups().remove(utStartup);
		utStartup.setUtLibStartup(null);

		return utStartup;
	}

}