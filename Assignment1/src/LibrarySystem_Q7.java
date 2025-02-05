abstract class LibraryResource {
    private String title;
    private String author;
    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public abstract void displayDetails();
}
class Book extends LibraryResource {
    private int pageCount;
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void displayDetails() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pageCount);
    }
}
// Magazine.java
class Magazine extends LibraryResource {
    private String issueDate;
    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + ", Issue Date: " + issueDate);
    }
}
class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD: " + getTitle() + " by " + getAuthor() + ", Duration: " + duration + " mins");
    }
}

public class LibrarySystem_Q7 {
    public static void main(String[] args) {
        LibraryResource book = new Book("Java Programming", "James Gosling", 500);
        LibraryResource magazine = new Magazine("Tech Today", "John Doe", "February 2025");
        LibraryResource dvd = new DVD("AI Revolution", "Jane Smith", 120);

        System.out.println("Library Resources:");
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
