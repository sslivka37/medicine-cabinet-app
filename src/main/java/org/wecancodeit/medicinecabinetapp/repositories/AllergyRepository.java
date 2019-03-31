package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Allergy;

public interface AllergyRepository extends CrudRepository<Allergy, Long> {

}
