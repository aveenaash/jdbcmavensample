package com.jdbc.main;

import java.util.Scanner;

import com.jdbc.helper.DatabaseHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class UpdateMainApp {
	
	public static void main(String[] args) throws Exception {
		Connection c = DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id : ");
	
		String id = sc.next(); 
		Long customerId = Long.parseLong(id);
		
		System.out.println("enter new email : ");
		String email = sc.next(); 
		
		String updateSql = " update customers set email = '"+email + "' where id = " + customerId;
		stmt.executeUpdate(updateSql);

	}

}
