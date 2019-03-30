package org.wecancodeit.medicinecabinetapp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Medication {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String medicationName;
	private String dosageUnits;
	private double dosageAmount;
	private String medicationType;
	private int frequency;
	private int count;
	//medication Time?
	//pharmacy id- many medications to many pharmacies
	//user id- many medications to one user
	//alert type- many medications to many alerts
	
	
	
	public Medication () {
		
	}
	
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count) {
		this.medicationName = medicationName;
		this.dosageUnits = dosageUnits;
		this.dosageAmount = dosageAmount;
		this.medicationType = medicationType;
		this.frequency = frequency;
		this.count = count;
	}
	
	
	
	public String getMedicationName() {
		return medicationName;
	
	}
	
	public String getDosageUnits() {
		return dosageUnits;
	}
	
	public double getDosageAmount() {
		return dosageAmount;
	}
	
	public String getMedicationType() {
		return medicationType;
	}
	
	public int getCount() {
		return count;
	}

}
