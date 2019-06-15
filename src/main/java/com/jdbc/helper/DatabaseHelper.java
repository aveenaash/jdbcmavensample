package com.jdbc.helper;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DatabaseHelper {

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Exception e) {
			System.out.println("Cant find the driver");
		}
		
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/wells_fargo_app", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
