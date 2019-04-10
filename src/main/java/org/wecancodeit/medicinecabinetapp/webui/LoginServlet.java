package org.wecancodeit.medicinecabinetapp.webui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wecancodeit.medicinecabinetapp.LoginController;
import org.wecancodeit.medicinecabinetapp.dataaccess.LoginDao;
import org.wecancodeit.medicinecabinetapp.base.classes.Login;

public class LoginServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
			 
		String userName = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		Login login = new Login(); //creating object for LoginBean class, which is a normal java class, contains just setters and getters. Bean classes are efficiently used in java to access user information wherever required in the application.
		 
		login.setUsername(userName); //setting the username and password through the loginBean object then only you can get it in future.
		 login.setPassword(password);
		 
		LoginDao loginDao = new LoginDao(); //creating object for LoginDao. This class contains main logic of the application.
		 
		String userValidate = loginDao.authenticateUser(login); //Calling authenticateUser function
		 
		if(userValidate.equals("SUCCESS")) //If function returns success string then user will be rooted to Home page
		 {
		 request.setAttribute("userName", userName); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
		 request.getRequestDispatcher("/Home.jsp").forward(request, response);//RequestDispatcher is used to send the control to the invoked page.
		 }
		 else
		 {
		 request.setAttribute("errMessage", userValidate); //If authenticateUser() function returnsother than SUCCESS string it will be sent to Login page again. Here the error message returned from function has been stored in a errMessage key.
		 request.getRequestDispatcher("/Login.jsp").forward(request, response);//forwarding the request
		 }
		 }
		 
		}

