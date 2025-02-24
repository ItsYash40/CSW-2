import java.util.TreeSet;
import java.util.Scanner;

public class SchoolRollNumberSystem {
    public static void main(String[] args) {
        // Create a TreeSet to store student roll numbers
        TreeSet<Integer> rollNumbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nSchool Roll Number System Menu:");
            System.out.println("1. Register Student Roll Number");
            System.out.println("2. Check Roll Number");
            System.out.println("3. Display All Roll Numbers");
            System.out.println("4. Find Next Roll Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Register Student Roll Number
                    System.out.print("Enter Roll Number to register: ");
                    int rollNumber = scanner.nextInt();
                    if (rollNumbers.add(rollNumber)) {
                        System.out.println("Roll Number registered successfully.");
                    } else {
                        System.out.println("Roll Number already exists.");
                    }
                    break;

                case 2:
                    // Check Roll Number
                    System.out.print("Enter Roll Number to check: ");
                    int checkRollNumber = scanner.nextInt();
                    if (rollNumbers.contains(checkRollNumber)) {
                        System.out.println("Roll Number is registered.");
                    } else {
                        System.out.println("Roll Number is not registered.");
                    }
                    break;

                case 3:
                    // Display All Roll Numbers
                    System.out.println("\nAll Registered Roll Numbers (Ascending Order):");
                    for (int number : rollNumbers) {
                        System.out.println(number);
                    }
                    break;

                case 4:
                    // Find Next Roll Number
                    System.out.print("Enter Roll Number to find the next higher roll number: ");
                    int givenRollNumber = scanner.nextInt();
                    Integer nextRollNumber = rollNumbers.higher(givenRollNumber);
                    if (nextRollNumber != null) {
                        System.out.println("Next higher Roll Number is: " + nextRollNumber);
                    } else {
                        System.out.println("No higher Roll Number exists.");
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


/*TreeSet
A school wants to maintain a sorted list of student roll numbers for
administrative purposes. The system should:
• Store student roll numbers in a sorted order.
• Ensure no duplicate roll numbers are added.
• Allow checking if a roll number is already registered.
• Display all roll numbers in ascending order.
• Find the next higher roll number after a given roll number.
Use switch case with following choice
1. Register Student Roll Number
2. Check Roll Number
3. Display All Roll Numbers
4. Find Next Roll Number
5. Exit
Note: Use Scanner Class*/