package OOPs;

class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Laptop extends Device {
    private String processorType;
    private int ramSize;

    public Laptop(String brand, String model, String processorType, int ramSize) {
        super(brand, model);
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Processor Type: " + processorType);
        System.out.println("RAM Size: " + ramSize + " GB");
    }
}

class Smartphone extends Device {
    private int cameraResolution;
    private int batteryCapacity;

    public Smartphone(String brand, String model, int cameraResolution, int batteryCapacity) {
        super(brand, model);
        this.cameraResolution = cameraResolution;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }
}

public class TechnologyCompanyQ7 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "XPS 13", "Intel Core i7", 16);
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S22", 108, 5000);

        System.out.println("Laptop Details:");
        laptop.displayDetails();
        System.out.println();

        System.out.println("Smartphone Details:");
        smartphone.displayDetails();
    }
}
