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

public class GruposDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final StringExpression fechaCreacion;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	public final CollectionExpression membresia;
	
	public GruposDetachedCriteria() {
		super(orm.Grupos.class, orm.GruposCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaCreacion = new StringExpression("fechaCreacion", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public GruposDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.GruposCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		fechaCreacion = new StringExpression("fechaCreacion", this.getDetachedCriteria());
		actividad = new CollectionExpression("ORM_Actividad", this.getDetachedCriteria());
		notificacion = new CollectionExpression("ORM_Notificacion", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria createActividadCriteria() {
		return new ActividadDetachedCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionDetachedCriteria createNotificacionCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Grupos uniqueGrupos(PersistentSession session) {
		return (Grupos) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Grupos[] listGrupos(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Grupos[]) list.toArray(new Grupos[list.size()]);
	}
}

