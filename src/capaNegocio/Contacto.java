package capaNegocio;

public class Contacto {

	private int uid;
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private String imagenes;
	private String ciudad;
	private String Organizacion;

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

	public String getImagenes() {
		return this.imagenes;
	}

	/**
	 * 
	 * @param imagenes
	 */
	public void setImagenes(String imagenes) {
		this.imagenes = imagenes;
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
		// TODO - implement Contacto.getOrganizacion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param organizacion
	 */
	public void setOrganizacion(String organizacion) {
		// TODO - implement Contacto.setOrganizacion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public int agregarContactoCapaNegocio(Contacto contacto) {
		// TODO - implement Contacto.agregarContactoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public int eliminarContactoCapaNegocio(Contacto contacto) {
		// TODO - implement Contacto.eliminarContactoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public int editarContactoCapanegocio(Contacto contacto) {
		// TODO - implement Contacto.editarContactoCapanegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param busqueda
	 */
	public List<Contacto> busquedaSimpleContacto(String busqueda) {
		// TODO - implement Contacto.busquedaSimpleContacto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public List<Contacto> busquedaAvanzadaContacto(Contacto contacto) {
		// TODO - implement Contacto.busquedaAvanzadaContacto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public List<Grupo> busquedaGruposContacto(Contacto contacto) {
		// TODO - implement Contacto.busquedaGruposContacto
		throw new UnsupportedOperationException();
	}

}