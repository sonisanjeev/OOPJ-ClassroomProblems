/*
Total Marks: 10
Scenario: A payment system supports different payment methods. Every payment method must provide a pay() operation, but the implementation differs for each payment type.
(a) Create an abstract class Payment containing an abstract method pay(double amount). [3]
(b) Create a subclass CreditCardPayment that overrides pay(). [2]
(c) Create a subclass UPIPayment that overrides pay(). [2]
(d) Complete the program using the driver code. [3]

*/

package Problem7;

public class PaymentTest {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(5000);
        p2.pay(2500);
    }
}
