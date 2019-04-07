package org.wecancodeit.medicinecabinetapp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wecancodeit.medicinecabinetapp.base.classes.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;

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