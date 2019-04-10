//Home.jsp
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Home Page</title>
</head>
<body>
 <center><h2>Home Page</h2></center>
 Welcome <%=request.getAttribute("userName") %> <!-- Refer to the video to understand how this works -->
 <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
</body>
</html>