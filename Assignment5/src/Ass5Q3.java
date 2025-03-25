import java.util.Scanner;

public class Ass5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer();
        
        while (true) {
            System.out.println("\nSimple Text Editor using StringBuffer");
            System.out.println("1. Append Text");
            System.out.println("2. Insert Text");
            System.out.println("3. Delete Text");
            System.out.println("4. Reverse Text");
            System.out.println("5. Replace Text");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                case 2: 
                	System.out.print("Enter index to insert at: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    break;
                case 3: 
                    System.out.print("Enter start index to delete from: ");
                    int startDelete = scanner.nextInt();
                    System.out.print("Enter end index to delete until: ");
                    int endDelete = scanner.nextInt();
                    scanner.nextLine();
                    text.delete(startDelete, endDelete);
                    break;
                case 4: 
                    text.reverse();
                    break;
                case 5: 
                	System.out.print("Enter start index to replace from: ");
                    int startReplace = scanner.nextInt();
                    System.out.print("Enter end index to replace until: ");
                    int endReplace = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter replacement text: ");
                    String replaceText = scanner.nextLine();
                    text.replace(startReplace, endReplace, replaceText);
                    break;
                case 6: 
                    System.out.println("Exiting editor. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
            System.out.println("Current Text: " + text);
            System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
        }
    }
}
