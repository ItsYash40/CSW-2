 import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declaring a HashSet
		 HashSet<String> haset = new HashSet<String>();
		 // Adding different elements including null ones
		  haset.add("Apricot");
		  haset.add("Mango");
		  haset.add("Orange");
		  haset.add("Strawberry");
		  haset.add("Dates");
		  //Adding Duplicates element
		  haset.add("Orange");
		  haset.add("Mango");
		  //Multiple null elements
		  haset.add(null);
		  haset.add(null);	  
		// Displaying the stored HashSet elements
		  System.out.println("HashSet: "+haset);
		  //Removing non duplicate elements
		  haset.remove("Dates");	  
		// Displaying the stored HashSet elements
		  System.out.println("HashSet: "+haset);
		  
		//Declaring a Integer hashSet
		  HashSet<Integer> hashset1= new HashSet<>();
		  hashset1.add(55);
		  hashset1.add(78);
		  hashset1.add(97);
		  hashset1.add(13);
		  hashset1.add(64);
		  //Adding Duplicates Elements
		  hashset1.add(78);
		  hashset1.add(55);
		//Multiple null elements
		  hashset1.add(null);
		  hashset1.add(null);	
		// Displaying the stored HashSet elements
		  System.out.println("HashSet: "+hashset1);
		  //Removing Duplicate Elements
		  hashset1.remove(55);

		// Displaying the stored HashSet elements
		  System.out.println("HashSet: "+hashset1);

		  


		

	}

}
