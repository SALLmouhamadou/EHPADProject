package entity;

import java.sql.Date;

public class Personne {
	private Integer id_personne;
	private String nom, prenom, email, telephone;
	private Date date_naissance, date_arrivee, date_depart;
	
	public Personne(Integer id_personne, String nom, String prenom, String email, String telephone, Date date_naissance,
			Date date_arrivee, Date date_depart) {
		super();
		this.id_personne = id_personne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.date_naissance = date_naissance;
		this.date_arrivee = date_arrivee;
		this.date_depart = date_depart;
	}
	
	

	public Personne() {
		super();
	}



	public Integer getId_personne() {
		return id_personne;
	}

	public void setId_personne(Integer id_personne) {
		this.id_personne = id_personne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Date getDate_arrivee() {
		return date_arrivee;
	}

	public void setDate_arrivee(Date date_arrivee) {
		this.date_arrivee = date_arrivee;
	}

	public Date getDate_depart() {
		return date_depart;
	}

	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	
	
}
