package ehpad.entity;

public class Etage {
	private Integer id_etage;
	private boolean etage_securise;
	
	public Etage(Integer id_etage, boolean etage_securise) {
		super();
		this.id_etage = id_etage;
		this.etage_securise = etage_securise;
	}
	
	public Etage() {
		super();
	}

	public Integer getId_etage() {
		return id_etage;
	}

	public void setId_etage(Integer id_etage) {
		this.id_etage = id_etage;
	}

	public boolean isEtage_securise() {
		return etage_securise;
	}

	public void setEtage_securise(boolean etage_securise) {
		this.etage_securise = etage_securise;
	}
	
	
}
