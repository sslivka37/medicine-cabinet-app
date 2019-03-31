package org.wecancodeit.medicinecabinetapp.base.classes;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String userName;
	private String userPassword;
	private String userPhone;
	//email id?
	

	
	public User () {
		
	}
	
	public User(String userName, String userPassword, String userPhone) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
	}
	
	public long getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
}



