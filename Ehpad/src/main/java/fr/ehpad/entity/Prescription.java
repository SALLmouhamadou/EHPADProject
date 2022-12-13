package fr.ehpad.entity;

import java.time.LocalDate;

public class Prescription {
	private Integer idMedicament, idPersonne;
	private LocalDate jour, dateDebutTraitement, dateFinTraitement;
	private String posologie, noRPPS;
	
	
	
	public Prescription() {
		super();
	}



	public Prescription(Integer idMedicament, Integer idPersonne, LocalDate jour, LocalDate dateDebutTraitement,
			LocalDate dateFinTraitement, String posologie, String noRPPS) {
		super();
		this.idMedicament = idMedicament;
		this.idPersonne = idPersonne;
		this.jour = jour;
		this.dateDebutTraitement = dateDebutTraitement;
		this.dateFinTraitement = dateFinTraitement;
		this.posologie = posologie;
		this.noRPPS = noRPPS;
	}



	/**
	 * @return the idMedicament
	 */
	public Integer getIdMedicament() {
		return idMedicament;
	}



	/**
	 * @return the idPersonne
	 */
	public Integer getIdPersonne() {
		return idPersonne;
	}



	/**
	 * @return the jour
	 */
	public LocalDate getJour() {
		return jour;
	}



	/**
	 * @return the dateDebutTraitement
	 */
	public LocalDate getDateDebutTraitement() {
		return dateDebutTraitement;
	}



	/**
	 * @return the dateFinTraitement
	 */
	public LocalDate getDateFinTraitement() {
		return dateFinTraitement;
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
	 * @param idPersonne the idPersonne to set
	 */
	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}



	/**
	 * @param jour the jour to set
	 */
	public void setJour(LocalDate jour) {
		this.jour = jour;
	}



	/**
	 * @param dateDebutTraitement the dateDebutTraitement to set
	 */
	public void setDateDebutTraitement(LocalDate dateDebutTraitement) {
		this.dateDebutTraitement = dateDebutTraitement;
	}



	/**
	 * @param dateFinTraitement the dateFinTraitement to set
	 */
	public void setDateFinTraitement(LocalDate dateFinTraitement) {
		this.dateFinTraitement = dateFinTraitement;
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
