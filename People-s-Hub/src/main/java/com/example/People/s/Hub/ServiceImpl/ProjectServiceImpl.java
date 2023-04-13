package com.example.People.s.Hub.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.People.s.Hub.Model.Project;
import com.example.People.s.Hub.Repository.ProjectRepository;
import com.example.People.s.Hub.Service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository projectrepo;
	
	@Override
	public Project save(Project project) {
		// TODO Auto-generated method stub
		return projectrepo.save(project);
	}

}
