package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
