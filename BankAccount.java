public class BankAccount {

    // Attributes
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // default Constructor
    public BankAccount() {
        balance = 0.0;
    }

    // Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdrawal Method
    public void withdrawal(double amount) {
        balance -= amount;
    }

    // Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // Account Summary
    public void accountSummary() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}