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

public class Ass3Q10 {
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

    public static void readFile(String filePath) throws CustomFileNotFoundException, FileReadPermissionException {
        if (filePath == null || filePath.isEmpty()) {
            throw new CustomFileNotFoundException("File path is null or empty.");
        }
        
        File file = new File(filePath);
        if (!file.exists()) {
            throw new CustomFileNotFoundException("File does not exist: " + filePath);
        }
        
        if (!file.canRead()) {
            throw new FileReadPermissionException("No read permission for file: " + filePath);
        }
        
        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("File contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new CustomFileNotFoundException("Error opening file: " + filePath);
        }
    }

    public static void main(String[] args) {
        try {
            int age = readInteger();
            validateAge(age);
            
            if (args.length > 0) {
                readFile(args[0]);
            } else {
                System.out.println("No file path provided.");
            }
        } catch (CustomCheckedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (CustomFileNotFoundException | FileReadPermissionException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
