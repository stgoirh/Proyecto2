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

public class Actividad {
	public Actividad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_VISTO_ACT) {
			return ORM_visto_Act;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_ACTIVIDAD_GRUPOSU) {
			this.gruposu = (orm.Grupos) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid;
	
	private orm.Grupos gruposu;
	
	private String fecha;
	
	private String descripcion;
	
	private java.util.Set ORM_visto_Act = new java.util.HashSet();
	
	private void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setGruposu(orm.Grupos value) {
		if (gruposu != null) {
			gruposu.actividad.remove(this);
		}
		if (value != null) {
			value.actividad.add(this);
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
	
	private void setORM_Visto_Act(java.util.Set value) {
		this.ORM_visto_Act = value;
	}
	
	private java.util.Set getORM_Visto_Act() {
		return ORM_visto_Act;
	}
	
	public final orm.Visto_ActSetCollection visto_Act = new orm.Visto_ActSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ACTIVIDAD_VISTO_ACT, orm.ORMConstants.KEY_VISTO_ACT_ACTIVIDADU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}
