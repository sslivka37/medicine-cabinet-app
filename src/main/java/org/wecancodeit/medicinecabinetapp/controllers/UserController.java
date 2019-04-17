package org.wecancodeit.medicinecabinetapp.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;

@Controller
public class UserController {

@Resource
UserRepository userRepo;


	@RequestMapping("/add-user")
	public String addUser(String userName, String firstName, String lastName, String userPassword, String userPhone,
			String userEmail) {

		User newUser = userRepo.findByUserName(userName);

		if (newUser == null) {
			newUser = new User();
			userRepo.save(newUser);
		}

		return "medicinecabinet";
	}

	@RequestMapping("/delete-user")
	public String deleteUserByName(String userName) {

		if (userRepo.findByUserName(userName) != null) {
			User deletedUser = userRepo.findByUserName(userName);
			userRepo.delete(deletedUser);
		}
		return "redirect:/goodbye";

	}
	
	@RequestMapping("/show-users")
	public String findAllUsers(Model model) {
		model.addAttribute("alerts", userRepo.findAll());
		return("users");
		
	}

}