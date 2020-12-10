package friedchicken;

public class OverdraftBalanceException extends RuntimeException{
	
	public OverdraftBalanceException(String msg) {
        super(msg);
    }
}
