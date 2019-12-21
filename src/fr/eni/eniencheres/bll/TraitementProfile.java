package fr.eni.eniencheres.bll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.eniencheres.bo.ArticleVendu;
import fr.eni.eniencheres.bo.Enchere;
import fr.eni.eniencheres.bo.Utilisateur;

/**
 * Servlet implementation class TraitementProfile
 */
@WebServlet("/TraitementProfile")
public class TraitementProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraitementProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		UtilisateurManager utilisateurManager = new UtilisateurManager();

		RequestDispatcher rd = request.getRequestDispatcher("/MonProfile");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		String pseudo = request.getParameter("pseudo");
		Map<String, String> listeIdentifiants = utilisateurManager.getAllIdentifiants();
		boolean pseudoOk = true;
		
		//teste si pseudo correrspond à une entrée dans la bdd
		for(Entry<String, String> user : listeIdentifiants.entrySet()) {
			String pseudoBdd = user.getKey();
		    if (pseudoBdd.equals(pseudo)) {
				pseudoOk = false;	
		    }
		}
		
		//crée une instance pojo utilisateur avec les données
		Utilisateur newUtilisateur = new Utilisateur();
		newUtilisateur.setPseudo(request.getParameter("pseudo"));
		newUtilisateur.setNom(request.getParameter("nom"));
		newUtilisateur.setPrenom(request.getParameter("prenom"));
		newUtilisateur.setEmail(request.getParameter("email"));
		newUtilisateur.setTelephone(request.getParameter("telephone"));
		newUtilisateur.setRue(request.getParameter("rue"));
		newUtilisateur.setCodePostal(request.getParameter("codePostal"));
		newUtilisateur.setVille(request.getParameter("ville"));
		newUtilisateur.setMotDePasse(request.getParameter("password"));
		int credit = 0;
		boolean administrateur = false;
		List<ArticleVendu> vente = new ArrayList<>();
		List<ArticleVendu> listeArticlesAchete = new ArrayList<>();
		List<Enchere> listeEncheres = new ArrayList<>();
		newUtilisateur.setCredit(credit);
		newUtilisateur.setAdministrateur(administrateur);
		newUtilisateur.setVente(vente);
		newUtilisateur.setListeArticlesAchete(listeArticlesAchete);
		newUtilisateur.setListeEncheres(listeEncheres);
		
		
		if (!pseudoOk) {
			//on envoie l'erreur sur le pseudo et l'objet utilisateur
			request.setAttribute("erreurPseudo", "Veuillez choisir un autre pseudo.");
			request.setAttribute("utilisateur", newUtilisateur);
			RequestDispatcher rd = request.getRequestDispatcher("/MonProfile");
			rd.forward(request, response);
		}else {
			utilisateurManager.addUtilisateur(newUtilisateur);
			session.setAttribute("pseudo", newUtilisateur.getPseudo());
			RequestDispatcher rd = request.getRequestDispatcher("/Accueil");
			rd.forward(request, response);
		}
		
		
	}

}
