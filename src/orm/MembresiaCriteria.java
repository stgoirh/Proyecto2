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

public class MembresiaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	
	public MembresiaCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		contactouId = new IntegerExpression("contactou.uid", this);
		contactou = new AssociationExpression("contactou", this);
		gruposuId = new IntegerExpression("gruposu.uid", this);
		gruposu = new AssociationExpression("gruposu", this);
	}
	
	public MembresiaCriteria(PersistentSession session) {
		this(session.createCriteria(Membresia.class));
	}
	
	public MembresiaCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createContactouCriteria() {
		return new ContactoCriteria(createCriteria("contactou"));
	}
	
	public GruposCriteria createGruposuCriteria() {
		return new GruposCriteria(createCriteria("gruposu"));
	}
	
	public Membresia uniqueMembresia() {
		return (Membresia) super.uniqueResult();
	}
	
	public Membresia[] listMembresia() {
		java.util.List list = super.list();
		return (Membresia[]) list.toArray(new Membresia[list.size()]);
	}
}

