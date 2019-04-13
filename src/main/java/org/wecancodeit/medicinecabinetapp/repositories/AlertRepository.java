package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;

public interface AlertRepository extends CrudRepository<Alert, Long> {

	Alert findByName(String alertName);

	

	
	
	
	
	
	
	//default Alert findByName(Alert alertName) {
		//return alertName;
		
	//};

}
