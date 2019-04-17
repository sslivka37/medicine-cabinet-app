package org.wecancodeit.medicinecabinetapp.controllers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;
import org.wecancodeit.medicinecabinetapp.service.EmailService;
import org.wecancodeit.medicinecabinetapp.service.SecurityService;
import org.wecancodeit.medicinecabinetapp.service.UserService;
import org.wecancodeit.medicinecabinetapp.validator.UserValidator;

@Controller
public class RegistrationController {
	
	@Resource
	RegistrationRepository registrationRepo; 


	@Resource
	UserRepository userRepo;
	
	@Autowired 
	private EmailService emailService;

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm", new User());

		return "register";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
		userValidator.validate(userForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return "register";
		}

		userService.save(userForm);

		securityService.autoLogin(userForm.getUserName(), userForm.getPasswordConfirm());

		User user=new User();
		user.setFirstName(null);
		user.getLastName();
		user.getUserEmail();
		
		try {
		emailService.sendEmailAlert(user);
		
	}catch(MailException e) {
		
	}
		return "medicinecabinet";
	}

    @GetMapping({"/", "/medicinecabinet"})
    public String medicineCabinet(Model model) {
        return "medicinecabinet";
    }
	
	
	
	

}
