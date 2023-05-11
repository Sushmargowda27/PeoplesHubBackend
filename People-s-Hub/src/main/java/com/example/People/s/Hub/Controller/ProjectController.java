package com.example.People.s.Hub.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/saveproject")
	public Project save(@RequestBody Project project)
	{
		return projectservice.save(project);
	}
	
	@PutMapping("/updateproject/{id}")
	public Object save(@PathVariable int id,@RequestBody Project pro)
	{	System.out.println(id+" "+pro);
		return projectservice.update(id,pro);
	}
	
	
	
	@GetMapping("/allproject")
	public List<Project> allproject()
	{
		return projectservice.allproject();
	}
	
	
	
	@GetMapping("/getbyid/{id}")
	public Project getbyid(@PathVariable int id)
	{
		return projectservice.getbyid(id);
	}
	
}
