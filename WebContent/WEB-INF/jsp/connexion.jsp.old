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
	
    <title>Connexion</title>
  </head>
  <body>
    <h1>Eni-Enchère</h1><br><br>
    
    <%
    if (request.getAttribute("erreurConnexion") != null) {
    %>
    	
    <%=request.getAttribute("erreurConnexion") %>
    
    <%
    }
    %>
        
	<div class="col">
  		<form name="formulaire" action="./TraitementConnexion" method="post">
		  <div class="form-group row">
    		<label for="identifiant" class="col-sm-2 col-form-label">Identifiant</label>
    		<div class="col-sm-4">
      			<input type="text" class="form-control" id="identifiant" name="identifiant">
    		</div>
  		  </div>
  		  <div class="form-group row">
    		<label for="password" class="col-sm-2 col-form-label">Mot de passe</label>
    		<div class="col-sm-4">
     			<input type="password" class="form-control" id="password" name="motDePasse">
			</div>
  		  </div>
		  <div >
		 	
				<input type="submit" value="Connexion"/>
			
		  </div>
		  <div class="form-check">
	  			<input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
	  			<label class="form-check-label" for="defaultCheck1">Se souvenir de moi</label>
		  </div>
		</form>

		<div>
				<a href="">Mot de passe oublié</a>
			</div>

		
	</div>
	
	<br>
	<div>
		<a href="">
			<input type="button" value="Créer un compte"/>
		</a>
	</div>
	  
	  
	  
	  
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>

