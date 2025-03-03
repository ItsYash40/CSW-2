package Mar03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// User class definition
class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// ArrayListUser class (Driver class)
public class Q7 {
    public static void main(String[] args) {
        // Creating an ArrayList of User objects
        ArrayList<User> userList = new ArrayList<>();

        // Adding users
        userList.add(new User("Anwesha", 21));
        userList.add(new User("Sreeja", 21));
        userList.add(new User("Mikesh", 20));
        userList.add(new User("Tae", 20));

        // Printing user details before sorting
        System.out.println("Users before sorting:");
        printUsers(userList);

        // Sorting users based on age
        Collections.sort(userList, Comparator.comparingInt(User::getAge));

        // Printing user details after sorting
        System.out.println("\nUsers after sorting by age:");
        printUsers(userList);
    }

    // Method to print users
    public static void printUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}