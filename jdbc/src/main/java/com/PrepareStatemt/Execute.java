package com.PrepareStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {

	public static void main(String[] args) {
		System.out.println("abc");
//		String url = "jdbc:postgresql://localhost:5432/qsp";
		String url = "jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root";
		String user = "postgres";
		String pass = "root";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the Salary");
		double sal = sc.nextDouble();
		System.out.println("Enter the Phone No.");
		long phno = sc.nextLong();
		
		
			//Step 1
			try 
			{	
				Class.forName("org.postgresql.Driver");
				System.out.println("done");
			
			//Step 2
				Connection con;
				con = DriverManager.getConnection(url);
			
				System.out.println("connection "+con);
			
				//Step 3
				PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setDouble(3, sal);
				ps.setLong(4, phno);
				
				ps.execute();
				System.out.println("done");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
