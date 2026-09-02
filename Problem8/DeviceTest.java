//Scenario: A smart device system supports different devices.
// Every device must provide turnOn() and turnOff() operations.
//        (a) Create an interface Device containing
//        methods turnOn() and turnOff(). [3]
//        (b) Create a class Television that implements the
//        Device interface. [3]
//        (c) Implement both methods in the Television class. [2]
//        (d) Complete the program using the driver code. [2]

package Problem8;

public class DeviceTest {
    public static void main(String[] args) {

        Device d = new Television();

        d.turnOn();
        d.turnOff();
    }
}
