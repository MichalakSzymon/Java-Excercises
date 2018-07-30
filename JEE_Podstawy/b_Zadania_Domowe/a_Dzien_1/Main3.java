package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;

public class Main3 {

    static int[] minimum(int[][] arr) {
		int min0=arr[0][0];
		int min1=arr[1][0];
		for(int i=0; i<arr[0].length; i++)
			if(arr[0][i]<min0) min0=arr[0][i];
		for(int i=0; i<arr[1].length; i++)
			if(arr[1][i]<min1) min1=arr[1][i];	
		int [] wynik={min0, min1};	
		return wynik;
	}
	
    public static void main(String[] args) {
		int[][]	tab	={ {3,1}, {9,8}};
		int[] B = minimum(tab);
        System.out.println(Arrays.toString(B));
    }

}
