package b_Zadania_Domowe.a_Dzien_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
    	String fileName = "aaa.txt";
    	System.out.println(count(fileName));

    }
    
    static int count(String fileName) {
    	File file = new File(fileName);
    try {
    	Scanner scan = new Scanner(file);
    	int counter=0;
    	while(scan.hasNext()) {
    	counter ++;
    	scan.next();
    	}
    	scan.close();
    	return counter;
    }
    catch (FileNotFoundException e) {
    	System.out.println("Plik nie istnieje!");
    	return 0;
    }

    }
}
