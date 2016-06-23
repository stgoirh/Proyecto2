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

public class Visto_NotDAO {
	public static Visto_Not loadVisto_NotByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_NotByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not getVisto_NotByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getVisto_NotByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_NotByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not getVisto_NotByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getVisto_NotByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Visto_Not) session.load(orm.Visto_Not.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not getVisto_NotByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Visto_Not) session.get(orm.Visto_Not.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visto_Not) session.load(orm.Visto_Not.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not getVisto_NotByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visto_Not) session.get(orm.Visto_Not.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Not(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryVisto_Not(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Not(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryVisto_Not(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not[] listVisto_NotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listVisto_NotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not[] listVisto_NotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listVisto_NotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisto_Not(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Not as Visto_Not");
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
	
	public static List queryVisto_Not(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Not as Visto_Not");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visto_Not", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not[] listVisto_NotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVisto_Not(session, condition, orderBy);
			return (Visto_Not[]) list.toArray(new Visto_Not[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not[] listVisto_NotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVisto_Not(session, condition, orderBy, lockMode);
			return (Visto_Not[]) list.toArray(new Visto_Not[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_NotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadVisto_NotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Visto_Not[] visto_Nots = listVisto_NotByQuery(session, condition, orderBy);
		if (visto_Nots != null && visto_Nots.length > 0)
			return visto_Nots[0];
		else
			return null;
	}
	
	public static Visto_Not loadVisto_NotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Visto_Not[] visto_Nots = listVisto_NotByQuery(session, condition, orderBy, lockMode);
		if (visto_Nots != null && visto_Nots.length > 0)
			return visto_Nots[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVisto_NotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateVisto_NotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisto_NotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateVisto_NotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisto_NotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Not as Visto_Not");
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
	
	public static java.util.Iterator iterateVisto_NotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visto_Not as Visto_Not");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Visto_Not", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not createVisto_Not() {
		return new orm.Visto_Not();
	}
	
	public static boolean save(orm.Visto_Not visto_Not) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().saveObject(visto_Not);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Visto_Not visto_Not) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().deleteObject(visto_Not);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visto_Not visto_Not)throws PersistentException {
		try {
			if (visto_Not.getNotificacionu() != null) {
				visto_Not.getNotificacionu().visto_Not.remove(visto_Not);
			}
			
			if (visto_Not.getContactou() != null) {
				visto_Not.getContactou().visto_Not.remove(visto_Not);
			}
			
			return delete(visto_Not);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visto_Not visto_Not, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (visto_Not.getNotificacionu() != null) {
				visto_Not.getNotificacionu().visto_Not.remove(visto_Not);
			}
			
			if (visto_Not.getContactou() != null) {
				visto_Not.getContactou().visto_Not.remove(visto_Not);
			}
			
			try {
				session.delete(visto_Not);
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
	
	public static boolean refresh(orm.Visto_Not visto_Not) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().refresh(visto_Not);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Visto_Not visto_Not) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().evict(visto_Not);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visto_Not loadVisto_NotByCriteria(Visto_NotCriteria visto_NotCriteria) {
		Visto_Not[] visto_Nots = listVisto_NotByCriteria(visto_NotCriteria);
		if(visto_Nots == null || visto_Nots.length == 0) {
			return null;
		}
		return visto_Nots[0];
	}
	
	public static Visto_Not[] listVisto_NotByCriteria(Visto_NotCriteria visto_NotCriteria) {
		return visto_NotCriteria.listVisto_Not();
	}
}
