<%-- 
    Document   : header
    Created on : 14 déc. 2022, 14:33:08
    Author     : SALL Mouhamadou
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="En-tête des pages"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title" required="true" description="titre de la page" %>

<!DOCTYPE html>
<html>
  <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
  </head>
  <body>
 <nav>
        <h1><a href="url">EHPAD</a></h1>
        <ul>
            <li><a href="url">ACCUEIL</a></li>
            <li><a href="url">A PROPOS</a></li>
            <li><a href="url">NOS SERVICES</a></li>
            <li><a href="url">FAIRE SA DEMANDE</a></li>
            <li><a href="url">CONTACT</a></li>
        </ul>
    </nav>
  </body>
</html>