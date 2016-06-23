package capaNegocio;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Notificacion {

    private int uid;
    private String fecha;
    private String mensaje;
    private int uid_grupo;

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

    public void enviarNotificacion() {
        // TODO - implement Notificacion.enviarNotificacion
        throw new UnsupportedOperationException();
    }

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
}
