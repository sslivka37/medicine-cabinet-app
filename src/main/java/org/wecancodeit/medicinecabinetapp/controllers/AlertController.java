package org.wecancodeit.medicinecabinetapp.controllers;


import java.util.Calendar;
import java.util.Optional;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.exceptions.AlertNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;
import org.wecancodeit.medicinecabinetapp.service.EmailService;

@Controller
public class AlertController {

	private Logger logger = LoggerFactory.getLogger(AlertController.class);

	@Resource
	private AlertRepository alertRepo;

	@RequestMapping("/alert")
	public String findOneAlert(@RequestParam(value = "id") long id, Model model) throws AlertNotFoundException {
		Optional<Alert> alert = alertRepo.findById(id);

		if (alert.isPresent()) {
			model.addAttribute("alerts", alert.get());

			User user = new User();
			user.setFirstName("Sally");
			user.setLastName("Sue");
			user.setUserEmail("anicgarr@gmail.com");

			try {
				EmailService.sendEmailAlert(user);

			} catch (MailException e) {

				logger.info("Error Sending Email:" + e.getMessage());
			}
			return "alert";
		}  {
			
		}

		throw new AlertNotFoundException();

	}


	@RequestMapping("/show-alerts")
	public String findAllAlerts(Model model) {
		model.addAttribute("alerts", alertRepo.findAll());
		return ("alerts");


	

}

}
