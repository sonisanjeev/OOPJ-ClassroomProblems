 package Collection.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}

class ageComprator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class compratator {
    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();
        Student s1 = new Student(101, "Ayay", 25);
        Student s2 = new Student(104, "Ayay2", 22);
        Student s3 = new Student(105, "Ayay3", 21);
        Student s4 = new Student(103, "Ayay", 20);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);

        Collections.sort(stu, new ageComprator());

        for (Student s : stu) {
            System.out.println(s);
        }

    }
}
