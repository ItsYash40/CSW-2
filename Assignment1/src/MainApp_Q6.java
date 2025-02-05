// College.java
class College {
    private String collegeName;
    private String collegeLoc;

    // Constructor
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    // Getter methods
    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    @Override
    public String toString() {
        return "College: " + collegeName + ", Location: " + collegeLoc;
    }
}

// Student.java
class Student {
    private int studentId;
    private String studentName;
    private College college;

    // Constructor
    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName);
        System.out.println(college);
    }
}

// MainApp.java
public class MainApp_Q6 {
    public static void main(String[] args) {
        // Creating College objects
        College college1 = new College("ITER Engineering College", "INDIA");
        College college2 = new College("XYZ Science Institute", "Los Angeles");

        // Creating Student objects and enrolling them in colleges
        Student student1 = new Student(101, "Yash", college1);
        Student student2 = new Student(102, "Diya", college2);

        // Displaying student details
        System.out.println("Student Details:");
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
