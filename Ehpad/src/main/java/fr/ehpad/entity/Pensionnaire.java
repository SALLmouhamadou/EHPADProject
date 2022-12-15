package fr.ehpad.entity;

public class Pensionnaire extends Personne {
	private Integer id_chambre;
	private String no_secu;
	
	public Pensionnaire() {
		super();
	}

	public Pensionnaire(Integer id_chambre, String no_secu) {
		super();
		this.id_chambre = id_chambre;
		this.no_secu = no_secu;
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
