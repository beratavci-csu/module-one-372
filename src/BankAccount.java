
///////try get!!!

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
	

	
	public void deposit(double moneyIn) {
		this.balance = moneyIn + balance;
		System.out.println("You have deposited: $" + moneyIn );
	}
	
	public void withdrawal(double moneyOut) {
		this.balance = balance - moneyOut;
		System.out.println("You have withdrawm: $" + moneyOut );

		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("First name of primary owner: " + firstName );
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("Last name of primary owner: " + lastName );
	}
	
	public void setAccontID(int accountID) {
		this.accountID = accountID;
		System.out.println("First name of primary owner:" + firstName );
	}
	
	public void getBalance () {
		System.out.println("Account Balance: $" + balance );
	}
	
	public void accountSummary() {
		System.out.println("First name of primary account holder: " + firstName);
		System.out.println("Last name of primary account holder:" + lastName);
		System.out.println("Account ID:" + accountID);
		System.out.println("Account Balance: $" + balance);
	}


	public static void main(String[] args) {
		BankAccount myBalance = new BankAccount("Tom", "Riddle", 434543);
		
		myBalance.deposit(55.55);
		myBalance.withdrawal(00.55);
		myBalance.setFirstName("Vivek");
		myBalance.setFirstName("Marvolo");
		myBalance.setAccontID(64521265);


		System.out.println(myBalance.firstName);
		System.out.println(myBalance.lastName);
		System.out.println(myBalance.accountID);
		System.out.println(myBalance.balance);
		
		myBalance.getBalance();
		
	}
	
}
