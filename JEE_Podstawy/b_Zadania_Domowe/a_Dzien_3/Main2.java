package b_Zadania_Domowe.a_Dzien_3;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
    	String [] str = {"a", "b", "c"};
    	int index=5;
    	try {
    		System.out.println(safeGet(str, index));
    	}
    	catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Za duży indeks");
    	}

    }
    static String safeGet(String[] str, int index) throws ArrayIndexOutOfBoundsException {
    	
    	return str[index];
    }

}