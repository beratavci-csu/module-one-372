import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;


public class BankAccount {
	
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	
	public BankAccount () {
		this.balance = 0.0;
	}
	
	
	public BankAccount (String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.accountID = accountID;
		this.balance = 0.0;
	}
		
	
	
    public String deposit(double moneyIn) {
        try { {
            	this.balance = moneyIn + balance;
                return "You have deposited: $" + moneyIn;
            }
        } catch (Exception e) {
            return "ERROR Deposit Failed: " + e.getMessage();
        }
    }
    
    public String withdrawal(double moneyOut) {
        try { {
        	this.balance = balance - moneyOut;
                return "You have withdrawm: $" + moneyOut;
            }
        } catch (Exception e) {
            return "ERROR Withdrawal Failed: " + e.getMessage();
        }
    }
    
    public String setFirstName(String firstName) {
        try {
            if (firstName != null && !firstName.isEmpty()) {
            	this.firstName = firstName;
                return "New First name: " + firstName;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to Change First Name: " + e.getMessage();
        }
    }
    
    public String setLastName(String lastName) {
        try {
            if (lastName != null && !lastName.isEmpty()) {
            	this.lastName = lastName;
                return "New Last name: " + lastName;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to Change Last Name: " + e.getMessage();
        }
    }
    
    public String setAccontID(int accountID) {
        try {
            if (accountID != 0) {
            	this.accountID = accountID;
                return "New Account ID: " + accountID;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to Change Account ID: " + e.getMessage();
        }
    }
    
    public String getBalance() {
        try {
            if (firstName != null && !firstName.isEmpty()) {
                return "Account Balance: $" + balance;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to retrieve balance: " + e.getMessage();
        }
    }
    public String getAccountID() {
        try {
            if (accountID != 0) {
                return "Account ID: " + accountID;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to retrieve Account ID: " + e.getMessage();
        }
    }
    public String getFirstName() {
        try {
            if (firstName != null && !firstName.isEmpty()) {
                return "First Name " + firstName;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to retrieve first name: " + e.getMessage();
        }
    }
	
    public String getLastName() {
        try {
            if (lastName != null && !lastName.isEmpty()) {
                return "Last Name " + lastName;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to retrieve last name: " + e.getMessage();
        }
    }
	
	
	public String[] accountSummary() {
        try {
            String[] info = new String[4];
            info[0] = "First name: " + firstName;
            info[1] = "Last name: " + lastName;
            info[2] = "Account ID: " + accountID;
            info[3] = "Account Balance: $" + balance;
            return info;
        } catch (Exception e) {
            String[] error = new String[1];
            error[0] = "ERROR Failed to account summary " + e.getMessage();
            return error;
        }
		
	}


	public static void main(String[] args) {
		BankAccount myBalance = new BankAccount("Jane", "Doe", 434543);
		
		System.out.println(myBalance.deposit(55.55));
		System.out.println(myBalance.withdrawal(00.55));
		System.out.println(myBalance.setFirstName("John"));
		System.out.println(myBalance.setLastName("Doe"));
		System.out.println(myBalance.setAccontID(64521265));




		System.out.println(myBalance.getFirstName());
		System.out.println(myBalance.getLastName());
		System.out.println(myBalance.getAccountID());
		System.out.println(myBalance.getBalance());
		
		System.out.println(Arrays.toString(myBalance.accountSummary()));
		
		
	}
	
}
