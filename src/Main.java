import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("SUPERCLASS");
		BankAccount myBalanceSuper = new BankAccount("Jane", "Doe", 64091265);
		System.out.println(Arrays.toString(myBalanceSuper.accountSummary()));
		System.out.println(myBalanceSuper.setFirstName("John"));
		System.out.println(myBalanceSuper.setLastName("Doe"));
		System.out.println(myBalanceSuper.setAccontID(64521265));
		System.out.println(myBalanceSuper.deposit(120));
		System.out.println(myBalanceSuper.deposit(50));
		System.out.println(myBalanceSuper.withdrawal(10));
		System.out.println(myBalanceSuper.getFirstName());
		System.out.println(myBalanceSuper.getLastName());
		System.out.println(myBalanceSuper.getAccountID());
		System.out.println(myBalanceSuper.getBalance());
		System.out.println(Arrays.toString(myBalanceSuper.accountSummary()));
		
		System.out.println("");

		System.out.println("SUBCLASS");
		CheckingAccount myBalanceSub = new CheckingAccount("John", "Doe", 987654321, 0.12);
		System.out.println(Arrays.toString(myBalanceSub.accountSummary()));
		System.out.println(Arrays.toString(myBalanceSub.displayAccount()));
		System.out.println(myBalanceSub.setFirstName("Jane"));
		System.out.println(myBalanceSub.setLastName("Dough"));
		System.out.println(myBalanceSub.setAccontID(123456789));
		System.out.println(myBalanceSub.deposit(120));
		System.out.println(myBalanceSub.processWithdrawal(200.00));
		System.out.println(myBalanceSub.deposit(520));
		System.out.println(myBalanceSub.getFirstName());
		System.out.println(myBalanceSub.getLastName());
		System.out.println(myBalanceSub.getAccountID());
		System.out.println(myBalanceSub.getBalance());
		System.out.println(Arrays.toString(myBalanceSub.accountSummary()));
		System.out.println(Arrays.toString(myBalanceSub.displayAccount()));
		
		

	}
}
