import java.util.LinkedHashSet;
import java.util.Scanner;

public class MuseumVisitorLog {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store visitor IDs
        LinkedHashSet<String> visitorLog = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nMuseum Visitor Log Menu:");
            System.out.println("1. Add Visitor ID");
            System.out.println("2. Check if Visitor ID exists");
            System.out.println("3. Display Visitor Log");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add Visitor ID
                    System.out.print("Enter Visitor ID: ");
                    String visitorId = scanner.nextLine();
                    if (visitorLog.add(visitorId)) {
                        System.out.println("Visitor ID added successfully.");
                    } else {
                        System.out.println("Visitor ID already exists.");
                    }
                    break;

                case 2:
                    // Check if Visitor ID exists
                    System.out.print("Enter Visitor ID to check: ");
                    String checkId = scanner.nextLine();
                    if (visitorLog.contains(checkId)) {
                        System.out.println("Visitor ID exists in the log.");
                    } else {
                        System.out.println("Visitor ID does not exist in the log.");
                    }
                    break;

                case 3:
                    // Display Visitor Log
                    System.out.println("\nVisitor Log (Order of Arrival):");
                    for (String id : visitorLog) {
                        System.out.println(id);
                    }
                    break;

                case 4:
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