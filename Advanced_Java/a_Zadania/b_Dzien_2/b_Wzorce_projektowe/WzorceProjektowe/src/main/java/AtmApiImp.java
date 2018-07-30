
public class AtmApiImp implements AtmApi {

	private final BankAccount bankAccount = new BankAccount();
	private final Transfer transfer = new Transfer();
	private final PhoneCard phoneCard = new PhoneCard();
	private final Loan loan = new Loan();
	
	public void deposit () {
	bankAccount.deposit();
	}
	public void payOut() {
	bankAccount.payOut();
	}
	public void transferMoney() {
	Transfer.transferMoney();
	}
	public void recharge () {
	PhoneCard.recharge();
	}
	public void getLoan() {
	Loan.getLoan();
	}
}

