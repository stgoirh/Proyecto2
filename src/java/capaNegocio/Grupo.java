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

    public String getFechaCreacion() {
        return this.fechaCreacion;
    }

    /**
     *
     * @param fecgaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     *
     * @param grupo
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
     *
     * @param grupo
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
     *
     * @param grupo
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
     *
     * @param grupo
     */
    public List<Grupo> busquedaAvanzadaGrupo(Grupo grupo) throws PersistentException {
        // TODO - implement Grupo.busquedaAvanzadaGrupo
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param grupo
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
     *
     * @param grupo
     */
    public List<Contacto> busquedaMiembros(Grupo grupo) {
        // TODO - implement Grupo.busquedaMiembros
        throw new UnsupportedOperationException();
    }

}
