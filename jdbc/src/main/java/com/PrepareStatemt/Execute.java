package com.PrepareStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
				
				ps = con.prepareStatement("update emp set phno = ? where id = ?");
				ps.setLong(1, 4052);
				ps.setInt(2, 101);
				ps.execute();
				
				PreparedStatement ps2 = con.prepareStatement("select * from emp where id = ?");
				ps2.setInt(1, 101);
				ps2.setInt(1, 20);
				ps2.execute();
				ResultSet rs = ps2.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt("id"));
				}
				
				ps.execute();
				System.out.println("done");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
