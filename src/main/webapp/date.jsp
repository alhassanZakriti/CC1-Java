<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <title>Consulter par date</title>
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

    <h1>Liste des employees</h1>

    <form action="listeDate.php" method="post">

        <div class="form-group">
            <label for="dateDebut">Date de debut</label>
            <input type="text" name="dateDebut" id="dateDebut" class="form-control" placeholder="DD-MM-YYYY">
        </div>

        <div class="form-group">
            <label for="dateFin">Date de fin</label>
            <input type="text" name="dateFin" id="dateFin" class="form-control" placeholder="DD-MM-YYYY">
        </div>

        <button type="submit" class="btn btn-primary">Rechercher</button>

    </form>

    <br>
    <h3> Liste des Employes</h3>
    <table class="table table-striped">
        <thead>
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

</body>
</html>
