package com.infokeys.webservices.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class EmployeeEntity implements Serializable{

	@Id
	@Column(name = "EMP_ID")
	private String empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_JOB")
	private String empJob;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

}
