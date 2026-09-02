/*
Scenario: A shape drawing application supports circles and rectangles. Every shape has an area() method, but the calculation differs for each shape.
(a) Create a superclass Shape containing a method area(). [2]
(b) Create a subclass Circle with radius and override area(). [3]
(c) Create a subclass Rectangle with length and width and override area(). [3]
(d) Use the following driver code to demonstrate runtime polymorphism. [2]
*/
// package Problem10;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 5);
        s1.area();
        s2.area();

        // System.out.println("Circle Area: " + s1.area());
        // System.out.println("Rectangle Area: " + s2.area());
    }
}
