package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main3 {
	
	
public static String query = "CREATE DATABASE cinemas_ex;";

public static void main (String [] args) { 	
    Connection	conn1 = null;
    	try {
    		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "coderslab");
    		System.out.println("Połączenie ustanowione");
    		conn1.close();
    		} 
    	catch (SQLException e) {
    			e.printStackTrace();
    		}
}

}
