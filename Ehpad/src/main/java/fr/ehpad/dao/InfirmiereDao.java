package fr.ehpad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.ehpad.entity.Infirmiere;
import fr.ehpad.entity.Medicament;

public class InfirmiereDao {
	public static Infirmiere getByNoRpps(String noRpps) throws SQLException {
		// ouvrir un canal de requettage.
		Connection con = Database.getConnection();
		String sql = "SELECT * FROM infirmiere WHERE no_rpps=?;";
		PreparedStatement state = con.prepareCall(sql);
		state.setString(1, noRpps);
		ResultSet res = state.executeQuery();
		res.next();
		String norpps = res.getString("no_rpps");
		Integer idPersonne = res.getInt("id_personne");

		Infirmiere infirm = new Infirmiere(norpps);

		return infirm;
	}
}
