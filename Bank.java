/**Assignment 1: The Bankclass 
 * @author jakob
 *Version 1.0
 */
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		double checkingBalance, savingBalance, interestRate, duration;
		
		System.out.println("Enter checking account balance, interest rate, and duration in years: ");
		checkingBalance = input.nextDouble();
		interestRate = input.nextDouble();
		duration = input.nextDouble();
		double simpleInterestChecking= checkingBalance*interestRate*duration; 
		System.out.print("Your simple interest for your checking account is $");
		System.out.printf("%.2f\n", simpleInterestChecking);
		
		System.out.println("\nEnter savings account balance, interest rate, and duration in years: ");
		savingBalance = input.nextDouble();
		interestRate = input.nextDouble();
		duration = input.nextDouble();
		double simpleInterestSavings= savingBalance*interestRate*duration; 
		System.out.print("Your simple interest for your savings account is $");
		System.out.printf("%.2f\n", simpleInterestSavings);

		System.out.println("----------------------------------------------------------------------");
		System.out.println("\n\t\t Northwestern Mutual Bank: ");
		System.out.print("\n\n\tThe balance of your checking account is $");
		System.out.printf("%.2f", checkingBalance);
		System.out.print("\n\n\tThe interest of your checking account is $");
		System.out.printf("%.2f",simpleInterestChecking);
		System.out.print("\n\n\tThe balance of your savings account is $");
		System.out.printf("%.2f",savingBalance);
		System.out.print("\n\n\tThe interest of your savings account is $");
		System.out.printf("%.2f",simpleInterestSavings);




	}

}
