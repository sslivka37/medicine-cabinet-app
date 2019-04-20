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
		
		
		Alert alertPill = new Alert("Pain Pill", false, 1, "pill", 6,13,35);
		alertPill = alertRepo.save(alertPill);
		
		Alert alertLiquid = new Alert("Liquid Medicine", false, 50, "mL",6,13,36);
		alertLiquid = alertRepo.save(alertLiquid);

		Alert alertPatch = new Alert("Patch", false, 1, "patch",6,13,37);
		alertPatch = alertRepo.save(alertPatch);
	}
	
	

}
