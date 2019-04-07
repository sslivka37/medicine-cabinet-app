package org.wecancodeit.medicinecabinetapp.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.exceptions.AlertNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;

@Controller
public class AlertController {
	
	@Resource
	private AlertRepository alertRepo;
	
	@RequestMapping("/alert")
	public String findOneAlert(@RequestParam(value="id")long id, Model model) throws AlertNotFoundException {
		Optional<Alert> alert = alertRepo.findById(id);
	
		if(alert.isPresent()) {
			model.addAttribute("alerts", alert.get());
			return "alert";
			
		}
		
		throw new AlertNotFoundException();
		
		}

	@RequestMapping("/show-alerts")
	public String findAllAlerts(Model model) {
		model.addAttribute("alerts", alertRepo.findAll());
		return("alerts");
		
	}

}
