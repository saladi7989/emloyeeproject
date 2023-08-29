package com.srinu.pojo;

import java.math.BigDecimal;

import com.srinu.Entity.EmployeeEntity;



public class Employee {

	private Integer eid;
	private String ename;
	private String email;
	private String address;
	private String mobilenumber;
	private BigDecimal salary;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal sal) {
		this.salary = sal;
	}

	
	}


