package Mar03;

class Pair<K, V> {
 private K key;
 private V value;

 
 public Pair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 
 public K getKey() {
     return key;
 }

 public V getValue() {
     return value;
 }

 // Setter methods
 public void setKey(K key) {
     this.key = key;
 }

 public void setValue(V value) {
     this.value = value;
 }

 // Display method
 public void displayPair() {
     System.out.println("Key: " + key + ", Value: " + value);
 }
}

//Driver class
public class Q6 {
 public static void main(String[] args) {
     // Creating Pair objects with different data types
     Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
     Pair<String, Double> pair2 = new Pair<>("Price", 45.50);
     Pair<Character, Boolean> pair3 = new Pair<>('A', true);

     // Displaying key-value pairs
     System.out.println("Pair 1:");
     pair1.displayPair();

     System.out.println("\nPair 2:");
     pair2.displayPair();

     System.out.println("\nPair 3:");
     pair3.displayPair();
 }
}