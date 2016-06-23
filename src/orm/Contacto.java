/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Contacto {
	public Contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_VISTO_ACT) {
			return ORM_visto_Act;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_VISTO_NOT) {
			return ORM_visto_Not;
		}
		else if (key == orm.ORMConstants.KEY_CONTACTO_MEMBRESIA) {
			return ORM_membresia;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid;
	
	private String nombre;
	
	private String apellido;
	
	private String mail;
	
	private String telefono;
	
	private String ciudad;
	
	private String organizacion;
	
	private String imagen;
	
	private java.util.Set ORM_visto_Act = new java.util.HashSet();
	
	private java.util.Set ORM_visto_Not = new java.util.HashSet();
	
	private java.util.Set ORM_membresia = new java.util.HashSet();
	
	private void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setMail(String value) {
		this.mail = value;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public void setOrganizacion(String value) {
		this.organizacion = value;
	}
	
	public String getOrganizacion() {
		return organizacion;
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	private void setORM_Visto_Act(java.util.Set value) {
		this.ORM_visto_Act = value;
	}
	
	private java.util.Set getORM_Visto_Act() {
		return ORM_visto_Act;
	}
	
	public final orm.Visto_ActSetCollection visto_Act = new orm.Visto_ActSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_VISTO_ACT, orm.ORMConstants.KEY_VISTO_ACT_CONTACTOU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Visto_Not(java.util.Set value) {
		this.ORM_visto_Not = value;
	}
	
	private java.util.Set getORM_Visto_Not() {
		return ORM_visto_Not;
	}
	
	public final orm.Visto_NotSetCollection visto_Not = new orm.Visto_NotSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_VISTO_NOT, orm.ORMConstants.KEY_VISTO_NOT_CONTACTOU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Membresia(java.util.Set value) {
		this.ORM_membresia = value;
	}
	
	private java.util.Set getORM_Membresia() {
		return ORM_membresia;
	}
	
	public final orm.MembresiaSetCollection membresia = new orm.MembresiaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_CONTACTO_MEMBRESIA, orm.ORMConstants.KEY_MEMBRESIA_CONTACTOU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}
