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
    private String organizacion;

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

    public String getImagen() {
        return this.imagen;
    }

    /**
     *
     * @param imagenes
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
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
        return this.organizacion;
    }

    /**
     *
     * @param organizacion
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    /**
     *
     * @param contacto
     */
    public int agregarContactoCapaNegocio(Contacto contacto)throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
            lormContacto.setApellido(contacto.getApellido());
            lormContacto.setNombre(contacto.getNombre());
            lormContacto.setTelefono(contacto.getTelefono());
            lormContacto.setMail(contacto.getMail());
            lormContacto.setImagen(contacto.getImagen());
            lormContacto.setOrganizacion(contacto.getOrganizacion());
            lormContacto.setCiudad(contacto.getCiudad());
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
     *
     * @param contacto
     */
    public int eliminarContactoCapaNegocio(Contacto contacto)throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid());
            orm.ContactoDAO.delete(lormContacto);
            t.commit();
            return lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     *
     * @param contacto
     */
    public int editarContactoCapanegocio(Contacto contacto)throws PersistentException {
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
     *
     * @param busqueda
     */
    public List<Contacto> busquedaSimpleContacto(String busqueda)throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || busqueda.equals("")) {
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.nombre='" + busqueda + "'or Contacto.apellido='"
            + busqueda+ "' or Contacto.telefono='"+busqueda+"'  or Contacto.mail='"+busqueda+"'or Contacto.ciudad='"+busqueda+
                    "'or Contacto.Organizacion='"+busqueda+"'", null);
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
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     *
     * @param contacto
     */
    public List<Contacto> busquedaAvanzadaContacto(Contacto contacto)throws PersistentException {
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
            query += "Contacto.mail='" + contacto.getMail() + "' ";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("") || contacto.getMail() != null && !contacto.getMail().trim().equals(""))
                && (contacto.getCiudad() != null && !contacto.getCiudad().trim().equals(""))) {
            query += "and ";
        }
        if (contacto.getCiudad() != null && !contacto.getCiudad().trim().equals("")) {
            query += "Contacto.ciudad='" + contacto.getCiudad() + "' ";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("") || contacto.getMail() != null && !contacto.getMail().trim().equals("")
                || contacto.getCiudad() != null && !contacto.getCiudad().trim().equals("")) && (contacto.getOrganizacion() != null && !contacto.getOrganizacion().trim().equals(""))) {

            query += "and ";
        }
        if (contacto.getOrganizacion() != null && !contacto.getOrganizacion().trim().equals("")) {
            query += "Contacto.Organizacion='" + contacto.getOrganizacion() + "' ";
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

                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    /**
     *
     * @param contacto
     */
    public List<Grupo> busquedaGruposContacto(Contacto contacto) {
        // TODO - implement Contacto.busquedaGruposContacto
        throw new UnsupportedOperationException();
    }
    public List<Contacto> getContactos()throws PersistentException{
        List<Contacto> listaContacto= new ArrayList<Contacto>();
        List<orm.Contacto> ListaOrm=new ArrayList<orm.Contacto>();
        ListaOrm=orm.ContactoDAO.queryContacto(null,null);
        for(int i=0;i<ListaOrm.size();i++){
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
}
