package Mar03;
import java.util.ArrayList;
import java.util.*;

class Library {
    private ArrayList<String> bookCollection;

    public Library() {
        bookCollection = new ArrayList<>();
    }

    // Add a book to the collection
    public void addBook(String title) {
        bookCollection.add(title);
        System.out.println("\"" + title + "\" has been added to the collection.");
    }

    // Remove a book by title
    public void removeBook(String title) {
        if (bookCollection.remove(title)) {
            System.out.println("\"" + title + "\" has been removed from the collection.");
        } else {
            System.out.println("Book not found in the collection.");
        }
    }

    // Search for a book by title
    public void searchBook(String title) {
        if (bookCollection.contains(title)) {
            System.out.println("\"" + title + "\" is available in the collection.");
        } else {
            System.out.println("\"" + title + "\" is not in the collection.");
        }
    }

    // Display all books in the collection
    public void displayBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("The book collection is empty.");
        } else {
            System.out.println("Books available in the collection:");
            for (String book : bookCollection) {
                System.out.println("- " + book);
            }
        }
    }

    // Show total number of books
    public void showTotalBooks() {
        System.out.println("Total books in collection: " + bookCollection.size());
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Show Total Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    library.addBook(title);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = scanner.nextLine();
                    library.removeBook(removeTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    library.showTotalBooks();
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