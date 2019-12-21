<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">
  <head>
    <!-- Required meta tags -->
    <link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
    crossorigin="anonymous">
    <title>Liste Enchères</title>
  </head>
  <body>
    
    <div class="container">
	    
	    <nav class="navbar navbar-expand-sm navbar-light bg-light mb-3">
	        <div class="container">
	            <h5>Eni-Enchères</h5>
	            
                 <a class="nav-link" href="./Connexion">S'inscrire - Se connecter </a>
            		            	            
                 <a class="nav-link" href="./NouvelleVente">Enchères </a>
            
                 <a class="nav-link" href="./NouvelleVente">Vendre un article</a>
             	                
                 <a class="nav-link" href="./TraitementProfile"><%=session.getAttribute("pseudo") %></a>
           	               
                 <a class="nav-link" href="./Connexion">Déconnexion</a>
	                   
	        </div>
    	</nav>
	    
	    <h6>Liste des enchères</h6>  
		<h7>Filtres :</h7>
		
		<div class="input-group input-focus col-sm-8" >
	  		<div class="input-group-prepend">
	   		 	<span class="input-group-text bg-white"><i class="fa fa-search"></i></span>
	  		</div>
	  		<input type="search" placeholder="Le nom de l'article contient" class="form-control border-left-0">
		</div>
		
		<div class="col-auto my-1">
			<label class="mr-sm-2" for="inlineFormCustomSelect">Catégorie :</label>
			<select class="custom-select mr-sm-2 col-sm-2" id="inlineFormCustomSelect">
		        <option selected>Toutes</option>
		        <option value="1">Informatique</option>
		        <option value="2">Ameublement</option>
		        <option value="3">Vêtement</option>
		        <option value="4">Sport&Loisir</option>
		     </select>
		</div>
		
		
		<div>
			<div class="form-check">
	  			<div class="row">
	  				<div class="col">
			  			<input class="form-check-input" type="radio" name="achatVente" id="achats" value="achats" >
			  			<label class="form-check-label" for="achats">Achats</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="encheresOuvertes" id="encheresOuvertes">
			  			<label class="form-check-label" for="defaultCheck1">enchères ouvertes</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="encheresCours" id="encheresCours">
			  			<label class="form-check-label" for="encheresCours">mes enchères en cours</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="ecnheresRemportees" id="ecnheresRemportees">
			  			<label class="form-check-label" for="ecnheresRemportees">mes enchères remportées</label>
			  		</div>
			  		
	  				<div class="col">
			  			<input class="form-check-input" type="radio" name="achatVente" id="mesVentes" value="mesVentes" checked>
			  			<label class="form-check-label" for="exampleRadios1">Mes ventes</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="ventesEncours" id="ventesEncours">
			  			<label class="form-check-label" for="ventesEncours">mes ventes en cours</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="ventesNondebutees" id="ventesNondebutees">
			  			<label class="form-check-label" for="ventesNondebutees">ventes non débutées</label>
			  			<br>
			  			<input class="form-check-input" type="checkbox" value="ventesTerminees" id="ventesTerminees">
			  			<label class="form-check-label" for="ventesTerminees">ventes terminées</label>
	  				</div>
			  		
			  	</div>
			</div>
		
			<div>  
				<button type="button" class="btn btn-primary btn-lg">Rechercher</button>
			</div>  
	
		</div>
		
		<div>
			<fieldset>
				<div class="row">
					<div class="col">
						<%=request.getAttribute("urlImage")%>
					</div>
					<div>
						<%=request.getAttribute("nomArticle") %><br>
						Prix : <%=request.getAttribute("prixVente") %><br>
						Fin de l'enchère : <%=request.getAttribute("dateFinEncheres")%><br>
						Vendeur : <a href="./Profile"><%=request.getAttribute("vendeur")%></a><br>
					</div>
				</div>
			</fieldset>
		</div>	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    
  </body>
</html>