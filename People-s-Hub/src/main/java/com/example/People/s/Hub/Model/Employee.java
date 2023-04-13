package com.example.People.s.Hub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	private String empEmail;
	private long empPhone;
	private String empDesignation;
	private int empSalary;
	private String empCurrentLocation;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpCurrentLocation() {
		return empCurrentLocation;
	}
	public void setEmpCurrentLocation(String empCurrentLocation) {
		this.empCurrentLocation = empCurrentLocation;
	}
}
