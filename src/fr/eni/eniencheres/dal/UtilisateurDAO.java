package fr.eni.eniencheres.dal;

import java.util.List;
import java.util.Map;

import fr.eni.eniencheres.bo.Utilisateur;

public interface UtilisateurDAO {
	
	//Sélectionner tous les pseudos
	public List<String> selectAllPseudos() throws DALException;

	//Sélectionner un utilisateur par son id
	public Utilisateur selectById(int id) throws DALException;
	
	//Sélectionner un utlisateur par son id pour article
	public Utilisateur selectByIdArticle(int id) throws DALException;
	
	//Sélectionner tous les utlisateurs
	public List<Utilisateur> selectAll() throws DALException;
	
	//Insérer un nouvel utilisateur
	public void insert(Utilisateur utilisateur) throws DALException;
	
	//Supprimer un utilisateur
	public void delete(Utilisateur utilisateur) throws DALException;
	
	//Modifier un utilisateur
	public void update(Utilisateur utilisateur) throws DALException;
	
	//Retourne une HashMap de tous les <pseudo, mdp>
	public Map<String, String> selectAllIdentifiants() throws DALException;

	//Retourne un objet utilisateur en fonction du pseudo
	public Utilisateur selectByPseudo(String pseudo);
	
}
