package b_Zadania_Domowe.a_Dzien_4;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
    		printTriangle();

    }
    
    static void printTriangle() {
    Scanner input = new Scanner (System.in);
    System.out.println("Podaj wartość: ");
    int number=input.nextInt();
		
    for(int i=0; i<number; i++) {
    	for(int j=0; j<=i; j++)
    		System.out.print("X");
    	System.out.println();
    	}
    
    input.close();
}

}
