package fr.ehpad.entity;

public class Infirmiere extends Employe {
	private String no_RPPS;

	

	public Infirmiere(String no_RPPS) {
		super();
		this.no_RPPS = no_RPPS;
	}

	public Infirmiere() {
		super();
	}

	public String getNo_RPPS() {
		return no_RPPS;
	}

	public void setNo_RPPS(String no_RPPS) {
		this.no_RPPS = no_RPPS;
	}
	
	
}
