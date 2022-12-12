package entity;

import java.util.Date;

public class Administre {
	private int id_pensionnaire, id_medicament;
	private String no_RPPS;
	private Date heure;
	
	public Administre(int id_pensionnaire, int id_medicament, String no_RPPS, Date heure) {
		super();
		this.id_pensionnaire = id_pensionnaire;
		this.id_medicament = id_medicament;
		this.no_RPPS = no_RPPS;
		this.heure = heure;
	}

	public Administre() {
		super();
	}

	public int getId_pensionnaire() {
		return id_pensionnaire;
	}

	public void setId_pensionnaire(int id_pensionnaire) {
		this.id_pensionnaire = id_pensionnaire;
	}

	public int getId_medicament() {
		return id_medicament;
	}

	public void setId_medicament(int id_medicament) {
		this.id_medicament = id_medicament;
	}

	public String getNo_RPPS() {
		return no_RPPS;
	}

	public void setNo_RPPS(String no_RPPS) {
		this.no_RPPS = no_RPPS;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}
	
	
}
