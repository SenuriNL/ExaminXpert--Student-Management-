package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDBConnect {
	
//	creating variables to store url,username and password. all of them are static beacause the method is static
	
	private static String url = "jdbc:mysql://localhost:3306/examinexpert";
	private static String userName = "root";
	private static String password = "oop1234";
//	the connection should be stored in a variable to return its value
	private static Connection con;
	
	
//	connection is returned here.so connnection is the return data type.
	public static Connection getConnection() {
		
//		try catch block is created to run without a crash
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName,password);
		}
		catch(Exception e) {
			System.out.println("Database connection is not successful");
		}
		return con;
		
	}
}
