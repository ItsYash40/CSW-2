import java.util.*;
 //Ass2P2_Q7 
public class Address {
	 private String plotNo;
	 private String at;
	 private String post;
	 public Address(String plotNo, String at, String post) {
	 this.plotNo = plotNo;
	 this.at = at;
	 this.post = post;
	 }
	 public String getPlotNo() {
	 return plotNo;
	 }
	 public String getAt() {
	 return at;
	 }
	 public String getPost() {
	 return post;
	 }
	 public String toString() {
	 return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
	 }
	 public static void main(String[] args) {
	 TreeMap<String, Address> addressBook = new TreeMap<>();
	 addressBook.put("Diya", new Address("123", "Main St", "CityA"));
	 addressBook.put("Yash", new Address("456", "High St", "CityB"));
	 addressBook.put("Sneha", new Address("789", "Park Ave", "CityC"));
	 addressBook.put("Arka", new Address("101", "Elm St", "CityD"));
	 Iterator<Map.Entry<String, Address>> iterator =
	addressBook.entrySet().iterator();
	 while (iterator.hasNext()) {
	 Map.Entry<String, Address> entry = iterator.next();
	 System.out.println("Name: " + entry.getKey() + ", Address: " +
	entry.getValue());
	 }
	 }
	}



/*7. Write a Java program that includes a class Address with member variables plotNo, at,
and post. The class should define a parameterized constructor to initialize these attributes.
Create a TreeMap, where the key is the name of a person (String), and the value is an
Address object. Insert the required key-value pairs into the TreeMap and use an Iterator
to display the entries. */