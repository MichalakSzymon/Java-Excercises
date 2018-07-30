package b_Zadania_domowe.a_Dzien_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main3 {	
	
	public static void main (String [] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Connection	conn1 = null;
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		System.out.println("Podaj tytuł filmu do wyświetlenia:");
		String title = scan.nextLine();
		String query = "SELECT * FROM Movies WHERE name LIKE '%" + title + "%';"; 
		ResultSet rs = stat.executeQuery(query);
		if (!rs.next())	System.out.println("Nie odnaleziono filmu");
		while (rs.next()) {
			System.out.println(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
		}
		scan.close();
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