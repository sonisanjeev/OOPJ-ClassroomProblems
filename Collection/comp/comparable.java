package Collection.comp;
import  java.util.*;

import java.util.ArrayList;


//This means the Employee class is defining its own natural sorting order.
class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    //Sort employees according to their salary.
    @Override 
    public  int compareTo(Employee  e){
        return  Double.compare(this.salary, e.salary);
    }
//used to make the Employee objects print in a readable format.
    @Override 
    public  String toString(){
        return  id + " " + name + " " + salary;
    }
    

}

public class comparable {
    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();

        employees.add(new Employee(101,"Ajay",12324));
        employees.add(new Employee(102,"Ajay1",22324));
        employees.add(new Employee(103,"Ajay2",15304));

        Collections.sort(employees);

        for(Employee em:employees){
            System.out.println(em);
        }


        
    }
}
