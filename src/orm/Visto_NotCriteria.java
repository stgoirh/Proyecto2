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

public class Visto_NotCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression visto;
	public final IntegerExpression notificacionuId;
	public final AssociationExpression notificacionu;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	
	public Visto_NotCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		visto = new StringExpression("visto", this);
		notificacionuId = new IntegerExpression("notificacionu.uid", this);
		notificacionu = new AssociationExpression("notificacionu", this);
		contactouId = new IntegerExpression("contactou.uid", this);
		contactou = new AssociationExpression("contactou", this);
	}
	
	public Visto_NotCriteria(PersistentSession session) {
		this(session.createCriteria(Visto_Not.class));
	}
	
	public Visto_NotCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public NotificacionCriteria createNotificacionuCriteria() {
		return new NotificacionCriteria(createCriteria("notificacionu"));
	}
	
	public ContactoCriteria createContactouCriteria() {
		return new ContactoCriteria(createCriteria("contactou"));
	}
	
	public Visto_Not uniqueVisto_Not() {
		return (Visto_Not) super.uniqueResult();
	}
	
	public Visto_Not[] listVisto_Not() {
		java.util.List list = super.list();
		return (Visto_Not[]) list.toArray(new Visto_Not[list.size()]);
	}
}

