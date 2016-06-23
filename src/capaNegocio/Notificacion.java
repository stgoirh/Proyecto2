package capaNegocio;

public class Notificacion {

	private int uid;
	private String fecha;
	private String mensaje;
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

	public String getMensaje() {
		return this.mensaje;
	}

	/**
	 * 
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public void enviarNotificacion() {
		// TODO - implement Notificacion.enviarNotificacion
		throw new UnsupportedOperationException();
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