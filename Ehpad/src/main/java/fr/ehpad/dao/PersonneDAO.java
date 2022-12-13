package fr.ehpad.dao;

import java.sql.Connection;

import ehpad.entity.Pensionnaire;
import fr.ehpad.database.Database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonneDAO {
	public Personne getPersonnebyID(Integer idPersonne) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM personne WHERE id_personne=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idPersonne);
		ResultSet res = state.executeQuery();
		res.next();

		String nom = res.getString("nom");
		String prenom = res.getString("prenom");
		return null;
	}
}
