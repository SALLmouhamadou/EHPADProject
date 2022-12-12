package entity;

public class Chambre {
	private Integer id_chambre, no_chambre, id_etage;
	private boolean chambre_double;
	
	public Chambre(Integer id_chambre, Integer no_chambre, Integer id_etage, boolean chambre_double) {
		super();
		this.id_chambre = id_chambre;
		this.no_chambre = no_chambre;
		this.id_etage = id_etage;
		this.chambre_double = chambre_double;
	}
	
	public Chambre() {
		super();
	}
	
	public Integer getId_chambre() {
		return id_chambre;
	}
	
	public void setId_chambre(Integer id_chambre) {
		this.id_chambre = id_chambre;
	}
	
	public Integer getNo_chambre() {
		return no_chambre;
	}
	
	public void setNo_chambre(Integer no_chambre) {
		this.no_chambre = no_chambre;
	}
	
	public Integer getId_etage() {
		return id_etage;
	}
	
	public void setId_etage(Integer id_etage) {
		this.id_etage = id_etage;
	}
	
	public boolean isChambre_double() {
		return chambre_double;
	}
	
	public void setChambre_double(boolean chambre_double) {
		this.chambre_double = chambre_double;
	}
	
	
}
