import java.util.*;
public class hashMap{
    public static void main(String[] args) {
       Map<String, Integer> students = new TreeMap<>();

                // Adding key-value pairs
        students.put("Ajay",20);
        students.put("Ajay1",23);
        students.put("Ajay2",25);
        students.put("Ajay3",26);

          // Display complete HashMap
        System.out.println(students);

         // Get value using key
        System.out.println("Student's age: " + students.get("Ajay"));

        // Check whether key exists
        System.out.println("Is Student present? " + students.containsKey("Ajay2"));

        // Check whether value exists
        System.out.println("Is Ajay3 age is valid or not " + students.containsValue(20));

        // Remove using key
        students.remove("Ajay");

        System.out.println("After removing : " + students);

        // adding same keys
        students.put("Ajay3",29);

        System.out.println(students);

        //adding null 
        students.put(null, null);
        System.out.println(students);





    }
}