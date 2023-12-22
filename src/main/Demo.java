package main;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws MyNumFormatException {
		int choice=0;
		double amount = 0;
		MyNumFormatException myExptionHandler = new MyNumFormatException();
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount("Pargol", 55000);
		
		
		do {
			menu();
			System.out.print("Enter you choice : ");
			try {
				choice = sc.nextInt();
				myExptionHandler.isPositveInt(choice);
			}catch(Exception e) {
				if(e.getMessage() == null) {
					System.out.println("\nError: Invalid input. Try again\n");
				}else {
					System.out.println(e.getMessage());
				}
				sc.nextLine(); // Consume the invalid input
                continue;
			}
			
			switch(choice) {
			case 1:System.out.println("\n"+ account.toString() +"\n");
					break;
			case 2: try {
						System.out.println("Enter the deposit amount: ");
						amount = sc.nextDouble();
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					try{
						account.deposit(amount);
						}catch(BankAccountException e) {
								System.out.println(e.getMessage());
						}
					break;
			case 3: try {
						System.out.println("Enter the withdraw amount: ");
						amount = sc.nextDouble();
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					try{
						account.withdraw(amount);;
					}catch(BankAccountException e) {
						System.out.println(e.getMessage());
					}
					break;
			}
		}while(choice <4);
		
	}
	
	public static void menu() {
		System.out.println("1- Review your account.");
		System.out.println("2- Deposit money.");
		System.out.println("3- Withdraw money.");
		System.out.println("4- Exit.");
	}

}
