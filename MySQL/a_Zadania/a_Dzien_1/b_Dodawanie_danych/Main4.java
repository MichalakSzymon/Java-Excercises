package a_Zadania.a_Dzien_1.b_Dodawanie_danych;

import java.sql.*;
import java.util.Scanner;

public class Main4 {

	public static void main (String [] args) {
		String name;
		String address;
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj nazwę kina:");
		name=scan.nextLine();
		System.out.println("Podaj adres:");
		address=scan.nextLine();
		scan.close();
		addCinema(10, name, address);
	}
	
	public static void addCinema(int id, String name, String address) {
		Connection	conn1 = null;
		try {
			conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
			System.out.println("Połączenie ustanowione");
		
			PreparedStatement	preStm	=
					conn1.prepareStatement("INSERT INTO Cinemas VALUES (default, ?, ?)");
					preStm.setString(1,	name);
					preStm.setString(2,	address);
					preStm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
}
