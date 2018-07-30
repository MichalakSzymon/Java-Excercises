package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {
	
public static String query="SELECT * FROM Tickets;";
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Connection	conn1 = null;
	
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": quantity=" + rs.getString(2) + " price:" + rs.getString(3));
		}
		rs.close();
		System.out.println("Podaj id biletu do zmiany: ");
		int id=scan.nextInt();
		System.out.println("Podaj ilość sprzedanych biletów: ");
		int count=scan.nextInt();
		PreparedStatement preStm = conn1.prepareStatement("UPDATE Tickets SET quantity=quantity-? WHERE id=?;");
		preStm.setInt(1, count);
		preStm.setInt(2, id);
		preStm.executeUpdate();
		rs.close();
		System.out.println("Ilość biletów została zmieniona");
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
