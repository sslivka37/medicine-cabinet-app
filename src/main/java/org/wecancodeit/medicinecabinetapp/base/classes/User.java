package org.wecancodeit.medicinecabinetapp.base.classes;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userPhone;
	private String userEmail;
	
	
	private String userName;
	private String userPassword;
	private String userPhone;

	

	public User () {
		
	}
	

	public User(String userName, String firstName, String lastName,String userPassword, String userPhone, String userEmail) {
		this.userName=userName;
		this.firstName = firstName;
		this.lastName=lastName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail=userEmail;

	
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


	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		  this.userPassword = userPassword;
		  }

	public String getUserPassword() {
		return userPassword;
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



