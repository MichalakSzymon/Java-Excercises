public class Main9 {
	static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++)
			fact*=i;
		return fact;
	}
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }
}
