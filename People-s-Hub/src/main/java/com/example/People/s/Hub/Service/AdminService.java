package com.example.People.s.Hub.Service;

import com.example.People.s.Hub.Model.Admin;

public interface AdminService {
	public String login(Admin admin);
	public Object email(String email);
	public Object forgot(String email, String password);
}
