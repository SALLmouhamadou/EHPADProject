/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ehpad.entity;

/**
 *
 * @author SALL Mouhamadou
 */
public class Candidat extends Personne{
	private int idCandidat;

	public Candidat() {}

	public Candidat(int idCandidat, String nom, String prenom, String email, String passsword, String telephone) {
		super( nom, prenom, email, passsword, telephone);
		this.idCandidat = idCandidat;
	}
	
	
}
