import java.util.*;
class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}
public class Ass2P2_Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        books.put(1, new Book(1, "Geetanjali", "R N Tagore", 5));
        books.put(2, new Book(2, "Atomic Habits", "Jems Clear", 3));

        System.out.println("Collection of Books:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.print("\nEnter book name to check: ");
        String bookName = sc.nextLine();
        boolean bookExists = false;
        for (Book book : books.values()) {
            if (book.getName().equalsIgnoreCase(bookName)) {
                bookExists = true;
                break;
            }
        }
        System.out.println("Book exists: " + bookExists);

        System.out.print("\nEnter book ID to remove: ");
        int bookId = sc.nextInt();
        Book removedBook = books.remove(bookId);
        if (removedBook != null) {
            System.out.println("Removed book: " + removedBook);
        } else {
            System.out.println("Book ID not found.");
        }

        System.out.println("\nUpdated Collection of Books:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }

        sc.close();
    }
}

/*5. Create a Book class with member variables id, name, author, and quantity to store
details of each issued book. The Book class should include a parameterized constructor.
Design a Library class that creates a HashMap of books, where the key is an Integer
(representing the book ID) and the value is a Book object. Instantiate at least two Book
objects and display the collection of books stored in the HashMap.
Use appropriate methods of the HashMap class to perform the following operations:
(a) Check if a particular book name is present on the map.
(b) Remove a book entry by deleting the value associated with a specific key. */