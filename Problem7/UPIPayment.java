package Problem7;

class UPIPayment extends Payment {

    @Override
    double pay(double amount) {
        System.out.println("UPI payment done: " + amount);
        return amount;
    }
}