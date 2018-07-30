package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {
	
	public static String queryCreateTable1 = "CREATE TABLE Cinemas ("
											+ "id INT AUTO_INCREMENT,"
											+ "name CHAR(100),"
											+ "address CHAR(255),"
											+ "PRIMARY KEY (id)"
											+ ")";

	public static String queryCreateTable2 = "CREATE TABLE Movies ("
											+ "id INT AUTO_INCREMENT,"
											+ "name CHAR(200),"
											+ "description TEXT,"
											+ "rating DECIMAL(5,2),"
											+ "PRIMARY KEY (id)"
											+ ")";

	public static String queryCreateTable3 = "CREATE TABLE Tickets ("
											+ "id INT AUTO_INCREMENT,"
											+ "quantity INT,"
											+ "price DECIMAL (5,2),"
											+ "PRIMARY KEY (id)"
											+ ")";

	public static String queryCreateTable4 = "CREATE TABLE Payments ("
											+ "id INT AUTO_INCREMENT,"
											+ "type VARCHAR(100),"
											+ "date DATETIME,"
											+ "PRIMARY KEY (id)"
											+ ")";

public static void main (String [] args) {
	Connection	conn1 = null;
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		try {
		Statement stat = conn1.createStatement();
		stat.executeUpdate(queryCreateTable1);
		stat.executeUpdate(queryCreateTable2);
		stat.executeUpdate(queryCreateTable3);
		stat.executeUpdate(queryCreateTable4);
		stat.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
			}
		conn1.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	

}
