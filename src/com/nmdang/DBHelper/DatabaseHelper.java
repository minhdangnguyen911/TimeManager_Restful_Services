package com.nmdang.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

	
	public  Connection  CreateConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// Create a connection to the database
		Connection connection;
		try {
			
			String driverName = "com.mysql.jdbc.Driver";//"org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver
			
            Class.forName(driverName);
			String serverName = "localhost:3306";
			String mydatabase = "timemanager";
			String url = "jdbc:mysql://"+serverName+"/" +mydatabase;
			String username = "root";
			String password = "";
			connection = DriverManager.getConnection(url, username, password);
			
			
			/*String driverName = "org.postgresql.Driver";
            Class.forName(driverName);
			String serverName = "localhost:5432";
			String mydatabase = "bookonline";
			String url = "jdbc:postgresql://localhost:5432/bookonline";
			String username = "postgres";
			String password = "minhdang";
			connection = DriverManager.getConnection(url, username, password);*/
			
			
					
			
			return connection;
		} catch (SQLException e) {
			return null;
		}
	}
	
}
