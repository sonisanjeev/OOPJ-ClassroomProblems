package Collection.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem3 {
    public static void main(String[] args) {

        Set<String> students = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        // take user input
        System.out.println("Take n student names");

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter Student name");
        for (int i = 0; i < n; i++) {
            String names = sc.nextLine();
            students.add(names);
            // if you have split the full name mean consider into two parts
            /*
             * String[] name=names.split(" ");
             * for (String stundetName : name) {
             * students.add(stundetName);
             * }
             */
        }
        System.out.println("Display all unique student names");

        for (String set : students) {
            System.out.println(set);
        }
        // Display the total number of unique students.
        System.out.println("the total number of unique students " + students.size());

    }
}