package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Medication;

<<<<<<< HEAD
public interface MedicationRepository extends CrudRepository<Medication, Long> {

	Medication save(Medication medication);

=======
//assuming we are using generated ID values and a similar set up to reviews site, parameters will be Medicine, Long
public interface MedicationRepository extends CrudRepository<Medication, Long> {

>>>>>>> development
}
