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

public class Visto_ActDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression visto;
	public final IntegerExpression actividaduId;
	public final AssociationExpression actividadu;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	
	public Visto_ActDetachedCriteria() {
		super(orm.Visto_Act.class, orm.Visto_ActCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		visto = new StringExpression("visto", this.getDetachedCriteria());
		actividaduId = new IntegerExpression("actividadu.uid", this.getDetachedCriteria());
		actividadu = new AssociationExpression("actividadu", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
	}
	
	public Visto_ActDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Visto_ActCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		visto = new StringExpression("visto", this.getDetachedCriteria());
		actividaduId = new IntegerExpression("actividadu.uid", this.getDetachedCriteria());
		actividadu = new AssociationExpression("actividadu", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
	}
	
	public ActividadDetachedCriteria createActividaduCriteria() {
		return new ActividadDetachedCriteria(createCriteria("actividadu"));
	}
	
	public ContactoDetachedCriteria createContactouCriteria() {
		return new ContactoDetachedCriteria(createCriteria("contactou"));
	}
	
	public Visto_Act uniqueVisto_Act(PersistentSession session) {
		return (Visto_Act) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Visto_Act[] listVisto_Act(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Visto_Act[]) list.toArray(new Visto_Act[list.size()]);
	}
}

