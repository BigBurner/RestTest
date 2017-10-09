package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the UT_LIB_TEARDOWNS database table.
 * 
 */
@Entity
@Table(name="UT_LIB_TEARDOWNS")
@NamedQuery(name="UtLibTeardown.findAll", query="SELECT u FROM UtLibTeardown u")
public class UtLibTeardown implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LIB_TEARDOWN_ID")
	private String libTeardownId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_ON")
	private Timestamp createdOn;

	@Lob
	@Column(name="LIB_TEARDOWN")
	private String libTeardown;

	@Column(name="LIB_TEARDOWN_CLASS")
	private String libTeardownClass;

	@Column(name="LIB_TEARDOWN_NAME")
	private String libTeardownName;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Column(name="UPDATED_ON")
	private Timestamp updatedOn;

	//bi-directional many-to-one association to UtTeardown
	@OneToMany(mappedBy="utLibTeardown")
	private List<UtTeardown> utTeardowns;

	public UtLibTeardown() {
	}

	public String getLibTeardownId() {
		return this.libTeardownId;
	}

	public void setLibTeardownId(String libTeardownId) {
		this.libTeardownId = libTeardownId;
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

	public String getLibTeardown() {
		return this.libTeardown;
	}

	public void setLibTeardown(String libTeardown) {
		this.libTeardown = libTeardown;
	}

	public String getLibTeardownClass() {
		return this.libTeardownClass;
	}

	public void setLibTeardownClass(String libTeardownClass) {
		this.libTeardownClass = libTeardownClass;
	}

	public String getLibTeardownName() {
		return this.libTeardownName;
	}

	public void setLibTeardownName(String libTeardownName) {
		this.libTeardownName = libTeardownName;
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

	public List<UtTeardown> getUtTeardowns() {
		return this.utTeardowns;
	}

	public void setUtTeardowns(List<UtTeardown> utTeardowns) {
		this.utTeardowns = utTeardowns;
	}

	public UtTeardown addUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().add(utTeardown);
		utTeardown.setUtLibTeardown(this);

		return utTeardown;
	}

	public UtTeardown removeUtTeardown(UtTeardown utTeardown) {
		getUtTeardowns().remove(utTeardown);
		utTeardown.setUtLibTeardown(null);

		return utTeardown;
	}

}