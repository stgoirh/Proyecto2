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

public class ContactoCriteria extends AbstractORMCriteria {
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
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		mail = new StringExpression("mail", this);
		telefono = new StringExpression("telefono", this);
		ciudad = new StringExpression("ciudad", this);
		organizacion = new StringExpression("organizacion", this);
		imagen = new StringExpression("imagen", this);
		visto_Act = new CollectionExpression("ORM_Visto_Act", this);
		visto_Not = new CollectionExpression("ORM_Visto_Not", this);
		membresia = new CollectionExpression("ORM_Membresia", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(orm.BDProyecto2PersistentManager.instance().getSession());
	}
	
	public Visto_ActCriteria createVisto_ActCriteria() {
		return new Visto_ActCriteria(createCriteria("ORM_Visto_Act"));
	}
	
	public Visto_NotCriteria createVisto_NotCriteria() {
		return new Visto_NotCriteria(createCriteria("ORM_Visto_Not"));
	}
	
	public MembresiaCriteria createMembresiaCriteria() {
		return new MembresiaCriteria(createCriteria("ORM_Membresia"));
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

