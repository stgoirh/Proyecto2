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

public class ActividadCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	public final StringExpression fecha;
	public final StringExpression descripcion;
	public final CollectionExpression visto_Act;
	
	public ActividadCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		gruposuId = new IntegerExpression("gruposu.uid", this);
		gruposu = new AssociationExpression("gruposu", this);
		fecha = new StringExpression("fecha", this);
		descripcion = new StringExpression("descripcion", this);
		visto_Act = new CollectionExpression("ORM_Visto_Act", this);
	}
	
	public ActividadCriteria(PersistentSession session) {
		this(session.createCriteria(Actividad.class));
	}
	
	public ActividadCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public GruposCriteria createGruposuCriteria() {
		return new GruposCriteria(createCriteria("gruposu"));
	}
	
	public Visto_ActCriteria createVisto_ActCriteria() {
		return new Visto_ActCriteria(createCriteria("ORM_Visto_Act"));
	}
	
	public Actividad uniqueActividad() {
		return (Actividad) super.uniqueResult();
	}
	
	public Actividad[] listActividad() {
		java.util.List list = super.list();
		return (Actividad[]) list.toArray(new Actividad[list.size()]);
	}
}

