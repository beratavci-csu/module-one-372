import java.util.Arrays;

public class CheckingAccount extends BankAccount {
	protected double interestRate;
	protected double overdraftFee = 30.00;
	
	
	public CheckingAccount (String firstName, String lastName, int accountID, double interestRate) {
		super(firstName, lastName, accountID);
		super.balance = 0.00;
		this.interestRate = interestRate; 
	}
	
    public String processWithdrawal (double moneyOut) {
        try {
        	balance = balance - moneyOut;
        	
            if (balance >= 0) {
            	return "You have withdrawm: $" + moneyOut + ". \nYour new balance is: $" + balance;	
            }
            else {
            	balance = balance - overdraftFee;
            	return "You have withdrawm: $" + moneyOut + ". You have incurred an overdraft fee of $" + overdraftFee + ". \nYour new balance with the fee is: $" + balance;
            }
        } catch (Exception e) {
            return "ERROR Withdrawal Failed: " + e.getMessage();
        }
    }
	
	public String[] displayAccount() {
        try {
        	 String[] info = new String[5];
            if (accountID != 0) {
                info[0] = "First name: " + firstName;
                info[1] = "Last name: " + lastName;
                info[2] = "Account ID: " + accountID;
                info[3] = "Account Balance: $" + balance;
                info[4] = "Interest Rate: $" + interestRate*100 + "%";
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
	
}
