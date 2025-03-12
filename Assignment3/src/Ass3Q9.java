import java.util.Scanner;
import java.util.InputMismatchException;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class Ass3Q9 {
    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        return number;
    }

    public static void main(String[] args) {
        try {
            int age = readInteger();
            validateAge(age);
        } catch (CustomCheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
