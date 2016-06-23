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

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	public final StringExpression fecha;
	public final StringExpression mensaje;
	public final CollectionExpression visto_Not;
	
	public NotificacionDetachedCriteria() {
		super(orm.Notificacion.class, orm.NotificacionCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		visto_Not = new CollectionExpression("ORM_Visto_Not", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.NotificacionCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		visto_Not = new CollectionExpression("ORM_Visto_Not", this.getDetachedCriteria());
	}
	
	public GruposDetachedCriteria createGruposuCriteria() {
		return new GruposDetachedCriteria(createCriteria("gruposu"));
	}
	
	public Visto_NotDetachedCriteria createVisto_NotCriteria() {
		return new Visto_NotDetachedCriteria(createCriteria("ORM_Visto_Not"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

