/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.util.CookieUtil;

/**
 *
 * @author admin
 */
@WebServlet(name = "Homepage", urlPatterns = {"/Homepage"})
public class Homepage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookie = CookieUtil.getCookies(req.getCookies(), "pagepreferee");
        
//        if (cookie.equals("")){
            resp.sendRedirect(cookie);
        }
       
    }

    


