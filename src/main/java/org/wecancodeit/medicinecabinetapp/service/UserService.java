package org.wecancodeit.medicinecabinetapp.service;

	import org.wecancodeit.medicinecabinetapp.base.classes.User;

	public interface UserService {

	  void register(User user);

	  User validateUser(org.wecancodeit.medicinecabinetapp.base.classes.Login login);
	}

