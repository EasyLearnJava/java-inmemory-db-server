package com.easylearnjava.h2db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost:9092/mem:ATHENA;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";
    
    public static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
			dbConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dbConnection;
	}
    
    
}
