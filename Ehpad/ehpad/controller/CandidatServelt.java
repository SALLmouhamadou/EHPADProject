/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package fr.ehpad.controller;

import java.io.IOException;
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
    
    private final static String VUE="/WEB-INF/confirmation.jsp";

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean isValid = true;
       String nom =request.getParameter("nom");
       String prenom =request.getParameter("prenom");
       String email =request.getParameter("email");
       String date =  request.getParameter("date");
       String confirmationEmail =request.getParameter("confirmationEmail");
       String password =request.getParameter("password");
       String confirmationPassword =request.getParameter("confirmationPassword");
       String telephone =request.getParameter("telephone");
       
       if(nom == null || nom.trim().equals("")){
           isValid =false;
           request.setAttribute("nomMessage", "Nom obligatoire");
        }
       if(prenom == null || prenom.trim().equals("")){
           isValid =false;
           request.setAttribute("prenomMessage", "Prenom obligatoire");
        }
       if(email == null || email.trim().equals("")){
           isValid =false;
           request.setAttribute("EmailMessage", "Email obligatoire");
        }
       if(confirmationEmail == null || !confirmationEmail.trim().equals(email)){
           isValid =false;
           request.setAttribute("confirmationEmailMessage", "Doit être identique au email");
        }
       if(password == null || password.trim().equals("")){
           isValid =false;
           request.setAttribute("passwordMessage", "Mots de passe obligatoire");
        }
       if(confirmationPassword == null || !confirmationPassword.trim().equals(password)){
           isValid =false;
           request.setAttribute("confirmationPasswordMessage", "Doit être identique au mots de passe");
        }
       if(telephone == null || telephone.trim().equals("")){
           isValid =false;
           request.setAttribute("telephoneMessage", "telephone obligatoire");
        }
        System.out.println(nom + " "+ prenom + " née le "+ date +" votre adresse email "+ email + "confirmation de votre email "+confirmationEmail+ " votre mots passe "+ password +" confirmation mots passe "+ confirmationPassword + " "+ telephone);
       if (isValid) {
              getServletContext().getRequestDispatcher(VUE).forward(request, response);
            }
       else{
           request.setAttribute("candidatMessage", "Votre inscription n'a pas été transmis");
           getServletContext().getRequestDispatcher("/WEB-INF/candidat.jsp").forward(request, response);
       }
      
      
       
    }
    
}
