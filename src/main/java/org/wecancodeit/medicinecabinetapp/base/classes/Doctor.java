package org.wecancodeit.medicinecabinetapp.base.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String doctorName;
	private String doctorPhone;
	
	
	public Doctor () {
		
	}
	
	public Doctor(String doctorName, String doctorPhone) {
		this.doctorName = doctorName;
		this.doctorPhone = doctorPhone;
	}
	
	public long getId() {
		return id;
	}
	
	
	public String getDoctorName() {
		return doctorName;
	}
	
	
	public String getDoctorPhone() {
		return doctorPhone;
	}
	
	

}



