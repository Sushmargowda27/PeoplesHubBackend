package com.example.People.s.Hub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.People.s.Hub.Service.AdminService;
@CrossOrigin
@RestController
public class AdminController 
{
	@Autowired
	private AdminService ser;
	
	@GetMapping("/adminlogin")
	public String login(@RequestHeader String email, @RequestHeader String password)
	{
		return ser.login(email,password);
	}
	
	@PutMapping("/adminforgot")
	public Object forgot(@RequestHeader String email)
	{
		return ser.forgot(email);
	}
	
}
