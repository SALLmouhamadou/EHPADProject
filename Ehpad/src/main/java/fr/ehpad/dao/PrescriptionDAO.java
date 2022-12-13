package fr.ehpad.dao;

import java.sql.Connection;
import java.sql.Date;

import fr.ehpad.entity.Pensionnaire;
import fr.ehpad.entity.Prescription;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PrescriptionDAO {

	public Prescription getPrescriptionbyID(Integer idPensionnaire) throws SQLException {
		// ouvrir un canal de requettage.
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM prescription WHERE id_pensionnaire=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, idPensionnaire);
		ResultSet res = state.executeQuery();
		res.next();
		while (res.next()) {
			Integer idMedicament = res.getInt("id_medicament");
			String noRPPS = res.getString("no_RPPS");
			Integer idPersonne = res.getInt("id_personne");
			LocalDate jour = LocalDate.parse(res.getString("jour"));
			String posologie = res.getString("posologie");
			LocalDate dateDebutTraitement = LocalDate.parse(res.getString("date_debut_traitement"));
			LocalDate dateFinTraitement = LocalDate.parse(res.getString("date_fin_traitement"));
			
			Prescription pres = new Prescription(idMedicament, idPersonne, jour, dateDebutTraitement, dateFinTraitement, posologie, noRPPS);
			
			String sql2 = "SELECT * FROM medicament WHERE id_medicament=?;";
			String medicament = res.getString("id_medicament");
			PreparedStatement state2 = con.prepareCall(sql2);
			state2.setInt(1, idMedicament);
			ResultSet res2 = state2.executeQuery();
			res2.next();
			while (res2.next()) {
				String medicNom = res2.getString("nom");
				String medicFonction = res2.getString("fonction");
				String stock = res2.getString("stock");
				System.out.println(medicNom + " " + medicFonction + " " + stock);
			}
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
