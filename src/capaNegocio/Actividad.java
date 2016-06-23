package capaNegocio;

public class Actividad {

	private int uid;
	private String fecha;
	private String nombre;
	private String descripcion;
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

}