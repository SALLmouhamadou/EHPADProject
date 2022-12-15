package fr.ehpad.entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author SALL Mouhamadou
 */
public class Personne {

    private int idPersonne;
    private String nom, prenom, email, pwd, telephone, commentaire;
    private LocalDate dateNaissance, dateArrivee, dateDepart;

    public Personne() {
    	
    }
    
    public Personne(String commentaire){
        this.commentaire=commentaire;
    }
    
    public Personne(int idPersonne, String nom, String prenom, String email, String pwd, String telephone,
			String commentaire, LocalDate dateNaissance, LocalDate dateArrivee, LocalDate dateDepart) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.telephone = telephone;
		this.commentaire = commentaire;
		this.dateNaissance = dateNaissance;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
	}
    
	public Personne(int idPersonne, String nom, String prenom, String email, String telephone, LocalDate dateNaissance,
            LocalDate dateArrivee, LocalDate dateDepart) {
        super();
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public Personne(int idPersonne, String nom, String prenom, String email, String password, String telephone) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pwd = password;
        this.telephone = telephone;
    }

    public Personne(String nom, String prenom, String email, String password, String telephone, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.pwd = password;
        this.telephone = telephone;
        this.dateNaissance= dateNaissance;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }
    
    

    @Override
	public int hashCode() {
		return Objects.hash(commentaire, dateArrivee, dateDepart, dateNaissance, email, idPersonne, nom, prenom, pwd,
				telephone);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(commentaire, other.commentaire) && Objects.equals(dateArrivee, other.dateArrivee)
				&& Objects.equals(dateDepart, other.dateDepart) && Objects.equals(dateNaissance, other.dateNaissance)
				&& Objects.equals(email, other.email) && idPersonne == other.idPersonne
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(pwd, other.pwd) && Objects.equals(telephone, other.telephone);
	}
    
}
