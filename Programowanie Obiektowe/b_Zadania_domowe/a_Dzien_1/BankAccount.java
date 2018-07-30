package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
	
	private final int number;
	private double cash=0;
	
	BankAccount(int number) {
		this.number=number;
	}

	public int getNumber() {
		return number;
	}

	public double getCash() {
		return cash;
	}
	
	public void depositCash(double amount) throws Exception {
		if(amount<0) throw new Exception("Kwota musi być większa od 0!");
		this.cash+=amount;
	}
	
	public double withdrawCash(double amount) throws Exception {
		if(amount<0) throw new Exception("Kwota musi być większa od 0!");
		if(this.cash-amount<0) {
			this.cash=0;
			return this.cash;
		}
		else {
			this.cash-=amount;
			return amount;
		}
			
	}
	
	public void printInfo() {
		System.out.println("Stan konta o numerze " + number + " wynosi: " + cash);
		
	}

}
