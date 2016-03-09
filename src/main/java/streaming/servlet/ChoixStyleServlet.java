/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "ChoixStyleServlet", urlPatterns = {"/ChoixStyleServlet"})
public class ChoixStyleServlet extends AutowireServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String style = req.getParameter("style");
        Cookie c = new Cookie("stylepage", style);
        c.setMaxAge(30);
        resp.addCookie(c);
        resp.sendRedirect("AcceuilServlet");

    }

    
}
