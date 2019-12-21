package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Enchere;

public interface EnchereDAO {
	//Insérer un nouvel utilisateur
		public void insert(Enchere enchere) throws DALException;
}
