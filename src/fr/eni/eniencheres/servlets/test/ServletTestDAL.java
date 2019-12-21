package fr.eni.eniencheres.servlets.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.DALException;
import fr.eni.eniencheres.dal.DAOFactory;
import fr.eni.eniencheres.dal.UtilisateurDAO;

/**
 * Servlet implementation class ServletTestDAL
 */
@WebServlet("/ServletTestDAL")
public class ServletTestDAL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTestDAL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		//Instanciation du jeu d'essai 
			Utilisateur u1 = new Utilisateur(
					"titi", 
					"DELAFONTAINE", 
					"Robert", 
					"tito@gmail.com", 
					"0606060606", 
					"12 rue du Corbeau et du Renard", 
					"44444",
					"TDCDM",
					"motdepasse", 
					600, 
					false);
			try {
				utilisateurDAO.insert(u1);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
