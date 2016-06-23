/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateBDProyecto2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Visto_Act lormVisto_Act = orm.Visto_ActDAO.loadVisto_ActByQuery(null, null);
			// Update the properties of the persistent object
			orm.Visto_ActDAO.save(lormVisto_Act);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Update the properties of the persistent object
			orm.ActividadDAO.save(lormActividad);
			orm.Grupos lormGrupos = orm.GruposDAO.loadGruposByQuery(null, null);
			// Update the properties of the persistent object
			orm.GruposDAO.save(lormGrupos);
			orm.Visto_Not lormVisto_Not = orm.Visto_NotDAO.loadVisto_NotByQuery(null, null);
			// Update the properties of the persistent object
			orm.Visto_NotDAO.save(lormVisto_Not);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByQuery(null, null);
			// Update the properties of the persistent object
			orm.MembresiaDAO.save(lormMembresia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.uid.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Visto_Act by Visto_ActCriteria");
		orm.Visto_ActCriteria lormVisto_ActCriteria = new orm.Visto_ActCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormVisto_ActCriteria.uid.eq();
		System.out.println(lormVisto_ActCriteria.uniqueVisto_Act());
		
		System.out.println("Retrieving Actividad by ActividadCriteria");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormActividadCriteria.uid.eq();
		System.out.println(lormActividadCriteria.uniqueActividad());
		
		System.out.println("Retrieving Grupos by GruposCriteria");
		orm.GruposCriteria lormGruposCriteria = new orm.GruposCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormGruposCriteria.uid.eq();
		System.out.println(lormGruposCriteria.uniqueGrupos());
		
		System.out.println("Retrieving Visto_Not by Visto_NotCriteria");
		orm.Visto_NotCriteria lormVisto_NotCriteria = new orm.Visto_NotCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormVisto_NotCriteria.uid.eq();
		System.out.println(lormVisto_NotCriteria.uniqueVisto_Not());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		orm.NotificacionCriteria lormNotificacionCriteria = new orm.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormNotificacionCriteria.uid.eq();
		System.out.println(lormNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Membresia by MembresiaCriteria");
		orm.MembresiaCriteria lormMembresiaCriteria = new orm.MembresiaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMembresiaCriteria.uid.eq();
		System.out.println(lormMembresiaCriteria.uniqueMembresia());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateBDProyecto2Data retrieveAndUpdateBDProyecto2Data = new RetrieveAndUpdateBDProyecto2Data();
			try {
				retrieveAndUpdateBDProyecto2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateBDProyecto2Data.retrieveByCriteria();
			}
			finally {
				orm.BDProyecto2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
