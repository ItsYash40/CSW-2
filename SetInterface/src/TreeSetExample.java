import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Declaring a TreeSet
		 TreeSet<String> Tset = new TreeSet<String>();
		 // Adding different elements including null ones
		 Tset.add("Apricot");
		 Tset.add("Mango");
		 Tset.add("Orange");
		 Tset.add("Strawberry");
		 Tset.add("Dates");
		  //Adding Duplicates element
		 Tset.add("Orange");
		 Tset.add("Mango");
		  	  
		// Displaying the stored HashSet elements
		  System.out.println("TreeSet: "+Tset);
		  //Removing non duplicate elements
		  Tset.remove("Dates");	  
		// Displaying the stored HashSet elements
		  System.out.println("TreeSet: "+Tset);
		  
		//Declaring a Integer hashSet
		  TreeSet<Integer> Tset1= new TreeSet<>();
		  Tset1.add(55);
		  Tset1.add(78);
		  Tset1.add(97);
		  Tset1.add(13);
		  Tset1.add(64);
		  //Adding Duplicates Elements
		  Tset1.add(78);
		  Tset1.add(55);
		// Displaying the stored HashSet elements
		  System.out.println("TreeSet: "+Tset1);
		  //Removing Duplicate Elements
		  Tset1.remove(55);

		// Displaying the stored HashSet elements
		  System.out.println("TreeSet: "+Tset1);

		  

  // No null value because of nullPointerException value  will be thrown

	}

}
