package fr.ehpad.entity;

public class Medicament {
	private String nom, fonction;
	private Integer stock, id_medicament;

	public Medicament(Integer id_medicament, String nom, String fonction, Integer stock) {
		super();
		this.nom = nom;
		this.fonction = fonction;
		this.stock = stock;
		this.id_medicament = id_medicament;
	}

	public Medicament() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getId_medicament() {
		return id_medicament;
	}

	public void setId_medicament(Integer id_medicament) {
		this.id_medicament = id_medicament;
	}

}
