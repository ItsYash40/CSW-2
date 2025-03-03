package Mar03;
//Student class definition
class Student {
 private String name;
 private String rollNumber; // Using String to accept both numbers and strings
 private int age;

 // Constructor
 public Student(String name, String rollNumber, int age) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.age = age;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public String getRollNumber() {
     return rollNumber;
 }

 public int getAge() {
     return age;
 }

 // Display method
 public void displayDetails() {
     System.out.println("Student Details:");
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Age: " + age);
 }
}

//Driver class
public class Q4 {
 public static void main(String[] args) {
     // Creating Student objects
     Student student1 = new Student("Anwesha", "CSE2024", 21);
     Student student2 = new Student("Sreeja", "102", 21); // RollNumber as integer (stored as String)

     // Display student details
     student1.displayDetails();
     System.out.println(); // Line break
     student2.displayDetails();
 }
}