package entity;

import java.sql.Date;

public class Employe extends Personne {
	private Integer id_employe, id_fonction;
	private String no_secu;
	
	

	public Employe(Integer id_personne, String nom, String prenom, String email, String telephone, Date date_naissance,
			Date date_arrivee, Date date_depart) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
	}

	public Employe(Integer id_personne, String nom, String prenom, String email, String telephone, Date date_naissance,
			Date date_arrivee, Date date_depart, Integer id_employe, Integer id_fonction, String no_secu) {
		super(id_personne, nom, prenom, email, telephone, date_naissance, date_arrivee, date_depart);
		this.id_employe = id_employe;
		this.id_fonction = id_fonction;
		this.no_secu = no_secu;
	}

	public Integer getId_employe() {
		return id_employe;
	}

	public void setId_employe(Integer id_employe) {
		this.id_employe = id_employe;
	}

	public Integer getId_fonction() {
		return id_fonction;
	}

	public void setId_fonction(Integer id_fonction) {
		this.id_fonction = id_fonction;
	}

	public String getNo_secu() {
		return no_secu;
	}

	public void setNo_secu(String no_secu) {
		this.no_secu = no_secu;
	}
	
	
}
