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

public class NotificacionCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	public final StringExpression fecha;
	public final StringExpression mensaje;
	public final CollectionExpression visto_Not;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		gruposuId = new IntegerExpression("gruposu.uid", this);
		gruposu = new AssociationExpression("gruposu", this);
		fecha = new StringExpression("fecha", this);
		mensaje = new StringExpression("mensaje", this);
		visto_Not = new CollectionExpression("ORM_Visto_Not", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public GruposCriteria createGruposuCriteria() {
		return new GruposCriteria(createCriteria("gruposu"));
	}
	
	public Visto_NotCriteria createVisto_NotCriteria() {
		return new Visto_NotCriteria(createCriteria("ORM_Visto_Not"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

