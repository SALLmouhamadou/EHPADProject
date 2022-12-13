<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidat</title>
    </head>
    <body>
        <h3> Veuillez remplir ce formulaire</h3>

        <form action="candidat" method="post">
            <div>
                <label for="nom"> Nom </label><br>
                <input type="text" name="nom" placeholder="Entrez votre nom" required>
                <p>${nomMessage}</p>
            </div>
            <div>
                <label for="prenom"> Prénom </label><br>
                <input type="text" name="prenom" placeholder="Entrez votre prennom" required>
                <p>${prenomMessage}</p>
            </div>
            <div>
                <label for="email"> Email </label><br>
                <input type="text" name="email" placeholder="Entrez votre email" required>
                <p>${emailMessage}</p>
            </div>
            <div>
                <label for="confirmationEmail"> Confirmez votre email </label><br>
                <input type="text" name="confirmationEmail" placeholder="confirmation votre email" required>
                <p>${confirmationEmailMessage}</p>
            </div>
            <div>
                <label for="date"> Date de naissance </label><br>
                <input type="date" name="date" required>
            </div>

            <div>
                <label for="password"> Mot de passe </label><br>
                <input type="text" name="password" placeholder="Entrez votre mots de passe" required>
                <p${passwordMessage}></p>
            </div>
            <div>
                <label for="confirmationPassword"> Confirmez votre mots de passe </label><br>
                <input type="text" name="confirmationPassword" placeholder="Entrez votre confirmation mots de passe" required>
                <p>${confirmationPasswordMessage}</p>
            </div>
            <div>
                <label for="telephone"> n° Téléphone </label><br>
                <input type="text" name="telephone" placeholder="Entrez votre tel :+33 06 20 20 20" required>
                <p>${telephoneMessage}</p>
            </div>
            <div>
                <label for="commentaire"> commentaire </label><br>
                <input type="text" name="commentaire" placeholder="Veuillez écrire ici votre message">
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
