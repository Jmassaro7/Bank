
public class Checking extends Account {
	
	//constructor 
	public Checking(int num, double bal) {
		super(num);
		this.accountBalance=bal;

	}

	private final double CHECKING_RATE=.05; 
	private final int DURATION=2; 

	@Override
	public double calculateInterest() {
		return (getAccountBalance()* CHECKING_RATE* DURATION);

	}

	@Override
	public void displayAccount() {
		System.out.print("Checking account number:  "+ getAccountNum() );
		System.out.printf("\nBalance: $%.2f", getAccountBalance());
		System.out.printf("\ninterest incured: %.2f", calculateInterest());
		System.out.println("\n");

	}
}
