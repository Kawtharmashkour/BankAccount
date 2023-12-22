package main;

public class WithdrawLimitException extends BankAccountException{
	public WithdrawLimitException(String message) {
		super(message);
	}
	
	public String getMessage() {
        return super.getMessage();
	}

}
