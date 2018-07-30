package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
    //zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT * FROM Movies WHERE name LIKE 'I%';";
    public static  String query2 = "SELECT * FROM Tickets WHERE price > 15.30;";
    public static  String query3 = "SELECT * FROM Tickets WHERE quantity>30;";
    public static  String query4 = "SELECT * FROM Movies WHERE rating>4.5;";



public static void main (String [] args) {
	Connection	conn1 = null;
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query1);
	
		while (rs.next())	{
			String result="ID: " + rs.getInt(1) + ". " + rs.getString(2) + "  rating: " + rs.getString(4);
			System.out.println(result);
		}
		System.out.println();
		rs.close();
		rs = stat.executeQuery(query4);
		while (rs.next())	{
			String result="ID: " + rs.getInt(1) + ". " + rs.getString(2) + "  rating: " + rs.getString(4);
			System.out.println(result);
		}
		System.out.println();
		rs.close();
		rs = stat.executeQuery(query2);
		while (rs.next())	{
			String result="ID: " + rs.getInt(1) + ", price: " + rs.getString(3) + ", guantity:" + rs.getString(2);
			System.out.println(result);
		}
		
		System.out.println();
		rs.close();
		rs = stat.executeQuery(query3);
		while (rs.next())	{
			String result="ID: " + rs.getInt(1) + ", price: " + rs.getString(3) + ", guantity:" + rs.getString(2);
			System.out.println(result);
		}
		System.out.println();
		rs.close();
		
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