package b_Zadania_Domowe.a_Dzien_4;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
    try {
    	System.out.println(retirement());
    }	
    	
    catch (IOException e) {
    System.out.println("Nie znaleziono pliku");
    }
    
}
    
    static String retirement () throws IOException 
    {
    	Scanner input = new Scanner (System.in);
    	System.out.println("Podaj nazwę pliku: ");
    	String file = input.next();
    	input.close();
    		Path path1 = Paths.get(file);
    		ArrayList<String> out = new	ArrayList<>();
    		input = new Scanner (path1);
    		String imie="";
    		int wiek=0;
    		while(input.hasNext()) {
    		imie=input.next();
    		imie += " " + input.next();
    		wiek=(2017-input.nextInt());
    		if(wiek>65) {
    			out.add(imie);
    			input.next();
    		}
    		else if(wiek>60)
    			{ if(input.next()=="K")
    				out.add(imie);
    				}
    		else input.next();
    		}
    		input.close();
    		String arr = out.toString();
    		return arr;
    	
  

    	}
    
    }
