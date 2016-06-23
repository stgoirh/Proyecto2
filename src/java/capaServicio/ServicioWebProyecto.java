/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaServicio;
// empresa = organizacion

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import capaNegocio.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.*;

/**
 *
 * @author John Titor
 */
@WebService(serviceName = "ServicioWebProyecto")
public class ServicioWebProyecto {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombreContacto") String nombreContacto, @WebParam(name = "apellidoContacto") String apellidoContacto, @WebParam(name = "telefonoContacto") String telefonoContacto, @WebParam(name = "mailContacto") String mailContacto, @WebParam(name = "organizacionContacto") String organizacionContacto, @WebParam(name = "ciudadContacto") String ciudadContacto, @WebParam(name = "ImagenContacto") String ImagenContacto) {
        String respuesta = "no se pudo almacenar el contacto";
        Contacto contacto = new Contacto();
        contacto.setApellido(apellidoContacto);
        contacto.setNombre(nombreContacto);
        contacto.setMail(mailContacto);
        contacto.setTelefono(telefonoContacto);
        contacto.setCiudad(ciudadContacto);
        contacto.setOrganizacion(organizacionContacto);
        contacto.setImagen(ImagenContacto);
        try {
            int resultado = contacto.agregarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                respuesta = "creación del contacto exitosa, su uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarContactoServicioWeb")
    public String editarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "nuevoNombreContacto") String nuevoNombreContacto, @WebParam(name = "nuevoApellidoContacto") String nuevoApellidoContacto, @WebParam(name = "nuevoTelefonoContacto") String nuevoTelefonoContacto, @WebParam(name = "nuevoMailContacto") String nuevoMailContacto, @WebParam(name = "nuevoCiudadContacto") String nuevoCiudadContacto, @WebParam(name = "nuevoOrganizacionContacto") String nuevoOrganizacionContacto, @WebParam(name = "nuevoImagenContacto") String nuevoImagenContacto) {
        String respuesta = "no se ha editado el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        contacto.setApellido(nuevoApellidoContacto);
        contacto.setNombre(nuevoNombreContacto);
        contacto.setMail(nuevoMailContacto);
        contacto.setTelefono(nuevoMailContacto);
        contacto.setCiudad(nuevoCiudadContacto);
        contacto.setOrganizacion(nuevoOrganizacionContacto);
        contacto.setImagen(nuevoImagenContacto);
        try {
            int resultado = contacto.editarContactoCapanegocio(contacto);
            if (resultado != 0) {
                respuesta = "se ha modificado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarContactoServicioWeb")
    public String eliminarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto) {
        String respuesta = "no se ha podido eliminar el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        try {
            int resultado = contacto.eliminarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                respuesta = "se ha eliminado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarGrupoServicioWeb")
    public String agregarGrupoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        String respuesta = "no se ha podido agregar el grupo";
        Grupo grupo = new Grupo();        
        Membresia membresia = new Membresia();
                
        grupo.setNombre(nombre);
        grupo.setDescripcion(descripcion);
        
        membresia.setContacto_id(uidContacto);
        
        
        try {
            int resultado = grupo.agregarGrupoCapaNegocio(grupo);
            membresia.setGrupo_id(resultado);
            int resultadoMembresia = membresia.crearMembresia(membresia);
            if (resultado != 0) {
                respuesta = "creación del grupo exitosa su uid es: " + resultado + " y se le ha asignado el contacto de uid: "+resultadoMembresia;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarGrupoServicioWeb")
    public String editarGrupoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo, @WebParam(name = "nuevoNombre") String nuevoNombre, @WebParam(name = "nuevoDescripcion") String nuevoDescripcion) {
        String respuesta = "no se ha podido editar el grupo";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        grupo.setNombre(nuevoNombre);
        grupo.setDescripcion(nuevoDescripcion);
        try {
            int resultado = grupo.editarGrupoCapanegocio(grupo);
            if (resultado != 0) {
                respuesta = "se ha editado el grupo cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarGrupoServicioWeb")
    public String eliminarGrupoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo) {
        String respuesta = "no se ha podido elimar el grupo";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        try {
            int resultado = grupo.eliminarGrupoCapaNegocio(grupo);
            if (resultado != 0) {
                respuesta = "se ha eliminado el grupo cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarMiembrosDeGrupo")
    public String buscarMiembrosDeGrupo(@WebParam(name = "uidGrupo") int uidGrupo) {
        String listaResultado="";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();        
        lista = grupo.busquedaMiembros(grupo);
        listaResultado=gson.toJson(lista);
        return listaResultado;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaSimpleContactoServicioWeb")
    public String busquedaSimpleContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        String listaResultado = "";
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();
        try {
            Contacto contacto = new Contacto();
            lista = contacto.busquedaSimpleContacto(textoBusqueda);
            listaResultado = gson.toJson(lista);
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaAvanzadaContactoServicioWeb")
    public String busquedaAvanzadaContactoServicioWeb(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido,
            @WebParam(name = "telefono") String telefono, @WebParam(name = "mail") String mail, @WebParam(name = "organizacion") String organizacion, @WebParam(name = "ciudad") String ciudad) {
        String listaResultado = "";
        List<capaNegocio.Contacto> lista = new ArrayList<capaNegocio.Contacto>();
        capaNegocio.Contacto contacto = new capaNegocio.Contacto();
        if (apellido != null) {
            contacto.setApellido(apellido);
        } else {
            contacto.setApellido("");
        }
        if (nombre != null) {
            contacto.setNombre(nombre);
        } else {
            contacto.setNombre("");
        }
        if (telefono != null) {
            contacto.setTelefono(telefono);
        } else {
            contacto.setTelefono("");
        }
        if (mail != null) {
            contacto.setMail(mail);
        } else {
            contacto.setMail("");
        }
        if (organizacion != null) {
            contacto.setOrganizacion(organizacion);
        } else {
            contacto.setOrganizacion("");
        }
        if (ciudad != null) {
            contacto.setCiudad(ciudad);
        } else {
            contacto.setOrganizacion("");
        }
        Gson gson = new GsonBuilder().create();
        try {
            lista = contacto.busquedaAvanzadaContacto(contacto);
            listaResultado = gson.toJson(lista);
        } catch (PersistentException ex) {
            listaResultado = null;
        }
        return listaResultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarContactoToGrupo")
    public String agregarContactoToGrupo(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "uidGrupo") int uidGrupo) {
        String respuesta = "no se pudo agregar contacto a grupo";
        
        Membresia membresia = new Membresia();
        membresia.setContacto_id(uidContacto);
        membresia.setGrupo_id(uidGrupo);                

        try {
            int resultado = membresia.crearMembresia(membresia);
            if (resultado != 0) {
                respuesta = "se ha creado la membresia de uid: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(ServicioWebProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
}
