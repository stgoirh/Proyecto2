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
import javax.persistence.PersistenceException;
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
@WebServlet(name = "ServletAgregarContacto", urlPatterns = {"/AgregarContacto"})
public class ServletAgregarContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("agregarContacto.jsp");
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
        String nombre = request.getParameter("nombreContacto");
        String apellidoContacto = request.getParameter("apellidoContacto");
        String telefonoContacto = request.getParameter("telefonoContacto");
        String mailContacto = request.getParameter("mailContacto");
        String nombreOrganizacion = request.getParameter("nombreOrganizacion");
        String nombreCiudad = request.getParameter("nombreCiudad");
        String imagenContacto=request.getParameter("imagenContacto");
        
        Contacto contactoNegocio = new Contacto();
        contactoNegocio.setCiudad(nombreCiudad);
        contactoNegocio.setOrganizacion(nombreOrganizacion);
        contactoNegocio.setNombre(nombre);
        contactoNegocio.setApellido(apellidoContacto);
        contactoNegocio.setTelefono(telefonoContacto);
        contactoNegocio.setMail(mailContacto);
        if(imagenContacto==null || imagenContacto.equals("")){
            contactoNegocio.setImagen("imagenes/sinFoto.png");
        }else{
            contactoNegocio.setImagen(imagenContacto);
        }
        
        String  resultado="No se pudo almacenar el contacto";
        try {
            resultado ="Contacto almacenado, su uid es:" + String.valueOf( contactoNegocio.agregarContactoCapaNegocio(contactoNegocio));
        } catch (PersistenceException ex) {
            Logger.getLogger(ServletAgregarContacto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PersistentException ex) {
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
