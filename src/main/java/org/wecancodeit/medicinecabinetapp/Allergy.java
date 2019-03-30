package org.wecancodeit.medicinecabinetapp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Allergy {
	
	@Id
	@GeneratedValue
	private long id;
	private String allergyName;
	
	public Allergy () {
		
	}
	
	public Allergy(String allergyName) {
		this.allergyName = allergyName;
	}
	
	public String getAllergyName() {
		return allergyName;
	}
	

}