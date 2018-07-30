package b_Zadania_domowe.a_Dzien_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Connection	conn1 = null;
		Scanner scan = new Scanner(System.in);
		try {
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
			System.out.println("Połączenie ustanowione");
			Statement stat = conn1.createStatement();
			String query="SELECT * FROM Cinemas";
			ResultSet rs = stat.executeQuery(query);
			while	(rs.next())	{
				System.out.println(rs.getString(1) + ": " + rs.getString(2) + " || " + rs.getString(3));
			}
			System.out.println();
			System.out.println("Podaj id kina, dla którego chcesz wyświetlić filmy: ");
			int id=scan.nextInt();
			String query2="SELECT Movies.id, Movies.name, Movies.rating FROM Movies LEFT JOIN Seance ON Movies.id=movie_id LEFT JOIN Cinemas ON cinema_id=Cinemas.id WHERE Cinemas.id=" + id +";";
			rs.close();
			rs = stat.executeQuery(query2);
			while (rs.next())	{
				System.out.println(rs.getString(1) + ". " + rs.getString(2) + ", rating: " + rs.getString(3));
			}
			String query3="SELECT * FROM Cinemas";
			System.out.println();
			System.out.println("Podaj id filmu, dla którego chcesz wyświetlić seanse: ");
			scan.nextLine();
			int id2=scan.nextInt();
			query3="SELECT Movies.name, Movies.rating, Cinemas.name, Cinemas.address FROM Movies RIGHT JOIN Seance ON Movies.id=movie_id RIGHT JOIN Cinemas ON cinema_id=Cinemas.id WHERE Movies.id=" + id2 +";";
			rs.close();
			rs = stat.executeQuery(query3);
			while (rs.next())	{
				System.out.println(rs.getString(1) + ". " + rs.getString(2) + ", Cinema: " + rs.getString(3) + " address: " + rs.getString(4));
			}
			scan.close();
			rs.close();
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