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

public class ActividadDAO {
	public static Actividad loadActividadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadActividadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getActividadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadActividadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getActividadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Actividad) session.load(orm.Actividad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Actividad) session.get(orm.Actividad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad) session.load(orm.Actividad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad getActividadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Actividad) session.get(orm.Actividad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryActividad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryActividad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryActividad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad as Actividad");
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
	
	public static List queryActividad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad as Actividad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryActividad(session, condition, orderBy);
			return (Actividad[]) list.toArray(new Actividad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad[] listActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryActividad(session, condition, orderBy, lockMode);
			return (Actividad[]) list.toArray(new Actividad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Actividad[] actividads = listActividadByQuery(session, condition, orderBy);
		if (actividads != null && actividads.length > 0)
			return actividads[0];
		else
			return null;
	}
	
	public static Actividad loadActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Actividad[] actividads = listActividadByQuery(session, condition, orderBy, lockMode);
		if (actividads != null && actividads.length > 0)
			return actividads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateActividadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateActividadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateActividadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateActividadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad as Actividad");
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
	
	public static java.util.Iterator iterateActividadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Actividad as Actividad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Actividad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad createActividad() {
		return new orm.Actividad();
	}
	
	public static boolean save(orm.Actividad actividad) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().saveObject(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Actividad actividad) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().deleteObject(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad actividad)throws PersistentException {
		try {
			if (actividad.getGruposu() != null) {
				actividad.getGruposu().actividad.remove(actividad);
			}
			
			orm.Visto_Act[] lVisto_Acts = actividad.visto_Act.toArray();
			for(int i = 0; i < lVisto_Acts.length; i++) {
				lVisto_Acts[i].setActividadu(null);
			}
			return delete(actividad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Actividad actividad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (actividad.getGruposu() != null) {
				actividad.getGruposu().actividad.remove(actividad);
			}
			
			orm.Visto_Act[] lVisto_Acts = actividad.visto_Act.toArray();
			for(int i = 0; i < lVisto_Acts.length; i++) {
				lVisto_Acts[i].setActividadu(null);
			}
			try {
				session.delete(actividad);
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
	
	public static boolean refresh(orm.Actividad actividad) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().refresh(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Actividad actividad) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().evict(actividad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Actividad loadActividadByCriteria(ActividadCriteria actividadCriteria) {
		Actividad[] actividads = listActividadByCriteria(actividadCriteria);
		if(actividads == null || actividads.length == 0) {
			return null;
		}
		return actividads[0];
	}
	
	public static Actividad[] listActividadByCriteria(ActividadCriteria actividadCriteria) {
		return actividadCriteria.listActividad();
	}
}
