package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.User;

//assuming we are using generated ID values and a similar set up to reviews site, parameters will be User, Long
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUserName(String userName);



}
