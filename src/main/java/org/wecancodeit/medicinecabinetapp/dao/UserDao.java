package org.wecancodeit.medicinecabinetapp.dao;


import org.wecancodeit.medicinecabinetapp.base.classes.User;

public interface UserDao {

	void register(User user);
	
	User validateUser(org.wecancodeit.medicinecabinetapp.base.classes.Login login);
}
