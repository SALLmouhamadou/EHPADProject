package fr.ehpad.entity;

import java.sql.Date;

public class Infirmiere extends Employe {
	private String no_RPPS;

	public Infirmiere(Integer id_personne, String nom, String prenom, String email, String telephone,
			Date date_naissance, Date date_arrivee, Date date_depart) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
	}

	public Infirmiere(Integer id_personne, String nom, String prenom, String email, String telephone,
			Date date_naissance, Date date_arrivee, Date date_depart, String no_RPPS) {
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
