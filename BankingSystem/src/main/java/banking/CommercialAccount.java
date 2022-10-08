package banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount extends Account{
	
	private List<Person> authorizedUser;
	private Long accountNumber;
	private double starttingDeposit;
	private int pin;
	
	public CommercialAccount(Company company, Long accountNumber, int pin,  double startingDeposit) {
	
		super.setAccountNumber(accountNumber);
		super.setBalance(startingDeposit);
		super.setPin(pin);
	}
	
	protected void addAuthorizedUser(Person person) {
		
	}
    
	public boolean isAuthorizedUser(Person person) {
		return true;
	}
	
    public Long getAccountNumber() {
    	return accountNumber;
    }
	
	public void creditAccount(double amount) {
		
	}
	
	public boolean debitAccount(double amount) {
		return true;
	}
	
}
