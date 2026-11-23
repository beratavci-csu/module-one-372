

public class CheckingAccount extends BankAccount {
	private double interestRate;
	private double balance;
	private double overdraftFee = 30.00;
	
	public CheckingAccount (String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		this.interestRate = interestRate; 
		this.balance = 0.0;
	}
	
	
	public static void main(String[] args) {
		CheckingAccount myBalance = new CheckingAccount("Jane", "Doe", 434543, 0.12);
		
		myBalance.deposit(55.55);
		myBalance.withdrawal(00.55);
		myBalance.setFirstName("John");
		myBalance.setLastName("Doe");
		myBalance.setAccontID(64521265);
		
	}
	
	
}
