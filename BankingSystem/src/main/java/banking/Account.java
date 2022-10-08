package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;
	
	public Account() {
		
	}
	protected Account (AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin		   = pin;
		this.balance	   = startingDeposit;
	}
	
	public AccountHolder getAccountHolder() {
		return this.accountHolder;
	}
	
	public boolean validatePin(int attemptedPin) {
		if(this.pin == attemptedPin)
			return true;
		else
			 return false;			
	}
    
	public double getBalance() {
		return this.balance;
	}
	public int getPin() {
		return this.pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	
}

