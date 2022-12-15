package fr.ehpad.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.ehpad.dao.AdministreMedicament;
import fr.ehpad.dao.InfirmiereDao;
import fr.ehpad.dao.MedicamentDao;
import fr.ehpad.dao.PersonneDao;
import fr.ehpad.dao.PrescriptionDao;
import fr.ehpad.entity.Infirmiere;
import fr.ehpad.entity.Medicament;
import fr.ehpad.entity.Personne;
import fr.ehpad.entity.Prescription;

/**
 * Servlet implementation class ServletPrescription
 */
@WebServlet("administrerMedicament")
public class AdministrationMedicamentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrationMedicamentServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String medicament = request.getParameter("medicament");
		
		System.out.println(nom + " " + prenom);
		
		try {
			Personne pers = PersonneDao.getByPatronyme(nom, prenom);
			Medicament medic = MedicamentDao.getByNom(medicament);
			Infirmiere infirm = InfirmiereDao.getByNoRpps("12345678901");
			 // traitement
		    int result = AdministreMedicament.setAdministration(pers, medic, infirm);
		    boolean isSuccess;
		    if (result == 0)
		    	isSuccess = false;
		    else
		    	isSuccess = true;
		    
		    HttpSession maSession = request.getSession();
		    maSession.setAttribute("nom", pers.getNom());
		    maSession.setAttribute("prenom", pers.getPrenom());
		    maSession.setAttribute("medicament", medic.getNom());
		    String resultMessage = "L'administration d'un médicament par " + infirm.getNo_RPPS() 
		    + " pour le patient " + pers.getNom() + " " + pers.getPrenom() + "est un " + (isSuccess ? "succès" : "échec") + ".";
		    maSession.setAttribute("result", resultMessage);
		    
		} catch (SQLException e) {
			HttpSession maSession = request.getSession();
			maSession.setAttribute("result", "L'entrée dans la base de donnée de l'administration du médicament est un échec.");
			e.printStackTrace();
		}
		
	    // fin aller vers une page
	    getServletContext().getRequestDispatcher("/prescriptions.jsp").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
