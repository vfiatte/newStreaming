<%-- 
    Document   : AjoutFilm
    Created on : 8 mars 2016, 14:50:53
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="_CSS.jsp"/>
    </head>
    <c:import url="_TITRE.jsp"/>
    <c:import url="_MENU.jsp"/>

    <body>
        <form method="post" action="AjoutFilmServlet">
            <table>
                <tr>
                    <td>
                        Titre 
                    </td>
                    <td>
                        <input type="text" name="titre">
                    </td>

                </tr>
                <tr>
                    <td>
                        <label>Sysnopsis</label>
                    </td>
                    <td>
                        <textarea name="synopsis"></textarea>
                    </td>
                </tr>
                <tr>
                    <td><label>Annee</label></td>
                    <td><input name="annee" value= "2016" type="number" min="1900" max="2016"></td>

                </tr>
                <tr>
                    <td colspan="2"><input type="Submit"></td>
                </tr>
            </table>
        </form>
        <c:import url="_PIED.jsp"/>
    </body>

</html>
