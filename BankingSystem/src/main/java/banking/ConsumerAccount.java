package banking;

public class ConsumerAccount extends Account{
  
	private Long accountNumber;
	private double currentbalance;
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		super.setAccountNumber(accountNumber);
		super.setBalance(currentBalance);
		super.setPin(pin);
		
	}
	
		public void creditAccount(double amount) {
			
		}
		
		public boolean debitAccount(double amount) {
			return true;
		}
}
