package com.CreateStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/qsp";
		String user = "postgres";
		String pass = "root";
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			Statement st = con.createStatement();
			
			ResultSet rs =  st.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.print(rs.getInt("id") +"		||");
				System.out.print(rs.getString("name")+" 	||");
				System.out.print(rs.getString("phno")+" 	||");
				System.out.println(rs.getString("sal"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}