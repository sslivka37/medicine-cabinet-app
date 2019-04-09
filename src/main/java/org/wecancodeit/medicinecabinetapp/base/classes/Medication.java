package org.wecancodeit.medicinecabinetapp.base.classes;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

=======
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
>>>>>>> development

public class Medication {
	
	@Id
	@GeneratedValue
	private long id;
	
<<<<<<< HEAD
	
	private String medicationName;
	private String medicationType;
	
	private String dosageUnits;
	private double dosageAmount;
	
	private int frequency;
	private int count;
	//medication Time?

    
    private String pharmacy;
    
    @ManyToOne
    private String user;

    @OneToMany
    private Collection<Alert> alerts;

    public String availableMeds() {
		return getMedicationName();
	}
    
	private String alert;
    
=======
	private String medicationName;
	private String dosageUnits;
	private double dosageAmount;
	private String medicationType;
	private int frequency;
	private int count;
	//medication Time?
	//pharmacy id- many medications to many pharmacies
>>>>>>> development
	//user id- many medications to one user
	//alert type- many medications to many alerts
	
	
	
	public Medication () {
		
	}
	
<<<<<<< HEAD
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count, 
			String user, String alert, String pharmacy) {
=======
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count) {
>>>>>>> development
		this.medicationName = medicationName;
		this.dosageUnits = dosageUnits;
		this.dosageAmount = dosageAmount;
		this.medicationType = medicationType;
		this.frequency = frequency;
		this.count = count;
<<<<<<< HEAD
		this.user = user;
		this.alert = alert;
		this.pharmacy = pharmacy;		
		
		
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
	
<<<<<<< HEAD
	public String getUser() {
		return user;
	}
	
=======
>>>>>>> development
	public int getFrequency() {
		return frequency;
	}
	
	public int getCount() {
		return count;
	}

}
