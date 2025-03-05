import java.util.*; 
class Car implements Comparable<Car> {
 private int modelNo; private String name; private int stock;
 public Car(int modelNo, String name, int stock) {
 this.modelNo = modelNo; this.name = name; this.stock = stock;
 }
 public int getModelNo() {
 return modelNo;
 }
 public String getName() {
 return name;
 }
 public int getStock() {
 return stock;
 }
 public int compareTo(Car c) {
 return Integer.compare(this.stock, c.stock);
 }
 public String toString() {
 return modelNo + " " + name + " " + stock;
 }
}
public class Ass2P2_Q3 {

	public static void main(String[] args) {
		 ArrayList<Car> cars = new ArrayList<>();
		 cars.add(new Car(2024, "Creta", 25));
		 cars.add(new Car(2020, "Scorpio", 16));
		 cars.add(new Car(2023, "Innova", 8));
		 cars.add(new Car(2021, "Baleno", 72));
		 cars.add(new Car(2022, "Nexon", 48));
		 Collections.sort(cars);
		 System.out.println("Sorted list of Car objects based on stock:");
		 for (Car car : cars) {
		 System.out.println(car);
		 }
		 }
}


/*3. Write a Java program that includes a Car class and a CarApp class. The Car class
should have private fields: modelNo (int), name (String), and stock (int). Define a
parameterized constructor and override the compareTo method as public int
compareTo(Car car) to enable sorting of cars based on the total stock available.
In the CarApp class, create an ArrayList of Car objects, sort them, and print the updated
sorted list.*/