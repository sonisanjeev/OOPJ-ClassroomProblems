package Problem3;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Sanjeev", 101, 50000);
        BankAccount b2 = new BankAccount("Rahul", 102, 75000);

        System.out.println("Bank Name: " + BankAccount.bankName);

        System.out.println("Account Holder: " + b1.getAccountHolder());
        // System.out.println("Account Number: " + b1.getAccountNumber());
        // System.out.println("Balance: " + b1.getBalance());

        System.out.println();

        System.out.println("Account Holder: " + b2.getAccountHolder());
        // System.out.println("Account Number: " + b2.getAccountNumber());
        // System.out.println("Balance: " + b2.getBalance());

        System.out.println();

        System.out.println("Total Accounts: " + BankAccount.accountCount);
    }
}