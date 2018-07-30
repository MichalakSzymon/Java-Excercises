package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.*;

public class Main2 {

public static void main (String [] args) {
	String queryCreateTable1 = "CREATE TABLE Products ("
								+ "id INT AUTO_INCREMENT, "
								+ "name CHAR(20) NOT NULL, "
								+ "description VARCHAR(255), "
								+ "price DECIMAL(20,2), "
								+ "PRIMARY KEY(id))";
	
	String queryCreateTable2 = "CREATE TABLE Orders ("
								+ "id int AUTO_INCREMENT,"
								+ "name varchar(100),"
								+ "description VARCHAR(255),"
								+ "PRIMARY KEY(id))";
						
	String queryCreateTable3 = "CREATE TABLE Clients ("
								+ "id int AUTO_INCREMENT,"
								+ "name varchar(100),"
								+ "surname varchar(255),"
								+ "PRIMARY KEY(id))";
	Connection	conn1 = null;
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		try {
		Statement stat = conn1.createStatement();
		stat.executeUpdate(queryCreateTable1);
		stat.executeUpdate(queryCreateTable2);
		stat.executeUpdate(queryCreateTable3);
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