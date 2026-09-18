// package Collection.Set;

import java.util.*;

public class problem5 {
    public static void main(String[] args) {

        SortedSet<Integer> set1 = new TreeSet<>();

        set1.add(23);
        set1.add(28);
        set1.add(25);
        set1.add(26);
        set1.add(24);
        set1.add(23);
        try {
             set1.add(null);
            
        } catch (Exception e) {
          
            System.out.println(e);
        }
       

        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();

        set2.add(23);
        set2.add(34);
        set2.add(35);
        set2.add(35);
        set2.add(34);
        set2.add(33);

        System.out.println("Set2: " + set2);

        // retainAll - keep common elements
        set1.retainAll(set2);
        System.out.println("retainAll: " + set1);

        // addAll - add all elements
        set1.addAll(set2);
        System.out.println("addAll: " + set1);

        // removeAll - remove all common elements
        set1.removeAll(set2);
        System.out.println("removeAll: " + set1);
    }
}