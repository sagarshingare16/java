<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Application</title>
</head>
<body>
	<h1>Jsp web Application to generate dynamic response..</h2>
	<%
	    String name = request.getParameter("uname");
	    String city = request.getParameter("ucity");

	    out.println("Hello "+ name);
	    out.println("Your city "+ city);

	%>
</body>
</html>