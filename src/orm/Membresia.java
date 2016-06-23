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

public class Membresia {
	public Membresia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_MEMBRESIA_GRUPOSU) {
			this.gruposu = (orm.Grupos) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_MEMBRESIA_CONTACTOU) {
			this.contactou = (orm.Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid;
	
	private orm.Contacto contactou;
	
	private orm.Grupos gruposu;
	
	private void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setGruposu(orm.Grupos value) {
		if (gruposu != null) {
			gruposu.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
		}
	}
	
	public orm.Grupos getGruposu() {
		return gruposu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Gruposu(orm.Grupos value) {
		this.gruposu = value;
	}
	
	private orm.Grupos getORM_Gruposu() {
		return gruposu;
	}
	
	public void setContactou(orm.Contacto value) {
		if (contactou != null) {
			contactou.membresia.remove(this);
		}
		if (value != null) {
			value.membresia.add(this);
		}
	}
	
	public orm.Contacto getContactou() {
		return contactou;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Contactou(orm.Contacto value) {
		this.contactou = value;
	}
	
	private orm.Contacto getORM_Contactou() {
		return contactou;
	}
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}
