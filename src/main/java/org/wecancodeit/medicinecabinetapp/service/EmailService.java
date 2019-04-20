package org.wecancodeit.medicinecabinetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.wecancodeit.medicinecabinetapp.base.classes.Mail;
import org.wecancodeit.medicinecabinetapp.base.classes.User;

@Service
public class EmailService {

	
	private static JavaMailSender javaMailSender;
	
	@SuppressWarnings("static-access")
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender=javaMailSender;
	}
	
	@Async
	public static void sendEmailAlert(User user) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getUserEmail());
        mail.setFrom("yourmedcabapp@gmail.com");
        mail.setSubject("Time to take your meds");
        mail.setText("Hi this is a med notification");
        
        javaMailSender.send(mail);
        
    }
	

      
}
