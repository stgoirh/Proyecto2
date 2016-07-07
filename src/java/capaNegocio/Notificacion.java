package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Notificacion {

    private int uid;
    private String fecha;
    private String mensaje;
    private int uid_grupo;

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
    public String getFecha() {
        return this.fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public String getMensaje() {
        return this.mensaje;
    }

    /**
     *
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     *
     * @return
     */
    public int getUid_grupo() {
        return this.uid_grupo;
    }

    /**
     *
     * @param uid_grupo
     */
    public void setUid_grupo(int uid_grupo) {
        this.uid_grupo = uid_grupo;
    }

    /**
     * agrega una notificacion en la base de datos, esta relacionada a un grupo
     * que obtiene mediante el parametro grupo, los atributos de la notificacion
     * se obtienen del parametro notificacion
     *
     * @param notificacion
     * @param grupo
     * @return
     * @throws org.orm.PersistentException
     */
    public int crearNotificacion(Notificacion notificacion, Grupo grupo) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Notificacion lormNotificacion = orm.NotificacionDAO.createNotificacion();
            orm.Grupos lormGrupos = orm.GruposDAO.loadGruposByORMID(grupo.getUid());

            lormNotificacion.setFecha(notificacion.getFecha());
            lormNotificacion.setMensaje(notificacion.getMensaje());
            lormNotificacion.setGruposu(lormGrupos);
            orm.NotificacionDAO.save(lormNotificacion);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * crea una lista de los usuarios que vieron la notificacion, recibe la uid
     * desde el parametro noti
     *
     * @param noti
     * @return
     */
    public List<Contacto> vistoNotificacion(Notificacion noti) {
        List<Contacto> lista = new ArrayList<Contacto>();
        try {
            List<orm.Visto_Not> ormVisto = orm.Visto_NotDAO.queryVisto_Not(null, null);
            for (int i = 0; i < ormVisto.size(); i++) {
                if (ormVisto.get(i).getNotificacionu().getUid() == noti.getUid()) {
                    orm.Contacto contacto = orm.ContactoDAO.loadContactoByORMID(ormVisto.get(i).getContactou().getUid());
                    capaNegocio.Contacto con = new capaNegocio.Contacto();
                    con.setNombre(contacto.getNombre());
                    con.setApellido(contacto.getApellido());
                    con.setCiudad(contacto.getCiudad());
                    con.setMail(contacto.getMail());
                    con.setOrganizacion(contacto.getOrganizacion());
                    con.setTelefono(contacto.getTelefono());
                    con.setImagen(contacto.getImagen());
                    con.setUid(contacto.getUid());
                    lista.add(con);
                }
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Notificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
