/**model class.this class contains the validation.List is the return type.validate is the method.
 * 
 */

package com.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDButil {
	
//	created to get the common database connection
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Student> validate(String username, String password){
		/**This contains a database connection and if database connection is success, the row related to relavent customer should be returned.**/
		
		/**create an array contains customer details**/
		ArrayList<Student> std = new ArrayList<>();
		
		/**Create database connection**/
//		String url = "jdbc:mysql://localhost:3306/hotel";
//		String user = "root";
//		String pass = "oop1234"; commented beacuase common database connection is used.
		
		
		/**validate**/
		
		try {
			
			con = StudentDBConnect.getConnection();
			stmt = con.createStatement();
//			Class.forName("com.mysql.jdbc.Driver");
			
//			Connection con = DriverManager.getConnection(url, user, pass);
//			Statement stmt = con.createStatement();
			
			
			/**writing the query**/
			String sql ="select * from student where Susername='"+username+"' and Spassword='"+password+"'";
//			ResultSet rs = stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);
			
			/**if username are password are valid get relavant user details**/
			if(rs.next()) {
				int id =rs.getInt(1);
				String name =rs.getString(2);
				String email = rs.getString(3);
				String conno = rs.getString(4);
				String nic = rs.getString(5);
				String dob = rs.getString(6);
				String gender = rs.getString(7);
				String address = rs.getString(8);
				String uname = rs.getString(9);
				String pass = rs.getString(10);
				String proimage = rs.getString(11);
				
				
				
				
				/**Customer is the class Customer.java we created.above we created variables to assign table column names.those variables are here as parameters.those parameters are passed  to variables in customer class in customer.java file through customer constructor**/
				Student s = new Student(id,name,email,conno,nic,dob, gender, address, uname, pass,proimage);
				
				/**pass customer object(c) to arraylist object(cus).Through this customer array is returned through this method**/
				std.add(s);
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return std;/**returning object cus**/
		
	}
	
	
//	Create - inserting values to the database. return a boolean value to customerinsert.servlet if data is entered succesfuly
	
	public static boolean Insertstudent(String name,String email,String conno,String nic,String dob, String gender, String address, String uname, String pass,String proimage) {
		boolean isSuccess = false;
		
//		create database connection
//		String url = "jdbc:mysql://localhost:3306/hotel";
//		String user = "root";
//		String pass = "oop1234";
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			Connection con = DriverManager.getConnection(url, user, pass);
//			Statement stmt = con.createStatement();
			
			con = StudentDBConnect.getConnection();
			stmt = con.createStatement();
			
//			sql query inserting data to database. parameters above in Insertcustomer function are used inside insert brackets.
			String sql = "insert into student values (0,'"+name+"','"+email+"','"+conno+"','"+nic+"','"+dob+"','"+gender+"','"+address+"','"+uname+"','"+pass+"','"+proimage+"')";
			
//			integer variable is created.if this executeupdate is success it returns 1.if it is not success it returns 0.it only returns 0 and 1.
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return isSuccess;
	}
	
	//update. give variables in servlet as parameters.
	
	public static boolean updatestudent(String id, String name, String email, String conno, String nic, String dob, String gender, String address, String username, String passsword,String proimage) {
		
		 try {
			 
			 con =  StudentDBConnect.getConnection();
			 stmt = con.createStatement();
			 
			 //In video 4.declared variables
			 
			 String sql = "update student set Sname = '"+name+"' ,Semail ='"+email+"', Sconno ='"+conno+"', Snic = '"+nic+"', Sdob = '"+dob+"', Sgender = '"+gender+"', Saddress = '"+address+"', Susername='"+username+"', Spassword ='"+passsword+"',proimage='"+proimage+"' " 
			              +"where sid='"+id+"'";
			 
			 //executeUpdate fuction is used to update value in query. if  isSuceess fails function returns 0. if isSuccess is okay, fuction returns 1.
			 int rs = stmt.executeUpdate(sql);
			 
			 if(rs > 0 ) {
				 isSuccess = true;
			 } else {
				 isSuccess = false;
			 }
			 
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		
		return isSuccess;
		//isSuccess is a method  instance variable declared in this class.so all methods in customerdbutil can access it.
		}
	
	//retrieving details from the updated database table. Customer is the Customer.java file name.Here details related to the relavant customer are taken to a arraylist and that is shown.
	
	public static List<Student> getStudentDetails(String Id){
		
		//convert String id to int using a warraper class
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Student> std= new ArrayList<>();
		
		try {
			con = StudentDBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where sid ='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			//get customer details related to table. keep curser on next and see details.
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String conno = rs.getString(4);
				String nic = rs.getString(5); 
				String dob = rs.getString(6);
				String gender = rs.getString(7); 
				String address = rs.getString(8);
				String username = rs.getString(9); 
				String password = rs.getString(10);
				String proimage = rs.getString(11);
				//Assigning varibales through constructor in customer.java file.
				Student s = new Student(id,name,email,conno,nic,dob,gender,address,username,password,proimage);
				std.add(s);
			}
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		return std;
		
	}
	
	//Delete student
	public static boolean deletestudent(String id) {
		
		//using wrapper class
		int convid = Integer.parseInt(id);
		
		try {
			
			con = StudentDBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "Delete from student where SID = '"+convid+"'";
			int r = stmt.executeUpdate(sql);
			
			if (r > 0) {
				isSuccess = true;
			}
			
			else {
				isSuccess = false;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}

}
