package com.example.People.s.Hub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.example.People.s.Hub.Service.AdminService;
import com.example.People.s.Hub.Service.JwtService;
@CrossOrigin
@RestController
public class AdminController 
{
	@Autowired
	private AdminService ser;
	
	@Autowired
	private JwtService jwtser;
	
	@GetMapping("/adminlogin")
	public ResponseEntity<String> login(@RequestHeader String email, @RequestHeader String password)
	{
		String login=ser.login(email,password);
		if(login=="login successfully")
		{
			String token=jwtser.generateToken(email);
			return ResponseEntity.status(HttpStatus.OK).body(token);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("login unsuccesfully");
		}
	}
	
	@PutMapping("/adminforgot")
	public Object forgot(@RequestHeader String email)
	{
		return ser.forgot(email);
	}
	
}
