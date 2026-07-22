package arraysAndOopsPractice.Enheritance;

public class Car extends Vehicle {
    String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void drive(){
        System.out.println("Car is Running............");
    }
}
