package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

	Doctor findByName(String doctorName);

}
