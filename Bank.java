/**Assignment 5 Superclass and subclasses
 * Author Jakob Massaro 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Bank {
	
	//declare ArrayList
	private ArrayList<Savings> savingsList = new ArrayList<>();
	private ArrayList<Checking> checkingList = new ArrayList<>();
	private final static double SAVINGS_INTEREST=.02; 

	//method to initialize ArrayList
	public void initSavingsList(int n) {
	// Object reference for Savings 
		Savings s;
		for (int i=0; i<n*2; i+=2) {
			s = new Savings(i + 102, 50*(i+102));
			s.setInterestRate(SAVINGS_INTEREST);
			savingsList.add(s);
		}
	}
	public void initCheckingList(int n) {
		// Object reference for Checking 
		Checking c;
		for (int i=0; i<n*2; i+=2) {
			c = new Checking(i + 101, 50*(i+101));
			checkingList.add(c);
		}
	}
	//method to display all accounts
		public void displayAllAccounts() {
			System.out.print("ALL ACCOUNTS\n");
			for (Savings s: savingsList ) {
				s.displayAccount();
			}
			for (Checking c: checkingList ) {
				c.displayAccount();
			}
			System.out.println();		
		}
		//method to display savings accounts
		public void displaySavings() {
			System.out.print("ALL SAVINGS ACCOUNTS\n");
			for (Savings s: savingsList ) {
				s.displayAccount();
			}
			System.out.println();
			
		}	//method to display checking accounts
		public void displayChecking() {
			System.out.print("ALL CHECKING ACCOUNTS\n");
			for (Checking c: checkingList ) {
				c.displayAccount();
			}
			System.out.println();		
		}
	
	public int findHighestAccNum() {
		return (savingsList.get(savingsList.size()-1).getAccountNum());
	}
	
	public void addSavings(Savings s) {
		savingsList.add(s);	
	}
	public void addChecking(Checking c) {
		checkingList.add(c);	
	}
	
	//method to find savings index value
	public int findSavings(int accNum) {
		int i=0;
		for (Savings s: savingsList ) {
			if (s.getAccountNum()==accNum) 
				return i;
			else
				i++;
			
		}
		return -1;
		
	}
	//method to find checking index value
		public int findChecking(int accNum) {
			int i=0;
			for (Checking c: checkingList ) {
				if (c.getAccountNum()==accNum) 
					return i;
				else
					i++;
				
			}
			return -1;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		Bank b = new Bank();
		Savings s;
		Checking c;
		
		char toContinue='y';
		int option;
		int choice;
		int n;
		
		System.out.println("Enter number of savings accounts you would like to create: ");
		n = input.nextInt();
		b.initSavingsList(n);
		b.displaySavings();
		
		System.out.println("Enter number of checking accounts you would like to create: ");
		n = input.nextInt();
		b.initCheckingList(n);
		b.displayChecking();


				
		while (toContinue=='y') {
			//add choice
			System.out.println("Enter 1 for savings or 2 for checking");
			choice=input.nextInt();

			//for Savings
			if (choice==1) {
				
				System.out.println("Enter:\n1 to add an account\n2 to make a deposit\n3 to make a withdrawl\n4 to see a specific account\n5 to remove an account\n6 to display all information");
				option=input.nextInt();
				
				if (option==1) {
					double accBal;
					System.out.println("Enter the new account balance: ");
					//get user input
					accBal = input.nextDouble();
					s = new Savings(b.findHighestAccNum(), accBal);
					b.addSavings(s);
					int highestNum = b.findHighestAccNum();
					int index = b.findSavings(highestNum);
					b.savingsList.get(index).setInterestRate(SAVINGS_INTEREST);
					System.out.println("Added the following account: ");
					s.displayAccount();
				}
				//deposit
				else if (option==2) {
					System.out.print("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findSavings(accNum);
					if (i!=-1) {
						double depAmount;
						System.out.println("Enter deposit amount: ");
						depAmount=input.nextDouble();
						b.savingsList.get(i).deposit(depAmount);
						
					}
				}
				//withdrawl
				else if (option==3) {
					System.out.println("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findSavings(accNum);
					if (i!=-1) {
						double withAmount;
						System.out.println("Enter withdrawl amount: ");
						withAmount=input.nextDouble();
						b.savingsList.get(i).withdrawl(withAmount);
						
					}
				}
				//display one account
				else if (option==4) {
					System.out.println("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findSavings(accNum);
					b.savingsList.get(i).displayAccount();
					}
				else if (option==5) {
					System.out.print("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findSavings(accNum);
					b.savingsList.remove(i);
				}
				//display all
				else if (option==6) {
					b.displayAllAccounts();
				}
			}
			
			//for checking

			else if (choice==2) {
			
				System.out.println("Enter:\n1 to add an account\n2 to make a deposit\n3 to make a withdrawl\n4 to see a specific account\n5 to remove an account\n6 to display all information");
				option=input.nextInt();
				
				if (option==1) {
					double accBal;
					System.out.println("Enter the new account balance: ");
					//get user input
					accBal = input.nextDouble();
					c = new Checking(b.findHighestAccNum(), accBal);
					b.addChecking(c);
					int highestNum = b.findHighestAccNum();
					int index = b.findChecking(highestNum);
					b.checkingList.get(index);
					System.out.println("Added the following account: ");
					c.displayAccount();
				}
				//deposit
				else if (option==2) {
					System.out.print("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findChecking(accNum);
					if (i!=-1) {
						double depAmount;
						System.out.println("Enter deposit amount: ");
						depAmount=input.nextDouble();
						b.checkingList.get(i).deposit(depAmount);
						
					}
				}
				//withdrawl
				else if (option==3) {
					System.out.println("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findChecking(accNum);
					if (i!=-1) {
						double withAmount;
						System.out.println("Enter withdrawl amount: ");
						withAmount=input.nextDouble();
						b.checkingList.get(i).withdrawl(withAmount);
						
					}
				}
				//display one account
				else if (option==4) {
					System.out.println("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findChecking(accNum);
					b.checkingList.get(i).displayAccount();
					}
				
				else if (option==5) {
					System.out.print("Enter the account number: ");
					int accNum = input.nextInt();
					int i = b.findChecking(accNum);
					b.checkingList.remove(i);
				}
				//display all
				else if (option==6) {
					b.displayAllAccounts();
				}
			}
			
			else
				System.out.println("invalid option");
			
		//ask user if they want to continue	
		System.out.println("Would you like to continue? y/n: ");
		toContinue= input.next().charAt(0);
		
		}
		//Quit message
		System.out.println("Good Bye!");
		
		
	}	


}


