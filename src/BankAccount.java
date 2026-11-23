import java.util.Arrays;


public class BankAccount {
	
	protected  String firstName;
	protected String lastName;
	protected int accountID;
	protected  double balance;
	
	
	public BankAccount (String firstName, String lastName, int accountID) {
		this.firstName = firstName;
		this.lastName = lastName;		
		this.accountID = accountID;
		this.balance = 0.0;
	}
		
	
    public String deposit(double moneyIn) {
        try {
            balance = moneyIn + balance;
               return "You have deposited: $" + moneyIn + ". \nYour new balance is: $" + balance;
           
        } catch (Exception e) {
            return "ERROR Deposit Failed: " + e.getMessage();
        }
    }
    
    public String withdrawal(double moneyOut) {
        try {
        	balance = balance - moneyOut;
             return "You have withdrawm: $" + moneyOut + ". \nYour new balance is: $" + balance;
           
        } catch (Exception e) {
            return "ERROR Withdrawal Failed: " + e.getMessage();
        }
    }
    
    public String setFirstName(String firstName) {
        try {
            if (accountID != 0) {
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
            if (accountID != 0) {
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
            if (accountID != 0) {
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
            if (accountID != 0) {
                return "First Name: " + firstName;
            } else {
                return "Account does not exist";
            }
        } catch (Exception e) {
            return "ERROR Failed to retrieve first name: " + e.getMessage();
        }
    }
	
    public String getLastName() {
        try {
            if (accountID != 0) {
                return "Last Name: " + lastName;
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
            if (accountID != 0) {
                info[0] = "First name: " + firstName;
                info[1] = "Last name: " + lastName;
                info[2] = "Account ID: " + accountID;
                info[3] = "Account Balance: $" + this.balance;
                return info;
            } else {
            	String[] error = new String[1];
            	error[0] = ("ACCOUNT DOE NOT EXIST");
                return error;
            }
        } catch (Exception e) {
            String[] error = new String[1];
            error[0] = "ERROR Failed to account summary " + e.getMessage();
            return error;
        }
		
	}


	public static void main(String[] args) {
		BankAccount myBalance1 = new BankAccount("Jane", "Doe", 434543);
		//System.out.println(myBalance.firstName);
		//System.out.println(myBalance.lastName);
		//System.out.println(myBalance.accountID);
		//System.out.println(myBalance.balance);
		System.out.println(Arrays.toString(myBalance1.accountSummary()));
		System.out.println(myBalance1.deposit(120));
		System.out.println(myBalance1.balance);
		System.out.println(myBalance1.deposit(50));
		System.out.println(myBalance1.balance);
		System.out.println(myBalance1.withdrawal(10));
		System.out.println(myBalance1.balance);
		System.out.println(myBalance1.setFirstName("John"));
		System.out.println(myBalance1.setLastName("Doe"));
		System.out.println(myBalance1.setAccontID(64521265));




		System.out.println(myBalance1.getFirstName());
		System.out.println(myBalance1.getLastName());
		System.out.println(myBalance1.getAccountID());
		System.out.println(myBalance1.getBalance());
		
		System.out.println(Arrays.toString(myBalance1.accountSummary()));
		
		
	}
	
}
