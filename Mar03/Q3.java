package Mar03;
import java.util.Scanner;
import java.util.Vector;

class TaskManager {
    private Vector<String> taskList;

    public TaskManager() {
        taskList = new Vector<>();
    }

    // Add a task
    public void addTask(String task) {
        taskList.add(task);
        System.out.println("Task added: " + task);
    }

    // Remove a task by index
    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            System.out.println("Removed Task: " + taskList.remove(index));
        } else {
            System.out.println("Invalid index! No task removed.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(i + ". " + taskList.get(i));
            }
        }
    }

    // Find index of a particular task
    public void findTaskIndex(String task) {
        int index = taskList.indexOf(task);
        if (index != -1) {
            System.out.println("Task found at index: " + index);
        } else {
            System.out.println("Task not found.");
        }
    }

    // Clear all tasks
    public void clearTasks() {
        taskList.clear();
        System.out.println("All tasks have been cleared.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice;

        do {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task by Index");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Find Task Index");
            System.out.println("5. Clear All Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int index = scanner.nextInt();
                    manager.removeTask(index);
                    break;
                case 3:
                    manager.displayTasks();
                    break;
                case 4:
                    System.out.print("Enter task to find index: ");
                    String findTask = scanner.nextLine();
                    manager.findTaskIndex(findTask);
                    break;
                case 5:
                    manager.clearTasks();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}