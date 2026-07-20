package in.oops.abstraction.vehicle;

public class TestVehicle {
    public static void main(String[] args) {
        Car c1 = new Car(4);

        c1.commute();
        c1.makeStartSound();
        c1.getsetgo();
    }
}
