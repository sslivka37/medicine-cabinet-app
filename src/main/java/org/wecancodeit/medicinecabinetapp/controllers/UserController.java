package org.wecancodeit.medicinecabinetapp.controllers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;
import org.wecancodeit.medicinecabinetapp.service.SecurityService;
import org.wecancodeit.medicinecabinetapp.service.UserService;
import org.wecancodeit.medicinecabinetapp.validator.UserValidator;

@Controller
public class UserController {

	@Resource
	UserRepository userRepo;

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("userForm", new User());

		return "registerPage";
	}

	@PostMapping("/registration")
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
		userValidator.validate(userForm, bindingResult);

		if (bindingResult.hasErrors()) {
			return "registerPage";
		}

		userService.save(userForm);

		securityService.autoLogin(userForm.getUserName(), userForm.getPasswordConfirm());

		return "redirect:/welcome";
	}

	@GetMapping("/login")
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "Your username and password is invalid.");

		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully.");

		return "login";
	}

	@GetMapping({ "/", "/welcome" })
	public String welcome(Model model) {
		return "welcome";
	}

	@RequestMapping("/add-user")
	public String addUser(String userName, String firstName, String lastName, String userPassword, String userPhone,
			String userEmail) {

		User newUser = userRepo.findByUserName(userName);

		if (newUser == null) {
			newUser = new User();
			userRepo.save(newUser);
		}

		return "redirect:/dashboard";
	}

	@RequestMapping("/delete-user")
	public String deleteUserByName(String userName) {

		if (userRepo.findByUserName(userName) != null) {
			User deletedUser = userRepo.findByUserName(userName);
			userRepo.delete(deletedUser);
		}
		return "redirect:/goodbye";

	}

}