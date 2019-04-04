package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
<<<<<<< HEAD
import org.wecancodeit.medicinecabinetapp.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;


public interface UserRepository extends CrudRepository<User, Long> {

		  void register(User user);
		  
		  User validateUser(Login login);
	}
	

=======
import org.wecancodeit.medicinecabinetapp.base.classes.User;

//assuming we are using generated ID values and a similar set up to reviews site, parameters will be User, Long
public interface UserRepository extends CrudRepository<User, Long> {

}
>>>>>>> development
