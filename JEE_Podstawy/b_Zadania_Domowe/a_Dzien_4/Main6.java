package b_Zadania_Domowe.a_Dzien_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
 		System.out.println(checkFileExist());

    }
    
    static boolean checkFileExist() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Podaj nazwę pliku: ");
    	Path path = Paths.get(input.next());
    	input.close();
    return Files.exists(path);

}
    
}
