package com.example.People.s.Hub.Service;

import java.util.List;

import com.example.People.s.Hub.Model.Employee;

public interface EmployeeService {
	public Employee save(Employee emp);
	public List<Employee> allemp();
	public Object delete(Integer empid);
}
