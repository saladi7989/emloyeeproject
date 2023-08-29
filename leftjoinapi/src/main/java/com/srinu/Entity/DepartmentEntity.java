package com.srinu.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serialnumber")
	@SequenceGenerator(name = "serialnumber", sequenceName = "serialnumber", allocationSize = 1)
	@Column(name="DID")
	private Integer did;
	@Column(name="DNAME")
	private String dname;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}
