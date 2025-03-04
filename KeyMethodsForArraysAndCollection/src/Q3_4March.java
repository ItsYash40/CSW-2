import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    private int id;
    private String name;
    private int marks;
    private int roll;

    public Student1(int id, String name, int marks, int roll) {
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
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                '}';
    }
}

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class MarksComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return Integer.compare(s2.getMarks(), s1.getMarks()); 
    }
}

class RollComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return Integer.compare(s1.getRoll(), s2.getRoll());
    }
}

class IdComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return Integer.compare(s1.getId(), s2.getId());
    }
}

public class Q3_4March {
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();
        students.add(new Student1(3, "Yash", 78, 103));
        students.add(new Student1(1, "Sneha", 85, 101));
        students.add(new Student1(4, "Diya", 92, 104));
        students.add(new Student1(2, "Arka", 90, 102));

        System.out.println("Students before sorting:");
        for (Student1 student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new NameComparator());
        System.out.println("\nStudents after sorting by name:");
        for (Student1 student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new MarksComparator());
        System.out.println("\nStudents after sorting by marks (descending order):");
        for (Student1 student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new RollComparator());
        System.out.println("\nStudents after sorting by roll number:");
        for (Student1 student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new IdComparator());
        System.out.println("\nStudents after sorting by ID:");
        for (Student1 student : students) {
            System.out.println(student);
        }
    }
}