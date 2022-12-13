package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.greta.cda.entity.Article;
import fr.greta.cda.entity.Login;
import fr.greta.cda.entity.Panier;

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
		
		Article ca = new Article(nom, prix, quantite);
	    
	    // sauver n sur la session
	    HttpSession maSession = request.getSession();
	    Panier panier = (Panier) maSession.getAttribute("Panier");
	    Login particulier = (Login) maSession.getAttribute("Login");
	    if (panier.equals(null))
	    	panier = new Panier(particulier);
	    panier.ajouterArticle(ca);
	    System.out.println("Nombre d'articles : " + panier.getNombreArticle());
	    maSession.setAttribute("Panier", panier);  // créer la variable dnas le tab de session
	    
	    // traitement
	    
	    // fin aller vers une page
	    getServletContext().getRequestDispatcher("/Article.html").forward(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
