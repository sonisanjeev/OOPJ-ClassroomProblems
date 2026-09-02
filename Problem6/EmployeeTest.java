package Problem6;
//Scenario: A company has different types of employees. Every employee can calculate a bonus, but the bonus calculation is different for a manager and a developer.
//        (a) Create a superclass Employee with a method calculateBonus() that returns 5000. [3]
//        (b) Create a subclass Manager that overrides calculateBonus() and returns 10000. [2]
//        (c) Create a subclass Developer that overrides the same method and returns 8000. [2]
//        (d) Complete the program using the driver code to demonstrate method overriding. [3]
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
