/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Actividad;
import capaNegocio.Grupo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.orm.PersistentException;

/**
 *
 * @author Xiterss
 */
@WebServlet(name = "ServletVerActividad", urlPatterns = {"/VerActividad"})
public class ServletVerActividad extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Grupo grupo = new Grupo();
        List<Grupo> lista;
        try {
            lista = grupo.getGrupos();
            request.removeAttribute("lista");
        request.setAttribute("lista", lista);
        } catch (PersistentException ex) {
            Logger.getLogger(ServletVerActividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("verActividad.jsp");
        dispatcher.forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String boton = request.getParameter("boton");
        String uidGrupo = request.getParameter("select");
        int uid = Integer.parseInt(uidGrupo);
        Grupo grupo = new Grupo();
        grupo.setUid(uid);
        List<Actividad> listaActividad;
        try {
            listaActividad = grupo.getActividad(grupo);
            List<Grupo> lista = grupo.getGrupos();
            request.removeAttribute("lista");
            request.removeAttribute("listaActividad");
        request.setAttribute("listaActividad", listaActividad);
        request.setAttribute("lista", lista);
        } catch (PersistentException ex) {
            Logger.getLogger(ServletVerActividad.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("verActividad.jsp");
        dispatcher.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
