package fr.ehpad.dao;
import fr.ehpad.entity.Personne;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SALL Mouhamadou
 */
public class CandidatDao {
    public static void insert(Personne candidat) throws SQLException{
        Connection connexion = Database.getConnection();
        String  sql ="INSERT INTO personne( nom, prenom,date_naissance, email, pwd, telephone) VALUES(?, ?, ?, ?, ?,?)";
        PreparedStatement stmt = connexion.prepareCall(sql);
        stmt.setString(1, candidat.getNom());
        stmt.setString(2, candidat.getPrenom());
        stmt.setDate(3, Date.valueOf(candidat.getDateNaissance()));
        stmt.setString(4, candidat.getEmail());
        stmt.setString(5, candidat.getPwd());
        stmt.setString(6, candidat.getTelephone());
        stmt.executeUpdate();
        connexion.close();
    }
    
//    public static void insertAdmission(Personne admis) throws SQLException{
//        Connection connexion = Database.getConnection();
//        String  sql ="INSERT INTO statut_candidature(jour, commentaire) VALUES(?, ?)";
//        PreparedStatement stmt = connexion.prepareCall(sql);
//        stmt.setDate(3, Date.valueOf("'now()'"));
//        stmt.setString(2, admis.getCommentaire());
//    }
}
