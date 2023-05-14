package com.example.People.s.Hub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	@DeleteMapping("/deleteemp/{id}")
	public Object delete(@PathVariable int id)
	{
		return empser.delete(id);
	}
	
	@PutMapping("/updateemp/{id}")
	public Object update(@PathVariable int id,@RequestBody Employee emp)
	{
		return empser.update(id,emp);
	}
	
	@GetMapping("/emplogin")
	public Object login(@RequestHeader String email, @RequestHeader String password)
	{
		return empser.login(email,password);
	}
	@GetMapping("/getemp/{empid}")
	public Object getemp(@PathVariable int empid)
	{
		return empser.getbyid(empid);
	}
	
}