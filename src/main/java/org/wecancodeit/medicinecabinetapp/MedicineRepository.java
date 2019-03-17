package org.wecancodeit.medicinecabinetapp;

import org.springframework.data.repository.CrudRepository;

//will have to put parameters for repository
public interface MedicineRepository extends CrudRepository<Medicine, Long> {

}
