package fr.eni.eniencheres.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.eniencheres.bo.ArticleVendu;
import fr.eni.eniencheres.bo.Enchere;
import fr.eni.eniencheres.bo.Retrait;
import fr.eni.eniencheres.bo.Utilisateur;
import fr.eni.eniencheres.dal.DALException;
import fr.eni.eniencheres.dal.RetraitDAO;

public class RetraitDAOJdbcImp implements RetraitDAO {
	
	private static final String sqlSelectById =
			"select *" 
			+" from RETRAITS"
			+ " where no_article = ?";
	
	@Override
	public Retrait selectByIdArticle(int id) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Retrait retrait = null; 
		try {
			cnx = ConnectionProvider.getConnection();
			rqt = cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);
			rs = rqt.executeQuery();
			if (rs.next()){
				retrait = new Retrait(
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville")
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
		return retrait;


	}

}
