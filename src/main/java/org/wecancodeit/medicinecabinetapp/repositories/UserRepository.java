package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.Login;
import org.wecancodeit.medicinecabinetapp.base.classes.User;
import org.wecancodeit.medicinecabinetapp.base.classes.UserPopulator;

public interface UserRepository extends CrudRepository<User, Long> {


		  void register(User user);

		  User validateUser(Login login);

		User findbyUser(String user);


}
