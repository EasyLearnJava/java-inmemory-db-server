package com.easylearnjava.h2db;

import java.sql.Connection;

public class PingServer {

	public static void main(String[] args) {

		Connection conn = DBConnection.getDBConnection();
		try {
			//Check if connection is valid
			if (conn.isValid(1000)) {
				System.out.println("Connection established and server reachable...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
