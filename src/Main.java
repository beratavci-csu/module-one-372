import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		CheckingAccount myBalance = new CheckingAccount("John", "Doe", 987654321, 0.12);
		System.out.println(Arrays.toString(myBalance.accountSummary()));
		System.out.println(Arrays.toString(myBalance.displayAccount()));
		
		System.out.println(myBalance.setFirstName("Jane"));
		System.out.println(myBalance.setLastName("Dough"));
		System.out.println(myBalance.setAccontID(123456789));
		System.out.println(myBalance.deposit(120));
		System.out.println(myBalance.processWithdrawal(200.00));
		System.out.println(myBalance.deposit(520));
		System.out.println(myBalance.getFirstName());
		System.out.println(myBalance.getLastName());
		System.out.println(myBalance.getAccountID());
		System.out.println(myBalance.getBalance());
		
		System.out.println(myBalance.balance);
		System.out.println(Arrays.toString(myBalance.accountSummary()));
		System.out.println(Arrays.toString(myBalance.displayAccount()));

	}
}
