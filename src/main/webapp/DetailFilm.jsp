<%-- 
    Document   : DetailFilm
    Created on : 9 mars 2016, 09:57:22
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_CSS.jsp"/>
        <c:import url="_TITRE.jsp"/>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        Titre : ${Film.titre}<br>
        Synopsis : ${Film.synopsis}<br>
        Annee : ${Film.annee}
        <c:import url="_PIED.jsp"/>
    </body>
</html>
