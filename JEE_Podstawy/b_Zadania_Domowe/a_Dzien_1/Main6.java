package b_Zadania_Domowe.a_Dzien_1;

public class Main6 {
	static int evenSum(int[][] arr) {
	int sum=0;
	for(int i=1; i<arr[0].length; i=i+2)
		sum+=arr[0][i];
	for(int i=1; i<arr[1].length; i=i+2)
		sum+=arr[1][i];
	return sum;	
	}
	
    public static void main(String[] args) {
	int[][]	tab	={ {3,1,1,1}, {9,8}};
    System.out.println(evenSum(tab));
    }

}
