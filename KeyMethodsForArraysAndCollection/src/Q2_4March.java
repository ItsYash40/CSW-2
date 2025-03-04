import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;
    private int roll;

    public Student(int id, String name, int marks, int roll) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                '}';
    }
}

public class Q2_4March {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arka", 85, 101));
        students.add(new Student(2, "Yash", 90, 102));
        students.add(new Student(3, "Sneha", 78, 103));
        students.add(new Student(4, "Diya", 92, 104));

        System.out.println("Students before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nStudents after sorting by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}