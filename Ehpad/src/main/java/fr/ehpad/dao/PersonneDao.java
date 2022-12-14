package fr.ehpad.dao;

import java.sql.Connection;

import fr.ehpad.entity.Personne;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class PersonneDao {
	public static Personne getPersonnebyID(Integer idPersonne) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM personne WHERE id_personne=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idPersonne);
		ResultSet res = state.executeQuery();
		res.next();

		String nom = res.getString("nom");
		String prenom = res.getString("prenom");
		String telephone = res.getString("telephone");
		String email = res.getString("email");
		String pwd = res.getString("pwd");
		LocalDate dateNaissance = LocalDate.parse(res.getString("date_naissance"));
		LocalDate dateArrivee = LocalDate.parse(res.getString("date_arrivee"));
		LocalDate dateDepart = LocalDate.parse(res.getString("date_depart"));
		
		Personne pers = new Personne(idPersonne, nom, prenom, telephone, email, pwd, dateNaissance, dateArrivee, dateDepart);
		return pers;
	}
	
	public static Personne getPersonnebyPatronyme(String nom, String prenom) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM personne WHERE nom=? AND prenom=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setString(1, nom);
		state.setString(2, prenom);
		ResultSet res = state.executeQuery();
		res.next();

		Integer idPersonne = res.getInt("id_personne");
		String telephone = res.getString("telephone");
		String email = res.getString("email");
		String pwd = res.getString("pwd");
		LocalDate dateNaissance = LocalDate.parse(res.getString("date_naissance"));
		LocalDate dateArrivee = LocalDate.parse(res.getString("date_arrivee"));
		LocalDate dateDepart = LocalDate.parse(res.getString("date_depart"));
		
		Personne pers = new Personne(idPersonne, nom, prenom, telephone, email, pwd, dateNaissance, dateArrivee, dateDepart);
		return pers;
	}
}
