package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface{
	
	private LinkedHashMap<Long, Account> accounts = new LinkedHashMap<Long, Account>();
	private static int accSeq = 0;
	private int accNum = 0;
    public Bank() {
    	
    }
    
    public Account getAccount(Long accountNumber) {
    	return accounts.get(accountNumber);
    }
    
    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
    	accNum = ++accSeq;
    	accounts.put(new Long(accNum), new CommercialAccount(company, new Long(accNum), pin,startingDeposit));
    	return new Long(accNum);
    }
    
    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
    	accNum = ++accSeq;
    	accounts.put(new Long(accNum), new ConsumerAccount(person, new Long(accNum), pin,startingDeposit));
    	return new Long(accNum);
    }
    
    public boolean authenticateUser(Long accountNumber, int pin) {
    	if(accounts.get(accountNumber).getPin() == pin) {
    		return true;
    	}
    	return false;
    }
    
    public double getBalance(Long accountNumber) {
    	return accounts.get(accountNumber).getBalance();
    }
    
    public void debit(Long accountNumber, double debitAmount) {
    	
    	double balAmt = accounts.get(accountNumber).getBalance() - debitAmount;
    	Account obj = accounts.get(accountNumber);
    	obj.setBalance(balAmt);
    	accounts.put(accountNumber, obj);
    }
    
  public void credit(Long accountNumber, double creditAmount) {
    	
    	double balAmt = accounts.get(accountNumber).getBalance() + creditAmount;
    	Account obj = accounts.get(accountNumber);
    	obj.setBalance(balAmt);
    	accounts.put(accountNumber, obj);
    }
    
}
