/* Scenario: A transport company wants to represent different types of vehicles. All vehicles
have a brand and speed, while a car additionally has the number of doors.
(a) Create a superclass Vehicle with protected data members brand and speed, and a
parameterized constructor. [3]
(b) Create a subclass Car that inherits from Vehicle and contains an additional data member
numberOfDoors. [3]
(c) Use super() to initialize the superclass fields and create a method display() to display
all details. [2]
(d) Complete the classes using the driver code. [2] */

package Problem4;

class Vehicle {

    protected String brand;
    protected int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car extends Vehicle {

    int numberofDoors = 4;

    Car(String brand, int speed) {
        super(brand, speed); 
        // super(brand, speed) calls the constructor of the parent class Vehicle
    }
    void display() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + ", Number of Doors: " + numberofDoors);
    }
}

public class VehicleTest {

    public static void main(String[] args) {

        Car obj = new Car("Maruti", 140);

        obj.display();
    }
}
