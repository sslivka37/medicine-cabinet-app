package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;

public interface PharmacyRepository extends CrudRepository<Pharmacy, Long> {

	Pharmacy findByName(String pharmacyName);

}
