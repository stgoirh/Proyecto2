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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ActividadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	public final StringExpression fecha;
	public final StringExpression descripcion;
	public final CollectionExpression visto_Act;
	
	public ActividadDetachedCriteria() {
		super(orm.Actividad.class, orm.ActividadCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		visto_Act = new CollectionExpression("ORM_Visto_Act", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ActividadCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		visto_Act = new CollectionExpression("ORM_Visto_Act", this.getDetachedCriteria());
	}
	
	public GruposDetachedCriteria createGruposuCriteria() {
		return new GruposDetachedCriteria(createCriteria("gruposu"));
	}
	
	public Visto_ActDetachedCriteria createVisto_ActCriteria() {
		return new Visto_ActDetachedCriteria(createCriteria("ORM_Visto_Act"));
	}
	
	public Actividad uniqueActividad(PersistentSession session) {
		return (Actividad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Actividad[] listActividad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

