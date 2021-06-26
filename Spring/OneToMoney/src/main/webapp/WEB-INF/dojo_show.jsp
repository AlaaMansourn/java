<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ninjas for ${dojos.name} location</h1>
<table>
<c:forEach items="${dojos.ninjas}" var="ninja">
<tr>
<td>${ninja.firstName}</td>
<td>${ninja.lastName}</td>
<td>${ninja.age}</td>


</tr>
</c:forEach>
</table>


</body>
</html>