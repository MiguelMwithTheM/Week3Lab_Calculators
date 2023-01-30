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
        <form name="cForm" method="post" action="arithmetic">
            First: <input type="number" id="fNum" name="fNum" value="${fNum}"> <br>
            Second: <input type="number" id="sNum" name="sNum" value="${sNum}"> <br>
            <input type="submit" value="+" name="operations">
            <input type="submit" value="-" name="operations">
            <input type="submit" value="*" name="operations">
            <input type="submit" value="%" name="operations">
        </form>
        
        <%--Results--%>
        <p>Result: ${message}</p>
        
        <%--OtherCalculator--%>
        <a href="age">Age Calculator</a>
        
    </body>
    
</html>
