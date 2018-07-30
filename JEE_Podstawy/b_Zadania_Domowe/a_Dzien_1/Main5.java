package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;

public class Main5 {
	
    static int[] append(int[] arr) {
		int [] tab = new int [arr.length*2];
		for(int i=0; i<arr.length; i++)
		tab[i]=arr[i];
		for(int i=0;i<arr.length; i++)
		tab[arr.length+i]=arr[arr.length-(i+1)];
		return tab;
	}

    public static void main(String[] args) {
		int [] t = {1,2,3, 4};
		int[] B = append(t);
        System.out.println(Arrays.toString(B));
    }

}
