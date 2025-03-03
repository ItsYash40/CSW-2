import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList<>(5);
		for(int i=0; i<=5; i++) {
			al.add(i);
		}
		System.out.println("Initial Arrraylist: "+ al);
		
		al.add(3,99); // insert element in specific position
		System.out.println("After adding Arrraylist in index 3 : "+ al);
		
		System.out.println("Element at index 3 : "+ al.get(3));
		
		al.remove(2);
		System.out.println("After removing elemts in  Arrraylist in index 3 : "+ al);
		
		System.out.println("Index of element 4 : "+ al.indexOf(4));
		
		System.out.println("Size of Arrraylist: "+ al.size());
		
		System.out.println("Is Arrraylist empty : "+ al.isEmpty());
		
		al.clear();
		System.out.println("After clear the Arraylist : "+ al);
		
		System.out.println("Is  Arrraylist empty after clear : "+ al.isEmpty());
		

	}

}
