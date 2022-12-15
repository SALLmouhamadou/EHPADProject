<%-- 
    Document   : confirmation
    Created on : 11 déc. 2022, 17:42:39
    Author     : SALL Mouhamadou
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation</title>
    </head>
    <body>
        <h1>Votre inscription est bien faite</h1>
        <h2> Voulez-vous faire une demande admission
        <form action="verifNon" method="post">
            <button type="submit">Non</button>
        </form><br>
        <form action="verifOui" method="post">
            <button type="submit">Oui</button>
        </form>
        <h3>${admissionMessage}</h3>
    </body>
</html>
