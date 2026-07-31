package in.oops.abstraction.vehicle;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car(int noOfTyres) {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Starting...........");
    }
}
