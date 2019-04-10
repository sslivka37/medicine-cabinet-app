package org.wecancodeit.medicinecabinetapp.base.classes;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Alert {
	
	@Id
	@GeneratedValue
	private long id;
	
		
	private boolean taken;
	
	//medication id- many medicines to many alerts
	//user id - many alerts to one user
	//alert Time
	//alert Date
	//alert Type
	
	public Alert() {
		
	}
	
	//loaded constructor?
	
	public Alert(String medicine, boolean b, int i, String type, LocalDateTime timeToSendAlert) {
		
	}

	public long getId() {
		return id;
	}

	public boolean isTaken() {
		return taken;
	}
	
	
	


}
