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
import streaming.entity.Film;
import streaming.service.FilmService;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "ListeFilmServlet", urlPatterns = {"/ListeFilmServlet"})
public class ListeFilmServlet extends AutowireServlet {
    
    @Autowired
    FilmService filmService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Cookie s = new Cookie("pagepreferee", "ListeFilmServlet");
        resp.addCookie(s);
        Iterable<Film> f = filmService.findAll();
        req.setAttribute("titre", "Liste des Films");
        req.setAttribute("Film", f);
        req.getRequestDispatcher("ListeFilm.jsp").include(req, resp);
        
    }

    
    

}
