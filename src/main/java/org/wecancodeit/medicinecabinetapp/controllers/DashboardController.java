package org.wecancodeit.medicinecabinetapp.controllers;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DashboardController {
	
	

	
	@GetMapping("/home-page")
	public String showDashboard() {
		return "medicinecabinet";
}
}