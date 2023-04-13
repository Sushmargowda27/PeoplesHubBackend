package com.example.People.s.Hub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.People.s.Hub.Model.Admin;
import com.example.People.s.Hub.Service.AdminService;
@CrossOrigin
@RestController
public class AdminController 
{
	@Autowired
	private AdminService ser;
	
	@GetMapping("/adminlogin")
	public String login(@RequestBody Admin admin)
	{
		return ser.login(admin);
	}
	
	@GetMapping("/adminemail")
	public Object email(@RequestHeader String email)
	{
		return ser.email(email);
	}
	
	@PutMapping("/adminforgot")
	public Object forgot(@RequestHeader String email, @RequestHeader String password)
	{
		return ser.forgot(email,password);
	}
	 
	
}
