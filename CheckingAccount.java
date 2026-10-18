public class CheckingAccount extends BankAccount {

    // Interest Rate Attribute
    private double interestRate;

    // Constructor
    public CheckingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    // Process Withdrawal and Overdraft Fee
    public void processWithdrawal(double amount) {

        withdrawal(amount);

        if (getBalance() < 0) {
            withdrawal(30.00);
            System.out.println("Overdraft Fee Ammount: $30.00");
        }

        System.out.printf("Balance After Withdrawal: $%.2f%n", getBalance());
    }

    // Display Account Information
    public void displayAccount() {
        System.out.println("----- CHECKING ACCOUNT SUMMARY -----");
        accountSummary();
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}