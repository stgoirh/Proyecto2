/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaServicio;

import capaNegocio.Actividad;
import capaNegocio.Contacto;
import capaNegocio.Grupo;
import capaNegocio.Notificacion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.orm.PersistentException;

/**
 *
 * @author Xiterss
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    /**
     * creacion de un nuevo contacto
     * 
     * Web service operation
     * @param nombreContacto nombre del contacto
     * @param apellidoContacto apellido del contacto 
     * @param telefonoContacto telefono del contacto
     * @param mailContacto E-mail del contacto
     * @param imagenContacto imagen del contacto
     * @param organizacionContacto organizacion del contacto
     * @param ciudadContacto ciudad del contacto
     * @return respuesta con uid del contacto o mensaje de error
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombreContacto") String nombreContacto, @WebParam(name = "apellidoContacto") String apellidoContacto, @WebParam(name = "telefonoContacto") String telefonoContacto, @WebParam(name = "mailContacto") String mailContacto, @WebParam(name = "organizacionContacto") String organizacionContacto, @WebParam(name = "ciudadContacto") String ciudadContacto, @WebParam(name = "imagenContacto") String imagenContacto) throws PersistentException {
        String respuesta = "no se pudo almacenar el contacto";
        capaNegocio.Contacto contacto = new capaNegocio.Contacto();
        contacto.setApellido(apellidoContacto);
        contacto.setNombre(nombreContacto);
        contacto.setMail(mailContacto);
        contacto.setTelefono(telefonoContacto);
        contacto.setCiudad(ciudadContacto);
        contacto.setOrganizacion(organizacionContacto);
        contacto.setImagen(imagenContacto);
        int resultado = contacto.agregarContactoCapaNegocio(contacto);
        if (resultado != 0) {
            respuesta = "creación del contacto exitosa, su uid es: " + resultado;
        }
        return respuesta;
    }

    /**
     * edita un contacto especifico
     * 
     * Web service operation
     * @param uidContacto uid del contacto a editar
     * @param nombreContacto nuevo nombre del contacto
     * @param apellidoContacto nuevo nombre del contacto
     * @param organizacionContacto nuevo nombre del contacto
     * @param mailContacto nuevo nombre del contacto
     * @param telefonoContacto nuevo nombre del contacto
     * @param ciudadContacto nuevo nombre del contacto
     * @param imagenContacto nuevo nombre del contacto
     * @return respuesta con uid del contacto o mensaje de error
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "editarContactoServicioWeb")
    public String editarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "nombreContacto") String nombreContacto, @WebParam(name = "apellidoContacto") String apellidoContacto, @WebParam(name = "telefonoContacto") String telefonoContacto, @WebParam(name = "mailContacto") String mailContacto, @WebParam(name = "organizacionContacto") String organizacionContacto, @WebParam(name = "ciudadContacto") String ciudadContacto, @WebParam(name = "imagenContacto") String imagenContacto) throws PersistentException {

        String respuesta = "no se ha editado el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        contacto.setApellido(apellidoContacto);
        contacto.setNombre(nombreContacto);
        contacto.setMail(mailContacto);
        contacto.setTelefono(telefonoContacto);
        contacto.setCiudad(ciudadContacto);
        contacto.setOrganizacion(organizacionContacto);
        contacto.setImagen(imagenContacto);
        int resultado = contacto.editarContactoCapanegocio(contacto);
        if (resultado != 0) {
            respuesta = "se ha modificado el contacto cuyo uid es: " + resultado;
        }
        return respuesta;
    }

    /**
     * elimina un contacto especifico
     * 
     * Web service operation
     * @param uidContacto uid del contacto a borrar
     * @return respuesta con uid del contacto o mensaje de error
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "eliminarContactoServicioWeb")
    public String eliminarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto) throws PersistentException {
        String respuesta = "no se ha podido eliminar el contacto";
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        int resultado = contacto.eliminarContactoCapaNegocio(contacto);
        if (resultado != 0) {
            respuesta = "se ha eliminado el contacto cuyo uid es: " + resultado;
        }
        return respuesta;
    }

    /**
     * creacion de un nuevo grupo
     * 
     * Web service operation
     * @param uidContacto uid del contacto perteneciente al nuevo grupo
     * @param nombre nombre del grupo
     * @param descripcion descripcion del grupo
     * @return mensaje con el uid del grupo o mensaje de error
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "agregarGrupoServicioWeb")
    public String agregarGrupoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) throws PersistentException {

        String respuesta = "no se ha podido agregar el grupo";
        Grupo grupo = new Grupo();
        capaNegocio.Membresia membresia = new capaNegocio.Membresia();

        grupo.setNombre(nombre);
        grupo.setDescripcion(descripcion);

        membresia.setContacto_id(uidContacto);
        int resultado = grupo.agregarGrupoCapaNegocio(grupo);
        if (resultado != 0) {
            respuesta = "creación del grupo exitosa su uid es: " + resultado;
            membresia.setGrupo_id(resultado);
            membresia.crearMembresia(membresia);
        }
        return respuesta;
    }

    /**
     * edita un grupo especifico
     * 
     * Web service operation
     * @param uidGrupo uid del grupo a editar
     * @param nombre nuevo nombre del grupo
     * @param descripcion nueva descripcion del grupo
     * @return mensaje con uid del grupo o mensaje de error
     */
    @WebMethod(operationName = "editarGrupoServicioWeb")
    public String editarGrupoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        String respuesta = "no se ha podido editar el grupo";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        grupo.setNombre(nombre);
        grupo.setDescripcion(descripcion);
        try{
            int resultado = grupo.editarGrupoCapanegocio(grupo);
            if (resultado != 0) {
                respuesta = "se ha editado el grupo cuyo uid es: " + resultado;
            }
            
        }catch(PersistentException ex){
            
        }    
        return respuesta;
    }

    /**
     * elimina un grupo especifico
     * 
     * Web service operation
     * @param uidGrupo uid del grupo a eliminar
     * @return mensaje con el uid del grupo o mensaje de error
     */
    @WebMethod(operationName = "eliminarGrupoServicioWeb")
    public String eliminarGrupoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo) {

        String respuesta = "no se ha podido elimar el grupo";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        try{
            int resultado = grupo.eliminarGrupoCapaNegocio(grupo);
            if (resultado != 0) {
                respuesta = "se ha eliminado el grupo cuyo uid es: " + resultado;
            }
        }catch(PersistentException ex){
            
        }   
        return respuesta;
    }

    /**
     * busca los miembros de un grupo especifico
     * 
     * Web service operation
     * @param uidGrupo uid del grupo deseado
     * @return lista Json que contiene a los miembros del grupo
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "buscarMiembrosDeGrupo")
    public String buscarMiembrosDeGrupo(@WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException {
        String listaResultado = "";
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();
        lista = grupo.busquedaMiembros(grupo);
        listaResultado = gson.toJson(lista);
        return listaResultado;
    }

    /**
     * busqueda de un parámetro
     * 
     * Web service operation
     * @param textoBusqueda texto que se usa para la busqueda
     * @return lista tipo Json que contiene el resultado de la busqueda
     */
    @WebMethod(operationName = "busquedaSimpleContactoServicioWeb")
    public String busquedaSimpleContactoServicioWeb(@WebParam(name = "textoBusqueda") String textoBusqueda){

        String listaResultado = "";
        try {
            
            List<Contacto> lista = new ArrayList<Contacto>();
            Gson gson = new GsonBuilder().create();
            Contacto contacto = new Contacto();
            lista = contacto.busquedaSimpleContacto(textoBusqueda);
            listaResultado = gson.toJson(lista);
            
        } catch (PersistentException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;

    }

    /**
     * busqueda con multiples parámetros
     * 
     * Web service operation
     * @param nombre nombre del contacto buscado
     * @param apellido apellido del contacto buscado
     * @param mail E-mail del contacto buscado
     * @param ciudad ciudad del contacto buscado
     * @param telefono telefono del contacto buscado
     * @param organizacion organizacion del contacto buscado
     * @return lista tipo Json con los resultados de la busqueda
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "busquedaAvanzadaContactoServicioWeb")
    public String busquedaAvanzadaContactoServicioWeb(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono, @WebParam(name = "mail") String mail, @WebParam(name = "organizacion") String organizacion, @WebParam(name = "ciudad") String ciudad) throws PersistentException {

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
        lista = contacto.busquedaAvanzadaContacto(contacto);
        listaResultado = gson.toJson(lista);
        return listaResultado;
    }

    /**
     * agrega un contacto a un grupo
     * 
     * Web service operation
     * @param uidContacto uid del contacto 
     * @param uidGrupo uid del grupo
     * @return mensaje con el uid o mensaje de error
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "agregarContactoToGrupoServicioWeb")
    public String agregarContactoToGrupoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException {
        String respuesta = "no se pudo agregar el contacto al grupo";

        capaNegocio.Membresia membresia = new capaNegocio.Membresia();
        membresia.setContacto_id(uidContacto);
        membresia.setGrupo_id(uidGrupo);
        int resultado = membresia.crearMembresia(membresia);
        if (resultado != 0) {
            respuesta = "se ha agregado al contacto de uid " + uidContacto + " al grupo de uid " + uidGrupo + " exitosamente";
        }

        return respuesta;
    }

    /**
     * entrega una lista con todos los contactos
     * 
     * Web service operation
     * @return lista tipo Json con todos los contactos
     */
    @WebMethod(operationName = "getContactosServicioWeb")
    public String getContactosServicioWeb() {

        String listaRetorno = "";
        try {
            capaNegocio.Contacto contacto = new capaNegocio.Contacto();
            List<capaNegocio.Contacto> lista = contacto.getContactos();
            Gson gson = new GsonBuilder().create();
            listaRetorno = gson.toJson(lista);

        } catch (PersistentException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRetorno;

    }

    /**
     * entrega una lista con todos los grupos
     * 
     * Web service operation
     * @return lista tipo Json con todos los grupos
     */
    @WebMethod(operationName = "getGruposServicioWeb")
    public String getGruposServicioWeb() {

        String listaRetorno = "";
        try {
            capaNegocio.Grupo grupo = new capaNegocio.Grupo();
            List<capaNegocio.Grupo> lista = grupo.getGrupos();

            Gson gson = new GsonBuilder().create();
            listaRetorno = gson.toJson(lista);

        } catch (PersistentException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRetorno;
    }

    /**
     * busca los grupos de un contacto
     * 
     * Web service operation
     * @param uidContacto uid del contacto
     * @return lista tipo Json con los grupos del contacto
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "buscarGruposDeContacto")
    public String buscarGruposDeContacto(@WebParam(name = "uidContacto") int uidContacto) throws PersistentException {
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        List<Grupo> lista = contacto.busquedaGruposContacto(contacto);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;

    }

    /**
     * entrega una lista con los grupos en los que aun no esta el contacto
     * 
     * Web service operation
     * @param uidContacto 
     * @return lista tipo Json con los grupos disponibles
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "gruposDisponibleDeContactoServicioWeb")
    public String gruposDisponibleDeContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto) throws PersistentException {

        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        List<Grupo> lista = contacto.getGruposDisponibles(contacto);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;

    }

    /**
     * crea una actividad de un grupo, requiere descripcion, fecha y un grupo
     * 
     * Web service operation
     * @param uidGrupo uid del grupo al que pertenece la actividad
     * @param descripcion descripcion de la actividad
     * @param fecha fecha de la actividad
     * @return mensaje con la uid del grupo o mensaje de error
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "crearActividadServicioWeb")
    public String crearActividadServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "fecha") String fecha) throws PersistentException {
        String respuesta = "no se ha podido crear la actividad";
        Actividad actividad = new Actividad();
        Grupo grupo = new Grupo();
        actividad.setDescripcion(descripcion);
        actividad.setFecha(fecha);
        actividad.setUid_grupo(uidGrupo);
        int resultado = actividad.crearActividad(actividad);
        if (resultado != 0) {
            respuesta = "se ha creado la actividad para el grupo de uid " + uidGrupo + " exitosamente";
        }

        return respuesta;

    }

    /**
     * crea una notificacion de un grupo requiere mensaje, fecha y uid de grupo
     * 
     * Web service operation
     * @param mensaje mensaje de la actividad
     * @param fecha fecha de la actividad
     * @param uidGrupo uid del grupo al que pertenece la actividad
     * @return 
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "crearNotificacionServicioWeb")
    public String crearNotificacionServicioWeb(@WebParam(name = "mensaje") String mensaje, @WebParam(name = "fecha") String fecha, @WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException {
        String respuesta = "no se pudo crear la notificacion";
        Notificacion notificacion = new Notificacion();
        Grupo grupo = new Grupo();
        notificacion.setFecha(fecha);
        notificacion.setMensaje(mensaje);
        grupo.setUid(uidGrupo);
        int resultado = notificacion.crearNotificacion(notificacion,grupo);
        if (resultado != 0) {
            respuesta = "se ha creado la notificaion para el grupo de uid " + uidGrupo + " exitosamente";
        }
        return respuesta;
    }

    /**
     * entrega una lista con las actividades de un grupo
     * 
     * Web service operation
     * @param uidGrupo uid del grupo que contiene las actividades
     * @return lista tipo Json con las actividades del grupo
     * @throws org.orm.PersistentException 
     */
    @WebMethod(operationName = "getActividadDeGrupo")
    public String getActividadDeGrupo(@WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException {
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        List<Actividad> lista = grupo.getActividad(grupo);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;

    }

    /**
     * entrega una lista de notificaciones de un grupo
     * 
     * Web service operation
     * @param uidGrupo uid del grupo que contiene las notificaciones
     * @return lista tipo Json con las notificaciones del grupo
     * @throws org.orm.PersistentException
     */
    @WebMethod(operationName = "getNotificacionGrupoServicioWeb")
    public String getNotificacionGrupoServicioWeb(@WebParam(name = "uidGrupo") int uidGrupo) throws PersistentException {
        Grupo grupo = new Grupo();
        grupo.setUid(uidGrupo);
        List<Notificacion> lista = grupo.getNotificacion(grupo);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;

    }

    /**
     * crea el visto de una notificacion, requiere uid de contacto
     *
     * @param uidNotificacion uid de la notificacion
     * @param uidContacto uid del contacto
     */
    @WebMethod(operationName = "vistoNotificacionServicioWeb")
    public void vistoNotificacionServicioWeb(@WebParam(name = "uidNotificacions") int uidNotificacion, @WebParam(name = "uidContacto") int uidContacto) {
        capaNegocio.Notificacion_leida visto = new capaNegocio.Notificacion_leida();
        visto.setContacto_id(uidContacto);
        visto.setNotificacion_id(uidNotificacion);
        visto.crearVistoNotificacion(visto);
        
    }

    /**
     * crea el visto de una actividad requiere la uid de un contacto
     * 
     * Web service operation
     * @param uidActividad uid de la actividad
     * @param uidContacto uid del contacto
     * @return retorna un mensaje de verificacion
     */
    @WebMethod(operationName = "vistoActividadServicioWeb")
    public String vistoActividadServicioWeb(@WebParam(name = "uidActividad") int uidActividad, @WebParam(name = "uidContacto") int uidContacto) {
        
        String res="Visto ok";
        capaNegocio.Actividad_Leida visto = new capaNegocio.Actividad_Leida();
        visto.setContacto_id(uidContacto);
        visto.setNotificacion_id(uidActividad);
        visto.crearVistoActividad(visto);
        return res;
    }

    /**
     * entrega una lista con los contactos que vieron una actividad
     * 
     * Web service operation
     * @param uidActividad uid de la actividad
     * @return lista tipo Json con los contactos
     */
    @WebMethod(operationName = "getActividadVisto")
    public String getActividadVisto(@WebParam(name = "uidActividad") int uidActividad) {
        
        capaNegocio.Actividad actividad = new capaNegocio.Actividad();
        actividad.setUid(uidActividad);
        List<capaNegocio.Contacto> lista=actividad.getVisto(actividad);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;
        
    }

    /**
     * entrega una lista con los contactos que vieron una notificacion
     * 
     * Web service operation
     * @param uidNotificacion uid de la notificacion
     * @return lista tipo Json con los contactos
     */
    @WebMethod(operationName = "getVistoNotificacion")
    public String getVistoNotificacion(@WebParam(name = "uidNotificacion") int uidNotificacion) {
        capaNegocio.Notificacion noti= new capaNegocio.Notificacion();
        noti.setUid(uidNotificacion);
        List<capaNegocio.Contacto> lista = noti.vistoNotificacion(noti);
        String listaRetorno = "";
        Gson gson = new GsonBuilder().create();
        listaRetorno = gson.toJson(lista);
        return listaRetorno;
    }
}
