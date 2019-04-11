package org.wecancodeit.medicinecabinetapp.dataaccess;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wecancodeit.medicinecabinetapp.base.classes.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;

@Service
public class UserService {
	   
	    @Autowired
	    private UserRepository userRepo; 
	     
	   
		public static User validateUser(Login login) {
			return null;
		}


		public UserRepository getUserRepo() {
			return userRepo;
		}


		public void setUserRepo(UserRepository userRepo) {
			this.userRepo = userRepo;
		}


		public void register(User user) {
		
			
		}
		
		}
	


