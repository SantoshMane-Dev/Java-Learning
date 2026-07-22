package arraysAndOopsPractice.Enheritance;

public class Vehicle {

    String brand;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    int speed;

    void start() {
        System.out.println("Car Is Starting.........");
    }
    
}
