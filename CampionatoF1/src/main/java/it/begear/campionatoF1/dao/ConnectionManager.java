package it.begear.campionatoF1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	
	static Connection getConnection() throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/databaseprogetto?useSSL=false&serverTimezone=UTC";
		String user="root";
		String password="root";
		return DriverManager.getConnection(url,user,password);
		
	}
}
