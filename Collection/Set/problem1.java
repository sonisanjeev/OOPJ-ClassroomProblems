// package Collection.Set;

import java.util.*;

public class problem1 {

    // Add a mark to the list
    public static void addMarks(List<Integer> marks, int mark) {
        marks.add(mark);
    }

    // Calculate average of all marks
    public static double calculateAverage(List<Integer> marks) {

        if (marks.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int mark : marks) {
            sum = sum + mark;
        }

        return (double) sum / marks.size();
    }

    // Find highest mark
    public static int findHighest(List<Integer> marks) {

        if (marks.isEmpty()) {
            return 0;
        }

        int highest = marks.get(0);

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    // Display all marks
    public static void displayMarks(List<Integer> marks) {

        System.out.println("Student Marks: " + marks);
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));

        System.out.println("Highest: " + findHighest(marks));
    }
} 
