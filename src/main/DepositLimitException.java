package main;

public class DepositLimitException extends BankAccountException{

	public DepositLimitException(String message) {
		super(message);
	}
	
	public String getMessage() {
        return super.getMessage();
	}
}
