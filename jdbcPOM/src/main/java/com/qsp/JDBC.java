package com.qsp;

public class JDBC {
	public static void main(String[] args) {
		System.out.println("abc");
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
