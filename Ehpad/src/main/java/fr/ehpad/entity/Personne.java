package fr.ehpad.entity;

import java.time.LocalDate;

/**
 *
 * @author SALL Mouhamadou
 */
public class Personne {

    private int idPersonne;
    private String nom, prenom, email, pwd, telephone;
    private LocalDate dateNaissance, dateArrivee, dateDepart;

    public Personne() {
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
}
