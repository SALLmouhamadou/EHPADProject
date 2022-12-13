package ehpad.entity;

import java.sql.Date;

public class Pensionnaire extends Personne {
	private Integer id_pensionnaire, id_chambre;
	private String no_secu;

	public Pensionnaire() {
		super();
	}
	
	public Pensionnaire(Integer id_personne, Integer id_pensionnaire) {
		super(id_personne);
		this.id_pensionnaire = id_pensionnaire;
	}

	public Pensionnaire(Integer id_pensionnaire, Integer id_chambre, String no_secu) {
		super();
		this.id_pensionnaire = id_pensionnaire;
		this.id_chambre = id_chambre;
		this.no_secu = no_secu;
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
