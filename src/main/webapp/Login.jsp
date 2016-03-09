<%-- 
    Document   : Login
    Created on : 9 mars 2016, 16:19:37
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/>
    </head>
    <form method="get" action="LoginServlet">
    <body>
        Loggin : <input name="login" type="text"/>
        Mdp :    <input type="password"/>
        <input type="Submit">
    </body>
    </form>
    <c:import url="_PIED.jsp"/>
</html>
