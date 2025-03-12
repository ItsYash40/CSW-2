import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

class CustomFileNotFoundException extends FileNotFoundException {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends IOException {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Ass3Q11 {
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

    public static void processFile(String filePath) {
        File file = new File(filePath);
        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("Processing file contents:");
            int sum = 0;
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextInt()) {
                    sum += fileScanner.nextInt();
                } else {
                    fileScanner.next(); 
                }
            }
            System.out.println("Sum of integers in file: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            int age = readInteger();
            validateAge(age);
            
            if (args.length > 0) {
                processFile(args[0]);
            } else {
                System.out.println("No file path provided.");
            }
        } catch (CustomCheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}