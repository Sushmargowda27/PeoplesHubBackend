package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.People.s.Hub.Model.AssignedEmployees;

public interface AssignedEmployeeRepository extends JpaRepository<AssignedEmployees, Integer>{

}
