package b_Zadania_Domowe.a_Dzien_2;

import java.util.Arrays;

public class Main4 {
	
	static int tripple(String str) {
		return (" " + str + " ").split("(.)\\1{2}").length-1;
	}
	
	 public static void main(String[] args) {
    	String str = "aaacbbb";
    	System.out.println(tripple(str));
    }

}
