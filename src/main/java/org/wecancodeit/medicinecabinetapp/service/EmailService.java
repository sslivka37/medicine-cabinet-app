package org.wecancodeit.medicinecabinetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.wecancodeit.medicinecabinetapp.base.classes.Mail;
import org.wecancodeit.medicinecabinetapp.base.classes.User;

@Service
public class EmailService {

	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender=javaMailSender;
	}
	
	public void sendEmailAlert(User user) throws MailException {
		//send email
		SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(user.getUserEmail());
        mail.setFrom("yourmedcabapp@gmail.com");
        mail.setSubject("Time to take your meds");
        mail.setText("Hi this is med notification");
        
        javaMailSender.send(mail);
        
    }
}
