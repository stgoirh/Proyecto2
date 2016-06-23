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

public class Visto_Act {
	public Visto_Act() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_VISTO_ACT_ACTIVIDADU) {
			this.actividadu = (orm.Actividad) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_VISTO_ACT_CONTACTOU) {
			this.contactou = (orm.Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid;
	
	private String visto;
	
	private orm.Actividad actividadu;
	
	private orm.Contacto contactou;
	
	private void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setVisto(String value) {
		this.visto = value;
	}
	
	public String getVisto() {
		return visto;
	}
	
	public void setActividadu(orm.Actividad value) {
		if (actividadu != null) {
			actividadu.visto_Act.remove(this);
		}
		if (value != null) {
			value.visto_Act.add(this);
		}
	}
	
	public orm.Actividad getActividadu() {
		return actividadu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Actividadu(orm.Actividad value) {
		this.actividadu = value;
	}
	
	private orm.Actividad getORM_Actividadu() {
		return actividadu;
	}
	
	public void setContactou(orm.Contacto value) {
		if (contactou != null) {
			contactou.visto_Act.remove(this);
		}
		if (value != null) {
			value.visto_Act.add(this);
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
