
public class Ass5Q2 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        
        String modifiedStr = str.concat(" World");
        System.out.println("After concatenation: " + modifiedStr);
        System.out.println("Original String after modification attempt: " + str);
        System.out.println("Is original and modified string the same object? " + (str == modifiedStr));
        
        CharSequence charSeq = "CharSequence Example";
        System.out.println("CharSequence: " + charSeq);
        System.out.println("Character at index 5: " + charSeq.charAt(5));
        System.out.println("Subsequence (0, 11): " + charSeq.subSequence(0, 11));
        System.out.println("Length of CharSequence: " + charSeq.length());
    }
}
