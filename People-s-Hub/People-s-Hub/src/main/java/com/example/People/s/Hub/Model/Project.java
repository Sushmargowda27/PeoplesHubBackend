package com.example.People.s.Hub.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Configuration
@Entity
public class Project {
	@Id
	private int id;
	private String projectName;
	private String projectDescription;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pa_fid", referencedColumnName="id")
	private List<AssignedEmployees> assignemp = new ArrayList<>();
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String projectName, String projectDescription) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public List<AssignedEmployees> getAssignemp() {
		return assignemp;
	}
	public void setAssignemp(List<AssignedEmployees> assignemp) {
		this.assignemp = assignemp;
	}
}
