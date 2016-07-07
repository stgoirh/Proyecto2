package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Grupo {

    private int uid;
    private String nombre;
    private String descripcion;
    private String fechaCreacion;
    
    /**
     *
     * @return 
     */
    public int getUid() {
        return this.uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }
    /**
     *
     * @return 
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * agrega un grupo a la base de datos recibe los atributos desde el
     * parámetro grupo
     *
     * @param grupo
     * @return retorna el uid del grupo
     * @throws org.orm.PersistentException
     */
    public int agregarGrupoCapaNegocio(Grupo grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupos lormGrupo = orm.GruposDAO.createGrupos();
            lormGrupo.setNombre(grupo.getNombre());
            lormGrupo.setDescripcion(grupo.getDescripcion());
            lormGrupo.setFechaCreacion("23 junio");
            orm.GruposDAO.save(lormGrupo);
            t.commit();
            respuesta = lormGrupo.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * elimina un contacto de la base de datos, el parámetro grupo le entrega el
     * uid del grupo a eliminar
     *
     * @param grupo
     * @return
     * @throws org.orm.PersistentException
     */
    public int eliminarGrupoCapaNegocio(Grupo grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupos lormGrupo = orm.GruposDAO.loadGruposByORMID(grupo.getUid());
            orm.GruposDAO.delete(lormGrupo);
            t.commit();
            return lormGrupo.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * edita un contacto de la base de datos el parámetro grupo le entrega los
     * nuevos atributos y el uid del grupo que se quiere editar
     *
     * @param grupo
     * @return retorna la uid del grupo editado
     * @throws org.orm.PersistentException
     */
    public int editarGrupoCapanegocio(Grupo grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Grupos lormGrupo = orm.GruposDAO.loadGruposByORMID(grupo.getUid());
            if (grupo.getNombre().equalsIgnoreCase("")) {
            } else {
                lormGrupo.setNombre(grupo.getNombre());
            }
            if (grupo.getDescripcion().equalsIgnoreCase("")) {
            } else {
                lormGrupo.setDescripcion(grupo.getDescripcion());
            }
            orm.GruposDAO.save(lormGrupo);
            t.commit();
            respuesta = lormGrupo.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * busca a un grupo mediante el parámetro busqueda
     *
     * @param busqueda
     * @return retorna una lista de tipo capaNegocio.Grupo
     * @throws org.orm.PersistentException
     */
    public List<Grupo> busqueaSimpleGrupo(String busqueda) throws PersistentException {
        List<Grupo> listaGrupo = new ArrayList<Grupo>();
        List<orm.Grupos> listaGrupos = new ArrayList<orm.Grupos>();
        if (busqueda != null || busqueda.equals("")) {
            listaGrupo = orm.GruposDAO.queryGrupos("Grupos.Nombre='" + busqueda, null);
        }
        if (listaGrupos != null) {
            for (orm.Grupos grupoOrm : listaGrupos) {
                Grupo grupoNegocio = new Grupo();

                grupoNegocio.setNombre(grupoOrm.getNombre());
                grupoNegocio.setDescripcion(grupoOrm.getDescripcion());
                listaGrupo.add(grupoNegocio);
            }
        }
        return listaGrupo;
    }

    /**
     * busca los miembros de un grupo y los almacena en una lista recibe el
     * atributo uid desde el parámetro grupo
     *
     * @param grupo
     * @return retorna una lista de tipo capaNegocio.Contacto
     * @throws org.orm.PersistentException
     */
    public List<Contacto> busquedaMiembros(Grupo grupo) throws PersistentException {
        List<orm.Membresia> listaMembresia = new ArrayList<orm.Membresia>();
        listaMembresia = orm.MembresiaDAO.queryMembresia(null, null);
        List<Contacto> listaContacto = new ArrayList<Contacto>();

        if (listaMembresia.size() > 0) {
            for (int i = 0; i < listaMembresia.size(); i++) {
                if (listaMembresia.get(i).getGruposu().getUid() == grupo.getUid()) {
                    Contacto contacto = new Contacto();
                    contacto.setNombre(listaMembresia.get(i).getContactou().getNombre());
                    contacto.setUid(listaMembresia.get(i).getContactou().getUid());
                    listaContacto.add(contacto);
                }
            }
        }
        return listaContacto;
    }

    /**
     * almacena en una lista todos los grupos existentes
     *
     * @return retorna una lista de tipo capaNegocio.Grupo
     * @throws org.orm.PersistentException
     */
    public List<Grupo> getGrupos() throws PersistentException {

        List<Grupo> listaGrupos = new ArrayList<Grupo>();
        List<orm.Grupos> ListaOrm = new ArrayList<orm.Grupos>();
        ListaOrm = orm.GruposDAO.queryGrupos(null, null);

        for (int i = 0; i < ListaOrm.size(); i++) {
            Grupo grupo = new Grupo();
            grupo.setNombre(ListaOrm.get(i).getNombre());
            grupo.setDescripcion(ListaOrm.get(i).getDescripcion());
            grupo.setFechaCreacion(ListaOrm.get(i).getFechaCreacion());
            grupo.setUid(ListaOrm.get(i).getUid());
            //contacto.setApellido_contacto(ListaOrm.get(i).getApellido_contacto());            
            listaGrupos.add(grupo);
        }
        return listaGrupos;

    }

    /**
     * almacena en una lista todas las actividades de un grupo la uid se obtiene
     * del parámetro grupo
     *
     * @param grupo
     * @return retorna una lista de tipo capaNrgocio.Actividad
     * @throws org.orm.PersistentException
     */
    public List<Actividad> getActividad(Grupo grupo) throws PersistentException {

        List<Actividad> listaActividad = new ArrayList<Actividad>();
        List<orm.Actividad> ormActividad = orm.ActividadDAO.queryActividad(null, null);

        for (int i = 0; i < ormActividad.size(); i++) {
            if (ormActividad.get(i).getGruposu().getUid() == grupo.getUid()) {
                Actividad actividadNueva = new Actividad();
                actividadNueva.setUid(ormActividad.get(i).getUid());
                actividadNueva.setDescripcion(ormActividad.get(i).getDescripcion());
                actividadNueva.setFecha(ormActividad.get(i).getFecha());
                listaActividad.add(actividadNueva);
            }
        }

        return listaActividad;
    }

    /**
     * almacena en una lista las notificaciones de un grupo recibe la uid desde
     * el parámetro grupo
     *
     * @param grupo
     * @return retorna una lista de tipo capaNegocio.Notificacion
     * @throws org.orm.PersistentException
     */
    public List<Notificacion> getNotificacion(Grupo grupo) throws PersistentException {

        List<Notificacion> listaNotificaion = new ArrayList<Notificacion>();
        List<orm.Notificacion> ormNotificacion = orm.NotificacionDAO.queryNotificacion(null, null);

        for (int i = 0; i < ormNotificacion.size(); i++) {
            if (ormNotificacion.get(i).getGruposu().getUid() == grupo.getUid()) {
                Notificacion notificacion = new Notificacion();
                notificacion.setUid(ormNotificacion.get(i).getUid());
                notificacion.setFecha(ormNotificacion.get(i).getFecha());
                notificacion.setMensaje(ormNotificacion.get(i).getMensaje());
                listaNotificaion.add(notificacion);
            }
        }
        return listaNotificaion;
    }
}
