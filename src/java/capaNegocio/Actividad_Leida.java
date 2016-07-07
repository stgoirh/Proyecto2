package capaNegocio;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad_Leida {

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
     *
     * @param contacto_id
     */

    /**
     * crea un visto en la base de datos, para saber si un contacto vio la
     * actividad recibe los parámetros desde actividad que contiene atributos
     * para relacionar el contacto y la actividad
     *
     * @param actividad
     */
    public void crearVistoActividad(Actividad_Leida actividad) {
        try {
            PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();

            orm.Visto_Act ormVisto = orm.Visto_ActDAO.createVisto_Act();
            orm.Actividad ormActividad = orm.ActividadDAO.loadActividadByORMID(actividad.getNotificacion_id());
            orm.Contacto ormContacto = orm.ContactoDAO.loadContactoByORMID(actividad.getContacto_id());
            ormVisto.setORM_Actividadu(ormActividad);
            ormVisto.setORM_Contactou(ormContacto);
            ormVisto.setActividadu(ormActividad);
            ormVisto.setContactou(ormContacto);
            ormVisto.setVisto("Si");
            orm.Visto_ActDAO.save(ormVisto);
            t.commit();
        } catch (PersistentException ex) {
            Logger.getLogger(Actividad_Leida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
