// Car.java
class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;  }
    public String getMake() {   return make;   }
    public String getModel() {   return model;  }
    public void setMake(String make) {   this.make = make;   }
    public void setModel(String model) {   this.model = model; } 
    public void displayCarDetails() {
        System.out.println("Make: " + make + ", Model: " + model);   }
}
public class CarTester_Q1 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Camry");
        Car myCar2 = new Car(null, null);
        System.out.println("Initial details of myCar1:");
        myCar1.displayCarDetails();
        System.out.println("\nInitial details of myCar2:");
        myCar2.displayCarDetails();
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");
        System.out.println("\nUpdated details of myCar2:");
        myCar2.displayCarDetails();
    }
}
