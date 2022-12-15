package fr.ehpad.uml;

public class PlantUML {
	/**
	 * afficher prescriptions
	 * @startuml 
	 * participant Navigateur 
	 * participant Vue
	 * 
	 *           Navigateur -> Controleur: GET /prescriptions/\n?no_patient
	 *           Controleur -> Controleur: idPatient complet ?
	 *           Controleur -> Dao: PrescriptionDao.getPrescriptions(noPatient)
	 *           Dao -> SGBD: SELECT ...
	 *           SGBD --> Dao: lignes
	 *           Dao --> Controleur: List<Prescription>
	 *           Controleur -> Vue: prescriptions.jsp
	 *           Vue --> Navigateur: HTML genere
	 * @enduml
	 */
	
	/**
	 * 
	 * @startuml 
	 * participant Navigateur 
	 * participant Vue
	 * 
	 *           Navigateur -> Controleur: /administrerMedicament\n+parametres 
	 *           Controleur -> Dao: EHPAD.getPensionnaires()
	 *           Controleur -> Dao: EHPAD.getOrdonnances()
	 *           Dao -> SGBD: SQL
	 *           SGBD --> Dao: lignes
	 *           Dao --> Controleur: Vérifie que les lignes ont été insérées
	 *           Controleur -> Vue: administrerMedicament
	 *           Vue --> Navigateur: HTML genere
	 * @enduml
	 */
}
