package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Employee;
import com.example.People.s.Hub.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	@Query(value="select * from project where id=?1",nativeQuery=true)
	public Project findByid(Integer id);
}
