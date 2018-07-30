package a_Zadania.a_Dzien_1.c_Pobieranie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
    //Zapisz w poniższej zmiennej kod zapytania SQL pobierającego odpowiednie dane
    public static String query = "SELECT id, name, description, price FROM Products";


    public static void main (String [] args) {
    	Connection	conn1 = null;
		try {
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/products_ex", "root", "coderslab");
			System.out.println("Połączenie ustanowione");
			Statement stat = conn1.createStatement();
			
			ResultSet rs = stat.executeQuery(query);
			while	(rs.next())	{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String description = rs.getString(3);
				if(description.length()>20) description=description.substring(0, 20) + "...";
				Double price = rs.getDouble(4);
			System.out.println(id + ". " + name + " " + description + " " + price);
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