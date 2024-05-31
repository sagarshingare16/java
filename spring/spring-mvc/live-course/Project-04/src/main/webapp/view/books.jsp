<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
<center>
	<h1 style='color:red; text-align:center'>Display Data From an Array</h1>
	<b>Name of Book</b>
	<c:forEach var="booksName" items="${books}">${booksName}</c:forEach>

</center>
</body>
</html>