<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ninja Gold</title>
    
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div>
        <p class="ygold">your gold : <c:out value="${count}"/></p>
        <ul>
            <li>
                <form action="/process_money" method="POST">
                    
                    <h2>Farm</h2>
                    <p>(earns 10-20 golds)</p>
                    <input type="hidden" name="building" value="farm">
                    <button type="submit">Find Gold!</button>
                </form>
            </li>
            <li>
                <form action="/process_money" method="POST">
                    
                    <h2>Cave</h2>
                    <p>(earns 5-10 golds)</p>
                    <input type="hidden" name="building" value="cave">
                    <button type="submit">Find Gold!</button>
                </form>
            </li>
            <li>
                <form action="/process_money" method="POST">
                    
                    <h2>House</h2>
                    <p>(earns 2-5 golds)</p>
                    <input type="hidden" name="building" value="house">
                    <button type="submit">Find Gold!</button>
                </form>
            </li>
            <li>
                <form action="/process_money" method="POST">
                    
                    <h2>Casino</h2>
                    <p>(earns 0-50 golds)</p>
                    <input type="hidden" name="building" value="casino">
                    <button type="submit">Find Gold!</button>
                </form>
            </li>
        </ul>
        
        
        <p>Activities:</p>
        <div id="activites">
           <c:forEach  var="activity" items="${activity}">
           <p><c:out value='${activity}'/><p>
           </c:forEach>
                <p></p>
           
        </div>


    </div>
</body>
</html>