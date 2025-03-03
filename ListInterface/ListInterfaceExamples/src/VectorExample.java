import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vc= new Vector<>(3,2);
		vc.addElement(1);
		vc.addElement(2);
		vc.addElement(3);
		vc.addElement(4);
		
		System.out.println("Initial vector : "+ vc);
		
		vc.add(3,99);
		System.out.println("After adding elemts in index 3 " + vc);

		
		System.out.println("Elemnt at index 3 : "+ vc.get(3));
		
		System.out.println("Element remove at indx 2 "+vc.remove(2));
		
		System.out.println("Index of Element 4 "+ vc.indexOf(4));
		
		System.out.println("Size of vector : "+ vc.size());
		
		System.out.println("Is vector empty : "+ vc.isEmpty());
		
		vc.clear();
		System.out.println("Now Size of vector : "+ vc.size());
		System.out.println("Is vector empty : "+ vc.isEmpty());







		


	}

}
