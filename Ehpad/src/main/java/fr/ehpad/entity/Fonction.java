package fr.ehpad.entity;

public class Fonction {
	private Integer id_fonction;
	private String nom;
	
	public Fonction(Integer id_fonction, String nom) {
		super();
		this.id_fonction = id_fonction;
		this.nom = nom;
	}

	public Fonction() {
		super();
	}

	public Integer getId_fonction() {
		return id_fonction;
	}

	public void setId_fonction(Integer id_fonction) {
		this.id_fonction = id_fonction;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
