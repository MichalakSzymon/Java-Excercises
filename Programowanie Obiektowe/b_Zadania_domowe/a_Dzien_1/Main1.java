package b_Zadania_domowe.a_Dzien_1;

public class Main1 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000001);
		try {
			account.printInfo();
			account.depositCash(120.0);
			account.printInfo();
			account.withdrawCash(60.0);
			account.printInfo();	
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
