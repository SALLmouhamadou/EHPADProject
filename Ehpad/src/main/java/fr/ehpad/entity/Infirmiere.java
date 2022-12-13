package fr.ehpad.entity;

import java.time.LocalDate;





public class Infirmiere extends Personne {
	private String no_RPPS;

	public Infirmiere(Integer id_personne, String nom, String prenom, String email, String telephone,
			LocalDate date_naissance, LocalDate date_arrivee, LocalDate date_depart) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
	}

	public Infirmiere(Integer id_personne, String nom, String prenom, String email, String telephone,
			LocalDate date_naissance, LocalDate date_arrivee, LocalDate date_depart, String no_RPPS) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
		this.no_RPPS = no_RPPS;
	}

	public String getNo_RPPS() {
		return no_RPPS;
	}

	public void setNo_RPPS(String no_RPPS) {
		this.no_RPPS = no_RPPS;
	}
	
	
}
