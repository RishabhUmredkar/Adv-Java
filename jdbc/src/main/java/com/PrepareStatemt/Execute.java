package com.PrepareStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute {

	public static void main(String[] args) {
		System.out.println("abc");
//		String url = "jdbc:postgresql://localhost:5432/qsp";
		String url = "jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root";
		String user = "postgres";
		String pass = "root";

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
				ps.setInt(1, 109);
				ps.setString(2, "Rishabh");
				ps.setLong(3, 500000);
				ps.setLong(4, 4000);
				
				ps.execute();
				System.out.println("done");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
