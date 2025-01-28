package OOPs;

class Vehicle {
    private String vehicleID;
    private double capacity;
    private String route;

    public Vehicle(String vehicleID, double capacity, String route) {
        this.vehicleID = vehicleID;
        this.capacity = capacity;
        this.route = route;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Route: " + route);
    }

    public double calculateTransportTime(double speed, double distance) {
        return distance / speed;
    }
}

class Truck extends Vehicle {
    private int numberOfAxles;
    private boolean isRefrigerated;

    public Truck(String vehicleID, double capacity, String route, int numberOfAxles, boolean isRefrigerated) {
        super(vehicleID, capacity, route);
        this.numberOfAxles = numberOfAxles;
        this.isRefrigerated = isRefrigerated;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Axles: " + numberOfAxles);
        System.out.println("Refrigerated: " + (isRefrigerated ? "Yes" : "No"));
    }
}

class Minitruck extends Truck {
    private double payloadCapacity;
    private double fuelEfficiency;

    public Minitruck(String vehicleID, double capacity, String route, int numberOfAxles, boolean isRefrigerated,
            double payloadCapacity, double fuelEfficiency) {
        super(vehicleID, capacity, route, numberOfAxles, isRefrigerated);
        this.payloadCapacity = payloadCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}

class Ship extends Vehicle {
    private double deckSize;
    private double sailingRange;

    public Ship(String vehicleID, double capacity, String route, double deckSize, double sailingRange) {
        super(vehicleID, capacity, route);
        this.deckSize = deckSize;
        this.sailingRange = sailingRange;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deck Size: " + deckSize + " square meters");
        System.out.println("Sailing Range: " + sailingRange + " km");
    }
}

class Airplane extends Vehicle {
    private double maxAltitude;
    private String engineType;

    public Airplane(String vehicleID, double capacity, String route, double maxAltitude, String engineType) {
        super(vehicleID, capacity, route);
        this.maxAltitude = maxAltitude;
        this.engineType = engineType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Maximum Altitude: " + maxAltitude + " meters");
        System.out.println("Engine Type: " + engineType);
    }
}

public class LogisticsManagement {
    public static void main(String[] args) {
        Truck truck = new Truck("T123", 10, "Route A", 6, true);
        Minitruck minitruck = new Minitruck("MT456", 5, "Route B", 4, false, 3, 15);
        Ship ship = new Ship("S789", 500, "Route C", 3000, 10000);
        Airplane airplane = new Airplane("A321", 20, "Route D", 10000, "Jet");

        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println("Transport Time: " + truck.calculateTransportTime(60, 300) + " hours\n");

        System.out.println("Minitruck Details:");
        minitruck.displayDetails();
        System.out.println("Transport Time: " + minitruck.calculateTransportTime(50, 200) + " hours\n");

        System.out.println("Ship Details:");
        ship.displayDetails();
        System.out.println("Transport Time: " + ship.calculateTransportTime(40, 1000) + " hours\n");

        System.out.println("Airplane Details:");
        airplane.displayDetails();
        System.out.println("Transport Time: " + airplane.calculateTransportTime(800, 1600) + " hours");
    }
}
