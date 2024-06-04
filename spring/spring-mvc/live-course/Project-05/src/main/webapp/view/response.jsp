<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration response</title>
</head>
<body>
<center>
	<h1>Your Info has be received in the backend app and we could able to get that data</h1>
     <h1 style='color:red'>${userReg.userId}</h1>
     <h1 style='color:blue'>${userReg.userName}</h1>
     <h1 style='color:cyan'>${userReg.userAddress}</h1>
     <h1 style='color:green'>${userReg.userPhoneNumber}</h1>
</center>
</body>
</html>