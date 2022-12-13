package fr.ehpad.dao;

import java.sql.Connection;
import ehpad.database.Database;
import ehpad.entity.Pensionnaire;
import ehpad.entity.Prescription;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrescriptionDAO {

	public Prescription getPrescriptionbyID(Integer idPensionnaire) throws SQLException {
		// ouvrir un canal de requettage.
		Connection con = Database.getConnection();
		Prescription pres = new Prescription();
		String sql = "SELECT * FROM prescription WHERE id_pensionnaire=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idPensionnaire);
		ResultSet res = state.executeQuery();
		res.next();
		while (res.next()) {
			Prescription.set
			String sql2 = "SELECT * FROM medicament WHERE id_medicament=?;";
			String medicament = res.getString("id_medicament");
			int medicamentInt = Integer.parseInt(medicament);
			PreparedStatement state2 = con.prepareCall(sql2);
			state2.setInt(1, medicamentInt);
			ResultSet res2 = state2.executeQuery();
			res2.next();
			while (res2.next()) {
				String medicNom = res2.getString("nom");
				String medicFonction = res2.getString("fonction");
				String stock = res2.getString("stock");
				System.out.println(medicNom + " " + medicFonction + " " + stock);
			}
			String posologie = res.getString("posologie");
			System.out.println(medicament + " ID : " + posologie);
			return null;
		}

		PreparedStatement canal2 = con.prepareStatement("select * from exemple where id= ?");
		canal2.setInt(1, 0);
		ResultSet res2 = canal2.executeQuery();
		while (res2.next()) {
			String n = res2.getString("nom");
			int i = res2.getInt("id");
			System.out.println(n);
		}
	}
}
