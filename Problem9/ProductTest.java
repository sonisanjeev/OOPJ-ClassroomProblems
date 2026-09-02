package Problem9;

// Scenario: A product management application should allow products to be created with different amounts of information.
// (a) Create a class Product with fields name, price, and category. [2]
// (b) Create a constructor that accepts only name and initializes price to 0 and category to "General". [3]
// (c) Create another constructor that accepts name, price, and category and display method [3]
// (d) Complete the class using the driver code. [2]

class Product{
    String name;
    double price;
    String category;

    Product(String name){
        this.name=name;
        this.price=0;
        this.category="General";

    }
    Product(String name, double price, String category){
        this.name=name;
        this.price=price;
        this.category=category;

    }
    void display(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("Product Category: "+category);
    }
}



public class ProductTest {
    public static void main(String[] args) {

        Product p1 = new Product("Keyboard");

        Product p2 =
            new Product("Laptop", 55000, "Electronics");

        p1.display();
        p2.display();
    }
}
