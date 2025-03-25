import java.util.Scanner;

public class Ass5Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial string: ");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        
        while (true) {
            System.out.println("\nStringBuilder Text Manipulation");
            System.out.println("1. Add Substring");
            System.out.println("2. Remove Range of Characters");
            System.out.println("3. Modify Character at Index");
            System.out.println("4. Concatenate String at End");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter substring to insert: ");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    break;
                case 2: 
                	System.out.print("Enter start index to remove from: ");
                    int startRemove = scanner.nextInt();
                    System.out.print("Enter end index to remove until: ");
                    int endRemove = scanner.nextInt();
                    scanner.nextLine();
                    text.delete(startRemove, endRemove);
                    break;
                case 3:
                    System.out.print("Enter index to modify: ");
                    int modifyIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new character: ");
                    char newChar = scanner.nextLine().charAt(0);
                    text.setCharAt(modifyIndex, newChar);
                    break;
                case 4:
                    System.out.print("Enter string to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
            System.out.println("Current Text: " + text);
        }
    }
}