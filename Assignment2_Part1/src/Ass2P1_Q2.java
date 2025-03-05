
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

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true; 
     if (obj == null || getClass() != obj.getClass()) return false; 
     Book book = (Book) obj;
     return this.bookId == book.bookId; 
 }
}

public class Ass2P1_Q2 {
 public static void main(String[] args) {
     Book book1 = new Book(11, "Java Programming", 499);
     Book book2 = new Book(12, "Data Structures", 599);

     System.out.println("Book 1 Details: " + book1);
     System.out.println("Book 2 Details: " + book2);

     if (book1.getPrice() > book2.getPrice()) {
         System.out.println("\n" + book1.getBookName() + " is more expensive.");
     } else if (book1.getPrice() < book2.getPrice()) {
         System.out.println("\n" + book2.getBookName() + " is more expensive.");
     } else {
         System.out.println("\nBoth books have the same price.");
     }

     if (book1.equals(book2)) {
         System.out.println("\nBoth books are the same (same Book ID).");
     } else {
         System.out.println("\nThe books are different.");
     }
 }
}



/*2. Write a program to create a Book class with the following member variables: bookId, 
bookName, and price. Implement the appropriate constructor and methods for this class.  
Additionally, create a driver class to:  
i. Instantiate two Book objects.  
ii. Compare the books based on their price.  
iii. Print the details of both books. 
Note: Override the toString() and equals() methods.  */