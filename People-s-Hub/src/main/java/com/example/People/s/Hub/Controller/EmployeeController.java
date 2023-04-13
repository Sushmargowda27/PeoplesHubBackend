package com.example.People.s.Hub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.People.s.Hub.Model.Employee;
import com.example.People.s.Hub.Service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empser;
	
	@PostMapping("/addemp")
	public Employee save(@RequestBody Employee emp)
	{
		return empser.save(emp);
	}
	
	@GetMapping("/allemp")
	public List<Employee> allemp()
	{
		return empser.allemp();
	}
	
	
	@DeleteMapping("/deleteemp")
	public Object delete(@RequestHeader Integer empid)
	{
		return empser.delete(empid);
	}
	
}
