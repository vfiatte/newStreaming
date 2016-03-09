/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Serie;
import streaming.service.SerieService;
import streaming.spring.AutowireServlet;
import streaming.util.CookieUtil;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeSerieServlet", urlPatterns = {"/ListeSerieServlet"})
public class ListeSerieServlet extends AutowireServlet {

    @Autowired
    SerieService serieService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie c = new Cookie("pagepreferee", "ListeSerieServlet");
        resp.addCookie(c);
        
        
        Iterable<Serie> s = serieService.findAll();
        req.setAttribute("titre", "Liste des Series");
        req.setAttribute("Serie", s);
        req.getRequestDispatcher("ListeSerie.jsp").include(req, resp);
    }

}
