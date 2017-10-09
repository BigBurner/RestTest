package com.rushi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UT_METADATA database table.
 * 
 */
@Entity
@Table(name="UT_METADATA")
@NamedQuery(name="UtMetadata.findAll", query="SELECT u FROM UtMetadata u")
public class UtMetadata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;

	private String value;

	public UtMetadata() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}