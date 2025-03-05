import java.util.HashMap;
public class Ass2P2_Q10 {
 public static void main(String[] args) {
 int[] arr = {3, 7, 1, 2, 8, 4, 5};
 HashMap<Integer, Integer> map = new HashMap<>();
 for (int num : arr) {
 map.put(num, 1);
 }
 int missingNo = -1;
 for (int i = 1; i <= 10; i++) {
 if (!map.containsKey(i)) {
 missingNo = i;
 break;
 }
 }
 if (missingNo != -1) {
 System.out.println("The smallest positive number missing in thearray is: " + missingNo);
 } else {
 System.out.println("No positive number is missing in the range 1 to10.");
 }
 }
}


/*10. Given an unsorted array of integers ranging from 1 to 10, write a program to find the
smallest positive number missing in the array. Use a HashMap<Integer, Integer> to keep
track of the elements and identify the missing number.
*/