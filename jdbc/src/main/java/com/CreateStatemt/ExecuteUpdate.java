package com.CreateStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/qsp";
		String user = "postgres";
		String pass = "root";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("connection is Done");
			
			Statement st = con.createStatement();
			
			int res = st.executeUpdate("insert into emp values(10,'Ketan',60000,785421)");
			int res1 = st.executeUpdate("update emp set name = 'Ketan' where id = 40");
			int res2 = st.executeUpdate("delete from emp where id =10");
			System.out.println(res2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
