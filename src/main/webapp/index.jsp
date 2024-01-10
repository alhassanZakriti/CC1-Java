<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <title>Home</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">

    <div class="container">
        <h1>Ajouter un Employee</h1>
        <form action="ajouter.php" method="post">
            <input type="text" name="nom" placeholder="Nom">
            <select name="service" id="service" >
                <option value="">-- Choisir un service --</option>
                <option value="vente">Vente</option>
                <option value="recrutement">Recrutement</option>
                <option value="comptabilite">Comptabilite</option>
                <option value="marketing">Marketing</option>
                <option value="operations">Operations</option>
                <option value="it">IT</option>
                <option value="manager">Manager</option>
                <option value="administration">Administration</option>
            </select>
            <input type="text" name="salaire" placeholder="Salaire">
            <input type="text" name="dateEmbauche" id="dateEmbauche" placeholder="DD-MM-YYYY" >
            <button type="submit" class="btn">Ajouter</button>
        </form>
        <br>
        <h2> Liste des Employes</h2>
        <table class="table table-striped">
            <thead >
            <tr class="table-head" >
                <th class="id">ID</th>
                <th class="nom">Nom</th>
                <th class="service">Service</th>
                <th class="date">Date d'embauche</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${modele.emodel}" >
                <tr class="table-in">
                    <td class="id">${e.id}</td>
                    <td class="nom">${e.nom}</td>
                    <td class="service">${e.service}</td>
                    <td class="date">${e.dateEmbauche}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </div>

<%--    <h1>Ajouter un employé</h1>--%>

<%--    <form action="ajouter.php" method="post">--%>

<%--        <div class="form-group">--%>
<%--            <label for="nom">Nom</label>--%>
<%--            <input type="text" name="nom" id="nom" class="form-control">--%>
<%--        </div>--%>

<%--        <div class="form-group">--%>
<%--            <label for="prenom">Service</label>--%>
<%--            <input type="text" name="service" id="prenom" class="form-control">--%>
<%--        </div>--%>

<%--        <div class="form-group">--%>
<%--            <label for="dateEmbauche">Date d'embauche</label>--%>
<%--            <input type="text" name="dateEmbauche" id="dateEmbauche" class="form-control" placeholder="YYYY-MM-DD">--%>
<%--        </div>--%>

<%--        <button type="submit" class="btn btn-primary">Ajouter</button>--%>

<%--    </form>--%>



</div>

</body>
</html>