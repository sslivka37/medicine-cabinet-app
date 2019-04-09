package org.wecancodeit.medicinecabinetapp.base.classes;

<<<<<<< HEAD
<<<<<<< HEAD


import javax.annotation.Generated;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import javax.persistence.Entity;
=======
=======
>>>>>>> development
>>>>>>> fix
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue
=======
=======
=======
>>>>>>> development
>>>>>>> empty
=======
>>>>>>> user classes up to date
=======
>>>>>>> updates to medication class
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User {
	
	@Id
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	@Generated
>>>>>>> removed curly braces
=======
=======
<<<<<<< HEAD
>>>>>>> fix
=======
>>>>>>> updates to medication class
	@Generated(value = { "" })
<<<<<<< HEAD
>>>>>>> user classes up to date
=======
=======
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
=======
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

>>>>>>> development
public class User {
	
	@Id
	@GeneratedValue
<<<<<<< HEAD
>>>>>>> adrienne
>>>>>>> fixed reds in medication
	private long id;
	
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userPhone;
	private String userEmail;
<<<<<<< HEAD


=======
=======
	private long id;
	
	private String userName;
	private String userPassword;
	private String userPhone;
>>>>>>> development
	//email id?
	

	
<<<<<<< HEAD
>>>>>>> adrienne
=======
>>>>>>> development
	public User () {
		
	}
	
<<<<<<< HEAD
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
=======
	public User(String userName, String userPassword, String userPhone) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
	}
>>>>>>> development
	
	public long getId() {
		return id;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
	
	
>>>>>>> adrienne
=======
>>>>>>> development
	public String getUserName() {
		return userName;
	}
	
<<<<<<< HEAD
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
	
=======
>>>>>>> development
	public String getUserPassword() {
		return userPassword;
	}
	
<<<<<<< HEAD
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
=======
	public String getUserPhone() {
		return userPhone;
	}
>>>>>>> development
	
}



