package application;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	// Constructor 
	public BankAccount() {
		this.balance = 0;
	}
	
	public BankAccount(String firstName, String lastName, int accountID, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = balance; 
		
		if (balance >= 0) {
			this.balance = balance;
		}
		else {
			System.out.println ("Initial balance cannot be negative. Setting balance to 0.");
			this.balance = 0;
			}
	}
	
	// Deposit method
    public void deposit(double amount) {
    	if(amount > 0) {
    		this.balance += amount;
    	}
    	else {
    		System.out.println("Deposit amount must be positive.");
    	}
    }
    
    // Withdraw method
    public void withdrawal(double amount) {
    	this.balance -= amount;
    }
    
    // Get & set methods 
    public String getfirstName() {
    	return firstName;
    }
    
    public void setfirstName (String firstName) {
    	this.firstName = firstName;
    }
    
    public String lastName() {
    	return lastName;
    }
    
    public void setlastName (String lastName) {
    	this.lastName = lastName;
    }
    
    public int getaccountID() {
    	return accountID;
    }
    
    public void setaccountID (int accountID) {
    	this.accountID = accountID;
    }
    
    public double getbalance() {
    	return balance;
    }
    
    public void setbalance (double balance) {
    	this.balance = balance;
    }
    
    // Account summary method
    public void accountSummary() {
    	System.out.println("\nAccount Summary:");
    	System.out.println("First name: " + firstName);
    	System.out.println("Last name: " + lastName);
    	System.out.println("Account ID: " + accountID);
    	System.out.println("Balance: " + balance);
    	
    }
}

