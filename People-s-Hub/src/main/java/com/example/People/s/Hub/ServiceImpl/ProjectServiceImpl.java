package com.example.People.s.Hub.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.People.s.Hub.Model.AssignedEmployees;
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
//		Project pro=new Project();
//		AssignedEmployees emp1=new AssignedEmployees();
//		AssignedEmployees emp2=new AssignedEmployees();
//		emp1.setProject(project);
//		emp2.setProject(project);
//		pro.getAssignemp().add(emp1);
//		pro.getAssignemp().add(emp2);
//		return projectrepo.save(pro);
	}

	@Override
	public List<Project> allproject() {
		// TODO Auto-generated method stub
		return projectrepo.findAll();
	}

	@Override
	public Project getbyid(int id) {
		// TODO Auto-generated method stub
		return projectrepo.findByid(id);
	}

	@Override
	public Object update(int id, Project pro) {
		// TODO Auto-generated method stub
		Project proj=projectrepo.findByid(id);
		if(proj!=null)
		{
			Project pr=new Project(id, pro.getProjectName(), pro.getProjectDescription());
			String name=pro.getAssignemp().get(0).getEmpName();
			String name1=pro.getAssignemp().get(1).getEmpName();
		   
			System.out.println(name+" "+name1);
			AssignedEmployees as=new AssignedEmployees(name);
			AssignedEmployees as1=new AssignedEmployees(name1);
			
			pr.getAssignemp().add(as);
			pr.getAssignemp().add(as1);
			
			return projectrepo.save(pr);
		}
		return null;
	}
}
