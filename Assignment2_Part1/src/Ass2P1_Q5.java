public class Ass2P1_Q5 {
    public static void main(String[] args) {
        Student2[] students = new Student2[3];
        students[0] = new Student2("Yash", 102, 95.5);
        students[1] = new Student2("Arka", 103, 88.0);
        students[2] = new Student2("Diya", 101, 92.0);

        bubbleSort(students);

        System.out.println("Sorted student details:");
        for (Student2 student : students) {
            System.out.println(student.toString());
        }
    }

    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Student2(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + totalMark;
    }

    @Override
    public int compareTo(Student2 s) {
        return Integer.compare(this.rollNumber, s.rollNumber);
    }
}
 

/* 
 5. Write a program to create a Student class with member variables name, rollNumber, 
and totalMark. The program should create an array of Student objects and sort them 
using the Bubble Sort algorithm based on their roll numbers.  
Note: Implement the Comparable interface and override the compareTo() method for 
comparison. */