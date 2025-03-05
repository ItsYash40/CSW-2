
public class Ass2P1_Q3 {

	public static void main(String[] args) { 
        Car car1 = new Car("Fortuner", "White", 220.5); 
        Car car2 = new Car("Scorpio", "Black", 210.3); 
        Car fasterCar = car1.compareTo(car2) > 0 ? car1 : car2; 
        System.out.println("The car with the greater speed is: \n" + 
fasterCar.toString()); 
    } 
}

 class Car implements Comparable<Car> { 
    private String model; 
    private String color; 
    private double speed; 
    public Car(String model, String color, double speed) { 
        this.model = model; 
        this.color = color; 
        this.speed = speed; 
    } 
    public String getModel() { 
        return model; 
    } 
    public String getColor() { 
        return color; 
    } 
    public double getSpeed() { 
        return speed; 
    } 
    public String toString() { 
        return "Car Model: " + model + ", Color: " + color + ", Speed: " + speed 
+ " km/h"; 
    } 
    public int compareTo(Car c) { 
        return Double.compare(this.speed, c.speed); 
    } 
    
} 





/*3. Write a program to create a Car class with the following member variables: model, color, 
and speed. Implement the appropriate constructor and methods for this class.  
Additionally, create a driver class to:  
i. Instantiate two Car objects.  
ii. Compare the cars based on their speed.  
iii. Print the details of the car with the greater speed.  
Note: Implement the Comparable interface and override the compareTo() method.  */
