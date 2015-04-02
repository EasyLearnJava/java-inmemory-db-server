package com.easylearnjava.h2db;

import java.sql.SQLException;

import org.h2.tools.Server;

public class CreateInMemoryServer {
	
	public static void main(String[] args) {
		try {
			openServerModeInBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void openServerModeInBrowser() throws SQLException {
        Server server = Server.createTcpServer().start();
        System.out.println("DB Server started and connection is open.");
        System.out.println("URL: jdbc:h2:" + server.getURL() + "/mem:ATHENA");
    }

}
