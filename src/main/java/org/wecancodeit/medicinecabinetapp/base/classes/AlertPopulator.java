package org.wecancodeit.medicinecabinetapp.base.classes;

import java.time.LocalDateTime;
import java.util.Calendar;

import javax.annotation.Resource;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;

@Component
public class AlertPopulator implements CommandLineRunner {
	
	@Resource
	private AlertRepository alertRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Calendar now= Calendar.getInstance();
		int dayToSendAlert=now.get(Calendar.DAY_OF_WEEK);
		int timeToSendAlertHour=now.get(Calendar.HOUR_OF_DAY);
		int timeToSendAlertMinute=now.get(Calendar.MINUTE);
		
		
		Alert alertPill = new Alert("Ibuprofen", false, 2, "pill", 6,13,35);
		alertPill = alertRepo.save(alertPill);
		
		Alert alertPill2 = new Alert("Aspirin", false, 1, "pill",6,13,36);
		alertPill2 = alertRepo.save(alertPill2);

		Alert alertLiquid = new Alert("Nyquil", false, 30, "mL",6,13,37);
		alertLiquid = alertRepo.save(alertLiquid);
	}
	
	

}
