import java.util.*;
public class LinkedListEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList<>();
		
		ll.add("a");
		ll.add("b");
		ll.addLast("c");
		ll.addFirst("d");
		ll.add("e");
		System.out.println("Initial LinkedList: "+ ll);
		
		System.out.println("First Element in LinkedList: "+ ll.getFirst());
		System.out.println("Last Element in  LinkedList: "+ ll.getLast());
		System.out.println("Elemrnt in  LinkedList t indx 2 "+ ll.get(2));
		
		ll.remove("b");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After removing the list is "+ ll);
		System.out.println("Index of element e "+ ll.indexOf("e"));
		
		System.out.println("Size of  LinkedList  "+ ll.size());
		System.out.println("Is LinkedList empty "+ ll.isEmpty());
		
		ll.clear();
		System.out.println("After clear LinkedList "+ ll);
		System.out.println("Is LinkedList empty "+ ll.isEmpty());

	}

}
