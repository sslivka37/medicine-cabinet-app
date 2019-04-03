package org.wecancodeit.medicinecabinetapp.base.classes;

	import jbr.springmvc.model.Login;
	import jbr.springmvc.model.User;

	public interface UserService {

	  void register(User user);

	  User validateUser(Login login);
	}

