package org.wecancodeit.medicinecabinetapp.controllers;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Registration;

public interface RegistrationRepository extends CrudRepository<Registration,Long> {

}
