package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction implements TransactionInterface{
	private double balance;
	private Bank bank;
	private Long accountNumber;
	 public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception{
		 this.balance = bank.getAccount(accountNumber).getBalance();
		 this.bank = bank;
		 this.accountNumber = accountNumber;
	 }
	 
	 public double getBalance() {
		 return bank.getBalance(this.accountNumber);
	 }
	 
	 public void credit(double amount) {
	    	Account obj = this.bank.getAccount(this.accountNumber);
	   	    double balAmt =obj.getBalance() + amount;
	 	
	    	obj.setBalance(balAmt);
	 }
	 
	 public boolean debit(double amount) {
		 return true;
	 }

}

