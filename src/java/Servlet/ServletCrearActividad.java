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
 * @author John Titor
 */
@WebServlet(name = "ServletCrearActividad", urlPatterns = {"/CrearActividad"})
public class ServletCrearActividad extends HttpServlet {

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
        try {
            List<Grupo> lista = grupo.getGrupos();
            request.removeAttribute("lista");
            request.setAttribute("lista", lista);
        } catch (PersistentException ex) {
            Logger.getLogger(ServletAgregarGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("crearActividad.jsp");
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
        String nombreActividad = request.getParameter("nombre");
        String fechaActividad = request.getParameter("fecha");
        String descripcionActividad = request.getParameter("desc");
        String uidGrupo = request.getParameter("uid");

        Actividad actividadNegocio = new Actividad();
        Grupo grupoNegocio = new Grupo();

        grupoNegocio.setUid(Integer.parseInt(uidGrupo));
        actividadNegocio.setNombre(nombreActividad);
        actividadNegocio.setFecha(fechaActividad);
        actividadNegocio.setDescripcion(descripcionActividad);

        String respuesta = "no se he creado la actividad";
        try {
            respuesta = "se ha creado la actividad de uid: " + String.valueOf(actividadNegocio.crearActividad(actividadNegocio, grupoNegocio)) + " del grupo de uid: " + grupoNegocio.getUid();
        } catch (Exception e) {
        }
        request.setAttribute("resultado", respuesta);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
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
