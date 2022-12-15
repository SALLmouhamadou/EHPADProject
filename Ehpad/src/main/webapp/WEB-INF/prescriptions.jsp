<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prescription</title>
    </head>
    <body>
        <h3>De quel pensionnaire souhaitez-vous obtenir la prescription ?</h3>

        <form action="prescription" method="get">
            <div>
                <label for="nom"> Nom </label><br>
                <input type="text" name="nom" placeholder="Entrez votre nom" required>
                ${nomMessage}
            </div>
            <div>
                <label for="prenom"> Prénom </label><br>
                <input type="text" name="prenom" placeholder="Entrez votre prennom" required>
                ${prenomMessage}
            </div>
            <div>
                <input type="Submit" value="Valider">
                <input type="reset"  value="Reset">
            </div>
            <c:if test="${candidatMessage != null}">
                <div class="erreur">${candidatMessage}</div>
            </c:if>
        </form>
    </body>
</html>
