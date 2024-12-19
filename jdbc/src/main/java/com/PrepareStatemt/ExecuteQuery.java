package com.PrepareStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecuteQuery {
	static String url = "jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root";
	static String user = "postgres";
	static String pass = "root";
	static Connection con = null;
	static{

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con.prepareStatement("Select * from emp where id = ?");
			ps.setInt(1, 101);
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("Name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
