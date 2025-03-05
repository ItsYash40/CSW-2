import java.util.HashSet;
public class Ass2P2_Q9 {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3, 4, 5, 3, 2, 6, 7, 1};
 HashSet<Integer> seen = new HashSet<>();
 HashSet<Integer> repeating = new HashSet<>();
 for (int num : arr) {
 if (seen.contains(num)) {
 repeating.add(num);
 } else {
 seen.add(num);
 }
 }
 System.out.println("Repeating integers in the array: " + repeating);
 }
}

/*9. Given an array of integers, write a Java program to identify and print the repeating
integers using a HashSet.*/
