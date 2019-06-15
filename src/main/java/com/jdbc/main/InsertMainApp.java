package com.jdbc.main;

import com.jdbc.helper.DatabaseHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class InsertMainApp {
	
	public static void main(String[] args) throws Exception {
		Connection c = DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();
		
		String insertSql = "insert into customers(`name`, email, phone) values"
				+ " ('Ram','ram@gmail.com','12000131');";
		
		stmt.executeUpdate(insertSql);

	}

}
