package org.wecancodeit.medicinecabinetapp.dataaccess;

import org.wecancodeit.medicinecabinetapp.base.classes.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;

public interface UserDao {
  
	void register(User user);
  
  User validateUser(Login login);
}