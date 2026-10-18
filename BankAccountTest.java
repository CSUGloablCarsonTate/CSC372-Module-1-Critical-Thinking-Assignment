import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- BANK ACCOUNT SYSTEM -----");

        // Account Information
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Account ID Number: ");
        int accountID = input.nextInt();

        System.out.print("Enter Interest Rate (%): ");
        double interestRate = input.nextDouble();

        // Create New Checking Account
        CheckingAccount account = new CheckingAccount(interestRate);

        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setAccountID(accountID);

        // Deposit Amount
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        // Withdrawal Amount
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = input.nextDouble();
        account.processWithdrawal(withdrawalAmount);

        // Display Account details
        account.displayAccount();

        input.close();
    }
}
