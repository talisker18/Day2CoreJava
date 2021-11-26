package homework;

import java.util.InputMismatchException;

public class BankRunner {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		System.out.println("hello and welcome to the banking application.");
		
		while(!acc.programExcitedByUser) {
			System.out.println("What do you want to do?");
			acc.printOptions();
			
			System.out.print("make your choice: ");
			int choice = -1;
			
			try {
				choice = acc.scanner.nextInt();
				
				switch(choice) {
					case 1: 
						System.out.println("you have chosen to deposit money");
						System.out.print("how much do you want to deposit? Enter a number: ");
						double amount = -1;
						try {
							amount = acc.scanner.nextDouble();
							acc.deposit(amount);
							
						}catch (InputMismatchException e) {
							acc.invalidUserInput();
						}
						break;
					case 2: 
						System.out.println("you have chosen to withdraw money");
						System.out.print("how much do you want to withdraw? Enter a number: ");
						try {
							amount = acc.scanner.nextDouble();
							acc.withdraw(amount);
							
						}catch (InputMismatchException e) {
							acc.invalidUserInput();
						}
						break;
					case 3: 
						System.out.println("you have chosen to get the balance");
						acc.balance();
						break;
					case 9:
						System.out.println("you have chosen to exit the app. Thank you and goodbye");
						acc.programExcitedByUser = true;
						break;
					default: //if user does not choose a valid number
						System.out.println("invalid input. please choose a number from 1 to 3 or 9 to exit");
						break;
				}
			}catch (InputMismatchException e){
				acc.invalidUserInput();
			}
			
			System.out.println();
		}
	}

}
