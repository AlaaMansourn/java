<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form:form action="/persons/new" method="post" modelAttribute="person">
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		
		<input type="submit" value="create" />
	</form:form>
</body>
</html>