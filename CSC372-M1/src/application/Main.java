package application;
// Test Class
public class Main {
	public static void main(String[]args) {
		CheckingAccount obj = new CheckingAccount("John", "Smith", 8675309, 0);
		System.out.println(obj);
		obj.accountSummary();
		System.out.println("\nMaking a deposite of $50...");
		obj.deposit(50);
		System.out.println("New balance: $" + obj.getbalance());
		
		System.out.println("Making a withdrawl of $320..");
		obj.processWithdrawal(320);
		System.out.println("New balance: $" + obj.getbalance());
		
		obj.displayAccount();
	}
}
