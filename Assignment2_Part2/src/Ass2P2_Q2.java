import java.util.*; 
class User {
 private String name;
 private int age;
 public User(String name, int age) {
 this.name = name;
 this.age = age;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public int getAge() {
 return age;
 }
 public void setAge(int age) {
 this.age = age;
 }
 public String toString() {
 return "Name: " + name + ", Age: " + age;
 }
}
public class Ass2P2_Q2 {
	public static void main(String[] args) {
		 ArrayList<User> users = new ArrayList<>();
		 users.add(new User("Yash", 30));
		 users.add(new User("Diya", 25));
		 users.add(new User("Arka", 35));
		 users.add(new User("Sneha", 28));
		 users.add(new User("Krish", 22));
		 System.out.println("Original List of Users:");
		 for (User user : users) {
		 System.out.println(user);
		 }
		 Collections.sort(users, Comparator.comparingInt(User::getAge));
		 System.out.println("\nSorted List of Users by Age:");
		 for (User user : users) {
		 System.out.println(user);
		 }
		 }

}

/*2. Write a Java program that includes a User class and an ArrayListUser class. The User
class should have private fields for name and age, along with a parameterized constructor
and getter/setter methods for these attributes. The ArrayListUser class should create an
ArrayList of User objects. After adding user objects, it should retrieve and print their name
and age. Additionally, the program should sort the users based on age and print the
updated list of users using getter methods.
*/
