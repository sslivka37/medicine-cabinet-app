package org.wecancodeit.medicinecabinetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.wecancodeit.medicinecabinetapp.base.classes.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.dao.UserDao;


public class  UserServiceImpl implements UserService {
	
	 @Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

	

}
