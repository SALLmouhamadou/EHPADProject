package entity;

import java.sql.Date;

public class Prescription {
	private Integer id_medicament, id__medecin, id_pensionnaire;
	private Date jour, date_debut_traitement, date_fin_traitement;
	private String posologie;
	
	public Prescription(Integer id_medicament, Integer id__medecin, Integer id_pensionnaire, Date jour,
			Date date_debut_traitement, Date date_fin_traitement, String posologie) {
		super();
		this.id_medicament = id_medicament;
		this.id__medecin = id__medecin;
		this.id_pensionnaire = id_pensionnaire;
		this.jour = jour;
		this.date_debut_traitement = date_debut_traitement;
		this.date_fin_traitement = date_fin_traitement;
		this.posologie = posologie;
	}

	public Prescription() {
		super();
	}

	public Integer getId_medicament() {
		return id_medicament;
	}

	public void setId_medicament(Integer id_medicament) {
		this.id_medicament = id_medicament;
	}

	public Integer getId__medecin() {
		return id__medecin;
	}

	public void setId__medecin(Integer id__medecin) {
		this.id__medecin = id__medecin;
	}

	public Integer getId_pensionnaire() {
		return id_pensionnaire;
	}

	public void setId_pensionnaire(Integer id_pensionnaire) {
		this.id_pensionnaire = id_pensionnaire;
	}

	public Date getJour() {
		return jour;
	}

	public void setJour(Date jour) {
		this.jour = jour;
	}

	public Date getDate_debut_traitement() {
		return date_debut_traitement;
	}

	public void setDate_debut_traitement(Date date_debut_traitement) {
		this.date_debut_traitement = date_debut_traitement;
	}

	public Date getDate_fin_traitement() {
		return date_fin_traitement;
	}

	public void setDate_fin_traitement(Date date_fin_traitement) {
		this.date_fin_traitement = date_fin_traitement;
	}

	public String getPosologie() {
		return posologie;
	}

	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}
	
	
}
