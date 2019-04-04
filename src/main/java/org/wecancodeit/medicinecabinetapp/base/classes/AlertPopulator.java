package org.wecancodeit.medicinecabinetapp.base.classes;

import java.time.LocalDateTime;

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
		
		LocalDateTime timeToSendAlert = LocalDateTime.now();
		
		Alert alertPill = new Alert("Pain Pill", false, 1, "pill", timeToSendAlert);
		alertPill = alertRepo.save(alertPill);
		
		Alert alertLiquid = new Alert("Liquid Medicine", false, 50, "mL", timeToSendAlert);
		alertLiquid = alertRepo.save(alertLiquid);
		
		Alert alertPatch = new Alert("Patch", false, 1, "patch", timeToSendAlert);
		alertPatch = alertRepo.save(alertPatch);
	}
	
	

}
