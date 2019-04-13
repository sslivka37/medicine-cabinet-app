package org.wecancodeit.medicinecabinetapp.service;

public interface SecurityService {

	String findLoggedInUsername();
	
	void autoLogin(String userName,String userPassword);
}
