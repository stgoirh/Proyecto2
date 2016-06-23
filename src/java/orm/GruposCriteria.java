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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class GruposCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final StringExpression fechaCreacion;
	public final CollectionExpression actividad;
	public final CollectionExpression notificacion;
	public final CollectionExpression membresia;
	
	public GruposCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		fechaCreacion = new StringExpression("fechaCreacion", this);
		actividad = new CollectionExpression("ORM_Actividad", this);
		notificacion = new CollectionExpression("ORM_Notificacion", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
	}
	
	public GruposCriteria(PersistentSession session) {
		this(session.createCriteria(Grupos.class));
	}
	
	public GruposCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public ActividadCriteria createActividadCriteria() {
		return new ActividadCriteria(createCriteria("ORM_Actividad"));
	}
	
	public NotificacionCriteria createNotificacionCriteria() {
		return new NotificacionCriteria(createCriteria("ORM_Notificacion"));
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Grupos uniqueGrupos() {
		return (Grupos) super.uniqueResult();
	}
	
	public Grupos[] listGrupos() {
		java.util.List list = super.list();
		return (Grupos[]) list.toArray(new Grupos[list.size()]);
	}
}

