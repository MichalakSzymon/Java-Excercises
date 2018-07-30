package b_Zadania_Domowe.a_Dzien_4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    	sortedArray();
  //  	System.out.println(Arrays.toString(tab));
    }

    static int[] sortedArray() {
    	Scanner input = new Scanner (System.in);
    	System.out.println("Podaj ilość elementów: ");
    	int n=0;
    	try {
    		n=input.nextInt();
    		}
    	catch (InputMismatchException e) {
  		  	System.out.println("Niepoprawna");
    		}
  		  	int [] tab = new int[n];
    	Random r = new Random();
    	for(int i=0; i<n; i++) tab[i]=r.nextInt(101);
    	Arrays.sort(tab);
    	System.out.println(Arrays.toString(tab));
    	input.close();
    	return tab;
    }

}
