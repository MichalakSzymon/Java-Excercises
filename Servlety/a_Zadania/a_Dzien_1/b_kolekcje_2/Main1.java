package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main1 {
	
public static void main(String[] args) {	
	Scanner scan = new Scanner (System.in);
	String odp="";
	Set <String> secik = new HashSet<>();
	int counter=0;
	System.out.println("Podaj napisy:");
	while(true) {
		odp=scan.next();
		if(odp.equals("exit")) break;
		secik.add(odp);
		counter++;
	}
	scan.close();
	System.out.println("Podanych napisów: " + counter + ", rozmiar kolekcji: " + secik.size());
}
}
