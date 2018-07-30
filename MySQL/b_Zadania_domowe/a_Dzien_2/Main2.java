package b_Zadania_domowe.a_Dzien_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main2 {
	
public static String query="SELECT Movies.name, rating, Cinemas.name, Cinemas.address FROM Movies LEFT JOIN CinemasAndMovies ON Movies_id=Cinemas_id LEFT JOIN Cinemas ON Cinemas_id=Cinemas.id ORDER BY Movies.name;";
public static String query2="SELECT Cinemas.name, Cinemas.address, Movies.name, Movies.rating FROM Cinemas LEFT JOIN CinemasAndMovies ON Cinemas.id=Cinemas_id LEFT JOIN Movies ON Movies_id=Movies.id ORDER BY Cinemas.name;";
public static String query3="";

	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Connection	conn1 = null;
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": " + rs.getString(2) + "  || " + rs.getString(3) + " " + rs.getString(4));
		}	
		System.out.println();
		stat = conn1.createStatement();
		rs = stat.executeQuery(query2);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": " + rs.getString(2) + "  || " + rs.getString(3) + " " + rs.getString(4));
		}	
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