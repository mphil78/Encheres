package fr.eni.eniencheres.bll;

import java.io.IOException;
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

import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.DALException;
import fr.eni.eniencheres.dal.DAOFactory;
import fr.eni.eniencheres.dal.UtilisateurDAO;

/**
 * Servlet implementation class TraitementUtilisateur
 */
@WebServlet("/TraitementConnexion")
public class TraitementConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TraitementConnexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/Accueil");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//variables
		boolean pseudoOk = false;
		boolean passOk = false;
		String pseudoUtilisateur = "";
		HttpSession session = request.getSession();
		UtilisateurManager utilisateurManager = new UtilisateurManager();
		String pseudoConnexion = request.getParameter("identifiant");
		String mdpConnexion = request.getParameter("motDePasse");
		Map<String, String> listeIdentifiants = utilisateurManager.getAllIdentifiants();
		
		//teste si pseudo et mdp correrspondent à une entrée dans la bdd
		for(Entry<String, String> user : listeIdentifiants.entrySet()) {
			String pseudo = user.getKey();
			String mdp = user.getValue();
		    if (pseudo.equals(pseudoConnexion)) {
				pseudoOk = true;
				if (mdp.equals(mdpConnexion)) {
					passOk = true;
					pseudoUtilisateur=pseudo;
				}
		    }
		}
		
		//redirection adaptée
		if (pseudoOk && passOk) {
			session.setAttribute("pseudo", pseudoUtilisateur);
			RequestDispatcher rd = request.getRequestDispatcher("/Accueil");
			rd.forward(request, response);
		} else {
			request.setAttribute("erreurConnexion", "La connexion a échoué. Veuillez réessayer.");
			RequestDispatcher rd = request.getRequestDispatcher("/Connexion");
			rd.forward(request, response);
		}

	}

}
