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



<h2>New Product</h2>

<form:form action="/products/new" method="post" modelAttribute="product">

    <p>
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input type="name"  path="name"/>
    </p>
    <p>
        <form:label path="description">description</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
    </p>
 <p>
        <form:label path="price">price</form:label>
        <form:errors path="price"/>
        <form:input path="price"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>

