package com.example.People.s.Hub.EmailSenderService;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OTPGenerator {
	
	@Autowired
	private EmailSender  emailser;
	
	Random random=new Random();
	
	public int otp(String email)
	{
		int otp=random.nextInt(100000,999999);
		boolean b=emailser.sendemail(email, "this is your otp:" + otp, "Don't Share with Anyone");
		
		if(b==true)
		{
			return otp;
		}
		return 0;
	}
	
	public int otp1(String email)
	{
		int otp=random.nextInt(1000, 9999);
        boolean b=emailser.sendemail(email, "this is your otp:" + otp, "Don't Share with Anyone");
		
		if(b==true)
		{
			return otp;
		}
		return 0;
	}
}
