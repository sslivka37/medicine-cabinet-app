package org.wecancodeit.medicinecabinetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Reminder;

public interface ReminderRepository extends CrudRepository<Reminder,Long> {

}
