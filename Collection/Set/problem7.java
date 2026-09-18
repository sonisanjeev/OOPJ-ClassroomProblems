// package Collection.Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class problem7 {
       public static Set<String> removeDuplicates(List<String> names) {
        // Write your code
       
        Set<String> uniqueNames=new LinkedHashSet<>(names);
        return  uniqueNames;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Aman");
        names.add("Riya");
        names.add("Simran");
        names.add("Karan");

        Set<String> uniqueNames = removeDuplicates(names);

        System.out.println("Original List: " + names);
        System.out.println("Unique Names: " + uniqueNames);

        
    }
    
}
