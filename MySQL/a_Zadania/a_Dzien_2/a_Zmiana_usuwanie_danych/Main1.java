package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main1 {
	
	public static String query="SELECT id, name FROM Movies;";
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Connection	conn1 = null;
	
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": " + rs.getString(2));
		}
		rs.close();
		System.out.println();
		System.out.print("Podaj id filmu do usunięcia: ");
		int id = scan.nextInt();
		String queryUser = "DELETE FROM Movies WHERE id=" + id + ";";
		System.out.println("Usunięto film o id:" + id);
		stat.executeUpdate(queryUser);
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

