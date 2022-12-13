package fr.ehpad.entity;

import java.sql.Date;
import java.time.LocalDate;

public class Pensionnaire extends Personne {
	private Integer id_pensionnaire, id_chambre;
	private String no_secu;
	
	public Pensionnaire(Integer id_personne, String nom, String prenom, String email, String telephone,
			LocalDate date_naissance, LocalDate date_arrivee, LocalDate date_depart, Integer id_pensionnaire, Integer id_chambre,
			String no_secu) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
		this.id_pensionnaire = id_pensionnaire;
		this.id_chambre = id_chambre;
		this.no_secu = no_secu;
	}

	public Pensionnaire(Integer id_personne, String nom, String prenom, String email, String telephone,
			LocalDate date_naissance, LocalDate date_arrivee, LocalDate date_depart) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
	}

	public Integer getId_pensionnaire() {
		return id_pensionnaire;
	}

	public void setId_pensionnaire(Integer id_pensionnaire) {
		this.id_pensionnaire = id_pensionnaire;
	}

	public Integer getId_chambre() {
		return id_chambre;
	}

	public void setId_chambre(Integer id_chambre) {
		this.id_chambre = id_chambre;
	}

	public String getNo_secu() {
		return no_secu;
	}

	public void setNo_secu(String no_secu) {
		this.no_secu = no_secu;
	}
	
}
