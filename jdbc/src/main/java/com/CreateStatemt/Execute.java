package com.CreateStatemt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Execute {

		
		public static void main(String[] args) {
			System.out.println("abc");
//			String url = "jdbc:postgresql://localhost:5432/qsp";
			String url = "jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root";
			String user = "postgres";
			String pass = "root";
			

			try {
				//Step 1
				Class.forName("org.postgresql.Driver");
				System.out.println("done");
				
				//Step 2
				Connection con = DriverManager.getConnection(url);
				System.out.println("connection "+con);
				
				//Step 3
				Statement stmt = con.createStatement();
				
				//Step 4
				
				// We can pass any Any Query i.e (DDL, DQL, DML)
//				boolean res = stmt.execute("insert into emp values(40,'Ketan',60000,785421)");
				boolean res1 = stmt.execute("update emp set name = 'Ketan' where id = 40");
				boolean res3 = stmt.execute("delete from emp where id =10");
				
				
				stmt.execute("SELECT * FROM emp");
	            ResultSet rs = stmt.getResultSet();
	            
	            while (rs.next()) {
	                System.out.println(rs.getInt("id"));

	            }
				con.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}


//We can close connection by using close method It is present in Connection Object 
//Assignment
//	1. Why we should close connection ?
//	2.	