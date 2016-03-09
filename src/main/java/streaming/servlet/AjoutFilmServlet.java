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
@WebServlet(name = "AjoutFilmServlet", urlPatterns = {"/AjoutFilmServlet"})
public class AjoutFilmServlet extends AutowireServlet {

    @Autowired
    FilmService filmService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Iterable<Film> listeFilm = filmService.findAll();
        req.setAttribute("titre", "Ajouter un film");
        String titre = req.getParameter("titre");
        String synopsis = req.getParameter("synopsis");
        Long annee = Long.parseLong(req.getParameter("annee"));
        Film f = new Film();
        f.setTitre(titre);
        f.setSynopsis(synopsis);
        f.setAnnee(annee);
        filmService.save(f);
        resp.sendRedirect("ListeFilmServlet");

    }

}
