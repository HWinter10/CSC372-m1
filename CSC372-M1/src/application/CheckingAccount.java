package application;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double balance) {
        super (firstName, lastName, accountID,balance);
        this.interestRate = 0.2;
    }

    // Process withdrawal method
    public void processWithdrawal(double amount) {
        if (this.getbalance() < amount) {
            System.out.println("Overdraft! A fee has been accessed.");
            super.withdrawal(30);
            super.withdrawal(amount);
        } else {
            super.withdrawal(amount);
        }
    }

    // Display account method
    public void displayAccount() {
    	accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
