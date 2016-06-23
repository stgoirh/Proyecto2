/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Contacto;
import capaNegocio.Grupo;
import capaNegocio.Membresia;
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
 * @author Xiterss
 */
@WebServlet(name = "ServletAgregarGrupo", urlPatterns = {"/CrearGrupo"})
public class ServletAgregarGrupo extends HttpServlet {

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

        try {
            Contacto contacto = new Contacto();
            List<Contacto> lista = contacto.getContactos();
            request.removeAttribute("lista");
            request.setAttribute("lista", lista);
            RequestDispatcher dispatcher = request.getRequestDispatcher("agregarGrupo.jsp");
            dispatcher.forward(request, response);
        } catch (PersistentException ex) {

        }
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

        try {
            String nombreGrupo = request.getParameter("nombreGrupo");
            String descripcionGrupo = request.getParameter("descripcionGrupo");
            int uidContacto = Integer.parseInt(request.getParameter("select"));

            Grupo grupo = new Grupo();
            grupo.setNombre(nombreGrupo);
            grupo.setDescripcion(descripcionGrupo);
            int uidGrupo = grupo.agregarGrupoCapaNegocio(grupo);
            Membresia membresia = new Membresia();
            membresia.setContacto_id(uidContacto);
            membresia.setGrupo_id(uidGrupo);
            membresia.crearMembresia(membresia);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(ServletAgregarGrupo.class.getName()).log(Level.SEVERE, null, ex);
        }

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
