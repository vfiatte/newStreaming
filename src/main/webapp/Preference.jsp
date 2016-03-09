<%-- 
    Document   : Preference
    Created on : 9 mars 2016, 14:03:06
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Streaming : Preference</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/><br>

        Choix du style : 
        <form method="post" action ="ChoixStyleServlet">
            <select name="style">
                <option value="style.css">Style 1</option>
                <option value="style2.css">Style 2</option>
                <option value="style3.css">Style 3</option>
            </select><br><br><br>

            <input type="submit"/>
        </form>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
