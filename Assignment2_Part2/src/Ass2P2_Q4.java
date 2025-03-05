import java.util.*; 
class Student {
 private String name;
 private int age;
 private double mark;
 public Student(String name, int age, double mark) {
 this.name = name;
 this.age = age;
 this.mark = mark;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
 public double getMark() {
 return mark;
 }
 public void setName(String name) {
 this.name = name;
 }
 public void setAge(int age) {
 this.age = age;
 }
 public void setMark(double mark) {
 this.mark = mark;
 }
 public boolean equals(Object obj) {
 if (this == obj) return true;
 if (obj == null || getClass() != obj.getClass()) return false;
 Student student = (Student) obj;
 return age == student.age && Double.compare(student.mark, mark) == 0 &&
name.equals(student.name);
 }
 public String toString() {
 return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
 }
}
public class Ass2P2_Q4 {
	public static void main(String[] args) {
		 LinkedList<Student> studentList = new LinkedList<>();
		 Scanner sc = new Scanner(System.in);
		 studentList.add(new Student("Yash", 20, 85.5));
		 studentList.add(new Student("Upasana", 21, 90.0));
		 studentList.add(new Student("Arka", 22, 78.0));
		 System.out.println("List of students:");
		 displayStudents(studentList);
		 System.out.println("\nEnter student details to search:");
		 System.out.print("Name: ");
		 String name = sc.nextLine();
		 System.out.print("Age: ");
		 int age = sc.nextInt();
		 System.out.print("Mark: ");
		 double mark = sc.nextDouble();
		 sc.nextLine();
		 Student searchStudent = new Student(name, age, mark);
		 boolean exists = studentList.contains(searchStudent);
		 System.out.println("Search based on content comparison: " + exists);
		 System.out.println("\nEnter student details to remove:");
		 System.out.print("Name: ");
		 String removeName = sc.nextLine();
		 System.out.print("Age: ");
		 int removeAge = sc.nextInt();
		 System.out.print("Mark: ");
		 double removeMark = sc.nextDouble();
		 sc.nextLine();
		 Student removeStudent = new Student(removeName, removeAge, removeMark);
		 if (studentList.remove(removeStudent)) {
		 System.out.println("Student removed successfully.");
		 } else {
		 System.out.println("Student not found.");
		 }
		 System.out.println("\nNumber of students in the list: " +
		studentList.size());
		 System.out.println("\nUpdated list of students:");
		 displayStudents(studentList);
		 sc.close();
		 }
		 private static void displayStudents(LinkedList<Student> studentList) {
		 for (Student student : studentList) {
		 System.out.println(student);
		 }
		 }
}


/*4. Create a Student class with member variables name, age, and mark, along with the
necessary getter and setter methods. Implement a LinkedList of Student objects and
perform the following operations:
(a) Display the list of students.
(b) Prompt the user to enter a Student object and check its existence in the list. Specify
whether the search is based on reference comparison or content comparison using the
contains method.
(c) Remove a specified Student object from the list.
(d) Count the number of Student objects present in the list.
(e) Override the equals method to compare two Student objects based on their values
rather than references.*/