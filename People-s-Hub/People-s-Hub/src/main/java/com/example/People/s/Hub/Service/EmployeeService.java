package com.example.People.s.Hub.Service;

import java.util.List;

import com.example.People.s.Hub.Model.Employee;

public interface EmployeeService {
	public Employee save(Employee emp);
	public List<Employee> allemp();
	public Object delete(int id);
	public Object update(int id,Employee emp);
	public Object login(String email, String password);
	public Object getbyid(int id);
}
