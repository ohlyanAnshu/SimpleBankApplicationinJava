package Bank;

import java.util.Scanner;

public class UserAccount {

	private String customerName;
	private int customerId;
	private double amount;
	private double previousbalance;
	
	public UserAccount(String customerName, int customerId) {
		this.setCustomerName(customerName);
		this.setCustomerId(customerId);
		amount = 0;
		previousbalance = 0;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		if(String.valueOf(customerId).length() == 6)
			this.customerId = customerId;
		else {
			System.out.println("Please enter a six digit customer ID");
			System.exit(0);
		}
	}

	public double getAmount() {
		return amount;
	}

	public double getPreviousbalance() {
		return previousbalance;
	}
	
	public double checkBalance() {
		return getAmount();
	}
	
	public void deposit(double depositAmount) {
		if(depositAmount < 10) {
			System.out.println("Please deposit more than 10 dollars");			
		}
		else {
			previousbalance = amount;
			amount = amount + depositAmount;			
			System.out.println("Your deposit of " + depositAmount + " is succesfully added to your account");
			System.out.println("Your total balance is " + amount);
		}				
		
	}
	
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount < 10) {
			System.out.println("You cannot withdraw less than 10 dollars");			
		}
		else {
			previousbalance = amount;
			amount = amount - withdrawAmount;
			System.out.println("Your withdraw of " + withdrawAmount + " is succesfully deducted from your account");
			System.out.println("Your total balance is " + amount);
		}				
		
	}
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice. \n1 to Check Balance \n2 to Deposit \n3 to Withdraw \n4 to Exit");

		int choice = sc.nextInt();
		
		do {
			switch(choice) {
			case 1: System.out.println("Your balance is " + checkBalance());
					break;
			case 2: System.out.println("Enter amount to be deposited");
					int depositAmount = sc.nextInt();
					deposit(depositAmount);
					break;
			case 3: System.out.println("Enter amount to be withdrawn");
					int withdrawnAmount = sc.nextInt();
					withdraw(withdrawnAmount);
					break;
			case 4: System.out.println("Previous balance is " + previousbalance);
					break;
			default: System.out.println("Please enter a valid choice");
					break;
			}
			
			System.out.println("Please enter your choice. /n1 to Check Balance /n2 to Deposit /n3 to Withdraw /n4 to check previous balance /n5 to Exit");
			choice = sc.nextInt();
					
		}while(choice != 5);
		
		System.out.println("Thank you for being a valuable customer!");
	}
}
