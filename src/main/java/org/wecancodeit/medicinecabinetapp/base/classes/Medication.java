package org.wecancodeit.medicinecabinetapp.base.classes;


<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> development
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.LocalTime;



@Entity



public class Medication {
	
	@Id
	@GeneratedValue
	private long id;
	

	private String medicationName;
	private String dosageUnits;
	private double dosageAmount;
	private String medicationType;
	private String frequency;
	private String instructions;
	private int count;
<<<<<<< HEAD

	private String alert;
    private String pharmacy;
    
    @ManyToOne
    private String user;

    @OneToMany
    private Collection<Alert> alerts;

    public Medication () {
=======
	private LocalTime timeToTakeMedication;
	
	@OneToOne
	private Doctor doctor;
	
	@OneToOne
	private Pharmacy pharmacy;
	
	@ManyToMany
	private Collection <Alert> alerts;
	
		
		//will have to work on relationships between med-pharm and med-doc

	
	public Medication () {
>>>>>>> development
		
	}
	

<<<<<<< HEAD
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count, 
			String user, String alert, String pharmacy) {
=======
	
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, String frequency, int count, LocalTime timeToTakeMedication, String instructions, Doctor doctor, Pharmacy pharmacy, Alert...alerts) {
>>>>>>> development

		this.medicationName = medicationName;
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
		
<<<<<<< HEAD
		List<Medication> medications = new ArrayList<Medication>();
=======
>>>>>>> development

	}
	
	public long getId() {
		return id;
	}
	
	public String getMedicationName() {
		return medicationName;
	
	}
	
<<<<<<< HEAD
=======

>>>>>>> development
	public String getDosageUnits() {
		return dosageUnits;
	}
	
	public double getDosageAmount() {
		return dosageAmount;
	}
	
	public String getMedicationType() {
		return medicationType;
	}
	
	public String getFrequency() {

		return frequency;
	}
	
	public int getCount() {
		return count;
	}
	
	public String availableMeds() {
		return getMedicationName();
	}

	
	public LocalTime getTimeToTakeMedication() {
		return timeToTakeMedication;
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
	
	public Object getPharmacy() {
		return pharmacy;
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
