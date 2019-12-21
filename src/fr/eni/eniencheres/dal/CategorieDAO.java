package fr.eni.eniencheres.dal;

import fr.eni.eniencheres.bo.Categorie;

public interface CategorieDAO {

	//Sélectionner une categorie par son id pour article
	public Categorie selectByIdArticle(int id) throws DALException;
	
}
