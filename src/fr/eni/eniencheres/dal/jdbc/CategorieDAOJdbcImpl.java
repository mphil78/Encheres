package fr.eni.eniencheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.eniencheres.bo.ArticleVendu;
import fr.eni.eniencheres.bo.Categorie;
import fr.eni.eniencheres.bo.Enchere;
import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.CategorieDAO;
import fr.eni.eniencheres.dal.DALException;

public class CategorieDAOJdbcImpl implements CategorieDAO {

	private static final String sqlSelectById =
			"select *" 
			+" from CATEGORIES"
			+ " where no_categorie = ?";
	
	
	@Override
	public Categorie selectByIdArticle(int id) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Categorie categorie=null;
		try {
			cnx = ConnectionProvider.getConnection();
			rqt = cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);
			rs = rqt.executeQuery();
			if (rs.next()){
				categorie = new Categorie(
						rs.getInt("no_categorie"),
						rs.getString("libelle")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return categorie;


	}

}
