package fr.eni.eniencheres.dal.jdbc;

import fr.eni.eniencheres.bo.Enchere;
import fr.eni.eniencheres.dal.DALException;
import fr.eni.eniencheres.dal.EnchereDAO;

public class EnchereDAOJdbcImpl implements EnchereDAO {
	//TODO FixMe
	private static final String sqlInsert =
			"insert "
			+ "into ENCHERES(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur)"
			+ " values(?,?,?,?,?,?,?,?,?,?,?)";
	
	@Override
	public void insert(Enchere enchere) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
