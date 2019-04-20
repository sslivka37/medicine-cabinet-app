package org.wecancodeit.medicinecabinetapp.base.classes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.wecancodeit.medicinecabinetapp.service.EmailService;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;

@Component
public class ScheduledTasks {

	@Resource
	private AlertRepository alertRepo;

	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

	@Scheduled(fixedRate = 60000)
	
	public String sendEmail() {
		System.out.println("Hi");

		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int day=(now.get(Calendar.DAY_OF_WEEK)-1);
		System.out.println(day);
		
		String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday","Saturday" };

			Iterable<Alert> allAlerts = alertRepo.findAll();
System.out.println("foo");
			for (Alert alert : allAlerts) {

				if ((alert.dayToSendAlert == day)
						&& (alert.timeToSendAlertHour == hour)
						&& (alert.timeToSendAlertMinute == minute)) {
					
					System.out.println(strDays[now.get(Calendar.DAY_OF_WEEK)-1]);
					System.out.println(hour);
					System.out.println(minute);

					try {
						Thread.sleep(5000);
					} catch (Exception e) {
					}

					User user = new User();
					user.setFirstName("Sally");
					user.setLastName("Sue");
					user.setUserEmail("anicgarr@gmail.com");

					try {
						EmailService.sendEmailAlert(user);

					} catch (MailException e) {

						logger.info("Error Sending Email:" + e.getMessage());
					}
				}

			}return "Email sent";
		}					

	}

