/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.ehpad.controller;

import fr.ehpad.dao.CandidatDao;
import fr.ehpad.entity.Personne;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
@WebServlet(name = "AdmissionServlet", urlPatterns = {"/admission"})
public class AdmissionServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Je suis dans admission");
        boolean isValid =true;
        String admission = request.getParameter("admission");
        
        if(admission == null || admission.trim().equals("")){
            request.setAttribute(admission, "Mettre informations obligatoire");
        }
        
        if(isValid){
            
           // try {
               // Personne admis =new Personne(admission);
                //CandidatDao.insertAdmission(admis);
                request.setAttribute("admissionMessage", "Votre demande admission a bien été transmis");
                getServletContext().getRequestDispatcher("/WEB-INF/admission.jsp").forward(request, response);
                
           // } catch (SQLException ex) {
               // Logger.getLogger(AdmissionServlet.class.getName()).log(Level.SEVERE, null, ex);
                request.setAttribute("admissionMessage", "Probleme avec la base de données");
                getServletContext().getRequestDispatcher("/WEB-INF/admission.jsp").forward(request, response);
                        
           // }
        }
        else{
            request.setAttribute("admissionMessage","Votre demande n'a pas été transmis" );
        }
        
    }
}
