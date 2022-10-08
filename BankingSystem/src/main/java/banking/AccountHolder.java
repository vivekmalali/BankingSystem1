package banking;

public abstract class AccountHolder {
	
	private int idNumber;
	
	public AccountHolder(int idNumber) {
		this.idNumber = idNumber;
	}
     
	public int gerIdNumber() {
		return idNumber;
	}
}

