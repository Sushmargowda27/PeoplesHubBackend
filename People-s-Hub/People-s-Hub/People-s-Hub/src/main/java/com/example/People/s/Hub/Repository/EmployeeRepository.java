package com.example.People.s.Hub.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Admin;
import com.example.People.s.Hub.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select * from employee where empid=?1",nativeQuery=true)
	public Employee findByid(Integer id);
	
	@Query(value="select * from employee where emp_email=?1", nativeQuery=true)
	public Employee findemail(String email);
	
	@Query(value="select * from employee where designation=?1",nativeQuery=true)
	public List<Employee> getallmanager(String name);
	
}

