<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 29, 2023, 4:12:41 PM
    Author     : MiguelM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Arithmetic Calculator</h1>
        
        <%--Form--%>
        <form name="cForm" method="post" action="age">
            Enter your age: <input type="number" id="aNum" name="aNum" value="${aNum}">
            <input type="submit" value="Age next birthday">
        </form>
        
        <%--Error Message--%>
        <p>${message}</p>
        
        <%--OtherCalculator--%>
        <a href="age">Age Calculator</a>
        
    </body>
    
</html>
