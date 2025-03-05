import java.util.PriorityQueue;
public class Ass2P2_Q11 {
 public static void main(String[] args) {
 int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};
 PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 for (int num : arr) {
 minHeap.add(num);
 }
 System.out.println("Elements after dequeuing from Priority Queue:");
 while (!minHeap.isEmpty()) {
 System.out.println(minHeap.poll());
 }
 }
}

/*11. Declare an array of integers: int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9};. Then, create a
min-heap using the PriorityQueue class to store the elements from the array. Finally,
dequeue the elements from the PriorityQueue using the appropriate methods and print
them.*/