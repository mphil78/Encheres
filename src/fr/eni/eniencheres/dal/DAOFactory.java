package fr.eni.eniencheres.dal;

public class DAOFactory {
	public static UtilisateurDAO getUtilisateurDAO ()  {
		UtilisateurDAO utilisateurDAO=null;
		try {
			utilisateurDAO=(UtilisateurDAO) Class.forName("fr.eni.eniencheres.dal.jdbc.UtilisateurDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return utilisateurDAO; 
	}
	
	public static CategorieDAO getCategorieDAO ()  {
		CategorieDAO categorieDAO=null;
		try {
			categorieDAO=(CategorieDAO) Class.forName("fr.eni.eniencheres.dal.jdbc.CategorieDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categorieDAO; 
	}

	public static RetraitDAO getRetraitDAO() {
		RetraitDAO retraitDAO=null;
		try {
			retraitDAO=(RetraitDAO) Class.forName("fr.eni.eniencheres.dal.jdbc.RetraitDAODAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retraitDAO; 
	}
	
	public static ArticleVenduDAO getArticleDAO() {
		ArticleVenduDAO articleDAO=null;
		try {
			articleDAO=(ArticleVenduDAO) Class.forName("fr.eni.eniencheres.dal.jdbc.ArticleVenduDAOJdbcImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleDAO; 
	}
	
	
	
}
