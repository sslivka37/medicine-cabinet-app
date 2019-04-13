package org.wecancodeit.medicinecabinetapp.base.classes;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;

@Component
public class UserPopulator implements CommandLineRunner {

	@Resource
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		User user1=new User("joesmo", "Joe","Smo","password", "2165555555", "email@myemail.com");
		user1=userRepo.save(user1);
		User user2=new User("Matt's Carpet", "Matt's carpet installation","The carpet installed by this company is just ok.  It works for my business but it looks a lot cheaper than I thought it would. ","images/carpetfloor.jpg", null , null);
		user2=userRepo.save(user2);		
	}
}
