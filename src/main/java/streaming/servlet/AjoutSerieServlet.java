/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import streaming.entity.Serie;
import streaming.service.SerieService;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "AjoutSerieServlet", urlPatterns = {"/AjoutSerieServlet"})
public class AjoutSerieServlet extends AutowireServlet {

    @Autowired
    SerieService serieService;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre", "Ajouter une serie");
        String titre = req.getParameter("titre");
        String synopsis = req.getParameter("synopsis");
        Serie s = new Serie();
        s.setSysnopsis(synopsis);
        s.setTitre(titre);
        serieService.save(s);
        resp.sendRedirect("ListeSerieServlet");
    }

    

    

}
