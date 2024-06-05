<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Application</title>
<link type=text/css rel="stylesheet" href="./style.css">
</head>
<body>
    <div id="wrapper">
    	<div id="header">
    			<h1>Customer Relationship Management Application</h1>
    	</div>
    </div>

    <div id="container">

        	<div id="content">

        	    <table border="1">

        	           <tr>
        	           <th>First Name</th>
        	           <th>Last Name</th>
        	           <th>City</th>
        	           <th>Update Data</th>
        	           <th>Delete Data</th>

        	           </tr>
        	           <c:forEach var="customer"  items="${customers}">

        	           <tr>
        	              <td>${customer.customerId}</td>
        	              <td>${customer.customerName}</td>
        	              <td>${customer.customerCity}</td>



        	           </tr>

        	           </c:forEach>

        	    </table>


        	</div>

        </div>

</body>
</html>