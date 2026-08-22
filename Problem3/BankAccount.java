package Problem3;

public class BankAccount {

    // Private fields - Encapsulation
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Static variable
    static int accountCount = 0;

    // Final variable
    final static String bankName = "State Bank";

    // Parameterized constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

        // Increment whenever an account is created
        accountCount++;
    }

    // Getter and Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter and Setter for accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter and Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}