public class Ass5Q1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        
        System.out.println("Comparing string literals using ==: " + (str1 == str2)); // true
        System.out.println("Comparing new String objects using ==: " + (str3 == str4)); // false
        System.out.println("Comparing literal and new String using ==: " + (str1 == str3)); // false
        
        System.out.println("Comparing string literals using equals(): " + str1.equals(str2)); // true
        System.out.println("Comparing new String objects using equals(): " + str3.equals(str4)); // true
        System.out.println("Comparing literal and new String using equals(): " + str1.equals(str3)); // true
    }
}