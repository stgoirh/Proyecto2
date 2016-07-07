package capaNegocio;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author John Titor 
 */
public class Membresia {

    private int uid;
    private int contacto_id;
    private int grupo_id;

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
     * @return
     */
    public int getGrupo_id() {
        return this.grupo_id;
    }

    /**
     *
     * @param grupo_id
     */
    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }

    /**
     * crea una membresia, recibe el grupo y contacto desde el parametro membresia
     * los respectivos atributos son grupo_id y contacto_id
     * 
     * @param membresia
     * @return retorna la uid de la membresia
     * @throws org.orm.PersistentException
     */
    public int crearMembresia(Membresia membresia) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();

        try {
            orm.Membresia membresiaOrm = orm.MembresiaDAO.createMembresia();
            orm.Contacto contacto = orm.ContactoDAO.loadContactoByORMID(membresia.getContacto_id());
            orm.Grupos grupo = orm.GruposDAO.loadGruposByORMID(membresia.getGrupo_id());
            membresiaOrm.setContactou(contacto);
            membresiaOrm.setGruposu(grupo);
            orm.MembresiaDAO.save(membresiaOrm);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }
}
