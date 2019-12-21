package fr.eni.eniencheres.dal;

import java.util.List;

import fr.eni.eniencheres.bo.ArticleVendu;



public interface ArticleVenduDAO {
		//Sélectionner un article par son id
		public ArticleVendu selectById(int id) throws DALException;
		
		//Sélectionner tous les articles
		public List<ArticleVendu> selectAll() throws DALException;
		
		//Insérer un nouvel article
		public void insert(ArticleVendu article) throws DALException;
		
		//Supprimer un article
		public void delete(ArticleVendu articleVendu) throws DALException;
		
		//Modifier un article
		public void update(ArticleVendu articleVendu) throws DALException;
		
		//Sélectionner les articles par mot clé
		//On recherche le mot clé dans le nom et la description
		public List<ArticleVendu> selectByMotCle(String motCle) throws DALException;
		
		//Sélectionner les articles par catégorie
		public List<ArticleVendu> selectByCategorie(int noCategorie) throws DALException;
		
		//Selectionner les articles par mot clé(nom et description) ET catégorie
		public List<ArticleVendu> selectByFiltres(String motCle, int noCategorie) throws DALException;
}

