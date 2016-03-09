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
        <title>Streaming : Lsite de mes series</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <h1>${titre}</h1>
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

                <c:forEach items="${Serie}" var="maSerie">
                    <tr>
                        <td>${maSerie.id}</td>
                        <td>${maSerie.titre}</td>
                        <td><a href = "DetailSerieServlet?idFilm=${monFilm.id}">Details</a></td>
                        <td><a href = "ModificationSerieServlet?idFilm=${maSerie.id}">Modifier</a></td>
                        <td><a href = "SupprimerSerieServlet?idFilm=${maSerie.id}">Supprimer</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

<br>


        <a class="ajout" href="AjoutSerie.jsp">Ajouter une serie</a><br><br><br>
        <c:import url="_PIED.jsp"/>
    </body>
</html>
</html>
