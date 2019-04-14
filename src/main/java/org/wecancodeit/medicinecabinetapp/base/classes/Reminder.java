package org.wecancodeit.medicinecabinetapp.base.classes;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reminder {
	
	@Id
	@GeneratedValue
	private long id;
	
	private LocalDateTime timeToSendReminder;

	public void setAlert(Alert alert) {
		
	}
	
	@OneToOne(mappedBy="reminder")
	private Alert alert;
	
	
public Reminder() {
	
}


public LocalDateTime getTimeToSendReminder() {
	return timeToSendReminder;
}


public void setTimeToSendReminder(LocalDateTime timeToSendReminder) {
	this.timeToSendReminder = timeToSendReminder;
}
}
