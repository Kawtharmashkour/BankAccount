package main;

//import Exception.*;

public class BankAccount {
	
	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	/** constructor */
	public BankAccount(String name, double balance) {
	this.name = name;
	this.balance = balance;
	}

	/** constructor */
	public BankAccount(String name) {
	this(name,0);
	}	

	/** return balance */
	public double getbalance() {
	return balance;
	}

	/** return name */
	public String getName() {
	return name;
	}

	public String toString() {
	return "Name: " + name + "\n" + "balance: " + balance ;
	}

	/** deposit money into the account */
	public void deposit(double depositAmount) throws BankAccountException {
		
		if(depositAmount <= 0) {
			throw new InvalidAmountException("Invalid deposit amount : it should be more than (0)\n ");
		}
		
		if(depositAmount > depositLimit) {
			throw new DepositLimitException("Deposit amount exceeds limit ("+ depositLimit+")\n");
		}
		
		//Deposit the money
		balance = balance + depositAmount;
		System.out.printf("New balance = %.2f $\n", balance);

	}
	
	
	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
	
		if(withdrawAmount <= 0) {
			throw new InvalidAmountException("Invalid deposit amount : it should be more than (0)\n ");
		}
		
		if(withdrawAmount > withdrawLimit) {
			throw new WithdrawLimitException("Withdraw amount exceeds limit ("+ withdrawLimit+")\n");
		}
		
		if(withdrawAmount > balance) {
			throw new NotEnoughBalanceException("No enough balance in the account.\n");
		}
		
		//Withdraw the money
		balance = balance - withdrawAmount;
		System.out.printf("New balance = %.2f $\n", balance);
	}


}
