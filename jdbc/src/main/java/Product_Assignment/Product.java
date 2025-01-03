package Product_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {
	
	static String url = "jdbc:postgresql://localhost:5432/qsp";
	static String user = "postgres";
	static String pass = "root";
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	
	static{
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		boolean i =true;
		while(i)
		{
		System.out.println("1. Insert the product");
		System.out.println("2. Update the product");
		System.out.println("3. Delete the product");
		System.out.println("4. Show the product by Id");
		System.out.println("5. Show All the product ");
		System.out.println("0. Exit");
		System.out.println("---------------");
		
		int no = sc.nextInt();
		
		switch (no) {
		case 1:
			insertdata();
			break;
		case 2:
			updateProduct();
			break;
		case 3:
			deleteProduct();
			break;

		case 4:
			findProduct();
			break;
		case 5:
			AllProduct();
			break;
			
		case 0:
			System.err.println("Thank.......😊😊.......you");
			System.err.println("VISIT AGAIN.......😎😎");
				i = false;
			break;

		default:
			break;
		}
		}
		

	}

	private static void AllProduct() throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = con.prepareStatement("select * from product  ");
		ResultSet rs = ps.executeQuery();
		System.out.println("+----------------------------+");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+ " |	"+rs.getString("name")+" |	"+rs.getInt("price"));
			
		}
		if(rs == null)
		{
			System.err.println("No data Selected");
		}
		
		System.out.println("+----------------------------+");
	}

	private static void findProduct() throws SQLException {
		System.out.println("Enter the product Id");
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("select * from product   where id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();	
		System.out.println("+----------------------------+");
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+ " |	"+rs.getString("name")+" |	"+rs.getInt("price"));
			
		}
		if(rs == null)
		{
			System.err.println("No data Selected");
		}
		System.out.println("+----------------------------+");
		
	}

	private static void deleteProduct() throws SQLException {
		System.out.println("Enter the product Id");
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("delete from product   where id = ?");
		ps.setInt(1, id);
		int row = ps.executeUpdate();
		if(row >0)
		{
			System.err.println("Delete Successfully");
		}		AllProduct();

	}

	private static void updateProduct() throws SQLException {
		System.out.println("Enter the product Id");
		int id = sc.nextInt();
		System.out.println("Enter the product Price");
		long price = sc.nextLong();
		
		PreparedStatement ps = con.prepareStatement("update product  set price =? where id = ?");
		ps.setLong(1, price );
		ps.setInt(2, id);
		int row = ps.executeUpdate();
		if(row >0)
		{
			System.err.println("Update Successfully");
		}
		AllProduct();

				
	}

	private static void insertdata() throws SQLException {
		System.out.println("Enter the product Id");
		int id = sc.nextInt();
		System.out.println("Enter the product Name");
		String name = sc.next();
		System.out.println("Enter the product Price");
		double price = sc.nextDouble();
		
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setLong(3, (long) price);
		boolean row = ps.execute();
		System.out.println(row);
		if(row == false)
		{
			System.err.println("Data Inserted Successfully");
		}
		AllProduct();

		
	}

}
