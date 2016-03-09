<%-- 
    Document   : AjoutSerie
    Created on : 8 mars 2016, 14:51:03
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


    <body>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <form method="post" action="AjoutSerieServlet">
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
                        <label>Synopsis</label>
                    </td>
                    <td>
                        <textarea name="synopsis"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input href ="ListeSerie.jsp" type="Submit"></td>
                </tr>

            </table>
        </form>
        <c:import url="_PIED.jsp"/>
    </body>

</html>
