package class1;
class Vehicle {
    private String make;
    private String model;

 
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public void displayVehicleInfo() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}


class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;


    public Car(String make, String model, int numberOfDoors, String fuelType) {
        super(make, model); 
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }


    public void displayCarInfo() {
        displayVehicleInfo();  
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class ElectricCar extends Car {
    private int batteryCapacity;  
    private int rangePerCharge;  


    public ElectricCar(String make, String model, int numberOfDoors, String fuelType, int batteryCapacity, int rangePerCharge) {
        super(make, model, numberOfDoors, fuelType); 
        this.batteryCapacity = batteryCapacity;
        this.rangePerCharge = rangePerCharge;
    }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRangePerCharge() {
        return rangePerCharge;
    }


    public void displayElectricCarInfo() {
        displayCarInfo();  
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range per Charge: " + rangePerCharge + " Km");
    }
}

public class q5 {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("Tata", "curv", 4, "Electric", 100, 250);


        electricCar.displayElectricCarInfo();
    }
}


