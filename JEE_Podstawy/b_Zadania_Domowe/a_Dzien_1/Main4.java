package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;

public class Main4 {

	static int[] lessMore(int[][] arr) {
		int srednia=0;
		for(int i=0; i<arr[0].length; i++) srednia+=arr[0][i];
		for(int i=0; i<arr[1].length; i++) srednia+=arr[1][i];
		srednia/=(arr[0].length+arr[1].length);
		int [] result = {0, 0};
		for(int i=0; i<arr[0].length; i++) {
			if(arr[0][i]<srednia) result[0]+=1;
			if(arr[0][i]>srednia) result[1]+=1;	
				}
		for(int i=0; i<arr[1].length; i++) {
			if(arr[1][i]<srednia) result[0]+=1;
			if(arr[1][i]>srednia) result[1]+=1;	
				}
		return result;
	}
	
    public static void main(String[] args) {
		int[][]	tab	={ {100,1}, {10,6}};
		int[] B = lessMore(tab);
        System.out.println(Arrays.toString(B));
    }

}
