
public class Q5 {
    private int number1;
    private int number2;

    public Q5(int num1, int num2) {
        this.number1 = num1;  
        this.number2 = num2;  
    }

    public void display() {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }

    public static void main(String[] args) {
        Q5 obj = new Q5(10, 20);

        obj.display();
    }
}
