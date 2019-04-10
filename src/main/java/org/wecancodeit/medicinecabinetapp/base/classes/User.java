package org.wecancodeit.medicinecabinetapp.base.classes;

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
<<<<<<< HEAD

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
=======
>>>>>>> login classes
import javax.persistence.Entity;


@Entity
public class User {
	
	@Id
	@GeneratedValue
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> adrienne
>>>>>>> fixed reds in medication
=======
>>>>>>> login classes
	private long id;
	
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userPhone;
	private String userEmail;





	public User () {
		
	}

	public User(String userName, String firstName, String lastName,String userPassword, String userPhone, String userEmail) {
		this.userName=userName;
		this.firstName = firstName;
		this.lastName=lastName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail=userEmail;

}



	public long getId() {
		return id;
	}

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
		

	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		  this.userPassword = userPassword;
		  }

	public String getUserPhone() {
		return userPhone;
	}


	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}

	

	
}



