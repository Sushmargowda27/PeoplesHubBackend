package com.example.People.s.Hub.EmailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class EmailSender {
	@Autowired
	private JavaMailSender javamailsender;
	
	public boolean sendemail(String toemail, String subject, String body) 
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("sushmargowda27@gmail.com");
		message.setTo(toemail);
		message.setText(body);
		message.setText(subject);
		
		javamailsender.send(message);
		
		System.out.println("Mail Sent Successfully");
		return true;
	}

}
