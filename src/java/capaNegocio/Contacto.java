package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Contacto {

    private int uid;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private String imagen;
    private String ciudad;
    private String Organizacion;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

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

    public String getApellido() {
        return this.apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return this.mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return this.telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    /**
     *
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOrganizacion() {
        return this.Organizacion;
    }

    /**
     *
     * @param organizacion
     */
    public void setOrganizacion(String organizacion) {
        this.Organizacion = organizacion;
    }

    /**
     * agrega un contacto a la base de datos, recibe de parámetro un contacto de
     * la capaNegocio
     *
     * @param contacto
     * @return retorna el uid del contacto es de tipo int
     * @throws org.orm.PersistentException
     */
    public int agregarContactoCapaNegocio(Contacto contacto) throws PersistentException {

        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();

        try {
            orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
            lormContacto.setApellido(contacto.getApellido());
            lormContacto.setNombre(contacto.getNombre());
            lormContacto.setMail(contacto.getMail());
            lormContacto.setTelefono(contacto.getTelefono());
            lormContacto.setCiudad(contacto.getCiudad());
            lormContacto.setOrganizacion(contacto.getOrganizacion());
            lormContacto.setImagen(contacto.getImagen());
            orm.ContactoDAO.save(lormContacto);
            //orm.ContactoDAO.refresh(lormContacto);
            t.commit();
            respuesta = lormContacto.getUid();

        } catch (Exception e) {
            t.rollback();
        }

        return respuesta;
    }

    /**
     * obtiene los contactos existentes de la base de datos y los almacena en
     * una lista
     *
     * @return retorna una lista de tipo capaNegocio.Contacto
     * @throws org.orm.PersistentException
     */
    public List<Contacto> getContactos() throws PersistentException {

        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> ListaOrm = new ArrayList<orm.Contacto>();
        ListaOrm = orm.ContactoDAO.queryContacto(null, null);
        for (int i = 0; i < ListaOrm.size(); i++) {
            Contacto contacto = new Contacto();
            contacto.setApellido(ListaOrm.get(i).getApellido());
            contacto.setCiudad(ListaOrm.get(i).getCiudad());
            contacto.setMail(ListaOrm.get(i).getMail());
            contacto.setNombre(ListaOrm.get(i).getNombre());
            contacto.setOrganizacion(ListaOrm.get(i).getOrganizacion());
            contacto.setTelefono(ListaOrm.get(i).getTelefono());
            contacto.setUid(ListaOrm.get(i).getUid());
            contacto.setImagen(ListaOrm.get(i).getImagen());
            listaContacto.add(contacto);
        }
        return listaContacto;

    }

    /**
     * elimina un contacto de la base de datos, recibe como parámetro un
     * contacto de capaNegocio.Contacto este debe contener un uid para poder
     * eliminar un contacto exitosamente
     *
     * @param contacto
     * @return retorna el uid del contacto eliminado es de tipo int
     * @throws org.orm.PersistentException
     */
    public int eliminarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid());
            orm.ContactoDAO.delete(lormContacto);
            t.commit();
            respuesta = lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * edita un contacto de la base de datos recibe como parámetro un contacto
     * de la capaNegocio que contiene los atributos a editar
     *
     * @param contacto
     * @return retorna la uid del contacto editado es de tipo int
     * @throws org.orm.PersistentException
     */
    public int editarContactoCapanegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid());
            if (contacto.getApellido().equalsIgnoreCase("")) {
            } else {
                lormContacto.setApellido(contacto.getApellido());
            }
            if (contacto.getNombre().equalsIgnoreCase("")) {
            } else {
                lormContacto.setNombre(contacto.getNombre());
            }
            if (contacto.getTelefono().equalsIgnoreCase("")) {
            } else {
                lormContacto.setTelefono(contacto.getTelefono());
            }
            if (contacto.getMail().equalsIgnoreCase("")) {
            } else {
                lormContacto.setMail(contacto.getMail());
            }
            if (contacto.getOrganizacion().equalsIgnoreCase("")) {
            } else {
                lormContacto.setOrganizacion(contacto.getOrganizacion());
            }
            if (contacto.getCiudad().equalsIgnoreCase("")) {
            } else {
                lormContacto.setCiudad(contacto.getCiudad());
            }
            if (contacto.getImagen().equalsIgnoreCase("")) {
            } else {
                lormContacto.setImagen(contacto.getImagen());
            }
            orm.ContactoDAO.save(lormContacto);
            t.commit();
            respuesta = lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     * busca los atributos de un contacto en la base de datos, recibe un string
     * que sirve de busqueda y retorna lista una que contiene todos los
     * contactos encontrados
     *
     * @param busqueda
     * @return retorna una lista de tipo capaNegocio.Contacto
     * @throws org.orm.PersistentException
     */
    public List<Contacto> busquedaSimpleContacto(String busqueda) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || !busqueda.equals("")) {
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.nombre='" + busqueda + "'or Contacto.apellido='"
                    + busqueda + "' or Contacto.telefono='" + busqueda + "' or Contacto.mail='" + busqueda + "' or Contacto.ciudad='"
                    + busqueda + "' or Contacto.organizacion='" + busqueda + "' ", null);
        }

        if (listaContactos != null) {
            for (orm.Contacto contactoOrm : listaContactos) {
                Contacto contactoNegocio = new Contacto();

                contactoNegocio.setUid(contactoOrm.getUid());
                contactoNegocio.setNombre(contactoOrm.getNombre());
                contactoNegocio.setApellido(contactoOrm.getApellido());
                contactoNegocio.setTelefono(contactoOrm.getTelefono());
                contactoNegocio.setMail(contactoOrm.getMail());
                contactoNegocio.setCiudad(contactoOrm.getCiudad());
                contactoNegocio.setOrganizacion(contactoOrm.getOrganizacion());
                contactoNegocio.setImagen(contactoOrm.getImagen());
                listaContacto.add(contactoNegocio);
            }
        }

        return listaContacto;

    }

    /**
     * busca a un contacto especifico en la base de datos, recibe un contacto de
     * la capaNegocio que contiene los parámetros de busqueda retorna una lista
     * con todos los contactos encontrados
     *
     * @param contacto
     * @return retorna una lista de tipo capaNegocio.Contacto
     * @throws org.orm.PersistentException
     */
    public List<Contacto> busquedaAvanzadaContacto(Contacto contacto) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        String query = "";
        if (contacto.getNombre() != null && !contacto.getNombre().equals("")) {
            query += "Contacto.nombre='" + contacto.getNombre() + "' ";
        }
        if ((contacto.getNombre() != null && !contacto.getNombre().equals("")) && (contacto.getApellido() != null && !contacto.getApellido().equals(""))) {
            query += "and ";
        }
        if ((contacto.getApellido() != null && !contacto.getApellido().trim().equals(""))) {
            query += "Contacto.apellido='" + contacto.getApellido() + "' ";

        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals(""))
                && (contacto.getTelefono() != null && !contacto.getTelefono().trim().equals(""))) {
            query += "and ";
        }
        if (contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("")) {
            query += "Contacto.telefono='" + contacto.getTelefono() + "' ";

        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("")) && contacto.getMail() != null && !contacto.getMail().trim().equals("")) {
            query += "and ";
        }
        if (contacto.getMail() != null && !contacto.getMail().trim().equals("")) {
            query += "Contacto.mail='" + contacto.getMail() + "'";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("") || contacto.getMail() != null && !contacto.getMail().trim().equals(""))
                && (contacto.getCiudad() != null && !contacto.getCiudad().trim().equals(""))) {
            query += "and ";
        }
        if (contacto.getCiudad() != null && !contacto.getCiudad().trim().equals("")) {
            query += "Contacto.ciudad='" + contacto.getCiudad() + "'";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("") || contacto.getMail() != null && !contacto.getMail().trim().equals("")
                || contacto.getCiudad() != null && !contacto.getCiudad().trim().equals("")) && (contacto.getOrganizacion() != null && !contacto.getOrganizacion().trim().equals(""))) {

            query += "and ";
        }
        if (contacto.getOrganizacion() != null && !contacto.getOrganizacion().trim().equals("")) {
            query += "Contacto.organizacion='" + contacto.getOrganizacion() + "'";
        }
        listaContactos = orm.ContactoDAO.queryContacto(query, null);
        if (listaContactos != null) {
            for (orm.Contacto contactoOrm : listaContactos) {
                Contacto contactoNegocio = new Contacto();

                contactoNegocio.setUid(contactoOrm.getUid());
                contactoNegocio.setNombre(contactoOrm.getNombre());
                contactoNegocio.setApellido(contactoOrm.getApellido());
                contactoNegocio.setTelefono(contactoOrm.getTelefono());
                contactoNegocio.setMail(contactoOrm.getMail());
                contactoNegocio.setCiudad(contactoOrm.getCiudad());
                contactoNegocio.setOrganizacion(contactoOrm.getOrganizacion());
                contactoNegocio.setImagen(contactoOrm.getImagen());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;

    }

    /**
     * busca los grupos de un contacto, recibe como parámetro un contacto con la
     * uid del contacto deseado, retorna una lista con todos los Grupos del
     * contacto
     *
     * @param contacto
     * @return lista de tipo capaNegocio.Grupo
     * @throws org.orm.PersistentException
     */
    public List<Grupo> busquedaGruposContacto(Contacto contacto) throws PersistentException {
        List<Grupo> listGrupo = new ArrayList<Grupo>();
        List<orm.Membresia> membresia = orm.MembresiaDAO.queryMembresia(null, null);

        for (int i = 0; i < membresia.size(); i++) {
            if (contacto.getUid() == membresia.get(i).getContactou().getUid()) {
                Grupo grupo = new Grupo();
                grupo.setUid(membresia.get(i).getGruposu().getUid());
                grupo.setNombre(membresia.get(i).getGruposu().getNombre());
                grupo.setDescripcion(membresia.get(i).getGruposu().getDescripcion());
                grupo.setFechaCreacion(membresia.get(i).getGruposu().getFechaCreacion());
                listGrupo.add(grupo);
            }
        }

        return listGrupo;

    }

    /**
     *
     * @param contacto
     * @return
     * @throws org.orm.PersistentException
     */
    public List<Grupo> getGruposDisponibles(Contacto contacto) throws PersistentException {
        List<Grupo> listaGrupo = new ArrayList<Grupo>();
        List<Grupo> list = contacto.busquedaGruposContacto(contacto);
        Grupo grupo = new Grupo();
        List<Grupo> listaGetGrupo = grupo.getGrupos();

        for (int i = 0; i < listaGetGrupo.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (listaGetGrupo.get(i).getUid() != list.get(j).getUid()) {
                    Grupo grupoNuevo = new Grupo();
                    grupoNuevo.setNombre(listaGetGrupo.get(i).getNombre());
                    grupoNuevo.setDescripcion(listaGetGrupo.get(i).getDescripcion());
                    grupoNuevo.setFechaCreacion(listaGetGrupo.get(i).getFechaCreacion());
                    grupoNuevo.setUid(listaGetGrupo.get(i).getUid());
                    listaGrupo.add(grupoNuevo);
                }
            }
        }
        return listaGrupo;
    }
}
