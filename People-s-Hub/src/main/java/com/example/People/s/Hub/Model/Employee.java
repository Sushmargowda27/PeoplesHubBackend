package com.example.People.s.Hub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	private String empEmail;
	private String password;
	private long empPhone;
	private String LinkedIn_URL;
	private String Street;
	private String City;
	private String State;
	private int zipCode;
	private String designation;
	private int Salary;
	private String CurrentLocation;
	private int AssignedProject;
	private String Image;
	private String Skills;
	private int PreviousProject;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String getLinkedIn_URL() {
		return LinkedIn_URL;
	}
	public void setLinkedIn_URL(String linkedIn_URL) {
		LinkedIn_URL = linkedIn_URL;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getCurrentLocation() {
		return CurrentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		CurrentLocation = currentLocation;
	}
	public int getAssignedProject() {
		return AssignedProject;
	}
	public void setAssignedProject(int assignedProject) {
		AssignedProject = assignedProject;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public int getPreviousProject() {
		return PreviousProject;
	}
	public void setPreviousProject(int previousProject) {
		PreviousProject = previousProject;
	}
	
}
