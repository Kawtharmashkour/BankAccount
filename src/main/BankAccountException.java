package main;

public class BankAccountException extends Exception{
	
	//Consturctor
	public BankAccountException(String message) {
		super(message);
	}

	public String getMessage() {
	        return super.getMessage();
	}
	
	

}
