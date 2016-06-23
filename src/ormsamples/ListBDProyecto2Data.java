/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListBDProyecto2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Visto_Act...");
		orm.Visto_Act[] ormVisto_Acts = orm.Visto_ActDAO.listVisto_ActByQuery(null, null);
		length = Math.min(ormVisto_Acts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormVisto_Acts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Actividad...");
		orm.Actividad[] ormActividads = orm.ActividadDAO.listActividadByQuery(null, null);
		length = Math.min(ormActividads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormActividads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Grupos...");
		orm.Grupos[] ormGruposes = orm.GruposDAO.listGruposByQuery(null, null);
		length = Math.min(ormGruposes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormGruposes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Visto_Not...");
		orm.Visto_Not[] ormVisto_Nots = orm.Visto_NotDAO.listVisto_NotByQuery(null, null);
		length = Math.min(ormVisto_Nots.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormVisto_Nots[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		orm.Notificacion[] ormNotificacions = orm.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(ormNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Membresia...");
		orm.Membresia[] ormMembresias = orm.MembresiaDAO.listMembresiaByQuery(null, null);
		length = Math.min(ormMembresias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMembresias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.uid.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		int length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Visto_Act by Criteria...");
		orm.Visto_ActCriteria lormVisto_ActCriteria = new orm.Visto_ActCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormVisto_ActCriteria.uid.eq();
		lormVisto_ActCriteria.setMaxResults(ROW_COUNT);
		orm.Visto_Act[] ormVisto_Acts = lormVisto_ActCriteria.listVisto_Act();
		length =ormVisto_Acts== null ? 0 : Math.min(ormVisto_Acts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormVisto_Acts[i]);
		}
		System.out.println(length + " Visto_Act record(s) retrieved."); 
		
		System.out.println("Listing Actividad by Criteria...");
		orm.ActividadCriteria lormActividadCriteria = new orm.ActividadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormActividadCriteria.uid.eq();
		lormActividadCriteria.setMaxResults(ROW_COUNT);
		orm.Actividad[] ormActividads = lormActividadCriteria.listActividad();
		length =ormActividads== null ? 0 : Math.min(ormActividads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormActividads[i]);
		}
		System.out.println(length + " Actividad record(s) retrieved."); 
		
		System.out.println("Listing Grupos by Criteria...");
		orm.GruposCriteria lormGruposCriteria = new orm.GruposCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormGruposCriteria.uid.eq();
		lormGruposCriteria.setMaxResults(ROW_COUNT);
		orm.Grupos[] ormGruposes = lormGruposCriteria.listGrupos();
		length =ormGruposes== null ? 0 : Math.min(ormGruposes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormGruposes[i]);
		}
		System.out.println(length + " Grupos record(s) retrieved."); 
		
		System.out.println("Listing Visto_Not by Criteria...");
		orm.Visto_NotCriteria lormVisto_NotCriteria = new orm.Visto_NotCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormVisto_NotCriteria.uid.eq();
		lormVisto_NotCriteria.setMaxResults(ROW_COUNT);
		orm.Visto_Not[] ormVisto_Nots = lormVisto_NotCriteria.listVisto_Not();
		length =ormVisto_Nots== null ? 0 : Math.min(ormVisto_Nots.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormVisto_Nots[i]);
		}
		System.out.println(length + " Visto_Not record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		orm.NotificacionCriteria lormNotificacionCriteria = new orm.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormNotificacionCriteria.uid.eq();
		lormNotificacionCriteria.setMaxResults(ROW_COUNT);
		orm.Notificacion[] ormNotificacions = lormNotificacionCriteria.listNotificacion();
		length =ormNotificacions== null ? 0 : Math.min(ormNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Membresia by Criteria...");
		orm.MembresiaCriteria lormMembresiaCriteria = new orm.MembresiaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMembresiaCriteria.uid.eq();
		lormMembresiaCriteria.setMaxResults(ROW_COUNT);
		orm.Membresia[] ormMembresias = lormMembresiaCriteria.listMembresia();
		length =ormMembresias== null ? 0 : Math.min(ormMembresias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMembresias[i]);
		}
		System.out.println(length + " Membresia record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListBDProyecto2Data listBDProyecto2Data = new ListBDProyecto2Data();
			try {
				listBDProyecto2Data.listTestData();
				//listBDProyecto2Data.listByCriteria();
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
