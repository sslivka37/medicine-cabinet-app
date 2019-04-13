package org.wecancodeit.medicinecabinetapp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
  
  @RequestMapping(value = "/user-login", method = RequestMethod.GET)
  public String loginPage(Model model) {
	  return "user-login";
  }
  
  @RequestMapping(value = "/loginSucessful", method = RequestMethod.POST)
  public String loginSuccessful(Model model) {
	  return "loginSuccessful";
  }
 
		  

		 
}