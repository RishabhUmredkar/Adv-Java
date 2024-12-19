package com.PrepareStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteUpdate {
	
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
		try {
			PreparedStatement ps = con.prepareStatement("update emp set phno = ? where id = ?");
			ps.setLong(1, 4050);
			ps.setInt(2, 101);
			int r =ps.executeUpdate();
			System.out.println(r);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
