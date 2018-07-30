package b_Zadania_domowe.a_Dzien_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);
	Connection	conn1 = null;
try {
	conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
	System.out.println("Połączenie ustanowione");
	Statement stat = conn1.createStatement();
	System.out.println("Podaj nazwę kina:");
	String name = scan.nextLine();
	String query = "SELECT Cinemas.name, Movies.name, Movies.rating FROM Cinemas LEFT JOIN CinemasAndMovies ON Cinemas.id=Cinemas_id LEFT JOIN Movies ON Movies_id=Movies.id WHERE Cinemas.name LIKE '" + name +"';"; 
	ResultSet rs = stat.executeQuery(query);
	while (rs.next()) {
		System.out.println(rs.getString(1) + ": " + rs.getString(2) + "  || " + rs.getString(3));	
	}	
	rs.close();
	scan.close();	
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
