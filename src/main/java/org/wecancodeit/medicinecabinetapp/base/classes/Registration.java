package org.wecancodeit.medicinecabinetapp.base.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registration {

	@Id
	@GeneratedValue
	private long id;
	
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userPhone;
	private String userEmail;

	

	
	public Registration () {
		
	}
	
	public Registration(String userName, String firstName, String lastName, String userPassword, String userPhone, String userEmail) {
		this.userName = userName;
		this.firstName=firstName;
		this.lastName=lastName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail=userEmail;
	}
	
	public long getId() {
		return id;
	}
	
	public String userName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public String firstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String lastName() {
		return lastName;
	}
	public void setLastname(String lastName) {
		this.lastName=lastName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword=userPassword; 
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
	

}
