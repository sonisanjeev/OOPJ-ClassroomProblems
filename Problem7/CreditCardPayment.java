package Problem7;

class CreditCardPayment extends Payment {

    @Override
    double pay(double amount) {
        System.out.println("Credit Card payment done: " + amount);
        return amount;
    }
}
