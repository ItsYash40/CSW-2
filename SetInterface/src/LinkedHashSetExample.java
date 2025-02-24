 import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <String> lihaset= new LinkedHashSet<>	();
		 // Adding different elements including null ones
		lihaset.add("Apricot");
		lihaset.add("Mango");
		lihaset.add("Orange");
		lihaset.add("Strawberry");
		lihaset.add("Dates");
		  //Adding Duplicates element
		lihaset.add("Orange");
		lihaset.add("Mango");
		  //Multiple null elements
		lihaset.add(null);
		lihaset.add(null);	  
		// Displaying the stored HashSet elements
		  System.out.println("LinkedHashSet: "+lihaset);
		  //Removing non duplicate elements
		  lihaset.remove("Dates");	  
		// Displaying the stored HashSet elements
		  System.out.println("LinkedHashSet: "+lihaset);
		  
		  
		  
		//Declaring a Integer hashSet
		  LinkedHashSet<Integer> lihaset1= new LinkedHashSet<>();
		  lihaset1.add(55);
		  lihaset1.add(78);
		  lihaset1.add(97);
		  lihaset1.add(13);
		  lihaset1.add(64);
		  //Adding Duplicates Elements
		  lihaset1.add(78);
		  lihaset1.add(55);
		//Multiple null elements
		  lihaset1.add(null);
		  lihaset1.add(null);	
		// Displaying the stored HashSet elements
		  System.out.println("LinkedHashSet: "+lihaset1);
		  //Removing Duplicate Elements
		  lihaset1.remove(55);

		// Displaying the stored HashSet elements
		  System.out.println("LinkedHashSet: "+lihaset1);
		  
	
	}

}
