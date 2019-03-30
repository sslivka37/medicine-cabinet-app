package org.wecancodeit.medicinecabinetapp;

import org.springframework.data.repository.CrudRepository;

//assuming we are using generated ID values and a similar set up to reviews site, parameters will be Medicine, Long
public interface MedicationRepository extends CrudRepository<Medication, Long> {

}
