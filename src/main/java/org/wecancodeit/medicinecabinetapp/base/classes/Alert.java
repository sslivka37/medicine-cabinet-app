package org.wecancodeit.medicinecabinetapp.base.classes;




import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;




@Entity

public class Alert {
	
	@Id
	@GeneratedValue
	private long id;
  
	private String name;	
	private boolean taken;
	private int dosageUnits;
	private String dosageType;
	
	int dayToSendAlert;
	int timeToSendAlertHour;
	int timeToSendAlertMinute;

	@ManyToMany(mappedBy = "alerts")
	private Collection <Medication> medications;
	
	
	//should alerts be mapped to user also or just medications?
	
	
	 public Alert (){
		
	
	 }
	
	public Alert(String name, boolean taken, int dosageUnits, String dosageType, int dayToSendAlert, int timeToSendAlertHour, int timeToSendAlertMinute) {
		this.name = name;
		this.taken = taken;
		this.dayToSendAlert=dayToSendAlert;
		this.timeToSendAlertHour = timeToSendAlertHour;
		this.timeToSendAlertMinute=timeToSendAlertMinute;
		this.dosageUnits = dosageUnits;
		this.dosageType = dosageType;
		
			
				
	}

	
	public long getId() {
		return id;
	}
	
	
	public void setAlertName(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}


	public boolean isTaken() {
		return taken;
	}
	

	public int getDosageUnits() {
		return dosageUnits;
	}
	
	public String getDosageType() {
		return dosageType;
	}
	
		public Collection <Medication> getMedications() {		
		return medications;
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
		Alert other = (Alert) obj;
		if (id != other.id)
			return false;
		return true;
	}


	public int getTimeToSendAlertHour() {
		return timeToSendAlertHour;
	}


	public void setTimeToSendAlertHour(int timeToSendAlertHour) {
		this.timeToSendAlertHour = timeToSendAlertHour;
	}


	public int getTimeToSendAlertMinute() {
		return timeToSendAlertMinute;
	}


	public void setTimeToSendAlertMinute(int timeToSendAlertMinute) {
		this.timeToSendAlertMinute = timeToSendAlertMinute;
	}

	public int getDayToSendAlert() {
		return dayToSendAlert;
	}

	public void setDayToSendAlert(int dayToSendAlert) {
		this.dayToSendAlert = dayToSendAlert;
	}


	
	

	
	


}
