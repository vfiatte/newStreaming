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
import streaming.entity.Serie;
import streaming.service.SerieService;
import streaming.spring.AutowireServlet;

/**
 *
 * @author admin
 */
@WebServlet(name = "SupprimerSerieServlet", urlPatterns = {"/SupprimerSerieServlet"})
public class SupprimerSerieServlet extends AutowireServlet {

    @Autowired
    SerieService serieService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long l = Long.parseLong(req.getParameter("idSerie"));
        Serie s = serieService.findOne(l);
        serieService.delete(s);
        resp.sendRedirect("ListeSerieServlet");
    }

    

}
