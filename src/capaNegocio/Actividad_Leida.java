package capaNegocio;

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

}