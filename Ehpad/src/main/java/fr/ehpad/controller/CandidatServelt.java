package fr.ehpad.controller;

import fr.ehpad.Dao.CandidatDao;
import fr.ehpad.entity.Personne;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SALL Mouhamadou
 */
@WebServlet(name = "CandidatServelt", urlPatterns = {"/candidat"})
public class CandidatServelt extends HttpServlet {

    private final static String VUE = "/WEB-INF/confirmation.jsp";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //System.out.println("Je suis entré");
        boolean isValid = true;
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");

        String date = request.getParameter("date");
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateNaissance = LocalDate.parse(date, formatter);
        String confirmationEmail = request.getParameter("confirmationEmail");
        String password = request.getParameter("password");
        String confirmationPassword = request.getParameter("confirmationPassword");
        String telephone = request.getParameter("telephone");
        String commentaire = request.getParameter("commentaire");
        if (nom == null || nom.trim().equals("")) {
            isValid = false;
            request.setAttribute("nomMessage", "Nom obligatoire");
        }
        if (prenom == null || prenom.trim().equals("")) {
            isValid = false;
            request.setAttribute("prenomMessage", "Prenom obligatoire");
        }
        if (email == null || email.trim().equals("")) {
            isValid = false;
            request.setAttribute("EmailMessage", "Email obligatoire");
        }
        if (confirmationEmail == null || !confirmationEmail.trim().equals(email)) {
            isValid = false;
            request.setAttribute("confirmationEmailMessage", "Doit être identique au email");
        }
        if (password == null || password.trim().equals("")) {
            isValid = false;
            request.setAttribute("passwordMessage", "Mots de passe obligatoire");
        }
        if (confirmationPassword == null || !confirmationPassword.trim().equals(password)) {
            isValid = false;
            request.setAttribute("confirmationPasswordMessage", "Doit être identique au mots de passe");
        }
        if (telephone == null || telephone.trim().equals("")) {
            isValid = false;
            request.setAttribute("telephoneMessage", "telephone obligatoire");
        }
        System.out.println(nom + " " + prenom + " née le " + dateNaissance + " votre adresse email " + email + "confirmation de votre email " + confirmationEmail + " votre mots passe " + password + " confirmation mots passe " + confirmationPassword + " " + telephone);
        if (isValid) {
            try {
                Personne candidat = new Personne(nom, prenom, email, password, telephone);
                CandidatDao.insert(candidat);
                request.setAttribute("candidatMessage", "votre demande a bien été transmis");
                getServletContext().getRequestDispatcher(VUE).forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(CandidatServelt.class.getName()).log(Level.SEVERE, null, ex);
                request.setAttribute("candidatMessage", ex.getMessage());
            }

        } else {
            request.setAttribute("candidatMessage", "Votre inscription n'a pas été transmis");
            getServletContext().getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
        }

    }

}
