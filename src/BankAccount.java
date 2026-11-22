
public class BankAccount {
	
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	
	public BankAccount () {
		this.balance = 0.9;
	}
	
	
	public BankAccount (String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.accountID = accountID;
		this.balance = 0;
	}
	


	public static void main(String[] args) {
		BankAccount myBalance = new BankAccount();
		
		System.out.println(myBalance.balance);
	}
	
}
