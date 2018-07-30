package a_Zadania.a_Dzien_2.e_Relacje_wiele_wiele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static String query="SELECT * FROM Orders;";
	
	
	public static void main (String [] args) {
		Connection	conn1 = null;
	
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": " + rs.getString(2) + " || " + rs.getString(3));
		}
		stat.close();
		rs.close();
		stat = conn1.createStatement();
		int i=1;
		String query2="SELECT Products.name, Products.id FROM Products RIGHT JOIN ProductsiOrders ON Products.id=Products_id RIGHT JOIN Orders ON Orders_id=Orders.id WHERE Orders.id=" + i +";"; 
		rs = stat.executeQuery(query2);
		System.out.println("Zamówienie o id:" + i + ": ");
		while	(rs.next())	{
			System.out.println(rs.getString(1) + " o id: " + rs.getString(2));
		}
		stat.close();
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			conn1.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
}

