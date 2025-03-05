import java.util.*;
 class Pair<K, V> {
 private K key; private V value;
 public Pair(K key, V value) {
 this.key = key;
 this.value = value;
 }
 public K getKey() { return key;}
 public void setKey(K key) { this.key = key;}
 public V getValue() {  return value; }
 public void setValue(V value) { this.value = value;}
}
public class Ass2P2_Q1 {
	public static void main(String[] args) {
		 List<Pair<String, Integer>> pairs = new ArrayList<>();
		 pairs.add(new Pair<>("ABC", 1));
		 pairs.add(new Pair<>("DEF", 2));
		 pairs.add(new Pair<>("PQR", 3));
		 for (Pair<String, Integer> pair : pairs) {
		 System.out.println("Key: " + pair.getKey() + ", Value: " +
		pair.getValue());
		 }
	}
}

 /*1. Create a generic class Pair<K, V> with private member variables key and value. The
class should include a parameterized constructor and provide getter and setter methods
for these attributes. In the main class, create and add objects of the Pair class, then
retrieve and print the key-value pairs.*/