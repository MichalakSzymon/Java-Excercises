package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {


	public static String query = "SELECT * FROM Movies WHERE rating>(SELECT AVG(rating) FROM Movies) ORDER BY rating DESC;";
	
    public static void main (String [] args) {
    	Connection	conn1 = null;
		try {
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
			System.out.println("Połączenie ustanowione");
			Statement stat = conn1.createStatement();
			
			ResultSet rs = stat.executeQuery(query);
			while	(rs.next())	{
				int index=1;
				System.out.println(index + ". " + rs.getString(4) + " " + rs.getString(2) + " description: " + rs.getString(3));
				index++;
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

