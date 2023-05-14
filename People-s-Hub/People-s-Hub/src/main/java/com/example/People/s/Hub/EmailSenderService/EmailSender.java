package com.example.People.s.Hub.EmailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class EmailSender {
	@Autowired
	private JavaMailSender javamailsender;
	
	SimpleMailMessage message=new SimpleMailMessage();
	
	public boolean sendemail(String toemail, String subject, String body) 
	{
		message.setFrom("sushmargowda27@gmail.com");
		message.setTo(toemail);
		message.setText(body);
		message.setText(subject);
		
		javamailsender.send(message);
		
		System.out.println("Mail Sent Successfully");
		return true;
	}
     
	public boolean sendemail1(String toemail,String subject,String body)
	{
		message.setFrom("sushmargowda27@gmail.com");
		message.setTo(toemail);
		message.setSubject(subject);
		message.setText(body);
		
       javamailsender.send(message);
		
		System.out.println("Mail Sent Successfully to Employee with OTP");
		return true;
	}
	
}
