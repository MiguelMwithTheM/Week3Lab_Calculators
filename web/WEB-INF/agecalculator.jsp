<%-- 
    Document   : calculatorForm
    Created on : Jan 28, 2023, 9:51:10 PM
    Author     : MiguelM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Age Calculator</h1>
        
        <%--Form--%>
        <form name="cForm" method="post" action="age">
            Enter your age: <input type="number" id="aNum" name="aNum" value="${aNum}">
            <input type="submit" value="Age next birthday">
        </form>
        
        <%--Error Message--%>
        <p>${message}</p>
        
        <%--OtherCalculator--%>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
    
</html>
