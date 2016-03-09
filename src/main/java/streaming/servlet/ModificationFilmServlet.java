/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet(name = "ModificationFilmServlet", urlPatterns = {"/ModificationFilmServlet"})
public class ModificationFilmServlet extends AutowireServlet {

    @Autowired
    FilmService filmService;
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre", "Modifier ce film");
        Long l = Long.parseLong(req.getParameter("idFilm"));
        Film f = filmService.findOne(l);
        req.setAttribute("Film", f);
        req.getRequestDispatcher("ModifierFilm.jsp").include(req, resp);

        
        
    }
   


}
