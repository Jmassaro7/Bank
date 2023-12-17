/**Assignment 2: The BankAccount class 
 * @author jakob
 *Version 1.0
 */
import java.util.Scanner;

public class BankAccount {
	//establish instance variables
	private int accountNum;	
	private double accountBalance;
	
	//setters
	public void setAccountNum(int n) {
	accountNum=n;
	}
	public void setAccountBalance(double n) {
	accountBalance=n;
	}
	//getters
	public double getAccountNum() {
		return accountNum;
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	//method to calculate simple interest

	public double calInterest(double interestRate, double duration) {
		return (getAccountBalance()* interestRate* duration);
	}
	//method to display account info
	public void displayAccount(double simpleInterest ) {

		System.out.print("For your account with number "+ accountNum );
		System.out.printf(" Your balance is $%.2f and your interest earned is $%.2f", accountBalance, simpleInterest);
		System.out.println("\n");

	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//instantiate object for checking account
		BankAccount checkingAccount= new BankAccount();

		//get user input for checking account number
		int temp1;
		System.out.println("Enter your bank account number: ");
		temp1=input.nextInt();
		checkingAccount.setAccountNum(temp1);
		
		//get user input for checking account balance
		System.out.println("Enter your bank account balance: ");
		double temp2=input.nextDouble();
		checkingAccount.setAccountBalance(temp2);
	
		double interestRate, duration;
	
		//Checking account
		System.out.println("\nEnter checking account interest rate as a decimal value and duration in years: ");
		interestRate = input.nextDouble();
		duration = input.nextDouble();
		double checkingInterest=checkingAccount.calInterest(interestRate, duration);
		checkingAccount.displayAccount(checkingInterest);
		

		//instantiate object for savings account
		BankAccount savingsAccount= new BankAccount();
				
		//get user input for bank account
		System.out.println("Enter your bank account number: ");
		temp1=input.nextInt();
		savingsAccount.setAccountNum(temp1);
		
		//get user input for savings account balance
		System.out.println("Enter your bank account balance: ");
		double temp3=input.nextDouble();
		savingsAccount.setAccountBalance(temp3);
		
		//Savings account
		System.out.println("\nEnter savings account interest rate as a decimal value and duration in years: ");
		interestRate = input.nextDouble();
		duration = input.nextDouble();
		double savingInterest=savingsAccount.calInterest(interestRate, duration);
		savingsAccount.displayAccount(savingInterest);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\n\t\t Northwestern Mutual Bank: ");
		System.out.printf("\n\n\tThe balance of your savings account is $%.2f", temp2);
		System.out.printf("\n\n\tThe interest of your checking account is $%.2f", checkingInterest);
		System.out.printf("\n\n\tThe balance of your savings account is $%.2f", temp3);
		System.out.printf("\n\n\tThe interest of your savings account is $%.2f", savingInterest);




	}

}
