package com.example.People.s.Hub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.People.s.Hub.Model.Project;
import com.example.People.s.Hub.Service.ProjectService;
@CrossOrigin
@RestController
public class ProjectController 
{
	@Autowired
	private ProjectService projectservice;
	
	
	@PostMapping("/save")
	public Project save(@RequestBody Project project)
	{
		return projectservice.save(project);
	}
}
