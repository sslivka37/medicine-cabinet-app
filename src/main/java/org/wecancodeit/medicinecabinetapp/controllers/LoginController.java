package org.wecancodeit.medicinecabinetapp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@GetMapping("/user-login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		return "user-login";
	}
  
// @RequestMapping(value = "/user-login", method = RequestMethod.GET)
// public String loginPage(Model model) {
//  return "user-login";
//  }
// 
 @RequestMapping(value = "/user-login", method = RequestMethod.POST)
public String loginSuccessful(Model model) {
  return "loginSuccessful";
 }
}
// 
//		  
//
//		 
