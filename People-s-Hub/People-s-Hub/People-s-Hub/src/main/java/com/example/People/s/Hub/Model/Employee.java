package com.example.People.s.Hub.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
	
	private String Skills;
	private int PreviousProject;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="ei_fid", referencedColumnName="id")
//	private Image image;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, String empEmail, String password, long empPhone, String linkedIn_URL,
			String street, String city, String state, int zipCode, String designation, int salary,
			String currentLocation, int assignedProject, String skills, int previousProject) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empEmail = empEmail;
		this.password = password;
		this.empPhone = empPhone;
		this.LinkedIn_URL = linkedIn_URL;
		this.Street = street;
		this.City = city;
		this.State = state;
		this.zipCode = zipCode;
		this.designation = designation;
		this.Salary = salary;
		this.CurrentLocation = currentLocation;
		this.AssignedProject = assignedProject;
		this.Skills = skills;
		this.PreviousProject = previousProject;
	}
	
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
