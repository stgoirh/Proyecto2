/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateBDProyecto2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.BDProyecto2PersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : membresia, visto_Not, visto_Act, organizacion, ciudad, telefono, mail, apellido, nombre
			orm.ContactoDAO.save(lormContacto);
			orm.Visto_Act lormVisto_Act = orm.Visto_ActDAO.createVisto_Act();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contactou, actividadu
			orm.Visto_ActDAO.save(lormVisto_Act);
			orm.Actividad lormActividad = orm.ActividadDAO.createActividad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visto_Act, fecha
			orm.ActividadDAO.save(lormActividad);
			orm.Grupos lormGrupos = orm.GruposDAO.createGrupos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : membresia, notificacion, fechaCreacion, nombre
			orm.GruposDAO.save(lormGrupos);
			orm.Visto_Not lormVisto_Not = orm.Visto_NotDAO.createVisto_Not();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contactou, notificacionu, visto
			orm.Visto_NotDAO.save(lormVisto_Not);
			orm.Notificacion lormNotificacion = orm.NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visto_Not, mensaje, fecha, gruposu
			orm.NotificacionDAO.save(lormNotificacion);
			orm.Membresia lormMembresia = orm.MembresiaDAO.createMembresia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gruposu, contactou
			orm.MembresiaDAO.save(lormMembresia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBDProyecto2Data createBDProyecto2Data = new CreateBDProyecto2Data();
			try {
				createBDProyecto2Data.createTestData();
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
