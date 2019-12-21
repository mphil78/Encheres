package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Retrait;

public interface RetraitDAO {
	//Sélectionner une categorie par l'id de l'article
	public Retrait selectByIdArticle(int id) throws DALException;
	
}
