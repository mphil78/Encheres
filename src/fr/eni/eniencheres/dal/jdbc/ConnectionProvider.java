package fr.eni.eniencheres.dal.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

abstract class ConnectionProvider {
	private static DataSource dataSource;
	
	static
	{
		Context context;
		try {
			context = new InitialContext();
			ConnectionProvider.dataSource = (DataSource)context.lookup("java:comp/env/jdbc/pool_cnx");
		} catch (NamingException e){
			System.out.println(e.getMessage());
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
	/**
	 * Cette méthode retourne une connection opérationnelle issue du pool de connexion
	 * vers la base de données. 
	 * @return
	 **/

	public static Connection getConnection() throws SQLException
	{
		return ConnectionProvider.dataSource.getConnection();
	}

}

