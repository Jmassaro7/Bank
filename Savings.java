
public class Savings extends Account{
	private double interestRate;

	//constructor
	public Savings(int num, double balance) {
		super(num);
		this.accountBalance=balance;
	}
	//setter
	public void setInterestRate(double n) {
		if (n>0) {
			this.interestRate=n;
		}
		else 
			this.interestRate=0;
	}
	//getter
	public double getInterestRate() {
		return interestRate;
	}

	private final int DURATION=2; 

	//method to display account info
	@Override
	public double calculateInterest() {
		return (getAccountBalance()*  Math.pow((1+ interestRate), DURATION)-getAccountBalance());
	}
	
	@Override
	public void displayAccount() {
		System.out.print("Savings account number:  "+ getAccountNum() );
		System.out.printf("\nBalance: $%.2f", getAccountBalance());
		System.out.printf("\ninterest rate: %.2f", interestRate);
		System.out.printf("\ninterest incured: %.2f", calculateInterest());
		System.out.println("\n");

	}
	
}
