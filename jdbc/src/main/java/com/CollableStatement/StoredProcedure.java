package com.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedure {
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
	
	
	public static void main(String[] args) throws SQLException {

			CallableStatement cs = con.prepareCall("call create_student(1,'Rishabh',101)");
			
//			CallableStatement cs = con.prepareCall("call show_student(?,?,?)");
			cs.execute();
			
			System.out.println("Data Inserted");
			con.close();
		

	}

}
