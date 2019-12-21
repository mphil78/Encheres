package fr.eni.eniencheres.bll;

import java.util.HashMap;
import java.util.Map;

import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.DALException;
import fr.eni.eniencheres.dal.DAOFactory;
import fr.eni.eniencheres.dal.UtilisateurDAO;

public class UtilisateurManager {
	
	private UtilisateurDAO utilisateurDAO;
	
	public UtilisateurManager() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDAO();
	}
	
	public Utilisateur getByPseudo(String pseudo) {
		Utilisateur utilisateur;
		utilisateur=utilisateurDAO.selectByPseudo(pseudo);
		return utilisateur;
	}
	
	public Map<String, String> getAllIdentifiants(){
		Map<String, String> allIdentifiants = new HashMap<String, String>();
		try {
			allIdentifiants = utilisateurDAO.selectAllIdentifiants();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allIdentifiants;
		
	}
	public void addUtilisateur(Utilisateur utilisateur) {
		try {
			utilisateurDAO.insert(utilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
