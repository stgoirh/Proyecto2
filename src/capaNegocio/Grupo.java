package capaNegocio;

public class Grupo {

	private int uid;
	private String nombre;
	private String descripcion;
	private String fecgaCreacion;

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

	/**
	 * 
	 * @param grupo
	 */
	public int agregarGrupoCapaNegocio(Grupo grupo) {
		// TODO - implement Grupo.agregarGrupoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public int eliminarGrupoCapaNegocio(Grupo grupo) {
		// TODO - implement Grupo.eliminarGrupoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public int editarGrupoCapanegocio(Grupo grupo) {
		// TODO - implement Grupo.editarGrupoCapanegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo> busquedaAvanzadaGrupo(Grupo grupo) {
		// TODO - implement Grupo.busquedaAvanzadaGrupo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Grupo> busqueaSimpleGrupo(Grupo grupo) {
		// TODO - implement Grupo.busqueaSimpleGrupo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param grupo
	 */
	public List<Contacto> busquedaMiembros(Grupo grupo) {
		// TODO - implement Grupo.busquedaMiembros
		throw new UnsupportedOperationException();
	}

	public String getFecgaCreacion() {
		return this.fecgaCreacion;
	}

	/**
	 * 
	 * @param fecgaCreacion
	 */
	public void setFecgaCreacion(String fecgaCreacion) {
		this.fecgaCreacion = fecgaCreacion;
	}

}