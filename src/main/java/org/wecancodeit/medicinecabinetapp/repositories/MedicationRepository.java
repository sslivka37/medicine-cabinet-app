package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Medication;

public interface MedicationRepository extends CrudRepository<Medication, Long> {

}
