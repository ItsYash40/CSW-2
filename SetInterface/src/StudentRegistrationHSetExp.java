import java.util.*;


public class StudentRegistrationHSetExp {

    static HashSet<String> registeredStudents = new HashSet<>();
        static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        
        // Menu-driven loop
        do {
            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. Register Student");
            System.out.println("2. Check Registration");
            System.out.println("3. Display All Registrations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    checkRegistration();
                    break;
                case 3:
                    displayAllRegistrations();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
    
    public static void registerStudent() {
        System.out.print("Enter Student ID to register: ");
        String studentID = scanner.next();
        
        if (registeredStudents.contains(studentID)) {
            System.out.println("Error: Student ID " + studentID + " is already registered.");
        } else {
            registeredStudents.add(studentID);
            System.out.println("Student ID " + studentID + " has been successfully registered.");
        }
    }
    
    public static void checkRegistration() {
        System.out.print("Enter Student ID to check registration: ");
        String studentID = scanner.next();
        
        if (registeredStudents.contains(studentID)) {
            System.out.println("Student ID " + studentID + " is already registered.");
        } else {
            System.out.println("Student ID " + studentID + " is not registered.");
        }
    }
    
    public static void displayAllRegistrations() {
        if (registeredStudents.isEmpty()) {
            System.out.println("No students have been registered yet.");
        } else {
            System.out.println("\nList of all registered students:");
            for (String studentID : registeredStudents) {
                System.out.println(studentID);
            }
        }
    }
}





/*A university wants to maintain a record of Student registration a particular course. 
However duplictes registration should be avoided, meaning a student can register for a course only for one time.
Write a Javaprogram using HashSet to:
	Note: Use a switch case to give the choice such as 1. Registered student, 2. Check Registration, 3. Display All registration and 4. Exit.(Use scanner class)
	
	1. Allow Students to register for course by entering their Student ID and Duplicate Student already registred.
	2. Allow checking wheathrt a student is already registred.
	3. Display the list of all registred Student.*/