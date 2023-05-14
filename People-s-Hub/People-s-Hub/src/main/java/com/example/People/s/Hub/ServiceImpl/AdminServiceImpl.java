package com.example.People.s.Hub.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.People.s.Hub.EmailSenderService.OTPGenerator;
import com.example.People.s.Hub.Exception.CustomException;
import com.example.People.s.Hub.Model.Admin;
import com.example.People.s.Hub.Repository.AdminRepository;
import com.example.People.s.Hub.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	
	@Autowired
	private AdminRepository adminrepo;
	
	@Autowired
	private OTPGenerator otpgen;
	
	@Override
	public String login(String email, String password) {
		// TODO Auto-generated method stub
		Admin adm=adminrepo.findemail(email);
		try
		{
			if(adm!=null)
			{
				if(adm.getPassword().equals(password))
				{
					throw new CustomException("login successfully");
				}
				else
				{
					throw new CustomException("password is incorrect");
				}
			}
			else
			{
				throw new CustomException("admin email is wrong");
			}
		}
		catch(CustomException e)
		{
			return e.getMessage();
		}
	}


	@Override
	public Object forgot(String email) {
		// TODO Auto-generated method stub
		Admin admin=adminrepo.findemail(email);
		if(admin!=null)
			{
				int otp=otpgen.otp(admin.getEmail());
				return otp;
			}
			else
			{
				return "0";
			}
	}
	
}
