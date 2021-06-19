<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
name :<c:out value="${name}"/><br>

location:<c:out value="${location}"/><br>
language:<c:out value="${language}"/><br>
comment : <c:out value="${optional}"/><br>

</body>
</html>