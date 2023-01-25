package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/peed";
	private static final String USER_NAME = "root";
	private static final String USER_PASSWORD = "root";
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/peed";
			final String USER_NAME = "root";
			final String USER_PASSWORD = "root";
			
			return DriverManager.getConnection(DATABASE_URL, USER_NAME, USER_PASSWORD);
			
		} catch (Exception e) {
			return null;
		}
	}

}