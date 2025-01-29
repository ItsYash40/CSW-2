
class StringManipulator {

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public String reverse(String str, int start, int end) {
        if (start < 0 || end > str.length() || start >= end) {
            return "Invalid indices";
        }
        
        StringBuilder substring = new StringBuilder(str.substring(start, end));
        String reversedSubstring = substring.reverse().toString();
        
        return str.substring(0, start) + reversedSubstring + str.substring(end);
    }

    public String reverse(char[] charArray) {
        StringBuilder reversed = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }
        return reversed.toString();
    }
}

public class StringManipulation {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String str1 = "ABC";
        System.out.println("Reversed full string: " + manipulator.reverse(str1));

        String str2 = "HelloWorld";
        System.out.println("Reversed substring: " + manipulator.reverse(str2, 1, 5));  // Reverse "ello"

        char[] charArray = {'Y', 'A', 'S', 'H'};
        System.out.println("Reversed char array: " + manipulator.reverse(charArray));

        String str3 = "";
        System.out.println("Reversed empty string: " + manipulator.reverse(str3));

        String str4 = "HelloWorld";
        System.out.println("Invalid index reversal: " + manipulator.reverse(str4, 5, 3));  // Invalid range

        String str5 = "ComputerSienceWorkshop";
        System.out.println("Reversed valid substring: " + manipulator.reverse(str5, 7, 15)); // Reverse "Manipula"
    }
}















/*design a class string manipulator with overloaded reverse() method for 
different scenarios. Implement reverse (string str) to reverse a full string,
reverse(string str,int start,int end) to reverse only a subtracting within specified 
indices and reverse (char[]chararray) to reverse an array of characters write a
driver program program to paste these methods using various cases such as empty strings 
and partial reversals.*/



