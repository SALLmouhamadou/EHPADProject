<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Injection</title>
    </head>
    <body>
        <h3>Administration d'un médicament</h3>
		
        <div>
<form action="candidat" method="post">
            <div>
                <label for="nom"> Nom du patient </label><br>
                <input type="text" name="nom" placeholder="Entrez votre nom" required>
                ${nomMessage}
            </div>
            <div>
                <label for="prenom"> Prénom du patient </label><br>
                <input type="text" name="prenom" placeholder="Entrez votre prennom" required>
                ${prenomMessage}
            </div>
            <div>
                <label for="email"> Nom du médicament </label><br>
                <input type="text" name="medicament" placeholder="Entrez votre email" required>
                ${emailMessage}
            </div>
            <div>
                <input type="Submit" value="Valider">
                <input type="reset"  value="Reset">
            </div>
            <c:if test="${candidatMessage != null}">
                <div class="erreur">${candidatMessage}</div>
            </c:if>
        </form>        
        </div>
    </body>
</html>
