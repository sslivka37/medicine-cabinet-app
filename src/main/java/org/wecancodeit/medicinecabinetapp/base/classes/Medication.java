package org.wecancodeit.medicinecabinetapp.base.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



public class Medication {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Lob
	private String medicationName;
	private String medicationType;
	
	private String dosageUnits;
	private double dosageAmount;
	
	private int frequency;
	private int count;
	//medication Time?

    @ManyToMany
    private Collection<Pharmacy> pharmacies;
    
    @ManyToOne
    private String user;
    
    @OneToMany
    private Collection<Alert> alerts;

	private String alert;
    
	//user id- many medications to one user
	//alert type- many medications to many alerts
	
	
	
	public Medication () {
		
	}
	
	public Medication(String medicationName, String dosageUnits, double dosageAmount, String medicationType, int frequency, int count, 
			String user, String alert, Pharmacy...pharmacies) {
		this.medicationName = medicationName;
		this.dosageUnits = dosageUnits;
		this.dosageAmount = dosageAmount;
		this.medicationType = medicationType;
		this.frequency = frequency;
		this.count = count;
		this.user = user;
		this.alert = alert;
		this.pharmacies = new HashSet<>(Arrays.asList(pharmacies));		
		
		
		List<Medication> medications = new ArrayList<Medication>();
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
	
	public String getUser() {
		return user;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public int getCount() {
		return count;
	}

}
