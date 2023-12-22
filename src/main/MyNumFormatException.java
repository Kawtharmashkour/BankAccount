package main;

public class MyNumFormatException extends Exception{
	
	//Constructors
	public MyNumFormatException() {
		super();
	}
	
	public MyNumFormatException(String message) {
		super(message);
	}
	
	public String getMessage() {
        return super.getMessage();
	}
	
	public void isPositveInt(int x) throws MyNumFormatException {
		if(x < 0) {
			throw new MyNumFormatException("Error: Input is negative number");
		}
		
		if(x == 0) {
			throw new MyNumFormatException("Error: Input is 0 number");
		}
	}

}
