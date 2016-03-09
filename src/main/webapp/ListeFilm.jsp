<%-- 
    Document   : ListeFilm
    Created on : 8 mars 2016, 14:50:29
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Streaming : Liste des Films</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/><br>
        <div class="centrer">
            <table>
                <tr>
                    <td>ID</td>
                    <td>Titre</td>
                    <td>Details</td>
                    <td>Modifier</td>
                    <td>Supprimer</td>
                </tr>

                <c:forEach items="${Film}" var="monFilm">
                    <tr>
                        <td>${monFilm.id}</td>
                        <td>${monFilm.titre}</td>
                        <td><a href = "DetailFilmServlet?idFilm=${monFilm.id}">Details</a></td>
                        <td><a href = "ModificationFilmServlet?idFilm=${monFilm.id}">Modifier</a></td>
                        <td><a href = "SupprimerFilmServlet?idFilm=${monFilm.id}">Supprimer</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <br>


        <a class="ajout" href="AjoutFilm.jsp">Ajouter un film</a><br><br><br>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
