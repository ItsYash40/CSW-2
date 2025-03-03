package Mar03;

class Book {
 private int bookId;
 private String bookName;
 private double price;

 
 public Book(int bookId, String bookName, double price) {
     this.bookId = bookId;
     this.bookName = bookName;
     this.price = price;
 }

 
 public int getBookId() {
     return bookId;
 }

 public String getBookName() {
     return bookName;
 }

 public double getPrice() {
     return price;
 }

 
 @Override
 public String toString() {
     return "Book ID: " + bookId + ", Name: " + bookName + ", Price: Rs." + price;
 }

 // Override equals() method (Books are considered equal if they have the same bookId)
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true; // Same reference
     if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
     Book book = (Book) obj;
     return this.bookId == book.bookId; // Compare based on bookId
 }
}

//Driver class
public class Q5 {
 public static void main(String[] args) {
     // Creating Book objects
     Book book1 = new Book(11, "Java Programming", 499);
     Book book2 = new Book(12, "Data Structures", 599);

     // Printing book details
     System.out.println("Book 1 Details: " + book1);
     System.out.println("Book 2 Details: " + book2);

     // Comparing books based on price
     if (book1.getPrice() > book2.getPrice()) {
         System.out.println("\n" + book1.getBookName() + " is more expensive.");
     } else if (book1.getPrice() < book2.getPrice()) {
         System.out.println("\n" + book2.getBookName() + " is more expensive.");
     } else {
         System.out.println("\nBoth books have the same price.");
     }

     // Comparing books based on bookId
     if (book1.equals(book2)) {
         System.out.println("\nBoth books are the same (same Book ID).");
     } else {
         System.out.println("\nThe books are different.");
     }
 }
}