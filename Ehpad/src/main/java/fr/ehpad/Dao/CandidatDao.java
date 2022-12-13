package fr.ehpad.Dao;

import database.Database;
import fr.ehpad.entity.Personne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SALL Mouhamadou
 */
public class CandidatDao {
    public static void insert(Personne candidat) throws SQLException{
        Connection connexion = Database.getConnection();
        String  sql ="INSERT INTO personne( nom, prenom, email, pwd, telephone) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt = connexion.prepareCall(sql);
        stmt.setString(1, candidat.getNom());
        stmt.setString(2, candidat.getPrenom());
        stmt.setString(3, candidat.getEmail());
        stmt.setString(4, candidat.getPassword());
        stmt.setString(5, candidat.getTelephone());
        stmt.executeUpdate();
        connexion.close();
    }
}
