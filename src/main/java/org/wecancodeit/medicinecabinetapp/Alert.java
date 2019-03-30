package org.wecancodeit.medicinecabinetapp;

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
	


}
