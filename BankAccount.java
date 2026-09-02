import java.io.*;
//userdefined Exception

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insuffient balance " + balance);

        } else {
            balance = balance - amount; // balance-= amount;
            System.out.println("Amount withdrawn successfully. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount(101, 20000);
        try {
            obj.withdraw(22000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
