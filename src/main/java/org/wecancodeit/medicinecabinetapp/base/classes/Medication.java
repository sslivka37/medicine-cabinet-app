package org.wecancodeit.medicinecabinetapp.base.classes;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity
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
	
	
	
	@ManyToMany
	private Collection <Alert> alerts;
	
		//medication Time?
		//pharmacy id- many medications to many pharmacies
		//user id- many medications to one user
		
	
	public Medication () {
		
	}
	
	
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count, Alert...alerts) {
		this.medicationName = medicationName;
		this.dosageUnits = dosageUnits;
		this.dosageAmount = dosageAmount;
		this.medicationType = medicationType;
		this.frequency = frequency;
		this.count = count;
		this.alerts = new HashSet<>(Arrays.asList(alerts));
		
	}
	
	public long getId() {
		return id;
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
	
	public int getFrequency() {
		return frequency;
	}
	
	public int getCount() {
		return count;
	}
	
	public Collection <Alert> getAlerts(){
		return alerts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medication other = (Medication) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	

}
