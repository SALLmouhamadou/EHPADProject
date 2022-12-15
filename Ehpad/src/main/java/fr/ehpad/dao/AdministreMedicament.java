package fr.ehpad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import fr.ehpad.entity.Infirmiere;
import fr.ehpad.entity.Medicament;
import fr.ehpad.entity.Personne;

//* Return success state (true if success)
public class AdministreMedicament {
	public static int setAdministration(Personne pers, Medicament medic, Infirmiere infirm) throws SQLException {
		Connection con = Database.getConnection();
		String sql = "INSERT INTO administre_medicament(id_personne, id_medicament, heure, no_rpps)\r\n"
				+ "VALUES (?, ?, NOW(), ?);";
		PreparedStatement state = con.prepareCall(sql);
		state.setInt(1, pers.getIdPersonne());
		state.setInt(2, medic.getId_medicament());
		state.setString(3, infirm.getNo_RPPS());
		int res = state.executeUpdate();
		
		return res;
	}
}
