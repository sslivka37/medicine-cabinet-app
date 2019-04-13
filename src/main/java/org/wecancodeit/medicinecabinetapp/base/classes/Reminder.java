package org.wecancodeit.medicinecabinetapp.base.classes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Reminder {
	
	
	    private long id;  
	    private int hour; 
	    private int minute;

	    private String dosageAmount;

	    private String dosageUnits;

	    private String dateString;
		private String medicationName;


 	    public Reminder(long id, int hour, int minute, String medicationName, String dosageAmount, String dosageUnits) {
	        this.id = id;
	        this.hour = hour;
	        this.minute = minute;
	        this.medicationName = medicationName;
	        this.dosageAmount = dosageAmount;
	        this.dosageUnits = dosageUnits;
	    }

	    public String getDateString() {
	        return dateString;
	    }

	    public void setDateString(String dateString) {
	        this.dateString = dateString;
	    }

	    public String getDosageAmount() {
	        return dosageAmount;
	    }

	    public String getDosageUnits() {
	        return dosageUnits;
	    }

	    public void setDosageAmount(String dosageAmount) {
	        this.dosageAmount = dosageAmount;
	    }

	    public void setDosageUnits(String dosageUnits) {
	        this.dosageUnits = dosageUnits;
	    }

	    private List<Long> ids = new LinkedList<Long>();

	    private boolean dayOfWeek[] = new boolean[7];

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public List<Long> getIds() {
	        return Collections.unmodifiableList(ids);
	    }

	    public boolean[] getDayOfWeek() {
	        return dayOfWeek;
	    }

	    public void setDayOfWeek(boolean[] dayOfWeek) {
	        this.dayOfWeek = dayOfWeek;
	    }

	    public void addId(long id) {
	        ids.add(id);
	    }

	    public int getHour() {
	        return hour;
	    }

	    public void setHour(int hour) {
	        this.hour = hour;
	    }

	    public int getMinute() {
	        return minute;
	    }

	    public void setMinute(int minute) {
	        this.minute = minute;
	    }

	    public String getAm_pm() {
	        return (hour < 12) ? "am" : "pm";
	    }

	    public String getMedicationName() {
	        return medicationName;
	    }

	    public void setMedicationName(String medicationName) {
	        this.medicationName = medicationName;
	    }

	  
	    public String getFormattedDose() {
	        return String.format(Locale.getDefault(), "%s %s", dosageAmount, dosageUnits);
	    }

	}


