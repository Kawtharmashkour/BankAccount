package main;

public class NotEnoughBalanceException extends BankAccountException{
	
	public NotEnoughBalanceException(String message) {
		super(message);
	}
	
	public String getMessage() {
        return super.getMessage();
	}

}
