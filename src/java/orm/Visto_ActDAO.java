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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Visto_ActDAO {
	public static Visto_Act loadVisto_ActByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_ActByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act getVisto_ActByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getVisto_ActByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_ActByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act getVisto_ActByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getVisto_ActByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Visto_Act) session.load(orm.Visto_Act.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act getVisto_ActByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Visto_Act) session.get(orm.Visto_Act.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visto_Act) session.load(orm.Visto_Act.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act getVisto_ActByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visto_Act) session.get(orm.Visto_Act.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Act(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryVisto_Act(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Act(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryVisto_Act(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act[] listVisto_ActByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listVisto_ActByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act[] listVisto_ActByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listVisto_ActByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Act(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Act as Visto_Act");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Act(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Act as Visto_Act");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visto_Act", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act[] listVisto_ActByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVisto_Act(session, condition, orderBy);
			return (Visto_Act[]) list.toArray(new Visto_Act[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act[] listVisto_ActByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVisto_Act(session, condition, orderBy, lockMode);
			return (Visto_Act[]) list.toArray(new Visto_Act[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_ActByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_ActByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Visto_Act[] visto_Acts = listVisto_ActByQuery(session, condition, orderBy);
		if (visto_Acts != null && visto_Acts.length > 0)
			return visto_Acts[0];
		else
			return null;
	}
	
	public static Visto_Act loadVisto_ActByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Visto_Act[] visto_Acts = listVisto_ActByQuery(session, condition, orderBy, lockMode);
		if (visto_Acts != null && visto_Acts.length > 0)
			return visto_Acts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVisto_ActByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateVisto_ActByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisto_ActByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateVisto_ActByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisto_ActByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Act as Visto_Act");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisto_ActByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Act as Visto_Act");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visto_Act", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act createVisto_Act() {
		return new orm.Visto_Act();
	}
	
	public static boolean save(orm.Visto_Act visto_Act) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().saveObject(visto_Act);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Visto_Act visto_Act) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().deleteObject(visto_Act);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visto_Act visto_Act)throws PersistentException {
		try {
			if (visto_Act.getActividadu() != null) {
				visto_Act.getActividadu().visto_Act.remove(visto_Act);
			}
			
			if (visto_Act.getContactou() != null) {
				visto_Act.getContactou().visto_Act.remove(visto_Act);
			}
			
			return delete(visto_Act);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visto_Act visto_Act, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (visto_Act.getActividadu() != null) {
				visto_Act.getActividadu().visto_Act.remove(visto_Act);
			}
			
			if (visto_Act.getContactou() != null) {
				visto_Act.getContactou().visto_Act.remove(visto_Act);
			}
			
			try {
				session.delete(visto_Act);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Visto_Act visto_Act) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().refresh(visto_Act);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Visto_Act visto_Act) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().evict(visto_Act);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Act loadVisto_ActByCriteria(Visto_ActCriteria visto_ActCriteria) {
		Visto_Act[] visto_Acts = listVisto_ActByCriteria(visto_ActCriteria);
		if(visto_Acts == null || visto_Acts.length == 0) {
			return null;
		}
		return visto_Acts[0];
	}
	
	public static Visto_Act[] listVisto_ActByCriteria(Visto_ActCriteria visto_ActCriteria) {
		return visto_ActCriteria.listVisto_Act();
	}
}
