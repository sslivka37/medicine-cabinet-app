package org.wecancodeit.medicinecabinetapp.base.classes;

<<<<<<< HEAD


import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
	
	@Id
	@Generated(value = { "" })
=======
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
>>>>>>> adrienne
	private long id;
	
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userPhone;
	private String userEmail;
<<<<<<< HEAD


=======
	//email id?
	

	
>>>>>>> adrienne
	public User () {
		
	}
	
<<<<<<< HEAD

=======
>>>>>>> adrienne
	public User(String userName, String firstName, String lastName,String userPassword, String userPhone, String userEmail) {
		this.userName=userName;
		this.firstName = firstName;
		this.lastName=lastName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail=userEmail;
<<<<<<< HEAD
}

=======
	}
>>>>>>> adrienne
	
	public long getId() {
		return id;
	}
	
<<<<<<< HEAD
=======
	
	
>>>>>>> adrienne
	public String getUserName() {
		return userName;
	}
	
	 public void setUserName(String userName) {
		  this.userName = userName;
		  }
	 
	public String getFirstName() {
		return firstName;
	}
	
	 public void setFirstName(String firstName) {
		  this.firstName = firstName;
		  }
	 
	 public String getLastName() {
			return lastName;
		}
		
		 public void setLastName(String lastName) {
			  this.lastName = lastName;
			  }
		
<<<<<<< HEAD
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		  this.userPassword = userPassword;
		  }

	public String getUserPhone() {
		return userPhone;
	}

=======
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		  this.userPassword = userPassword;
		  }
	
	public String getUserPhone() {
		return userPhone;
	}
>>>>>>> adrienne
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
<<<<<<< HEAD
=======
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
>>>>>>> adrienne
	
}



