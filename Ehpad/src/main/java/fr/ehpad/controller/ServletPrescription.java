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

import fr.ehpad.dao.MedicamentDao;
import fr.ehpad.dao.PersonneDao;
import fr.ehpad.dao.PrescriptionDao;
import fr.ehpad.entity.Medicament;
import fr.ehpad.entity.Personne;
import fr.ehpad.entity.Prescription;

/**
 * Servlet implementation class ServletPrescription
 */
@WebServlet("/prescription")
public class ServletPrescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPrescription() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		System.out.println(nom + " " + prenom);
		
		try {
			Personne pers = PersonneDao.getPersonnebyPatronyme(nom, prenom);
			 // traitement
		    HashMap<Integer, Prescription> pres = PrescriptionDao.getPrescriptionbyID(pers.getIdPersonne());
		    Set<Integer> lesClefs = pres.keySet();
		    HashMap<Integer, Medicament> lesMedocs = new HashMap<>();
		    int index = 0;
		    
		    for (Integer unePres : lesClefs) {
		    	Prescription pre = pres.get(unePres);
		    	Medicament medic = MedicamentDao.getMedicamentbyID(pre.getIdMedicament());
		    	lesMedocs.put(index, medic);
		    	index++;
		    	// sauver n sur la session
		    }
		    HttpSession maSession = request.getSession();
		    System.out.println("Nombre de prescriptions : " + pres.size());
		    
		    maSession.setAttribute("nom", pers.getNom());
		    maSession.setAttribute("prenom", pers.getPrenom());
		    maSession.setAttribute("medicaments", lesMedocs);
		    maSession.setAttribute("prescriptions", pres);
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	    // fin aller vers une page
	    getServletContext().getRequestDispatcher("/prescriptions.jsp").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
