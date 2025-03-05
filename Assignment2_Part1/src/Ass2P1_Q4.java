public class Ass2P1_Q4 {
    public static void main(String[] args) {
    	Student1[] students = new Student1[3];
        students[0] = new Student1("Yash", 101, 95.5);
        students[1] = new Student1("Diya", 102, 88.0);
        students[2] = new Student1("Sneha", 103, 92.0);

        int searchRollNumber = 102;

        Student1 foundStudent = findStudentByRollNumber(students, searchRollNumber);
        if (foundStudent != null) {
            System.out.println("Student found: \n" + foundStudent.toString());
        } else {
            System.out.println("Student with Roll Number " + searchRollNumber + " not found.");
        }

        int comparisonResult = students[0].compareTo(students[1]);
        if (comparisonResult > 0) {
            System.out.println(students[0].getName() + " has scored more than " + students[1].getName());
        } else if (comparisonResult < 0) {
            System.out.println(students[1].getName() + " has scored more than " + students[0].getName());
        } else {
            System.out.println(students[0].getName() + " and " + students[1].getName() + " have scored the same.");
        }
    }

    public static Student1 findStudentByRollNumber(Student1[] students, int rollNumber) {
        for (Student1 student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}

class Student1 implements Comparable<Student1> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Student1(String name, int rollNumber, double totalMark) {
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
    public int compareTo(Student1 s) {
        return Double.compare(this.totalMark, s.totalMark);
    }
}



/*4. Write a program to create a Student class with member variables name, rollNumber, 
and totalMark. The program should allow the creation of an array of Student objects and 
implement a linear search to find a specific student in the array. Additionally, the Student 
class should implement the Comparable interface by overriding the compareTo() method 
to facilitate comparisons between student objects.*/