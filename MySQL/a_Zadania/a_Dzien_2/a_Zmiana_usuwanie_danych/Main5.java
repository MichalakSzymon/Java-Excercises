package a_Zadania.a_Dzien_2.a_Zmiana_usuwanie_danych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main5 {
public static String query="SELECT * FROM Cinemas;";
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		Connection	conn1 = null;
	
	try {
		conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex", "root", "coderslab");
		System.out.println("Połączenie ustanowione");
		Statement stat = conn1.createStatement();
		ResultSet rs = stat.executeQuery(query);
		while	(rs.next())	{
			System.out.println(rs.getString(1) + ": " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		System.out.println();
		System.out.println("Wpisz U jeśli chcesz usunąć kino, wpisz E jeśli chcesz dokonać edycji, wpisz X aby wyjść");
		String odp=scan.next();
		
		if(odp.equals("X")) return; 
		
		else if(odp.equals("U")) {
		System.out.println();
		System.out.print("Podaj id kina do usunięcia: ");
		int id = scan.nextInt();
		PreparedStatement	preStm	= 
				conn1.prepareStatement("DELETE FROM Cinemas WHERE id=?;");
				preStm.setInt(1, id);
		System.out.println("Potwierdź usunięcie: T aby usunąć, n aby wyjść");
		if (scan.next().equals("n")) return;
		else if (scan.next().equals("T")) {
		System.out.println("Usunięto film o id:" + id);
		preStm.executeUpdate();
		}
		}
		else if(odp.equals("E")) {
			System.out.println("Podaj id kina do edycji: ");
			int id = scan.nextInt();
			System.out.println("Podaj nową nazwę kina:");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Podaj nowy adres:");
			String address = scan.nextLine();
			PreparedStatement	preStm	= 
					conn1.prepareStatement("UPDATE Cinemas SET name=?, address=? WHERE id=?;");
			preStm.setString(1, name);
			preStm.setString(2, address);
			preStm.setInt(3, id);
			preStm.executeUpdate();
			System.out.println("Zmieniono nazwę i adres kino");
			scan.close();
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