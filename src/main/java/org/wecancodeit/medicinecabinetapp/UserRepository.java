package org.wecancodeit.medicinecabinetapp;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	  void register(User user);
	  
	  User validateUser(Login login);

}

	

