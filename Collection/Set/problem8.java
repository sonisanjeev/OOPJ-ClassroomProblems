// package Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem8 {

       public static Set<Integer> findCommonStudents(
            Set<Integer> event1,
            Set<Integer> event2) {

        // Write your code
        // return null;
        event1.retainAll(event2);
        return event1;
    }
    public static void main(String[] args) {
        Set<Integer> event1 =
                new HashSet<>(Arrays.asList(101, 102, 103, 104));

        Set<Integer> event2 =
                new HashSet<>(Arrays.asList(103, 104, 105, 106));

        Set<Integer> common =
                findCommonStudents(event1, event2);

        System.out.println("Common Students: " + common);

    }
}
