
public class Account {
	protected int accountNum;	
	protected double accountBalance;
	protected char accountType;
	private final int DURATION=2; 

	//setters
		public void setAccountNum(int n) {
			this.accountNum=n;
		}
		public void setAccountBalance(double n) {
			this.accountBalance=n;
		}
		
		public void setAccountType(char n) {
			this.accountType=n;
		}
		
		//getters
		public int getAccountNum() {
			return accountNum;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public char getAccountType() {
			return accountType;
		}
		//Constructor
		public Account(int num) {
			this.accountBalance=0;
			this.accountNum=num;
		}

		//deposit 
		public void deposit(double depositAmount) {
			setAccountBalance(getAccountBalance() + depositAmount);
			
		}
		//withdrawl
		public void withdrawl(double withdrawlAmount) {
			if ((getAccountBalance()-withdrawlAmount)>=0) {
				setAccountBalance(getAccountBalance() - withdrawlAmount);
			}
			else
				System.out.println("You do not have enough funds to make this withdrawl");
		}

		//method to calculate compound interest

		private double interestRate;
		public double calculateInterest() {
			return (getAccountBalance()*  Math.pow((1+ interestRate), DURATION)-getAccountBalance());
				
			}
			
		//method to display account info
		public void displayAccount() {

			System.out.print("Account number:  "+ getAccountNum() );
			System.out.printf("\nBalance: $%.2f", getAccountBalance());
			System.out.println("\n");

		}

}
