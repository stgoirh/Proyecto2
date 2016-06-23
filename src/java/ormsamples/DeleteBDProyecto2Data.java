/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteBDProyecto2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Visto_Act lormVisto_Act = orm.Visto_ActDAO.loadVisto_ActByQuery(null, null);
			// Delete the persistent object
			orm.Visto_ActDAO.delete(lormVisto_Act);
			orm.Actividad lormActividad = orm.ActividadDAO.loadActividadByQuery(null, null);
			// Delete the persistent object
			orm.ActividadDAO.delete(lormActividad);
			orm.Grupos lormGrupos = orm.GruposDAO.loadGruposByQuery(null, null);
			// Delete the persistent object
			orm.GruposDAO.delete(lormGrupos);
			orm.Visto_Not lormVisto_Not = orm.Visto_NotDAO.loadVisto_NotByQuery(null, null);
			// Delete the persistent object
			orm.Visto_NotDAO.delete(lormVisto_Not);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			orm.NotificacionDAO.delete(lormNotificacion);
			orm.Membresia lormMembresia = orm.MembresiaDAO.loadMembresiaByQuery(null, null);
			// Delete the persistent object
			orm.MembresiaDAO.delete(lormMembresia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteBDProyecto2Data deleteBDProyecto2Data = new DeleteBDProyecto2Data();
			try {
				deleteBDProyecto2Data.deleteTestData();
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
