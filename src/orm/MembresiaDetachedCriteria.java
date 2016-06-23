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

public class MembresiaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final IntegerExpression contactouId;
	public final AssociationExpression contactou;
	public final IntegerExpression gruposuId;
	public final AssociationExpression gruposu;
	
	public MembresiaDetachedCriteria() {
		super(orm.Membresia.class, orm.MembresiaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
	}
	
	public MembresiaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MembresiaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		contactouId = new IntegerExpression("contactou.uid", this.getDetachedCriteria());
		contactou = new AssociationExpression("contactou", this.getDetachedCriteria());
		gruposuId = new IntegerExpression("gruposu.uid", this.getDetachedCriteria());
		gruposu = new AssociationExpression("gruposu", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createContactouCriteria() {
		return new ContactoDetachedCriteria(createCriteria("contactou"));
	}
	
	public GruposDetachedCriteria createGruposuCriteria() {
		return new GruposDetachedCriteria(createCriteria("gruposu"));
	}
	
	public Membresia uniqueMembresia(PersistentSession session) {
		return (Membresia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Membresia[] listMembresia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Membresia[]) list.toArray(new Membresia[list.size()]);
	}
}

