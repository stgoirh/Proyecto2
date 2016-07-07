package capaNegocio;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Notificacion_leida {

    private int uid;
    private String visto;
    private int notificacion_id;
    private int contacto_id;

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
    public String getVisto() {
        return this.visto;
    }

    /**
     *
     * @param visto
     */
    public void setVisto(String visto) {
        this.visto = visto;
    }

    public int getNotificacion_id() {
        return this.notificacion_id;
    }

    /**
     *
     * @param notificacion_id
     */
    public void setNotificacion_id(int notificacion_id) {
        this.notificacion_id = notificacion_id;
    }
    /**
     *
     * @return 
     */
    public int getContacto_id() {
        return this.contacto_id;
    }

    /**
     *
     * @param contacto_id
     */
    public void setContacto_id(int contacto_id) {
        this.contacto_id = contacto_id;
    }
    /**
     * crea un visto en la base de datos, para saber si el usuario vio la notificacion
     * recibe la uid del usuario desde el parámetro noti
     * 
     * @param noti
     */
    public void crearVistoNotificacion(Notificacion_leida noti) {
        try {
            PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();

            orm.Visto_Not ormVisto = orm.Visto_NotDAO.createVisto_Not();
            orm.Notificacion ormNotificacion = orm.NotificacionDAO.loadNotificacionByORMID(noti.getNotificacion_id());
            orm.Contacto ormContacto = orm.ContactoDAO.loadContactoByORMID(noti.getContacto_id());
            ormVisto.setORM_Contactou(ormContacto);
            ormVisto.setORM_Notificacionu(ormNotificacion);
            ormVisto.setVisto("Si");
            orm.Visto_NotDAO.save(ormVisto);
            t.commit();
        } catch (PersistentException ex) {
            Logger.getLogger(Notificacion_leida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
