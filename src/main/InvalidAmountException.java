package main;

public class InvalidAmountException extends BankAccountException{
	
	//Constructor
	public InvalidAmountException(String message) {
		super(message);
	}
	
	public String getMessage() {
	        return super.getMessage();
	}

}
