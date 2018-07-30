package a_Zadania.a_Dzien_1.a_Tworzenie_baz_i_tabel;

import java.sql.*;


public class Main1 {
	public String query = "CREATE DATABASE products_ex;";
	
	public static void main (String [] args) {
			Connection	conn1 = null;
		try {
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "coderslab");
			System.out.println("Połączenie ustanowione");
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
