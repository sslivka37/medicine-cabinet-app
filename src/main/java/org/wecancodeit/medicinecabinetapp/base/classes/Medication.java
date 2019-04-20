package org.wecancodeit.medicinecabinetapp.base.classes;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.LocalTime;



@Entity

public class Medication {
	
	@Id
	@GeneratedValue
	private long id;
	

	private String name;
	private String dosageUnits;
	private double dosageAmount;
	private String medicationType;
	private String frequency;
	
	@Lob
	private String instructions;
	
	
	private String count;
	private LocalTime timeToTakeMedication;
	
	@OneToOne
	private Doctor doctor;
	
	@OneToOne
	private Pharmacy pharmacy;
	
	@ManyToMany
	private Collection <Alert> alerts;
	
		
	public Medication ()	{
		
	}
	
	

	
	//public Medication (String medicationName2, String dosageUnits2, double dosageAmount2, String medicationType2, String frequency2, String instructions2, Doctor doctor2, Pharmacy pharmacy2, Alert alertName) {
		
	//}
	

	
	public Medication(String name, String dosageUnits, double dosageAmount, String medicationType, String frequency, String count, LocalTime timeToTakeMedication, String instructions, Doctor doctor, Pharmacy pharmacy, Alert...alerts) {

		this.name = name;
		this.dosageUnits = dosageUnits;
		this.dosageAmount = dosageAmount;
		this.medicationType = medicationType;
		this.frequency = frequency;
		this.count = count;
		this.timeToTakeMedication = timeToTakeMedication;
		this.instructions = instructions;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
		this.alerts = new HashSet<>(Arrays.asList(alerts));
		

	}
	
	public long getId() {
		return id;
	}
	
	public void setMedciationName(String name) {
		 this.name = name;
	}
	
	public String getMedicationName() {
		return name;
	
	}
	
	public void setDosageUnits(String dosageUnits) {
		this.dosageUnits = dosageUnits;
	}
	

	public String getDosageUnits() {
		return dosageUnits;
	}
	
	public void setDosageAmount(double dosageAmount) {
		this.dosageAmount= dosageAmount;
	}
	
	public double getDosageAmount() {
		return dosageAmount;
	}
	
	public void setMedicationType(String medicationType) {
		this.medicationType = medicationType;
	}
	
	public String getMedicationType() {
		return medicationType;
	}
	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	public String getFrequency() {

		return frequency;
	}
	
	public void setCount(String count) {
		this.count = count;
	}
	
	public String getCount() {
		return count;
	}

	
	public LocalTime getTimeToTakeMedication() {
		return timeToTakeMedication;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	public String getInstructions() {
		return instructions;
	}
	
	
	
	public Collection <Alert> getAlerts(){
		return alerts;
	}
	
	public Object getDoctor() {		
		return doctor;
	}
	
	public void setDoctorName(String doctorName) {
		this.setDoctorName(doctorName);
		
	}
	
	public Object getPharmacy() {
		return pharmacy;
	}
	
	public void setPharmacyName(String pharmacyName) {
		this.setPharmacyName(pharmacyName);
		
	}
	
	public void setAlertName(String alertName) {
		this.setAlertName(alertName);
		
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
