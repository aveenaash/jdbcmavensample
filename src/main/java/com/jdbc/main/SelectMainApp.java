package com.jdbc.main;

import java.sql.ResultSet;
import java.util.Scanner;

import com.jdbc.helper.DatabaseHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SelectMainApp {
	
	public static void main(String[] args) throws Exception {
		Connection c = DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer id : ");
	
		String id = sc.next(); 
		System.out.println("user netered : " + id);
		Long customerId = Long.parseLong(id);
		
		String selectSql = "select * from customers where id = " + customerId;
		ResultSet rs =  stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			// one row
			Long custId = rs.getLong("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String phone = rs.getString("phone");
			System.out.println(" Customer Details : id = " + custId + " , name = " + name + " , email = " + email + " , phone = " + phone);
		}

	}

}
