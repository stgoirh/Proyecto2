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

public class Visto_NotDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression visto;
	public final IntegerExpression notificacionuId;
	public final AssociationExpression notificacionu;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	
	public Visto_NotDetachedCriteria() {
		super(orm.Visto_Not.class, orm.Visto_NotCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		visto = new StringExpression("visto", this.getDetachedCriteria());
		notificacionuId = new IntegerExpression("notificacionu.uid", this.getDetachedCriteria());
		notificacionu = new AssociationExpression("notificacionu", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
	}
	
	public Visto_NotDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Visto_NotCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		visto = new StringExpression("visto", this.getDetachedCriteria());
		notificacionuId = new IntegerExpression("notificacionu.uid", this.getDetachedCriteria());
		notificacionu = new AssociationExpression("notificacionu", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria createNotificacionuCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("notificacionu"));
	}
	
	public ContactoDetachedCriteria createContactouCriteria() {
		return new ContactoDetachedCriteria(createCriteria("contactou"));
	}
	
	public Visto_Not uniqueVisto_Not(PersistentSession session) {
		return (Visto_Not) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Visto_Not[] listVisto_Not(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Visto_Not[]) list.toArray(new Visto_Not[list.size()]);
	}
}

