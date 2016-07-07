/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import capaNegocio.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServletEditarContacto", urlPatterns = {"/EditarContacto"})
public class ServletEditarContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarContacto.jsp");
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
        String uidContacto = request.getParameter("uidContacto");
        String nombreContacto = request.getParameter("newNombre");
        String apellidoContacto = request.getParameter("newApellido");
        String telefonoContacto = request.getParameter("newTelefono");
        String emailContacto = request.getParameter("newEmail");
        String ciudadContacto = request.getParameter("newCiudad");
        String organizacionContacto = request.getParameter("newOrganizacion");
        String imagenContacto = request.getParameter("newImagen");

        Contacto contactoNegocio = new Contacto();
        contactoNegocio.setUid(Integer.parseInt(uidContacto));
        contactoNegocio.setNombre(nombreContacto);
        contactoNegocio.setApellido(apellidoContacto);
        contactoNegocio.setTelefono(telefonoContacto);
        contactoNegocio.setMail(emailContacto);
        contactoNegocio.setCiudad(ciudadContacto);
        contactoNegocio.setOrganizacion(organizacionContacto);
        contactoNegocio.setImagen(imagenContacto);

        String resultado = "No se pudo editar el contacto";

        try {
            resultado = "se ha editado el contacto de uid: "+String.valueOf(contactoNegocio.editarContactoCapanegocio(contactoNegocio));
        } catch (Exception ex) {
            Logger.getLogger(ServletAgregarContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("resultado", resultado);
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
