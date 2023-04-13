package com.example.People.s.Hub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.People.s.Hub.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select * from employee where empid=?1",nativeQuery=true)
	public Employee findByid(Integer id);

}
