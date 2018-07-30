package b_Zadania_Domowe.a_Dzien_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
    	rewrite();

    }
    
    static boolean rewrite() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Podaj nazwę pliku: ");
    	Path path = Paths.get(input.next());	
    	Path path2 = Paths.get(path + "_2");	
    	input.close();
        if(!Files.exists(path)) {
        	System.out.println("Plik nie istnieje");
        	return false;
        }
        try	{
        	ArrayList<String> out = new	ArrayList<>();
        	for (String line: Files.readAllLines(path))	{
        		out.add(line);
        		}
        	for (String line: Files.readAllLines(path))	{
        		out.add(line);
        		}
        	Files.write(path2, out);
        	System.out.println("Kopiowanie zakończone");
        }	
        catch (IOException e) {
         e.printStackTrace();
        }
        return true;
    }

}
