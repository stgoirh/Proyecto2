package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Actividad {

    private int uid;
    private String fecha;
    private String descripcion;
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
     * @param contacto
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
     * agrega una actividad a la base de datos, esta relacionada a un grupo por
     * el parámetro uid_grupo
     *
     * @param actividad
     * @return retorna la uid de la actividad
     * @throws org.orm.PersistentException
     */
    public int crearActividad(Actividad actividad) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
            orm.Grupos lormGrupo = orm.GruposDAO.loadGruposByORMID(getUid_grupo());

            lormActividad.setFecha(actividad.getFecha());
            lormActividad.setDescripcion(actividad.getDescripcion());
            lormActividad.setGruposu(lormGrupo);
            orm.ActividadDAO.save(lormActividad);
            t.commit();
            respuesta = lormActividad.getUid();

        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * recibe como parámetro una actividad y entrega una lista con los contactos
     * que vieron esta actividad
     *
     * @param actividad
     * @return retorna una lista de tipo capaNegocio.Contacto
     */
    public List<capaNegocio.Contacto> getVisto(Actividad actividad) {

        List<capaNegocio.Contacto> lista = new ArrayList<Contacto>();
        try {
            List<orm.Visto_Act> ormVisto = orm.Visto_ActDAO.queryVisto_Act(null, null);

            for (int i = 0; i < ormVisto.size(); i++) {
                if (ormVisto.get(i).getActividadu().getUid() == actividad.getUid()) {
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
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
