package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        // using user input
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of student's makrs");

        int n=sc.nextInt();

        for(int i=0; i<n;i++){
            marks.add(sc.nextInt());
        }
        System.out.println("List after adding marks " + marks);

        // manuual

        marks.add(44);
        marks.add(47);
        marks.add(40);
        marks.add(49);
        marks.add(48);
        System.out.println("updated list after adding marks" + marks);
        // to display each value
        for (Integer res : marks) {
            System.out.println("Marks list is " + res);
        }
        // to iterate each value
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            System.out.println("Marks is " + it.next());
        }
        // update the marks of thirs students
        marks.set(2, 50);

        // remove the marks of second student
        marks.remove(1);

        // display the highest marks
        int max = 0;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i)> max) {
                max = marks.get(i);
            }
        }
        System.out.println("Highest marks" + max);

        // final list
        System.out.println("FInal List" + marks);

    }
}