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

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	public final StringExpression ciudad;
	public final StringExpression organizacion;
	public final StringExpression imagen;
	public final CollectionExpression visto_Act;
	public final CollectionExpression visto_Not;
	public final CollectionExpression membresia;
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		organizacion = new StringExpression("organizacion", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		visto_Act = new CollectionExpression("ORM_Visto_Act", this.getDetachedCriteria());
		visto_Not = new CollectionExpression("ORM_Visto_Not", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		organizacion = new StringExpression("organizacion", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		visto_Act = new CollectionExpression("ORM_Visto_Act", this.getDetachedCriteria());
		visto_Not = new CollectionExpression("ORM_Visto_Not", this.getDetachedCriteria());
		membresia = new CollectionExpression("ORM_Membresia", this.getDetachedCriteria());
	}
	
	public Visto_ActDetachedCriteria createVisto_ActCriteria() {
		return new Visto_ActDetachedCriteria(createCriteria("ORM_Visto_Act"));
	}
	
	public Visto_NotDetachedCriteria createVisto_NotCriteria() {
		return new Visto_NotDetachedCriteria(createCriteria("ORM_Visto_Not"));
	}
	
	public MembresiaDetachedCriteria createMembresiaCriteria() {
		return new MembresiaDetachedCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

