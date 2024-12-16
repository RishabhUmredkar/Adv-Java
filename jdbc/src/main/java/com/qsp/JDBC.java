package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

		
		public static void main(String[] args) {
			System.out.println("abc");
//			String url = "jdbc:postgresql://localhost:5432/qsp";
			String url = "jdbc:mysql://localhost:3306/qsp?user=postgres&password=root";
			String user = "postgres";
			String pass = "root";
			

			try {
				
				Class.forName("com.mysql.jdbc.driver");
				System.out.println("done");
				Connection con = DriverManager.getConnection(url);
				System.out.println("connection "+con);
				
				con.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
