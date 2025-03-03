package Mar03;
import java.util.LinkedList;
import java.util.*;

class HospitalWaitingList {
    private LinkedList<String> patientList;

    public HospitalWaitingList() {
        patientList = new LinkedList<>();
    }

    // Add patient to the waiting list
    public void addPatient(String name) {
        patientList.addLast(name);
        System.out.println(name + " has been added to the waiting list.");
    }

    // Remove patient after seeing the doctor
    public void removePatient() {
        if (!patientList.isEmpty()) {
            String removedPatient = patientList.removeFirst();
            System.out.println(removedPatient + " has been removed from the waiting list.");
        } else {
            System.out.println("No patients in the waiting list.");
        }
    }

    // Check if a patient is in the waiting list
    public void checkPatient(String name) {
        if (patientList.contains(name)) {
            System.out.println(name + " is in the waiting list.");
        } else {
            System.out.println(name + " is not in the waiting list.");
        }
    }

    // Display all patients in order of arrival
    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("The waiting list is empty.");
        } else {
            System.out.println("Patients in the waiting list:");
            for (String patient : patientList) {
                System.out.println(patient);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalWaitingList waitingList = new HospitalWaitingList();
        int choice;

        do {
            System.out.println("\nHospital Waiting List System");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Check Patient");
            System.out.println("4. Display All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    waitingList.addPatient(name);
                    break;
                case 2:
                    waitingList.removePatient();
                    break;
                case 3:
                    System.out.print("Enter patient name to check: ");
                    String checkName = scanner.nextLine();
                    waitingList.checkPatient(checkName);
                    break;
                case 4:
                    waitingList.displayPatients();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}