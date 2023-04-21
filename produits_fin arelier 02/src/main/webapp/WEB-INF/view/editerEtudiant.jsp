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
<title>Modifier un Etudiant</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateEtudiant" method="post">
   <div class="form-group">
      <label class="control-label">ID Etudiant :</label>
       <input type="text" name="idEtudiant" value="${Etudiant.id}" readonly class="form-control"/>
    </div>	
   <div class="form-group">
      <label class="control-label">Nom Etudiant :</label>
       <input type="text" name="nomEtudiant" value="${Etudiant.nom}" class="form-control"/>
    </div>	
     <div class="form-group">
      <label class="control-label">Prenom Etudiant :</label>
       <input type="text" name="prenomEtudiant" value="${Etudiant.prenom}" class="form-control"/>
    </div>	 
    </div>	
     <div class="form-group">
      <label class="control-label">Email Etudiant :</label>
       <input type="text" name="emailEtudiant" value="${Etudiant.email}" class="form-control"/>
    </div>	 
    </div>	
     <div class="form-group">
      <label class="control-label">Niveau Etudiant :</label>
       <input type="text" name="niveauEtudiant" value="${Etudiant.niveau}" class="form-control"/>
    </div>	   
    <div class="form-group">
      <label class="control-label"> Date naissance :</label>
       <fmt:formatDate pattern="yyyy-MM-dd" value="${Etudiant.date_naissance}" var="formatDate" />
       <input type="date" name="date" value="${formatDate}" class="form-control"/>
    </div>	
    <div>
 		  <button type="submit" class="btn btn-primary" a onclick="return confirm('Etes-vous sur ?')" href="listeEtudiants" >Modifier</button>
 	</div>
</form>
</div>
<br/>
<br/>
<a href="listeEtudiants">Liste Etudiants</a>
</div>
</body>
</html>