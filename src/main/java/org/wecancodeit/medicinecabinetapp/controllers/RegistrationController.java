package org.wecancodeit.medicinecabinetapp.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
	@Resource
	RegistrationRepository registrationRepo; 

	@RequestMapping("/register")
	public String registerPage(Model model) {
		return "registerPage";
	}
}
