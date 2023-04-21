<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Etudiants</title>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
    Liste des Etudiants
  </div>
  <div class="card-body">
       
      <table class="table table-striped">
        <tr>
          <th>ID</th><th>Nom Etudiant</th><th>Prenom</th><th>Email</th><th>Niveau</th><th>Date de naissance</th><th>Age</th><th>Suppression<th>Edition</th>
         </tr>
         <c:forEach items="${Etudiants}" var="p">
           <tr>
              <td>${p.id }</td>
              <td>${p.nom }</td>
              <td>${p.prenom }</td>
              <td>${p.email }</td>
              <td>${p.niveau }</td>
              <td>${p.date_naissance }</td>
              <td>${p.age }</td>
                
              <td><a onclick="return confirm('Etes-vous s�r ?')" href="supprimerEtudiant?id=${p.id }">Supprimer</a></td>
               <td><a href="modifierEtudiant?id=${p.id }">Edit</a></td>
           </tr>
         </c:forEach>        
      </table>
  </div>
</div>
</div>
</body>
</html>