interface Vehicle {
    void accelerate();
    void brake();
}
class Car1 implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }
}
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }
}

public class VehicleApp_Q9 {
    public static void main(String[] args) {
        Vehicle car = new Car1();
        Vehicle bicycle = new Bicycle();

        System.out.println("Testing Car:");
        car.accelerate();
        ((Car1) car).accelerate(60);
        ((Car1) car).accelerate(80, 5);
        car.brake();

        System.out.println("\nTesting Bicycle:");
        bicycle.accelerate();
        ((Bicycle) bicycle).accelerate(20);
        ((Bicycle) bicycle).accelerate(30, 3);
        bicycle.brake();
    }
}
