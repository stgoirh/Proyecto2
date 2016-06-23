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

public class Visto_ActCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression visto;
	public final IntegerExpression actividaduId;
	public final AssociationExpression actividadu;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	
	public Visto_ActCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		visto = new StringExpression("visto", this);
		actividaduId = new IntegerExpression("actividadu.uid", this);
		actividadu = new AssociationExpression("actividadu", this);
		contactouId = new IntegerExpression("contactou.uid", this);
		contactou = new AssociationExpression("contactou", this);
	}
	
	public Visto_ActCriteria(PersistentSession session) {
		this(session.createCriteria(Visto_Act.class));
	}
	
	public Visto_ActCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public ActividadCriteria createActividaduCriteria() {
		return new ActividadCriteria(createCriteria("actividadu"));
	}
	
	public ContactoCriteria createContactouCriteria() {
		return new ContactoCriteria(createCriteria("contactou"));
	}
	
	public Visto_Act uniqueVisto_Act() {
		return (Visto_Act) super.uniqueResult();
	}
	
	public Visto_Act[] listVisto_Act() {
		java.util.List list = super.list();
		return (Visto_Act[]) list.toArray(new Visto_Act[list.size()]);
	}
}

