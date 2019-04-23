package org.wecancodeit.medicinecabinetapp.base.classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String doctorPhone;
	
	
	public Doctor () {
		
	}
	
	public Doctor(String name, String doctorPhone) {
		this.name = name;
		this.doctorPhone = doctorPhone;
	}
	
	public long getId() {
		return id;
	}
	
	public void setDoctorName(String name) {
		this.name = name;
	}
	
	
	public String getDoctorName() {
		return name;
	}
	
	
	public String getDoctorPhone() {
		return doctorPhone;
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
		Doctor other = (Doctor) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	

}



