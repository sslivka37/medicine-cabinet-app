package org.wecancodeit.medicinecabinetapp;

import org.springframework.data.repository.CrudRepository;

//will have to add parameters for UserRepository(ie, User, Long)
public interface UserRepository extends CrudRepository<User, Long> {

	  void register(User user);
	  
	  User validateUser(Login login);
	}
	

