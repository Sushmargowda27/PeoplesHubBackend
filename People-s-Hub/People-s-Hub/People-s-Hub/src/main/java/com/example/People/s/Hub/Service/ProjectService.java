package com.example.People.s.Hub.Service;

import java.util.List;

import com.example.People.s.Hub.Model.Project;

public interface ProjectService {
	public Project save(Project project);
	public List<Project> allproject();
	public Project getbyid(int id);
	public Object update(int id,Project pro);
}
