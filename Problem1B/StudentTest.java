package Problem1B;
class Student{
   private String name;
    private int rollno;
    private double marks;
    static int studentCount=0;

    Student(String name, int rollno, double makrs){
        this.name=name;
        this.rollno=rollno;
        this.marks=makrs;
        studentCount++;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }
    public double getMarks(){
        return marks;
    }
    
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 85.5);
        Student s2 = new Student("Priya", 102, 91.0);
        System.out.println(s1.getName());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Total Students: " + Student.studentCount);
    }
}

/* package run command

javac Problem1/*.java
java Problem1B.StudentTest   */