package fr.ehpad.dao;

import java.sql.Connection;

import fr.ehpad.entity.Prescription;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;

public class PrescriptionDao {

	public static HashMap<Integer, Prescription> getPrescriptionbyID(Integer idPersonne) throws SQLException {
		// ouvrir un canal de requettage.
		Connection con = Database.getConnection();
		String sql = "SELECT * \r\n"
				+ "FROM prescription \r\n"
				+ "WHERE id_personne=? AND date_debut_traitement<NOW() AND date_fin_traitement>NOW();";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idPersonne);
		ResultSet res = state.executeQuery();
		HashMap<Integer, Prescription> prescriptions = new HashMap<>();
		int index = 0;
		
		res.next();
		while(res.next()) {
		Integer idMedicament = res.getInt("id_medicament");
		String noRPPS = res.getString("no_rpps");
		LocalDate jour = LocalDate.parse(res.getString("jour"));
		String posologie = res.getString("posologie");
		LocalDate dateDebutTraitement = LocalDate.parse(res.getString("date_debut_traitement"));
		LocalDate dateFinTraitement = LocalDate.parse(res.getString("date_fin_traitement"));

		Prescription pres = new Prescription(idMedicament, idPersonne, jour, dateDebutTraitement, dateFinTraitement,
				posologie, noRPPS);
		
		prescriptions.put(index, pres);
		index++;
		}

		return prescriptions;
	}
}
