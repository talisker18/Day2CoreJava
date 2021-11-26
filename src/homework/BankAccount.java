package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount implements IBankAccount{
	public Scanner scanner = new Scanner(System.in);
	public boolean programExcitedByUser = false;
	private double balance = 0;

	@Override
	public void deposit(double amount) {
		System.out.println("you have made a deposit of "+amount);
		this.balance += amount;
		this.balance();
	}

	@Override
	public void withdraw(double amount) {
		if(amount > this.balance) {
			System.out.println("insufficient balance for this withdraw");
		}else if(amount > 5000) {
			System.out.println("withdraw attempt failed. You can max withdraw 5000");
		}else {
			System.out.println("you have made a withdraw of "+amount);
			this.balance -= amount;
		}
		this.balance();
	}

	@Override
	public void balance() {
		System.out.println("your balance is: "+this.balance);
	}
	
	public void printOptions() {
		System.out.println("-press 1 for deposit");
		System.out.println("-press 2 for withdraw");
		System.out.println("-press 3 for balance");
		System.out.println("-press 9 to exit app");
		System.out.println();
		
	}
	
	//this method is called if user input is a String instead of a number
	public void invalidUserInput() {
		System.out.println("you have made an invalid input, please check and try again");
		this.scanner.nextLine(); //necessary to not end in an infinite loop
	}
}
