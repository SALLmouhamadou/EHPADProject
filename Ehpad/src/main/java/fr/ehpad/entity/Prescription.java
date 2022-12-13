package fr.ehpad.entity;

import java.time.LocalDate;

public class Prescription {
	private Integer idMedicament, id_personne;
	private LocalDate jour, date_debut_traitement, date_fin_traitement;
	private String posologie, noRPPS;
	
	public Prescription(Integer idMedicament, Integer id_personne, LocalDate jour, LocalDate date_debut_traitement,
			LocalDate date_fin_traitement, String posologie, String noRPPS) {
		super();
		this.idMedicament = idMedicament;
		this.id_personne = id_personne;
		this.jour = jour;
		this.date_debut_traitement = date_debut_traitement;
		this.date_fin_traitement = date_fin_traitement;
		this.posologie = posologie;
		this.noRPPS = noRPPS;
	}
	
	public Prescription() {
		super();
	}
	/**
	 * @return the idMedicament
	 */
	public Integer getIdMedicament() {
		return idMedicament;
	}
	/**
	 * @return the id_personne
	 */
	public Integer getId_personne() {
		return id_personne;
	}
	/**
	 * @return the jour
	 */
	public LocalDate getJour() {
		return jour;
	}
	/**
	 * @return the date_debut_traitement
	 */
	public LocalDate getDate_debut_traitement() {
		return date_debut_traitement;
	}
	/**
	 * @return the date_fin_traitement
	 */
	public LocalDate getDate_fin_traitement() {
		return date_fin_traitement;
	}
	/**
	 * @return the posologie
	 */
	public String getPosologie() {
		return posologie;
	}
	/**
	 * @return the noRPPS
	 */
	public String getNoRPPS() {
		return noRPPS;
	}
	/**
	 * @param idMedicament the idMedicament to set
	 */
	public void setIdMedicament(Integer idMedicament) {
		this.idMedicament = idMedicament;
	}
	/**
	 * @param id_personne the id_personne to set
	 */
	public void setId_personne(Integer id_personne) {
		this.id_personne = id_personne;
	}
	/**
	 * @param jour the jour to set
	 */
	public void setJour(LocalDate jour) {
		this.jour = jour;
	}
	/**
	 * @param date_debut_traitement the date_debut_traitement to set
	 */
	public void setDate_debut_traitement(LocalDate date_debut_traitement) {
		this.date_debut_traitement = date_debut_traitement;
	}
	/**
	 * @param date_fin_traitement the date_fin_traitement to set
	 */
	public void setDate_fin_traitement(LocalDate date_fin_traitement) {
		this.date_fin_traitement = date_fin_traitement;
	}
	/**
	 * @param posologie the posologie to set
	 */
	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	/**
	 * @param noRPPS the noRPPS to set
	 */
	public void setNoRPPS(String noRPPS) {
		this.noRPPS = noRPPS;
	}
	
	
	
}
