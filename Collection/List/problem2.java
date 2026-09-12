package Collection.List;

import java.util.LinkedList;

public class problem2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. Add patients.
        list.add("Ravi");
        list.add("Vikas");
        list.add("Vikas2");
        list.add("Vikas3");
        list.add("Vikas4");

        // display list
        System.out.println("List of patients " + list);

        // 2. Add an emergency patient at the beginning.
        list.addFirst("Vikas4");
        System.out.println("Updated list after adding " + list);

        // 3. Add a patient at the end.
        list.addLast("Ravi2");
        System.out.println("Update list after adding at the end " + list);

        // 4. Remove the first patient after consultation.
        list.removeFirst();
        System.out.println("Update List after removing first" + list);

        // 5. Display the remaining patients.

        System.out.println("Patient name is " + list);

    }

}
