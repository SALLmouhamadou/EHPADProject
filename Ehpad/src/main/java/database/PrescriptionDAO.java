package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrescriptionDAO {
	private Connection con = null;
	private boolean Connected = false;

	public void initialiser() {
		System.out.println("Tout va aller");
		// charger le driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver chargé");
			con = DriverManager.getConnection("jdbc:mysql://localhost/ehpad?serverTimezone=UTC", "root", "dadou91420");
			System.out.println("Connexion établie");
			Connected = true;
		} catch (Exception e) {
			Connected = false;
			System.out.println("Pas de driver ou pas de connexion");
		}
	}

	public void charger() {
		// ouvrir un canal de requettage.

		try {
			Statement canal = con.createStatement();
			ResultSet res = canal.executeQuery("SELECT * FROM prescription WHERE id_pensionnaire=1;");
			res.next();
			while (res.next()) {
				String medicament = res.getString("id_medicament");
				String posologie = res.getString("posologie");
				System.out.println(medicament + " ID : " + posologie);
			}

			PreparedStatement canal2 = con.prepareStatement("select * from exemple where id= ?");
			canal2.setInt(1, 0);
			ResultSet res2 = canal2.executeQuery();
			while (res2.next()) {
				String n = res2.getString("nom");
				int i = res2.getInt("id");
				System.out.println(n);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
