<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>${ person.firstName } ${ person.lastName }</h1>
		<p><strong>License Number</strong> ${ person.license.getId() }</p>
		<p><strong>Expiration Date</strong> ${ person.license.getExpirationDate() }</p>




</body>
</html>