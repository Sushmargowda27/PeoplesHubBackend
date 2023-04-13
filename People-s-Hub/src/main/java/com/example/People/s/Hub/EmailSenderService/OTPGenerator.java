package com.example.People.s.Hub.EmailSenderService;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OTPGenerator {
	
	@Autowired
	private EmailSender  emailser;
	
	public int otp(String email)
	{
		Random random=new Random();
		int otp=random.nextInt(100000,999999);
		boolean b=emailser.sendemail(email, "this is your otp:" + otp, "Don't Share with Anyone");
		
		if(b==true)
		{
			return otp;
		}
		return 0;
	}

}
