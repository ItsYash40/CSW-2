class Student {
 private String name;
 private String rollNumber;
 private int age;

 public Student(String name, String rollNumber, int age) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.age = age;
 }
 public String getName() {
     return name;
 }

 public String getRollNumber() {
     return rollNumber;
 }

 public int getAge() {
     return age;
 }
 public void displayDetails() {
     System.out.println("Student Details:");
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Age: " + age);
 }
}

public class Ass2P1_Q1 {
 public static void main(String[] args) {
     Student student1 = new Student("Yash", "CSE2024", 21);
     Student student2 = new Student("Diya", "DSA102", 21); 

     student1.displayDetails();
     System.out.println(); 
     student2.displayDetails();
 }
}