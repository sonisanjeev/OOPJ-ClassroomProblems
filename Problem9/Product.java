

package Problem9;

class Product
{
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
    System.out.println("Product name " + name +
                      
                     " price Rs. " + price + "/-" + " and category is " +  category);
  }

}