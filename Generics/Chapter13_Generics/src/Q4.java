public class Q4 {

    private String message;

    public Q4(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Q4 obj = new Q4("Hello, Java!");
        
        obj.showMessage();  // Output: Message: Hello, Java!
    }
}

