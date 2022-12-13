package fr.ehpad.dao;

import java.sql.Connection;

import fr.ehpad.entity.Medicament;
import fr.ehpad.entity.Prescription;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class MedicamentDao {
	public static Medicament getMedicamentbyID(Integer idMedic) throws SQLException {
		// ouvrir un canal de requettage.
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM prescription WHERE id_medicament =?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idMedic);
		ResultSet res = state.executeQuery();
		res.next();
		Integer idMedicament = res.getInt("id_medicament");
		String nom = res.getString("nom");
		String fonction = res.getString("fonction");
		Integer stock = res.getInt("stock");

		Medicament medic = new Medicament(idMedicament, nom, fonction, stock);

		return medic;
	}
}
