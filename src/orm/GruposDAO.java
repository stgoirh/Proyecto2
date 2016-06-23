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

public class GruposDAO {
	public static Grupos loadGruposByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadGruposByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos getGruposByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getGruposByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadGruposByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos getGruposByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return getGruposByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Grupos) session.load(orm.Grupos.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos getGruposByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Grupos) session.get(orm.Grupos.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupos) session.load(orm.Grupos.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos getGruposByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Grupos) session.get(orm.Grupos.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupos(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryGrupos(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupos(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return queryGrupos(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos[] listGruposByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listGruposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos[] listGruposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return listGruposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupos(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupos as Grupos");
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
	
	public static List queryGrupos(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupos as Grupos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupos", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos[] listGruposByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrupos(session, condition, orderBy);
			return (Grupos[]) list.toArray(new Grupos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos[] listGruposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrupos(session, condition, orderBy, lockMode);
			return (Grupos[]) list.toArray(new Grupos[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadGruposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return loadGruposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grupos[] gruposes = listGruposByQuery(session, condition, orderBy);
		if (gruposes != null && gruposes.length > 0)
			return gruposes[0];
		else
			return null;
	}
	
	public static Grupos loadGruposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Grupos[] gruposes = listGruposByQuery(session, condition, orderBy, lockMode);
		if (gruposes != null && gruposes.length > 0)
			return gruposes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGruposByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateGruposByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGruposByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.BDProyecto2PersistentManager.instance().getSession();
			return iterateGruposByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGruposByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupos as Grupos");
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
	
	public static java.util.Iterator iterateGruposByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Grupos as Grupos");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupos", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos createGrupos() {
		return new orm.Grupos();
	}
	
	public static boolean save(orm.Grupos grupos) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().saveObject(grupos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Grupos grupos) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().deleteObject(grupos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupos grupos)throws PersistentException {
		try {
			orm.Actividad[] lActividads = grupos.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setGruposu(null);
			}
			orm.Notificacion[] lNotificacions = grupos.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setGruposu(null);
			}
			orm.Membresia[] lMembresias = grupos.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setGruposu(null);
			}
			return delete(grupos);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Grupos grupos, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Actividad[] lActividads = grupos.actividad.toArray();
			for(int i = 0; i < lActividads.length; i++) {
				lActividads[i].setGruposu(null);
			}
			orm.Notificacion[] lNotificacions = grupos.notificacion.toArray();
			for(int i = 0; i < lNotificacions.length; i++) {
				lNotificacions[i].setGruposu(null);
			}
			orm.Membresia[] lMembresias = grupos.membresia.toArray();
			for(int i = 0; i < lMembresias.length; i++) {
				lMembresias[i].setGruposu(null);
			}
			try {
				session.delete(grupos);
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
	
	public static boolean refresh(orm.Grupos grupos) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().refresh(grupos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Grupos grupos) throws PersistentException {
		try {
			orm.BDProyecto2PersistentManager.instance().getSession().evict(grupos);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupos loadGruposByCriteria(GruposCriteria gruposCriteria) {
		Grupos[] gruposes = listGruposByCriteria(gruposCriteria);
		if(gruposes == null || gruposes.length == 0) {
			return null;
		}
		return gruposes[0];
	}
	
	public static Grupos[] listGruposByCriteria(GruposCriteria gruposCriteria) {
		return gruposCriteria.listGrupos();
	}
}
