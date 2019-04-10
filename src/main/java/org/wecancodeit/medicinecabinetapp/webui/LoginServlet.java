package org.wecancodeit.medicinecabinetapp.webui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wecancodeit.medicinecabinetapp.dataaccess.LoginDao;
import org.wecancodeit.medicinecabinetapp.base.classes.Login;
import org.wecancodeit.medicinecabinetapp.controllers.LoginController;

public class LoginServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			 
		String userName = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		Login login = new Login(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
		 
		login.setUsername(userName); //setting the username and password through the loginBean object then only you can get it in future.
		 login.setPassword(password);
		 
		LoginDao loginDao = new LoginDao(); 
		 
		String userValidate = loginDao.authenticateUser(login); 
		 
		if(userValidate.equals("SUCCESS")) 
		 {
		 request.setAttribute("userName", userName); 
		 request.getRequestDispatcher("/Home.jsp").forward(request, response);
		 }
		 else
		 {
		 request.setAttribute("errMessage", userValidate); 
		 request.getRequestDispatcher("/Login.jsp").forward(request, response);
		 }
		 }
		 
		}

